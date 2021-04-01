import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;

public class DemeraldPickaxeClass extends ItemPickaxe
{
    public DemeraldPickaxeClass(final Item.ToolMaterial DEMERALDMATERIAL) {
        super(DEMERALDMATERIAL);
        this.setUnlocalizedName("demeraldpickaxe");
        this.setTextureName("demeraldmodtools:demeraldpickaxe");
    }
}