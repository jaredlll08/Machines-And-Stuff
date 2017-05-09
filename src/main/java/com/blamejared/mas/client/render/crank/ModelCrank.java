// Date: 27/02/2016 14:06:08
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.blamejared.mas.client.render.crank;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;

public class ModelCrank extends ModelBase {
    
    //fields
    ModelRenderer baseBottom;
    ModelRenderer baseMiddle;
    ModelRenderer baseTop;
    ModelRenderer crankMain;
    ModelRenderer crankConnect;
    ModelRenderer crankHandle;
    
    public ModelCrank() {
        textureWidth = 64;
        textureHeight = 32;
        
        baseBottom = new ModelRenderer(this, 0, 0);
        baseBottom.addBox(0F, 0F, 0F, 10, 2, 10);
        baseBottom.setRotationPoint(-5F, 22F, -5F);
        baseBottom.setTextureSize(64, 32);
        baseBottom.mirror = true;
        setRotation(baseBottom, 0F, 0F, 0F);
        baseMiddle = new ModelRenderer(this, 0, 12);
        baseMiddle.addBox(0F, 0F, 0F, 8, 1, 8);
        baseMiddle.setRotationPoint(-4F, 21F, -4F);
        baseMiddle.setTextureSize(64, 32);
        baseMiddle.mirror = true;
        setRotation(baseMiddle, 0F, 0F, 0F);
        baseTop = new ModelRenderer(this, 0, 21);
        baseTop.addBox(0F, 0F, 0F, 4, 2, 4);
        baseTop.setRotationPoint(-2F, 19F, -2F);
        baseTop.setTextureSize(64, 32);
        baseTop.mirror = true;
        setRotation(baseTop, 0F, 0F, 0F);
        crankMain = new ModelRenderer(this, 16, 21);
        crankMain.addBox(-1F, 0F, -1F, 2, 1, 6);
        crankMain.setRotationPoint(0F, 18F, 0F);
        crankMain.setTextureSize(64, 32);
        crankMain.mirror = true;
        setRotation(crankMain, 0F, 0F, 0F);
        crankConnect = new ModelRenderer(this, 40, 4);
        crankConnect.addBox(0F, 0F, 0F, 2, 2, 2);
        crankConnect.setRotationPoint(-1F, 17F, 5F);
        crankConnect.setTextureSize(64, 32);
        crankConnect.mirror = true;
        setRotation(crankConnect, 0F, 0F, 0F);
        crankHandle = new ModelRenderer(this, 40, 0);
        crankHandle.addBox(0F, 0F, 0F, 3, 1, 3);
        crankHandle.setRotationPoint(-1.5F, 16F, 4.5F);
        crankHandle.setTextureSize(64, 32);
        crankHandle.mirror = true;
        setRotation(crankHandle, 0F, 0F, 0F);
    }
    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        baseBottom.render(f5);
        baseMiddle.render(f5);
        baseTop.render(f5);
        crankMain.render(f5);
        crankConnect.render(f5);
        crankHandle.render(f5);
    }
    
    public void render(float f5) {
        baseBottom.render(f5);
        baseMiddle.render(f5);
        baseTop.render(f5);
        crankMain.render(f5);
        crankConnect.render(f5);
        crankHandle.render(f5);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
    
}