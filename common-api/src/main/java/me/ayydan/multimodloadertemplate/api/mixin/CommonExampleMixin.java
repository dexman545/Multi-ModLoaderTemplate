package me.ayydan.multimodloadertemplate.api.mixin;

import me.ayydan.multimodloadertemplate.api.CommonModApiEntryPoint;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class CommonExampleMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        CommonModApiEntryPoint.LOGGER.info("Hello from the Common Api example mixin!");
    }
}