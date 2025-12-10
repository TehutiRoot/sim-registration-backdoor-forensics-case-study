package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public final class zzfw implements Cloneable {

    /* renamed from: e */
    public static final C6396o f45606e = new C6396o();

    /* renamed from: a */
    public boolean f45607a = false;

    /* renamed from: b */
    public int[] f45608b;

    /* renamed from: c */
    public C6396o[] f45609c;

    /* renamed from: d */
    public int f45610d;

    public zzfw(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f45608b = new int[i5];
        this.f45609c = new C6396o[i5];
        this.f45610d = 0;
    }

    /* renamed from: a */
    public final int m48136a() {
        return this.f45610d;
    }

    /* renamed from: b */
    public final C6396o m48135b(int i) {
        return this.f45609c[i];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f45610d;
        zzfw zzfwVar = new zzfw(i);
        System.arraycopy(this.f45608b, 0, zzfwVar.f45608b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C6396o c6396o = this.f45609c[i2];
            if (c6396o != null) {
                zzfwVar.f45609c[i2] = (C6396o) c6396o.clone();
            }
        }
        zzfwVar.f45610d = i;
        return zzfwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfw) {
            zzfw zzfwVar = (zzfw) obj;
            int i = this.f45610d;
            if (i != zzfwVar.f45610d) {
                return false;
            }
            int[] iArr = this.f45608b;
            int[] iArr2 = zzfwVar.f45608b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    C6396o[] c6396oArr = this.f45609c;
                    C6396o[] c6396oArr2 = zzfwVar.f45609c;
                    int i3 = this.f45610d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (c6396oArr[i4].equals(c6396oArr2[i4])) {
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f45610d; i2++) {
            i = (((i * 31) + this.f45608b[i2]) * 31) + this.f45609c[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f45610d == 0;
    }
}