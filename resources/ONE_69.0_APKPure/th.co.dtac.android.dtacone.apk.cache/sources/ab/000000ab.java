package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.unit.TextUnitType;

/* renamed from: Ai0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC17308Ai0 {
    /* renamed from: a */
    public static float m69206a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (TextUnitType.m74051equalsimpl0(TextUnit.m74022getTypeUIouoOA(j), TextUnitType.Companion.m74056getSpUIouoOA())) {
            return C3623Dp.m73842constructorimpl(TextUnit.m74023getValueimpl(j) * lazyLayoutMeasureScope.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: b */
    public static float m69205b(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return C3623Dp.m73842constructorimpl(f / lazyLayoutMeasureScope.getDensity());
    }

    /* renamed from: c */
    public static float m69204c(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        return C3623Dp.m73842constructorimpl(i / lazyLayoutMeasureScope.getDensity());
    }

    /* renamed from: d */
    public static long m69203d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (j != Size.Companion.m71763getUnspecifiedNHjbRc()) {
            return DpKt.m73864DpSizeYgX7TsA(lazyLayoutMeasureScope.mo69618toDpu2uoSUM(Size.m71755getWidthimpl(j)), lazyLayoutMeasureScope.mo69618toDpu2uoSUM(Size.m71752getHeightimpl(j)));
        }
        return DpSize.Companion.m73949getUnspecifiedMYxV2XQ();
    }

    /* renamed from: e */
    public static long m69202e(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (j != DpSize.Companion.m73949getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(lazyLayoutMeasureScope.mo69622toPx0680j_4(DpSize.m73940getWidthD9Ej5fM(j)), lazyLayoutMeasureScope.mo69622toPx0680j_4(DpSize.m73938getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m71763getUnspecifiedNHjbRc();
    }

    /* renamed from: f */
    public static long m69201f(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / lazyLayoutMeasureScope.getFontScale());
    }

    /* renamed from: g */
    public static long m69200g(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }

    /* renamed from: h */
    public static long m69199h(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        return TextUnitKt.getSp(i / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }
}