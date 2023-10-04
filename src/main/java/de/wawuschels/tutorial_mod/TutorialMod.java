package de.wawuschels.tutorial_mod;

import de.wawuschels.tutorial_mod.registry.ModBlocks;
import de.wawuschels.tutorial_mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorial_mod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            //ertsellt eigene Item Group
            new Identifier(MOD_ID, "ruby_item_group"),
            () -> new ItemStack(ModItems.RUBY)
    );
    @Override
    public void onInitialize() {
        ModItems.registerItems(); //registriert Items
        ModBlocks.registerBlocks(); //registriert Blöcke

    }
}
