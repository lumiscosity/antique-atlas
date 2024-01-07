package folk.sisby.antique_atlas.structure;

import folk.sisby.antique_atlas.AntiqueAtlas;
import net.minecraft.registry.tag.StructureTags;
import net.minecraft.text.Text;

public class Village {
    public static void registerMarkers() {
        if (AntiqueAtlas.CONFIG.autoVillageMarkers) {
            StructureHandler.registerMarker(StructureTags.VILLAGE, AntiqueAtlas.id("village"), Text.translatable("gui.antique_atlas.marker.village"));
        }
    }
}
