package io.github.mortuusars.chalk.setup;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static final class Items {
        public static final TagKey<Item> CHALK = ItemTags.create(new ResourceLocation("forge:chalk"));
    }
}
