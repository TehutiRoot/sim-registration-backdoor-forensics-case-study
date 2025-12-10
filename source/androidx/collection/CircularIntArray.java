package androidx.collection;

/* loaded from: classes.dex */
public final class CircularIntArray {

    /* renamed from: a */
    public int[] f12283a;

    /* renamed from: b */
    public int f12284b;

    /* renamed from: c */
    public int f12285c;

    /* renamed from: d */
    public int f12286d;

    public CircularIntArray() {
        this(8);
    }

    /* renamed from: a */
    public final void m61769a() {
        int[] iArr = this.f12283a;
        int length = iArr.length;
        int i = this.f12284b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f12283a, 0, iArr2, i2, this.f12284b);
            this.f12283a = iArr2;
            this.f12284b = 0;
            this.f12285c = length;
            this.f12286d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void addFirst(int i) {
        int i2 = (this.f12284b - 1) & this.f12286d;
        this.f12284b = i2;
        this.f12283a[i2] = i;
        if (i2 == this.f12285c) {
            m61769a();
        }
    }

    public void addLast(int i) {
        int[] iArr = this.f12283a;
        int i2 = this.f12285c;
        iArr[i2] = i;
        int i3 = this.f12286d & (i2 + 1);
        this.f12285c = i3;
        if (i3 == this.f12284b) {
            m61769a();
        }
    }

    public void clear() {
        this.f12285c = this.f12284b;
    }

    public int get(int i) {
        if (i >= 0 && i < size()) {
            return this.f12283a[this.f12286d & (this.f12284b + i)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getFirst() {
        int i = this.f12284b;
        if (i != this.f12285c) {
            return this.f12283a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getLast() {
        int i = this.f12284b;
        int i2 = this.f12285c;
        if (i != i2) {
            return this.f12283a[(i2 - 1) & this.f12286d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        if (this.f12284b == this.f12285c) {
            return true;
        }
        return false;
    }

    public int popFirst() {
        int i = this.f12284b;
        if (i != this.f12285c) {
            int i2 = this.f12283a[i];
            this.f12284b = (i + 1) & this.f12286d;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int popLast() {
        int i = this.f12284b;
        int i2 = this.f12285c;
        if (i != i2) {
            int i3 = this.f12286d & (i2 - 1);
            int i4 = this.f12283a[i3];
            this.f12285c = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromEnd(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= size()) {
            this.f12285c = this.f12286d & (this.f12285c - i);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromStart(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= size()) {
            this.f12284b = this.f12286d & (this.f12284b + i);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int size() {
        return (this.f12285c - this.f12284b) & this.f12286d;
    }

    public CircularIntArray(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f12286d = i - 1;
            this.f12283a = new int[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}
