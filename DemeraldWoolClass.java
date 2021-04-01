import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldWoolClass extends Block
{
    public DemeraldWoolClass() {
        super(Material.cloth);
        this.setBlockName("demeraldwool");
        this.setBlockTextureName("demeraldmodtools:demeraldwool");
        this.setHardness(5.0f);
        this.setLightOpacity(1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}