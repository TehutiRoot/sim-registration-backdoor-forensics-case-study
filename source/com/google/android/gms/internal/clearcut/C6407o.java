package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.o */
/* loaded from: classes3.dex */
public final class C6407o implements Cloneable {

    /* renamed from: a */
    public zzfv f45495a;

    /* renamed from: b */
    public Object f45496b;

    /* renamed from: c */
    public List f45497c = new ArrayList();

    /* renamed from: a */
    public final byte[] m48211a() {
        byte[] bArr = new byte[m48209c()];
        m48210b(zzfs.zzg(bArr));
        return bArr;
    }

    /* renamed from: b */
    public final void m48210b(zzfs zzfsVar) {
        if (this.f45496b != null) {
            throw new NoSuchMethodError();
        }
        Iterator it = this.f45497c.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: c */
    public final int m48209c() {
        if (this.f45496b == null) {
            Iterator it = this.f45497c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return 0;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    public final C6407o clone() {
        Object clone;
        C6407o c6407o = new C6407o();
        try {
            c6407o.f45495a = this.f45495a;
            List list = this.f45497c;
            if (list == null) {
                c6407o.f45497c = null;
            } else {
                c6407o.f45497c.addAll(list);
            }
            Object obj = this.f45496b;
            if (obj != null) {
                if (obj instanceof zzfz) {
                    clone = (zzfz) ((zzfz) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        c6407o.f45496b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof zzfz[]) {
                        zzfz[] zzfzVarArr = (zzfz[]) obj;
                        zzfz[] zzfzVarArr2 = new zzfz[zzfzVarArr.length];
                        c6407o.f45496b = zzfzVarArr2;
                        while (i < zzfzVarArr.length) {
                            zzfzVarArr2[i] = (zzfz) zzfzVarArr[i].clone();
                            i++;
                        }
                    }
                }
                c6407o.f45496b = clone;
            }
            return c6407o;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6407o) {
            C6407o c6407o = (C6407o) obj;
            if (this.f45496b == null || c6407o.f45496b == null) {
                List list2 = this.f45497c;
                if (list2 == null || (list = c6407o.f45497c) == null) {
                    try {
                        return Arrays.equals(m48211a(), c6407o.m48211a());
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
                return list2.equals(list);
            }
            zzfv zzfvVar = this.f45495a;
            if (zzfvVar != c6407o.f45495a) {
                return false;
            }
            if (zzfvVar.zzrk.isArray()) {
                Object obj2 = this.f45496b;
                return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) c6407o.f45496b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) c6407o.f45496b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) c6407o.f45496b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) c6407o.f45496b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) c6407o.f45496b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) c6407o.f45496b) : Arrays.deepEquals((Object[]) obj2, (Object[]) c6407o.f45496b);
            }
            return this.f45496b.equals(c6407o.f45496b);
        }
        return false;
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m48211a()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
