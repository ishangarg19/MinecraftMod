import net.minecraft.item.ItemSword;
import net.minecraft.item.Item;

public class DemeraldSwordClass extends ItemSword
{
    public DemeraldSwordClass(final Item.ToolMaterial DEMERALDMATERIAL) {
        super(DEMERALDMATERIAL);
        this.setUnlocalizedName("demeraldsword");
        this.setTextureName("demeraldmodtools:demeraldsword");
    }
}