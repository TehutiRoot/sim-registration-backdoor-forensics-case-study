package p000;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: WL1 */
/* loaded from: classes2.dex */
public final class WL1 extends VL1 implements Iterator, KMutableIterator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WL1(SnapshotStateMap map, Iterator iterator) {
        super(map, iterator);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry m65855g = m65855g();
        if (m65855g != null) {
            m65858c();
            return m65855g.getKey();
        }
        throw new IllegalStateException();
    }
}
