import cn.nukkit.item.ItemTool;
import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;

/**
 * The type My pickaxe.
 */
public class MyPickaxe extends ItemCustomTool {
    public MyPickaxe() {
        super("powernukkitx:amethyst_pickaxe", "测试镐", "amethyst_pickaxe");

    }

    @Override
    public CustomItemDefinition getDefinition() {
        return CustomItemDefinition
                .toolBuilder(this, ItemCreativeCategory.EQUIPMENT)
                .speed(10)
                .allowOffHand(true)
                .handEquipped(true)
                .foil(true)
                .build();
    }

    @Override
    public int getMaxDurability() {
        return ItemTool.DURABILITY_STONE;
    }

    @Override
    public boolean isPickaxe() {
        return true;
    }

    @Override
    public int getAttackDamage() {
        return 3;
    }

    @Override
    public int getEnchantAbility() {
        return 50;
    }

    @Override
    public int getTier() {
        return ItemCustomTool.TIER_NETHERITE;
    }

}
