package p000;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.unit.TextUnitType;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jG */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC11522jG {
    /* renamed from: a */
    public static int m29253a(Density density, long j) {
        return AbstractC21140mr0.roundToInt(density.mo69437toPxR2X_6o(j));
    }

    /* renamed from: b */
    public static int m29252b(Density density, float f) {
        float mo69438toPx0680j_4 = density.mo69438toPx0680j_4(f);
        if (Float.isInfinite(mo69438toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return AbstractC21140mr0.roundToInt(mo69438toPx0680j_4);
    }

    /* renamed from: c */
    public static float m29251c(Density density, long j) {
        if (TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(j), TextUnitType.Companion.m73872getSpUIouoOA())) {
            return C3641Dp.m73658constructorimpl(TextUnit.m73839getValueimpl(j) * density.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: d */
    public static float m29250d(Density density, float f) {
        return C3641Dp.m73658constructorimpl(f / density.getDensity());
    }

    /* renamed from: e */
    public static float m29249e(Density density, int i) {
        return C3641Dp.m73658constructorimpl(i / density.getDensity());
    }

    /* renamed from: f */
    public static long m29248f(Density density, long j) {
        if (j != Size.Companion.m71579getUnspecifiedNHjbRc()) {
            return DpKt.m73680DpSizeYgX7TsA(density.mo69434toDpu2uoSUM(Size.m71571getWidthimpl(j)), density.mo69434toDpu2uoSUM(Size.m71568getHeightimpl(j)));
        }
        return DpSize.Companion.m73765getUnspecifiedMYxV2XQ();
    }

    /* renamed from: g */
    public static float m29247g(Density density, long j) {
        if (TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(j), TextUnitType.Companion.m73872getSpUIouoOA())) {
            return TextUnit.m73839getValueimpl(j) * density.getFontScale() * density.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: h */
    public static float m29246h(Density density, float f) {
        return f * density.getDensity();
    }

    /* renamed from: i */
    public static Rect m29245i(Density density, DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(density.mo69438toPx0680j_4(dpRect.m73741getLeftD9Ej5fM()), density.mo69438toPx0680j_4(dpRect.m73743getTopD9Ej5fM()), density.mo69438toPx0680j_4(dpRect.m73742getRightD9Ej5fM()), density.mo69438toPx0680j_4(dpRect.m73740getBottomD9Ej5fM()));
    }

    /* renamed from: j */
    public static long m29244j(Density density, long j) {
        if (j != DpSize.Companion.m73765getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(density.mo69438toPx0680j_4(DpSize.m73756getWidthD9Ej5fM(j)), density.mo69438toPx0680j_4(DpSize.m73754getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m71579getUnspecifiedNHjbRc();
    }

    /* renamed from: k */
    public static long m29243k(Density density, float f) {
        return TextUnitKt.getSp(f / density.getFontScale());
    }

    /* renamed from: l */
    public static long m29242l(Density density, float f) {
        return TextUnitKt.getSp(f / (density.getFontScale() * density.getDensity()));
    }

    /* renamed from: m */
    public static long m29241m(Density density, int i) {
        return TextUnitKt.getSp(i / (density.getFontScale() * density.getDensity()));
    }
}
