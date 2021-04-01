import cpw.mods.fml.common.Mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.block.Block;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "demeraldmodtools", name = "Demerald Mod", version = "1.0")
public class DemeraldToolsMain
{
    public static Item.ToolMaterial DEMERALDMATERIAL;
    public static Item.ToolMaterial BATTLEMATERIAL;
    public static final ItemArmor.ArmorMaterial demarmormaterial;
    public static ItemArmor demarmorhelmet;
    public static ItemArmor demarmorchestplate;
    public static ItemArmor demarmorleggings;
    public static ItemArmor demarmorboots;
    public static Item demeraldpickaxe;
    public static Item demeraldsword;
    public static Item demeraldspade;
    public static Item demeraldaxe;
    public static Item demeraldbattleaxe;
    public static Item demeraldhoe;
    public static Item demeraldbow;
    public static Item demeraldingot;
    public static Item demeraldinfusionstone;
    public static Item demeraldbeef;
    public static Block demeraldblock;
    public static Block demeraldore;
    public static Block demeraldglass;
    public static Block demeraldlight;
    public static Block demeraldwater;
    public static Block air;
    public static Block demeraldclay;
    public static Block demeraldbricks;
    public static Block demeraldwool;
    public static Block demeraldbedrock;
    public static Block demeraldplank;
    public static Block demeraldfire;
    public static Block demeraldsponge;
    public static Block demeraldnetherstone;
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent items) {
        DemeraldToolsMain.demarmorhelmet = new ItemCheeseArmor(DemeraldToolsMain.demarmormaterial, 0, 0);
        DemeraldToolsMain.demarmorchestplate = new ItemCheeseArmor(DemeraldToolsMain.demarmormaterial, 0, 1);
        DemeraldToolsMain.demarmorleggings = new ItemCheeseArmor(DemeraldToolsMain.demarmormaterial, 0, 2);
        DemeraldToolsMain.demarmorboots = new ItemCheeseArmor(DemeraldToolsMain.demarmormaterial, 0, 3);
        GameRegistry.registerItem(DemeraldToolsMain.demarmorhelmet, "Demerald Helmet");
        GameRegistry.registerItem(DemeraldToolsMain.demarmorchestplate, "Demerald Chestplate");
        GameRegistry.registerItem(DemeraldToolsMain.demarmorboots, "Demerald Boots");
        GameRegistry.registerItem(DemeraldToolsMain.demarmorleggings, "Demerald Leggings");
        DemeraldToolsMain.demeraldbeef = new DemeraldBeefClass(8, 1.0f, true).setUnlocalizedName("Demerald Beef");
        GameRegistry.registerItem(DemeraldToolsMain.demeraldbeef, DemeraldToolsMain.demeraldbeef.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(DemeraldToolsMain.demeraldbeef, "Demerald Beef");
        DemeraldToolsMain.demeraldnetherstone = new DemeraldnetherstoneClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldnetherstone, "demeraldnetherstone");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldnetherstone, "Demerald Netherrack");
        DemeraldToolsMain.demeraldingot = new DemeraldIngotClass();
        GameRegistry.registerItem(DemeraldToolsMain.demeraldingot, "demeraldingot");
        GameRegistry.addShapelessRecipe(new ItemStack(DemeraldToolsMain.demeraldingot), new Object[] { Items.diamond, Items.emerald, Items.blaze_powder });
        GameRegistry.registerWorldGenerator(new demeraldGenerator(), 0);
        DemeraldToolsMain.demeraldfire = new demeraldFireClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldfire, "demeraldfire");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldfire, "Demerald Fire");
        DemeraldToolsMain.demeraldbedrock = new demeraldBedrockClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldbedrock, "demeraldbedrock");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldbedrock, "Demerald Bedrock");
        DemeraldToolsMain.demeraldsponge = new demeraldSpongeClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldsponge, "demeraldsponge");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldsponge, "Demerald Sponge");
        DemeraldToolsMain.demeraldplank = new demeraldPlankClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldplank, "demeraldplank");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldplank, "Demerald Plank");
        DemeraldToolsMain.demeraldclay = new demeraldClayClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldclay, "demeraldclay");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldclay, "Demerald Clay");
        DemeraldToolsMain.demeraldbow = new DemeraldBowClass();
        GameRegistry.registerItem(DemeraldToolsMain.demeraldbow, "demeraldbow");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldbow, "Demerald Bow");
        DemeraldToolsMain.demeraldwool = new demeraldWoolClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldwool, "demeraldwool");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldwool, "Demerald Wool");
        DemeraldToolsMain.demeraldbricks = new demeraldBrickClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldbricks, "demeraldbricks");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldbricks, "Demerald Bricks");
        DemeraldToolsMain.demeraldlight = new demeraldLightClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldlight, "demeraldlight");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldlight, "Demerald Lamp");
        DemeraldToolsMain.air = new airclass();
        GameRegistry.registerBlock(DemeraldToolsMain.air, "air");
        LanguageRegistry.addName(DemeraldToolsMain.air, "Air");
        DemeraldToolsMain.demeraldwater = new demeraldWaterClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldwater, "demeraldwater");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldwater, "Animations Block");
        DemeraldToolsMain.demeraldore = new demeraldOreClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldore, "demeraldore");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldore, "Demerald Ore");
        GameRegistry.addSmelting(DemeraldToolsMain.demeraldore, new ItemStack(DemeraldToolsMain.demeraldingot, 1), 50.0f);
        DemeraldToolsMain.demeraldglass = new demeraldGlassClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldglass, "demeraldglass");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldglass, "Demerald Glass");
        DemeraldToolsMain.demeraldblock = new DemeraldBlockClass();
        GameRegistry.registerBlock(DemeraldToolsMain.demeraldblock, "demeraldblock");
        LanguageRegistry.addName(DemeraldToolsMain.demeraldblock, "Demerald Block");
        GameRegistry.addRecipe(new ItemStack(DemeraldToolsMain.demeraldblock), new Object[] { "AAA", "AAA", "AAA", 'A', DemeraldToolsMain.demeraldingot });
        DemeraldToolsMain.demeraldpickaxe = new DemeraldpickaxeClass(DemeraldToolsMain.DEMERALDMATERIAL);
        GameRegistry.registerItem(DemeraldToolsMain.demeraldpickaxe, "demeraldpickaxe");
        GameRegistry.addRecipe(new ItemStack(DemeraldToolsMain.demeraldpickaxe), new Object[] { "AAA", " B ", " B ", 'A', DemeraldToolsMain.demeraldingot, 'B', Items.blaze_rod });
        DemeraldToolsMain.demeraldsword = new DemeraldSwordClass(DemeraldToolsMain.DEMERALDMATERIAL);
        GameRegistry.registerItem(DemeraldToolsMain.demeraldsword, "demeraldsword");
        GameRegistry.addRecipe(new ItemStack(DemeraldToolsMain.demeraldsword), new Object[] { " A ", " A ", " B ", 'A', DemeraldToolsMain.demeraldingot, 'B', Items.blaze_rod });
        DemeraldToolsMain.demeraldspade = new DemeraldSpadeClass(DemeraldToolsMain.DEMERALDMATERIAL);
        GameRegistry.registerItem(DemeraldToolsMain.demeraldspade, "demeraldspade");
        GameRegistry.addRecipe(new ItemStack(DemeraldToolsMain.demeraldspade), new Object[] { " A ", " B ", " B ", 'A', DemeraldToolsMain.demeraldingot, 'B', Items.blaze_rod });
        DemeraldToolsMain.demeraldaxe = new DemeraldAxeClass(DemeraldToolsMain.DEMERALDMATERIAL);
        GameRegistry.registerItem(DemeraldToolsMain.demeraldaxe, "demeraldaxe");
        GameRegistry.addRecipe(new ItemStack(DemeraldToolsMain.demeraldaxe), new Object[] { "AA ", "AB ", " B ", 'A', DemeraldToolsMain.demeraldingot, 'B', Items.blaze_rod });
        DemeraldToolsMain.demeraldbattleaxe = new DemeraldBattleAxeClass(DemeraldToolsMain.BATTLEMATERIAL);
        GameRegistry.registerItem(DemeraldToolsMain.demeraldbattleaxe, "demeraldbattleaxe");
        GameRegistry.addRecipe(new ItemStack(DemeraldToolsMain.demeraldbattleaxe), new Object[] { "AAA", "ABA", " B ", 'A', DemeraldToolsMain.demeraldingot, 'B', Items.blaze_rod });
        DemeraldToolsMain.demeraldhoe = new DemeraldHoeClass(DemeraldToolsMain.DEMERALDMATERIAL);
        GameRegistry.registerItem(DemeraldToolsMain.demeraldhoe, "demeraldhoe");
        GameRegistry.addRecipe(new ItemStack(DemeraldToolsMain.demeraldhoe), new Object[] { "AA ", " B ", " B ", 'A', DemeraldToolsMain.demeraldingot, 'B', Items.blaze_rod });
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent EventMobSpawn) {
        MinecraftForge.EVENT_BUS.register(new EffectsClass());
    }
    
    static {
        DemeraldToolsMain.DEMERALDMATERIAL = EnumHelper.addToolMaterial("DEMERALD", 5, 3000, 15.0f, 7.0f, 30);
        DemeraldToolsMain.BATTLEMATERIAL = EnumHelper.addToolMaterial("BATTLE", 5, 3000, 5.0f, 12.0f, 25);
        demarmormaterial = EnumHelper.addArmorMaterial("demarmormaterial", 4500, new int[] { 3, 8, 5, 2 }, 30);
    }
}