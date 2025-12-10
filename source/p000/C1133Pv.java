package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import org.bson.assertions.Assertions;
import org.bson.util.CopyOnWriteMap;

/* renamed from: Pv */
/* loaded from: classes5.dex */
public final class C1133Pv implements Map, InterfaceC19806f50 {

    /* renamed from: a */
    public final ConcurrentMap f4901a;

    /* renamed from: b */
    public final InterfaceC19806f50 f4902b;

    public C1133Pv(ConcurrentMap concurrentMap, InterfaceC19806f50 interfaceC19806f50) {
        this.f4901a = (ConcurrentMap) Assertions.notNull("map", concurrentMap);
        this.f4902b = (InterfaceC19806f50) Assertions.notNull("function", interfaceC19806f50);
    }

    /* renamed from: a */
    public static Map m66707a(InterfaceC19806f50 interfaceC19806f50) {
        return new C1133Pv(CopyOnWriteMap.m24063i(), interfaceC19806f50);
    }

    @Override // p000.InterfaceC19806f50
    public Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.Map
    public void clear() {
        this.f4901a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f4901a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f4901a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.f4901a.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f4901a.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        while (true) {
            Object obj2 = this.f4901a.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object apply = this.f4902b.apply(obj);
            if (apply == null) {
                return null;
            }
            this.f4901a.putIfAbsent(obj, apply);
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f4901a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f4901a.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f4901a.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f4901a.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f4901a.putAll(map);
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        return this.f4901a.putIfAbsent(obj, obj2);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f4901a.remove(obj, obj2);
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return this.f4901a.replace(obj, obj2, obj3);
    }

    @Override // java.util.Map
    public int size() {
        return this.f4901a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f4901a.values();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f4901a.remove(obj);
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        return this.f4901a.replace(obj, obj2);
    }
}
