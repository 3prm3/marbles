package net.dodogang.marbles.data.models.stategen;

import com.google.gson.JsonElement;
import net.dodogang.marbles.data.models.modelgen.ModelGen;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;


public interface StateGen {
    JsonElement makeJson(Identifier id, Block block);
    void getModels(BiConsumer<String, ModelGen> consumer);
}