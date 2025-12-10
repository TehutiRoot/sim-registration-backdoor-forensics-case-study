package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: GG0 */
/* loaded from: classes5.dex */
public final class GG0 implements FG0 {

    /* renamed from: a */
    public final Map f1923a;

    /* renamed from: b */
    public final Function1 f1924b;

    public GG0(Map map, Function1 function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f1923a = map;
        this.f1924b = function1;
    }

    /* renamed from: a */
    public Set m68299a() {
        return getMap().entrySet();
    }

    /* renamed from: b */
    public Set m68298b() {
        return getMap().keySet();
    }

    /* renamed from: c */
    public int m68297c() {
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

    @Override // p000.InterfaceC18753Wn0
    /* renamed from: d */
    public Object mo65568d(Object obj) {
        Map map = getMap();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return this.f1924b.invoke(obj);
        }
        return obj2;
    }

    /* renamed from: e */
    public Collection m68296e() {
        return getMap().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m68299a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return getMap().get(obj);
    }

    @Override // p000.FG0, p000.InterfaceC18753Wn0
    public Map getMap() {
        return this.f1923a;
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
        return m68298b();
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
        return m68297c();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m68296e();
    }
}