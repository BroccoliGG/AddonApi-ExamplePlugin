package pnx;

import cn.nukkit.block.Block;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.provider.CustomClassEntityProvider;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLogger;
import pnx.customblock.MyBlock;
import pnx.customblock.MySlab;
import pnx.customench.MyEnchantment1;
import pnx.customench.MyEnchantment2;
import pnx.customentity.MyHuman;
import pnx.customentity.MyPig;
import pnx.customitem.MyArmor;
import pnx.customitem.MyPickaxe;
import pnx.customitem.MySword;

import java.util.List;

public class MainPlugin extends PluginBase implements Listener {
    public static MainPlugin INSTANCE;
    PluginLogger log;

    @Override
    public void onLoad() {
        INSTANCE = this;
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
        this.getServer().getPluginManager().registerEvents(new MainPlugin(), this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onChat(PlayerChatEvent event) {
        if (event.getMessage().contains("test")) {
            System.out.println("生成自定义实体");
            new MyPig(event.getPlayer().getChunk(), Entity.getDefaultNBT(event.getPlayer())).spawnToAll();
            new MyHuman(event.getPlayer().getChunk(), Entity.getDefaultNBT(event.getPlayer())).spawnToAll();
        }
    }
}
