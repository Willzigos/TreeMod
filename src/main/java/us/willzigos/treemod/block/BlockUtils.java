package us.willzigos.treemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import us.willzigos.treemod.BaseMod;

public class BlockUtils {

    public static Block createBasicBlock(String name, Material material, float hardness, float resistance, int level, ToolType tool, SoundType sound){
        return new Block(Block.Properties.create(material).hardnessAndResistance(hardness, resistance).func_235861_h_().harvestLevel(level).harvestTool(tool).sound(sound)).setRegistryName(BaseMod.MODID, name);
    }

    public static Item createBlockItem(Block block){
        return new BlockItem(block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(block.getRegistryName());
    }

}
