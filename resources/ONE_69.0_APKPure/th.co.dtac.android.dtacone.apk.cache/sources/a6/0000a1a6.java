package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class DynamicColor {

    /* renamed from: a */
    public final HashMap f49636a = new HashMap();
    public final Function<DynamicScheme, DynamicColor> background;
    public final Function<DynamicScheme, Double> chroma;
    public final Function<DynamicScheme, Double> hue;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaConstraint> toneDeltaConstraint;
    public final Function<DynamicScheme, Double> toneMaxContrast;
    public final Function<DynamicScheme, Double> toneMinContrast;

    /* renamed from: com.google.android.material.color.utilities.DynamicColor$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C6881a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49637a;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            f49637a = iArr;
            try {
                iArr[TonePolarity.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49637a[TonePolarity.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49637a[TonePolarity.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DynamicColor(Function<DynamicScheme, Double> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, Double> function3, Function<DynamicScheme, Double> function4, Function<DynamicScheme, DynamicColor> function5, Function<DynamicScheme, Double> function6, Function<DynamicScheme, Double> function7, Function<DynamicScheme, ToneDeltaConstraint> function8) {
        this.hue = function;
        this.chroma = function2;
        this.tone = function3;
        this.opacity = function4;
        this.background = function5;
        this.toneMinContrast = function6;
        this.toneMaxContrast = function7;
        this.toneDeltaConstraint = function8;
    }

    /* renamed from: A */
    public static /* synthetic */ Double m45311A(Function function, DynamicScheme dynamicScheme) {
        Object apply;
        apply = function.apply(dynamicScheme);
        return Double.valueOf(((TonalPalette) apply).getChroma());
    }

    /* renamed from: B */
    public static /* synthetic */ Double m45310B(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMinContrastDefault(function, function2, dynamicScheme, function3));
    }

    /* renamed from: C */
    public static /* synthetic */ Double m45309C(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMaxContrastDefault(function, function2, dynamicScheme, function3));
    }

    /* renamed from: E */
    public static /* synthetic */ DynamicColor m45307E(DynamicColor dynamicColor, DynamicScheme dynamicScheme) {
        return dynamicColor;
    }

    /* renamed from: H */
    public static /* synthetic */ Double m45304H(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return Double.valueOf(dynamicColor.getTone(dynamicScheme));
    }

    /* renamed from: I */
    public static /* synthetic */ Double m45303I(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        Object apply;
        apply = dynamicColor.toneMaxContrast.apply(dynamicScheme);
        return (Double) apply;
    }

    /* renamed from: J */
    public static /* synthetic */ Double m45302J(Function function, DynamicScheme dynamicScheme, Double d, Double d2) {
        Object apply;
        Object apply2;
        Object apply3;
        Object apply4;
        if (function != null) {
            apply = function.apply(dynamicScheme);
            if (apply != null) {
                apply2 = function.apply(dynamicScheme);
                if (((DynamicColor) apply2).background != null) {
                    apply3 = function.apply(dynamicScheme);
                    apply4 = ((DynamicColor) apply3).background.apply(dynamicScheme);
                    if (apply4 != null) {
                        return Double.valueOf(contrastingTone(d2.doubleValue(), 7.0d));
                    }
                }
            }
        }
        return Double.valueOf(contrastingTone(d2.doubleValue(), Math.max(7.0d, d.doubleValue())));
    }

    /* renamed from: K */
    public static /* synthetic */ Double m45301K(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        Object apply;
        apply = dynamicColor.toneMinContrast.apply(dynamicScheme);
        return (Double) apply;
    }

    /* renamed from: L */
    public static /* synthetic */ Double m45300L(Function function, DynamicScheme dynamicScheme, Function function2, Double d, Double d2) {
        Object apply;
        Object apply2;
        Object apply3;
        Object apply4;
        Object apply5;
        apply = function.apply(dynamicScheme);
        double doubleValue = ((Double) apply).doubleValue();
        if (d.doubleValue() >= 7.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 4.5d);
        } else if (d.doubleValue() >= 3.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 3.0d);
        } else if (function2 != null) {
            apply2 = function2.apply(dynamicScheme);
            if (apply2 != null) {
                apply3 = function2.apply(dynamicScheme);
                if (((DynamicColor) apply3).background != null) {
                    apply4 = function2.apply(dynamicScheme);
                    apply5 = ((DynamicColor) apply4).background.apply(dynamicScheme);
                    if (apply5 != null) {
                        doubleValue = contrastingTone(d2.doubleValue(), d.doubleValue());
                    }
                }
            }
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: M */
    public static /* synthetic */ Double m45299M(Double d) {
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double calculateDynamicTone(com.google.android.material.color.utilities.DynamicScheme r22, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r23, java.util.function.Function<com.google.android.material.color.utilities.DynamicColor, java.lang.Double> r24, java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> r25, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r26, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r27, java.util.function.Function<java.lang.Double, java.lang.Double> r28, java.util.function.Function<java.lang.Double, java.lang.Double> r29) {
        /*
            r4 = r22
            r0 = r26
            r1 = r28
            r2 = r23
            r3 = r29
            java.lang.Object r2 = p000.AbstractC10357hL.m31241a(r2, r4)
            java.lang.Double r2 = (java.lang.Double) r2
            double r5 = r2.doubleValue()
            if (r0 != 0) goto L18
            r0 = 0
            goto L1e
        L18:
            java.lang.Object r0 = p000.AbstractC10357hL.m31241a(r0, r4)
            com.google.android.material.color.utilities.DynamicColor r0 = (com.google.android.material.color.utilities.DynamicColor) r0
        L1e:
            if (r0 != 0) goto L21
            return r5
        L21:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2 = r0.tone
            java.lang.Object r2 = p000.AbstractC10357hL.m31241a(r2, r4)
            java.lang.Double r2 = (java.lang.Double) r2
            double r7 = r2.doubleValue()
            double r7 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r5, r7)
            r9 = r24
            java.lang.Object r2 = p000.AbstractC10357hL.m31241a(r9, r0)
            java.lang.Double r2 = (java.lang.Double) r2
            double r10 = r2.doubleValue()
            java.lang.Double r12 = java.lang.Double.valueOf(r7)
            r13 = r25
            java.lang.Object r2 = p000.AbstractC10447iL.m30984a(r13, r12, r2)
            java.lang.Double r2 = (java.lang.Double) r2
            double r12 = r2.doubleValue()
            double r20 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r10, r12)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 != 0) goto L56
            goto L70
        L56:
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
            java.lang.Object r2 = p000.AbstractC10357hL.m31241a(r1, r2)
            if (r2 != 0) goto L61
            goto L70
        L61:
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
            java.lang.Object r1 = p000.AbstractC10357hL.m31241a(r1, r2)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r14 = r1
        L70:
            if (r3 != 0) goto L75
        L72:
            r16 = 4626604192193052672(0x4035000000000000, double:21.0)
            goto L90
        L75:
            java.lang.Double r1 = java.lang.Double.valueOf(r7)
            java.lang.Object r1 = p000.AbstractC10357hL.m31241a(r3, r1)
            if (r1 != 0) goto L80
            goto L72
        L80:
            java.lang.Double r1 = java.lang.Double.valueOf(r7)
            java.lang.Object r1 = p000.AbstractC10357hL.m31241a(r3, r1)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r16 = r1
        L90:
            r18 = r20
            double r1 = com.google.android.material.color.utilities.MathUtils.clampDouble(r14, r16, r18)
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 != 0) goto L9b
            goto L9f
        L9b:
            double r12 = contrastingTone(r10, r1)
        L9f:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r0 = r0.background
            if (r0 == 0) goto Lac
            java.lang.Object r0 = p000.AbstractC10357hL.m31241a(r0, r4)
            if (r0 != 0) goto Laa
            goto Lac
        Laa:
            r0 = r12
            goto Lb0
        Lac:
            double r0 = enableLightForeground(r12)
        Lb0:
            r2 = r5
            r4 = r22
            r5 = r27
            r6 = r24
            double r0 = m45279t(r0, r2, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.DynamicColor.calculateDynamicTone(com.google.android.material.color.utilities.DynamicScheme, java.util.function.Function, java.util.function.Function, java.util.function.BiFunction, java.util.function.Function, java.util.function.Function, java.util.function.Function, java.util.function.Function):double");
    }

    public static double contrastingTone(double d, double d2) {
        boolean z;
        double lighterUnsafe = Contrast.lighterUnsafe(d, d2);
        double darkerUnsafe = Contrast.darkerUnsafe(d, d2);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d);
        if (tonePrefersLightForeground(d)) {
            if (Math.abs(ratioOfTones - ratioOfTones2) < 0.1d && ratioOfTones < d2 && ratioOfTones2 < d2) {
                z = true;
            } else {
                z = false;
            }
            if (ratioOfTones < d2 && ratioOfTones < ratioOfTones2 && !z) {
                return darkerUnsafe;
            }
            return lighterUnsafe;
        } else if (ratioOfTones2 >= d2 || ratioOfTones2 >= ratioOfTones) {
            return darkerUnsafe;
        } else {
            return lighterUnsafe;
        }
    }

    public static double enableLightForeground(double d) {
        if (tonePrefersLightForeground(d) && !toneAllowsLightForeground(d)) {
            return 49.0d;
        }
        return d;
    }

    public static DynamicColor fromArgb(int i) {
        final Hct fromInt = Hct.fromInt(i);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i);
        return fromPalette(new Function() { // from class: nL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette m45278u;
                m45278u = DynamicColor.m45278u(TonalPalette.this, (DynamicScheme) obj);
                return m45278u;
            }
        }, new Function() { // from class: oL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45277v;
                m45277v = DynamicColor.m45277v(Hct.this, (DynamicScheme) obj);
                return m45277v;
            }
        });
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2) {
        return fromPalette(function, function2, null, null);
    }

    /* renamed from: g */
    public static /* synthetic */ Double m45292g(double d, Double d2) {
        return Double.valueOf(d);
    }

    /* renamed from: l */
    public static /* synthetic */ TonalPalette m45287l(int i, DynamicScheme dynamicScheme) {
        return TonalPalette.fromInt(i);
    }

    /* renamed from: n */
    public static /* synthetic */ Double m45285n(double d, Double d2) {
        return Double.valueOf(d);
    }

    /* renamed from: r */
    public static /* synthetic */ Double m45281r(Double d) {
        return m45299M(d);
    }

    /* renamed from: s */
    public static /* synthetic */ Double m45280s(double d, Double d2, Double d3) {
        return Double.valueOf(d);
    }

    /* renamed from: t */
    public static double m45279t(double d, double d2, DynamicScheme dynamicScheme, Function function, Function function2) {
        Object apply;
        ToneDeltaConstraint toneDeltaConstraint;
        Object apply2;
        Object apply3;
        if (function != null) {
            apply = function.apply(dynamicScheme);
            toneDeltaConstraint = (ToneDeltaConstraint) apply;
        } else {
            toneDeltaConstraint = null;
        }
        if (toneDeltaConstraint == null) {
            return d;
        }
        double d3 = toneDeltaConstraint.delta;
        apply2 = function2.apply(toneDeltaConstraint.keepAway);
        double doubleValue = ((Double) apply2).doubleValue();
        double abs = Math.abs(d - doubleValue);
        if (abs >= d3) {
            return d;
        }
        int i = C6881a.f49637a[toneDeltaConstraint.keepAwayPolarity.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    apply3 = toneDeltaConstraint.keepAway.tone.apply(dynamicScheme);
                    if (d2 <= ((Double) apply3).doubleValue()) {
                        z = false;
                    }
                    double abs2 = Math.abs(abs - d3);
                    if (!z ? d < abs2 : d + abs2 <= 100.0d) {
                        return d + abs2;
                    }
                    return d - abs2;
                }
                return d;
            }
            return MathUtils.clampDouble(0.0d, 100.0d, doubleValue - d3);
        }
        return MathUtils.clampDouble(0.0d, 100.0d, doubleValue + d3);
    }

    public static boolean toneAllowsLightForeground(double d) {
        if (Math.round(d) <= 49) {
            return true;
        }
        return false;
    }

    public static double toneMaxContrastDefault(Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: pL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45303I;
                m45303I = DynamicColor.m45303I(DynamicScheme.this, (DynamicColor) obj);
                return m45303I;
            }
        }, new BiFunction() { // from class: qL
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double m45302J;
                m45302J = DynamicColor.m45302J(function2, dynamicScheme, (Double) obj, (Double) obj2);
                return m45302J;
            }
        }, function2, function3, null, null);
    }

    public static double toneMinContrastDefault(final Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: rL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45301K;
                m45301K = DynamicColor.m45301K(DynamicScheme.this, (DynamicColor) obj);
                return m45301K;
            }
        }, new BiFunction() { // from class: sL
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double m45300L;
                m45300L = DynamicColor.m45300L(function, dynamicScheme, function2, (Double) obj, (Double) obj2);
                return m45300L;
            }
        }, function2, function3, null, new Function() { // from class: tL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.m45281r((Double) obj);
            }
        });
    }

    public static boolean tonePrefersLightForeground(double d) {
        if (Math.round(d) <= 60) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static /* synthetic */ TonalPalette m45278u(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* renamed from: v */
    public static /* synthetic */ Double m45277v(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    /* renamed from: z */
    public static /* synthetic */ Double m45273z(Function function, DynamicScheme dynamicScheme) {
        Object apply;
        apply = function.apply(dynamicScheme);
        return Double.valueOf(((TonalPalette) apply).getHue());
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        Object apply;
        int i = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function != null) {
            apply = function.apply(dynamicScheme);
            return (MathUtils.clampInt(0, 255, (int) Math.round(((Double) apply).doubleValue() * 255.0d)) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
        }
        return i;
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Object apply;
        Object apply2;
        Hct hct = (Hct) this.f49636a.get(dynamicScheme);
        if (hct == null) {
            apply = this.hue.apply(dynamicScheme);
            double doubleValue = ((Double) apply).doubleValue();
            apply2 = this.chroma.apply(dynamicScheme);
            Hct from = Hct.from(doubleValue, ((Double) apply2).doubleValue(), getTone(dynamicScheme));
            if (this.f49636a.size() > 4) {
                this.f49636a.clear();
            }
            this.f49636a.put(dynamicScheme, from);
            return from;
        }
        return hct;
    }

    public double getTone(final DynamicScheme dynamicScheme) {
        Object apply;
        boolean z;
        Object apply2;
        DynamicColor dynamicColor;
        final double d;
        Object apply3;
        Object apply4;
        Object apply5;
        Object apply6;
        Object apply7;
        Object apply8;
        Object apply9;
        Object apply10;
        Function<DynamicScheme, Double> function;
        Object apply11;
        apply = this.tone.apply(dynamicScheme);
        final double doubleValue = ((Double) apply).doubleValue();
        double d2 = dynamicScheme.contrastLevel;
        boolean z2 = false;
        if (d2 < 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (d2 != 0.0d) {
            apply10 = this.tone.apply(dynamicScheme);
            double doubleValue2 = ((Double) apply10).doubleValue();
            if (z) {
                function = this.toneMinContrast;
            } else {
                function = this.toneMaxContrast;
            }
            apply11 = function.apply(dynamicScheme);
            doubleValue = doubleValue2 + ((((Double) apply11).doubleValue() - doubleValue2) * Math.abs(dynamicScheme.contrastLevel));
        }
        Function<DynamicScheme, DynamicColor> function2 = this.background;
        if (function2 != null) {
            apply2 = function2.apply(dynamicScheme);
            dynamicColor = (DynamicColor) apply2;
        } else {
            dynamicColor = null;
        }
        final double d3 = 1.0d;
        if (dynamicColor != null) {
            Function<DynamicScheme, DynamicColor> function3 = dynamicColor.background;
            if (function3 != null) {
                apply9 = function3.apply(dynamicScheme);
                if (apply9 != null) {
                    z2 = true;
                }
            }
            apply3 = this.tone.apply(dynamicScheme);
            double doubleValue3 = ((Double) apply3).doubleValue();
            apply4 = dynamicColor.tone.apply(dynamicScheme);
            double ratioOfTones = Contrast.ratioOfTones(doubleValue3, ((Double) apply4).doubleValue());
            if (z) {
                apply7 = this.toneMinContrast.apply(dynamicScheme);
                double doubleValue4 = ((Double) apply7).doubleValue();
                apply8 = dynamicColor.toneMinContrast.apply(dynamicScheme);
                double ratioOfTones2 = Contrast.ratioOfTones(doubleValue4, ((Double) apply8).doubleValue());
                if (z2) {
                    d3 = ratioOfTones2;
                }
                d = ratioOfTones;
            } else {
                apply5 = this.toneMaxContrast.apply(dynamicScheme);
                double doubleValue5 = ((Double) apply5).doubleValue();
                apply6 = dynamicColor.toneMaxContrast.apply(dynamicScheme);
                double ratioOfTones3 = Contrast.ratioOfTones(doubleValue5, ((Double) apply6).doubleValue());
                if (z2) {
                    d3 = Math.min(ratioOfTones3, ratioOfTones);
                }
                if (z2) {
                    d = Math.max(ratioOfTones3, ratioOfTones);
                }
            }
            return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: wL
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double m45304H;
                    m45304H = DynamicColor.m45304H(DynamicScheme.this, (DynamicColor) obj);
                    return m45304H;
                }
            }, new BiFunction() { // from class: xL
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return DynamicColor.m45280s(doubleValue, (Double) obj, (Double) obj2);
                }
            }, new Function() { // from class: yL
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    DynamicColor m45307E;
                    m45307E = DynamicColor.m45307E(DynamicColor.this, (DynamicScheme) obj);
                    return m45307E;
                }
            }, this.toneDeltaConstraint, new Function() { // from class: zL
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DynamicColor.m45285n(d3, (Double) obj);
                }
            }, new Function() { // from class: AL
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DynamicColor.m45292g(d, (Double) obj);
                }
            });
        }
        d = 21.0d;
        return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: wL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45304H;
                m45304H = DynamicColor.m45304H(DynamicScheme.this, (DynamicColor) obj);
                return m45304H;
            }
        }, new BiFunction() { // from class: xL
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.m45280s(doubleValue, (Double) obj, (Double) obj2);
            }
        }, new Function() { // from class: yL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor m45307E;
                m45307E = DynamicColor.m45307E(DynamicColor.this, (DynamicScheme) obj);
                return m45307E;
            }
        }, this.toneDeltaConstraint, new Function() { // from class: zL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.m45285n(d3, (Double) obj);
            }
        }, new Function() { // from class: AL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.m45292g(d, (Double) obj);
            }
        });
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, DynamicColor> function3) {
        return fromPalette(function, function2, function3, null);
    }

    public static DynamicColor fromPalette(final Function<DynamicScheme, TonalPalette> function, final Function<DynamicScheme, Double> function2, final Function<DynamicScheme, DynamicColor> function3, final Function<DynamicScheme, ToneDeltaConstraint> function4) {
        return new DynamicColor(new Function() { // from class: jL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45273z;
                m45273z = DynamicColor.m45273z(function, (DynamicScheme) obj);
                return m45273z;
            }
        }, new Function() { // from class: kL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45311A;
                m45311A = DynamicColor.m45311A(function, (DynamicScheme) obj);
                return m45311A;
            }
        }, function2, null, function3, new Function() { // from class: lL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45310B;
                m45310B = DynamicColor.m45310B(function2, function3, function4, (DynamicScheme) obj);
                return m45310B;
            }
        }, new Function() { // from class: mL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45309C;
                m45309C = DynamicColor.m45309C(function2, function3, function4, (DynamicScheme) obj);
                return m45309C;
            }
        }, function4);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function) {
        return fromPalette(new Function() { // from class: vL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2) {
        return fromPalette(new Function() { // from class: uL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function, function2);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return fromPalette(new Function() { // from class: BL
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.m45287l(i, (DynamicScheme) obj);
            }
        }, function, function2, function3);
    }
}