package p000;

import androidx.compose.foundation.gestures.ScrollConfig;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Y3 */
/* loaded from: classes.dex */
public final class C1721Y3 implements ScrollConfig {

    /* renamed from: a */
    public static final C1721Y3 f7640a = new C1721Y3();

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE  reason: not valid java name */
    public long mo69185calculateMouseWheelScroll8xgXZGE(Density calculateMouseWheelScroll, PointerEvent event, long j) {
        Intrinsics.checkNotNullParameter(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        Intrinsics.checkNotNullParameter(event, "event");
        List<PointerInputChange> changes = event.getChanges();
        Offset m71491boximpl = Offset.m71491boximpl(Offset.Companion.m71518getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m71491boximpl = Offset.m71491boximpl(Offset.m71507plusMKHz9U(m71491boximpl.m71512unboximpl(), changes.get(i).m72716getScrollDeltaF1C5BW0()));
        }
        return Offset.m71509timestuRUvjQ(m71491boximpl.m71512unboximpl(), -calculateMouseWheelScroll.mo69438toPx0680j_4(C3641Dp.m73658constructorimpl(64)));
    }
}
