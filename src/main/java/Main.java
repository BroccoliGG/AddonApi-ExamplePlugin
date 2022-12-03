import cn.nukkit.block.Block;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.provider.CustomClassEntityProvider;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJumpEvent;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLogger;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main extends PluginBase implements Listener {
    PluginLogger log;

    @Override
    public void onLoad() {
        log = new PluginLogger(this);
        try {
            Item.registerCustomItem(List.of(MySword.class, MyArmor.class, MyPickaxe.class));
            Block.registerCustomBlock(List.of(MyBlock1.class, MySlab.class));
            Entity.registerCustomEntity(new CustomClassEntityProvider(MyPig.def, MyPig.class));

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            log.info("实验性玩法插件启动失败!");
            e.printStackTrace();
        }
    }

    @Override
    public void onEnable() {
        log.info("实验性玩法插件启动成功!");
        this.getServer().getPluginManager().registerEvents(new Main(), this);
    }

    @Override
    public void onDisable() {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onJump(PlayerJumpEvent event) {
        System.out.println("触发事件");
        new MyPig(event.getPlayer().getChunk(), Entity.getDefaultNBT(event.getPlayer())).spawnToAll();
    }
}
