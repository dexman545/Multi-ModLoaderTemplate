package me.ayydan.multimodloadertemplate.api.neoforge;

import me.ayydan.multimodloadertemplate.api.CommonModApiEntryPoint;
import net.neoforged.fml.common.Mod;

@Mod(CommonModApiEntryPoint.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        CommonModApiEntryPoint.init();
    }
}
