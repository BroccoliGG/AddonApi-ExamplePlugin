import cn.nukkit.block.Block;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.provider.CustomClassEntityProvider;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJumpEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLogger;
import customblock.MyBlock;
import customblock.MySlab;
import customench.MyEnchantment1;
import customench.MyEnchantment2;
import customentity.MyHuman;
import customentity.MyPig;
import customitem.MyArmor;
import customitem.MyPickaxe;
import customitem.MySword;

import java.util.List;

public class Main extends PluginBase implements Listener {
    PluginLogger log;

    @Override
    public void onLoad() {
        log = new PluginLogger(this);
        Item.registerCustomItem(List.of(MySword.class, MyArmor.class, MyPickaxe.class));
        Block.registerCustomBlock(List.of(MyBlock.class, MySlab.class));
        Entity.registerCustomEntity(new CustomClassEntityProvider(MyPig.class));
        Entity.registerCustomEntity(new CustomClassEntityProvider(MyHuman.class));
        Enchantment.register(new MyEnchantment1(), new MyEnchantment2());
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
        System.out.println("生成自定义实体");
        new MyPig(event.getPlayer().getChunk(), Entity.getDefaultNBT(event.getPlayer())).spawnToAll();
        new MyHuman(event.getPlayer().getChunk(), Entity.getDefaultNBT(event.getPlayer())).spawnToAll();
    }
}
