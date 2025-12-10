package com.tom_roush.pdfbox.pdmodel.font;

import java.util.Arrays;

/* loaded from: classes5.dex */
public class PDPanose {
    public static final int LENGTH = 12;

    /* renamed from: a */
    public final byte[] f60395a;

    public PDPanose(byte[] bArr) {
        this.f60395a = bArr;
    }

    public int getFamilyClass() {
        byte[] bArr = this.f60395a;
        return bArr[1] | (bArr[0] << 8);
    }

    public PDPanoseClassification getPanose() {
        return new PDPanoseClassification(Arrays.copyOfRange(this.f60395a, 2, 12));
    }
}
