import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item;

public class DemeraldAxeClass extends ItemAxe
{
    public DemeraldAxeClass(final Item.ToolMaterial DEMERALDMATERIAL) {
        super(DEMERALDMATERIAL);
        this.setUnlocalizedName("demeraldaxe");
        this.setTextureName("demeraldmodtools:demeraldaxe");
    }
}