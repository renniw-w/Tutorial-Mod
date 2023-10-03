package de.wawuschels.tutorial_mod.registry;

import de.wawuschels.tutorial_mod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item RUBY = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).fireproof().rarity(Rarity.EPIC));
    public static final Item RUBY_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).fireproof().rarity(Rarity.UNCOMMON).maxCount(16));

    public static final Item TREECAPITATOR = new Item(new FabricItemSettings().maxCount(1).fireproof().group(ItemGroup.TOOLS).rarity(Rarity.EPIC).maxDamage(13));

    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).fireproof().rarity(Rarity.EPIC));

    public static void registerItems() {
        //Registrier funktion für alle nachfolgenden Items
        Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, "ruby_ingot"), RUBY_INGOT);
        Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, "treecapitator"), TREECAPITATOR);
        Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
