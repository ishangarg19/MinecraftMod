import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldWaterClass extends Block
{
    public DemeraldWaterClass() {
        super(Material.rock);
        this.setBlockName("demeraldwater");
        this.setBlockTextureName("demeraldmodtools:demeraldwater");
        this.setLightOpacity(0);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}