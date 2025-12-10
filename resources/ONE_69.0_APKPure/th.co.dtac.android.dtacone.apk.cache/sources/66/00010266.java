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
    public volatile Map f76153a;

    /* renamed from: b */
    public final transient Lock f76154b = new ReentrantLock();

    /* renamed from: c */
    public final View f76155c;

    /* loaded from: classes5.dex */
    public static abstract class CollectionView<E> implements Collection<E> {
        /* renamed from: a */
        public abstract Collection mo24256a();

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
            return mo24256a().contains(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return mo24256a().containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            return mo24256a().equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            return mo24256a().hashCode();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return mo24256a().isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return new C12949f(mo24256a().iterator());
        }

        @Override // java.util.Collection
        public final int size() {
            return mo24256a().size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return mo24256a().toArray();
        }

        public String toString() {
            return mo24256a().toString();
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) mo24256a().toArray(tArr);
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
        public abstract Set mo24259a();

        /* renamed from: b */
        public abstract Set mo24258b();

        /* renamed from: c */
        public abstract Collection mo24257c();
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$b */
    /* loaded from: classes5.dex */
    public class C12945b extends CollectionView implements Set {
        public C12945b() {
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        /* renamed from: a */
        public Collection mo24256a() {
            return AbstractCopyOnWriteMap.this.f76153a.entrySet();
        }

        @Override // java.util.Collection, java.util.Set
        public void clear() {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                m24262c.entrySet().clear();
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                if (!contains(obj)) {
                    AbstractCopyOnWriteMap.this.f76154b.unlock();
                    return false;
                }
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean remove = m24262c.entrySet().remove(obj);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return remove;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean removeAll = m24262c.entrySet().removeAll(collection);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return removeAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean retainAll = m24262c.entrySet().retainAll(collection);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return retainAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
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
        public Set mo24259a() {
            return Collections.unmodifiableSet(AbstractCopyOnWriteMap.this.f76153a.entrySet());
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: b */
        public Set mo24258b() {
            return Collections.unmodifiableSet(AbstractCopyOnWriteMap.this.f76153a.keySet());
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: c */
        public Collection mo24257c() {
            return Collections.unmodifiableCollection(AbstractCopyOnWriteMap.this.f76153a.values());
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$d */
    /* loaded from: classes5.dex */
    public class C12947d extends CollectionView implements Set {
        public C12947d() {
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        /* renamed from: a */
        public Collection mo24256a() {
            return AbstractCopyOnWriteMap.this.f76153a.keySet();
        }

        @Override // java.util.Collection, java.util.Set
        public void clear() {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                m24262c.keySet().clear();
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
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
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean removeAll = m24262c.keySet().removeAll(collection);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return removeAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean retainAll = m24262c.keySet().retainAll(collection);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return retainAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$e */
    /* loaded from: classes5.dex */
    public final class C12948e extends View {

        /* renamed from: a */
        public final transient C12947d f76159a;

        /* renamed from: b */
        public final transient C12945b f76160b;

        /* renamed from: c */
        public final transient C12950g f76161c;

        public C12948e() {
            this.f76159a = new C12947d();
            this.f76160b = new C12945b();
            this.f76161c = new C12950g();
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: a */
        public Set mo24259a() {
            return this.f76160b;
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: b */
        public Set mo24258b() {
            return this.f76159a;
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        /* renamed from: c */
        public Collection mo24257c() {
            return this.f76161c;
        }
    }

    /* renamed from: org.bson.util.AbstractCopyOnWriteMap$f */
    /* loaded from: classes5.dex */
    public static class C12949f implements Iterator {

        /* renamed from: a */
        public final Iterator f76163a;

        public C12949f(Iterator it) {
            this.f76163a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f76163a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f76163a.next();
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
        public Collection mo24256a() {
            return AbstractCopyOnWriteMap.this.f76153a.values();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                m24262c.values().clear();
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                if (!contains(obj)) {
                    AbstractCopyOnWriteMap.this.f76154b.unlock();
                    return false;
                }
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean remove = m24262c.values().remove(obj);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return remove;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean removeAll = m24262c.values().removeAll(collection);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return removeAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            AbstractCopyOnWriteMap.this.f76154b.lock();
            try {
                Map m24262c = AbstractCopyOnWriteMap.this.m24262c();
                boolean retainAll = m24262c.values().retainAll(collection);
                AbstractCopyOnWriteMap.this.m24260g(m24262c);
                return retainAll;
            } finally {
                AbstractCopyOnWriteMap.this.f76154b.unlock();
            }
        }
    }

    public AbstractCopyOnWriteMap(Map map, View.Type type) {
        this.f76153a = (Map) Assertions.notNull("delegate", mo24251e((Map) Assertions.notNull("map", map)));
        this.f76155c = ((View.Type) Assertions.notNull("viewType", type)).get(this);
    }

    /* renamed from: c */
    public Map m24262c() {
        this.f76154b.lock();
        try {
            return mo24251e(this.f76153a);
        } finally {
            this.f76154b.unlock();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f76154b.lock();
        try {
            m24260g(mo24251e(Collections.emptyMap()));
        } finally {
            this.f76154b.unlock();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f76153a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f76153a.containsValue(obj);
    }

    /* renamed from: e */
    public abstract Map mo24251e(Map map);

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f76155c.mo24259a();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f76153a.equals(obj);
    }

    /* renamed from: f */
    public final boolean m24261f(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: g */
    public void m24260g(Map map) {
        this.f76153a = map;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f76153a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f76153a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f76153a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f76155c.mo24258b();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f76154b.lock();
        try {
            Map m24262c = m24262c();
            Object put = m24262c.put(obj, obj2);
            m24260g(m24262c);
            return put;
        } finally {
            this.f76154b.unlock();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f76154b.lock();
        try {
            Map m24262c = m24262c();
            m24262c.putAll(map);
            m24260g(m24262c);
        } finally {
            this.f76154b.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3;
        this.f76154b.lock();
        try {
            if (!this.f76153a.containsKey(obj)) {
                Map m24262c = m24262c();
                obj3 = m24262c.put(obj, obj2);
                m24260g(m24262c);
            } else {
                obj3 = this.f76153a.get(obj);
            }
            return obj3;
        } finally {
            this.f76154b.unlock();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f76154b.lock();
        try {
            if (!this.f76153a.containsKey(obj)) {
                this.f76154b.unlock();
                return null;
            }
            Map m24262c = m24262c();
            Object remove = m24262c.remove(obj);
            m24260g(m24262c);
            return remove;
        } finally {
            this.f76154b.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        this.f76154b.lock();
        try {
            if (this.f76153a.containsKey(obj) && m24261f(obj2, this.f76153a.get(obj))) {
                Map m24262c = m24262c();
                m24262c.put(obj, obj3);
                m24260g(m24262c);
                this.f76154b.unlock();
                return true;
            }
            this.f76154b.unlock();
            return false;
        } catch (Throwable th2) {
            this.f76154b.unlock();
            throw th2;
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f76153a.size();
    }

    public String toString() {
        return this.f76153a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f76155c.mo24257c();
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object replace(Object obj, Object obj2) {
        this.f76154b.lock();
        try {
            if (!this.f76153a.containsKey(obj)) {
                this.f76154b.unlock();
                return null;
            }
            Map m24262c = m24262c();
            Object put = m24262c.put(obj, obj2);
            m24260g(m24262c);
            return put;
        } finally {
            this.f76154b.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        this.f76154b.lock();
        try {
            if (!this.f76153a.containsKey(obj) || !m24261f(obj2, this.f76153a.get(obj))) {
                this.f76154b.unlock();
                return false;
            }
            Map m24262c = m24262c();
            m24262c.remove(obj);
            m24260g(m24262c);
            this.f76154b.unlock();
            return true;
        } catch (Throwable th2) {
            this.f76154b.unlock();
            throw th2;
        }
    }
}