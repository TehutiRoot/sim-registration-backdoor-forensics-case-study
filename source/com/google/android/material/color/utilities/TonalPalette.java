package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class TonalPalette {

    /* renamed from: a */
    public Map f49694a = new HashMap();

    /* renamed from: b */
    public double f49695b;

    /* renamed from: c */
    public double f49696c;

    public TonalPalette(double d, double d2) {
        this.f49695b = d;
        this.f49696c = d2;
    }

    public static final TonalPalette fromHct(Hct hct) {
        return fromHueAndChroma(hct.getHue(), hct.getChroma());
    }

    public static final TonalPalette fromHueAndChroma(double d, double d2) {
        return new TonalPalette(d, d2);
    }

    public static final TonalPalette fromInt(int i) {
        return fromHct(Hct.fromInt(i));
    }

    public double getChroma() {
        return this.f49696c;
    }

    public Hct getHct(double d) {
        return Hct.from(this.f49695b, this.f49696c, d);
    }

    public double getHue() {
        return this.f49695b;
    }

    public int tone(int i) {
        Integer num = (Integer) this.f49694a.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.f49695b, this.f49696c, i).toInt());
            this.f49694a.put(Integer.valueOf(i), num);
        }
        return num.intValue();
    }
}
