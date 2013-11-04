package nicholls.minecraft.snowman;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class SnowManEntity extends EntityAnimal
{

    public SnowManEntity(World world)
    {
        super(world);
        this.setSize(0.9F, 1.3F);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entityageable)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
