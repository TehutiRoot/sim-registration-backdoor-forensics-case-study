package p000;

import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: c70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C19296c70 implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final SlotTable f39329a;

    /* renamed from: b */
    public final int f39330b;

    /* renamed from: c */
    public int f39331c;

    /* renamed from: d */
    public final int f39332d;

    public C19296c70(SlotTable table, int i, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f39329a = table;
        this.f39330b = i2;
        this.f39331c = i;
        this.f39332d = table.getVersion$runtime_release();
        if (!table.getWriter$runtime_release()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public CompositionGroup next() {
        int m60188i;
        m51706b();
        int i = this.f39331c;
        m60188i = SlotTableKt.m60188i(this.f39329a.getGroups(), i);
        this.f39331c = m60188i + i;
        return new RJ1(this.f39329a, i, this.f39332d);
    }

    /* renamed from: b */
    public final void m51706b() {
        if (this.f39329a.getVersion$runtime_release() == this.f39332d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f39331c < this.f39330b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
