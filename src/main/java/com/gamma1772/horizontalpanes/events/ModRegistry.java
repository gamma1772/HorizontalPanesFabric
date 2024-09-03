/*
 * Copyright 2020 Marko Dujović
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.gamma1772.horizontalpanes.events;

import com.gamma1772.horizontalpanes.init.HPContent;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.gamma1772.horizontalpanes.HorizontalPanes.MODID;


public class ModRegistry {

    public static final RegistryKey<ItemGroup> HORIZONTAL_PANES = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MODID, "additionalbars"));

    public static void setup() {
        registerBlocks();
        registerItemGroups();
        addItemsToItemGroup();

    }

    private static void registerBlocks() {
        register(HPContent.GLASS_PANE, "horizontal_glass_pane", true);

        register(HPContent.WHITE_PANE, "horizontal_stained_white_pane", true);
        register(HPContent.ORANGE_PANE, "horizontal_stained_orange_pane", true);
        register(HPContent.MAGENTA_PANE, "horizontal_stained_magenta_pane", true);
        register(HPContent.LIGHT_BLUE_PANE, "horizontal_stained_light_blue_pane", true);
        register(HPContent.YELLOW_PANE, "horizontal_stained_yellow_pane", true);
        register(HPContent.LIME_PANE, "horizontal_stained_lime_pane", true);
        register(HPContent.PINK_PANE, "horizontal_stained_pink_pane", true);
        register(HPContent.GRAY_PANE, "horizontal_stained_gray_pane", true);
        register(HPContent.SILVER_PANE, "horizontal_stained_light_gray_pane", true);
        register(HPContent.CYAN_PANE, "horizontal_stained_cyan_pane", true);
        register(HPContent.PURPLE_PANE, "horizontal_stained_purple_pane", true);
        register(HPContent.BLUE_PANE, "horizontal_stained_blue_pane", true);
        register(HPContent.BROWN_PANE, "horizontal_stained_brown_pane", true);
        register(HPContent.GREEN_PANE, "horizontal_stained_green_pane", true);
        register(HPContent.RED_PANE, "horizontal_stained_red_pane", true);
        register(HPContent.BLACK_PANE, "horizontal_stained_black_pane", true);

        register(HPContent.TINTED_PANE, "horizontal_tinted_glass_pane", true);
    }

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, HORIZONTAL_PANES, FabricItemGroup.builder()
                .icon(() -> new ItemStack(HPContent.TINTED_PANE))
                .displayName(Text.translatable("itemGroup.horizontalpanes.horizontalpanes"))
                .build());
    }

    public static void addItemsToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(HORIZONTAL_PANES).register(content -> {
            content.add(HPContent.GLASS_PANE.asItem());
            content.add(HPContent.WHITE_PANE.asItem());
            content.add(HPContent.ORANGE_PANE.asItem());
            content.add(HPContent.MAGENTA_PANE.asItem());
            content.add(HPContent.LIGHT_BLUE_PANE.asItem());
            content.add(HPContent.YELLOW_PANE.asItem());
            content.add(HPContent.LIME_PANE.asItem());
            content.add(HPContent.PINK_PANE.asItem());
            content.add(HPContent.GRAY_PANE.asItem());
            content.add(HPContent.SILVER_PANE.asItem());
            content.add(HPContent.CYAN_PANE.asItem());
            content.add(HPContent.PURPLE_PANE.asItem());
            content.add(HPContent.BLUE_PANE.asItem());
            content.add(HPContent.BROWN_PANE.asItem());
            content.add(HPContent.GREEN_PANE.asItem());
            content.add(HPContent.RED_PANE.asItem());
            content.add(HPContent.BLACK_PANE.asItem());
            content.add(HPContent.TINTED_PANE.asItem());
        });
    }

    private static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(MODID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
}

