package nova74.novacraft.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class NovaToolMaterial {
        public static EnumToolMaterial Alloy1_Material = EnumHelper.addToolMaterial
            ("ALLOY1", 2, 250, 8.0F, 2, 18);
        public static EnumToolMaterial Alloy2_Material = EnumHelper.addToolMaterial
            ("ALLOY2", 3, 1250, 11.0F, 3, 22);
      //OBS ADDS 250 USES (125 to gold)
        public static EnumToolMaterial Obs_Iron_Material = EnumHelper.addToolMaterial
                ("OBSIRON", 2, 400, 6.0F, 2, 14);
        public static EnumToolMaterial Obs_Gold_Material = EnumHelper.addToolMaterial
                ("OBSGOLD", 0, 157, 12.0F, 0, 22);
        public static EnumToolMaterial Obs_Dia_Material = EnumHelper.addToolMaterial
                ("OBSDIA", 3, 1811, 8.0F, 3, 10);
        public static EnumToolMaterial Obs_Alloy1_Material = EnumHelper.addToolMaterial
                ("OBSALLOY1", 2, 500, 8.0F, 2, 18);
        public static EnumToolMaterial Obs_Alloy2_Material = EnumHelper.addToolMaterial
                ("OBSALLOY2", 3, 1500, 11.0F, 3, 22);
        public static EnumToolMaterial Chisel_Material = EnumHelper.addToolMaterial
                ("CHISELMAT", 0, 32, 0.1F, 0, 0);
}
