package p000;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderEntriesIterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* renamed from: yG0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C23107yG0 extends MapEntry implements Map.Entry, KMutableMap.Entry {

    /* renamed from: c */
    public final PersistentHashMapBuilderEntriesIterator f108662c;

    /* renamed from: d */
    public Object f108663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23107yG0(PersistentHashMapBuilderEntriesIterator parentIterator, Object obj, Object obj2) {
        super(obj, obj2);
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.f108662c = parentIterator;
        this.f108663d = obj2;
    }

    /* renamed from: a */
    public void m324a(Object obj) {
        this.f108663d = obj;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object getValue() {
        return this.f108663d;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        m324a(obj);
        this.f108662c.setValue(getKey(), obj);
        return value;
    }
}
