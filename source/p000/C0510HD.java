package p000;

import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: HD */
/* loaded from: classes2.dex */
public final class C0510HD implements Iterable, Iterator, KMappedMarker {

    /* renamed from: a */
    public final SlotTable f2130a;

    /* renamed from: b */
    public final int f2131b;

    /* renamed from: c */
    public final int f2132c;

    /* renamed from: d */
    public final int f2133d;

    /* renamed from: e */
    public int f2134e;

    public C0510HD(SlotTable table, int i) {
        int m60191f;
        int slotsSize;
        Intrinsics.checkNotNullParameter(table, "table");
        this.f2130a = table;
        this.f2131b = i;
        m60191f = SlotTableKt.m60191f(table.getGroups(), i);
        this.f2132c = m60191f;
        if (i + 1 < table.getGroupsSize()) {
            slotsSize = SlotTableKt.m60191f(table.getGroups(), i + 1);
        } else {
            slotsSize = table.getSlotsSize();
        }
        this.f2133d = slotsSize;
        this.f2134e = m60191f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f2134e < this.f2133d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj;
        int i = this.f2134e;
        if (i >= 0 && i < this.f2130a.getSlots().length) {
            obj = this.f2130a.getSlots()[this.f2134e];
        } else {
            obj = null;
        }
        this.f2134e++;
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
