package p000;

import androidx.compose.material.Colors;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* renamed from: vE */
/* loaded from: classes.dex */
public final class C16895vE implements ElevationOverlay {

    /* renamed from: a */
    public static final C16895vE f108025a = new C16895vE();

    @Override // androidx.compose.material.ElevationOverlay
    /* renamed from: apply-7g2Lkgo */
    public long mo70207apply7g2Lkgo(long j, float f, Composer composer, int i) {
        long m60851a;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (C3623Dp.m73841compareTo0680j_4(f, C3623Dp.m73842constructorimpl(0)) > 0 && !colors.isLight()) {
            m60851a = ElevationOverlayKt.m60851a(j, f, composer, i & WebSocketProtocol.PAYLOAD_SHORT);
            j = ColorKt.m71964compositeOverOWjLjI(m60851a, j);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }
}