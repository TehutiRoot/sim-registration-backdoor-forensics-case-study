package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* renamed from: e */
    public final HashMap f10167e = new HashMap();

    @Nullable
    public Map.Entry<K, V> ceil(K k) {
        if (contains(k)) {
            return ((SafeIterableMap.C2258c) this.f10167e.get(k)).f10178d;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f10167e.containsKey(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    public SafeIterableMap.C2258c get(K k) {
        return (SafeIterableMap.C2258c) this.f10167e.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K k, @NonNull V v) {
        SafeIterableMap.C2258c c2258c = get(k);
        if (c2258c != null) {
            return (V) c2258c.f10176b;
        }
        this.f10167e.put(k, m64031a(k, v));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k) {
        V v = (V) super.remove(k);
        this.f10167e.remove(k);
        return v;
    }
}