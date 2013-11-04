package nicholls.minecraft.snowman;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnSnowManItem extends Item
{

    public SpawnSnowManItem(int itemId)
    {
        super(itemId);
        
        setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public boolean onItemUse(ItemStack itemStack,
            EntityPlayer player, World world, int blockX, int blockY,
            int blockZ, int par7, float par8, float par9, float par10)
    {
        
        if(world.isRemote)
        {
            return true;
        }
        else
        {
            SnowManEntity snowMan = new SnowManEntity(world);
            snowMan.setPosition((double)blockX, (double)blockY, (double)blockZ);
            
            world.spawnEntityInWorld(snowMan);

            int blockId = world.getBlockId(blockX, blockY, blockZ);
        
            return true;
        }
    }

}
