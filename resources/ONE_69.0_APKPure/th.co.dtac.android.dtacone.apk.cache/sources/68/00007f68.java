package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class Font {

    /* renamed from: a */
    public final String f41303a;

    /* renamed from: b */
    public final String f41304b;

    /* renamed from: c */
    public final String f41305c;

    /* renamed from: d */
    public final float f41306d;

    /* renamed from: e */
    public Typeface f41307e;

    public Font(String str, String str2, String str3, float f) {
        this.f41303a = str;
        this.f41304b = str2;
        this.f41305c = str3;
        this.f41306d = f;
    }

    public String getFamily() {
        return this.f41303a;
    }

    public String getName() {
        return this.f41304b;
    }

    public String getStyle() {
        return this.f41305c;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f41307e;
    }

    public void setTypeface(@Nullable Typeface typeface) {
        this.f41307e = typeface;
    }
}