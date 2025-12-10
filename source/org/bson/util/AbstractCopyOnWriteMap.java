package org.bson.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.bson.assertions.Assertions;

/* loaded from: classes5.dex */
public abstract class AbstractCopyOnWriteMap implements ConcurrentMap {

    /* renamed from: a */
    public volatile Map f76069a;

    /* renamed from: b */
    public final transient Lock f76070b = new ReentrantLock();

    /* renamed from: c */
    public final View f76071c;

    /* loaded from: classes5.dex */
    public static abstract class CollectionView<E> implements Collection<E> {
        /* renamed from: a */
        public abstract Collection mo24067a();

        @Override // java.util.Collection
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return mo24067a().contains(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return mo24067a().containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            return mo24067a().equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            return mo24067a().hashCode();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return mo24067a().isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return new C12949f(mo24067a().iterator());
        }

        @Override // java.util.Collection
        public final int size() {
            return mo24067a().size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return mo24067a().toArray();
        }

        public String toString() {
            return mo24067a().toString();
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) mo24067a().toArray(tArr);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class View<K, V> {

        /* loaded from: classes5.dex */
        public enum Type {
            STABLE { // from class: org.bson.util.AbstractCopyOnWriteMap.View.Type.1
                @Override // org.bson.util.AbstractCopyOnWriteMap.View.Type
                public <K, V, M extends Map<K, V>> View<K, V> get(AbstractCopyOnWriteMap abstractCopyOnWriteMap) {
                    abstractCopyOnWriteMap.getClass();
                    return new C12946c();
                }
            },
            LIVE { // from class: org.bson.util.AbstractCopyOnWriteMap.View.Type.2
                @Override // org.bson.util.AbstractCopyOnWriteMap.View.Type
                public <K, V, M extends Map<K, V>> View<K, V> get(AbstractCopyOnWriteMap abstractCopyOnWriteMap) {
                    abstractCopyOnWriteMap.getClass();
                    return new C12948e();
                }
            };

            public abstract <K, V, M extends Map<K, V>> View<K, V> get(AbstractCopyOnWriteMap abstractCopyOnWriteMap);
        }

        /* renamed from: a */
        public abstract Set mo24070a();

        /* renamed from: b */
        public abstract Set mo24069b();

        /* renamed from: c */
        public abstract Collection mo24068c();
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$b */
    /* loaded from: classes5.dex */
    public class C12945b extends CollectionView implements Set {
        public C12945b() {
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        /* renamed from: a */
        public Collection mo24067a() {
            return AbstractCopyOnWriteMap.this.f76069a.entrySet();
        }

        @Override // java.util.Collection, java.util.Set
        public void clear() {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                m24073c.entrySet().clear();
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                if (!contains(obj)) {
                    AbstractCopyOnWriteMap.this.f76070b.unlock();
                    return false;
                }
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean remove = m24073c.entrySet().remove(obj);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return remove;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean removeAll = m24073c.entrySet().removeAll(collection);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return removeAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean retainAll = m24073c.entrySet().retainAll(collection);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return retainAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$c */
    /* loaded from: classes5.dex */
    public final class C12946c extends View {
        public C12946c() {
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: a */
        public Set mo24070a() {
            return Collections.unmodifiableSet(AbstractCopyOnWriteMap.this.f76069a.entrySet());
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: b */
        public Set mo24069b() {
            return Collections.unmodifiableSet(AbstractCopyOnWriteMap.this.f76069a.keySet());
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: c */
        public Collection mo24068c() {
            return Collections.unmodifiableCollection(AbstractCopyOnWriteMap.this.f76069a.values());
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$d */
    /* loaded from: classes5.dex */
    public class C12947d extends CollectionView implements Set {
        public C12947d() {
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        /* renamed from: a */
        public Collection mo24067a() {
            return AbstractCopyOnWriteMap.this.f76069a.keySet();
        }

        @Override // java.util.Collection, java.util.Set
        public void clear() {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                m24073c.keySet().clear();
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (AbstractCopyOnWriteMap.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean removeAll = m24073c.keySet().removeAll(collection);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return removeAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean retainAll = m24073c.keySet().retainAll(collection);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return retainAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$e */
    /* loaded from: classes5.dex */
    public final class C12948e extends View {

        /* renamed from: a */
        public final transient C12947d f76075a;

        /* renamed from: b */
        public final transient C12945b f76076b;

        /* renamed from: c */
        public final transient C12950g f76077c;

        public C12948e() {
            this.f76075a = new C12947d();
            this.f76076b = new C12945b();
            this.f76077c = new C12950g();
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: a */
        public Set mo24070a() {
            return this.f76076b;
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: b */
        public Set mo24069b() {
            return this.f76075a;
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: c */
        public Collection mo24068c() {
            return this.f76077c;
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$f */
    /* loaded from: classes5.dex */
    public static class C12949f implements Iterator {

        /* renamed from: a */
        public final Iterator f76079a;

        public C12949f(Iterator it) {
            this.f76079a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f76079a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f76079a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$g */
    /* loaded from: classes5.dex */
    public final class C12950g extends CollectionView {
        public C12950g() {
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        /* renamed from: a */
        public Collection mo24067a() {
            return AbstractCopyOnWriteMap.this.f76069a.values();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                m24073c.values().clear();
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                if (!contains(obj)) {
                    AbstractCopyOnWriteMap.this.f76070b.unlock();
                    return false;
                }
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean remove = m24073c.values().remove(obj);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return remove;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean removeAll = m24073c.values().removeAll(collection);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return removeAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76070b.lock();
            try {
                Map m24073c = AbstractCopyOnWriteMap.this.m24073c();
                boolean retainAll = m24073c.values().retainAll(collection);
                AbstractCopyOnWriteMap.this.m24071g(m24073c);
                return retainAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76070b.unlock();
            }
        }
    }

    public AbstractCopyOnWriteMap(Map map, View.Type type) {
        this.f76069a = (Map) Assertions.notNull("delegate", mo24062e((Map) Assertions.notNull("map", map)));
        this.f76071c = ((View.Type) Assertions.notNull("viewType", type)).get(this);
    }

    /* renamed from: c */
    public Map m24073c() {
        this.f76070b.lock();
        try {
            return mo24062e(this.f76069a);
        } finally {
            this.f76070b.unlock();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f76070b.lock();
        try {
            m24071g(mo24062e(Collections.emptyMap()));
        } finally {
            this.f76070b.unlock();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f76069a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f76069a.containsValue(obj);
    }

    /* renamed from: e */
    public abstract Map mo24062e(Map map);

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f76071c.mo24070a();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f76069a.equals(obj);
    }

    /* renamed from: f */
    public final boolean m24072f(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: g */
    public void m24071g(Map map) {
        this.f76069a = map;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f76069a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f76069a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f76069a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f76071c.mo24069b();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f76070b.lock();
        try {
            Map m24073c = m24073c();
            Object put = m24073c.put(obj, obj2);
            m24071g(m24073c);
            return put;
        } finally {
            this.f76070b.unlock();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f76070b.lock();
        try {
            Map m24073c = m24073c();
            m24073c.putAll(map);
            m24071g(m24073c);
        } finally {
            this.f76070b.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3;
        this.f76070b.lock();
        try {
            if (!this.f76069a.containsKey(obj)) {
                Map m24073c = m24073c();
                obj3 = m24073c.put(obj, obj2);
                m24071g(m24073c);
            } else {
                obj3 = this.f76069a.get(obj);
            }
            return obj3;
        } finally {
            this.f76070b.unlock();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f76070b.lock();
        try {
            if (!this.f76069a.containsKey(obj)) {
                this.f76070b.unlock();
                return null;
            }
            Map m24073c = m24073c();
            Object remove = m24073c.remove(obj);
            m24071g(m24073c);
            return remove;
        } finally {
            this.f76070b.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        this.f76070b.lock();
        try {
            if (this.f76069a.containsKey(obj) && m24072f(obj2, this.f76069a.get(obj))) {
                Map m24073c = m24073c();
                m24073c.put(obj, obj3);
                m24071g(m24073c);
                this.f76070b.unlock();
                return true;
            }
            this.f76070b.unlock();
            return false;
        } catch (Throwable th2) {
            this.f76070b.unlock();
            throw th2;
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f76069a.size();
    }

    public String toString() {
        return this.f76069a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f76071c.mo24068c();
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object replace(Object obj, Object obj2) {
        this.f76070b.lock();
        try {
            if (!this.f76069a.containsKey(obj)) {
                this.f76070b.unlock();
                return null;
            }
            Map m24073c = m24073c();
            Object put = m24073c.put(obj, obj2);
            m24071g(m24073c);
            return put;
        } finally {
            this.f76070b.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        this.f76070b.lock();
        try {
            if (!this.f76069a.containsKey(obj) || !m24072f(obj2, this.f76069a.get(obj))) {
                this.f76070b.unlock();
                return false;
            }
            Map m24073c = m24073c();
            m24073c.remove(obj);
            m24071g(m24073c);
            this.f76070b.unlock();
            return true;
        } catch (Throwable th2) {
            this.f76070b.unlock();
            throw th2;
        }
    }
}
