package p000;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* renamed from: DG0 */
/* loaded from: classes2.dex */
public final class DG0 extends MapEntry implements Map.Entry, KMutableMap.Entry {

    /* renamed from: c */
    public final Map f970c;

    /* renamed from: d */
    public LinkedValue f971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DG0(Map mutableMap, Object obj, LinkedValue links) {
        super(obj, links.getValue());
        Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f970c = mutableMap;
        this.f971d = links;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object getValue() {
        return this.f971d.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = this.f971d.getValue();
        this.f971d = this.f971d.withValue(obj);
        this.f970c.put(getKey(), this.f971d);
        return value;
    }
}