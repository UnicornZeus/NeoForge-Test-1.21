package net.zeus.testmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zeus.testmod.TestMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MOD_ID);

    public static final DeferredItem<Item> TESTITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()));









    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
