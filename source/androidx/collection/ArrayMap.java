package androidx.collection;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {

    /* renamed from: h */
    public C2711a f12257h;

    /* renamed from: i */
    public C2713c f12258i;

    /* renamed from: j */
    public C2715e f12259j;

    /* renamed from: androidx.collection.ArrayMap$a */
    /* loaded from: classes.dex */
    public final class C2711a extends AbstractSet {
        public C2711a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C2714d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.f12314c;
        }
    }

    /* renamed from: androidx.collection.ArrayMap$b */
    /* loaded from: classes.dex */
    public final class C2712b extends AbstractC18870Zd0 {
        public C2712b() {
            super(ArrayMap.this.f12314c);
        }

        @Override // p000.AbstractC18870Zd0
        /* renamed from: a */
        public Object mo61772a(int i) {
            return ArrayMap.this.keyAt(i);
        }

        @Override // p000.AbstractC18870Zd0
        /* renamed from: b */
        public void mo61771b(int i) {
            ArrayMap.this.removeAt(i);
        }
    }

    /* renamed from: androidx.collection.ArrayMap$d */
    /* loaded from: classes.dex */
    public final class C2714d implements Iterator, Map.Entry {

        /* renamed from: a */
        public int f12263a;

        /* renamed from: b */
        public int f12264b = -1;

        /* renamed from: c */
        public boolean f12265c;

        public C2714d() {
            this.f12263a = ArrayMap.this.f12314c - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                this.f12264b++;
                this.f12265c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f12265c) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!AbstractC17009wx.m642c(entry.getKey(), ArrayMap.this.keyAt(this.f12264b)) || !AbstractC17009wx.m642c(entry.getValue(), ArrayMap.this.valueAt(this.f12264b))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f12265c) {
                return ArrayMap.this.keyAt(this.f12264b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f12265c) {
                return ArrayMap.this.valueAt(this.f12264b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12264b < this.f12263a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.f12265c) {
                K keyAt = ArrayMap.this.keyAt(this.f12264b);
                V valueAt = ArrayMap.this.valueAt(this.f12264b);
                int i = 0;
                if (keyAt == null) {
                    hashCode = 0;
                } else {
                    hashCode = keyAt.hashCode();
                }
                if (valueAt != null) {
                    i = valueAt.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12265c) {
                ArrayMap.this.removeAt(this.f12264b);
                this.f12264b--;
                this.f12263a--;
                this.f12265c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f12265c) {
                return ArrayMap.this.setValueAt(this.f12264b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: androidx.collection.ArrayMap$f */
    /* loaded from: classes.dex */
    public final class C2716f extends AbstractC18870Zd0 {
        public C2716f() {
            super(ArrayMap.this.f12314c);
        }

        @Override // p000.AbstractC18870Zd0
        /* renamed from: a */
        public Object mo61772a(int i) {
            return ArrayMap.this.valueAt(i);
        }

        @Override // p000.AbstractC18870Zd0
        /* renamed from: b */
        public void mo61771b(int i) {
            ArrayMap.this.removeAt(i);
        }
    }

    public ArrayMap() {
    }

    /* renamed from: h */
    public static boolean m61780h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        C2711a c2711a = this.f12257h;
        if (c2711a == null) {
            C2711a c2711a2 = new C2711a();
            this.f12257h = c2711a2;
            return c2711a2;
        }
        return c2711a;
    }

    /* renamed from: i */
    public Object[] m61779i(Object[] objArr, int i) {
        int i2 = this.f12314c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.f12313b[(i3 << 1) + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        C2713c c2713c = this.f12258i;
        if (c2713c == null) {
            C2713c c2713c2 = new C2713c();
            this.f12258i = c2713c2;
            return c2713c2;
        }
        return c2713c;
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        ensureCapacity(this.f12314c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        int i = this.f12314c;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (i != this.f12314c) {
            return true;
        }
        return false;
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        int i = this.f12314c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(keyAt(i2))) {
                removeAt(i2);
            }
        }
        if (i != this.f12314c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        C2715e c2715e = this.f12259j;
        if (c2715e == null) {
            C2715e c2715e2 = new C2715e();
            this.f12259j = c2715e2;
            return c2715e2;
        }
        return c2715e;
    }

    public ArrayMap(int i) {
        super(i);
    }

    /* renamed from: androidx.collection.ArrayMap$c */
    /* loaded from: classes.dex */
    public final class C2713c implements Set {
        public C2713c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ArrayMap.m61780h(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i = 0;
            for (int i2 = ArrayMap.this.f12314c - 1; i2 >= 0; i2--) {
                K keyAt = ArrayMap.this.keyAt(i2);
                if (keyAt == null) {
                    hashCode = 0;
                } else {
                    hashCode = keyAt.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C2712b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int indexOfKey = ArrayMap.this.indexOfKey(obj);
            if (indexOfKey >= 0) {
                ArrayMap.this.removeAt(indexOfKey);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ArrayMap.this.f12314c;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i = ArrayMap.this.f12314c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ArrayMap.this.keyAt(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return ArrayMap.this.m61779i(objArr, 0);
        }
    }

    /* renamed from: androidx.collection.ArrayMap$e */
    /* loaded from: classes.dex */
    public final class C2715e implements Collection {
        public C2715e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            if (ArrayMap.this.m61761g(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C2716f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int m61761g = ArrayMap.this.m61761g(obj);
            if (m61761g >= 0) {
                ArrayMap.this.removeAt(m61761g);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int i = ArrayMap.this.f12314c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(ArrayMap.this.valueAt(i2))) {
                    ArrayMap.this.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int i = ArrayMap.this.f12314c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(ArrayMap.this.valueAt(i2))) {
                    ArrayMap.this.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return ArrayMap.this.f12314c;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i = ArrayMap.this.f12314c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ArrayMap.this.valueAt(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return ArrayMap.this.m61779i(objArr, 1);
        }
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }
}
