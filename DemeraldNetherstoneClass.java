import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldNetherstoneClass extends Block
{
    public DemeraldNetherstoneClass() {
        super(Material.iron);
        this.setBlockName("Demerald Nether Stone");
        this.setBlockTextureName("demeraldmodtools:demeraldnetherstone");
        this.setHardness(5.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}