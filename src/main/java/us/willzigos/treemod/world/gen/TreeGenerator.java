package us.willzigos.treemod.world.gen;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.registries.ForgeRegistries;
import us.willzigos.treemod.block.MapleLeaves;
import us.willzigos.treemod.block.MapleLog;
import us.willzigos.treemod.world.gen.feature.MapleTreeFeature;

public class TreeGenerator {

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MAPLE =
            (ConfiguredFeature<BaseTreeFeatureConfig, ?>) new MapleTreeFeature( BaseTreeFeatureConfig.field_236676_a_)
                    .withConfiguration(
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(MapleLog.INSTANCE.getDefaultState()),
                            new SimpleBlockStateProvider(MapleLeaves.INSTANCE.getDefaultState()),
                            new BlobFoliagePlacer(2,0,0,0,3),
                            new StraightTrunkPlacer(4,2,0),
                            new TwoLayerFeature(1,0,1))
                            .func_236700_a_().func_236703_a_(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).build()
            ).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2,0.1F,1)));

    public static void setup() {
        addTreeToForest(MAPLE);
    }

    private static void addTreeToForest(ConfiguredFeature<?,?> featureIn) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (!biome.getCategory().equals(Biome.Category.NETHER) && !biome.getCategory().equals(Biome.Category.THEEND)) {
                if (biome.getDisplayName().getString().toLowerCase().contains("forest") ||
                        biome.getDisplayName().getString().toLowerCase().contains("tree")) {
                    biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, featureIn);
                }
            }
        }
    }

}
