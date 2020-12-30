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

package com.codenamerevy.horizontalpanes.events;

import com.codenamerevy.horizontalpanes.HorizontalPanes;
import com.codenamerevy.horizontalpanes.init.HPContent;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModRegistry
{
    public static void setup()
    {
        registerBlocks();
        registerItems();

    }

    public static void clientSetup()
    {
        registerRender();
    }

    private static void registerBlocks()
    {
        //Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "test_block"),                          HPContent.TEST_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_glass_pane"),               HPContent.GLASS_PANE);

        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_white_pane"),       HPContent.WHITE_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_orange_pane"),      HPContent.ORANGE_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_magenta_pane"),     HPContent.MAGENTA_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_light_blue_pane"),  HPContent.LIGHT_BLUE_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_yellow_pane"),      HPContent.YELLOW_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_lime_pane"),        HPContent.LIME_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_pink_pane"),        HPContent.PINK_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_gray_pane"),        HPContent.GRAY_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_light_gray_pane"),  HPContent.SILVER_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_cyan_pane"),        HPContent.CYAN_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_purple_pane"),      HPContent.PURPLE_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_blue_pane"),        HPContent.BLUE_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_brown_pane"),       HPContent.BROWN_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_green_pane"),       HPContent.GREEN_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_red_pane"),         HPContent.RED_PANE);
        Registry.register(Registry.BLOCK, new Identifier(HorizontalPanes.MODID, "horizontal_stained_black_pane"),       HPContent.BLACK_PANE);
    }

    private static void registerItems()
    {
        //Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "test_block"),                          new BlockItem(HPContent.TEST_BLOCK,         new Item.Settings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_glass_pane"),               new BlockItem(HPContent.GLASS_PANE,         new Item.Settings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_white_pane"),       new BlockItem(HPContent.WHITE_PANE,         new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_orange_pane"),      new BlockItem(HPContent.ORANGE_PANE,        new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_magenta_pane"),     new BlockItem(HPContent.MAGENTA_PANE,       new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_light_blue_pane"),  new BlockItem(HPContent.LIGHT_BLUE_PANE,    new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_yellow_pane"),      new BlockItem(HPContent.YELLOW_PANE,        new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_lime_pane"),        new BlockItem(HPContent.LIME_PANE,          new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_pink_pane"),        new BlockItem(HPContent.PINK_PANE,          new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_gray_pane"),        new BlockItem(HPContent.GRAY_PANE,          new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_light_gray_pane"),  new BlockItem(HPContent.SILVER_PANE,        new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_cyan_pane"),        new BlockItem(HPContent.CYAN_PANE,          new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_purple_pane"),      new BlockItem(HPContent.PURPLE_PANE,        new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_blue_pane"),        new BlockItem(HPContent.BLUE_PANE,          new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_brown_pane"),       new BlockItem(HPContent.BROWN_PANE,         new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_green_pane"),       new BlockItem(HPContent.GREEN_PANE,         new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_red_pane"),         new BlockItem(HPContent.RED_PANE,           new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM,  new Identifier(HorizontalPanes.MODID, "horizontal_stained_black_pane"),       new BlockItem(HPContent.BLACK_PANE,         new Item.Settings().group(ItemGroup.DECORATIONS)));
    }

    private static void registerRender()
    {
        //BlockRenderLayerMap.INSTANCE.putBlock(HPContent.TEST_BLOCK,         RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.GLASS_PANE,         RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.WHITE_PANE,         RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.ORANGE_PANE,        RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.MAGENTA_PANE,       RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.LIGHT_BLUE_PANE,    RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.YELLOW_PANE,        RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.LIME_PANE,          RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.PINK_PANE,          RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.GRAY_PANE,          RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.SILVER_PANE,        RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.CYAN_PANE,          RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.PURPLE_PANE,        RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.BLUE_PANE,          RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.BROWN_PANE,         RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.GREEN_PANE,         RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.RED_PANE,           RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HPContent.BLACK_PANE,         RenderLayer.getTranslucent());
    }
}

