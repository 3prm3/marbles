package net.dodogang.marbles.init;

import me.andante.chord.item.CScaffoldingItem;
import net.dodogang.marbles.Marbles;
import net.dodogang.marbles.block.YellowScaffoldingBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class MarblesItems {
    public static final Item YELLOW_SCAFFOLDING = register(YellowScaffoldingBlock.id, new CScaffoldingItem(MarblesBlocks.YELLOW_SCAFFOLDING, new Item.Settings().group(Marbles.ITEM_GROUP)));

    public static final Item PINK_SALT_SHARD = register("pink_salt_shard");

    public MarblesItems() {}

    public static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, Marbles.id(id), item);
    }
    public static Item register(String id) {
        return register(id, new Item(new FabricItemSettings().group(Marbles.ITEM_GROUP)));
    }
}
