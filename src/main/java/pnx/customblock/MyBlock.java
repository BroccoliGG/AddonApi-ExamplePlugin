package pnx.customblock;

import cn.nukkit.block.Block;
import cn.nukkit.block.customblock.CustomBlock;
import cn.nukkit.block.customblock.CustomBlockDefinition;
import cn.nukkit.block.customblock.data.Transformation;
import cn.nukkit.math.Vector3;
import org.jetbrains.annotations.NotNull;

public class MyBlock extends Block implements CustomBlock {
    @NotNull
    @Override
    public String getNamespaceId() {
        return "powernukkitx:redstoneluckyblock";
    }

    @Override
    public CustomBlockDefinition getDefinition() {
        return CustomBlockDefinition
                .builder(this, "redstoneluckyblock")
                .transformation(new Transformation(new Vector3(0, 0, 0), new Vector3(1, 1, 1), new Vector3(90, 180, 90)))
                .breakTime(3)
                .build();
    }

    @Override
    public String getName() {
        return CustomBlock.super.getName();
    }

    @Override
    public int getId() {
        return CustomBlock.super.getId();
    }

    @Override
    public double getFrictionFactor() {
        return 0.8;
    }

    @Override
    public double getHardness() {
        return 99999;
    }

    @Override
    public double getResistance() {
        return 500;
    }

    @Override
    public int getLightLevel() {
        return 15;
    }

    @Override
    public int getLightFilter() {
        return 15;
    }

    @Override
    public int getBurnAbility() {
        return 0;
    }

    @Override
    public int getBurnChance() {
        return 0;
    }

    @Override
    public int getItemMaxStackSize() {
        return 64;
    }
}
