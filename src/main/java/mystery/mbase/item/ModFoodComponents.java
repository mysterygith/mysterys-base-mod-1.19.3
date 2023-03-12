package mystery.mbase.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent BANANA_BREAD = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build();
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build();


}
