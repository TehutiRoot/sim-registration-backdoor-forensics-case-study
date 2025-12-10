package p000;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.platform.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yp */
/* loaded from: classes.dex */
public final class C1762Yp {

    /* renamed from: a */
    public final ViewConfiguration f7993a;

    /* renamed from: b */
    public int f7994b;

    /* renamed from: c */
    public PointerInputChange f7995c;

    public C1762Yp(ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f7993a = viewConfiguration;
    }

    /* renamed from: a */
    public final int m65352a() {
        return this.f7994b;
    }

    /* renamed from: b */
    public final boolean m65351b(PointerInputChange prevClick, PointerInputChange newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (Offset.m71684getDistanceimpl(Offset.m71690minusMKHz9U(newClick.m72898getPositionF1C5BW0(), prevClick.m72898getPositionF1C5BW0())) < 100.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m65350c(PointerInputChange prevClick, PointerInputChange newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.f7993a.getDoubleTapTimeoutMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m65349d(PointerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PointerInputChange pointerInputChange = this.f7995c;
        PointerInputChange pointerInputChange2 = event.getChanges().get(0);
        if (pointerInputChange != null && m65350c(pointerInputChange, pointerInputChange2) && m65351b(pointerInputChange, pointerInputChange2)) {
            this.f7994b++;
        } else {
            this.f7994b = 1;
        }
        this.f7995c = pointerInputChange2;
    }
}