package the_fireplace.overlord.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.overlord.Overlord;

import javax.annotation.Nonnull;

/**
 * @author The_Fireplace
 */
public class ItemSansMask extends ItemArmor {
	public ItemSansMask(ArmorMaterial materialIn) {
		super(materialIn, -1, EntityEquipmentSlot.HEAD);
		setTranslationKey("sans_mask");
	}

	@Override
	@Nonnull
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Overlord.MODID + ":textures/armor/sans.png";
	}

	@SideOnly(Side.CLIENT)
	@Override
	public CreativeTabs getCreativeTab() {
		return null;
	}
}
