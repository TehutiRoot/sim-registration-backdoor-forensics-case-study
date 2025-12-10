package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Rn0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18387Rn0 implements InterfaceC18323Qn0 {

    /* renamed from: a */
    public final Map f5428a;

    /* renamed from: b */
    public final Function1 f5429b;

    public C18387Rn0(Map map, Function1 function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f5428a = map;
        this.f5429b = function1;
    }

    /* renamed from: a */
    public Set m66415a() {
        return getMap().entrySet();
    }

    /* renamed from: b */
    public Set m66414b() {
        return getMap().keySet();
    }

    /* renamed from: c */
    public int m66413c() {
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

    @Override // p000.InterfaceC18323Qn0
    /* renamed from: d */
    public Object mo66412d(Object obj) {
        Map map = getMap();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return this.f5429b.invoke(obj);
        }
        return obj2;
    }

    /* renamed from: e */
    public Collection m66411e() {
        return getMap().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m66415a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return getMap().get(obj);
    }

    @Override // p000.InterfaceC18323Qn0
    public Map getMap() {
        return this.f5428a;
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
        return m66414b();
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
        return m66413c();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m66411e();
    }
}
