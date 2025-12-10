package p000;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.platform.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yp */
/* loaded from: classes.dex */
public final class C1782Yp {

    /* renamed from: a */
    public final ViewConfiguration f7866a;

    /* renamed from: b */
    public int f7867b;

    /* renamed from: c */
    public PointerInputChange f7868c;

    public C1782Yp(ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f7866a = viewConfiguration;
    }

    /* renamed from: a */
    public final int m65293a() {
        return this.f7867b;
    }

    /* renamed from: b */
    public final boolean m65292b(PointerInputChange prevClick, PointerInputChange newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (Offset.m71500getDistanceimpl(Offset.m71506minusMKHz9U(newClick.m72714getPositionF1C5BW0(), prevClick.m72714getPositionF1C5BW0())) < 100.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m65291c(PointerInputChange prevClick, PointerInputChange newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.f7866a.getDoubleTapTimeoutMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m65290d(PointerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PointerInputChange pointerInputChange = this.f7868c;
        PointerInputChange pointerInputChange2 = event.getChanges().get(0);
        if (pointerInputChange != null && m65291c(pointerInputChange, pointerInputChange2) && m65292b(pointerInputChange, pointerInputChange2)) {
            this.f7867b++;
        } else {
            this.f7867b = 1;
        }
        this.f7868c = pointerInputChange2;
    }
}
