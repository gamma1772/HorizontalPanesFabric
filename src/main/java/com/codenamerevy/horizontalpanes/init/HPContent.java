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

package com.codenamerevy.horizontalpanes.init;

import com.codenamerevy.horizontalpanes.content.blocks.HorizontalPaneBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class HPContent
{
    //public static final Block TEST_BLOCK        = new HorizontalPaneBlock(FabricBlockSettings.of(Material.GLASS).hardness(0.3F).resistance(0.3F).sounds(BlockSoundGroup.GLASS));
    private static Boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) { return false; }
    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) { return false; }

    private static final FabricBlockSettings HORIZONTAL_PANE_SETTINGS = FabricBlockSettings.of(Material.GLASS).nonOpaque().solidBlock(HPContent::never).blockVision(HPContent::never).suffocates(HPContent::never).allowsSpawning(HPContent::never).breakByHand(false).hardness(0.3F).resistance(0.3F).sounds(BlockSoundGroup.GLASS);

    public static final Block GLASS_PANE        = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);

    public static final Block WHITE_PANE        = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block ORANGE_PANE       = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block MAGENTA_PANE      = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block LIGHT_BLUE_PANE   = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block YELLOW_PANE       = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block LIME_PANE         = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block PINK_PANE         = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block GRAY_PANE         = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block SILVER_PANE       = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block CYAN_PANE         = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block PURPLE_PANE       = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block BLUE_PANE         = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block BROWN_PANE        = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block GREEN_PANE        = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block RED_PANE          = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);
    public static final Block BLACK_PANE        = new HorizontalPaneBlock(HORIZONTAL_PANE_SETTINGS);


}
