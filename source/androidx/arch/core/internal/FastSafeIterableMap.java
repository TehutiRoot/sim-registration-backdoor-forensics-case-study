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
    public final HashMap f10079e = new HashMap();

    @Nullable
    public Map.Entry<K, V> ceil(K k) {
        if (contains(k)) {
            return ((SafeIterableMap.C2276c) this.f10079e.get(k)).f10090d;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f10079e.containsKey(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    public SafeIterableMap.C2276c get(K k) {
        return (SafeIterableMap.C2276c) this.f10079e.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K k, @NonNull V v) {
        SafeIterableMap.C2276c c2276c = get(k);
        if (c2276c != null) {
            return (V) c2276c.f10088b;
        }
        this.f10079e.put(k, m64080a(k, v));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k) {
        V v = (V) super.remove(k);
        this.f10079e.remove(k);
        return v;
    }
}
