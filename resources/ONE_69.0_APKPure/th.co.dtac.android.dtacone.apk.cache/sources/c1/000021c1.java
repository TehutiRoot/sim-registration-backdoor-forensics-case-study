package androidx.collection;

/* loaded from: classes.dex */
public final class CircularArray<E> {

    /* renamed from: a */
    public Object[] f12367a;

    /* renamed from: b */
    public int f12368b;

    /* renamed from: c */
    public int f12369c;

    /* renamed from: d */
    public int f12370d;

    public CircularArray() {
        this(8);
    }

    /* renamed from: a */
    public final void m61720a() {
        Object[] objArr = this.f12367a;
        int length = objArr.length;
        int i = this.f12368b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            Object[] objArr2 = new Object[i3];
            System.arraycopy(objArr, i, objArr2, 0, i2);
            System.arraycopy(this.f12367a, 0, objArr2, i2, this.f12368b);
            this.f12367a = objArr2;
            this.f12368b = 0;
            this.f12369c = length;
            this.f12370d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void addFirst(E e) {
        int i = (this.f12368b - 1) & this.f12370d;
        this.f12368b = i;
        this.f12367a[i] = e;
        if (i == this.f12369c) {
            m61720a();
        }
    }

    public void addLast(E e) {
        Object[] objArr = this.f12367a;
        int i = this.f12369c;
        objArr[i] = e;
        int i2 = this.f12370d & (i + 1);
        this.f12369c = i2;
        if (i2 == this.f12368b) {
            m61720a();
        }
    }

    public void clear() {
        removeFromStart(size());
    }

    public E get(int i) {
        if (i >= 0 && i < size()) {
            return (E) this.f12367a[this.f12370d & (this.f12368b + i)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E getFirst() {
        int i = this.f12368b;
        if (i != this.f12369c) {
            return (E) this.f12367a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E getLast() {
        int i = this.f12368b;
        int i2 = this.f12369c;
        if (i != i2) {
            return (E) this.f12367a[(i2 - 1) & this.f12370d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        if (this.f12368b == this.f12369c) {
            return true;
        }
        return false;
    }

    public E popFirst() {
        int i = this.f12368b;
        if (i != this.f12369c) {
            Object[] objArr = this.f12367a;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f12368b = (i + 1) & this.f12370d;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E popLast() {
        int i = this.f12368b;
        int i2 = this.f12369c;
        if (i != i2) {
            int i3 = this.f12370d & (i2 - 1);
            Object[] objArr = this.f12367a;
            E e = (E) objArr[i3];
            objArr[i3] = null;
            this.f12369c = i3;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromEnd(int i) {
        int i2;
        int i3;
        if (i <= 0) {
            return;
        }
        if (i <= size()) {
            int i4 = this.f12369c;
            if (i < i4) {
                i2 = i4 - i;
            } else {
                i2 = 0;
            }
            int i5 = i2;
            while (true) {
                i3 = this.f12369c;
                if (i5 >= i3) {
                    break;
                }
                this.f12367a[i5] = null;
                i5++;
            }
            int i6 = i3 - i2;
            int i7 = i - i6;
            this.f12369c = i3 - i6;
            if (i7 > 0) {
                int length = this.f12367a.length;
                this.f12369c = length;
                int i8 = length - i7;
                for (int i9 = i8; i9 < this.f12369c; i9++) {
                    this.f12367a[i9] = null;
                }
                this.f12369c = i8;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromStart(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= size()) {
            int length = this.f12367a.length;
            int i2 = this.f12368b;
            if (i < length - i2) {
                length = i2 + i;
            }
            while (i2 < length) {
                this.f12367a[i2] = null;
                i2++;
            }
            int i3 = this.f12368b;
            int i4 = length - i3;
            int i5 = i - i4;
            this.f12368b = this.f12370d & (i3 + i4);
            if (i5 > 0) {
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f12367a[i6] = null;
                }
                this.f12368b = i5;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int size() {
        return (this.f12369c - this.f12368b) & this.f12370d;
    }

    public CircularArray(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f12370d = i - 1;
            this.f12367a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}