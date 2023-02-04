package pnx.customench;

import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.item.enchantment.EnchantmentType;
import cn.nukkit.utils.Identifier;

public class MyEnchantment2 extends Enchantment {
    public MyEnchantment2() {
        super(new Identifier("pnx:test2"), "Test2", Rarity.COMMON, EnchantmentType.ALL);
    }
}
