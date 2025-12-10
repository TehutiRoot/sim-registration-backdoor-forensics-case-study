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
    private static final Comparator<Comparable> NATURAL_ORDER = new C8704a();
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.C8705b entrySet;
    final C8710e header;
    private LinkedTreeMap<K, V>.C8707c keySet;
    int modCount;
    C8710e root;
    int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    /* loaded from: classes4.dex */
    public class C8704a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    /* loaded from: classes4.dex */
    public class C8705b extends AbstractSet {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$b$a */
        /* loaded from: classes4.dex */
        public class C8706a extends AbstractC8709d {
            public C8706a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry next() {
                return m37538a();
            }
        }

        public C8705b() {
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
            return new C8706a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C8710e findByEntry;
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
    public final class C8707c extends AbstractSet {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$c$a */
        /* loaded from: classes4.dex */
        public class C8708a extends AbstractC8709d {
            public C8708a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m37538a().f56751f;
            }
        }

        public C8707c() {
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
            return new C8708a();
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
    public abstract class AbstractC8709d implements Iterator {

        /* renamed from: a */
        public C8710e f56742a;

        /* renamed from: b */
        public C8710e f56743b = null;

        /* renamed from: c */
        public int f56744c;

        public AbstractC8709d() {
            this.f56742a = LinkedTreeMap.this.header.f56749d;
            this.f56744c = LinkedTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C8710e m37538a() {
            C8710e c8710e = this.f56742a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (c8710e != linkedTreeMap.header) {
                if (linkedTreeMap.modCount == this.f56744c) {
                    this.f56742a = c8710e.f56749d;
                    this.f56743b = c8710e;
                    return c8710e;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f56742a != LinkedTreeMap.this.header) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C8710e c8710e = this.f56743b;
            if (c8710e != null) {
                LinkedTreeMap.this.removeInternal(c8710e, true);
                this.f56743b = null;
                this.f56744c = LinkedTreeMap.this.modCount;
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

    private void rebalance(C8710e c8710e, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c8710e != null) {
            C8710e c8710e2 = c8710e.f56747b;
            C8710e c8710e3 = c8710e.f56748c;
            int i5 = 0;
            if (c8710e2 != null) {
                i = c8710e2.f56754i;
            } else {
                i = 0;
            }
            if (c8710e3 != null) {
                i2 = c8710e3.f56754i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C8710e c8710e4 = c8710e3.f56747b;
                C8710e c8710e5 = c8710e3.f56748c;
                if (c8710e5 != null) {
                    i4 = c8710e5.f56754i;
                } else {
                    i4 = 0;
                }
                if (c8710e4 != null) {
                    i5 = c8710e4.f56754i;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    rotateRight(c8710e3);
                    rotateLeft(c8710e);
                } else {
                    rotateLeft(c8710e);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C8710e c8710e6 = c8710e2.f56747b;
                C8710e c8710e7 = c8710e2.f56748c;
                if (c8710e7 != null) {
                    i3 = c8710e7.f56754i;
                } else {
                    i3 = 0;
                }
                if (c8710e6 != null) {
                    i5 = c8710e6.f56754i;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    rotateLeft(c8710e2);
                    rotateRight(c8710e);
                } else {
                    rotateRight(c8710e);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c8710e.f56754i = i + 1;
                if (z) {
                    return;
                }
            } else {
                c8710e.f56754i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c8710e = c8710e.f56746a;
        }
    }

    private void replaceInParent(C8710e c8710e, C8710e c8710e2) {
        C8710e c8710e3 = c8710e.f56746a;
        c8710e.f56746a = null;
        if (c8710e2 != null) {
            c8710e2.f56746a = c8710e3;
        }
        if (c8710e3 != null) {
            if (c8710e3.f56747b == c8710e) {
                c8710e3.f56747b = c8710e2;
                return;
            } else {
                c8710e3.f56748c = c8710e2;
                return;
            }
        }
        this.root = c8710e2;
    }

    private void rotateLeft(C8710e c8710e) {
        int i;
        int i2;
        C8710e c8710e2 = c8710e.f56747b;
        C8710e c8710e3 = c8710e.f56748c;
        C8710e c8710e4 = c8710e3.f56747b;
        C8710e c8710e5 = c8710e3.f56748c;
        c8710e.f56748c = c8710e4;
        if (c8710e4 != null) {
            c8710e4.f56746a = c8710e;
        }
        replaceInParent(c8710e, c8710e3);
        c8710e3.f56747b = c8710e;
        c8710e.f56746a = c8710e3;
        int i3 = 0;
        if (c8710e2 != null) {
            i = c8710e2.f56754i;
        } else {
            i = 0;
        }
        if (c8710e4 != null) {
            i2 = c8710e4.f56754i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c8710e.f56754i = max;
        if (c8710e5 != null) {
            i3 = c8710e5.f56754i;
        }
        c8710e3.f56754i = Math.max(max, i3) + 1;
    }

    private void rotateRight(C8710e c8710e) {
        int i;
        int i2;
        C8710e c8710e2 = c8710e.f56747b;
        C8710e c8710e3 = c8710e.f56748c;
        C8710e c8710e4 = c8710e2.f56747b;
        C8710e c8710e5 = c8710e2.f56748c;
        c8710e.f56747b = c8710e5;
        if (c8710e5 != null) {
            c8710e5.f56746a = c8710e;
        }
        replaceInParent(c8710e, c8710e2);
        c8710e2.f56748c = c8710e;
        c8710e.f56746a = c8710e2;
        int i3 = 0;
        if (c8710e3 != null) {
            i = c8710e3.f56754i;
        } else {
            i = 0;
        }
        if (c8710e5 != null) {
            i2 = c8710e5.f56754i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c8710e.f56754i = max;
        if (c8710e4 != null) {
            i3 = c8710e4.f56754i;
        }
        c8710e2.f56754i = Math.max(max, i3) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C8710e c8710e = this.header;
        c8710e.f56750e = c8710e;
        c8710e.f56749d = c8710e;
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
        LinkedTreeMap<K, V>.C8705b c8705b = this.entrySet;
        if (c8705b == null) {
            LinkedTreeMap<K, V>.C8705b c8705b2 = new C8705b();
            this.entrySet = c8705b2;
            return c8705b2;
        }
        return c8705b;
    }

    public C8710e find(K k, boolean z) {
        int i;
        C8710e c8710e;
        Comparable comparable;
        C8710e c8710e2;
        Comparator<? super K> comparator = this.comparator;
        C8710e c8710e3 = this.root;
        if (c8710e3 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c8710e3.f56751f);
                } else {
                    i = comparator.compare(k, (Object) c8710e3.f56751f);
                }
                if (i == 0) {
                    return c8710e3;
                }
                if (i < 0) {
                    c8710e2 = c8710e3.f56747b;
                } else {
                    c8710e2 = c8710e3.f56748c;
                }
                if (c8710e2 == null) {
                    break;
                }
                c8710e3 = c8710e2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8710e c8710e4 = this.header;
        if (c8710e3 == null) {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            c8710e = new C8710e(this.allowNullValues, c8710e3, k, c8710e4, c8710e4.f56750e);
            this.root = c8710e;
        } else {
            c8710e = new C8710e(this.allowNullValues, c8710e3, k, c8710e4, c8710e4.f56750e);
            if (i < 0) {
                c8710e3.f56747b = c8710e;
            } else {
                c8710e3.f56748c = c8710e;
            }
            rebalance(c8710e3, true);
        }
        this.size++;
        this.modCount++;
        return c8710e;
    }

    public C8710e findByEntry(Map.Entry<?, ?> entry) {
        C8710e findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f56753h, entry.getValue())) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8710e findByObject(Object obj) {
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
        C8710e findByObject = findByObject(obj);
        if (findByObject != null) {
            return (V) findByObject.f56753h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.C8707c c8707c = this.keySet;
        if (c8707c == null) {
            LinkedTreeMap<K, V>.C8707c c8707c2 = new C8707c();
            this.keySet = c8707c2;
            return c8707c2;
        }
        return c8707c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k, V v) {
        if (k != null) {
            if (v == null && !this.allowNullValues) {
                throw new NullPointerException("value == null");
            }
            C8710e find = find(k, true);
            V v2 = (V) find.f56753h;
            find.f56753h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C8710e removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return (V) removeInternalByKey.f56753h;
        }
        return null;
    }

    public void removeInternal(C8710e c8710e, boolean z) {
        C8710e m37537a;
        int i;
        if (z) {
            C8710e c8710e2 = c8710e.f56750e;
            c8710e2.f56749d = c8710e.f56749d;
            c8710e.f56749d.f56750e = c8710e2;
        }
        C8710e c8710e3 = c8710e.f56747b;
        C8710e c8710e4 = c8710e.f56748c;
        C8710e c8710e5 = c8710e.f56746a;
        int i2 = 0;
        if (c8710e3 != null && c8710e4 != null) {
            if (c8710e3.f56754i > c8710e4.f56754i) {
                m37537a = c8710e3.m37536b();
            } else {
                m37537a = c8710e4.m37537a();
            }
            removeInternal(m37537a, false);
            C8710e c8710e6 = c8710e.f56747b;
            if (c8710e6 != null) {
                i = c8710e6.f56754i;
                m37537a.f56747b = c8710e6;
                c8710e6.f56746a = m37537a;
                c8710e.f56747b = null;
            } else {
                i = 0;
            }
            C8710e c8710e7 = c8710e.f56748c;
            if (c8710e7 != null) {
                i2 = c8710e7.f56754i;
                m37537a.f56748c = c8710e7;
                c8710e7.f56746a = m37537a;
                c8710e.f56748c = null;
            }
            m37537a.f56754i = Math.max(i, i2) + 1;
            replaceInParent(c8710e, m37537a);
            return;
        }
        if (c8710e3 != null) {
            replaceInParent(c8710e, c8710e3);
            c8710e.f56747b = null;
        } else if (c8710e4 != null) {
            replaceInParent(c8710e, c8710e4);
            c8710e.f56748c = null;
        } else {
            replaceInParent(c8710e, null);
        }
        rebalance(c8710e5, false);
        this.size--;
        this.modCount++;
    }

    public C8710e removeInternalByKey(Object obj) {
        C8710e findByObject = findByObject(obj);
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
        this.header = new C8710e(z);
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$e */
    /* loaded from: classes4.dex */
    public static final class C8710e implements Map.Entry {

        /* renamed from: a */
        public C8710e f56746a;

        /* renamed from: b */
        public C8710e f56747b;

        /* renamed from: c */
        public C8710e f56748c;

        /* renamed from: d */
        public C8710e f56749d;

        /* renamed from: e */
        public C8710e f56750e;

        /* renamed from: f */
        public final Object f56751f;

        /* renamed from: g */
        public final boolean f56752g;

        /* renamed from: h */
        public Object f56753h;

        /* renamed from: i */
        public int f56754i;

        public C8710e(boolean z) {
            this.f56751f = null;
            this.f56752g = z;
            this.f56750e = this;
            this.f56749d = this;
        }

        /* renamed from: a */
        public C8710e m37537a() {
            C8710e c8710e = this;
            for (C8710e c8710e2 = this.f56747b; c8710e2 != null; c8710e2 = c8710e2.f56747b) {
                c8710e = c8710e2;
            }
            return c8710e;
        }

        /* renamed from: b */
        public C8710e m37536b() {
            C8710e c8710e = this;
            for (C8710e c8710e2 = this.f56748c; c8710e2 != null; c8710e2 = c8710e2.f56748c) {
                c8710e = c8710e2;
            }
            return c8710e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f56751f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f56753h;
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
            return this.f56751f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f56753h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.f56751f;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.f56753h;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f56752g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f56753h;
            this.f56753h = obj;
            return obj2;
        }

        public String toString() {
            return this.f56751f + "=" + this.f56753h;
        }

        public C8710e(boolean z, C8710e c8710e, Object obj, C8710e c8710e2, C8710e c8710e3) {
            this.f56746a = c8710e;
            this.f56751f = obj;
            this.f56752g = z;
            this.f56754i = 1;
            this.f56749d = c8710e2;
            this.f56750e = c8710e3;
            c8710e3.f56749d = this;
            c8710e2.f56750e = this;
        }
    }
}