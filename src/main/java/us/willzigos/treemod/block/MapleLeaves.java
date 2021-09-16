package us.willzigos.treemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import us.willzigos.treemod.BaseMod;

public class MapleLeaves extends LeavesBlock {

    public static Block INSTANCE = new MapleLeaves(Properties.create(Material.LEAVES).hardnessAndResistance(0.2F,0.2F).harvestTool(ToolType.HOE).tickRandomly().sound(SoundType.PLANT).notSolid()).setRegistryName(BaseMod.MODID, "maple_leaves");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE);

    public MapleLeaves(Properties properties) {
        super(properties);
    }
}
