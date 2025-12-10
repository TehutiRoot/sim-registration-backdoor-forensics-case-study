package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new C5712a();
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.C5715d entrySet;
    final C5720g header;
    private LinkedHashTreeMap<K, V>.C5717e keySet;
    int modCount;
    int size;
    C5720g[] table;
    int threshold;

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$a */
    /* loaded from: classes3.dex */
    public class C5712a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$b */
    /* loaded from: classes3.dex */
    public static final class C5713b {

        /* renamed from: a */
        public C5720g f41562a;

        /* renamed from: b */
        public int f41563b;

        /* renamed from: c */
        public int f41564c;

        /* renamed from: d */
        public int f41565d;

        /* renamed from: a */
        public void m50683a(C5720g c5720g) {
            c5720g.f41577c = null;
            c5720g.f41575a = null;
            c5720g.f41576b = null;
            c5720g.f41583i = 1;
            int i = this.f41563b;
            if (i > 0) {
                int i2 = this.f41565d;
                if ((i2 & 1) == 0) {
                    this.f41565d = i2 + 1;
                    this.f41563b = i - 1;
                    this.f41564c++;
                }
            }
            c5720g.f41575a = this.f41562a;
            this.f41562a = c5720g;
            int i3 = this.f41565d;
            int i4 = i3 + 1;
            this.f41565d = i4;
            int i5 = this.f41563b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f41565d = i3 + 2;
                this.f41563b = i5 - 1;
                this.f41564c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f41565d & i7) == i7) {
                    int i8 = this.f41564c;
                    if (i8 == 0) {
                        C5720g c5720g2 = this.f41562a;
                        C5720g c5720g3 = c5720g2.f41575a;
                        C5720g c5720g4 = c5720g3.f41575a;
                        c5720g3.f41575a = c5720g4.f41575a;
                        this.f41562a = c5720g3;
                        c5720g3.f41576b = c5720g4;
                        c5720g3.f41577c = c5720g2;
                        c5720g3.f41583i = c5720g2.f41583i + 1;
                        c5720g4.f41575a = c5720g3;
                        c5720g2.f41575a = c5720g3;
                    } else if (i8 == 1) {
                        C5720g c5720g5 = this.f41562a;
                        C5720g c5720g6 = c5720g5.f41575a;
                        this.f41562a = c5720g6;
                        c5720g6.f41577c = c5720g5;
                        c5720g6.f41583i = c5720g5.f41583i + 1;
                        c5720g5.f41575a = c5720g6;
                        this.f41564c = 0;
                    } else if (i8 == 2) {
                        this.f41564c = 0;
                    }
                    i6 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void m50682b(int i) {
            this.f41563b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f41565d = 0;
            this.f41564c = 0;
            this.f41562a = null;
        }

        /* renamed from: c */
        public C5720g m50681c() {
            C5720g c5720g = this.f41562a;
            if (c5720g.f41575a == null) {
                return c5720g;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$c */
    /* loaded from: classes3.dex */
    public static class C5714c {

        /* renamed from: a */
        public C5720g f41566a;

        /* renamed from: a */
        public C5720g m50680a() {
            C5720g c5720g = this.f41566a;
            if (c5720g == null) {
                return null;
            }
            C5720g c5720g2 = c5720g.f41575a;
            c5720g.f41575a = null;
            C5720g c5720g3 = c5720g.f41577c;
            while (true) {
                C5720g c5720g4 = c5720g2;
                c5720g2 = c5720g3;
                if (c5720g2 != null) {
                    c5720g2.f41575a = c5720g4;
                    c5720g3 = c5720g2.f41576b;
                } else {
                    this.f41566a = c5720g4;
                    return c5720g;
                }
            }
        }

        /* renamed from: b */
        public void m50679b(C5720g c5720g) {
            C5720g c5720g2 = null;
            while (c5720g != null) {
                c5720g.f41575a = c5720g2;
                c5720g2 = c5720g;
                c5720g = c5720g.f41576b;
            }
            this.f41566a = c5720g2;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d */
    /* loaded from: classes3.dex */
    public final class C5715d extends AbstractSet {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d$a */
        /* loaded from: classes3.dex */
        public class C5716a extends AbstractC5719f {
            public C5716a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry next() {
                return m50677a();
            }
        }

        public C5715d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C5716a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C5720g findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$e */
    /* loaded from: classes3.dex */
    public final class C5717e extends AbstractSet {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$e$a */
        /* loaded from: classes3.dex */
        public class C5718a extends AbstractC5719f {
            public C5718a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m50677a().f41580f;
            }
        }

        public C5717e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C5718a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LinkedHashTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$f */
    /* loaded from: classes3.dex */
    public abstract class AbstractC5719f implements Iterator {

        /* renamed from: a */
        public C5720g f41571a;

        /* renamed from: b */
        public C5720g f41572b = null;

        /* renamed from: c */
        public int f41573c;

        public AbstractC5719f() {
            this.f41571a = LinkedHashTreeMap.this.header.f41578d;
            this.f41573c = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C5720g m50677a() {
            C5720g c5720g = this.f41571a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (c5720g != linkedHashTreeMap.header) {
                if (linkedHashTreeMap.modCount == this.f41573c) {
                    this.f41571a = c5720g.f41578d;
                    this.f41572b = c5720g;
                    return c5720g;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f41571a != LinkedHashTreeMap.this.header) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C5720g c5720g = this.f41572b;
            if (c5720g != null) {
                LinkedHashTreeMap.this.removeInternal(c5720g, true);
                this.f41572b = null;
                this.f41573c = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedHashTreeMap() {
        this(null);
    }

    private void doubleCapacity() {
        C5720g[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    private void rebalance(C5720g c5720g, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c5720g != null) {
            C5720g c5720g2 = c5720g.f41576b;
            C5720g c5720g3 = c5720g.f41577c;
            int i5 = 0;
            if (c5720g2 != null) {
                i = c5720g2.f41583i;
            } else {
                i = 0;
            }
            if (c5720g3 != null) {
                i2 = c5720g3.f41583i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C5720g c5720g4 = c5720g3.f41576b;
                C5720g c5720g5 = c5720g3.f41577c;
                if (c5720g5 != null) {
                    i4 = c5720g5.f41583i;
                } else {
                    i4 = 0;
                }
                if (c5720g4 != null) {
                    i5 = c5720g4.f41583i;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    rotateRight(c5720g3);
                    rotateLeft(c5720g);
                } else {
                    rotateLeft(c5720g);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C5720g c5720g6 = c5720g2.f41576b;
                C5720g c5720g7 = c5720g2.f41577c;
                if (c5720g7 != null) {
                    i3 = c5720g7.f41583i;
                } else {
                    i3 = 0;
                }
                if (c5720g6 != null) {
                    i5 = c5720g6.f41583i;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    rotateLeft(c5720g2);
                    rotateRight(c5720g);
                } else {
                    rotateRight(c5720g);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c5720g.f41583i = i + 1;
                if (z) {
                    return;
                }
            } else {
                c5720g.f41583i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c5720g = c5720g.f41575a;
        }
    }

    private void replaceInParent(C5720g c5720g, C5720g c5720g2) {
        C5720g c5720g3 = c5720g.f41575a;
        c5720g.f41575a = null;
        if (c5720g2 != null) {
            c5720g2.f41575a = c5720g3;
        }
        if (c5720g3 != null) {
            if (c5720g3.f41576b == c5720g) {
                c5720g3.f41576b = c5720g2;
                return;
            } else {
                c5720g3.f41577c = c5720g2;
                return;
            }
        }
        int i = c5720g.f41581g;
        C5720g[] c5720gArr = this.table;
        c5720gArr[i & (c5720gArr.length - 1)] = c5720g2;
    }

    private void rotateLeft(C5720g c5720g) {
        int i;
        int i2;
        C5720g c5720g2 = c5720g.f41576b;
        C5720g c5720g3 = c5720g.f41577c;
        C5720g c5720g4 = c5720g3.f41576b;
        C5720g c5720g5 = c5720g3.f41577c;
        c5720g.f41577c = c5720g4;
        if (c5720g4 != null) {
            c5720g4.f41575a = c5720g;
        }
        replaceInParent(c5720g, c5720g3);
        c5720g3.f41576b = c5720g;
        c5720g.f41575a = c5720g3;
        int i3 = 0;
        if (c5720g2 != null) {
            i = c5720g2.f41583i;
        } else {
            i = 0;
        }
        if (c5720g4 != null) {
            i2 = c5720g4.f41583i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c5720g.f41583i = max;
        if (c5720g5 != null) {
            i3 = c5720g5.f41583i;
        }
        c5720g3.f41583i = Math.max(max, i3) + 1;
    }

    private void rotateRight(C5720g c5720g) {
        int i;
        int i2;
        C5720g c5720g2 = c5720g.f41576b;
        C5720g c5720g3 = c5720g.f41577c;
        C5720g c5720g4 = c5720g2.f41576b;
        C5720g c5720g5 = c5720g2.f41577c;
        c5720g.f41576b = c5720g5;
        if (c5720g5 != null) {
            c5720g5.f41575a = c5720g;
        }
        replaceInParent(c5720g, c5720g2);
        c5720g2.f41577c = c5720g;
        c5720g.f41575a = c5720g2;
        int i3 = 0;
        if (c5720g3 != null) {
            i = c5720g3.f41583i;
        } else {
            i = 0;
        }
        if (c5720g5 != null) {
            i2 = c5720g5.f41583i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c5720g.f41583i = max;
        if (c5720g4 != null) {
            i3 = c5720g4.f41583i;
        }
        c5720g2.f41583i = Math.max(max, i3) + 1;
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C5720g c5720g = this.header;
        C5720g c5720g2 = c5720g.f41578d;
        while (c5720g2 != c5720g) {
            C5720g c5720g3 = c5720g2.f41578d;
            c5720g2.f41579e = null;
            c5720g2.f41578d = null;
            c5720g2 = c5720g3;
        }
        c5720g.f41579e = c5720g;
        c5720g.f41578d = c5720g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.C5715d c5715d = this.entrySet;
        if (c5715d == null) {
            LinkedHashTreeMap<K, V>.C5715d c5715d2 = new C5715d();
            this.entrySet = c5715d2;
            return c5715d2;
        }
        return c5715d;
    }

    public C5720g find(K k, boolean z) {
        C5720g c5720g;
        int i;
        C5720g c5720g2;
        Comparable comparable;
        int compare;
        C5720g c5720g3;
        Comparator<? super K> comparator = this.comparator;
        C5720g[] c5720gArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (c5720gArr.length - 1) & secondaryHash;
        C5720g c5720g4 = c5720gArr[length];
        if (c5720g4 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(c5720g4.f41580f);
                } else {
                    compare = comparator.compare(k, (Object) c5720g4.f41580f);
                }
                if (compare == 0) {
                    return c5720g4;
                }
                if (compare < 0) {
                    c5720g3 = c5720g4.f41576b;
                } else {
                    c5720g3 = c5720g4.f41577c;
                }
                if (c5720g3 == null) {
                    c5720g = c5720g4;
                    i = compare;
                    break;
                }
                c5720g4 = c5720g3;
            }
        } else {
            c5720g = c5720g4;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5720g c5720g5 = this.header;
        if (c5720g == null) {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            c5720g2 = new C5720g(c5720g, k, secondaryHash, c5720g5, c5720g5.f41579e);
            c5720gArr[length] = c5720g2;
        } else {
            c5720g2 = new C5720g(c5720g, k, secondaryHash, c5720g5, c5720g5.f41579e);
            if (i < 0) {
                c5720g.f41576b = c5720g2;
            } else {
                c5720g.f41577c = c5720g2;
            }
            rebalance(c5720g, true);
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return c5720g2;
    }

    public C5720g findByEntry(Map.Entry<?, ?> entry) {
        C5720g findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f41582h, entry.getValue())) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5720g findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C5720g findByObject = findByObject(obj);
        if (findByObject != null) {
            return (V) findByObject.f41582h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.C5717e c5717e = this.keySet;
        if (c5717e == null) {
            LinkedHashTreeMap<K, V>.C5717e c5717e2 = new C5717e();
            this.keySet = c5717e2;
            return c5717e2;
        }
        return c5717e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            C5720g find = find(k, true);
            V v2 = (V) find.f41582h;
            find.f41582h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C5720g removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return (V) removeInternalByKey.f41582h;
        }
        return null;
    }

    public void removeInternal(C5720g c5720g, boolean z) {
        C5720g m50676a;
        int i;
        if (z) {
            C5720g c5720g2 = c5720g.f41579e;
            c5720g2.f41578d = c5720g.f41578d;
            c5720g.f41578d.f41579e = c5720g2;
            c5720g.f41579e = null;
            c5720g.f41578d = null;
        }
        C5720g c5720g3 = c5720g.f41576b;
        C5720g c5720g4 = c5720g.f41577c;
        C5720g c5720g5 = c5720g.f41575a;
        int i2 = 0;
        if (c5720g3 != null && c5720g4 != null) {
            if (c5720g3.f41583i > c5720g4.f41583i) {
                m50676a = c5720g3.m50675b();
            } else {
                m50676a = c5720g4.m50676a();
            }
            removeInternal(m50676a, false);
            C5720g c5720g6 = c5720g.f41576b;
            if (c5720g6 != null) {
                i = c5720g6.f41583i;
                m50676a.f41576b = c5720g6;
                c5720g6.f41575a = m50676a;
                c5720g.f41576b = null;
            } else {
                i = 0;
            }
            C5720g c5720g7 = c5720g.f41577c;
            if (c5720g7 != null) {
                i2 = c5720g7.f41583i;
                m50676a.f41577c = c5720g7;
                c5720g7.f41575a = m50676a;
                c5720g.f41577c = null;
            }
            m50676a.f41583i = Math.max(i, i2) + 1;
            replaceInParent(c5720g, m50676a);
            return;
        }
        if (c5720g3 != null) {
            replaceInParent(c5720g, c5720g3);
            c5720g.f41576b = null;
        } else if (c5720g4 != null) {
            replaceInParent(c5720g, c5720g4);
            c5720g.f41577c = null;
        } else {
            replaceInParent(c5720g, null);
        }
        rebalance(c5720g5, false);
        this.size--;
        this.modCount++;
    }

    public C5720g removeInternalByKey(Object obj) {
        C5720g findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new C5720g();
        C5720g[] c5720gArr = new C5720g[16];
        this.table = c5720gArr;
        this.threshold = (c5720gArr.length / 2) + (c5720gArr.length / 4);
    }

    public static <K, V> C5720g[] doubleCapacity(C5720g[] c5720gArr) {
        int length = c5720gArr.length;
        C5720g[] c5720gArr2 = new C5720g[length * 2];
        C5714c c5714c = new C5714c();
        C5713b c5713b = new C5713b();
        C5713b c5713b2 = new C5713b();
        for (int i = 0; i < length; i++) {
            C5720g c5720g = c5720gArr[i];
            if (c5720g != null) {
                c5714c.m50679b(c5720g);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C5720g m50680a = c5714c.m50680a();
                    if (m50680a == null) {
                        break;
                    } else if ((m50680a.f41581g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                c5713b.m50682b(i2);
                c5713b2.m50682b(i3);
                c5714c.m50679b(c5720g);
                while (true) {
                    C5720g m50680a2 = c5714c.m50680a();
                    if (m50680a2 == null) {
                        break;
                    } else if ((m50680a2.f41581g & length) == 0) {
                        c5713b.m50683a(m50680a2);
                    } else {
                        c5713b2.m50683a(m50680a2);
                    }
                }
                c5720gArr2[i] = i2 > 0 ? c5713b.m50681c() : null;
                c5720gArr2[i + length] = i3 > 0 ? c5713b2.m50681c() : null;
            }
        }
        return c5720gArr2;
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$g */
    /* loaded from: classes3.dex */
    public static final class C5720g implements Map.Entry {

        /* renamed from: a */
        public C5720g f41575a;

        /* renamed from: b */
        public C5720g f41576b;

        /* renamed from: c */
        public C5720g f41577c;

        /* renamed from: d */
        public C5720g f41578d;

        /* renamed from: e */
        public C5720g f41579e;

        /* renamed from: f */
        public final Object f41580f;

        /* renamed from: g */
        public final int f41581g;

        /* renamed from: h */
        public Object f41582h;

        /* renamed from: i */
        public int f41583i;

        public C5720g() {
            this.f41580f = null;
            this.f41581g = -1;
            this.f41579e = this;
            this.f41578d = this;
        }

        /* renamed from: a */
        public C5720g m50676a() {
            C5720g c5720g = this;
            for (C5720g c5720g2 = this.f41576b; c5720g2 != null; c5720g2 = c5720g2.f41576b) {
                c5720g = c5720g2;
            }
            return c5720g;
        }

        /* renamed from: b */
        public C5720g m50675b() {
            C5720g c5720g = this;
            for (C5720g c5720g2 = this.f41577c; c5720g2 != null; c5720g2 = c5720g2.f41577c) {
                c5720g = c5720g2;
            }
            return c5720g;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f41580f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f41582h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f41580f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f41582h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.f41580f;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.f41582h;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f41582h;
            this.f41582h = obj;
            return obj2;
        }

        public String toString() {
            return this.f41580f + "=" + this.f41582h;
        }

        public C5720g(C5720g c5720g, Object obj, int i, C5720g c5720g2, C5720g c5720g3) {
            this.f41575a = c5720g;
            this.f41580f = obj;
            this.f41581g = i;
            this.f41583i = 1;
            this.f41578d = c5720g2;
            this.f41579e = c5720g3;
            c5720g3.f41578d = this;
            c5720g2.f41579e = this;
        }
    }
}
