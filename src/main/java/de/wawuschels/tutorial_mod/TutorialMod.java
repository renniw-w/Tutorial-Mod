package de.wawuschels.tutorial_mod;

import de.wawuschels.tutorial_mod.registry.ModBlocks;
import de.wawuschels.tutorial_mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorial_mod";

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ModItems.registerItems(); //registriert Items
        ModBlocks.registerBlocks(); //registriert Blöcke

    }
}
