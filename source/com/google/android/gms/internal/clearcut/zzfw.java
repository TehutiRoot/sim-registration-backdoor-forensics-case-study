package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public final class zzfw implements Cloneable {

    /* renamed from: e */
    public static final C6407o f45594e = new C6407o();

    /* renamed from: a */
    public boolean f45595a = false;

    /* renamed from: b */
    public int[] f45596b;

    /* renamed from: c */
    public C6407o[] f45597c;

    /* renamed from: d */
    public int f45598d;

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
        this.f45596b = new int[i5];
        this.f45597c = new C6407o[i5];
        this.f45598d = 0;
    }

    /* renamed from: a */
    public final int m48139a() {
        return this.f45598d;
    }

    /* renamed from: b */
    public final C6407o m48138b(int i) {
        return this.f45597c[i];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f45598d;
        zzfw zzfwVar = new zzfw(i);
        System.arraycopy(this.f45596b, 0, zzfwVar.f45596b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C6407o c6407o = this.f45597c[i2];
            if (c6407o != null) {
                zzfwVar.f45597c[i2] = (C6407o) c6407o.clone();
            }
        }
        zzfwVar.f45598d = i;
        return zzfwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfw) {
            zzfw zzfwVar = (zzfw) obj;
            int i = this.f45598d;
            if (i != zzfwVar.f45598d) {
                return false;
            }
            int[] iArr = this.f45596b;
            int[] iArr2 = zzfwVar.f45596b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    C6407o[] c6407oArr = this.f45597c;
                    C6407o[] c6407oArr2 = zzfwVar.f45597c;
                    int i3 = this.f45598d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (c6407oArr[i4].equals(c6407oArr2[i4])) {
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
        for (int i2 = 0; i2 < this.f45598d; i2++) {
            i = (((i * 31) + this.f45596b[i2]) * 31) + this.f45597c[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f45598d == 0;
    }
}
