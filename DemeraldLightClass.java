import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldLightClass extends Block
{
    public DemeraldLightClass() {
        super(Material.glass);
        this.setBlockName("demeraldlight");
        this.setBlockTextureName("demeraldmodtools:demeraldlight");
        this.setHardness(0.0f);
        this.setLightOpacity(1);
        this.setLightLevel(1.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}