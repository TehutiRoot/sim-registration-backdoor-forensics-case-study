package p000;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderEntriesIterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* renamed from: EG0 */
/* loaded from: classes2.dex */
public final class EG0 extends MapEntry implements Map.Entry, KMutableMap.Entry {

    /* renamed from: c */
    public final PersistentHashMapBuilderEntriesIterator f1302c;

    /* renamed from: d */
    public Object f1303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EG0(PersistentHashMapBuilderEntriesIterator parentIterator, Object obj, Object obj2) {
        super(obj, obj2);
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.f1302c = parentIterator;
        this.f1303d = obj2;
    }

    /* renamed from: a */
    public void m68675a(Object obj) {
        this.f1303d = obj;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object getValue() {
        return this.f1303d;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        m68675a(obj);
        this.f1302c.setValue(getKey(), obj);
        return value;
    }
}