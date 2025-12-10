package com.tom_roush.pdfbox.pdmodel.font;

/* loaded from: classes5.dex */
public class PDPanoseClassification {
    public static final int LENGTH = 10;

    /* renamed from: a */
    public final byte[] f60408a;

    public PDPanoseClassification(byte[] bArr) {
        this.f60408a = bArr;
    }

    public int getArmStyle() {
        return this.f60408a[6];
    }

    public byte[] getBytes() {
        return this.f60408a;
    }

    public int getContrast() {
        return this.f60408a[4];
    }

    public int getFamilyKind() {
        return this.f60408a[0];
    }

    public int getLetterform() {
        return this.f60408a[7];
    }

    public int getMidline() {
        return this.f60408a[8];
    }

    public int getProportion() {
        return this.f60408a[3];
    }

    public int getSerifStyle() {
        return this.f60408a[1];
    }

    public int getStrokeVariation() {
        return this.f60408a[5];
    }

    public int getWeight() {
        return this.f60408a[2];
    }

    public int getXHeight() {
        return this.f60408a[9];
    }

    public String toString() {
        return "{ FamilyKind = " + getFamilyKind() + ", SerifStyle = " + getSerifStyle() + ", Weight = " + getWeight() + ", Proportion = " + getProportion() + ", Contrast = " + getContrast() + ", StrokeVariation = " + getStrokeVariation() + ", ArmStyle = " + getArmStyle() + ", Letterform = " + getLetterform() + ", Midline = " + getMidline() + ", XHeight = " + getXHeight() + "}";
    }
}