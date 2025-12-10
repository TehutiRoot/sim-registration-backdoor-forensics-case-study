package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.unit.TextUnitType;

/* renamed from: ui0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC22489ui0 {
    /* renamed from: a */
    public static float m1224a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(j), TextUnitType.Companion.m73872getSpUIouoOA())) {
            return C3641Dp.m73658constructorimpl(TextUnit.m73839getValueimpl(j) * lazyLayoutMeasureScope.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: b */
    public static float m1223b(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return C3641Dp.m73658constructorimpl(f / lazyLayoutMeasureScope.getDensity());
    }

    /* renamed from: c */
    public static float m1222c(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        return C3641Dp.m73658constructorimpl(i / lazyLayoutMeasureScope.getDensity());
    }

    /* renamed from: d */
    public static long m1221d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (j != Size.Companion.m71579getUnspecifiedNHjbRc()) {
            return DpKt.m73680DpSizeYgX7TsA(lazyLayoutMeasureScope.mo69434toDpu2uoSUM(Size.m71571getWidthimpl(j)), lazyLayoutMeasureScope.mo69434toDpu2uoSUM(Size.m71568getHeightimpl(j)));
        }
        return DpSize.Companion.m73765getUnspecifiedMYxV2XQ();
    }

    /* renamed from: e */
    public static long m1220e(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (j != DpSize.Companion.m73765getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(lazyLayoutMeasureScope.mo69438toPx0680j_4(DpSize.m73756getWidthD9Ej5fM(j)), lazyLayoutMeasureScope.mo69438toPx0680j_4(DpSize.m73754getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m71579getUnspecifiedNHjbRc();
    }

    /* renamed from: f */
    public static long m1219f(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / lazyLayoutMeasureScope.getFontScale());
    }

    /* renamed from: g */
    public static long m1218g(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }

    /* renamed from: h */
    public static long m1217h(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        return TextUnitKt.getSp(i / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }
}
