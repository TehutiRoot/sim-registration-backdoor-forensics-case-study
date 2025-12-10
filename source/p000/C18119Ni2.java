package p000;

import com.google.android.gms.internal.clearcut.zzdi;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Ni2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18119Ni2 implements InterfaceC17671Gi2 {
    @Override // p000.InterfaceC17671Gi2
    /* renamed from: b */
    public final Object mo67192b(Object obj, Object obj2) {
        zzdi zzdiVar = (zzdi) obj;
        zzdi zzdiVar2 = (zzdi) obj2;
        if (!zzdiVar2.isEmpty()) {
            if (!zzdiVar.isMutable()) {
                zzdiVar = zzdiVar.zzca();
            }
            zzdiVar.zza(zzdiVar2);
        }
        return zzdiVar;
    }

    @Override // p000.InterfaceC17671Gi2
    /* renamed from: c */
    public final int mo67191c(int i, Object obj, Object obj2) {
        zzdi zzdiVar = (zzdi) obj;
        if (zzdiVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzdiVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // p000.InterfaceC17671Gi2
    /* renamed from: d */
    public final AbstractC23351zi2 mo67190d(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // p000.InterfaceC17671Gi2
    /* renamed from: e */
    public final Object mo67189e(Object obj) {
        ((zzdi) obj).zzv();
        return obj;
    }

    @Override // p000.InterfaceC17671Gi2
    /* renamed from: f */
    public final boolean mo67188f(Object obj) {
        if (!((zzdi) obj).isMutable()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC17671Gi2
    /* renamed from: g */
    public final Map mo67187g(Object obj) {
        return (zzdi) obj;
    }

    @Override // p000.InterfaceC17671Gi2
    /* renamed from: h */
    public final Map mo67186h(Object obj) {
        return (zzdi) obj;
    }

    @Override // p000.InterfaceC17671Gi2
    public final Object zzk(Object obj) {
        return zzdi.zzbz().zzca();
    }
}
