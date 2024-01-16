package one.devos.nautical.rainbethunder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class RainBeThunder implements ModInitializer {
    public static final String MOD_ID = "rainbethunder";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        LOGGER.info("[" + MOD_NAME + "] Version " + VERSION + " loaded." );
        LOGGER.info("[" + MOD_NAME + "] " + "You might want to get a bed ready for when it rains :^)");
    }
}
