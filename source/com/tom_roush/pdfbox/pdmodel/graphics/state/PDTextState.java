package com.tom_roush.pdfbox.pdmodel.graphics.state;

import com.tom_roush.pdfbox.pdmodel.font.PDFont;

/* loaded from: classes5.dex */
public class PDTextState implements Cloneable {

    /* renamed from: e */
    public PDFont f60563e;

    /* renamed from: f */
    public float f60564f;

    /* renamed from: a */
    public float f60559a = 0.0f;

    /* renamed from: b */
    public float f60560b = 0.0f;

    /* renamed from: c */
    public float f60561c = 100.0f;

    /* renamed from: d */
    public float f60562d = 0.0f;

    /* renamed from: g */
    public RenderingMode f60565g = RenderingMode.FILL;

    /* renamed from: h */
    public float f60566h = 0.0f;

    /* renamed from: i */
    public boolean f60567i = true;

    public float getCharacterSpacing() {
        return this.f60559a;
    }

    public PDFont getFont() {
        return this.f60563e;
    }

    public float getFontSize() {
        return this.f60564f;
    }

    public float getHorizontalScaling() {
        return this.f60561c;
    }

    public boolean getKnockoutFlag() {
        return this.f60567i;
    }

    public float getLeading() {
        return this.f60562d;
    }

    public RenderingMode getRenderingMode() {
        return this.f60565g;
    }

    public float getRise() {
        return this.f60566h;
    }

    public float getWordSpacing() {
        return this.f60560b;
    }

    public void setCharacterSpacing(float f) {
        this.f60559a = f;
    }

    public void setFont(PDFont pDFont) {
        this.f60563e = pDFont;
    }

    public void setFontSize(float f) {
        this.f60564f = f;
    }

    public void setHorizontalScaling(float f) {
        this.f60561c = f;
    }

    public void setKnockoutFlag(boolean z) {
        this.f60567i = z;
    }

    public void setLeading(float f) {
        this.f60562d = f;
    }

    public void setRenderingMode(RenderingMode renderingMode) {
        this.f60565g = renderingMode;
    }

    public void setRise(float f) {
        this.f60566h = f;
    }

    public void setWordSpacing(float f) {
        this.f60560b = f;
    }

    /* renamed from: clone */
    public PDTextState m74061clone() {
        try {
            return (PDTextState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
