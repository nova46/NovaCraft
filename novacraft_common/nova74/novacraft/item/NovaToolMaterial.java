package nova74.novacraft.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class NovaToolMaterial {
        public static EnumToolMaterial Alloy1Material = EnumHelper.addToolMaterial
            ("ALLOY1", 2, 250, 8.0F, 2, 18);
        public static EnumToolMaterial Alloy2Material = EnumHelper.addToolMaterial
            ("ALLOY2", 3, 1250, 11.0F, 3, 22);
      //OBS ADDS 60% USES to iron, 50% to Gold, 50% to alloy1, 20% to Diamond and better
        public static EnumToolMaterial ObsIronMaterial = EnumHelper.addToolMaterial
                ("OBSIRON", 2, 400, 6.0F, 2, 14);
        public static EnumToolMaterial ObsGoldMaterial = EnumHelper.addToolMaterial
                ("OBSGOLD", 0, 48, 12.0F, 0, 22);
        public static EnumToolMaterial ObsDiaMaterial = EnumHelper.addToolMaterial
                ("OBSDIA", 3, 1873, 8.0F, 3, 10);
        public static EnumToolMaterial ObsAlloy1Material = EnumHelper.addToolMaterial
                ("OBSALLOY1", 2, 375, 8.0F, 2, 18);
        public static EnumToolMaterial ObsAlloy2Material = EnumHelper.addToolMaterial
                ("OBSALLOY2", 3, 1500, 11.0F, 3, 22);
        public static EnumToolMaterial ChiselMaterial = EnumHelper.addToolMaterial
                ("CHISELMAT", 0, 32, 0.1F, 0, 0);
}
