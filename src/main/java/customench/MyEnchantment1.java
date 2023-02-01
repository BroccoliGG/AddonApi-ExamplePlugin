package customench;

import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.item.enchantment.EnchantmentType;
import cn.nukkit.utils.Identifier;

public class MyEnchantment1 extends Enchantment {
    public MyEnchantment1() {
        super(new Identifier("pnx:test1"), "Test1", Rarity.COMMON, EnchantmentType.ALL);
    }
}
