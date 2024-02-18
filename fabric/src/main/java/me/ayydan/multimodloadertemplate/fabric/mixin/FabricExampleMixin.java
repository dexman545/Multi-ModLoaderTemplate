package me.ayydan.multimodloadertemplate.fabric.mixin;

import me.ayydan.multimodloadertemplate.CommonModEntryPoint;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FabricExampleMixin
{
    @Inject(method = "init", at = @At("HEAD"))
    private void init(CallbackInfo ci)
    {
        CommonModEntryPoint.LOGGER.info("Hello from the Fabric example mixin!");
    }
}
