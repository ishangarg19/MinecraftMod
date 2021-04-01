import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldBrickClass extends Block
{
    public DemeraldBrickClass() {
        super(Material.rock);
        this.setBlockName("demeraldbricks");
        this.setBlockTextureName("demeraldmodtools:demeraldbricks");
        this.setHardness(10.0f);
        this.setLightOpacity(1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}