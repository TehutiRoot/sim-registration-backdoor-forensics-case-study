package com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout;

import com.tom_roush.pdfbox.pdmodel.font.PDFont;

/* loaded from: classes5.dex */
public class AppearanceStyle {

    /* renamed from: a */
    public PDFont f60597a;

    /* renamed from: b */
    public float f60598b = 12.0f;

    /* renamed from: c */
    public float f60599c = 14.4f;

    /* renamed from: a */
    public PDFont m32312a() {
        return this.f60597a;
    }

    /* renamed from: b */
    public float m32311b() {
        return this.f60598b;
    }

    /* renamed from: c */
    public float m32310c() {
        return this.f60599c;
    }

    public void setFont(PDFont pDFont) {
        this.f60597a = pDFont;
    }

    public void setFontSize(float f) {
        this.f60598b = f;
        this.f60599c = f * 1.2f;
    }
}
