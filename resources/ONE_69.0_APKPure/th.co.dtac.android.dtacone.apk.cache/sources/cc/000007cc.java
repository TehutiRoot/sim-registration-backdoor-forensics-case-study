package p000;

import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: ID */
/* loaded from: classes2.dex */
public final class C0573ID implements Iterable, Iterator, KMappedMarker {

    /* renamed from: a */
    public final SlotTable f2605a;

    /* renamed from: b */
    public final int f2606b;

    /* renamed from: c */
    public final int f2607c;

    /* renamed from: d */
    public final int f2608d;

    /* renamed from: e */
    public int f2609e;

    public C0573ID(SlotTable table, int i) {
        int m60141f;
        int slotsSize;
        Intrinsics.checkNotNullParameter(table, "table");
        this.f2605a = table;
        this.f2606b = i;
        m60141f = SlotTableKt.m60141f(table.getGroups(), i);
        this.f2607c = m60141f;
        if (i + 1 < table.getGroupsSize()) {
            slotsSize = SlotTableKt.m60141f(table.getGroups(), i + 1);
        } else {
            slotsSize = table.getSlotsSize();
        }
        this.f2608d = slotsSize;
        this.f2609e = m60141f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f2609e < this.f2608d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj;
        int i = this.f2609e;
        if (i >= 0 && i < this.f2605a.getSlots().length) {
            obj = this.f2605a.getSlots()[this.f2609e];
        } else {
            obj = null;
        }
        this.f2609e++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }
}