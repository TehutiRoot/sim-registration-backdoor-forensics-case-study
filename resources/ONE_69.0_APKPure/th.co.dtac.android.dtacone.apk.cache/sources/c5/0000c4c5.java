package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MapBuilder<K, V> {

    /* renamed from: a */
    public final Map f61283a;

    public MapBuilder(int i) {
        this.f61283a = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i) {
        return new MapBuilder<>(i);
    }

    public Map<K, V> build() {
        if (this.f61283a.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.f61283a);
    }

    public MapBuilder<K, V> put(K k, V v) {
        this.f61283a.put(k, v);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.f61283a.putAll(map);
        return this;
    }
}