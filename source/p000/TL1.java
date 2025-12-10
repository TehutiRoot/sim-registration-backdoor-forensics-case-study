package p000;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateListKt;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* renamed from: TL1 */
/* loaded from: classes2.dex */
public final class TL1 implements ListIterator, KMutableListIterator {

    /* renamed from: a */
    public final SnapshotStateList f5996a;

    /* renamed from: b */
    public int f5997b;

    /* renamed from: c */
    public int f5998c;

    public TL1(SnapshotStateList list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f5996a = list;
        this.f5997b = i - 1;
        this.f5998c = list.getModification$runtime_release();
    }

    /* renamed from: a */
    private final void m66208a() {
        if (this.f5996a.getModification$runtime_release() == this.f5998c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        m66208a();
        this.f5996a.add(this.f5997b + 1, obj);
        this.f5997b++;
        this.f5998c = this.f5996a.getModification$runtime_release();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f5997b < this.f5996a.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.f5997b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        m66208a();
        int i = this.f5997b + 1;
        SnapshotStateListKt.m59897b(i, this.f5996a.size());
        Object obj = this.f5996a.get(i);
        this.f5997b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f5997b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        m66208a();
        SnapshotStateListKt.m59897b(this.f5997b, this.f5996a.size());
        this.f5997b--;
        return this.f5996a.get(this.f5997b);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f5997b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        m66208a();
        this.f5996a.remove(this.f5997b);
        this.f5997b--;
        this.f5998c = this.f5996a.getModification$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        m66208a();
        this.f5996a.set(this.f5997b, obj);
        this.f5998c = this.f5996a.getModification$runtime_release();
    }
}
