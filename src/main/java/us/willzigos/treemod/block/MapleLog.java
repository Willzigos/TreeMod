package us.willzigos.treemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.item.Item;
import us.willzigos.treemod.BaseMod;

public class MapleLog extends RotatedPillarBlock {

    public static Block INSTANCE = new MapleLog(Properties.from(Blocks.OAK_LOG)).setRegistryName(BaseMod.MODID, "maple_log");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE);

    public MapleLog(Properties properties) {
        super(properties);
    }
}
