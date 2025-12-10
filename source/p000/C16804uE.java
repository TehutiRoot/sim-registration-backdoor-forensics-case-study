package p000;

import androidx.compose.material.Colors;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* renamed from: uE */
/* loaded from: classes.dex */
public final class C16804uE implements ElevationOverlay {

    /* renamed from: a */
    public static final C16804uE f107312a = new C16804uE();

    @Override // androidx.compose.material.ElevationOverlay
    /* renamed from: apply-7g2Lkgo */
    public long mo70023apply7g2Lkgo(long j, float f, Composer composer, int i) {
        long m60901a;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (C3641Dp.m73657compareTo0680j_4(f, C3641Dp.m73658constructorimpl(0)) > 0 && !colors.isLight()) {
            m60901a = ElevationOverlayKt.m60901a(j, f, composer, i & WebSocketProtocol.PAYLOAD_SHORT);
            j = ColorKt.m71780compositeOverOWjLjI(m60901a, j);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }
}
