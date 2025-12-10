package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase_ml.K0 */
/* loaded from: classes3.dex */
public final class C6434K0 {

    /* renamed from: a */
    public final ArrayDeque f45718a;

    public C6434K0() {
        this.f45718a = new ArrayDeque();
    }

    /* renamed from: c */
    public static int m47991c(int i) {
        int binarySearch = Arrays.binarySearch(zzzi.zzcsa, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    /* renamed from: b */
    public final zzwd m47992b(zzwd zzwdVar, zzwd zzwdVar2) {
        m47990d(zzwdVar);
        m47990d(zzwdVar2);
        zzwd zzwdVar3 = (zzwd) this.f45718a.pop();
        while (!this.f45718a.isEmpty()) {
            zzwdVar3 = new zzzi((zzwd) this.f45718a.pop(), zzwdVar3, null);
        }
        return zzwdVar3;
    }

    /* renamed from: d */
    public final void m47990d(zzwd zzwdVar) {
        while (!zzwdVar.zzue()) {
            if (zzwdVar instanceof zzzi) {
                zzzi zzziVar = (zzzi) zzwdVar;
                m47990d(zzzi.zza(zzziVar));
                zzwdVar = zzzi.zzb(zzziVar);
            } else {
                String valueOf = String.valueOf(zzwdVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int m47991c = m47991c(zzwdVar.size());
        int zzee = zzzi.zzee(m47991c + 1);
        if (!this.f45718a.isEmpty() && ((zzwd) this.f45718a.peek()).size() < zzee) {
            int zzee2 = zzzi.zzee(m47991c);
            zzwd zzwdVar2 = (zzwd) this.f45718a.pop();
            while (!this.f45718a.isEmpty() && ((zzwd) this.f45718a.peek()).size() < zzee2) {
                zzwdVar2 = new zzzi((zzwd) this.f45718a.pop(), zzwdVar2, null);
            }
            zzzi zzziVar2 = new zzzi(zzwdVar2, zzwdVar, null);
            while (!this.f45718a.isEmpty()) {
                if (((zzwd) this.f45718a.peek()).size() >= zzzi.zzee(m47991c(zzziVar2.size()) + 1)) {
                    break;
                }
                zzziVar2 = new zzzi((zzwd) this.f45718a.pop(), zzziVar2, null);
            }
            this.f45718a.push(zzziVar2);
            return;
        }
        this.f45718a.push(zzwdVar);
    }

    public /* synthetic */ C6434K0(C6436L0 c6436l0) {
        this();
    }
}