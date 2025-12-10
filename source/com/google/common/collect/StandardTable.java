package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
/* loaded from: classes4.dex */
public class StandardTable<R, C, V> extends AbstractC7959e implements Serializable {
    private static final long serialVersionUID = 0;
    final Map<R, Map<C, V>> backingMap;
    @CheckForNull
    @LazyInit
    private transient Set<C> columnKeySet;
    @CheckForNull
    @LazyInit
    private transient StandardTable<R, C, V>.C7883f columnMap;
    final Supplier<? extends Map<C, V>> factory;
    @CheckForNull
    @LazyInit
    private transient Map<R, Map<C, V>> rowMap;

    /* renamed from: com.google.common.collect.StandardTable$b */
    /* loaded from: classes4.dex */
    public class C7874b implements Iterator {

        /* renamed from: a */
        public final Iterator f53542a;

        /* renamed from: b */
        public Map.Entry f53543b;

        /* renamed from: c */
        public Iterator f53544c;

        public C7874b() {
            this.f53542a = StandardTable.this.backingMap.entrySet().iterator();
            this.f53544c = Iterators.m40837g();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Table.Cell next() {
            if (!this.f53544c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f53542a.next();
                this.f53543b = entry;
                this.f53544c = ((Map) entry.getValue()).entrySet().iterator();
            }
            Objects.requireNonNull(this.f53543b);
            Map.Entry entry2 = (Map.Entry) this.f53544c.next();
            return Tables.immutableCell(this.f53543b.getKey(), entry2.getKey(), entry2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f53542a.hasNext() && !this.f53544c.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f53544c.remove();
            Map.Entry entry = this.f53543b;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                this.f53542a.remove();
                this.f53543b = null;
            }
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$c */
    /* loaded from: classes4.dex */
    public class C7875c extends Maps.AbstractC7748M {

        /* renamed from: d */
        public final Object f53546d;

        /* renamed from: com.google.common.collect.StandardTable$c$a */
        /* loaded from: classes4.dex */
        public class C7876a extends Sets.AbstractC7857j {
            public C7876a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                C7875c.this.m40529e(Predicates.alwaysTrue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return StandardTable.this.containsMapping(entry.getKey(), C7875c.this.f53546d, entry.getValue());
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                C7875c c7875c = C7875c.this;
                return !StandardTable.this.containsColumn(c7875c.f53546d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C7877b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return StandardTable.this.removeMapping(entry.getKey(), C7875c.this.f53546d, entry.getValue());
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                return C7875c.this.m40529e(Predicates.not(Predicates.m41304in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i = 0;
                for (Map<C, V> map : StandardTable.this.backingMap.values()) {
                    if (map.containsKey(C7875c.this.f53546d)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$c$b */
        /* loaded from: classes4.dex */
        public class C7877b extends AbstractIterator {

            /* renamed from: c */
            public final Iterator f53549c;

            /* renamed from: com.google.common.collect.StandardTable$c$b$a */
            /* loaded from: classes4.dex */
            public class C7878a extends AbstractC1646X {

                /* renamed from: a */
                public final /* synthetic */ Map.Entry f53551a;

                /* renamed from: b */
                public final /* synthetic */ C7877b f53552b;

                public C7878a(C7877b c7877b, Map.Entry entry) {
                    this.f53551a = entry;
                    this.f53552b = c7877b;
                }

                @Override // p000.AbstractC1646X, java.util.Map.Entry
                public Object getKey() {
                    return this.f53551a.getKey();
                }

                @Override // p000.AbstractC1646X, java.util.Map.Entry
                public Object getValue() {
                    return ((Map) this.f53551a.getValue()).get(C7875c.this.f53546d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.AbstractC1646X, java.util.Map.Entry
                public Object setValue(Object obj) {
                    return AbstractC21396oJ0.m25936a(((Map) this.f53551a.getValue()).put(C7875c.this.f53546d, Preconditions.checkNotNull(obj)));
                }
            }

            public C7877b() {
                this.f53549c = StandardTable.this.backingMap.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Map.Entry computeNext() {
                while (this.f53549c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f53549c.next();
                    if (((Map) entry.getValue()).containsKey(C7875c.this.f53546d)) {
                        return new C7878a(this, entry);
                    }
                }
                return (Map.Entry) endOfData();
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$c$c */
        /* loaded from: classes4.dex */
        public class C7879c extends Maps.C7783y {
            public C7879c() {
                super(C7875c.this);
            }

            @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                C7875c c7875c = C7875c.this;
                return StandardTable.this.contains(obj, c7875c.f53546d);
            }

            @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                C7875c c7875c = C7875c.this;
                if (StandardTable.this.remove(obj, c7875c.f53546d) != null) {
                    return true;
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                return C7875c.this.m40529e(Maps.m40683y(Predicates.not(Predicates.m41304in(collection))));
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$c$d */
        /* loaded from: classes4.dex */
        public class C7880d extends Maps.C7747L {
            public C7880d() {
                super(C7875c.this);
            }

            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                if (obj != null && C7875c.this.m40529e(Maps.m40708T(Predicates.equalTo(obj)))) {
                    return true;
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection collection) {
                return C7875c.this.m40529e(Maps.m40708T(Predicates.m41304in(collection)));
            }

            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection collection) {
                return C7875c.this.m40529e(Maps.m40708T(Predicates.not(Predicates.m41304in(collection))));
            }
        }

        public C7875c(Object obj) {
            this.f53546d = Preconditions.checkNotNull(obj);
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return new C7876a();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: b */
        public Set mo40272b() {
            return new C7879c();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: c */
        public Collection mo40271c() {
            return new C7880d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.contains(obj, this.f53546d);
        }

        /* renamed from: e */
        public boolean m40529e(Predicate predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.f53546d);
                if (v != null && predicate.apply(Maps.immutableEntry(next.getKey(), v))) {
                    value.remove(this.f53546d);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return StandardTable.this.get(obj, this.f53546d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return StandardTable.this.put(obj, this.f53546d, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return StandardTable.this.remove(obj, this.f53546d);
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$d */
    /* loaded from: classes4.dex */
    public class C7881d extends AbstractIterator {

        /* renamed from: c */
        public final Map f53555c;

        /* renamed from: d */
        public final Iterator f53556d;

        /* renamed from: e */
        public Iterator f53557e;

        public C7881d() {
            this.f53555c = StandardTable.this.factory.get();
            this.f53556d = StandardTable.this.backingMap.values().iterator();
            this.f53557e = Iterators.m40839e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractIterator
        public Object computeNext() {
            while (true) {
                if (this.f53557e.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f53557e.next();
                    if (!this.f53555c.containsKey(entry.getKey())) {
                        this.f53555c.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else if (this.f53556d.hasNext()) {
                    this.f53557e = ((Map) this.f53556d.next()).entrySet().iterator();
                } else {
                    return endOfData();
                }
            }
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$e */
    /* loaded from: classes4.dex */
    public class C7882e extends AbstractC7893i {
        public C7882e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return StandardTable.this.createColumnKeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (Iterators.removeAll(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.size(iterator());
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$f */
    /* loaded from: classes4.dex */
    public class C7883f extends Maps.AbstractC7748M {

        /* renamed from: com.google.common.collect.StandardTable$f$a */
        /* loaded from: classes4.dex */
        public final class C7884a extends AbstractC7893i {

            /* renamed from: com.google.common.collect.StandardTable$f$a$a */
            /* loaded from: classes4.dex */
            public class C7885a implements Function {
                public C7885a() {
                }

                @Override // com.google.common.base.Function
                /* renamed from: a */
                public Map apply(Object obj) {
                    return StandardTable.this.column(obj);
                }
            }

            public C7884a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (StandardTable.this.containsColumn(entry.getKey())) {
                        Map map = C7883f.this.get(entry.getKey());
                        Objects.requireNonNull(map);
                        return map.equals(entry.getValue());
                    }
                    return false;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return Maps.m40699i(StandardTable.this.columnKeySet(), new C7885a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    StandardTable.this.removeColumn(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection collection) {
                Preconditions.checkNotNull(collection);
                return Sets.m40544e(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                Preconditions.checkNotNull(collection);
                Iterator it = Lists.newArrayList(StandardTable.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(Maps.immutableEntry(next, StandardTable.this.column(next)))) {
                        StandardTable.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.columnKeySet().size();
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$f$b */
        /* loaded from: classes4.dex */
        public class C7886b extends Maps.C7747L {
            public C7886b() {
                super(C7883f.this);
            }

            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry entry : C7883f.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        StandardTable.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection collection) {
                Preconditions.checkNotNull(collection);
                Iterator it = Lists.newArrayList(StandardTable.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(StandardTable.this.column(next))) {
                        StandardTable.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection collection) {
                Preconditions.checkNotNull(collection);
                Iterator it = Lists.newArrayList(StandardTable.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(StandardTable.this.column(next))) {
                        StandardTable.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        public C7883f() {
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return new C7884a();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: c */
        public Collection mo40271c() {
            return new C7886b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Map get(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                StandardTable standardTable = StandardTable.this;
                Objects.requireNonNull(obj);
                return standardTable.column(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f */
        public Map remove(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.removeColumn(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M, java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return StandardTable.this.columnKeySet();
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$g */
    /* loaded from: classes4.dex */
    public class C7887g extends Maps.AbstractC7781x {

        /* renamed from: a */
        public final Object f53564a;

        /* renamed from: b */
        public Map f53565b;

        /* renamed from: com.google.common.collect.StandardTable$g$a */
        /* loaded from: classes4.dex */
        public class C7888a implements Iterator {

            /* renamed from: a */
            public final /* synthetic */ Iterator f53567a;

            /* renamed from: b */
            public final /* synthetic */ C7887g f53568b;

            public C7888a(C7887g c7887g, Iterator it) {
                this.f53567a = it;
                this.f53568b = c7887g;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry next() {
                return this.f53568b.m40523f((Map.Entry) this.f53567a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f53567a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f53567a.remove();
                this.f53568b.mo40471c();
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$g$b */
        /* loaded from: classes4.dex */
        public class C7889b extends ForwardingMapEntry {

            /* renamed from: a */
            public final /* synthetic */ Map.Entry f53569a;

            /* renamed from: b */
            public final /* synthetic */ C7887g f53570b;

            public C7889b(C7887g c7887g, Map.Entry entry) {
                this.f53569a = entry;
                this.f53570b = c7887g;
            }

            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public boolean equals(Object obj) {
                return standardEquals(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public Object setValue(Object obj) {
                return super.setValue(Preconditions.checkNotNull(obj));
            }

            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
            public Map.Entry delegate() {
                return this.f53569a;
            }
        }

        public C7887g(Object obj) {
            this.f53564a = Preconditions.checkNotNull(obj);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            m40524e();
            Map map = this.f53565b;
            if (map == null) {
                return Iterators.m40837g();
            }
            return new C7888a(this, map.entrySet().iterator());
        }

        /* renamed from: b */
        public Map mo40472b() {
            return StandardTable.this.backingMap.get(this.f53564a);
        }

        /* renamed from: c */
        public void mo40471c() {
            m40524e();
            Map map = this.f53565b;
            if (map != null && map.isEmpty()) {
                StandardTable.this.backingMap.remove(this.f53564a);
                this.f53565b = null;
            }
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x, java.util.AbstractMap, java.util.Map
        public void clear() {
            m40524e();
            Map map = this.f53565b;
            if (map != null) {
                map.clear();
            }
            mo40471c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map;
            m40524e();
            if (obj != null && (map = this.f53565b) != null && Maps.m40722F(map, obj)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final void m40524e() {
            Map map = this.f53565b;
            if (map == null || (map.isEmpty() && StandardTable.this.backingMap.containsKey(this.f53564a))) {
                this.f53565b = mo40472b();
            }
        }

        /* renamed from: f */
        public Map.Entry m40523f(Map.Entry entry) {
            return new C7889b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Map map;
            m40524e();
            if (obj != null && (map = this.f53565b) != null) {
                return Maps.m40721G(map, obj);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj2);
            Map map = this.f53565b;
            if (map != null && !map.isEmpty()) {
                return this.f53565b.put(obj, obj2);
            }
            return StandardTable.this.put(this.f53564a, obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            m40524e();
            Map map = this.f53565b;
            if (map == null) {
                return null;
            }
            Object m40720H = Maps.m40720H(map, obj);
            mo40471c();
            return m40720H;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            m40524e();
            Map map = this.f53565b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$h */
    /* loaded from: classes4.dex */
    public class C7890h extends Maps.AbstractC7748M {

        /* renamed from: com.google.common.collect.StandardTable$h$a */
        /* loaded from: classes4.dex */
        public final class C7891a extends AbstractC7893i {

            /* renamed from: com.google.common.collect.StandardTable$h$a$a */
            /* loaded from: classes4.dex */
            public class C7892a implements Function {
                public C7892a() {
                }

                @Override // com.google.common.base.Function
                /* renamed from: a */
                public Map apply(Object obj) {
                    return StandardTable.this.row(obj);
                }
            }

            public C7891a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !Collections2.m41062f(StandardTable.this.backingMap.entrySet(), entry)) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return Maps.m40699i(StandardTable.this.backingMap.keySet(), new C7892a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !StandardTable.this.backingMap.entrySet().remove(entry)) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.backingMap.size();
            }
        }

        public C7890h() {
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return new C7891a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Map get(Object obj) {
            if (StandardTable.this.containsRow(obj)) {
                StandardTable standardTable = StandardTable.this;
                Objects.requireNonNull(obj);
                return standardTable.row(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f */
        public Map remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.backingMap.remove(obj);
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$i */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7893i extends Sets.AbstractC7857j {
        public AbstractC7893i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            StandardTable.this.backingMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }
    }

    public StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        this.backingMap = map;
        this.factory = supplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean containsMapping(@CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (obj3 != null && obj3.equals(get(obj, obj2))) {
            return true;
        }
        return false;
    }

    private Map<C, V> getOrCreate(R r) {
        Map<C, V> map = this.backingMap.get(r);
        if (map == null) {
            Map<C, V> map2 = this.factory.get();
            this.backingMap.put(r, map2);
            return map2;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public Map<R, V> removeColumn(@CheckForNull Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V remove = next.getValue().remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeMapping(@CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (containsMapping(obj, obj2, obj3)) {
            remove(obj, obj2);
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7959e
    public Iterator<Table.Cell<R, C, V>> cellIterator() {
        return new C7874b();
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public void clear() {
        this.backingMap.clear();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
        return new C7875c(c);
    }

    @Override // com.google.common.collect.Table
    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set == null) {
            C7882e c7882e = new C7882e();
            this.columnKeySet = c7882e;
            return c7882e;
        }
        return set;
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        StandardTable<R, C, V>.C7883f c7883f = this.columnMap;
        if (c7883f == null) {
            StandardTable<R, C, V>.C7883f c7883f2 = new C7883f();
            this.columnMap = c7883f2;
            return c7883f2;
        }
        return c7883f;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null && obj2 != null && super.contains(obj, obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean containsColumn(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map<C, V> map : this.backingMap.values()) {
            if (Maps.m40722F(map, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean containsRow(@CheckForNull Object obj) {
        if (obj != null && Maps.m40722F(this.backingMap, obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        if (obj != null && super.containsValue(obj)) {
            return true;
        }
        return false;
    }

    public Iterator<C> createColumnKeyIterator() {
        return new C7881d();
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new C7890h();
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null && obj2 != null) {
            return (V) super.get(obj, obj2);
        }
        return null;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(R r, C c, V v) {
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c);
        Preconditions.checkNotNull(v);
        return getOrCreate(r).put(c, v);
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.m40721G(this.backingMap, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v;
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
        return new C7887g(r);
    }

    @Override // com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map == null) {
            Map<R, Map<C, V>> createRowMap = createRowMap();
            this.rowMap = createRowMap;
            return createRowMap;
        }
        return map;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        int i = 0;
        for (Map<C, V> map : this.backingMap.values()) {
            i += map.size();
        }
        return i;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }
}
