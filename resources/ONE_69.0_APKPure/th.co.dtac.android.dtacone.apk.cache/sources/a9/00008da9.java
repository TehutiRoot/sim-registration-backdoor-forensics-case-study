package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.o */
/* loaded from: classes3.dex */
public final class C6396o implements Cloneable {

    /* renamed from: a */
    public zzfv f45507a;

    /* renamed from: b */
    public Object f45508b;

    /* renamed from: c */
    public List f45509c = new ArrayList();

    /* renamed from: a */
    public final byte[] m48208a() {
        byte[] bArr = new byte[m48206c()];
        m48207b(zzfs.zzg(bArr));
        return bArr;
    }

    /* renamed from: b */
    public final void m48207b(zzfs zzfsVar) {
        if (this.f45508b != null) {
            throw new NoSuchMethodError();
        }
        Iterator it = this.f45509c.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: c */
    public final int m48206c() {
        if (this.f45508b == null) {
            Iterator it = this.f45509c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return 0;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    public final C6396o clone() {
        Object clone;
        C6396o c6396o = new C6396o();
        try {
            c6396o.f45507a = this.f45507a;
            List list = this.f45509c;
            if (list == null) {
                c6396o.f45509c = null;
            } else {
                c6396o.f45509c.addAll(list);
            }
            Object obj = this.f45508b;
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
                        c6396o.f45508b = bArr2;
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
                        c6396o.f45508b = zzfzVarArr2;
                        while (i < zzfzVarArr.length) {
                            zzfzVarArr2[i] = (zzfz) zzfzVarArr[i].clone();
                            i++;
                        }
                    }
                }
                c6396o.f45508b = clone;
            }
            return c6396o;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6396o) {
            C6396o c6396o = (C6396o) obj;
            if (this.f45508b == null || c6396o.f45508b == null) {
                List list2 = this.f45509c;
                if (list2 == null || (list = c6396o.f45509c) == null) {
                    try {
                        return Arrays.equals(m48208a(), c6396o.m48208a());
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
                return list2.equals(list);
            }
            zzfv zzfvVar = this.f45507a;
            if (zzfvVar != c6396o.f45507a) {
                return false;
            }
            if (zzfvVar.zzrk.isArray()) {
                Object obj2 = this.f45508b;
                return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) c6396o.f45508b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) c6396o.f45508b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) c6396o.f45508b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) c6396o.f45508b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) c6396o.f45508b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) c6396o.f45508b) : Arrays.deepEquals((Object[]) obj2, (Object[]) c6396o.f45508b);
            }
            return this.f45508b.equals(c6396o.f45508b);
        }
        return false;
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m48208a()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}