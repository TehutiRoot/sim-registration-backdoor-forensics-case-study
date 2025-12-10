package p000;

import androidx.compose.foundation.gestures.ScrollConfig;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Y3 */
/* loaded from: classes.dex */
public final class C1711Y3 implements ScrollConfig {

    /* renamed from: a */
    public static final C1711Y3 f7764a = new C1711Y3();

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE  reason: not valid java name */
    public long mo69371calculateMouseWheelScroll8xgXZGE(Density calculateMouseWheelScroll, PointerEvent event, long j) {
        Intrinsics.checkNotNullParameter(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        Intrinsics.checkNotNullParameter(event, "event");
        List<PointerInputChange> changes = event.getChanges();
        Offset m71675boximpl = Offset.m71675boximpl(Offset.Companion.m71702getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m71675boximpl = Offset.m71675boximpl(Offset.m71691plusMKHz9U(m71675boximpl.m71696unboximpl(), changes.get(i).m72900getScrollDeltaF1C5BW0()));
        }
        return Offset.m71693timestuRUvjQ(m71675boximpl.m71696unboximpl(), -calculateMouseWheelScroll.mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(64)));
    }
}