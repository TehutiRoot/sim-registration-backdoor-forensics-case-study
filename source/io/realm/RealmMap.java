package io.realm;

import io.realm.internal.Freezable;
import io.realm.internal.ManageableObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class RealmMap<K, V> implements Map<K, V>, ManageableObject, Freezable<RealmMap<K, V>> {
    protected final AbstractC11261c mapStrategy;

    /* renamed from: io.realm.RealmMap$b */
    /* loaded from: classes5.dex */
    public static class C11260b extends AbstractC11261c {

        /* renamed from: a */
        public final AbstractC17683Gn0 f66612a;

        public C11260b(AbstractC17683Gn0 abstractC17683Gn0) {
            this.f66612a = abstractC17683Gn0;
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: a */
        public void mo29636a(RealmMap realmMap, MapChangeListener mapChangeListener) {
            this.f66612a.m68187a(realmMap, mapChangeListener);
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: b */
        public void mo29635b(RealmMap realmMap, RealmChangeListener realmChangeListener) {
            this.f66612a.m68186b(realmMap, realmChangeListener);
        }

        @Override // java.util.Map
        public void clear() {
            this.f66612a.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f66612a.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f66612a.containsValue(obj);
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: e */
        public Class mo29634e() {
            return this.f66612a.m68183i();
        }

        @Override // java.util.Map
        public Set entrySet() {
            return this.f66612a.entrySet();
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: f */
        public String mo29633f() {
            return this.f66612a.m68184h();
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: g */
        public Object mo29632g(Object obj, Object obj2) {
            return this.f66612a.put(obj, obj2);
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.f66612a.get(obj);
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: h */
        public void mo29631h() {
            this.f66612a.m68181k();
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: i */
        public void mo29630i(RealmMap realmMap, MapChangeListener mapChangeListener) {
            this.f66612a.m68180l(realmMap, mapChangeListener);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f66612a.isEmpty();
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return this.f66612a.isFrozen();
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
            return this.f66612a.isManaged();
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
            return this.f66612a.isValid();
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: j */
        public void mo29629j(RealmMap realmMap, RealmChangeListener realmChangeListener) {
            this.f66612a.m68179m(realmMap, realmChangeListener);
        }

        @Override // io.realm.internal.Freezable
        /* renamed from: k */
        public RealmMap freeze() {
            return this.f66612a.freeze();
        }

        @Override // java.util.Map
        public Set keySet() {
            return this.f66612a.keySet();
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            this.f66612a.putAll(map);
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            return this.f66612a.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f66612a.size();
        }

        @Override // java.util.Map
        public Collection values() {
            return this.f66612a.values();
        }
    }

    /* renamed from: io.realm.RealmMap$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11261c implements Map, ManageableObject, Freezable {
        /* renamed from: a */
        public abstract void mo29636a(RealmMap realmMap, MapChangeListener mapChangeListener);

        /* renamed from: b */
        public abstract void mo29635b(RealmMap realmMap, RealmChangeListener realmChangeListener);

        /* renamed from: c */
        public void m29637c(Object obj) {
            if (obj != null) {
                if (obj.getClass() == String.class) {
                    String str = (String) obj;
                    if (str.contains(".") || str.contains("$")) {
                        throw new IllegalArgumentException("Keys containing dots ('.') or dollar signs ('$') are not allowed.");
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("Null keys are not allowed.");
        }

        /* renamed from: e */
        public abstract Class mo29634e();

        /* renamed from: f */
        public abstract String mo29633f();

        /* renamed from: g */
        public abstract Object mo29632g(Object obj, Object obj2);

        /* renamed from: h */
        public abstract void mo29631h();

        /* renamed from: i */
        public abstract void mo29630i(RealmMap realmMap, MapChangeListener mapChangeListener);

        /* renamed from: j */
        public abstract void mo29629j(RealmMap realmMap, RealmChangeListener realmChangeListener);

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            m29637c(obj);
            return mo29632g(obj, obj2);
        }
    }

    /* renamed from: io.realm.RealmMap$d */
    /* loaded from: classes5.dex */
    public static class C11262d extends AbstractC11261c {

        /* renamed from: a */
        public final Map f66613a;

        public C11262d() {
            this.f66613a = new HashMap();
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: a */
        public void mo29636a(RealmMap realmMap, MapChangeListener mapChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmMaps do not support change listeners.");
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: b */
        public void mo29635b(RealmMap realmMap, RealmChangeListener realmChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmMaps do not support change listeners.");
        }

        @Override // java.util.Map
        public void clear() {
            this.f66613a.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f66613a.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f66613a.containsValue(obj);
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: e */
        public Class mo29634e() {
            throw new UnsupportedOperationException("Unmanaged maps do not support retrieving the value class.");
        }

        @Override // java.util.Map
        public Set entrySet() {
            return this.f66613a.entrySet();
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: f */
        public String mo29633f() {
            throw new UnsupportedOperationException("Unmanaged maps do not support retrieving the value class name.");
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: g */
        public Object mo29632g(Object obj, Object obj2) {
            return this.f66613a.put(obj, obj2);
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.f66613a.get(obj);
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: h */
        public void mo29631h() {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmMaps do not support change listeners.");
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: i */
        public void mo29630i(RealmMap realmMap, MapChangeListener mapChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmMaps do not support change listeners.");
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f66613a.isEmpty();
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return false;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
            return false;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
            return true;
        }

        @Override // io.realm.RealmMap.AbstractC11261c
        /* renamed from: j */
        public void mo29629j(RealmMap realmMap, RealmChangeListener realmChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmMaps do not support change listeners.");
        }

        @Override // io.realm.internal.Freezable
        /* renamed from: k */
        public RealmMap freeze() {
            throw new UnsupportedOperationException("Unmanaged RealmMaps cannot be frozen.");
        }

        @Override // java.util.Map
        public Set keySet() {
            return this.f66613a.keySet();
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            this.f66613a.putAll(map);
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            return this.f66613a.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f66613a.size();
        }

        @Override // java.util.Map
        public Collection values() {
            return this.f66613a.values();
        }
    }

    public RealmMap() {
        this.mapStrategy = new C11262d();
    }

    /* renamed from: a */
    public Class m29640a() {
        return this.mapStrategy.mo29634e();
    }

    public void addChangeListener(MapChangeListener<K, V> mapChangeListener) {
        this.mapStrategy.mo29636a(this, mapChangeListener);
    }

    /* renamed from: b */
    public String m29639b() {
        return this.mapStrategy.mo29633f();
    }

    @Override // java.util.Map
    public void clear() {
        this.mapStrategy.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return this.mapStrategy.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return this.mapStrategy.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.mapStrategy.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) this.mapStrategy.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.mapStrategy.isEmpty();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        return this.mapStrategy.isFrozen();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
        return this.mapStrategy.isManaged();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isValid() {
        return this.mapStrategy.isValid();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.mapStrategy.keySet();
    }

    @Override // java.util.Map
    public V put(K k, @Nullable V v) {
        return (V) this.mapStrategy.put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.mapStrategy.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return (V) this.mapStrategy.remove(obj);
    }

    public void removeAllChangeListeners() {
        this.mapStrategy.mo29631h();
    }

    public void removeChangeListener(MapChangeListener<K, V> mapChangeListener) {
        this.mapStrategy.mo29630i(this, mapChangeListener);
    }

    @Override // java.util.Map
    public int size() {
        return this.mapStrategy.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.mapStrategy.values();
    }

    public void addChangeListener(RealmChangeListener<RealmMap<K, V>> realmChangeListener) {
        this.mapStrategy.mo29635b(this, realmChangeListener);
    }

    @Override // io.realm.internal.Freezable
    public RealmMap<K, V> freeze() {
        return (RealmMap) this.mapStrategy.freeze();
    }

    public void removeChangeListener(RealmChangeListener<RealmMap<K, V>> realmChangeListener) {
        this.mapStrategy.mo29629j(this, realmChangeListener);
    }

    public RealmMap(Map map) {
        this();
        this.mapStrategy.putAll(map);
    }

    public RealmMap(AbstractC11261c abstractC11261c) {
        this.mapStrategy = abstractC11261c;
    }
}
