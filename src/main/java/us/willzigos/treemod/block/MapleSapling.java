package us.willzigos.treemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.item.Item;
import us.willzigos.treemod.BaseMod;
import us.willzigos.treemod.world.gen.MapleTree;

public class MapleSapling extends SaplingBlock {

    public static Block INSTANCE = new MapleSapling(new MapleTree(), Properties
            .from(Blocks.OAK_SAPLING)).setRegistryName(BaseMod.MODID, "maple_sapling");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE);

    public MapleSapling(Tree treeIn, Properties properties) {
        super(treeIn, properties);
    }
}
