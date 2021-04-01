import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

class AirClass extends Block
{
    public AirClass() {
        super(Material.cloth);
        this.setBlockName("air");
        this.setBlockTextureName("demeraldmodtools:air");
        this.useNeighborBrightness = true;
        this.setHardness(1.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightOpacity(0);
    }
}