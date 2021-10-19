package xyz.grantlmul.slimefabric4.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Items;
import xyz.grantlmul.slimefabric4.util.Head;
import xyz.grantlmul.starlib.items.OptionalItem;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;

public class SlimefabricItems {
    private SlimefabricItems() { }
    private static ArrayList<OptionalItem> ITEMS;
    private static Boolean registered;

    /* Items */
    public static final OptionalItem PORTABLE_CRAFTER = new OptionalItem(new FabricItemSettings(), Head.PORTABLE_CRAFTER);
    public static final OptionalItem PORTABLE_DUSTBIN = new OptionalItem(new FabricItemSettings(), Head.TRASH_CAN);
    public static final OptionalItem ENDER_BACKPACK = new OptionalItem(new FabricItemSettings(), Head.ENDER_BACKPACK);
    public static final OptionalItem MAGIC_EYE_OF_ENDER = new OptionalItem(new FabricItemSettings(), Items.ENDER_EYE);
    public static final OptionalItem BROKEN_SPAWNER = new OptionalItem(new FabricItemSettings(), Items.SPAWNER);
    public static final OptionalItem REPAIRED_SPAWNER = new OptionalItem(new FabricItemSettings(), Items.SPAWNER);
    public static final OptionalItem INFERNAL_BONEMEAL = new OptionalItem(new FabricItemSettings(), Items.BONE_MEAL);
    public static final OptionalItem TAPE_MEASURE = new OptionalItem(new FabricItemSettings(), Head.TAPE_MEASURE);

    /* Gadgets */
    public static final OptionalItem GOLD_PAN = new OptionalItem(new FabricItemSettings(), Items.BOWL);
    public static final OptionalItem NETHER_GOLD_PAN = new OptionalItem(new FabricItemSettings(), Items.BOWL);
    public static final OptionalItem PARACHUTE = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem GRAPPLING_HOOK = new OptionalItem(new FabricItemSettings(), Items.LEAD);
    public static final OptionalItem SOLAR_HELMET = new OptionalItem(new FabricItemSettings(), Items.IRON_HELMET);
    public static final OptionalItem CLOTH = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem REINFORCED_CLOTH = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem TIN_CAN = new OptionalItem(new FabricItemSettings(), Head.TIN_CAN);
    public static final OptionalItem NIGHT_VISION_GOGGLES = new OptionalItem(new FabricItemSettings(), Items.LEATHER_HELMET);
    public static final OptionalItem ELYTRA_CAP = new OptionalItem(new FabricItemSettings(), Items.LEATHER_HELMET);
    public static final OptionalItem FARMER_SHOES = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem INFUSED_MAGNET = new OptionalItem(new FabricItemSettings(), Head.MAGNET);
    public static final OptionalItem RAG = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem BANDAGE = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem SPLINT = new OptionalItem(new FabricItemSettings(), Items.STICK);
    public static final OptionalItem VITAMINS = new OptionalItem(new FabricItemSettings(), Items.NETHER_WART);
    public static final OptionalItem MEDICINE = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem MAGICAL_ZOMBIE_PILLS = new OptionalItem(new FabricItemSettings(), Items.NETHER_WART);

    public static final OptionalItem FLASK_OF_KNOWLEDGE = new OptionalItem(new FabricItemSettings(), Items.GLASS_BOTTLE);
    public static final OptionalItem FILLED_FLASK_OF_KNOWLEDGE = new OptionalItem(new FabricItemSettings(), Items.EXPERIENCE_BOTTLE);

    /* Backpacks */
    private static final String BACKPACK_ID = "&7ID: <ID>";
    public static final OptionalItem BACKPACK_SMALL = new OptionalItem(new FabricItemSettings(), Head.BACKPACK);
    public static final OptionalItem BACKPACK_MEDIUM = new OptionalItem(new FabricItemSettings(), Head.BACKPACK);
    public static final OptionalItem BACKPACK_LARGE = new OptionalItem(new FabricItemSettings(), Head.BACKPACK);
    public static final OptionalItem WOVEN_BACKPACK = new OptionalItem(new FabricItemSettings(), Head.BACKPACK);
    public static final OptionalItem GILDED_BACKPACK = new OptionalItem(new FabricItemSettings(), Head.BACKPACK);
    public static final OptionalItem RADIANT_BACKPACK = new OptionalItem(new FabricItemSettings(), Head.BACKPACK);
    public static final OptionalItem BOUND_BACKPACK = new OptionalItem(new FabricItemSettings(), Head.ENDER_BACKPACK);
    public static final OptionalItem COOLER = new OptionalItem(new FabricItemSettings(), Head.COOLER);
    public static final OptionalItem RESTORED_BACKPACK = new OptionalItem(new FabricItemSettings(), Head.RESTORED_BACKPACK);

    /* Jetpacks */
    public static final OptionalItem DURALUMIN_JETPACK = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem SOLDER_JETPACK = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem BILLON_JETPACK = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem STEEL_JETPACK = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem DAMASCUS_STEEL_JETPACK = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem REINFORCED_ALLOY_JETPACK = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem CARBONADO_JETPACK = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem ARMORED_JETPACK = new OptionalItem(new FabricItemSettings(), Items.IRON_CHESTPLATE);

    /* Jetboots */
    public static final OptionalItem DURALUMIN_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem SOLDER_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem BILLON_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem STEEL_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem DAMASCUS_STEEL_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem REINFORCED_ALLOY_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem CARBONADO_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);
    public static final OptionalItem ARMORED_JETBOOTS = new OptionalItem(new FabricItemSettings(), Items.IRON_BOOTS);

    /* Multi Tools */
    private static final String MULTI_TOOL_LORE = "&eCrouch & Right Click&7 to switch modes";
    public static final OptionalItem DURALUMIN_MULTI_TOOL = new OptionalItem(new FabricItemSettings(), Items.SHEARS);
    public static final OptionalItem SOLDER_MULTI_TOOL = new OptionalItem(new FabricItemSettings(), Items.SHEARS);
    public static final OptionalItem BILLON_MULTI_TOOL = new OptionalItem(new FabricItemSettings(), Items.SHEARS);
    public static final OptionalItem STEEL_MULTI_TOOL = new OptionalItem(new FabricItemSettings(), Items.SHEARS);
    public static final OptionalItem DAMASCUS_STEEL_MULTI_TOOL = new OptionalItem(new FabricItemSettings(), Items.SHEARS);
    public static final OptionalItem REINFORCED_ALLOY_MULTI_TOOL = new OptionalItem(new FabricItemSettings(), Items.SHEARS);
    public static final OptionalItem CARBONADO_MULTI_TOOL = new OptionalItem(new FabricItemSettings(), Items.SHEARS);

    /* Food */
    public static final OptionalItem FORTUNE_COOKIE = new OptionalItem(new FabricItemSettings(), Items.COOKIE);
    public static final OptionalItem DIET_COOKIE = new OptionalItem(new FabricItemSettings(), Items.COOKIE);
    public static final OptionalItem MAGIC_SUGAR = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem MONSTER_JERKY = new OptionalItem(new FabricItemSettings(), Items.ROTTEN_FLESH);
    public static final OptionalItem APPLE_JUICE = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem MELON_JUICE = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem CARROT_JUICE = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem PUMPKIN_JUICE = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem SWEET_BERRY_JUICE = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem GOLDEN_APPLE_JUICE = new OptionalItem(new FabricItemSettings(), Items.POTION);

    public static final OptionalItem BEEF_JERKY = new OptionalItem(new FabricItemSettings(), Items.COOKED_BEEF);
    public static final OptionalItem PORK_JERKY = new OptionalItem(new FabricItemSettings(), Items.COOKED_PORKCHOP);
    public static final OptionalItem CHICKEN_JERKY = new OptionalItem(new FabricItemSettings(), Items.COOKED_CHICKEN);
    public static final OptionalItem MUTTON_JERKY = new OptionalItem(new FabricItemSettings(), Items.COOKED_MUTTON);
    public static final OptionalItem RABBIT_JERKY = new OptionalItem(new FabricItemSettings(), Items.COOKED_RABBIT);
    public static final OptionalItem FISH_JERKY = new OptionalItem(new FabricItemSettings(), Items.COOKED_COD);

    public static final OptionalItem KELP_COOKIE = new OptionalItem(new FabricItemSettings(), Items.COOKIE);

    /* Christmas */
    public static final OptionalItem CHRISTMAS_MILK = new OptionalItem(new FabricItemSettings(), Items.MILK_BUCKET);
    public static final OptionalItem CHRISTMAS_CHOCOLATE_MILK = new OptionalItem(new FabricItemSettings(), Items.MILK_BUCKET);
    public static final OptionalItem CHRISTMAS_EGG_NOG = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem CHRISTMAS_APPLE_CIDER = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem CHRISTMAS_COOKIE = new OptionalItem(new FabricItemSettings(), Items.COOKIE);
    public static final OptionalItem CHRISTMAS_FRUIT_CAKE = new OptionalItem(new FabricItemSettings(), Items.PUMPKIN_PIE);
    public static final OptionalItem CHRISTMAS_APPLE_PIE = new OptionalItem(new FabricItemSettings(), Items.PUMPKIN_PIE);
    public static final OptionalItem CHRISTMAS_HOT_CHOCOLATE = new OptionalItem(new FabricItemSettings(), Items.POTION);
    public static final OptionalItem CHRISTMAS_CAKE = new OptionalItem(new FabricItemSettings(), Items.PUMPKIN_PIE);
    public static final OptionalItem CHRISTMAS_CARAMEL = new OptionalItem(new FabricItemSettings(), Items.BRICK);
    public static final OptionalItem CHRISTMAS_CARAMEL_APPLE = new OptionalItem(new FabricItemSettings(), Items.APPLE);
    public static final OptionalItem CHRISTMAS_CHOCOLATE_APPLE = new OptionalItem(new FabricItemSettings(), Items.APPLE);
    public static final OptionalItem CHRISTMAS_PRESENT = new OptionalItem(new FabricItemSettings(), Head.CHRISTMAS_PRESENT);

    /* Easter */
    public static final OptionalItem EASTER_EGG = new OptionalItem(new FabricItemSettings(), Head.EASTER_EGG);
    public static final OptionalItem EASTER_CARROT_PIE = new OptionalItem(new FabricItemSettings(), Items.PUMPKIN_PIE);
    public static final OptionalItem EASTER_APPLE_PIE = new OptionalItem(new FabricItemSettings(), Items.PUMPKIN_PIE);

    /* Weapons */
    public static final OptionalItem GRANDMAS_WALKING_STICK = new OptionalItem(new FabricItemSettings(), Items.STICK);
    public static final OptionalItem GRANDPAS_WALKING_STICK = new OptionalItem(new FabricItemSettings(), Items.STICK);
    public static final OptionalItem SWORD_OF_BEHEADING = new OptionalItem(new FabricItemSettings(), Items.IRON_SWORD);
    public static final OptionalItem BLADE_OF_VAMPIRES = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_SWORD);
    public static final OptionalItem SEISMIC_AXE = new OptionalItem(new FabricItemSettings(), Items.IRON_AXE);

    /* Bows */
    public static final OptionalItem EXPLOSIVE_BOW = new OptionalItem(new FabricItemSettings(), Items.BOW);
    public static final OptionalItem ICY_BOW = new OptionalItem(new FabricItemSettings(), Items.BOW);

    /* Tools */
    public static final OptionalItem SMELTERS_PICKAXE = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_PICKAXE);
    public static final OptionalItem LUMBER_AXE = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_AXE);
    public static final OptionalItem PICKAXE_OF_CONTAINMENT = new OptionalItem(new FabricItemSettings(), Items.IRON_PICKAXE);
    public static final OptionalItem HERCULES_PICKAXE = new OptionalItem(new FabricItemSettings(), Items.IRON_PICKAXE);
    public static final OptionalItem EXPLOSIVE_PICKAXE = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_PICKAXE);
    public static final OptionalItem EXPLOSIVE_SHOVEL = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_SHOVEL);
    public static final OptionalItem PICKAXE_OF_THE_SEEKER = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_PICKAXE);
    public static final OptionalItem COBALT_PICKAXE = new OptionalItem(new FabricItemSettings(), Items.IRON_PICKAXE);
    public static final OptionalItem PICKAXE_OF_VEIN_MINING = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_PICKAXE);
    public static final OptionalItem CLIMBING_PICK = new OptionalItem(new FabricItemSettings(), Items.IRON_PICKAXE);

    /* Armor */
    public static final OptionalItem GLOWSTONE_HELMET = new OptionalItem(new FabricItemSettings(), Items.LEATHER_HELMET);
    public static final OptionalItem GLOWSTONE_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem GLOWSTONE_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_LEGGINGS);
    public static final OptionalItem GLOWSTONE_BOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);

    public static final OptionalItem ENDER_HELMET = new OptionalItem(new FabricItemSettings(), Items.LEATHER_HELMET);
    public static final OptionalItem ENDER_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem ENDER_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_LEGGINGS);
    public static final OptionalItem ENDER_BOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);

    public static final OptionalItem SLIME_HELMET = new OptionalItem(new FabricItemSettings(), Items.LEATHER_HELMET);
    public static final OptionalItem SLIME_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem SLIME_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_LEGGINGS);
    public static final OptionalItem SLIME_BOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);

    public static final OptionalItem CACTUS_HELMET = new OptionalItem(new FabricItemSettings(), Items.LEATHER_HELMET);
    public static final OptionalItem CACTUS_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem CACTUS_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_LEGGINGS);
    public static final OptionalItem CACTUS_BOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);

    public static final OptionalItem DAMASCUS_STEEL_HELMET = new OptionalItem(new FabricItemSettings(), Items.IRON_HELMET);
    public static final OptionalItem DAMASCUS_STEEL_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.IRON_CHESTPLATE);
    public static final OptionalItem DAMASCUS_STEEL_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.IRON_LEGGINGS);
    public static final OptionalItem DAMASCUS_STEEL_BOOTS = new OptionalItem(new FabricItemSettings(), Items.IRON_BOOTS);

    public static final OptionalItem REINFORCED_ALLOY_HELMET = new OptionalItem(new FabricItemSettings(), Items.IRON_HELMET);
    public static final OptionalItem REINFORCED_ALLOY_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.IRON_CHESTPLATE);
    public static final OptionalItem REINFORCED_ALLOY_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.IRON_LEGGINGS);
    public static final OptionalItem REINFORCED_ALLOY_BOOTS = new OptionalItem(new FabricItemSettings(), Items.IRON_BOOTS);

    public static final OptionalItem SCUBA_HELMET = new OptionalItem(new FabricItemSettings(), Items.LEATHER_HELMET);
    public static final OptionalItem HAZMAT_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.LEATHER_CHESTPLATE);
    public static final OptionalItem HAZMAT_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_LEGGINGS);
    public static final OptionalItem HAZMAT_BOOTS = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);

    public static final OptionalItem GILDED_IRON_HELMET = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_HELMET);
    public static final OptionalItem GILDED_IRON_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_CHESTPLATE);
    public static final OptionalItem GILDED_IRON_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_LEGGINGS);
    public static final OptionalItem GILDED_IRON_BOOTS = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_BOOTS);

    public static final OptionalItem GOLDEN_HELMET_12K = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_HELMET);
    public static final OptionalItem GOLDEN_CHESTPLATE_12K = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_CHESTPLATE);
    public static final OptionalItem GOLDEN_LEGGINGS_12K = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_LEGGINGS);
    public static final OptionalItem GOLDEN_BOOTS_12K = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_BOOTS);

    public static final OptionalItem SLIME_HELMET_STEEL = new OptionalItem(new FabricItemSettings(), Items.IRON_HELMET);
    public static final OptionalItem SLIME_CHESTPLATE_STEEL = new OptionalItem(new FabricItemSettings(), Items.IRON_CHESTPLATE);
    public static final OptionalItem SLIME_LEGGINGS_STEEL = new OptionalItem(new FabricItemSettings(), Items.IRON_LEGGINGS);
    public static final OptionalItem SLIME_BOOTS_STEEL = new OptionalItem(new FabricItemSettings(), Items.IRON_BOOTS);

    public static final OptionalItem BOOTS_OF_THE_STOMPER = new OptionalItem(new FabricItemSettings(), Items.LEATHER_BOOTS);

    public static final OptionalItem BEE_HELMET = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_HELMET);
    public static final OptionalItem BEE_WINGS = new OptionalItem(new FabricItemSettings(), Items.ELYTRA);
    public static final OptionalItem BEE_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_LEGGINGS);
    public static final OptionalItem BEE_BOOTS = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_BOOTS);

    /* Magical components */
    public static final OptionalItem MAGIC_LUMP_1 = new OptionalItem(new FabricItemSettings(), Items.GOLD_NUGGET);
    public static final OptionalItem MAGIC_LUMP_2 = new OptionalItem(new FabricItemSettings(), Items.GOLD_NUGGET);
    public static final OptionalItem MAGIC_LUMP_3 = new OptionalItem(new FabricItemSettings(), Items.GOLD_NUGGET);
    public static final OptionalItem ENDER_LUMP_1 = new OptionalItem(new FabricItemSettings(), Items.GOLD_NUGGET);
    public static final OptionalItem ENDER_LUMP_2 = new OptionalItem(new FabricItemSettings(), Items.GOLD_NUGGET);
    public static final OptionalItem ENDER_LUMP_3 = new OptionalItem(new FabricItemSettings(), Items.GOLD_NUGGET);
    public static final OptionalItem MAGICAL_BOOK_COVER = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem MAGICAL_GLASS = new OptionalItem(new FabricItemSettings(), Items.GLASS_PANE);
    public static final OptionalItem SYNTHETIC_SHULKER_SHELL = new OptionalItem(new FabricItemSettings(), Items.SHULKER_SHELL);

    /* Technical components */
    public static final OptionalItem BASIC_CIRCUIT_BOARD = new OptionalItem(new FabricItemSettings(), Items.ACTIVATOR_RAIL);
    public static final OptionalItem ADVANCED_CIRCUIT_BOARD = new OptionalItem(new FabricItemSettings(), Items.POWERED_RAIL);
    public static final OptionalItem WHEAT_FLOUR = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem STEEL_PLATE = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem BATTERY = new OptionalItem(new FabricItemSettings(), Head.BATTERY);
    public static final OptionalItem CARBON = new OptionalItem(new FabricItemSettings(), Head.CARBON);
    public static final OptionalItem COMPRESSED_CARBON = new OptionalItem(new FabricItemSettings(), Head.COMPRESSED_CARBON);
    public static final OptionalItem CARBON_CHUNK = new OptionalItem(new FabricItemSettings(), Head.COMPRESSED_CARBON);
    public static final OptionalItem STEEL_THRUSTER = new OptionalItem(new FabricItemSettings(), Items.BUCKET);
    public static final OptionalItem POWER_CRYSTAL = new OptionalItem(new FabricItemSettings(), Head.POWER_CRYSTAL);
    public static final OptionalItem CHAIN = new OptionalItem(new FabricItemSettings(), Items.STRING);
    public static final OptionalItem HOOK = new OptionalItem(new FabricItemSettings(), Items.FLINT);
    public static final OptionalItem SIFTED_ORE = new OptionalItem(new FabricItemSettings(), Items.GUNPOWDER);
    public static final OptionalItem STONE_CHUNK = new OptionalItem(new FabricItemSettings(), Head.STONE_CHUNK);
    public static final OptionalItem LAVA_CRYSTAL = new OptionalItem(new FabricItemSettings(), Head.LAVA_CRYSTAL);
    public static final OptionalItem SALT = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem CHEESE = new OptionalItem(new FabricItemSettings(), Head.CHEESE);
    public static final OptionalItem BUTTER = new OptionalItem(new FabricItemSettings(), Head.BUTTER);
    public static final OptionalItem DUCT_TAPE = new OptionalItem(new FabricItemSettings(), Head.DUCT_TAPE);
    public static final OptionalItem HEAVY_CREAM = new OptionalItem(new FabricItemSettings(), Items.SNOWBALL);
    public static final OptionalItem CRUSHED_ORE = new OptionalItem(new FabricItemSettings(), Items.GUNPOWDER);
    public static final OptionalItem PULVERIZED_ORE = new OptionalItem(new FabricItemSettings(), Items.GUNPOWDER);
    public static final OptionalItem PURE_ORE_CLUSTER = new OptionalItem(new FabricItemSettings(), Items.GUNPOWDER);
    public static final OptionalItem SMALL_URANIUM = new OptionalItem(new FabricItemSettings(), Head.URANIUM);
    public static final OptionalItem TINY_URANIUM = new OptionalItem(new FabricItemSettings(), Head.URANIUM);
    public static final OptionalItem SOLAR_PANEL = new OptionalItem(new FabricItemSettings(), Items.DAYLIGHT_DETECTOR);
    public static final OptionalItem PLASTIC_SHEET = new OptionalItem(new FabricItemSettings(), Items.PAPER);

    public static final OptionalItem MAGNET = new OptionalItem(new FabricItemSettings(), Head.MAGNET);
    public static final OptionalItem NECROTIC_SKULL = new OptionalItem(new FabricItemSettings(), Head.NECROTIC_SKULL);
    public static final OptionalItem ESSENCE_OF_AFTERLIFE = new OptionalItem(new FabricItemSettings(), Items.GUNPOWDER);
    public static final OptionalItem STRANGE_NETHER_GOO = new OptionalItem(new FabricItemSettings(), Items.PURPLE_DYE);
    public static final OptionalItem ELECTRO_MAGNET = new OptionalItem(new FabricItemSettings(), Head.MAGNET);
    public static final OptionalItem HEATING_COIL = new OptionalItem(new FabricItemSettings(), Head.HEATING_COIL);
    public static final OptionalItem COOLING_UNIT = new OptionalItem(new FabricItemSettings(), Head.COOLING_UNIT);
    public static final OptionalItem ELECTRIC_MOTOR = new OptionalItem(new FabricItemSettings(), Head.MOTOR);
    public static final OptionalItem CARGO_MOTOR = new OptionalItem(new FabricItemSettings(), Head.CARGO_MOTOR);
    public static final OptionalItem SCROLL_OF_DIMENSIONAL_TELEPOSITION = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem TOME_OF_KNOWLEDGE_SHARING = new OptionalItem(new FabricItemSettings(), Items.ENCHANTED_BOOK);
    public static final OptionalItem HARDENED_GLASS = new OptionalItem(new FabricItemSettings(), Items.LIGHT_GRAY_STAINED_GLASS);
    public static final OptionalItem WITHER_PROOF_OBSIDIAN = new OptionalItem(new FabricItemSettings(), Items.OBSIDIAN);
    public static final OptionalItem WITHER_PROOF_GLASS = new OptionalItem(new FabricItemSettings(), Items.PURPLE_STAINED_GLASS);
    public static final OptionalItem REINFORCED_PLATE = new OptionalItem(new FabricItemSettings(), Items.PAPER);
    public static final OptionalItem ANCIENT_PEDESTAL = new OptionalItem(new FabricItemSettings(), Items.DISPENSER);
    public static final OptionalItem ANCIENT_ALTAR = new OptionalItem(new FabricItemSettings(), Items.ENCHANTING_TABLE);
    public static final OptionalItem COPPER_WIRE = new OptionalItem(new FabricItemSettings(), Items.STRING);
    public static final OptionalItem CRAFTING_MOTOR = new OptionalItem(new FabricItemSettings(), Head.CRAFTING_MOTOR);

    /* Rainbow blocks */
    private static final String RAINBOW = "&dCycles through all Colors of the Rainbow!";
    public static final OptionalItem RAINBOW_WOOL = new OptionalItem(new FabricItemSettings(), Items.WHITE_WOOL);
    public static final OptionalItem RAINBOW_GLASS = new OptionalItem(new FabricItemSettings(), Items.WHITE_STAINED_GLASS);
    public static final OptionalItem RAINBOW_CLAY = new OptionalItem(new FabricItemSettings(), Items.WHITE_TERRACOTTA);
    public static final OptionalItem RAINBOW_GLASS_PANE = new OptionalItem(new FabricItemSettings(), Items.WHITE_STAINED_GLASS_PANE);
    public static final OptionalItem RAINBOW_CONCRETE = new OptionalItem(new FabricItemSettings(), Items.WHITE_CONCRETE);
    public static final OptionalItem RAINBOW_GLAZED_TERRACOTTA = new OptionalItem(new FabricItemSettings(), Items.WHITE_GLAZED_TERRACOTTA);

    /* Seasonal */
    public static final OptionalItem RAINBOW_WOOL_XMAS = new OptionalItem(new FabricItemSettings(), Items.WHITE_WOOL);
    public static final OptionalItem RAINBOW_GLASS_XMAS = new OptionalItem(new FabricItemSettings(), Items.WHITE_STAINED_GLASS);
    public static final OptionalItem RAINBOW_CLAY_XMAS = new OptionalItem(new FabricItemSettings(), Items.WHITE_TERRACOTTA);
    public static final OptionalItem RAINBOW_GLASS_PANE_XMAS = new OptionalItem(new FabricItemSettings(), Items.WHITE_STAINED_GLASS_PANE);
    public static final OptionalItem RAINBOW_CONCRETE_XMAS = new OptionalItem(new FabricItemSettings(), Items.WHITE_CONCRETE);
    public static final OptionalItem RAINBOW_GLAZED_TERRACOTTA_XMAS = new OptionalItem(new FabricItemSettings(), Items.WHITE_GLAZED_TERRACOTTA);

    private static final String VALENTINES_DAY = "&5[&dValentine's Day Edition&5]";
    public static final OptionalItem RAINBOW_WOOL_VALENTINE = new OptionalItem(new FabricItemSettings(), Items.PINK_WOOL);
    public static final OptionalItem RAINBOW_GLASS_VALENTINE = new OptionalItem(new FabricItemSettings(), Items.PINK_STAINED_GLASS);
    public static final OptionalItem RAINBOW_CLAY_VALENTINE = new OptionalItem(new FabricItemSettings(), Items.PINK_TERRACOTTA);
    public static final OptionalItem RAINBOW_GLASS_PANE_VALENTINE = new OptionalItem(new FabricItemSettings(), Items.PINK_STAINED_GLASS_PANE);
    public static final OptionalItem RAINBOW_CONCRETE_VALENTINE = new OptionalItem(new FabricItemSettings(), Items.PINK_CONCRETE);
    public static final OptionalItem RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new OptionalItem(new FabricItemSettings(), Items.PINK_GLAZED_TERRACOTTA);

    private static final String HALLOWEEN = "&c[&6Halloween Edition&c]";
    public static final OptionalItem RAINBOW_WOOL_HALLOWEEN = new OptionalItem(new FabricItemSettings(), Items.ORANGE_WOOL);
    public static final OptionalItem RAINBOW_GLASS_HALLOWEEN = new OptionalItem(new FabricItemSettings(), Items.ORANGE_STAINED_GLASS);
    public static final OptionalItem RAINBOW_CLAY_HALLOWEEN = new OptionalItem(new FabricItemSettings(), Items.ORANGE_TERRACOTTA);
    public static final OptionalItem RAINBOW_GLASS_PANE_HALLOWEEN = new OptionalItem(new FabricItemSettings(), Items.ORANGE_STAINED_GLASS_PANE);
    public static final OptionalItem RAINBOW_CONCRETE_HALLOWEEN = new OptionalItem(new FabricItemSettings(), Items.ORANGE_CONCRETE);
    public static final OptionalItem RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new OptionalItem(new FabricItemSettings(), Items.ORANGE_GLAZED_TERRACOTTA);

    /* Ingots */
    public static final OptionalItem COPPER_INGOT = new OptionalItem(new FabricItemSettings(), Items.BRICK);
    public static final OptionalItem TIN_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    public static final OptionalItem SILVER_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    public static final OptionalItem ALUMINUM_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    public static final OptionalItem LEAD_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    public static final OptionalItem ZINC_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    public static final OptionalItem MAGNESIUM_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);

    /* Alloy (Carbon + Iron) */
    public static final OptionalItem STEEL_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Copper + Tin) */
    public static final OptionalItem BRONZE_INGOT = new OptionalItem(new FabricItemSettings(), Items.BRICK);
    /* Alloy (Copper + Aluminum) */
    public static final OptionalItem DURALUMIN_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Copper + Silver) */
    public static final OptionalItem BILLON_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Copper + Zinc) */
    public static final OptionalItem BRASS_INGOT = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    /* Alloy (Aluminum + Brass) */
    public static final OptionalItem ALUMINUM_BRASS_INGOT = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    /* Alloy (Aluminum + Bronze) */
    public static final OptionalItem ALUMINUM_BRONZE_INGOT = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    /* Alloy (Gold + Silver + Copper) */
    public static final OptionalItem CORINTHIAN_BRONZE_INGOT = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    /* Alloy (Lead + Tin) */
    public static final OptionalItem SOLDER_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Steel + Iron + Carbon) */
    public static final OptionalItem DAMASCUS_STEEL_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze) */
    public static final OptionalItem HARDENED_METAL_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel) */
    public static final OptionalItem REINFORCED_ALLOY_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Iron + Silicon) */
    public static final OptionalItem FERROSILICON = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Iron + Gold) */
    public static final OptionalItem GILDED_IRON = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    /* Alloy (Redston + Ferrosilicon) */
    public static final OptionalItem REDSTONE_ALLOY = new OptionalItem(new FabricItemSettings(), Items.BRICK);
    /* Alloy (Iron + Copper) */
    public static final OptionalItem NICKEL_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);
    /* Alloy (Nickel + Iron + Copper) */
    public static final OptionalItem COBALT_INGOT = new OptionalItem(new FabricItemSettings(), Items.IRON_INGOT);

    /* Gold */
    public static final OptionalItem GOLD_4K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_6K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_8K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_10K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_12K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_14K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_16K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_18K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_20K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_22K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem GOLD_24K = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);

    /* Dusts */
    public static final OptionalItem IRON_DUST = new OptionalItem(new FabricItemSettings(), Items.GUNPOWDER);
    public static final OptionalItem GOLD_DUST = new OptionalItem(new FabricItemSettings(), Items.GLOWSTONE_DUST);
    public static final OptionalItem TIN_DUST = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem COPPER_DUST = new OptionalItem(new FabricItemSettings(), Items.GLOWSTONE_DUST);
    public static final OptionalItem SILVER_DUST = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem ALUMINUM_DUST = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem LEAD_DUST = new OptionalItem(new FabricItemSettings(), Items.GUNPOWDER);
    public static final OptionalItem ZINC_DUST = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem MAGNESIUM_DUST = new OptionalItem(new FabricItemSettings(), Items.SUGAR);

    public static final OptionalItem SULFATE = new OptionalItem(new FabricItemSettings(), Items.GLOWSTONE_DUST);
    public static final OptionalItem SILICON = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem GOLD_24K_BLOCK = new OptionalItem(new FabricItemSettings(), Items.GOLD_BLOCK);

    /* Gems */
    public static final OptionalItem SYNTHETIC_DIAMOND = new OptionalItem(new FabricItemSettings(), Items.DIAMOND);
    public static final OptionalItem SYNTHETIC_EMERALD = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem SYNTHETIC_SAPPHIRE = new OptionalItem(new FabricItemSettings(), Head.SAPPHIRE);
    public static final OptionalItem CARBONADO = new OptionalItem(new FabricItemSettings(), Head.CARBONADO);
    public static final OptionalItem RAW_CARBONADO = new OptionalItem(new FabricItemSettings(), Head.RAW_CARBONADO);

    public static final OptionalItem URANIUM = new OptionalItem(new FabricItemSettings(), Head.URANIUM);
    public static final OptionalItem NEPTUNIUM = new OptionalItem(new FabricItemSettings(), Head.NEPTUNIUM);
    public static final OptionalItem PLUTONIUM = new OptionalItem(new FabricItemSettings(), Head.PLUTONIUM);
    public static final OptionalItem BOOSTED_URANIUM = new OptionalItem(new FabricItemSettings(), Head.BOOSTED_URANIUM);

    /* Talisman */
    public static final OptionalItem COMMON_TALISMAN = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem ENDER_TALISMAN = new OptionalItem(new FabricItemSettings(), Items.EMERALD);

    public static final OptionalItem TALISMAN_ANVIL = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_MINER = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_HUNTER = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_LAVA = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_WATER = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_ANGEL = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_FIRE = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_MAGICIAN = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_TRAVELLER = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_WARRIOR = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_KNIGHT = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_WHIRLWIND = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_WIZARD = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_CAVEMAN = new OptionalItem(new FabricItemSettings(), Items.EMERALD);
    public static final OptionalItem TALISMAN_WISE = new OptionalItem(new FabricItemSettings(), Items.EMERALD);

    /* Staves */
    public static final OptionalItem STAFF_ELEMENTAL = new OptionalItem(new FabricItemSettings(), Items.STICK);
    public static final OptionalItem STAFF_WIND = new OptionalItem(new FabricItemSettings(), Items.STICK);
    public static final OptionalItem STAFF_FIRE = new OptionalItem(new FabricItemSettings(), Items.STICK);
    public static final OptionalItem STAFF_WATER = new OptionalItem(new FabricItemSettings(), Items.STICK);
    public static final OptionalItem STAFF_STORM = new OptionalItem(new FabricItemSettings(), Items.STICK);

    /* Multiblocks */
    public static final OptionalItem ENHANCED_CRAFTING_TABLE = new OptionalItem(new FabricItemSettings(), Items.CRAFTING_TABLE);
    public static final OptionalItem GRIND_STONE = new OptionalItem(new FabricItemSettings(), Items.DISPENSER);
    public static final OptionalItem ARMOR_FORGE = new OptionalItem(new FabricItemSettings(), Items.ANVIL);
    public static final OptionalItem MAKESHIFT_SMELTERY = new OptionalItem(new FabricItemSettings(), Items.BLAST_FURNACE);
    public static final OptionalItem SMELTERY = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ORE_CRUSHER = new OptionalItem(new FabricItemSettings(), Items.DISPENSER);
    public static final OptionalItem COMPRESSOR = new OptionalItem(new FabricItemSettings(), Items.PISTON);
    public static final OptionalItem PRESSURE_CHAMBER = new OptionalItem(new FabricItemSettings(), Items.GLASS);
    public static final OptionalItem MAGIC_WORKBENCH = new OptionalItem(new FabricItemSettings(), Items.CRAFTING_TABLE);
    public static final OptionalItem ORE_WASHER = new OptionalItem(new FabricItemSettings(), Items.CAULDRON);
    public static final OptionalItem TABLE_SAW = new OptionalItem(new FabricItemSettings(), Items.STONECUTTER);
    public static final OptionalItem JUICER = new OptionalItem(new FabricItemSettings(), Items.GLASS_BOTTLE);
    public static final OptionalItem AUTOMATED_PANNING_MACHINE = new OptionalItem(new FabricItemSettings(), Items.BOWL);

    public static final OptionalItem INDUSTRIAL_MINER = new OptionalItem(new FabricItemSettings(), Items.GOLDEN_PICKAXE);
    public static final OptionalItem ADVANCED_INDUSTRIAL_MINER = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_PICKAXE);

    /* Machines */
    public static final OptionalItem COMPOSTER = new OptionalItem(new FabricItemSettings(), Items.CAULDRON);
    public static final OptionalItem CRUCIBLE = new OptionalItem(new FabricItemSettings(), Items.CAULDRON);
    public static final OptionalItem OUTPUT_CHEST = new OptionalItem(new FabricItemSettings(), Items.CHEST);
    public static final OptionalItem IGNITION_CHAMBER = new OptionalItem(new FabricItemSettings(), Items.DROPPER);
    public static final OptionalItem HOLOGRAM_PROJECTOR = new OptionalItem(new FabricItemSettings(), Items.QUARTZ_SLAB);
    public static final OptionalItem BLOCK_PLACER = new OptionalItem(new FabricItemSettings(), Items.DISPENSER);

    /* Enhanced Furnaces */
    public static final OptionalItem ENHANCED_FURNACE = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_2 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_3 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_4 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_5 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_6 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_7 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_8 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_9 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_10 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ENHANCED_FURNACE_11 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem REINFORCED_FURNACE = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem CARBONADO_EDGED_FURNACE = new OptionalItem(new FabricItemSettings(), Items.FURNACE);

    /* Soulbound Items */
    public static final OptionalItem SOULBOUND_SWORD = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_SWORD);
    public static final OptionalItem SOULBOUND_BOW = new OptionalItem(new FabricItemSettings(), Items.BOW);
    public static final OptionalItem SOULBOUND_PICKAXE = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_PICKAXE);
    public static final OptionalItem SOULBOUND_AXE = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_AXE);
    public static final OptionalItem SOULBOUND_SHOVEL = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_SHOVEL);
    public static final OptionalItem SOULBOUND_HOE = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_HOE);
    public static final OptionalItem SOULBOUND_TRIDENT = new OptionalItem(new FabricItemSettings(), Items.TRIDENT);

    public static final OptionalItem SOULBOUND_HELMET = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_HELMET);
    public static final OptionalItem SOULBOUND_CHESTPLATE = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_CHESTPLATE);
    public static final OptionalItem SOULBOUND_LEGGINGS = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_LEGGINGS);
    public static final OptionalItem SOULBOUND_BOOTS = new OptionalItem(new FabricItemSettings(), Items.DIAMOND_BOOTS);

    /* Runes */
    public static final OptionalItem BLANK_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);

    public static final OptionalItem AIR_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem WATER_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem FIRE_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem EARTH_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem ENDER_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);

    public static final OptionalItem RAINBOW_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem LIGHTNING_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem SOULBOUND_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem ENCHANTMENT_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);
    public static final OptionalItem VILLAGER_RUNE = new OptionalItem(new FabricItemSettings(), Items.FIREWORK_STAR);

    /* Electricity */
    public static final OptionalItem SOLAR_GENERATOR = new OptionalItem(new FabricItemSettings(), Items.DAYLIGHT_DETECTOR);
    public static final OptionalItem SOLAR_GENERATOR_2 = new OptionalItem(new FabricItemSettings(), Items.DAYLIGHT_DETECTOR);
    public static final OptionalItem SOLAR_GENERATOR_3 = new OptionalItem(new FabricItemSettings(), Items.DAYLIGHT_DETECTOR);
    public static final OptionalItem SOLAR_GENERATOR_4 = new OptionalItem(new FabricItemSettings(), Items.DAYLIGHT_DETECTOR);

    public static final OptionalItem COAL_GENERATOR = new OptionalItem(new FabricItemSettings(), Head.GENERATOR);
    public static final OptionalItem COAL_GENERATOR_2 = new OptionalItem(new FabricItemSettings(), Head.GENERATOR);

    public static final OptionalItem LAVA_GENERATOR = new OptionalItem(new FabricItemSettings(), Head.GENERATOR);
    public static final OptionalItem LAVA_GENERATOR_2 = new OptionalItem(new FabricItemSettings(), Head.GENERATOR);

    public static final OptionalItem ELECTRIC_FURNACE = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ELECTRIC_FURNACE_2 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ELECTRIC_FURNACE_3 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);

    public static final OptionalItem ELECTRIC_ORE_GRINDER = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ELECTRIC_ORE_GRINDER_2 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ELECTRIC_ORE_GRINDER_3 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ELECTRIC_INGOT_PULVERIZER = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem AUTO_DRIER = new OptionalItem(new FabricItemSettings(), Items.SMOKER);
    public static final OptionalItem AUTO_ENCHANTER = new OptionalItem(new FabricItemSettings(), Items.ENCHANTING_TABLE);
    public static final OptionalItem AUTO_ENCHANTER_2 = new OptionalItem(new FabricItemSettings(), Items.ENCHANTING_TABLE);
    public static final OptionalItem AUTO_DISENCHANTER = new OptionalItem(new FabricItemSettings(), Items.ENCHANTING_TABLE);
    public static final OptionalItem AUTO_DISENCHANTER_2 = new OptionalItem(new FabricItemSettings(), Items.ENCHANTING_TABLE);
    public static final OptionalItem AUTO_ANVIL = new OptionalItem(new FabricItemSettings(), Items.IRON_BLOCK);
    public static final OptionalItem AUTO_ANVIL_2 = new OptionalItem(new FabricItemSettings(), Items.IRON_BLOCK);
    public static final OptionalItem AUTO_BREWER = new OptionalItem(new FabricItemSettings(), Items.SMOKER);

    public static final OptionalItem BOOK_BINDER = new OptionalItem(new FabricItemSettings(), Items.BOOKSHELF);

    public static final OptionalItem BIO_REACTOR = new OptionalItem(new FabricItemSettings(), Items.LIME_TERRACOTTA);
    public static final OptionalItem MULTIMETER = new OptionalItem(new FabricItemSettings(), Items.CLOCK);

    public static final OptionalItem SMALL_CAPACITOR = new OptionalItem(new FabricItemSettings(), Head.CAPACITOR_25);
    public static final OptionalItem MEDIUM_CAPACITOR = new OptionalItem(new FabricItemSettings(), Head.CAPACITOR_25);
    public static final OptionalItem BIG_CAPACITOR = new OptionalItem(new FabricItemSettings(), Head.CAPACITOR_25);
    public static final OptionalItem LARGE_CAPACITOR = new OptionalItem(new FabricItemSettings(), Head.CAPACITOR_25);
    public static final OptionalItem CARBONADO_EDGED_CAPACITOR = new OptionalItem(new FabricItemSettings(), Head.CAPACITOR_25);
    public static final OptionalItem ENERGIZED_CAPACITOR = new OptionalItem(new FabricItemSettings(), Head.CAPACITOR_25);

    /* Robots */
    public static final OptionalItem PROGRAMMABLE_ANDROID = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID);
    public static final OptionalItem PROGRAMMABLE_ANDROID_FARMER = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_FARMER);
    public static final OptionalItem PROGRAMMABLE_ANDROID_MINER = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_MINER);
    public static final OptionalItem PROGRAMMABLE_ANDROID_WOODCUTTER = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_WOODCUTTER);
    public static final OptionalItem PROGRAMMABLE_ANDROID_BUTCHER = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_BUTCHER);
    public static final OptionalItem PROGRAMMABLE_ANDROID_FISHERMAN = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_FISHERMAN);

    public static final OptionalItem PROGRAMMABLE_ANDROID_2 = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID);
    public static final OptionalItem PROGRAMMABLE_ANDROID_2_FISHERMAN = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_FISHERMAN);
    public static final OptionalItem PROGRAMMABLE_ANDROID_2_FARMER = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_FARMER);
    public static final OptionalItem PROGRAMMABLE_ANDROID_2_BUTCHER = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_BUTCHER);

    public static final OptionalItem PROGRAMMABLE_ANDROID_3 = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID);
    public static final OptionalItem PROGRAMMABLE_ANDROID_3_FISHERMAN = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_FISHERMAN);
    public static final OptionalItem PROGRAMMABLE_ANDROID_3_BUTCHER = new OptionalItem(new FabricItemSettings(), Head.PROGRAMMABLE_ANDROID_BUTCHER);

    /* GPS */
    public static final OptionalItem GPS_TRANSMITTER = new OptionalItem(new FabricItemSettings(), Head.GPS_TRANSMITTER);
    public static final OptionalItem GPS_TRANSMITTER_2 = new OptionalItem(new FabricItemSettings(), Head.GPS_TRANSMITTER);
    public static final OptionalItem GPS_TRANSMITTER_3 = new OptionalItem(new FabricItemSettings(), Head.GPS_TRANSMITTER);
    public static final OptionalItem GPS_TRANSMITTER_4 = new OptionalItem(new FabricItemSettings(), Head.GPS_TRANSMITTER);

    public static final OptionalItem GPS_MARKER_TOOL = new OptionalItem(new FabricItemSettings(), Items.REDSTONE_TORCH);
    public static final OptionalItem GPS_CONTROL_PANEL = new OptionalItem(new FabricItemSettings(), Head.GPS_CONTROL_PANEL);
    public static final OptionalItem GPS_EMERGENCY_TRANSMITTER = new OptionalItem(new FabricItemSettings(), Head.GPS_TRANSMITTER);

    public static final OptionalItem ANDROID_INTERFACE_FUEL = new OptionalItem(new FabricItemSettings(), Items.DISPENSER);
    public static final OptionalItem ANDROID_INTERFACE_ITEMS = new OptionalItem(new FabricItemSettings(), Items.DISPENSER);

    public static final OptionalItem GPS_GEO_SCANNER = new OptionalItem(new FabricItemSettings(), Head.GEO_SCANNER);
    public static final OptionalItem PORTABLE_GEO_SCANNER = new OptionalItem(new FabricItemSettings(), Items.CLOCK);
    public static final OptionalItem GEO_MINER = new OptionalItem(new FabricItemSettings(), Head.GEO_MINER);
    public static final OptionalItem OIL_PUMP = new OptionalItem(new FabricItemSettings(), Head.OIL_PUMP);
    public static final OptionalItem OIL_BUCKET = new OptionalItem(new FabricItemSettings(), Head.OIL_BUCKET);
    public static final OptionalItem FUEL_BUCKET = new OptionalItem(new FabricItemSettings(), Head.FUEL_BUCKET);

    public static final OptionalItem REFINERY = new OptionalItem(new FabricItemSettings(), Items.PISTON);
    public static final OptionalItem COMBUSTION_REACTOR = new OptionalItem(new FabricItemSettings(), Head.GENERATOR);
    public static final OptionalItem ANDROID_MEMORY_CORE = new OptionalItem(new FabricItemSettings(), Head.ENERGY_REGULATOR);

    public static final OptionalItem GPS_TELEPORTER_PYLON = new OptionalItem(new FabricItemSettings(), Items.PURPLE_STAINED_GLASS);
    public static final OptionalItem GPS_TELEPORTATION_MATRIX = new OptionalItem(new FabricItemSettings(), Items.IRON_BLOCK);
    public static final OptionalItem GPS_ACTIVATION_DEVICE_SHARED = new OptionalItem(new FabricItemSettings(), Items.STONE_PRESSURE_PLATE);
    public static final OptionalItem GPS_ACTIVATION_DEVICE_PERSONAL = new OptionalItem(new FabricItemSettings(), Items.STONE_PRESSURE_PLATE);
    public static final OptionalItem PORTABLE_TELEPORTER = new OptionalItem(new FabricItemSettings(), Items.COMPASS);

    public static final OptionalItem ELEVATOR_PLATE = new OptionalItem(new FabricItemSettings(), Items.STONE_PRESSURE_PLATE);
    public static final OptionalItem INFUSED_HOPPER = new OptionalItem(new FabricItemSettings(), Items.HOPPER);

    public static final OptionalItem HEATED_PRESSURE_CHAMBER = new OptionalItem(new FabricItemSettings(), Items.LIGHT_GRAY_STAINED_GLASS);
    public static final OptionalItem HEATED_PRESSURE_CHAMBER_2 = new OptionalItem(new FabricItemSettings(), Items.LIGHT_GRAY_STAINED_GLASS);

    public static final OptionalItem ELECTRIC_SMELTERY = new OptionalItem(new FabricItemSettings(), Items.FURNACE);
    public static final OptionalItem ELECTRIC_SMELTERY_2 = new OptionalItem(new FabricItemSettings(), Items.FURNACE);

    public static final OptionalItem ELECTRIC_PRESS = new OptionalItem(new FabricItemSettings(), Head.ELECTRIC_PRESS);
    public static final OptionalItem ELECTRIC_PRESS_2 = new OptionalItem(new FabricItemSettings(), Head.ELECTRIC_PRESS);

    public static final OptionalItem ELECTRIFIED_CRUCIBLE = new OptionalItem(new FabricItemSettings(), Items.RED_TERRACOTTA);
    public static final OptionalItem ELECTRIFIED_CRUCIBLE_2 = new OptionalItem(new FabricItemSettings(), Items.RED_TERRACOTTA);
    public static final OptionalItem ELECTRIFIED_CRUCIBLE_3 = new OptionalItem(new FabricItemSettings(), Items.RED_TERRACOTTA);

    public static final OptionalItem CARBON_PRESS = new OptionalItem(new FabricItemSettings(), Items.BLACK_STAINED_GLASS);
    public static final OptionalItem CARBON_PRESS_2 = new OptionalItem(new FabricItemSettings(), Items.BLACK_STAINED_GLASS);
    public static final OptionalItem CARBON_PRESS_3 = new OptionalItem(new FabricItemSettings(), Items.BLACK_STAINED_GLASS);

    public static final OptionalItem BLISTERING_INGOT = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem BLISTERING_INGOT_2 = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);
    public static final OptionalItem BLISTERING_INGOT_3 = new OptionalItem(new FabricItemSettings(), Items.GOLD_INGOT);

    public static final OptionalItem ENERGY_REGULATOR = new OptionalItem(new FabricItemSettings(), Head.ENERGY_REGULATOR);
    public static final OptionalItem ENERGY_CONNECTOR = new OptionalItem(new FabricItemSettings(), Head.ENERGY_CONNECTOR);
    public static final OptionalItem DEBUG_FISH = new OptionalItem(new FabricItemSettings(), Items.SALMON);

    public static final OptionalItem NETHER_ICE = new OptionalItem(new FabricItemSettings(), Head.NETHER_ICE);
    public static final OptionalItem ENRICHED_NETHER_ICE = new OptionalItem(new FabricItemSettings(), Head.ENRICHED_NETHER_ICE);
    public static final OptionalItem NETHER_ICE_COOLANT_CELL = new OptionalItem(new FabricItemSettings(), Head.NETHER_ICE_COOLANT_CELL);

    // Cargo
    public static final OptionalItem CARGO_MANAGER = new OptionalItem(new FabricItemSettings(), Head.CARGO_MANAGER);
    public static final OptionalItem CARGO_CONNECTOR_NODE = new OptionalItem(new FabricItemSettings(), Head.CARGO_CONNECTOR_NODE);
    public static final OptionalItem CARGO_INPUT_NODE = new OptionalItem(new FabricItemSettings(), Head.CARGO_INPUT_NODE);
    public static final OptionalItem CARGO_OUTPUT_NODE = new OptionalItem(new FabricItemSettings(), Head.CARGO_OUTPUT_NODE);
    public static final OptionalItem CARGO_OUTPUT_NODE_2 = new OptionalItem(new FabricItemSettings(), Head.CARGO_OUTPUT_NODE);

    // Animal farm
    public static final OptionalItem AUTO_BREEDER = new OptionalItem(new FabricItemSettings(), Items.HAY_BLOCK);
    public static final OptionalItem PRODUCE_COLLECTOR = new OptionalItem(new FabricItemSettings(), Items.HAY_BLOCK);

    public static final OptionalItem ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem WHEAT_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem CARROT_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem POTATO_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem SEEDS_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem BEETROOT_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem MELON_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem APPLE_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem SWEET_BERRIES_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem KELP_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem COCOA_ORGANIC_FOOD = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);

    public static final OptionalItem FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem WHEAT_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem CARROT_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem POTATO_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem SEEDS_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem BEETROOT_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem MELON_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem APPLE_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem SWEET_BERRIES_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem KELP_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);
    public static final OptionalItem COCOA_FERTILIZER = new OptionalItem(new FabricItemSettings(), Head.FILLED_CAN);

    public static final OptionalItem ANIMAL_GROWTH_ACCELERATOR = new OptionalItem(new FabricItemSettings(), Items.HAY_BLOCK);
    public static final OptionalItem CROP_GROWTH_ACCELERATOR = new OptionalItem(new FabricItemSettings(), Items.LIME_TERRACOTTA);
    public static final OptionalItem CROP_GROWTH_ACCELERATOR_2 = new OptionalItem(new FabricItemSettings(), Items.LIME_TERRACOTTA);
    public static final OptionalItem TREE_GROWTH_ACCELERATOR = new OptionalItem(new FabricItemSettings(), Items.BROWN_TERRACOTTA);

    public static final OptionalItem FOOD_FABRICATOR = new OptionalItem(new FabricItemSettings(), Items.GREEN_STAINED_GLASS);
    public static final OptionalItem FOOD_FABRICATOR_2 = new OptionalItem(new FabricItemSettings(), Items.GREEN_STAINED_GLASS);

    public static final OptionalItem FOOD_COMPOSTER = new OptionalItem(new FabricItemSettings(), Items.GREEN_TERRACOTTA);
    public static final OptionalItem FOOD_COMPOSTER_2 = new OptionalItem(new FabricItemSettings(), Items.GREEN_TERRACOTTA);

    public static final OptionalItem EXP_COLLECTOR = new OptionalItem(new FabricItemSettings(), Head.EXP_COLLECTOR);
    public static final OptionalItem REACTOR_COOLANT_CELL = new OptionalItem(new FabricItemSettings(), Head.COOLANT_CELL);

    public static final OptionalItem NUCLEAR_REACTOR = new OptionalItem(new FabricItemSettings(), Head.NUCLEAR_REACTOR);
    public static final OptionalItem NETHER_STAR_REACTOR = new OptionalItem(new FabricItemSettings(), Head.NETHER_STAR_REACTOR);
    public static final OptionalItem REACTOR_ACCESS_PORT = new OptionalItem(new FabricItemSettings(), Items.CYAN_TERRACOTTA);

    public static final OptionalItem FREEZER = new OptionalItem(new FabricItemSettings(), Items.LIGHT_BLUE_STAINED_GLASS);
    public static final OptionalItem FREEZER_2 = new OptionalItem(new FabricItemSettings(), Items.LIGHT_BLUE_STAINED_GLASS);

    public static final OptionalItem ELECTRIC_GOLD_PAN = new OptionalItem(new FabricItemSettings(), Items.BROWN_TERRACOTTA);
    public static final OptionalItem ELECTRIC_GOLD_PAN_2 = new OptionalItem(new FabricItemSettings(), Items.BROWN_TERRACOTTA);
    public static final OptionalItem ELECTRIC_GOLD_PAN_3 = new OptionalItem(new FabricItemSettings(), Items.BROWN_TERRACOTTA);

    public static final OptionalItem ELECTRIC_DUST_WASHER = new OptionalItem(new FabricItemSettings(), Items.BLUE_STAINED_GLASS);
    public static final OptionalItem ELECTRIC_DUST_WASHER_2 = new OptionalItem(new FabricItemSettings(), Items.BLUE_STAINED_GLASS);
    public static final OptionalItem ELECTRIC_DUST_WASHER_3 = new OptionalItem(new FabricItemSettings(), Items.BLUE_STAINED_GLASS);

    public static final OptionalItem ELECTRIC_INGOT_FACTORY = new OptionalItem(new FabricItemSettings(), Items.RED_TERRACOTTA);
    public static final OptionalItem ELECTRIC_INGOT_FACTORY_2 = new OptionalItem(new FabricItemSettings(), Items.RED_TERRACOTTA);
    public static final OptionalItem ELECTRIC_INGOT_FACTORY_3 = new OptionalItem(new FabricItemSettings(), Items.RED_TERRACOTTA);

    public static final OptionalItem FLUID_PUMP = new OptionalItem(new FabricItemSettings(), Items.BLUE_TERRACOTTA);
    public static final OptionalItem CHARGING_BENCH = new OptionalItem(new FabricItemSettings(), Items.CRAFTING_TABLE);

    public static final OptionalItem VANILLA_AUTO_CRAFTER = new OptionalItem(new FabricItemSettings(), Head.VANILLA_AUTO_CRAFTER);
    public static final OptionalItem ENHANCED_AUTO_CRAFTER = new OptionalItem(new FabricItemSettings(), Head.ENHANCED_AUTO_CRAFTER);
    public static final OptionalItem ARMOR_AUTO_CRAFTER = new OptionalItem(new FabricItemSettings(), Head.ARMOR_AUTO_CRAFTER);

    public static final OptionalItem IRON_GOLEM_ASSEMBLER = new OptionalItem(new FabricItemSettings(), Items.IRON_BLOCK);
    public static final OptionalItem WITHER_ASSEMBLER = new OptionalItem(new FabricItemSettings(), Items.OBSIDIAN);

    public static final OptionalItem TRASH_CAN = new OptionalItem(new FabricItemSettings(), Head.TRASH_CAN);

    public static final OptionalItem ELYTRA_SCALE = new OptionalItem(new FabricItemSettings(), Items.FEATHER);
    public static final OptionalItem INFUSED_ELYTRA = new OptionalItem(new FabricItemSettings(), Items.ELYTRA);
    public static final OptionalItem SOULBOUND_ELYTRA = new OptionalItem(new FabricItemSettings(), Items.ELYTRA);

    public static final OptionalItem MAGNESIUM_SALT = new OptionalItem(new FabricItemSettings(), Items.SUGAR);
    public static final OptionalItem MAGNESIUM_GENERATOR = new OptionalItem(new FabricItemSettings(), Head.GENERATOR);

    static void register() {
        if (registered) {
            InstanceAlreadyExistsException e = new InstanceAlreadyExistsException("Slimefabric items have already been registered!");
            e.printStackTrace();
        } else {

        }
    }
}
