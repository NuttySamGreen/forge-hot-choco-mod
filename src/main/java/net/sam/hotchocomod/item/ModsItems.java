package net.sam.hotchocomod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sam.hotchocomod.HotChocoMod;

public class ModsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HotChocoMod.MOD_ID);

    public static final RegistryObject<Item> Mug = ITEMS.register("mug",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Clay_Mug = ITEMS.register("clay_mug", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Hot_Chocolate = ITEMS.register("hot_chocolate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Expired_Hot_Chocolate = ITEMS.register("expired_hot_chocolate", () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus)
    {
       ITEMS.register(eventBus);
    }
}
