import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;

public class DemeraldHoeClass extends ItemHoe
{
    public DemeraldHoeClass(final Item.ToolMaterial DEMERALDMATERIAL) {
        super(DEMERALDMATERIAL);
        this.setUnlocalizedName("demeraldhoe");
        this.setTextureName("demeraldmodtools:demeraldhoe");
    }
}