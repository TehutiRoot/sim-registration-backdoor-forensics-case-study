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
    public static Object[] f12357d;

    /* renamed from: e */
    public static int f12358e;

    /* renamed from: f */
    public static Object[] f12359f;

    /* renamed from: g */
    public static int f12360g;

    /* renamed from: h */
    public static final Object f12361h = new Object();

    /* renamed from: i */
    public static final Object f12362i = new Object();

    /* renamed from: a */
    public int[] f12363a;

    /* renamed from: b */
    public Object[] f12364b;

    /* renamed from: c */
    public int f12365c;

    /* renamed from: androidx.collection.ArraySet$a */
    /* loaded from: classes.dex */
    public class C2699a extends AbstractC19949fe0 {
        public C2699a() {
            super(ArraySet.this.f12365c);
        }

        @Override // p000.AbstractC19949fe0
        /* renamed from: a */
        public Object mo31495a(int i) {
            return ArraySet.this.valueAt(i);
        }

        @Override // p000.AbstractC19949fe0
        /* renamed from: b */
        public void mo31494b(int i) {
            ArraySet.this.removeAt(i);
        }
    }

    public ArraySet() {
        this(0);
    }

    /* renamed from: c */
    public static void m61723c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f12362i) {
                try {
                    if (f12360g < 10) {
                        objArr[0] = f12359f;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f12359f = objArr;
                        f12360g++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f12361h) {
                try {
                    if (f12358e < 10) {
                        objArr[0] = f12357d;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f12357d = objArr;
                        f12358e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m61725a(int i) {
        if (i == 8) {
            synchronized (f12362i) {
                try {
                    Object[] objArr = f12359f;
                    if (objArr != null) {
                        try {
                            this.f12364b = objArr;
                            f12359f = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f12363a = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f12360g--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f12359f = null;
                        f12360g = 0;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (f12361h) {
                try {
                    Object[] objArr2 = f12357d;
                    if (objArr2 != null) {
                        try {
                            this.f12364b = objArr2;
                            f12357d = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f12363a = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f12358e--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f12357d = null;
                        f12358e = 0;
                    }
                } finally {
                }
            }
        }
        this.f12363a = new int[i];
        this.f12364b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e) {
        int i;
        int m61722d;
        int i2 = this.f12365c;
        if (e == null) {
            m61722d = m61721e();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m61722d = m61722d(e, hashCode);
        }
        if (m61722d >= 0) {
            return false;
        }
        int i3 = ~m61722d;
        int[] iArr = this.f12363a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f12364b;
            m61725a(i4);
            if (i2 == this.f12365c) {
                int[] iArr2 = this.f12363a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f12364b, 0, objArr.length);
                }
                m61723c(iArr, objArr, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f12363a;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f12364b;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f12365c;
        if (i2 == i7) {
            int[] iArr4 = this.f12363a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f12364b[i3] = e;
                this.f12365c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void addAll(@NonNull ArraySet<? extends E> arraySet) {
        int i = arraySet.f12365c;
        ensureCapacity(this.f12365c + i);
        if (this.f12365c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(arraySet.valueAt(i2));
            }
        } else if (i > 0) {
            System.arraycopy(arraySet.f12363a, 0, this.f12363a, 0, i);
            System.arraycopy(arraySet.f12364b, 0, this.f12364b, 0, i);
            if (this.f12365c == 0) {
                this.f12365c = i;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public final int m61724b(int i) {
        try {
            return AbstractC17018wx.m623a(this.f12363a, this.f12365c, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f12365c;
        if (i != 0) {
            int[] iArr = this.f12363a;
            Object[] objArr = this.f12364b;
            this.f12363a = AbstractC17018wx.f108615a;
            this.f12364b = AbstractC17018wx.f108617c;
            this.f12365c = 0;
            m61723c(iArr, objArr, i);
        }
        if (this.f12365c == 0) {
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
    public final int m61722d(Object obj, int i) {
        int i2 = this.f12365c;
        if (i2 == 0) {
            return -1;
        }
        int m61724b = m61724b(i);
        if (m61724b < 0) {
            return m61724b;
        }
        if (obj.equals(this.f12364b[m61724b])) {
            return m61724b;
        }
        int i3 = m61724b + 1;
        while (i3 < i2 && this.f12363a[i3] == i) {
            if (obj.equals(this.f12364b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m61724b - 1; i4 >= 0 && this.f12363a[i4] == i; i4--) {
            if (obj.equals(this.f12364b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: e */
    public final int m61721e() {
        int i = this.f12365c;
        if (i == 0) {
            return -1;
        }
        int m61724b = m61724b(0);
        if (m61724b < 0) {
            return m61724b;
        }
        if (this.f12364b[m61724b] == null) {
            return m61724b;
        }
        int i2 = m61724b + 1;
        while (i2 < i && this.f12363a[i2] == 0) {
            if (this.f12364b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m61724b - 1; i3 >= 0 && this.f12363a[i3] == 0; i3--) {
            if (this.f12364b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void ensureCapacity(int i) {
        int i2 = this.f12365c;
        int[] iArr = this.f12363a;
        if (iArr.length < i) {
            Object[] objArr = this.f12364b;
            m61725a(i);
            int i3 = this.f12365c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f12363a, 0, i3);
                System.arraycopy(objArr, 0, this.f12364b, 0, this.f12365c);
            }
            m61723c(iArr, objArr, this.f12365c);
        }
        if (this.f12365c == i2) {
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
            for (int i = 0; i < this.f12365c; i++) {
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
        int[] iArr = this.f12363a;
        int i = this.f12365c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(@Nullable Object obj) {
        if (obj == null) {
            return m61721e();
        }
        return m61722d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.f12365c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NonNull
    public Iterator<E> iterator() {
        return new C2699a();
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
        int i = arraySet.f12365c;
        int i2 = this.f12365c;
        for (int i3 = 0; i3 < i; i3++) {
            remove(arraySet.valueAt(i3));
        }
        return i2 != this.f12365c;
    }

    public E removeAt(int i) {
        int i2 = this.f12365c;
        Object[] objArr = this.f12364b;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f12363a;
            int i4 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                m61725a(i4);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f12363a, 0, i);
                    System.arraycopy(objArr, 0, this.f12364b, 0, i);
                }
                if (i < i3) {
                    int i5 = i + 1;
                    int i6 = i3 - i;
                    System.arraycopy(iArr, i5, this.f12363a, i, i6);
                    System.arraycopy(objArr, i5, this.f12364b, i, i6);
                }
            } else {
                if (i < i3) {
                    int i7 = i + 1;
                    int i8 = i3 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f12364b;
                    System.arraycopy(objArr2, i7, objArr2, i, i8);
                }
                this.f12364b[i3] = null;
            }
            if (i2 == this.f12365c) {
                this.f12365c = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.f12365c - 1; i >= 0; i--) {
            if (!collection.contains(this.f12364b[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f12365c;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i = this.f12365c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f12364b, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12365c * 14);
        sb.append('{');
        for (int i = 0; i < this.f12365c; i++) {
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
        return (E) this.f12364b[i];
    }

    public ArraySet(int i) {
        if (i == 0) {
            this.f12363a = AbstractC17018wx.f108615a;
            this.f12364b = AbstractC17018wx.f108617c;
        } else {
            m61725a(i);
        }
        this.f12365c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f12365c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f12365c));
        }
        System.arraycopy(this.f12364b, 0, tArr, 0, this.f12365c);
        int length = tArr.length;
        int i = this.f12365c;
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
        ensureCapacity(this.f12365c + collection.size());
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