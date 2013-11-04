package nicholls.minecraft.snowman;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderSnowMan extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation("snowman","models/SnowMan.png");  //refers to:assets/yourmod/models/optionalfile/yourtexture.png

    public RenderSnowMan(ModelBase model, float shadowDistance)
    {
        super(model, shadowDistance);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return texture;
    }

}
