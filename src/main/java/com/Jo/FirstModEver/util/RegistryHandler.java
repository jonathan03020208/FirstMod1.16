package com.Jo.FirstModEver.util;

import com.Jo.FirstModEver.First;
import com.Jo.FirstModEver.Tools.ModItemTier;
import com.Jo.FirstModEver.armor.ModArmorMaterial;
import com.Jo.FirstModEver.blocks.BlockItemBase;
import com.Jo.FirstModEver.blocks.Oven;
import com.Jo.FirstModEver.blocks.RubyBlock;
import com.Jo.FirstModEver.blocks.RubyOre;
import com.Jo.FirstModEver.items.ItemBase;
import com.Jo.FirstModEver.items.PurpleApple;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, First.MOD_ID);
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,First.MOD_ID);

        public static void init(){
                ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
                BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }

        //Items
        public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
        public static final RegistryObject<PurpleApple> PURPLE_APPLE=ITEMS.register("purple_apple",PurpleApple::new);

        //Blocks
        public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
        public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
        public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);

        //Block Items
        public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",()-> new BlockItemBase(RUBY_BLOCK.get()));
        public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",()-> new BlockItemBase(RUBY_ORE.get()));
        public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven",()-> new BlockItemBase(OVEN.get()));

        //Tools
        public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",()->
                new SwordItem(ModItemTier.RUBY,2,-2.4F,new Item.Properties().group(First.TAB)));

        public static final RegistryObject<PickaxeItem> PUBY_PICKAXE = ITEMS.register("ruby_pickaxe",()->
         new PickaxeItem(ModItemTier.RUBY,1,0F,new Item.Properties().group(First.TAB)));

        public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",()->
                new AxeItem(ModItemTier.RUBY,2,-1.5F,new Item.Properties().group(First.TAB)));

        public static final RegistryObject<ShovelItem> PUBY_SHOVEL = ITEMS.register("ruby_shovel",()->
                new ShovelItem(ModItemTier.RUBY,1,0F,new Item.Properties().group(First.TAB)));

        public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",()->
                new HoeItem(ModItemTier.RUBY,1,0F,new Item.Properties().group(First.TAB)));

        //Armor
        public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",()->
                new ArmorItem(ModArmorMaterial.RUBY , EquipmentSlotType.HEAD , new Item.Properties().group(First.TAB)));

        public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",()->
                new ArmorItem(ModArmorMaterial.RUBY , EquipmentSlotType.CHEST , new Item.Properties().group(First.TAB)));

        public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",()->
                new ArmorItem(ModArmorMaterial.RUBY , EquipmentSlotType.LEGS , new Item.Properties().group(First.TAB)));

        public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",()->
                new ArmorItem(ModArmorMaterial.RUBY , EquipmentSlotType.FEET , new Item.Properties().group(First.TAB)));
}
