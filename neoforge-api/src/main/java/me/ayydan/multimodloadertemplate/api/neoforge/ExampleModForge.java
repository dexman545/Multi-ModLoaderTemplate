package me.ayydan.multimodloadertemplate.api.neoforge;

import me.ayydan.multimodloadertemplate.api.CommonModEntryPoint;
import net.neoforged.fml.common.Mod;

@Mod(CommonModEntryPoint.MOD_ID)
public class ExampleModForge
{
    public ExampleModForge()
    {
        CommonModEntryPoint.init();
    }
}
