package io.mac9p.pumbmod.item;

import io.mac9p.pumbmod.PumbMod;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PumbMod.MOD_ID);

    public static final RegistryObject<Item> MYSTIC_FUR = ITEMS.register("mystic_fur",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
