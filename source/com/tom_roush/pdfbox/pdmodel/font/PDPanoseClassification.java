package com.tom_roush.pdfbox.pdmodel.font;

/* loaded from: classes5.dex */
public class PDPanoseClassification {
    public static final int LENGTH = 10;

    /* renamed from: a */
    public final byte[] f60396a;

    public PDPanoseClassification(byte[] bArr) {
        this.f60396a = bArr;
    }

    public int getArmStyle() {
        return this.f60396a[6];
    }

    public byte[] getBytes() {
        return this.f60396a;
    }

    public int getContrast() {
        return this.f60396a[4];
    }

    public int getFamilyKind() {
        return this.f60396a[0];
    }

    public int getLetterform() {
        return this.f60396a[7];
    }

    public int getMidline() {
        return this.f60396a[8];
    }

    public int getProportion() {
        return this.f60396a[3];
    }

    public int getSerifStyle() {
        return this.f60396a[1];
    }

    public int getStrokeVariation() {
        return this.f60396a[5];
    }

    public int getWeight() {
        return this.f60396a[2];
    }

    public int getXHeight() {
        return this.f60396a[9];
    }

    public String toString() {
        return "{ FamilyKind = " + getFamilyKind() + ", SerifStyle = " + getSerifStyle() + ", Weight = " + getWeight() + ", Proportion = " + getProportion() + ", Contrast = " + getContrast() + ", StrokeVariation = " + getStrokeVariation() + ", ArmStyle = " + getArmStyle() + ", Letterform = " + getLetterform() + ", Midline = " + getMidline() + ", XHeight = " + getXHeight() + "}";
    }
}
