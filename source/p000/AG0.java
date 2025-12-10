package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: AG0 */
/* loaded from: classes5.dex */
public final class AG0 implements InterfaceC23279zG0 {

    /* renamed from: a */
    public final Map f65a;

    /* renamed from: b */
    public final Function1 f66b;

    public AG0(Map map, Function1 function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f65a = map;
        this.f66b = function1;
    }

    /* renamed from: a */
    public Set m69129a() {
        return getMap().entrySet();
    }

    /* renamed from: b */
    public Set m69128b() {
        return getMap().keySet();
    }

    /* renamed from: c */
    public int m69127c() {
        return getMap().size();
    }

    @Override // java.util.Map
    public void clear() {
        getMap().clear();
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
            return this.f66b.invoke(obj);
        }
        return obj2;
    }

    /* renamed from: e */
    public Collection m69126e() {
        return getMap().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m69129a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return getMap().get(obj);
    }

    @Override // p000.InterfaceC23279zG0, p000.InterfaceC18323Qn0
    public Map getMap() {
        return this.f65a;
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
        return m69128b();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return getMap().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        getMap().putAll(from);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return getMap().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m69127c();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m69126e();
    }
}
