package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDJPXColorSpace;

/* loaded from: classes5.dex */
public final class DecodeResult {
    public static final DecodeResult DEFAULT = new DecodeResult(new COSDictionary());

    /* renamed from: a */
    public final COSDictionary f59875a;

    /* renamed from: b */
    public PDJPXColorSpace f59876b;

    public DecodeResult(COSDictionary cOSDictionary) {
        this.f59875a = cOSDictionary;
    }

    /* renamed from: a */
    public void m32780a(PDJPXColorSpace pDJPXColorSpace) {
        this.f59876b = pDJPXColorSpace;
    }

    public PDJPXColorSpace getJPXColorSpace() {
        return this.f59876b;
    }

    public COSDictionary getParameters() {
        return this.f59875a;
    }
}
