package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.C7969h;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multisets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.h */
/* loaded from: classes4.dex */
public class C7969h extends AbstractC7947a implements Z00 {

    /* renamed from: a */
    public final Multimap f53696a;

    /* renamed from: b */
    public final Predicate f53697b;

    /* renamed from: com.google.common.collect.h$a */
    /* loaded from: classes4.dex */
    public class C7970a extends Maps.AbstractC7748M {

        /* renamed from: com.google.common.collect.h$a$a */
        /* loaded from: classes4.dex */
        public class C7971a extends Maps.AbstractC7767q {

            /* renamed from: com.google.common.collect.h$a$a$a */
            /* loaded from: classes4.dex */
            public class C7972a extends AbstractIterator {

                /* renamed from: c */
                public final Iterator f53700c;

                public C7972a() {
                    C7971a.this = r1;
                    this.f53700c = C7969h.this.f53696a.asMap().entrySet().iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: b */
                public Map.Entry computeNext() {
                    while (this.f53700c.hasNext()) {
                        Map.Entry entry = (Map.Entry) this.f53700c.next();
                        Object key = entry.getKey();
                        Collection m40277d = C7969h.m40277d((Collection) entry.getValue(), new C7977c(key));
                        if (!m40277d.isEmpty()) {
                            return Maps.immutableEntry(key, m40277d);
                        }
                    }
                    return (Map.Entry) endOfData();
                }
            }

            public C7971a() {
                C7970a.this = r1;
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q
            /* renamed from: a */
            public Map mo40268a() {
                return C7970a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C7972a();
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q, com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection collection) {
                return C7969h.this.m40276e(Predicates.m41304in(collection));
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q, com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                return C7969h.this.m40276e(Predicates.not(Predicates.m41304in(collection)));
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Iterators.size(iterator());
            }
        }

        /* renamed from: com.google.common.collect.h$a$b */
        /* loaded from: classes4.dex */
        public class C7973b extends Maps.C7783y {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7973b() {
                super(r1);
                C7970a.this = r1;
            }

            @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (C7970a.this.remove(obj) != null) {
                    return true;
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection collection) {
                return C7969h.this.m40276e(Maps.m40683y(Predicates.m41304in(collection)));
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                return C7969h.this.m40276e(Maps.m40683y(Predicates.not(Predicates.m41304in(collection))));
            }
        }

        /* renamed from: com.google.common.collect.h$a$c */
        /* loaded from: classes4.dex */
        public class C7974c extends Maps.C7747L {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7974c() {
                super(r1);
                C7970a.this = r1;
            }

            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    Iterator it = C7969h.this.f53696a.asMap().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Collection m40277d = C7969h.m40277d((Collection) entry.getValue(), new C7977c(entry.getKey()));
                        if (!m40277d.isEmpty() && collection.equals(m40277d)) {
                            if (m40277d.size() == ((Collection) entry.getValue()).size()) {
                                it.remove();
                                return true;
                            }
                            m40277d.clear();
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection collection) {
                return C7969h.this.m40276e(Maps.m40708T(Predicates.m41304in(collection)));
            }

            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection collection) {
                return C7969h.this.m40276e(Maps.m40708T(Predicates.not(Predicates.m41304in(collection))));
            }
        }

        public C7970a() {
            C7969h.this = r1;
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return new C7971a();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: b */
        public Set mo40272b() {
            return new C7973b();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: c */
        public Collection mo40271c() {
            return new C7974c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C7969h.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Collection get(Object obj) {
            Collection collection = (Collection) C7969h.this.f53696a.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection m40277d = C7969h.m40277d(collection, new C7977c(obj));
            if (m40277d.isEmpty()) {
                return null;
            }
            return m40277d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f */
        public Collection remove(Object obj) {
            Collection collection = (Collection) C7969h.this.f53696a.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList newArrayList = Lists.newArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C7969h.this.m40275f(obj, next)) {
                    it.remove();
                    newArrayList.add(next);
                }
            }
            if (newArrayList.isEmpty()) {
                return null;
            }
            if (C7969h.this.f53696a instanceof SetMultimap) {
                return Collections.unmodifiableSet(Sets.newLinkedHashSet(newArrayList));
            }
            return Collections.unmodifiableList(newArrayList);
        }
    }

    /* renamed from: com.google.common.collect.h$b */
    /* loaded from: classes4.dex */
    public class C7975b extends Multimaps.C7805c {

        /* renamed from: com.google.common.collect.h$b$a */
        /* loaded from: classes4.dex */
        public class C7976a extends Multisets.AbstractC7823i {
            public C7976a() {
                C7975b.this = r1;
            }

            /* renamed from: b */
            public static /* synthetic */ boolean m40265b(Predicate predicate, Map.Entry entry) {
                return m40264c(predicate, entry);
            }

            /* renamed from: c */
            public static /* synthetic */ boolean m40264c(Predicate predicate, Map.Entry entry) {
                return predicate.apply(Multisets.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size()));
            }

            @Override // com.google.common.collect.Multisets.AbstractC7823i
            /* renamed from: a */
            public Multiset mo40266a() {
                return C7975b.this;
            }

            /* renamed from: d */
            public final boolean m40263d(final Predicate predicate) {
                return C7969h.this.m40276e(new Predicate() { // from class: U00
                    @Override // com.google.common.base.Predicate
                    public final boolean apply(Object obj) {
                        return C7969h.C7975b.C7976a.m40265b(predicate, (Map.Entry) obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return C7975b.this.entryIterator();
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection collection) {
                return m40263d(Predicates.m41304in(collection));
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                return m40263d(Predicates.not(Predicates.m41304in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C7969h.this.keySet().size();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7975b() {
            super(r1);
            C7969h.this = r1;
        }

        @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
        public Set entrySet() {
            return new C7976a();
        }

        @Override // com.google.common.collect.Multimaps.C7805c, com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            AbstractC5406bs.m51814b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) C7969h.this.f53696a.asMap().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (C7969h.this.m40275f(obj, it.next()) && (i2 = i2 + 1) <= i) {
                    it.remove();
                }
            }
            return i2;
        }
    }

    /* renamed from: com.google.common.collect.h$c */
    /* loaded from: classes4.dex */
    public final class C7977c implements Predicate {

        /* renamed from: a */
        public final Object f53706a;

        public C7977c(Object obj) {
            C7969h.this = r1;
            this.f53706a = obj;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return C7969h.this.m40275f(this.f53706a, obj);
        }
    }

    public C7969h(Multimap multimap, Predicate predicate) {
        this.f53696a = (Multimap) Preconditions.checkNotNull(multimap);
        this.f53697b = (Predicate) Preconditions.checkNotNull(predicate);
    }

    /* renamed from: d */
    public static Collection m40277d(Collection collection, Predicate predicate) {
        if (collection instanceof Set) {
            return Sets.filter((Set) collection, predicate);
        }
        return Collections2.filter(collection, predicate);
    }

    /* renamed from: a */
    public Multimap mo40280a() {
        return this.f53696a;
    }

    @Override // p000.Z00
    /* renamed from: c */
    public Predicate mo40278c() {
        return this.f53697b;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        if (asMap().get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Map createAsMap() {
        return new C7970a();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Collection createEntries() {
        return m40277d(this.f53696a.entries(), this.f53697b);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Set createKeySet() {
        return asMap().keySet();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Multiset createKeys() {
        return new C7975b();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Collection createValues() {
        return new C18928a10(this);
    }

    /* renamed from: e */
    public boolean m40276e(Predicate predicate) {
        Iterator it = this.f53696a.asMap().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection m40277d = m40277d((Collection) entry.getValue(), new C7977c(key));
            if (!m40277d.isEmpty() && predicate.apply(Maps.immutableEntry(key, m40277d))) {
                if (m40277d.size() == ((Collection) entry.getValue()).size()) {
                    it.remove();
                } else {
                    m40277d.clear();
                }
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Iterator entryIterator() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: f */
    public final boolean m40275f(Object obj, Object obj2) {
        return this.f53697b.apply(Maps.immutableEntry(obj, obj2));
    }

    /* renamed from: g */
    public Collection m40274g() {
        if (this.f53696a instanceof SetMultimap) {
            return Collections.emptySet();
        }
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection get(Object obj) {
        return m40277d(this.f53696a.get(obj), new C7977c(obj));
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection removeAll(Object obj) {
        return (Collection) MoreObjects.firstNonNull(asMap().remove(obj), m40274g());
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return entries().size();
    }
}
