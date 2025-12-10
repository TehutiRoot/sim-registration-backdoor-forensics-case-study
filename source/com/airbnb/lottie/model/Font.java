package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class Font {

    /* renamed from: a */
    public final String f41291a;

    /* renamed from: b */
    public final String f41292b;

    /* renamed from: c */
    public final String f41293c;

    /* renamed from: d */
    public final float f41294d;

    /* renamed from: e */
    public Typeface f41295e;

    public Font(String str, String str2, String str3, float f) {
        this.f41291a = str;
        this.f41292b = str2;
        this.f41293c = str3;
        this.f41294d = f;
    }

    public String getFamily() {
        return this.f41291a;
    }

    public String getName() {
        return this.f41292b;
    }

    public String getStyle() {
        return this.f41293c;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f41295e;
    }

    public void setTypeface(@Nullable Typeface typeface) {
        this.f41295e = typeface;
    }
}
