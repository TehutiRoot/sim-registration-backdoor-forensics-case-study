package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import org.bson.assertions.Assertions;
import org.bson.util.CopyOnWriteMap;

/* renamed from: Pv */
/* loaded from: classes5.dex */
public final class C1123Pv implements Map, InterfaceC20549j50 {

    /* renamed from: a */
    public final ConcurrentMap f5055a;

    /* renamed from: b */
    public final InterfaceC20549j50 f5056b;

    public C1123Pv(ConcurrentMap concurrentMap, InterfaceC20549j50 interfaceC20549j50) {
        this.f5055a = (ConcurrentMap) Assertions.notNull("map", concurrentMap);
        this.f5056b = (InterfaceC20549j50) Assertions.notNull("function", interfaceC20549j50);
    }

    /* renamed from: a */
    public static Map m66891a(InterfaceC20549j50 interfaceC20549j50) {
        return new C1123Pv(CopyOnWriteMap.m24252i(), interfaceC20549j50);
    }

    @Override // p000.InterfaceC20549j50
    public Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.Map
    public void clear() {
        this.f5055a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5055a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f5055a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.f5055a.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f5055a.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        while (true) {
            Object obj2 = this.f5055a.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object apply = this.f5056b.apply(obj);
            if (apply == null) {
                return null;
            }
            this.f5055a.putIfAbsent(obj, apply);
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f5055a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f5055a.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f5055a.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f5055a.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f5055a.putAll(map);
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        return this.f5055a.putIfAbsent(obj, obj2);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f5055a.remove(obj, obj2);
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return this.f5055a.replace(obj, obj2, obj3);
    }

    @Override // java.util.Map
    public int size() {
        return this.f5055a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f5055a.values();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f5055a.remove(obj);
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        return this.f5055a.replace(obj, obj2);
    }
}