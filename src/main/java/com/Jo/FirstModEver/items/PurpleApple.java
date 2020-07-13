package com.Jo.FirstModEver.items;

import com.Jo.FirstModEver.First;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class PurpleApple extends Item {
    public PurpleApple() {
        super(new Item.Properties()
                .group(First.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(2.0F)
                        .effect(new EffectInstance(Effects.GLOWING,400,1),1.0F)
                        .effect(new EffectInstance(Effects.LEVITATION,100,1),0.2F)
                        .fastToEat()
                        .setAlwaysEdible()
                        .build())


        );
    }
}
