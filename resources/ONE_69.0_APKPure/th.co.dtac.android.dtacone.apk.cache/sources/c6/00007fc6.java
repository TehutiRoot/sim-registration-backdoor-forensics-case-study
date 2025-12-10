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
    private static final Comparator<Comparable> NATURAL_ORDER = new C5701a();
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.C5704d entrySet;
    final C5709g header;
    private LinkedHashTreeMap<K, V>.C5706e keySet;
    int modCount;
    int size;
    C5709g[] table;
    int threshold;

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$a */
    /* loaded from: classes3.dex */
    public class C5701a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$b */
    /* loaded from: classes3.dex */
    public static final class C5702b {

        /* renamed from: a */
        public C5709g f41574a;

        /* renamed from: b */
        public int f41575b;

        /* renamed from: c */
        public int f41576c;

        /* renamed from: d */
        public int f41577d;

        /* renamed from: a */
        public void m50680a(C5709g c5709g) {
            c5709g.f41589c = null;
            c5709g.f41587a = null;
            c5709g.f41588b = null;
            c5709g.f41595i = 1;
            int i = this.f41575b;
            if (i > 0) {
                int i2 = this.f41577d;
                if ((i2 & 1) == 0) {
                    this.f41577d = i2 + 1;
                    this.f41575b = i - 1;
                    this.f41576c++;
                }
            }
            c5709g.f41587a = this.f41574a;
            this.f41574a = c5709g;
            int i3 = this.f41577d;
            int i4 = i3 + 1;
            this.f41577d = i4;
            int i5 = this.f41575b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f41577d = i3 + 2;
                this.f41575b = i5 - 1;
                this.f41576c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f41577d & i7) == i7) {
                    int i8 = this.f41576c;
                    if (i8 == 0) {
                        C5709g c5709g2 = this.f41574a;
                        C5709g c5709g3 = c5709g2.f41587a;
                        C5709g c5709g4 = c5709g3.f41587a;
                        c5709g3.f41587a = c5709g4.f41587a;
                        this.f41574a = c5709g3;
                        c5709g3.f41588b = c5709g4;
                        c5709g3.f41589c = c5709g2;
                        c5709g3.f41595i = c5709g2.f41595i + 1;
                        c5709g4.f41587a = c5709g3;
                        c5709g2.f41587a = c5709g3;
                    } else if (i8 == 1) {
                        C5709g c5709g5 = this.f41574a;
                        C5709g c5709g6 = c5709g5.f41587a;
                        this.f41574a = c5709g6;
                        c5709g6.f41589c = c5709g5;
                        c5709g6.f41595i = c5709g5.f41595i + 1;
                        c5709g5.f41587a = c5709g6;
                        this.f41576c = 0;
                    } else if (i8 == 2) {
                        this.f41576c = 0;
                    }
                    i6 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void m50679b(int i) {
            this.f41575b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f41577d = 0;
            this.f41576c = 0;
            this.f41574a = null;
        }

        /* renamed from: c */
        public C5709g m50678c() {
            C5709g c5709g = this.f41574a;
            if (c5709g.f41587a == null) {
                return c5709g;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$c */
    /* loaded from: classes3.dex */
    public static class C5703c {

        /* renamed from: a */
        public C5709g f41578a;

        /* renamed from: a */
        public C5709g m50677a() {
            C5709g c5709g = this.f41578a;
            if (c5709g == null) {
                return null;
            }
            C5709g c5709g2 = c5709g.f41587a;
            c5709g.f41587a = null;
            C5709g c5709g3 = c5709g.f41589c;
            while (true) {
                C5709g c5709g4 = c5709g2;
                c5709g2 = c5709g3;
                if (c5709g2 != null) {
                    c5709g2.f41587a = c5709g4;
                    c5709g3 = c5709g2.f41588b;
                } else {
                    this.f41578a = c5709g4;
                    return c5709g;
                }
            }
        }

        /* renamed from: b */
        public void m50676b(C5709g c5709g) {
            C5709g c5709g2 = null;
            while (c5709g != null) {
                c5709g.f41587a = c5709g2;
                c5709g2 = c5709g;
                c5709g = c5709g.f41588b;
            }
            this.f41578a = c5709g2;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d */
    /* loaded from: classes3.dex */
    public final class C5704d extends AbstractSet {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d$a */
        /* loaded from: classes3.dex */
        public class C5705a extends AbstractC5708f {
            public C5705a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry next() {
                return m50674a();
            }
        }

        public C5704d() {
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
            return new C5705a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C5709g findByEntry;
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
    public final class C5706e extends AbstractSet {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$e$a */
        /* loaded from: classes3.dex */
        public class C5707a extends AbstractC5708f {
            public C5707a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m50674a().f41592f;
            }
        }

        public C5706e() {
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
            return new C5707a();
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
    public abstract class AbstractC5708f implements Iterator {

        /* renamed from: a */
        public C5709g f41583a;

        /* renamed from: b */
        public C5709g f41584b = null;

        /* renamed from: c */
        public int f41585c;

        public AbstractC5708f() {
            this.f41583a = LinkedHashTreeMap.this.header.f41590d;
            this.f41585c = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C5709g m50674a() {
            C5709g c5709g = this.f41583a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (c5709g != linkedHashTreeMap.header) {
                if (linkedHashTreeMap.modCount == this.f41585c) {
                    this.f41583a = c5709g.f41590d;
                    this.f41584b = c5709g;
                    return c5709g;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f41583a != LinkedHashTreeMap.this.header) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C5709g c5709g = this.f41584b;
            if (c5709g != null) {
                LinkedHashTreeMap.this.removeInternal(c5709g, true);
                this.f41584b = null;
                this.f41585c = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedHashTreeMap() {
        this(null);
    }

    private void doubleCapacity() {
        C5709g[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    private void rebalance(C5709g c5709g, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c5709g != null) {
            C5709g c5709g2 = c5709g.f41588b;
            C5709g c5709g3 = c5709g.f41589c;
            int i5 = 0;
            if (c5709g2 != null) {
                i = c5709g2.f41595i;
            } else {
                i = 0;
            }
            if (c5709g3 != null) {
                i2 = c5709g3.f41595i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C5709g c5709g4 = c5709g3.f41588b;
                C5709g c5709g5 = c5709g3.f41589c;
                if (c5709g5 != null) {
                    i4 = c5709g5.f41595i;
                } else {
                    i4 = 0;
                }
                if (c5709g4 != null) {
                    i5 = c5709g4.f41595i;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    rotateRight(c5709g3);
                    rotateLeft(c5709g);
                } else {
                    rotateLeft(c5709g);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C5709g c5709g6 = c5709g2.f41588b;
                C5709g c5709g7 = c5709g2.f41589c;
                if (c5709g7 != null) {
                    i3 = c5709g7.f41595i;
                } else {
                    i3 = 0;
                }
                if (c5709g6 != null) {
                    i5 = c5709g6.f41595i;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    rotateLeft(c5709g2);
                    rotateRight(c5709g);
                } else {
                    rotateRight(c5709g);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c5709g.f41595i = i + 1;
                if (z) {
                    return;
                }
            } else {
                c5709g.f41595i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c5709g = c5709g.f41587a;
        }
    }

    private void replaceInParent(C5709g c5709g, C5709g c5709g2) {
        C5709g c5709g3 = c5709g.f41587a;
        c5709g.f41587a = null;
        if (c5709g2 != null) {
            c5709g2.f41587a = c5709g3;
        }
        if (c5709g3 != null) {
            if (c5709g3.f41588b == c5709g) {
                c5709g3.f41588b = c5709g2;
                return;
            } else {
                c5709g3.f41589c = c5709g2;
                return;
            }
        }
        int i = c5709g.f41593g;
        C5709g[] c5709gArr = this.table;
        c5709gArr[i & (c5709gArr.length - 1)] = c5709g2;
    }

    private void rotateLeft(C5709g c5709g) {
        int i;
        int i2;
        C5709g c5709g2 = c5709g.f41588b;
        C5709g c5709g3 = c5709g.f41589c;
        C5709g c5709g4 = c5709g3.f41588b;
        C5709g c5709g5 = c5709g3.f41589c;
        c5709g.f41589c = c5709g4;
        if (c5709g4 != null) {
            c5709g4.f41587a = c5709g;
        }
        replaceInParent(c5709g, c5709g3);
        c5709g3.f41588b = c5709g;
        c5709g.f41587a = c5709g3;
        int i3 = 0;
        if (c5709g2 != null) {
            i = c5709g2.f41595i;
        } else {
            i = 0;
        }
        if (c5709g4 != null) {
            i2 = c5709g4.f41595i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c5709g.f41595i = max;
        if (c5709g5 != null) {
            i3 = c5709g5.f41595i;
        }
        c5709g3.f41595i = Math.max(max, i3) + 1;
    }

    private void rotateRight(C5709g c5709g) {
        int i;
        int i2;
        C5709g c5709g2 = c5709g.f41588b;
        C5709g c5709g3 = c5709g.f41589c;
        C5709g c5709g4 = c5709g2.f41588b;
        C5709g c5709g5 = c5709g2.f41589c;
        c5709g.f41588b = c5709g5;
        if (c5709g5 != null) {
            c5709g5.f41587a = c5709g;
        }
        replaceInParent(c5709g, c5709g2);
        c5709g2.f41589c = c5709g;
        c5709g.f41587a = c5709g2;
        int i3 = 0;
        if (c5709g3 != null) {
            i = c5709g3.f41595i;
        } else {
            i = 0;
        }
        if (c5709g5 != null) {
            i2 = c5709g5.f41595i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c5709g.f41595i = max;
        if (c5709g4 != null) {
            i3 = c5709g4.f41595i;
        }
        c5709g2.f41595i = Math.max(max, i3) + 1;
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
        C5709g c5709g = this.header;
        C5709g c5709g2 = c5709g.f41590d;
        while (c5709g2 != c5709g) {
            C5709g c5709g3 = c5709g2.f41590d;
            c5709g2.f41591e = null;
            c5709g2.f41590d = null;
            c5709g2 = c5709g3;
        }
        c5709g.f41591e = c5709g;
        c5709g.f41590d = c5709g;
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
        LinkedHashTreeMap<K, V>.C5704d c5704d = this.entrySet;
        if (c5704d == null) {
            LinkedHashTreeMap<K, V>.C5704d c5704d2 = new C5704d();
            this.entrySet = c5704d2;
            return c5704d2;
        }
        return c5704d;
    }

    public C5709g find(K k, boolean z) {
        C5709g c5709g;
        int i;
        C5709g c5709g2;
        Comparable comparable;
        int compare;
        C5709g c5709g3;
        Comparator<? super K> comparator = this.comparator;
        C5709g[] c5709gArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (c5709gArr.length - 1) & secondaryHash;
        C5709g c5709g4 = c5709gArr[length];
        if (c5709g4 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(c5709g4.f41592f);
                } else {
                    compare = comparator.compare(k, (Object) c5709g4.f41592f);
                }
                if (compare == 0) {
                    return c5709g4;
                }
                if (compare < 0) {
                    c5709g3 = c5709g4.f41588b;
                } else {
                    c5709g3 = c5709g4.f41589c;
                }
                if (c5709g3 == null) {
                    c5709g = c5709g4;
                    i = compare;
                    break;
                }
                c5709g4 = c5709g3;
            }
        } else {
            c5709g = c5709g4;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5709g c5709g5 = this.header;
        if (c5709g == null) {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            c5709g2 = new C5709g(c5709g, k, secondaryHash, c5709g5, c5709g5.f41591e);
            c5709gArr[length] = c5709g2;
        } else {
            c5709g2 = new C5709g(c5709g, k, secondaryHash, c5709g5, c5709g5.f41591e);
            if (i < 0) {
                c5709g.f41588b = c5709g2;
            } else {
                c5709g.f41589c = c5709g2;
            }
            rebalance(c5709g, true);
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return c5709g2;
    }

    public C5709g findByEntry(Map.Entry<?, ?> entry) {
        C5709g findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f41594h, entry.getValue())) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5709g findByObject(Object obj) {
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
        C5709g findByObject = findByObject(obj);
        if (findByObject != null) {
            return (V) findByObject.f41594h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.C5706e c5706e = this.keySet;
        if (c5706e == null) {
            LinkedHashTreeMap<K, V>.C5706e c5706e2 = new C5706e();
            this.keySet = c5706e2;
            return c5706e2;
        }
        return c5706e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            C5709g find = find(k, true);
            V v2 = (V) find.f41594h;
            find.f41594h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C5709g removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return (V) removeInternalByKey.f41594h;
        }
        return null;
    }

    public void removeInternal(C5709g c5709g, boolean z) {
        C5709g m50673a;
        int i;
        if (z) {
            C5709g c5709g2 = c5709g.f41591e;
            c5709g2.f41590d = c5709g.f41590d;
            c5709g.f41590d.f41591e = c5709g2;
            c5709g.f41591e = null;
            c5709g.f41590d = null;
        }
        C5709g c5709g3 = c5709g.f41588b;
        C5709g c5709g4 = c5709g.f41589c;
        C5709g c5709g5 = c5709g.f41587a;
        int i2 = 0;
        if (c5709g3 != null && c5709g4 != null) {
            if (c5709g3.f41595i > c5709g4.f41595i) {
                m50673a = c5709g3.m50672b();
            } else {
                m50673a = c5709g4.m50673a();
            }
            removeInternal(m50673a, false);
            C5709g c5709g6 = c5709g.f41588b;
            if (c5709g6 != null) {
                i = c5709g6.f41595i;
                m50673a.f41588b = c5709g6;
                c5709g6.f41587a = m50673a;
                c5709g.f41588b = null;
            } else {
                i = 0;
            }
            C5709g c5709g7 = c5709g.f41589c;
            if (c5709g7 != null) {
                i2 = c5709g7.f41595i;
                m50673a.f41589c = c5709g7;
                c5709g7.f41587a = m50673a;
                c5709g.f41589c = null;
            }
            m50673a.f41595i = Math.max(i, i2) + 1;
            replaceInParent(c5709g, m50673a);
            return;
        }
        if (c5709g3 != null) {
            replaceInParent(c5709g, c5709g3);
            c5709g.f41588b = null;
        } else if (c5709g4 != null) {
            replaceInParent(c5709g, c5709g4);
            c5709g.f41589c = null;
        } else {
            replaceInParent(c5709g, null);
        }
        rebalance(c5709g5, false);
        this.size--;
        this.modCount++;
    }

    public C5709g removeInternalByKey(Object obj) {
        C5709g findByObject = findByObject(obj);
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
        this.header = new C5709g();
        C5709g[] c5709gArr = new C5709g[16];
        this.table = c5709gArr;
        this.threshold = (c5709gArr.length / 2) + (c5709gArr.length / 4);
    }

    public static <K, V> C5709g[] doubleCapacity(C5709g[] c5709gArr) {
        int length = c5709gArr.length;
        C5709g[] c5709gArr2 = new C5709g[length * 2];
        C5703c c5703c = new C5703c();
        C5702b c5702b = new C5702b();
        C5702b c5702b2 = new C5702b();
        for (int i = 0; i < length; i++) {
            C5709g c5709g = c5709gArr[i];
            if (c5709g != null) {
                c5703c.m50676b(c5709g);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C5709g m50677a = c5703c.m50677a();
                    if (m50677a == null) {
                        break;
                    } else if ((m50677a.f41593g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                c5702b.m50679b(i2);
                c5702b2.m50679b(i3);
                c5703c.m50676b(c5709g);
                while (true) {
                    C5709g m50677a2 = c5703c.m50677a();
                    if (m50677a2 == null) {
                        break;
                    } else if ((m50677a2.f41593g & length) == 0) {
                        c5702b.m50680a(m50677a2);
                    } else {
                        c5702b2.m50680a(m50677a2);
                    }
                }
                c5709gArr2[i] = i2 > 0 ? c5702b.m50678c() : null;
                c5709gArr2[i + length] = i3 > 0 ? c5702b2.m50678c() : null;
            }
        }
        return c5709gArr2;
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$g */
    /* loaded from: classes3.dex */
    public static final class C5709g implements Map.Entry {

        /* renamed from: a */
        public C5709g f41587a;

        /* renamed from: b */
        public C5709g f41588b;

        /* renamed from: c */
        public C5709g f41589c;

        /* renamed from: d */
        public C5709g f41590d;

        /* renamed from: e */
        public C5709g f41591e;

        /* renamed from: f */
        public final Object f41592f;

        /* renamed from: g */
        public final int f41593g;

        /* renamed from: h */
        public Object f41594h;

        /* renamed from: i */
        public int f41595i;

        public C5709g() {
            this.f41592f = null;
            this.f41593g = -1;
            this.f41591e = this;
            this.f41590d = this;
        }

        /* renamed from: a */
        public C5709g m50673a() {
            C5709g c5709g = this;
            for (C5709g c5709g2 = this.f41588b; c5709g2 != null; c5709g2 = c5709g2.f41588b) {
                c5709g = c5709g2;
            }
            return c5709g;
        }

        /* renamed from: b */
        public C5709g m50672b() {
            C5709g c5709g = this;
            for (C5709g c5709g2 = this.f41589c; c5709g2 != null; c5709g2 = c5709g2.f41589c) {
                c5709g = c5709g2;
            }
            return c5709g;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f41592f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f41594h;
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
            return this.f41592f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f41594h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.f41592f;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.f41594h;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f41594h;
            this.f41594h = obj;
            return obj2;
        }

        public String toString() {
            return this.f41592f + "=" + this.f41594h;
        }

        public C5709g(C5709g c5709g, Object obj, int i, C5709g c5709g2, C5709g c5709g3) {
            this.f41587a = c5709g;
            this.f41592f = obj;
            this.f41593g = i;
            this.f41595i = 1;
            this.f41590d = c5709g2;
            this.f41591e = c5709g3;
            c5709g3.f41590d = this;
            c5709g2.f41591e = this;
        }
    }
}