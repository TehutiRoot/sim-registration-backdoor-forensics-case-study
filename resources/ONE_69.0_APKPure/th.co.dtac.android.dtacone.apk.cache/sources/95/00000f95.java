package p000;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateListKt;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* renamed from: QM1 */
/* loaded from: classes2.dex */
public final class QM1 implements ListIterator, KMutableListIterator {

    /* renamed from: a */
    public final SnapshotStateList f5212a;

    /* renamed from: b */
    public int f5213b;

    /* renamed from: c */
    public int f5214c;

    public QM1(SnapshotStateList list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f5212a = list;
        this.f5213b = i - 1;
        this.f5214c = list.getModification$runtime_release();
    }

    /* renamed from: a */
    private final void m66767a() {
        if (this.f5212a.getModification$runtime_release() == this.f5214c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        m66767a();
        this.f5212a.add(this.f5213b + 1, obj);
        this.f5213b++;
        this.f5214c = this.f5212a.getModification$runtime_release();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f5213b < this.f5212a.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.f5213b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        m66767a();
        int i = this.f5213b + 1;
        SnapshotStateListKt.m59847b(i, this.f5212a.size());
        Object obj = this.f5212a.get(i);
        this.f5213b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f5213b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        m66767a();
        SnapshotStateListKt.m59847b(this.f5213b, this.f5212a.size());
        this.f5213b--;
        return this.f5212a.get(this.f5213b);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f5213b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        m66767a();
        this.f5212a.remove(this.f5213b);
        this.f5213b--;
        this.f5214c = this.f5212a.getModification$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        m66767a();
        this.f5212a.set(this.f5213b, obj);
        this.f5214c = this.f5212a.getModification$runtime_release();
    }
}