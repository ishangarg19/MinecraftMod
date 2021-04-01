import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldSpongeClass extends Block
{
    public DemeraldSpongeClass() {
        super(Material.sponge);
        this.setBlockName("demeraldsponge");
        this.setBlockTextureName("demeraldmodtools: demeraldsponge");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}