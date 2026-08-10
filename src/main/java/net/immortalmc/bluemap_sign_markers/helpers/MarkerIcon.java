package net.immortalmc.bluemap_sign_markers.helpers;

/**
 * Enumeration of available marker icon identifiers. Each constant maps to an image
 * file named {icon}.png inside the BlueMap webroot (under the plugin IMAGE_PATH).
 */
public enum MarkerIcon {
    ancient_city,
    ban_black,
    ban_blue,
    ban_brown,
    ban_cyan,
    ban_gray,
    ban_green,
    ban_light_blue,
    ban_light_gray,
    ban_lime,
    ban_magenta,
    ban_orange,
    ban_pink,
    ban_red,
    ban_white,
    ban_yellow,
    camp,
    desert_temple,
    mansion,
    mineshaft,
    monument,
    ocean_ruins,
    pickaxe,
    portal,
    spawner,
    target_x,
    treasure_x,
    tree,
    trial,
    village_desert,
    village_plains,
    village_savanna,
    village_snow,
    village_taiga,
    witch_hut;

    /**
     * Matches a bracketed token (like "[map]") to the corresponding enum constant.
     * The input is normalized by removing surrounding brackets and lower-casing the content.
     *
     * @param name bracketed token to match (e.g. "[map]")
     * @return the matching {@link MarkerIcon} constant, or if cannot match - defaults to {@link MarkerIcon#map}
     */
    public static MarkerIcon match(String name) {
        MarkerIcon icon = MarkerIcon.ban_white;
        String result = name.replaceAll("^\\[(.*)]$", "$1").toLowerCase();
        try {
            icon = MarkerIcon.valueOf(result);
        } catch (IllegalArgumentException ignored) {
        }
        return icon;

    }

}