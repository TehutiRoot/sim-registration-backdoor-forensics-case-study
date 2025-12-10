package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Xn0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18818Xn0 implements InterfaceC18753Wn0 {

    /* renamed from: a */
    public final Map f7664a;

    /* renamed from: b */
    public final Function1 f7665b;

    public C18818Xn0(Map map, Function1 function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f7664a = map;
        this.f7665b = function1;
    }

    /* renamed from: a */
    public Set m65571a() {
        return getMap().entrySet();
    }

    /* renamed from: b */
    public Set m65570b() {
        return getMap().keySet();
    }

    /* renamed from: c */
    public int m65569c() {
        return getMap().size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // p000.InterfaceC18753Wn0
    /* renamed from: d */
    public Object mo65568d(Object obj) {
        Map map = getMap();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return this.f7665b.invoke(obj);
        }
        return obj2;
    }

    /* renamed from: e */
    public Collection m65567e() {
        return getMap().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m65571a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return getMap().get(obj);
    }

    @Override // p000.InterfaceC18753Wn0
    public Map getMap() {
        return this.f7664a;
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m65570b();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m65569c();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m65567e();
    }
}