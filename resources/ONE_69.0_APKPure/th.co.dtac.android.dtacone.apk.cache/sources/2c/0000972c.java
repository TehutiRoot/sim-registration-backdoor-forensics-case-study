package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g */
/* loaded from: classes3.dex */
public final class C6562g {

    /* renamed from: a */
    public final ArrayDeque f46881a = new ArrayDeque();

    public /* synthetic */ C6562g(zzgb zzgbVar) {
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ zzdb m46910a(C6562g c6562g, zzdb zzdbVar, zzdb zzdbVar2) {
        c6562g.m46909b(zzdbVar);
        c6562g.m46909b(zzdbVar2);
        zzdb zzdbVar3 = (zzdb) c6562g.f46881a.pop();
        while (!c6562g.f46881a.isEmpty()) {
            zzdbVar3 = new zzgg((zzdb) c6562g.f46881a.pop(), zzdbVar3);
        }
        return zzdbVar3;
    }

    /* renamed from: c */
    public static final int m46908c(int i) {
        int binarySearch = Arrays.binarySearch(zzgg.zza, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    /* renamed from: b */
    public final void m46909b(zzdb zzdbVar) {
        zzdb zzdbVar2;
        zzdb zzdbVar3;
        if (zzdbVar.zzh()) {
            int m46908c = m46908c(zzdbVar.zzd());
            int zzc = zzgg.zzc(m46908c + 1);
            if (!this.f46881a.isEmpty() && ((zzdb) this.f46881a.peek()).zzd() < zzc) {
                int zzc2 = zzgg.zzc(m46908c);
                zzdb zzdbVar4 = (zzdb) this.f46881a.pop();
                while (!this.f46881a.isEmpty() && ((zzdb) this.f46881a.peek()).zzd() < zzc2) {
                    zzdbVar4 = new zzgg((zzdb) this.f46881a.pop(), zzdbVar4);
                }
                zzgg zzggVar = new zzgg(zzdbVar4, zzdbVar);
                while (!this.f46881a.isEmpty()) {
                    if (((zzdb) this.f46881a.peek()).zzd() >= zzgg.zzc(m46908c(zzggVar.zzd()) + 1)) {
                        break;
                    }
                    zzggVar = new zzgg((zzdb) this.f46881a.pop(), zzggVar);
                }
                this.f46881a.push(zzggVar);
                return;
            }
            this.f46881a.push(zzdbVar);
        } else if (zzdbVar instanceof zzgg) {
            zzgg zzggVar2 = (zzgg) zzdbVar;
            zzdbVar2 = zzggVar2.zzd;
            m46909b(zzdbVar2);
            zzdbVar3 = zzggVar2.zze;
            m46909b(zzdbVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzdbVar.getClass())));
        }
    }
}