package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f49619a1;

    /* renamed from: a2 */
    public TonalPalette f49620a2;

    /* renamed from: a3 */
    public TonalPalette f49621a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f49622n1;

    /* renamed from: n2 */
    public TonalPalette f49623n2;

    public CorePalette(int i, boolean z) {
        Hct fromInt = Hct.fromInt(i);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z) {
            this.f49619a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f49620a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f49621a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f49622n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f49623n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f49619a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f49620a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f49621a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f49622n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f49623n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    /* renamed from: of */
    public static CorePalette m45336of(int i) {
        return new CorePalette(i, false);
    }
}
