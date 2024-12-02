package dev.williammmm.extendedmetallurgy.item;

import dev.williammmm.extendedmetallurgy.WilliammmmsExtendedMetallurgy;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_GALENA = registerItem(new Item(new Item.Settings()), "raw_galena");
    public static final Item LEAD_INGOT = registerItem(new Item(new Item.Settings()), "lead_ingot");
    public static final Item SILVER_INGOT = registerItem(new Item(new Item.Settings()), "silver_ingot");

    public static void registerModItem() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((entries) -> {
            entries.add(RAW_GALENA);
            entries.add(LEAD_INGOT);
            entries.add(SILVER_INGOT);
        });
    }

    private static Item registerItem(Item item, String name) {
        return Registry.register(Registries.ITEM, Identifier.of(WilliammmmsExtendedMetallurgy.MOD_ID, name), item);
    }
}
