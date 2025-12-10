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

/* renamed from: Mk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18060Mk1 {

    /* renamed from: a */
    public final Map f3865a = new LinkedHashMap();

    /* renamed from: Mk1$a */
    /* loaded from: classes2.dex */
    public static final class C0892a {

        /* renamed from: a */
        public final long f3866a;

        /* renamed from: b */
        public final long f3867b;

        /* renamed from: c */
        public final boolean f3868c;

        /* renamed from: d */
        public final int f3869d;

        public /* synthetic */ C0892a(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        /* renamed from: a */
        public final boolean m67296a() {
            return this.f3868c;
        }

        /* renamed from: b */
        public final long m67295b() {
            return this.f3867b;
        }

        /* renamed from: c */
        public final long m67294c() {
            return this.f3866a;
        }

        public C0892a(long j, long j2, boolean z, int i) {
            this.f3866a = j;
            this.f3867b = j2;
            this.f3868c = z;
            this.f3869d = i;
        }
    }

    /* renamed from: a */
    public final void m67298a() {
        this.f3865a.clear();
    }

    /* renamed from: b */
    public final InternalPointerEvent m67297b(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long j;
        boolean m67296a;
        long mo72778screenToLocalMKHz9U;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = pointers.get(i);
            C0892a c0892a = (C0892a) this.f3865a.get(PointerId.m72694boximpl(pointerInputEventData.m72725getIdJ3iCeTQ()));
            if (c0892a == null) {
                j = pointerInputEventData.getUptime();
                mo72778screenToLocalMKHz9U = pointerInputEventData.m72726getPositionF1C5BW0();
                m67296a = false;
            } else {
                long m67294c = c0892a.m67294c();
                j = m67294c;
                m67296a = c0892a.m67296a();
                mo72778screenToLocalMKHz9U = positionCalculator.mo72778screenToLocalMKHz9U(c0892a.m67295b());
            }
            linkedHashMap.put(PointerId.m72694boximpl(pointerInputEventData.m72725getIdJ3iCeTQ()), new PointerInputChange(pointerInputEventData.m72725getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m72726getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), j, mo72778screenToLocalMKHz9U, m67296a, false, pointerInputEventData.m72729getTypeT8wyACA(), (List) pointerInputEventData.getHistorical(), pointerInputEventData.m72728getScrollDeltaF1C5BW0(), (DefaultConstructorMarker) null));
            if (pointerInputEventData.getDown()) {
                this.f3865a.put(PointerId.m72694boximpl(pointerInputEventData.m72725getIdJ3iCeTQ()), new C0892a(pointerInputEventData.getUptime(), pointerInputEventData.m72727getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m72729getTypeT8wyACA(), null));
            } else {
                this.f3865a.remove(PointerId.m72694boximpl(pointerInputEventData.m72725getIdJ3iCeTQ()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }
}
