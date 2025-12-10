package androidx.collection;

/* loaded from: classes.dex */
public final class CircularIntArray {

    /* renamed from: a */
    public int[] f12371a;

    /* renamed from: b */
    public int f12372b;

    /* renamed from: c */
    public int f12373c;

    /* renamed from: d */
    public int f12374d;

    public CircularIntArray() {
        this(8);
    }

    /* renamed from: a */
    public final void m61719a() {
        int[] iArr = this.f12371a;
        int length = iArr.length;
        int i = this.f12372b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f12371a, 0, iArr2, i2, this.f12372b);
            this.f12371a = iArr2;
            this.f12372b = 0;
            this.f12373c = length;
            this.f12374d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void addFirst(int i) {
        int i2 = (this.f12372b - 1) & this.f12374d;
        this.f12372b = i2;
        this.f12371a[i2] = i;
        if (i2 == this.f12373c) {
            m61719a();
        }
    }

    public void addLast(int i) {
        int[] iArr = this.f12371a;
        int i2 = this.f12373c;
        iArr[i2] = i;
        int i3 = this.f12374d & (i2 + 1);
        this.f12373c = i3;
        if (i3 == this.f12372b) {
            m61719a();
        }
    }

    public void clear() {
        this.f12373c = this.f12372b;
    }

    public int get(int i) {
        if (i >= 0 && i < size()) {
            return this.f12371a[this.f12374d & (this.f12372b + i)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getFirst() {
        int i = this.f12372b;
        if (i != this.f12373c) {
            return this.f12371a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getLast() {
        int i = this.f12372b;
        int i2 = this.f12373c;
        if (i != i2) {
            return this.f12371a[(i2 - 1) & this.f12374d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        if (this.f12372b == this.f12373c) {
            return true;
        }
        return false;
    }

    public int popFirst() {
        int i = this.f12372b;
        if (i != this.f12373c) {
            int i2 = this.f12371a[i];
            this.f12372b = (i + 1) & this.f12374d;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int popLast() {
        int i = this.f12372b;
        int i2 = this.f12373c;
        if (i != i2) {
            int i3 = this.f12374d & (i2 - 1);
            int i4 = this.f12371a[i3];
            this.f12373c = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromEnd(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= size()) {
            this.f12373c = this.f12374d & (this.f12373c - i);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromStart(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= size()) {
            this.f12372b = this.f12374d & (this.f12372b + i);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int size() {
        return (this.f12373c - this.f12372b) & this.f12374d;
    }

    public CircularIntArray(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f12374d = i - 1;
            this.f12371a = new int[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}