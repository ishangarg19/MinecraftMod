import net.minecraft.item.ItemBow;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.entity.projectile.EntityArrow;

public class DemeraldBowClass extends ItemBow
{
    public DemeraldBowClass() {
        super();
        this.setUnlocalizedName("demeraldbow");
    }
    
    public void registerIcons(final IIconRegister icons) {
        this.itemIcon = icons.registerIcon("demeraldmodtools:demeraldbow");
    }
    
    public void onPlayerStoppedUsing(final ItemStack p_77615_1_, final World p_77615_2_, final EntityPlayer p_77615_3_, final int p_77615_4_) {
        int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;
        final ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled()) {
            return;
        }
        j = event.charge;
        final boolean flag = p_77615_3_.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, p_77615_1_) > 0;
        if (flag || p_77615_3_.inventory.hasItem(Items.arrow)) {
            float f = (float)j / 20.0f;
            f = (f * f + f * 2.0f) / 3.0f;
            if ((double)f < 0.1) {
                return;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            final EntityArrow entityarrow = new EntityArrow(p_77615_2_, p_77615_3_, f * 2.0f);
            entityarrow.setDamage(25.0);
            if (f == 1.0f) {
                entityarrow.setIsCritical(true);
            }
            final int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, p_77615_1_);
            if (k > 0) {
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5 + 0.5);
            }
            final int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, p_77615_1_);
            if (l > 0) {
                entityarrow.setKnockbackStrength(l);
            }
            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, p_77615_1_) > 0) {
                entityarrow.setFire(100);
            }
            p_77615_1_.damageItem(1, p_77615_3_);
            p_77615_2_.playSoundAtEntity(p_77615_3_, "random.bow", 1.0f, 1.0f / (DemeraldBowClass.itemRand.nextFloat() * 0.4f + 1.2f) + f * 0.5f);
            if (flag) {
                entityarrow.canBePickedUp = 2;
            }
            else {
                p_77615_3_.inventory.consumeInventoryItem(Items.arrow);
            }
            if (!p_77615_2_.isRemote) {
                p_77615_2_.spawnEntityInWorld(entityarrow);
            }
        }
    }
}