import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldPlankClass extends Block
{
    public DemeraldPlankClass() {
        super(Material.wood);
        this.setBlockName("demeraldplank");
        this.setBlockTextureName("demeraldmodtools:demeraldplank");
        this.setHardness(10.0f);
        this.setLightOpacity(1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}