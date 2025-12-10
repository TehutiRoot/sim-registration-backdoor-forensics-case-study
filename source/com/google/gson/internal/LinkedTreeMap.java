package com.google.gson.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new C8715a();
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.C8716b entrySet;
    final C8721e header;
    private LinkedTreeMap<K, V>.C8718c keySet;
    int modCount;
    C8721e root;
    int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    /* loaded from: classes4.dex */
    public class C8715a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    /* loaded from: classes4.dex */
    public class C8716b extends AbstractSet {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$b$a */
        /* loaded from: classes4.dex */
        public class C8717a extends AbstractC8720d {
            public C8717a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry next() {
                return m37546a();
            }
        }

        public C8716b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C8717a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C8721e findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$c */
    /* loaded from: classes4.dex */
    public final class C8718c extends AbstractSet {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$c$a */
        /* loaded from: classes4.dex */
        public class C8719a extends AbstractC8720d {
            public C8719a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m37546a().f56739f;
            }
        }

        public C8718c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C8719a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LinkedTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$d */
    /* loaded from: classes4.dex */
    public abstract class AbstractC8720d implements Iterator {

        /* renamed from: a */
        public C8721e f56730a;

        /* renamed from: b */
        public C8721e f56731b = null;

        /* renamed from: c */
        public int f56732c;

        public AbstractC8720d() {
            this.f56730a = LinkedTreeMap.this.header.f56737d;
            this.f56732c = LinkedTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C8721e m37546a() {
            C8721e c8721e = this.f56730a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (c8721e != linkedTreeMap.header) {
                if (linkedTreeMap.modCount == this.f56732c) {
                    this.f56730a = c8721e.f56737d;
                    this.f56731b = c8721e;
                    return c8721e;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f56730a != LinkedTreeMap.this.header) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C8721e c8721e = this.f56731b;
            if (c8721e != null) {
                LinkedTreeMap.this.removeInternal(c8721e, true);
                this.f56731b = null;
                this.f56732c = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER, true);
    }

    private static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(C8721e c8721e, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c8721e != null) {
            C8721e c8721e2 = c8721e.f56735b;
            C8721e c8721e3 = c8721e.f56736c;
            int i5 = 0;
            if (c8721e2 != null) {
                i = c8721e2.f56742i;
            } else {
                i = 0;
            }
            if (c8721e3 != null) {
                i2 = c8721e3.f56742i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C8721e c8721e4 = c8721e3.f56735b;
                C8721e c8721e5 = c8721e3.f56736c;
                if (c8721e5 != null) {
                    i4 = c8721e5.f56742i;
                } else {
                    i4 = 0;
                }
                if (c8721e4 != null) {
                    i5 = c8721e4.f56742i;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    rotateRight(c8721e3);
                    rotateLeft(c8721e);
                } else {
                    rotateLeft(c8721e);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C8721e c8721e6 = c8721e2.f56735b;
                C8721e c8721e7 = c8721e2.f56736c;
                if (c8721e7 != null) {
                    i3 = c8721e7.f56742i;
                } else {
                    i3 = 0;
                }
                if (c8721e6 != null) {
                    i5 = c8721e6.f56742i;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    rotateLeft(c8721e2);
                    rotateRight(c8721e);
                } else {
                    rotateRight(c8721e);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c8721e.f56742i = i + 1;
                if (z) {
                    return;
                }
            } else {
                c8721e.f56742i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c8721e = c8721e.f56734a;
        }
    }

    private void replaceInParent(C8721e c8721e, C8721e c8721e2) {
        C8721e c8721e3 = c8721e.f56734a;
        c8721e.f56734a = null;
        if (c8721e2 != null) {
            c8721e2.f56734a = c8721e3;
        }
        if (c8721e3 != null) {
            if (c8721e3.f56735b == c8721e) {
                c8721e3.f56735b = c8721e2;
                return;
            } else {
                c8721e3.f56736c = c8721e2;
                return;
            }
        }
        this.root = c8721e2;
    }

    private void rotateLeft(C8721e c8721e) {
        int i;
        int i2;
        C8721e c8721e2 = c8721e.f56735b;
        C8721e c8721e3 = c8721e.f56736c;
        C8721e c8721e4 = c8721e3.f56735b;
        C8721e c8721e5 = c8721e3.f56736c;
        c8721e.f56736c = c8721e4;
        if (c8721e4 != null) {
            c8721e4.f56734a = c8721e;
        }
        replaceInParent(c8721e, c8721e3);
        c8721e3.f56735b = c8721e;
        c8721e.f56734a = c8721e3;
        int i3 = 0;
        if (c8721e2 != null) {
            i = c8721e2.f56742i;
        } else {
            i = 0;
        }
        if (c8721e4 != null) {
            i2 = c8721e4.f56742i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c8721e.f56742i = max;
        if (c8721e5 != null) {
            i3 = c8721e5.f56742i;
        }
        c8721e3.f56742i = Math.max(max, i3) + 1;
    }

    private void rotateRight(C8721e c8721e) {
        int i;
        int i2;
        C8721e c8721e2 = c8721e.f56735b;
        C8721e c8721e3 = c8721e.f56736c;
        C8721e c8721e4 = c8721e2.f56735b;
        C8721e c8721e5 = c8721e2.f56736c;
        c8721e.f56735b = c8721e5;
        if (c8721e5 != null) {
            c8721e5.f56734a = c8721e;
        }
        replaceInParent(c8721e, c8721e2);
        c8721e2.f56736c = c8721e;
        c8721e.f56734a = c8721e2;
        int i3 = 0;
        if (c8721e3 != null) {
            i = c8721e3.f56742i;
        } else {
            i = 0;
        }
        if (c8721e5 != null) {
            i2 = c8721e5.f56742i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c8721e.f56742i = max;
        if (c8721e4 != null) {
            i3 = c8721e4.f56742i;
        }
        c8721e2.f56742i = Math.max(max, i3) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C8721e c8721e = this.header;
        c8721e.f56738e = c8721e;
        c8721e.f56737d = c8721e;
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
        LinkedTreeMap<K, V>.C8716b c8716b = this.entrySet;
        if (c8716b == null) {
            LinkedTreeMap<K, V>.C8716b c8716b2 = new C8716b();
            this.entrySet = c8716b2;
            return c8716b2;
        }
        return c8716b;
    }

    public C8721e find(K k, boolean z) {
        int i;
        C8721e c8721e;
        Comparable comparable;
        C8721e c8721e2;
        Comparator<? super K> comparator = this.comparator;
        C8721e c8721e3 = this.root;
        if (c8721e3 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c8721e3.f56739f);
                } else {
                    i = comparator.compare(k, (Object) c8721e3.f56739f);
                }
                if (i == 0) {
                    return c8721e3;
                }
                if (i < 0) {
                    c8721e2 = c8721e3.f56735b;
                } else {
                    c8721e2 = c8721e3.f56736c;
                }
                if (c8721e2 == null) {
                    break;
                }
                c8721e3 = c8721e2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8721e c8721e4 = this.header;
        if (c8721e3 == null) {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            c8721e = new C8721e(this.allowNullValues, c8721e3, k, c8721e4, c8721e4.f56738e);
            this.root = c8721e;
        } else {
            c8721e = new C8721e(this.allowNullValues, c8721e3, k, c8721e4, c8721e4.f56738e);
            if (i < 0) {
                c8721e3.f56735b = c8721e;
            } else {
                c8721e3.f56736c = c8721e;
            }
            rebalance(c8721e3, true);
        }
        this.size++;
        this.modCount++;
        return c8721e;
    }

    public C8721e findByEntry(Map.Entry<?, ?> entry) {
        C8721e findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f56741h, entry.getValue())) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8721e findByObject(Object obj) {
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
        C8721e findByObject = findByObject(obj);
        if (findByObject != null) {
            return (V) findByObject.f56741h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.C8718c c8718c = this.keySet;
        if (c8718c == null) {
            LinkedTreeMap<K, V>.C8718c c8718c2 = new C8718c();
            this.keySet = c8718c2;
            return c8718c2;
        }
        return c8718c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k, V v) {
        if (k != null) {
            if (v == null && !this.allowNullValues) {
                throw new NullPointerException("value == null");
            }
            C8721e find = find(k, true);
            V v2 = (V) find.f56741h;
            find.f56741h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C8721e removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return (V) removeInternalByKey.f56741h;
        }
        return null;
    }

    public void removeInternal(C8721e c8721e, boolean z) {
        C8721e m37545a;
        int i;
        if (z) {
            C8721e c8721e2 = c8721e.f56738e;
            c8721e2.f56737d = c8721e.f56737d;
            c8721e.f56737d.f56738e = c8721e2;
        }
        C8721e c8721e3 = c8721e.f56735b;
        C8721e c8721e4 = c8721e.f56736c;
        C8721e c8721e5 = c8721e.f56734a;
        int i2 = 0;
        if (c8721e3 != null && c8721e4 != null) {
            if (c8721e3.f56742i > c8721e4.f56742i) {
                m37545a = c8721e3.m37544b();
            } else {
                m37545a = c8721e4.m37545a();
            }
            removeInternal(m37545a, false);
            C8721e c8721e6 = c8721e.f56735b;
            if (c8721e6 != null) {
                i = c8721e6.f56742i;
                m37545a.f56735b = c8721e6;
                c8721e6.f56734a = m37545a;
                c8721e.f56735b = null;
            } else {
                i = 0;
            }
            C8721e c8721e7 = c8721e.f56736c;
            if (c8721e7 != null) {
                i2 = c8721e7.f56742i;
                m37545a.f56736c = c8721e7;
                c8721e7.f56734a = m37545a;
                c8721e.f56736c = null;
            }
            m37545a.f56742i = Math.max(i, i2) + 1;
            replaceInParent(c8721e, m37545a);
            return;
        }
        if (c8721e3 != null) {
            replaceInParent(c8721e, c8721e3);
            c8721e.f56735b = null;
        } else if (c8721e4 != null) {
            replaceInParent(c8721e, c8721e4);
            c8721e.f56736c = null;
        } else {
            replaceInParent(c8721e, null);
        }
        rebalance(c8721e5, false);
        this.size--;
        this.modCount++;
    }

    public C8721e removeInternalByKey(Object obj) {
        C8721e findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean z) {
        this(NATURAL_ORDER, z);
    }

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.allowNullValues = z;
        this.header = new C8721e(z);
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$e */
    /* loaded from: classes4.dex */
    public static final class C8721e implements Map.Entry {

        /* renamed from: a */
        public C8721e f56734a;

        /* renamed from: b */
        public C8721e f56735b;

        /* renamed from: c */
        public C8721e f56736c;

        /* renamed from: d */
        public C8721e f56737d;

        /* renamed from: e */
        public C8721e f56738e;

        /* renamed from: f */
        public final Object f56739f;

        /* renamed from: g */
        public final boolean f56740g;

        /* renamed from: h */
        public Object f56741h;

        /* renamed from: i */
        public int f56742i;

        public C8721e(boolean z) {
            this.f56739f = null;
            this.f56740g = z;
            this.f56738e = this;
            this.f56737d = this;
        }

        /* renamed from: a */
        public C8721e m37545a() {
            C8721e c8721e = this;
            for (C8721e c8721e2 = this.f56735b; c8721e2 != null; c8721e2 = c8721e2.f56735b) {
                c8721e = c8721e2;
            }
            return c8721e;
        }

        /* renamed from: b */
        public C8721e m37544b() {
            C8721e c8721e = this;
            for (C8721e c8721e2 = this.f56736c; c8721e2 != null; c8721e2 = c8721e2.f56736c) {
                c8721e = c8721e2;
            }
            return c8721e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f56739f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f56741h;
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
            return this.f56739f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f56741h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.f56739f;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.f56741h;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f56740g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f56741h;
            this.f56741h = obj;
            return obj2;
        }

        public String toString() {
            return this.f56739f + "=" + this.f56741h;
        }

        public C8721e(boolean z, C8721e c8721e, Object obj, C8721e c8721e2, C8721e c8721e3) {
            this.f56734a = c8721e;
            this.f56739f = obj;
            this.f56740g = z;
            this.f56742i = 1;
            this.f56737d = c8721e2;
            this.f56738e = c8721e3;
            c8721e3.f56737d = this;
            c8721e2.f56738e = this;
        }
    }
}
