package us.willzigos.treemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockMod {

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {

        event.getRegistry().register(MapleLeaves.ITEM);
        event.getRegistry().register(MapleLog.ITEM);
        event.getRegistry().register(MapleSapling.ITEM);

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        event.getRegistry().register(MapleLeaves.INSTANCE);
        event.getRegistry().register(MapleLog.INSTANCE);
        event.getRegistry().register(MapleSapling.INSTANCE);


    }
}