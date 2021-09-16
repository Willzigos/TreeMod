package us.willzigos.treemod;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.willzigos.treemod.block.BlockMod;
import us.willzigos.treemod.block.MapleSapling;
import us.willzigos.treemod.world.gen.TreeGenerator;

@Mod(BaseMod.MODID)
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class BaseMod {

    public static final String MODID = "treemod";
    public static final Logger LOGGER = LogManager.getLogger(BaseMod.MODID);

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        LOGGER.info("Registering Blocks");

        BlockMod.registerBlocks(event);

    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        LOGGER.info("Registering Items");

        BlockMod.registerBlockItems(event);

    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        BaseMod.LOGGER.info("Registering Entities");
    }

    @SubscribeEvent
    public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
        BaseMod.LOGGER.info("Registering Biomes");
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        BaseMod.LOGGER.info("Client Setup Step");
        RenderTypeLookup.setRenderLayer(MapleSapling.INSTANCE.getBlock(), RenderType.getCutout());
    }

    @SubscribeEvent
    public static void setup(FMLCommonSetupEvent event) {
        BaseMod.LOGGER.info("Mod Setup Step");

        TreeGenerator.setup();


    }
}