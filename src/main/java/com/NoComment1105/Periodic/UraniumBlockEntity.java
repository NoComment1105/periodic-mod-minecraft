package com.NoComment1105.Periodic;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;

public class UraniumBlockEntity extends BlockEntity {

    //Store the current value of the number
    private int number = 7;

    public UraniumBlockEntity() {
        super(periodic.URANIUM_BLOCK_ENTITY);
    }

    // Serialize the BlockEntity
    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);

        // Save the current value of the number to the tag
        tag.putInt("number", number );

        return tag;
    }

    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        number = tag.getInt("number");
    }
}
