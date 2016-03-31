/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beargame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.SVGPath;

/**
 *
 * @author DAW13
 */
public abstract class ObjectGame {
    protected List<Image> imageStates = new ArrayList<>();
    protected ImageView spriteFrame;
    protected SVGPath spriteBound;
    protected double iX;
    protected double iY;
    protected double pX;
    protected double pY;
    protected boolean isAlive;
    protected boolean isFixed;
    protected boolean isBonus;
    protected boolean hasValu;
    protected boolean isFlipV;
    protected boolean isFlipH;
    
    public ObjectGame(String SVGdata, double xLocation, double yLocation, Image... spriteCels) {
        spriteBound = new SVGPath();
        spriteBound.setContent(SVGdata);
        spriteFrame = new ImageView(spriteCels[0]);
        imageStates.addAll(Arrays.asList(spriteCels));
        iX = xLocation;
        iY = yLocation;
        pX = 0;
        pY = 0;
        isAlive = false;
        isFixed = true;
        isBonus = false;
        hasValu = false;
        isFlipV = false;
        isFlipH = false;
    }
    
    public abstract void update();
    
    public List<Image> getImageStates() {
        return imageStates;
    }

    public void setImageStates(List<Image> imageStates) {
        this.imageStates = imageStates;
    }

    public ImageView getSpriteFrame() {
        return spriteFrame;
    }

    public void setSpriteFrame(ImageView spriteFrame) {
        this.spriteFrame = spriteFrame;
    }

    public SVGPath getSpriteBound() {
        return spriteBound;
    }

    public void setSpriteBound(SVGPath spriteBound) {
        this.spriteBound = spriteBound;
    }

    public double getiX() {
        return iX;
    }

    public void setiX(double iX) {
        this.iX = iX;
    }

    public double getiY() {
        return iY;
    }

    public void setiY(double iY) {
        this.iY = iY;
    }

    public double getpX() {
        return pX;
    }

    public void setpX(double pX) {
        this.pX = pX;
    }

    public double getpY() {
        return pY;
    }

    public void setpY(double pY) {
        this.pY = pY;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isIsFixed() {
        return isFixed;
    }

    public void setIsFixed(boolean isFixed) {
        this.isFixed = isFixed;
    }

    public boolean isIsBonus() {
        return isBonus;
    }

    public void setIsBonus(boolean isBonus) {
        this.isBonus = isBonus;
    }

    public boolean isHasValu() {
        return hasValu;
    }

    public void setHasValu(boolean hasValu) {
        this.hasValu = hasValu;
    }

    public boolean isIsFlipV() {
        return isFlipV;
    }

    public void setIsFlipV(boolean isFlipV) {
        this.isFlipV = isFlipV;
    }

    public boolean isIsFlipH() {
        return isFlipH;
    }

    public void setIsFlipH(boolean isFlipH) {
        this.isFlipH = isFlipH;
    }
    
    
}
