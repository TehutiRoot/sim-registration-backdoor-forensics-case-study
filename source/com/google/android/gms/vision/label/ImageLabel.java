package com.google.android.gms.vision.label;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes4.dex */
public class ImageLabel {

    /* renamed from: a */
    public final String f48692a;

    /* renamed from: b */
    public final String f48693b;

    /* renamed from: c */
    public final float f48694c;

    public ImageLabel(String str, String str2, float f) {
        this.f48692a = str;
        this.f48693b = str2;
        this.f48694c = f;
    }

    @KeepForSdk
    public float getConfidence() {
        return this.f48694c;
    }

    @KeepForSdk
    public String getLabel() {
        return this.f48693b;
    }

    @KeepForSdk
    public String getMid() {
        return this.f48692a;
    }
}
