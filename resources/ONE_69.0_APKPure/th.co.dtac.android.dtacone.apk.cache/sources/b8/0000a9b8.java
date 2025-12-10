package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes4.dex */
public class LinkedListMultimap<K, V> extends AbstractC7936a implements ListMultimap<K, V>, Serializable {
    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    @CheckForNull
    private transient C7671g head;
    private transient Map<K, C7670f> keyToKeyList;
    private transient int modCount;
    private transient int size;
    @CheckForNull
    private transient C7671g tail;

    /* renamed from: com.google.common.collect.LinkedListMultimap$a */
    /* loaded from: classes4.dex */
    public class C7664a extends AbstractSequentialList {

        /* renamed from: a */
        public final /* synthetic */ Object f53281a;

        /* renamed from: b */
        public final /* synthetic */ LinkedListMultimap f53282b;

        public C7664a(LinkedListMultimap linkedListMultimap, Object obj) {
            this.f53281a = obj;
            this.f53282b = linkedListMultimap;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return new C7673i(this.f53281a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            C7670f c7670f = (C7670f) this.f53282b.keyToKeyList.get(this.f53281a);
            if (c7670f == null) {
                return 0;
            }
            return c7670f.f53295c;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$b */
    /* loaded from: classes4.dex */
    public class C7665b extends AbstractSequentialList {
        public C7665b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return new C7672h(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$c */
    /* loaded from: classes4.dex */
    public class C7666c extends Sets.AbstractC7846j {
        public C7666c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7669e(LinkedListMultimap.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return !LinkedListMultimap.this.removeAll(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedListMultimap.this.keyToKeyList.size();
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$d */
    /* loaded from: classes4.dex */
    public class C7667d extends AbstractSequentialList {

        /* renamed from: com.google.common.collect.LinkedListMultimap$d$a */
        /* loaded from: classes4.dex */
        public class C7668a extends WV1 {

            /* renamed from: b */
            public final /* synthetic */ C7672h f53286b;

            /* renamed from: c */
            public final /* synthetic */ C7667d f53287c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7668a(C7667d c7667d, ListIterator listIterator, C7672h c7672h) {
                super(listIterator);
                this.f53286b = c7672h;
                this.f53287c = c7667d;
            }

            @Override // p000.VV1
            /* renamed from: c */
            public Object mo40358a(Map.Entry entry) {
                return entry.getValue();
            }

            @Override // p000.WV1, java.util.ListIterator
            public void set(Object obj) {
                this.f53286b.m40804f(obj);
            }
        }

        public C7667d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            C7672h c7672h = new C7672h(i);
            return new C7668a(this, c7672h, c7672h);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$f */
    /* loaded from: classes4.dex */
    public static class C7670f {

        /* renamed from: a */
        public C7671g f53293a;

        /* renamed from: b */
        public C7671g f53294b;

        /* renamed from: c */
        public int f53295c;

        public C7670f(C7671g c7671g) {
            this.f53293a = c7671g;
            this.f53294b = c7671g;
            c7671g.f53301f = null;
            c7671g.f53300e = null;
            this.f53295c = 1;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$g */
    /* loaded from: classes4.dex */
    public static final class C7671g extends AbstractC1638X {

        /* renamed from: a */
        public final Object f53296a;

        /* renamed from: b */
        public Object f53297b;

        /* renamed from: c */
        public C7671g f53298c;

        /* renamed from: d */
        public C7671g f53299d;

        /* renamed from: e */
        public C7671g f53300e;

        /* renamed from: f */
        public C7671g f53301f;

        public C7671g(Object obj, Object obj2) {
            this.f53296a = obj;
            this.f53297b = obj2;
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object getKey() {
            return this.f53296a;
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object getValue() {
            return this.f53297b;
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f53297b;
            this.f53297b = obj;
            return obj2;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$h */
    /* loaded from: classes4.dex */
    public class C7672h implements ListIterator {

        /* renamed from: a */
        public int f53302a;

        /* renamed from: b */
        public C7671g f53303b;

        /* renamed from: c */
        public C7671g f53304c;

        /* renamed from: d */
        public C7671g f53305d;

        /* renamed from: e */
        public int f53306e;

        public C7672h(int i) {
            this.f53306e = LinkedListMultimap.this.modCount;
            int size = LinkedListMultimap.this.size();
            Preconditions.checkPositionIndex(i, size);
            if (i >= size / 2) {
                this.f53305d = LinkedListMultimap.this.tail;
                this.f53302a = size;
                while (true) {
                    int i2 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i2;
                }
            } else {
                this.f53303b = LinkedListMultimap.this.head;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            }
            this.f53304c = null;
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public final void m40808b() {
            if (LinkedListMultimap.this.modCount == this.f53306e) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c */
        public C7671g next() {
            m40808b();
            C7671g c7671g = this.f53303b;
            if (c7671g != null) {
                this.f53304c = c7671g;
                this.f53305d = c7671g;
                this.f53303b = c7671g.f53298c;
                this.f53302a++;
                return c7671g;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public C7671g previous() {
            m40808b();
            C7671g c7671g = this.f53305d;
            if (c7671g != null) {
                this.f53304c = c7671g;
                this.f53303b = c7671g;
                this.f53305d = c7671g.f53299d;
                this.f53302a--;
                return c7671g;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public void m40804f(Object obj) {
            boolean z;
            if (this.f53304c != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f53304c.f53297b = obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            m40808b();
            if (this.f53303b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            m40808b();
            if (this.f53305d != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f53302a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f53302a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z;
            m40808b();
            if (this.f53304c != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            C7671g c7671g = this.f53304c;
            if (c7671g != this.f53303b) {
                this.f53305d = c7671g.f53299d;
                this.f53302a--;
            } else {
                this.f53303b = c7671g.f53298c;
            }
            LinkedListMultimap.this.removeNode(c7671g);
            this.f53304c = null;
            this.f53306e = LinkedListMultimap.this.modCount;
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public C7671g addNode(K k, V v, @CheckForNull C7671g c7671g) {
        C7671g c7671g2 = new C7671g(k, v);
        if (this.head == null) {
            this.tail = c7671g2;
            this.head = c7671g2;
            this.keyToKeyList.put(k, new C7670f(c7671g2));
            this.modCount++;
        } else if (c7671g == null) {
            C7671g c7671g3 = this.tail;
            Objects.requireNonNull(c7671g3);
            c7671g3.f53298c = c7671g2;
            c7671g2.f53299d = this.tail;
            this.tail = c7671g2;
            C7670f c7670f = this.keyToKeyList.get(k);
            if (c7670f == null) {
                this.keyToKeyList.put(k, new C7670f(c7671g2));
                this.modCount++;
            } else {
                c7670f.f53295c++;
                C7671g c7671g4 = c7670f.f53294b;
                c7671g4.f53300e = c7671g2;
                c7671g2.f53301f = c7671g4;
                c7670f.f53294b = c7671g2;
            }
        } else {
            C7670f c7670f2 = this.keyToKeyList.get(k);
            Objects.requireNonNull(c7670f2);
            c7670f2.f53295c++;
            c7671g2.f53299d = c7671g.f53299d;
            c7671g2.f53301f = c7671g.f53301f;
            c7671g2.f53298c = c7671g;
            c7671g2.f53300e = c7671g;
            C7671g c7671g5 = c7671g.f53301f;
            if (c7671g5 == null) {
                c7670f2.f53293a = c7671g2;
            } else {
                c7671g5.f53300e = c7671g2;
            }
            C7671g c7671g6 = c7671g.f53299d;
            if (c7671g6 == null) {
                this.head = c7671g2;
            } else {
                c7671g6.f53298c = c7671g2;
            }
            c7671g.f53299d = c7671g2;
            c7671g.f53301f = c7671g2;
        }
        this.size++;
        return c7671g2;
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    private List<V> getCopy(K k) {
        return Collections.unmodifiableList(Lists.newArrayList(new C7673i(k)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyToKeyList = CompactLinkedHashMap.create();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(K k) {
        Iterators.m40831b(new C7673i(k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(C7671g c7671g) {
        C7671g c7671g2 = c7671g.f53299d;
        if (c7671g2 != null) {
            c7671g2.f53298c = c7671g.f53298c;
        } else {
            this.head = c7671g.f53298c;
        }
        C7671g c7671g3 = c7671g.f53298c;
        if (c7671g3 != null) {
            c7671g3.f53299d = c7671g2;
        } else {
            this.tail = c7671g2;
        }
        if (c7671g.f53301f == null && c7671g.f53300e == null) {
            C7670f remove = this.keyToKeyList.remove(c7671g.f53296a);
            Objects.requireNonNull(remove);
            remove.f53295c = 0;
            this.modCount++;
        } else {
            C7670f c7670f = this.keyToKeyList.get(c7671g.f53296a);
            Objects.requireNonNull(c7670f);
            c7670f.f53295c--;
            C7671g c7671g4 = c7671g.f53301f;
            if (c7671g4 == null) {
                C7671g c7671g5 = c7671g.f53300e;
                Objects.requireNonNull(c7671g5);
                c7670f.f53293a = c7671g5;
            } else {
                c7671g4.f53300e = c7671g.f53300e;
            }
            C7671g c7671g6 = c7671g.f53300e;
            if (c7671g6 == null) {
                C7671g c7671g7 = c7671g.f53301f;
                Objects.requireNonNull(c7671g7);
                c7670f.f53294b = c7671g7;
            } else {
                c7671g6.f53301f = c7671g.f53301f;
            }
        }
        this.size--;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@CheckForNull Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractC7936a
    public Map<K, Collection<V>> createAsMap() {
        return new Multimaps.C7791a(this);
    }

    @Override // com.google.common.collect.AbstractC7936a
    public Set<K> createKeySet() {
        return new C7666c();
    }

    @Override // com.google.common.collect.AbstractC7936a
    public Multiset<K> createKeys() {
        return new Multimaps.C7794c(this);
    }

    @Override // com.google.common.collect.AbstractC7936a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((LinkedListMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(K k, V v) {
        addNode(k, v, null);
        return true;
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((LinkedListMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractC7936a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private LinkedListMultimap(int i) {
        this.keyToKeyList = AbstractC7970k.m40219d(i);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
        return new LinkedListMultimap<>(i);
    }

    @Override // com.google.common.collect.AbstractC7936a
    public List<Map.Entry<K, V>> createEntries() {
        return new C7665b();
    }

    @Override // com.google.common.collect.AbstractC7936a
    public List<V> createValues() {
        return new C7667d();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List<V> get(K k) {
        return new C7664a(this, k);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(@CheckForNull Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k);
        C7673i c7673i = new C7673i(k);
        Iterator<? extends V> it = iterable.iterator();
        while (c7673i.hasNext() && it.hasNext()) {
            c7673i.next();
            c7673i.set(it.next());
        }
        while (c7673i.hasNext()) {
            c7673i.next();
            c7673i.remove();
        }
        while (it.hasNext()) {
            c7673i.add(it.next());
        }
        return copy;
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new LinkedListMultimap<>(multimap);
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$e */
    /* loaded from: classes4.dex */
    public class C7669e implements Iterator {

        /* renamed from: a */
        public final Set f53288a;

        /* renamed from: b */
        public C7671g f53289b;

        /* renamed from: c */
        public C7671g f53290c;

        /* renamed from: d */
        public int f53291d;

        public C7669e() {
            this.f53288a = Sets.newHashSetWithExpectedSize(LinkedListMultimap.this.keySet().size());
            this.f53289b = LinkedListMultimap.this.head;
            this.f53291d = LinkedListMultimap.this.modCount;
        }

        /* renamed from: a */
        public final void m40810a() {
            if (LinkedListMultimap.this.modCount == this.f53291d) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m40810a();
            if (this.f53289b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            C7671g c7671g;
            m40810a();
            C7671g c7671g2 = this.f53289b;
            if (c7671g2 != null) {
                this.f53290c = c7671g2;
                this.f53288a.add(c7671g2.f53296a);
                do {
                    c7671g = this.f53289b.f53298c;
                    this.f53289b = c7671g;
                    if (c7671g == null) {
                        break;
                    }
                } while (!this.f53288a.add(c7671g.f53296a));
                return this.f53290c.f53296a;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m40810a();
            if (this.f53290c != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.removeAllNodes(this.f53290c.f53296a);
            this.f53290c = null;
            this.f53291d = LinkedListMultimap.this.modCount;
        }

        public /* synthetic */ C7669e(LinkedListMultimap linkedListMultimap, C7664a c7664a) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$i */
    /* loaded from: classes4.dex */
    public class C7673i implements ListIterator {

        /* renamed from: a */
        public final Object f53308a;

        /* renamed from: b */
        public int f53309b;

        /* renamed from: c */
        public C7671g f53310c;

        /* renamed from: d */
        public C7671g f53311d;

        /* renamed from: e */
        public C7671g f53312e;

        public C7673i(Object obj) {
            this.f53308a = obj;
            C7670f c7670f = (C7670f) LinkedListMultimap.this.keyToKeyList.get(obj);
            this.f53310c = c7670f == null ? null : c7670f.f53293a;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f53312e = LinkedListMultimap.this.addNode(this.f53308a, obj, this.f53310c);
            this.f53309b++;
            this.f53311d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f53310c != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f53312e != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            C7671g c7671g = this.f53310c;
            if (c7671g != null) {
                this.f53311d = c7671g;
                this.f53312e = c7671g;
                this.f53310c = c7671g.f53300e;
                this.f53309b++;
                return c7671g.f53297b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f53309b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            C7671g c7671g = this.f53312e;
            if (c7671g != null) {
                this.f53311d = c7671g;
                this.f53310c = c7671g;
                this.f53312e = c7671g.f53301f;
                this.f53309b--;
                return c7671g.f53297b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f53309b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53311d != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            C7671g c7671g = this.f53311d;
            if (c7671g != this.f53310c) {
                this.f53312e = c7671g.f53301f;
                this.f53309b--;
            } else {
                this.f53310c = c7671g.f53300e;
            }
            LinkedListMultimap.this.removeNode(c7671g);
            this.f53311d = null;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            boolean z;
            if (this.f53311d != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f53311d.f53297b = obj;
        }

        public C7673i(Object obj, int i) {
            C7670f c7670f = (C7670f) LinkedListMultimap.this.keyToKeyList.get(obj);
            int i2 = c7670f == null ? 0 : c7670f.f53295c;
            Preconditions.checkPositionIndex(i, i2);
            if (i >= i2 / 2) {
                this.f53312e = c7670f == null ? null : c7670f.f53294b;
                this.f53309b = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.f53310c = c7670f == null ? null : c7670f.f53293a;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.f53308a = obj;
            this.f53311d = null;
        }
    }

    private LinkedListMultimap(Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }
}