package p000;

import androidx.compose.p003ui.input.pointer.InternalPointerEvent;
import androidx.compose.p003ui.input.pointer.PointerId;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputEvent;
import androidx.compose.p003ui.input.pointer.PointerInputEventData;
import androidx.compose.p003ui.input.pointer.PositionCalculator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Jl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17903Jl1 {

    /* renamed from: a */
    public final Map f3097a = new LinkedHashMap();

    /* renamed from: Jl1$a */
    /* loaded from: classes2.dex */
    public static final class C0682a {

        /* renamed from: a */
        public final long f3098a;

        /* renamed from: b */
        public final long f3099b;

        /* renamed from: c */
        public final boolean f3100c;

        /* renamed from: d */
        public final int f3101d;

        public /* synthetic */ C0682a(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        /* renamed from: a */
        public final boolean m67806a() {
            return this.f3100c;
        }

        /* renamed from: b */
        public final long m67805b() {
            return this.f3099b;
        }

        /* renamed from: c */
        public final long m67804c() {
            return this.f3098a;
        }

        public C0682a(long j, long j2, boolean z, int i) {
            this.f3098a = j;
            this.f3099b = j2;
            this.f3100c = z;
            this.f3101d = i;
        }
    }

    /* renamed from: a */
    public final void m67808a() {
        this.f3097a.clear();
    }

    /* renamed from: b */
    public final InternalPointerEvent m67807b(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long j;
        boolean m67806a;
        long mo72962screenToLocalMKHz9U;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = pointers.get(i);
            C0682a c0682a = (C0682a) this.f3097a.get(PointerId.m72878boximpl(pointerInputEventData.m72909getIdJ3iCeTQ()));
            if (c0682a == null) {
                j = pointerInputEventData.getUptime();
                mo72962screenToLocalMKHz9U = pointerInputEventData.m72910getPositionF1C5BW0();
                m67806a = false;
            } else {
                long m67804c = c0682a.m67804c();
                j = m67804c;
                m67806a = c0682a.m67806a();
                mo72962screenToLocalMKHz9U = positionCalculator.mo72962screenToLocalMKHz9U(c0682a.m67805b());
            }
            linkedHashMap.put(PointerId.m72878boximpl(pointerInputEventData.m72909getIdJ3iCeTQ()), new PointerInputChange(pointerInputEventData.m72909getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m72910getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), j, mo72962screenToLocalMKHz9U, m67806a, false, pointerInputEventData.m72913getTypeT8wyACA(), (List) pointerInputEventData.getHistorical(), pointerInputEventData.m72912getScrollDeltaF1C5BW0(), (DefaultConstructorMarker) null));
            if (pointerInputEventData.getDown()) {
                this.f3097a.put(PointerId.m72878boximpl(pointerInputEventData.m72909getIdJ3iCeTQ()), new C0682a(pointerInputEventData.getUptime(), pointerInputEventData.m72911getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m72913getTypeT8wyACA(), null));
            } else {
                this.f3097a.remove(PointerId.m72878boximpl(pointerInputEventData.m72909getIdJ3iCeTQ()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }
}