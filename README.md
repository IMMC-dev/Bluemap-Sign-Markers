
## IMMC BlueMap Sign Markers

This plugin is a fork of [Easy BlueMap Sign Markers](https://github.com/deimiczny/easy-bmapmarkers), which itself is a fork of [BlueMapSignMarkers](https://modrinth.com/plugin/bluemapsignmarkers) 

This fork re-adds support for custom icons uploaded to the `/bluemap/web/markers/` directory, and removes the strict requirement to match the exact icons the plugin provides.

Compatible with Paper. No other software compatibility (e.g. Fabric) is planned or will be accomodated since this is a bespoke fork for the Immortal MC server.


## How to use
Place any sign in the game. Fill the sign as follows:

- **1st line**: `[marker_icon_name]`
- **2nd line:** text
- **3rd line:** text
- **4th line:** text

## Markers Included by Default
These are the names that are available automatically for the markers, plus the corresponding icons. Just use any of the values between brackets - `[` and `]`, e.g. `[portal]` - to place the marker on the **BlueMap**.
It does not matter if you use lowercase or uppercase. The plugin will handle it. If you

| Name             | Icon                                                               |     | Name              | Icon                                                                |
| ---------------- | ------------------------------------------------------------------ | --- | ----------------- | ------------------------------------------------------------------- |
| `ban_black`      | ![ban_black](src/resources/markers/icons/ban_black.png)            |     | `mansion`         | ![mansion](src/resources/markers/icons/mansion.png)                 |
| `ban_blue`       | ![ban_blue](src/resources/markers/icons/ban_blue.png)              |     | `mineshaft`       | ![mineshaft](src/resources/markers/icons/mineshaft.png)             |
| `ban_brown`      | ![ban_brown](src/resources/markers/icons/ban_brown.png)            |     | `monument`        | ![monument](src/resources/markers/icons/monument.png)               |
| `ban_cyan`       | ![ban_cyan](src/resources/markers/icons/ban_cyan.png)              |     | `ocean_ruins`     | ![ocean_ruins](src/resources/markers/icons/ocean_ruins.png)         |
| `ban_gray`       | ![ban_gray](src/resources/markers/icons/ban_gray.png)              |     | `pickaxe`         | ![pickaxe](src/resources/markers/icons/pickaxe.png)                 |
| `ban_green`      | ![ban_green](src/resources/markers/icons/ban_green.png)            |     | `portal`          | ![portal](src/resources/markers/icons/portal.png)                   |
| `ban_light_blue` | ![ban_light_blue](src/resources/markers/icons/ban_light_blue.png)  |     | `spawner`         | ![spawner](src/resources/markers/icons/spawner.png)                 |
| `ban_light_gray` | ![ban_light_gray](src/resources/markers/icons/ban_light_gray.png)  |     | `target_point`    | ![target_point](src/resources/markers/icons/target_point.png)       |
| `ban_lime`       | ![ban_lime](src/resources/markers/icons/ban_lime.png)              |     | `target_x`        | ![target_x](src/resources/markers/icons/target_x.png)               |
| `ban_magenta`    | ![ban_magenta](src/resources/markers/icons/ban_magenta.png)        |     | `treasure_x`      | ![treasure_x](src/resources/markers/icons/treasure_x.png)           |
| `ban_orange`     | ![ban_orange](src/resources/markers/icons/ban_orange.png)          |     | `tree`            | ![tree](src/resources/markers/icons/tree.png)                       |
| `ban_pink`       | ![ban_pink](src/resources/markers/icons/ban_pink.png)              |     | `trial`           | ![trial](src/resources/markers/icons/trial.png)                     |
| `ban_purple`     | ![ban_purple](src/resources/markers/icons/ban_purpl.png)           |     | `village_desert`  | ![village_desert](src/resources/markers/icons/village_desert.png)   |
| `ban_red`        | ![ban_red](src/resources/markers/icons/ban_red.png)                |     | `village_plains`  | ![village_plains](src/resources/markers/icons/village_plains.png)   |
| `ban_white`      | ![ban_white](src/resources/markers/icons/ban_white.png)            |     | `village_savanna` | ![village_savanna](src/resources/markers/icons/village_savanna.png) |
| `ban_yellow`     | ![ban_yellow](src/resources/markers/icons/ban_yellow.png)          |     | `village_snow`    | ![village_snow](src/resources/markers/icons/village_snow.png)       |
| `camp`           | ![camp](src/resources/markers/icons/camp.png)                      |     | `village_taiga`   | ![village_taiga](src/resources/markers/icons/village_taiga.png)     |
| `desert_temple`  | ![desert_temple](src/resources/markers/icons/desert_temple.png)    |     | `witch_hut`       | ![witch_hut](src/resources/markers/icons/witch_hut.png)             | 


Where these images are from the vanilla Minecraft map icons, or the [Map Icons Resource Pack](https://modrinth.com/resourcepack/map-icons).