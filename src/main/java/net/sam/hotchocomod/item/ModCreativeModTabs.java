package net.sam.hotchocomod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sam.hotchocomod.HotChocoMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HotChocoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HOTCHOCO_TAB = CREATIVE_MODE_TABS.register("hotchoco_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModsItems.Hot_Chocolate.get()))
            .title(Component.translatable("creativetab.hotchoco_tab"))
            .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModsItems.Clay_Mug.get());
            pOutput.accept(ModsItems.Mug.get());
                pOutput.accept(ModsItems.Hot_Chocolate.get());
                pOutput.accept(ModsItems.Expired_Hot_Chocolate.get());
    })
            .build());

    public static void register(IEventBus eventBus){
    CREATIVE_MODE_TABS.register(eventBus);
    }
}
