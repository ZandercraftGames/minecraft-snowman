package nicholls.minecraft.snowman;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = SnowManMod.modId, name = "Snow Man", version = "1")
@NetworkMod(clientSideRequired = true)
public class SnowManMod
{
    public static final String modId = "ChrisNicholls_SnowMan";
    
    @Instance(value = modId)
    public static SnowManMod instance;
    
    @SidedProxy(clientSide = "nicholls.minecraft.snowman.SnowManClientProxy", serverSide = "nicholls.minecraft.snowman.SnowManCommonProxy")
    public static SnowManCommonProxy proxy;
    
    public static Item spawnEgg;

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        int mobId = 0;
        
        EntityRegistry.registerModEntity(SnowManEntity.class, "NichollsSnowMan", mobId, this, 80, 1, true);
        EntityRegistry.addSpawn(SnowManEntity.class, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
        
        proxy.registerRenderers();
        
        spawnEgg = new SpawnSnowManItem(12345);
        
        LanguageRegistry.addName(spawnEgg, "Spawn Snow Man");
        LanguageRegistry.instance().addStringLocalization("entity.NichollsSnowMan.name", "en_US", "Snow Man");
    }

}
