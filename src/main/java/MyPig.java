import cn.nukkit.entity.Entity;
import cn.nukkit.entity.custom.CustomEntity;
import cn.nukkit.entity.custom.CustomEntityDefinition;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class MyPig extends Entity implements CustomEntity {
    final static CustomEntityDefinition def = CustomEntityDefinition.builder().identifier("powernukkitx:boar")
            .summonable(true)
            .spawnEgg(false)
            .build();

    public MyPig(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return Entity.NETWORK_ID;
    }

    @Override
    public CustomEntityDefinition getDefinition() {
        return def;
    }

    @Override
    public String getOriginalName() {
        return "boar";
    }
}
