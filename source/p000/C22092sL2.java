package p000;

import com.google.android.gms.internal.firebase_ml.zzyk;
import com.google.android.gms.internal.firebase_ml.zzym;
import java.util.Map;

/* renamed from: sL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22092sL2 implements InterfaceC22264tL2 {
    @Override // p000.InterfaceC22264tL2
    /* renamed from: a */
    public final int mo22455a(int i, Object obj, Object obj2) {
        zzym zzymVar = (zzym) obj;
        zzyk zzykVar = (zzyk) obj2;
        int i2 = 0;
        if (zzymVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : zzymVar.entrySet()) {
            i2 += zzykVar.zzc(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    @Override // p000.InterfaceC22264tL2
    /* renamed from: b */
    public final Object mo22454b(Object obj) {
        return zzym.zzwg().zzwh();
    }

    @Override // p000.InterfaceC22264tL2
    /* renamed from: c */
    public final Object mo22453c(Object obj) {
        ((zzym) obj).zzty();
        return obj;
    }

    @Override // p000.InterfaceC22264tL2
    /* renamed from: d */
    public final boolean mo22452d(Object obj) {
        if (!((zzym) obj).isMutable()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC22264tL2
    /* renamed from: e */
    public final Map mo22451e(Object obj) {
        return (zzym) obj;
    }

    @Override // p000.InterfaceC22264tL2
    /* renamed from: f */
    public final C21920rL2 mo22450f(Object obj) {
        return ((zzyk) obj).m47413c();
    }

    @Override // p000.InterfaceC22264tL2
    /* renamed from: g */
    public final Map mo22449g(Object obj) {
        return (zzym) obj;
    }

    @Override // p000.InterfaceC22264tL2
    /* renamed from: h */
    public final Object mo22448h(Object obj, Object obj2) {
        zzym zzymVar = (zzym) obj;
        zzym zzymVar2 = (zzym) obj2;
        if (!zzymVar2.isEmpty()) {
            if (!zzymVar.isMutable()) {
                zzymVar = zzymVar.zzwh();
            }
            zzymVar.zza(zzymVar2);
        }
        return zzymVar;
    }
}
