package p000;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: WK1 */
/* loaded from: classes2.dex */
public abstract class WK1 implements Set, KMutableSet {

    /* renamed from: a */
    public final SnapshotStateMap f7259a;

    public WK1(SnapshotStateMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f7259a = map;
    }

    /* renamed from: a */
    public final SnapshotStateMap m65767a() {
        return this.f7259a;
    }

    /* renamed from: b */
    public int m65766b() {
        return this.f7259a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f7259a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f7259a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m65766b();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }
}