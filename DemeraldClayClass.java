import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldClayClass extends Block
{
    public DemeraldClayClass() {
        super(Material.clay);
        this.setBlockName("demeraldclay");
        this.setBlockTextureName("demeraldmodtools:demeraldclay");
        this.setHardness(1.0f);
        this.setLightOpacity(1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}