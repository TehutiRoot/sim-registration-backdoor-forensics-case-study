package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractC7947a;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class AbstractMapBasedMultimap<K, V> extends AbstractC7947a implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$a */
    /* loaded from: classes4.dex */
    public class C7541a extends AbstractC7546d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7541a() {
            super();
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AbstractC7546d
        /* renamed from: a */
        public Object mo41117a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b */
    /* loaded from: classes4.dex */
    public class C7542b extends AbstractC7546d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7542b() {
            super();
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AbstractC7546d
        /* renamed from: b */
        public Map.Entry mo41117a(Object obj, Object obj2) {
            return Maps.immutableEntry(obj, obj2);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c */
    /* loaded from: classes4.dex */
    public class C7543c extends Maps.AbstractC7748M {

        /* renamed from: d */
        public final transient Map f52991d;

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$a */
        /* loaded from: classes4.dex */
        public class C7544a extends Maps.AbstractC7767q {
            public C7544a() {
                C7543c.this = r1;
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q
            /* renamed from: a */
            public Map mo40268a() {
                return C7543c.this;
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.m41062f(C7543c.this.f52991d.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C7545b();
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$b */
        /* loaded from: classes4.dex */
        public class C7545b implements Iterator {

            /* renamed from: a */
            public final Iterator f52994a;

            /* renamed from: b */
            public Collection f52995b;

            public C7545b() {
                C7543c.this = r1;
                this.f52994a = r1.f52991d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f52994a.next();
                this.f52995b = (Collection) entry.getValue();
                return C7543c.this.m41119g(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f52994a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.f52995b != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "no calls to next() since the last call to remove()");
                this.f52994a.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.f52995b.size());
                this.f52995b.clear();
                this.f52995b = null;
            }
        }

        public C7543c(Map map) {
            AbstractMapBasedMultimap.this = r1;
            this.f52991d = map;
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return new C7544a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f52991d == AbstractMapBasedMultimap.this.map) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m40842b(new C7545b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.m40722F(this.f52991d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Collection get(Object obj) {
            Collection<V> collection = (Collection) Maps.m40721G(this.f52991d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            if (this != obj && !this.f52991d.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f */
        public Collection remove(Object obj) {
            Collection<? extends V> collection = (Collection) this.f52991d.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(collection);
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, collection.size());
            collection.clear();
            return createCollection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public Map.Entry m41119g(Map.Entry entry) {
            Object key = entry.getKey();
            return Maps.immutableEntry(key, AbstractMapBasedMultimap.this.wrapCollection(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f52991d.hashCode();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M, java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f52991d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f52991d.toString();
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$d */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7546d implements Iterator {

        /* renamed from: a */
        public final Iterator f52997a;

        /* renamed from: b */
        public Object f52998b = null;

        /* renamed from: c */
        public Collection f52999c = null;

        /* renamed from: d */
        public Iterator f53000d = Iterators.m40837g();

        public AbstractC7546d() {
            AbstractMapBasedMultimap.this = r1;
            this.f52997a = r1.map.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract Object mo41117a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f52997a.hasNext() && !this.f53000d.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f53000d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f52997a.next();
                this.f52998b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f52999c = collection;
                this.f53000d = collection.iterator();
            }
            return mo41117a(AbstractC21396oJ0.m25936a(this.f52998b), this.f53000d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f53000d.remove();
            Collection collection = this.f52999c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f52997a.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$e */
    /* loaded from: classes4.dex */
    public class C7547e extends Maps.C7783y {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$e$a */
        /* loaded from: classes4.dex */
        public class C7548a implements Iterator {

            /* renamed from: a */
            public Map.Entry f53003a;

            /* renamed from: b */
            public final /* synthetic */ Iterator f53004b;

            /* renamed from: c */
            public final /* synthetic */ C7547e f53005c;

            public C7548a(C7547e c7547e, Iterator it) {
                this.f53004b = it;
                this.f53005c = c7547e;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f53004b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f53004b.next();
                this.f53003a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.f53003a != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f53003a.getValue();
                this.f53004b.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, collection.size());
                collection.clear();
                this.f53003a = null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7547e(Map map) {
            super(map);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.m40842b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return mo40649a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (this != obj && !mo40649a().keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return mo40649a().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7548a(this, mo40649a().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo40649a().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, i);
            } else {
                i = 0;
            }
            if (i <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$f */
    /* loaded from: classes4.dex */
    public final class C7549f extends C7552i implements NavigableMap {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7549f(NavigableMap navigableMap) {
            super(navigableMap);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry<K, V> ceilingEntry = mo41104j().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return m41119g(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return mo41104j().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new C7549f(mo41104j().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry<K, V> firstEntry = mo41104j().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m41119g(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry<K, V> floorEntry = mo41104j().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return m41119g(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return mo41104j().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry<K, V> higherEntry = mo41104j().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return m41119g(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return mo41104j().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7552i
        /* renamed from: k */
        public NavigableSet mo41106h() {
            return new C7550g(mo41104j());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7552i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: l */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry<K, V> lastEntry = mo41104j().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m41119g(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry<K, V> lowerEntry = mo41104j().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return m41119g(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return mo41104j().lowerKey(obj);
        }

        /* renamed from: m */
        public Map.Entry m41114m(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection<V> createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.immutableEntry(entry.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(createCollection));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7552i
        /* renamed from: n */
        public NavigableMap mo41104j() {
            return (NavigableMap) super.mo41104j();
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7552i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7552i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return m41114m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return m41114m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return new C7549f(mo41104j().headMap(obj, z));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7552i, com.google.common.collect.AbstractMapBasedMultimap.C7543c, com.google.common.collect.Maps.AbstractC7748M, java.util.AbstractMap, java.util.Map
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new C7549f(mo41104j().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return new C7549f(mo41104j().tailMap(obj, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$g */
    /* loaded from: classes4.dex */
    public final class C7550g extends C7553j implements NavigableSet {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7550g(NavigableMap navigableMap) {
            super(navigableMap);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7553j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: c */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return mo41103b().ceilingKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7553j
        /* renamed from: d */
        public NavigableMap mo41103b() {
            return (NavigableMap) super.mo41103b();
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new C7550g(mo41103b().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7553j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7553j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return mo41103b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return mo41103b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return mo41103b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.m40834j(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.m40834j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return new C7550g(mo41103b().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new C7550g(mo41103b().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return new C7550g(mo41103b().tailMap(obj, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$h */
    /* loaded from: classes4.dex */
    public class C7551h extends C7556l implements RandomAccess {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7551h(Object obj, List list, C7554k c7554k) {
            super(obj, list, c7554k);
            AbstractMapBasedMultimap.this = r1;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$i */
    /* loaded from: classes4.dex */
    public class C7552i extends C7543c implements SortedMap {

        /* renamed from: f */
        public SortedSet f53009f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7552i(SortedMap sortedMap) {
            super(sortedMap);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return mo41104j().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return mo41104j().firstKey();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: h */
        public SortedSet mo40272b() {
            return new C7553j(mo41104j());
        }

        public SortedMap headMap(Object obj) {
            return new C7552i(mo41104j().headMap(obj));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7543c, com.google.common.collect.Maps.AbstractC7748M, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f53009f;
            if (sortedSet == null) {
                SortedSet mo40272b = mo40272b();
                this.f53009f = mo40272b;
                return mo40272b;
            }
            return sortedSet;
        }

        /* renamed from: j */
        public SortedMap mo41104j() {
            return (SortedMap) this.f52991d;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return mo41104j().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new C7552i(mo41104j().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new C7552i(mo41104j().tailMap(obj));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$j */
    /* loaded from: classes4.dex */
    public class C7553j extends C7547e implements SortedSet {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7553j(SortedMap sortedMap) {
            super(sortedMap);
            AbstractMapBasedMultimap.this = r1;
        }

        /* renamed from: b */
        public SortedMap mo41103b() {
            return (SortedMap) super.mo40649a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return mo41103b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return mo41103b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new C7553j(mo41103b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return mo41103b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new C7553j(mo41103b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new C7553j(mo41103b().tailMap(obj));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$m */
    /* loaded from: classes4.dex */
    public class C7558m extends C7560o implements NavigableSet {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7558m(Object obj, NavigableSet navigableSet, C7554k c7554k) {
            super(obj, navigableSet, c7554k);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return mo41090g().ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return new C7554k.C7555a(mo41090g().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return m41091i(mo41090g().descendingSet());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return mo41090g().floor(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7560o
        /* renamed from: h */
        public NavigableSet mo41090g() {
            return (NavigableSet) super.mo41090g();
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return m41091i(mo41090g().headSet(obj, z));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return mo41090g().higher(obj);
        }

        /* renamed from: i */
        public final NavigableSet m41091i(NavigableSet navigableSet) {
            C7554k m41101b;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object obj = this.f53012a;
            if (m41101b() == null) {
                m41101b = this;
            } else {
                m41101b = m41101b();
            }
            return new C7558m(obj, navigableSet, m41101b);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return mo41090g().lower(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.m40834j(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.m40834j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return m41091i(mo41090g().subSet(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return m41091i(mo41090g().tailSet(obj, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$n */
    /* loaded from: classes4.dex */
    public class C7559n extends C7554k implements Set {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7559n(Object obj, Set set) {
            super(obj, set, null);
            AbstractMapBasedMultimap.this = r2;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C7554k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean m40545d = Sets.m40545d((Set) this.f53013b, collection);
            if (m40545d) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f53013b.size() - size);
                m41097f();
            }
            return m40545d;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$o */
    /* loaded from: classes4.dex */
    public class C7560o extends C7554k implements SortedSet {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7560o(Object obj, SortedSet sortedSet, C7554k c7554k) {
            super(obj, sortedSet, c7554k);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return mo41090g().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            m41098e();
            return mo41090g().first();
        }

        /* renamed from: g */
        public SortedSet mo41090g() {
            return (SortedSet) m41100c();
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            C7554k m41101b;
            m41098e();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m41099d = m41099d();
            SortedSet headSet = mo41090g().headSet(obj);
            if (m41101b() == null) {
                m41101b = this;
            } else {
                m41101b = m41101b();
            }
            return new C7560o(m41099d, headSet, m41101b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            m41098e();
            return mo41090g().last();
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            C7554k m41101b;
            m41098e();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m41099d = m41099d();
            SortedSet subSet = mo41090g().subSet(obj, obj2);
            if (m41101b() == null) {
                m41101b = this;
            } else {
                m41101b = m41101b();
            }
            return new C7560o(m41099d, subSet, m41101b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            C7554k m41101b;
            m41098e();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m41099d = m41099d();
            SortedSet tailSet = mo41090g().tailSet(obj);
            if (m41101b() == null) {
                m41101b = this;
            } else {
                m41101b = m41101b();
            }
            return new C7560o(m41099d, tailSet, m41101b);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.map = map;
    }

    public static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i - 1;
        return i;
    }

    public static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize + i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    public static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize - i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    private Collection<V> getOrCreateCollection(K k) {
        Collection<V> collection = this.map.get(k);
        if (collection == null) {
            Collection<V> createCollection = createCollection(k);
            this.map.put(k, createCollection);
            return createCollection;
        }
        return collection;
    }

    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    public void removeValuesForKey(@CheckForNull Object obj) {
        Collection collection = (Collection) Maps.m40720H(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        for (Collection<V> collection : this.map.values()) {
            collection.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@CheckForNull Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Map<K, Collection<V>> createAsMap() {
        return new C7543c(this.map);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Collection<Map.Entry<K, V>> createEntries() {
        if (this instanceof SetMultimap) {
            return new AbstractC7947a.C7949b();
        }
        return new AbstractC7947a.C7948a();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Set<K> createKeySet() {
        return new C7547e(this.map);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Multiset<K> createKeys() {
        return new Multimaps.C7805c(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new C7549f((NavigableMap) this.map);
        }
        if (map instanceof SortedMap) {
            return new C7552i((SortedMap) this.map);
        }
        return new C7543c(this.map);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new C7550g((NavigableMap) this.map);
        }
        if (map instanceof SortedMap) {
            return new C7553j((SortedMap) this.map);
        }
        return new C7547e(this.map);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Collection<V> createValues() {
        return new AbstractC7947a.C7950c();
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C7542b();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection<V> get(K k) {
        Collection<V> collection = this.map.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        Collection<V> collection = this.map.get(k);
        if (collection == null) {
            Collection<V> createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.totalSize++;
                this.map.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.totalSize++;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection<V> removeAll(@CheckForNull Object obj) {
        Collection<V> remove = this.map.remove(obj);
        if (remove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(remove);
        this.totalSize -= remove.size();
        remove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection<V> orCreateCollection = getOrCreateCollection(k);
        Collection createCollection = createCollection();
        createCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.map = map;
        this.totalSize = 0;
        for (Collection<V> collection : map.values()) {
            Preconditions.checkArgument(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.totalSize;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Iterator<V> valueIterator() {
        return new C7541a();
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public Collection<V> values() {
        return (Collection<V>) super.values();
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C7554k(k, collection, null);
    }

    public final List<V> wrapList(K k, List<V> list, @CheckForNull AbstractMapBasedMultimap<K, V>.C7554k c7554k) {
        if (list instanceof RandomAccess) {
            return new C7551h(k, list, c7554k);
        }
        return new C7556l(k, list, c7554k);
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k */
    /* loaded from: classes4.dex */
    public class C7554k extends AbstractCollection {

        /* renamed from: a */
        public final Object f53012a;

        /* renamed from: b */
        public Collection f53013b;

        /* renamed from: c */
        public final C7554k f53014c;

        /* renamed from: d */
        public final Collection f53015d;

        public C7554k(Object obj, Collection collection, C7554k c7554k) {
            Collection m41100c;
            AbstractMapBasedMultimap.this = r1;
            this.f53012a = obj;
            this.f53013b = collection;
            this.f53014c = c7554k;
            if (c7554k == null) {
                m41100c = null;
            } else {
                m41100c = c7554k.m41100c();
            }
            this.f53015d = m41100c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m41102a() {
            C7554k c7554k = this.f53014c;
            if (c7554k != null) {
                c7554k.m41102a();
            } else {
                AbstractMapBasedMultimap.this.map.put(this.f53012a, this.f53013b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            m41098e();
            boolean isEmpty = this.f53013b.isEmpty();
            boolean add = this.f53013b.add(obj);
            if (add) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    m41102a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f53013b.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f53013b.size() - size);
                if (size == 0) {
                    m41102a();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        public C7554k m41101b() {
            return this.f53014c;
        }

        /* renamed from: c */
        public Collection m41100c() {
            return this.f53013b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f53013b.clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            m41097f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m41098e();
            return this.f53013b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            m41098e();
            return this.f53013b.containsAll(collection);
        }

        /* renamed from: d */
        public Object m41099d() {
            return this.f53012a;
        }

        /* renamed from: e */
        public void m41098e() {
            Collection collection;
            C7554k c7554k = this.f53014c;
            if (c7554k != null) {
                c7554k.m41098e();
                if (this.f53014c.m41100c() != this.f53015d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f53013b.isEmpty() && (collection = (Collection) AbstractMapBasedMultimap.this.map.get(this.f53012a)) != null) {
                this.f53013b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m41098e();
            return this.f53013b.equals(obj);
        }

        /* renamed from: f */
        public void m41097f() {
            C7554k c7554k = this.f53014c;
            if (c7554k != null) {
                c7554k.m41097f();
            } else if (this.f53013b.isEmpty()) {
                AbstractMapBasedMultimap.this.map.remove(this.f53012a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m41098e();
            return this.f53013b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            m41098e();
            return new C7555a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m41098e();
            boolean remove = this.f53013b.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                m41097f();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f53013b.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f53013b.size() - size);
                m41097f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f53013b.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f53013b.size() - size);
                m41097f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m41098e();
            return this.f53013b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m41098e();
            return this.f53013b.toString();
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k$a */
        /* loaded from: classes4.dex */
        public class C7555a implements Iterator {

            /* renamed from: a */
            public final Iterator f53017a;

            /* renamed from: b */
            public final Collection f53018b;

            public C7555a() {
                C7554k.this = r1;
                Collection collection = r1.f53013b;
                this.f53018b = collection;
                this.f53017a = AbstractMapBasedMultimap.iteratorOrListIterator(collection);
            }

            /* renamed from: a */
            public Iterator m41096a() {
                m41095b();
                return this.f53017a;
            }

            /* renamed from: b */
            public void m41095b() {
                C7554k.this.m41098e();
                if (C7554k.this.f53013b == this.f53018b) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m41095b();
                return this.f53017a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                m41095b();
                return this.f53017a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f53017a.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                C7554k.this.m41097f();
            }

            public C7555a(Iterator it) {
                C7554k.this = r1;
                this.f53018b = r1.f53013b;
                this.f53017a = it;
            }
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$l */
    /* loaded from: classes4.dex */
    public class C7556l extends C7554k implements List {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$l$a */
        /* loaded from: classes4.dex */
        public class C7557a extends C7554k.C7555a implements ListIterator {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7557a() {
                super();
                C7556l.this = r1;
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = C7556l.this.isEmpty();
                m41093c().add(obj);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    C7556l.this.m41102a();
                }
            }

            /* renamed from: c */
            public final ListIterator m41093c() {
                return (ListIterator) m41096a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m41093c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m41093c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return m41093c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m41093c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m41093c().set(obj);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7557a(int i) {
                super(r2.m41094g().listIterator(i));
                C7556l.this = r2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7556l(Object obj, List list, C7554k c7554k) {
            super(obj, list, c7554k);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            m41098e();
            boolean isEmpty = m41100c().isEmpty();
            m41094g().add(i, obj);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                m41102a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m41094g().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, m41100c().size() - size);
                if (size == 0) {
                    m41102a();
                }
            }
            return addAll;
        }

        /* renamed from: g */
        public List m41094g() {
            return (List) m41100c();
        }

        @Override // java.util.List
        public Object get(int i) {
            m41098e();
            return m41094g().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m41098e();
            return m41094g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m41098e();
            return m41094g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            m41098e();
            return new C7557a();
        }

        @Override // java.util.List
        public Object remove(int i) {
            m41098e();
            Object remove = m41094g().remove(i);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            m41097f();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            m41098e();
            return m41094g().set(i, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List subList(int i, int i2) {
            C7554k m41101b;
            m41098e();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m41099d = m41099d();
            List subList = m41094g().subList(i, i2);
            if (m41101b() == null) {
                m41101b = this;
            } else {
                m41101b = m41101b();
            }
            return abstractMapBasedMultimap.wrapList(m41099d, subList, m41101b);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            m41098e();
            return new C7557a(i);
        }
    }
}
