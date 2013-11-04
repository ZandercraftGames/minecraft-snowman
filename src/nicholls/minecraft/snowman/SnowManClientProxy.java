package nicholls.minecraft.snowman;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class SnowManClientProxy extends SnowManCommonProxy
{

    public SnowManClientProxy()
    {
    }

    @Override
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(SnowManEntity.class, new RenderSnowMan(new SnowManModel(), 0.5F));
    }
}
