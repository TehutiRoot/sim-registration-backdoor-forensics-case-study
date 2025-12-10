package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E> {

    /* renamed from: d */
    public static Object[] f12269d;

    /* renamed from: e */
    public static int f12270e;

    /* renamed from: f */
    public static Object[] f12271f;

    /* renamed from: g */
    public static int f12272g;

    /* renamed from: h */
    public static final Object f12273h = new Object();

    /* renamed from: i */
    public static final Object f12274i = new Object();

    /* renamed from: a */
    public int[] f12275a;

    /* renamed from: b */
    public Object[] f12276b;

    /* renamed from: c */
    public int f12277c;

    /* renamed from: androidx.collection.ArraySet$a */
    /* loaded from: classes.dex */
    public class C2717a extends AbstractC18870Zd0 {
        public C2717a() {
            super(ArraySet.this.f12277c);
        }

        @Override // p000.AbstractC18870Zd0
        /* renamed from: a */
        public Object mo61772a(int i) {
            return ArraySet.this.valueAt(i);
        }

        @Override // p000.AbstractC18870Zd0
        /* renamed from: b */
        public void mo61771b(int i) {
            ArraySet.this.removeAt(i);
        }
    }

    public ArraySet() {
        this(0);
    }

    /* renamed from: c */
    public static void m61775c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f12274i) {
                try {
                    if (f12272g < 10) {
                        objArr[0] = f12271f;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f12271f = objArr;
                        f12272g++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f12273h) {
                try {
                    if (f12270e < 10) {
                        objArr[0] = f12269d;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f12269d = objArr;
                        f12270e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m61777a(int i) {
        if (i == 8) {
            synchronized (f12274i) {
                try {
                    Object[] objArr = f12271f;
                    if (objArr != null) {
                        try {
                            this.f12276b = objArr;
                            f12271f = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f12275a = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f12272g--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f12271f = null;
                        f12272g = 0;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (f12273h) {
                try {
                    Object[] objArr2 = f12269d;
                    if (objArr2 != null) {
                        try {
                            this.f12276b = objArr2;
                            f12269d = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f12275a = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f12270e--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f12269d = null;
                        f12270e = 0;
                    }
                } finally {
                }
            }
        }
        this.f12275a = new int[i];
        this.f12276b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e) {
        int i;
        int m61774d;
        int i2 = this.f12277c;
        if (e == null) {
            m61774d = m61773e();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m61774d = m61774d(e, hashCode);
        }
        if (m61774d >= 0) {
            return false;
        }
        int i3 = ~m61774d;
        int[] iArr = this.f12275a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f12276b;
            m61777a(i4);
            if (i2 == this.f12277c) {
                int[] iArr2 = this.f12275a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f12276b, 0, objArr.length);
                }
                m61775c(iArr, objArr, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f12275a;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f12276b;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f12277c;
        if (i2 == i7) {
            int[] iArr4 = this.f12275a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f12276b[i3] = e;
                this.f12277c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void addAll(@NonNull ArraySet<? extends E> arraySet) {
        int i = arraySet.f12277c;
        ensureCapacity(this.f12277c + i);
        if (this.f12277c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(arraySet.valueAt(i2));
            }
        } else if (i > 0) {
            System.arraycopy(arraySet.f12275a, 0, this.f12275a, 0, i);
            System.arraycopy(arraySet.f12276b, 0, this.f12276b, 0, i);
            if (this.f12277c == 0) {
                this.f12277c = i;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public final int m61776b(int i) {
        try {
            return AbstractC17009wx.m644a(this.f12275a, this.f12277c, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f12277c;
        if (i != 0) {
            int[] iArr = this.f12275a;
            Object[] objArr = this.f12276b;
            this.f12275a = AbstractC17009wx.f108184a;
            this.f12276b = AbstractC17009wx.f108186c;
            this.f12277c = 0;
            m61775c(iArr, objArr, i);
        }
        if (this.f12277c == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@Nullable Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m61774d(Object obj, int i) {
        int i2 = this.f12277c;
        if (i2 == 0) {
            return -1;
        }
        int m61776b = m61776b(i);
        if (m61776b < 0) {
            return m61776b;
        }
        if (obj.equals(this.f12276b[m61776b])) {
            return m61776b;
        }
        int i3 = m61776b + 1;
        while (i3 < i2 && this.f12275a[i3] == i) {
            if (obj.equals(this.f12276b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m61776b - 1; i4 >= 0 && this.f12275a[i4] == i; i4--) {
            if (obj.equals(this.f12276b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: e */
    public final int m61773e() {
        int i = this.f12277c;
        if (i == 0) {
            return -1;
        }
        int m61776b = m61776b(0);
        if (m61776b < 0) {
            return m61776b;
        }
        if (this.f12276b[m61776b] == null) {
            return m61776b;
        }
        int i2 = m61776b + 1;
        while (i2 < i && this.f12275a[i2] == 0) {
            if (this.f12276b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m61776b - 1; i3 >= 0 && this.f12275a[i3] == 0; i3--) {
            if (this.f12276b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void ensureCapacity(int i) {
        int i2 = this.f12277c;
        int[] iArr = this.f12275a;
        if (iArr.length < i) {
            Object[] objArr = this.f12276b;
            m61777a(i);
            int i3 = this.f12277c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f12275a, 0, i3);
                System.arraycopy(objArr, 0, this.f12276b, 0, this.f12277c);
            }
            m61775c(iArr, objArr, this.f12277c);
        }
        if (this.f12277c == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f12277c; i++) {
                try {
                    if (!set.contains(valueAt(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f12275a;
        int i = this.f12277c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(@Nullable Object obj) {
        if (obj == null) {
            return m61773e();
        }
        return m61774d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.f12277c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NonNull
    public Iterator<E> iterator() {
        return new C2717a();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@Nullable Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public boolean removeAll(@NonNull ArraySet<? extends E> arraySet) {
        int i = arraySet.f12277c;
        int i2 = this.f12277c;
        for (int i3 = 0; i3 < i; i3++) {
            remove(arraySet.valueAt(i3));
        }
        return i2 != this.f12277c;
    }

    public E removeAt(int i) {
        int i2 = this.f12277c;
        Object[] objArr = this.f12276b;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f12275a;
            int i4 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                m61777a(i4);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f12275a, 0, i);
                    System.arraycopy(objArr, 0, this.f12276b, 0, i);
                }
                if (i < i3) {
                    int i5 = i + 1;
                    int i6 = i3 - i;
                    System.arraycopy(iArr, i5, this.f12275a, i, i6);
                    System.arraycopy(objArr, i5, this.f12276b, i, i6);
                }
            } else {
                if (i < i3) {
                    int i7 = i + 1;
                    int i8 = i3 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f12276b;
                    System.arraycopy(objArr2, i7, objArr2, i, i8);
                }
                this.f12276b[i3] = null;
            }
            if (i2 == this.f12277c) {
                this.f12277c = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.f12277c - 1; i >= 0; i--) {
            if (!collection.contains(this.f12276b[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f12277c;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i = this.f12277c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f12276b, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12277c * 14);
        sb.append('{');
        for (int i = 0; i < this.f12277c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i) {
        return (E) this.f12276b[i];
    }

    public ArraySet(int i) {
        if (i == 0) {
            this.f12275a = AbstractC17009wx.f108184a;
            this.f12276b = AbstractC17009wx.f108186c;
        } else {
            m61777a(i);
        }
        this.f12277c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f12277c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f12277c));
        }
        System.arraycopy(this.f12276b, 0, tArr, 0, this.f12277c);
        int length = tArr.length;
        int i = this.f12277c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable ArraySet<E> arraySet) {
        this();
        if (arraySet != 0) {
            addAll((ArraySet) arraySet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        ensureCapacity(this.f12277c + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    public ArraySet(@Nullable E[] eArr) {
        this();
        if (eArr != null) {
            for (E e : eArr) {
                add(e);
            }
        }
    }
}
