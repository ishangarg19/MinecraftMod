import net.minecraft.item.ItemArmor;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCheeseArmor extends ItemArmor
{
    public ItemCheeseArmor(final ItemArmor.ArmorMaterial armormaterial, final int renderIndex, final int armorType) {
        super(armormaterial, renderIndex, armorType);
        this.setUnlocalizedName("demarmorhelmet");
        this.setTextureName("demeraldmodtools:demeraldhelmet");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("demarmorchestplate");
        this.setTextureName("demeraldmodtools:demeraldchestplate");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("demarmorleggings");
        this.setTextureName("demeraldmodtools:demeraldpants");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("demarmorboots");
        this.setTextureName("demeraldmodtools:demeraldboots");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}