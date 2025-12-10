package p000;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: UM1 */
/* loaded from: classes2.dex */
public final class UM1 extends SM1 implements Iterator, KMutableIterator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UM1(SnapshotStateMap map, Iterator iterator) {
        super(map, iterator);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry m66504g = m66504g();
        if (m66504g != null) {
            m66507c();
            return m66504g.getValue();
        }
        throw new IllegalStateException();
    }
}