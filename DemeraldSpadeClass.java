import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;

public class DemeraldSpadeClass extends ItemSpade
{
    public DemeraldSpadeClass(final Item.ToolMaterial DEMERALDMATERIAL) {
        super(DEMERALDMATERIAL);
        this.setUnlocalizedName("demeraldsspade");
        this.setTextureName("demeraldmodtools:demeraldspade");
    }
}