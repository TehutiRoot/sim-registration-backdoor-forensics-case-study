package p000;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* renamed from: xG0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22935xG0 extends MapEntry implements Map.Entry, KMutableMap.Entry {

    /* renamed from: c */
    public final Map f108294c;

    /* renamed from: d */
    public LinkedValue f108295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22935xG0(Map mutableMap, Object obj, LinkedValue links) {
        super(obj, links.getValue());
        Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f108294c = mutableMap;
        this.f108295d = links;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object getValue() {
        return this.f108295d.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = this.f108295d.getValue();
        this.f108295d = this.f108295d.withValue(obj);
        this.f108294c.put(getKey(), this.f108295d);
        return value;
    }
}
