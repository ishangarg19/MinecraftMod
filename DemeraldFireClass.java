import net.minecraft.block.BlockFire;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldFireClass extends BlockFire
{
    public DemeraldFireClass() {
        super();
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(0.0f);
        this.setBlockName("demfire2");
        this.setBlockTextureName("demeraldmodtools:demfire");
    }
}