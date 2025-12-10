package p000;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: ZJ1 */
/* loaded from: classes2.dex */
public abstract class ZJ1 implements Set, KMutableSet {

    /* renamed from: a */
    public final SnapshotStateMap f8013a;

    public ZJ1(SnapshotStateMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f8013a = map;
    }

    /* renamed from: a */
    public final SnapshotStateMap m65245a() {
        return this.f8013a;
    }

    /* renamed from: b */
    public int m65244b() {
        return this.f8013a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f8013a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f8013a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m65244b();
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
