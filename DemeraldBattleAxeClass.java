import net.minecraft.item.ItemSword;
import net.minecraft.item.Item;

public class DemeraldBattleAxeClass extends ItemSword
{
    public DemeraldBattleAxeClass(final Item.ToolMaterial DEMERALDMATERIAL) {
        super(DEMERALDMATERIAL);
        this.setUnlocalizedName("demeraldbattleaxe");
        this.setTextureName("demeraldmodtools:demeraldbattleaxe");
    }
}