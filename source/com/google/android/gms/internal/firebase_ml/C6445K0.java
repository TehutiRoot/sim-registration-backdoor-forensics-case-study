package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase_ml.K0 */
/* loaded from: classes3.dex */
public final class C6445K0 {

    /* renamed from: a */
    public final ArrayDeque f45706a;

    public C6445K0() {
        this.f45706a = new ArrayDeque();
    }

    /* renamed from: a */
    public static /* synthetic */ zzwd m47996a(C6445K0 c6445k0, zzwd zzwdVar, zzwd zzwdVar2) {
        return c6445k0.m47995b(zzwdVar, zzwdVar2);
    }

    /* renamed from: c */
    public static int m47994c(int i) {
        int binarySearch = Arrays.binarySearch(zzzi.zzcsa, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    /* renamed from: b */
    public final zzwd m47995b(zzwd zzwdVar, zzwd zzwdVar2) {
        m47993d(zzwdVar);
        m47993d(zzwdVar2);
        zzwd zzwdVar3 = (zzwd) this.f45706a.pop();
        while (!this.f45706a.isEmpty()) {
            zzwdVar3 = new zzzi((zzwd) this.f45706a.pop(), zzwdVar3, null);
        }
        return zzwdVar3;
    }

    /* renamed from: d */
    public final void m47993d(zzwd zzwdVar) {
        zzwd zzwdVar2;
        while (!zzwdVar.zzue()) {
            if (zzwdVar instanceof zzzi) {
                zzzi zzziVar = (zzzi) zzwdVar;
                zzwdVar2 = zzziVar.zzcsc;
                m47993d(zzwdVar2);
                zzwdVar = zzziVar.zzcsd;
            } else {
                String valueOf = String.valueOf(zzwdVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int m47994c = m47994c(zzwdVar.size());
        int zzee = zzzi.zzee(m47994c + 1);
        if (!this.f45706a.isEmpty() && ((zzwd) this.f45706a.peek()).size() < zzee) {
            int zzee2 = zzzi.zzee(m47994c);
            zzwd zzwdVar3 = (zzwd) this.f45706a.pop();
            while (!this.f45706a.isEmpty() && ((zzwd) this.f45706a.peek()).size() < zzee2) {
                zzwdVar3 = new zzzi((zzwd) this.f45706a.pop(), zzwdVar3, null);
            }
            zzzi zzziVar2 = new zzzi(zzwdVar3, zzwdVar, null);
            while (!this.f45706a.isEmpty()) {
                if (((zzwd) this.f45706a.peek()).size() >= zzzi.zzee(m47994c(zzziVar2.size()) + 1)) {
                    break;
                }
                zzziVar2 = new zzzi((zzwd) this.f45706a.pop(), zzziVar2, null);
            }
            this.f45706a.push(zzziVar2);
            return;
        }
        this.f45706a.push(zzwdVar);
    }

    public /* synthetic */ C6445K0(C6447L0 c6447l0) {
        this();
    }
}
