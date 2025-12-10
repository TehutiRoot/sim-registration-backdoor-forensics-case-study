package com.google.android.gms.vision.label;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes4.dex */
public class ImageLabel {

    /* renamed from: a */
    public final String f48704a;

    /* renamed from: b */
    public final String f48705b;

    /* renamed from: c */
    public final float f48706c;

    public ImageLabel(String str, String str2, float f) {
        this.f48704a = str;
        this.f48705b = str2;
        this.f48706c = f;
    }

    @KeepForSdk
    public float getConfidence() {
        return this.f48706c;
    }

    @KeepForSdk
    public String getLabel() {
        return this.f48705b;
    }

    @KeepForSdk
    public String getMid() {
        return this.f48704a;
    }
}