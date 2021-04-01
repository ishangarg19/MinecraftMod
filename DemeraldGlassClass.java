import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

class DemeraldGlassClass extends Block
{
    public DemeraldGlassClass() {
        super(Material.glass);
        this.setBlockName("demeraldglass");
        this.setBlockTextureName("demeraldmodtools:demeraldglass");
        this.setHardness(0.0f);
        this.useNeighborBrightness = true;
        this.blockMaterial.isSolid();
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightOpacity(0);
        this.getUseNeighborBrightness();
    }
}