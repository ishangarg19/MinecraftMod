import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldBedrockClass extends Block
{
    public DemeraldBedrockClass() {
        super(Material.iron);
        this.setBlockName("dembedrock");
        this.setBlockTextureName("demeraldmodtools:dembedrock");
        this.setBlockUnbreakable();
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}