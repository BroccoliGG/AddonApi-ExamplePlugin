package pnx.customitem;

import cn.nukkit.item.ItemSwordDiamond;
import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;

public class MySword extends ItemCustomTool {
    public MySword() {
        super("powernukkitx:test_sward", "测试剑", "test_sward");
    }

    @Override
    public CustomItemDefinition getDefinition() {
        return CustomItemDefinition
                .toolBuilder(this, ItemCreativeCategory.EQUIPMENT)
                .allowOffHand(true)
                .handEquipped(true)
                .foil(true)
                .build();
    }

    @Override
    public int getMaxDurability() {
        return 1000;
    }

    @Override
    public int getTier() {
        return ItemSwordDiamond.TIER_DIAMOND;
    }

    @Override
    public int getAttackDamage() {
        return 30;
    }

    @Override
    public int getEnchantAbility() {
        return 20;
    }

    @Override
    public boolean isSword() {
        return true;
    }
}
