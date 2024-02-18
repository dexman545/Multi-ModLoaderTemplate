package me.ayydan.multimodloadertemplate.api.neoforge.mixin;

import me.ayydan.multimodloadertemplate.api.CommonModApiEntryPoint;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class NeoForgeExampleMixin
{
    @Inject(method = "init", at = @At("HEAD"))
    private void init(CallbackInfo ci)
    {
        CommonModApiEntryPoint.LOGGER.info("Hello from the NeoForge Api example mixin!");
    }
}
