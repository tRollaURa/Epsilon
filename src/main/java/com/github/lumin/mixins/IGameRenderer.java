package com.github.lumin.mixins;

import net.minecraft.client.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(net.minecraft.client.renderer.GameRenderer.class)
public interface IGameRenderer {

    @Invoker("getFov")
    float callGetFov(Camera camera, float tickDelta, boolean changingFov);

}
