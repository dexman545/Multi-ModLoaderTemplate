package me.ayydan.multimodloadertemplate.api;

public class CommonModEntryPoint
{
    public static final String MOD_ID = "multimodloadertemplate-api";

    public static void init()
    {
        System.out.println(MOD_ID);
        System.out.printf("Config Dir: %s\n", ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
