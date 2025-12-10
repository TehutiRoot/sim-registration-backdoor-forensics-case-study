package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.bson.assertions.Assertions;

/* renamed from: UN1 */
/* loaded from: classes4.dex */
public class UN1 implements Set {

    /* renamed from: b */
    public static final String[] f6627b = new String[1024];

    /* renamed from: a */
    public final int f6628a;

    /* renamed from: UN1$a */
    /* loaded from: classes4.dex */
    public class C1440a implements Iterator {

        /* renamed from: a */
        public int f6629a = 0;

        public C1440a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                UN1 un1 = UN1.this;
                int i = this.f6629a;
                this.f6629a = i + 1;
                return un1.m66201c(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6629a < UN1.this.f6628a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        int i = 0;
        while (true) {
            String[] strArr = f6627b;
            if (i < strArr.length) {
                strArr[i] = String.valueOf(i);
                i++;
            } else {
                return;
            }
        }
    }

    public UN1(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.isTrue("size >= 0", z);
        this.f6628a = i;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final String m66201c(int i) {
        String[] strArr = f6627b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return Integer.toString(i);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) obj);
            if (parseInt < 0) {
                return false;
            }
            if (parseInt >= size()) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C1440a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f6628a;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        for (int i = 0; i < size(); i++) {
            objArr[i] = m66201c(i);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] objArr2 = objArr.length >= size() ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f6628a);
        for (int i = 0; i < size(); i++) {
            objArr2[i] = m66201c(i);
        }
        if (objArr.length > size()) {
            objArr[this.f6628a] = null;
        }
        return objArr2;
    }
}