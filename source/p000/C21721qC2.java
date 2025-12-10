package p000;

import com.google.android.gms.internal.vision.zzkc;
import com.google.android.gms.internal.vision.zzke;
import java.util.Iterator;
import java.util.Map;

/* renamed from: qC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21721qC2 implements InterfaceC22409uC2 {
    @Override // p000.InterfaceC22409uC2
    /* renamed from: a */
    public final boolean mo1311a(Object obj) {
        if (!((zzke) obj).zzd()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC22409uC2
    /* renamed from: b */
    public final int mo1310b(int i, Object obj, Object obj2) {
        zzke zzkeVar = (zzke) obj;
        zzkc zzkcVar = (zzkc) obj2;
        if (zzkeVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzkeVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // p000.InterfaceC22409uC2
    public final Map zza(Object obj) {
        return (zzke) obj;
    }

    @Override // p000.InterfaceC22409uC2
    public final AbstractC21033mC2 zzb(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        throw new NoSuchMethodError();
    }

    @Override // p000.InterfaceC22409uC2
    public final Map zzc(Object obj) {
        return (zzke) obj;
    }

    @Override // p000.InterfaceC22409uC2
    public final Object zze(Object obj) {
        ((zzke) obj).zzc();
        return obj;
    }

    @Override // p000.InterfaceC22409uC2
    public final Object zzf(Object obj) {
        return zzke.zza().zzb();
    }

    @Override // p000.InterfaceC22409uC2
    public final Object zza(Object obj, Object obj2) {
        zzke zzkeVar = (zzke) obj;
        zzke zzkeVar2 = (zzke) obj2;
        if (!zzkeVar2.isEmpty()) {
            if (!zzkeVar.zzd()) {
                zzkeVar = zzkeVar.zzb();
            }
            zzkeVar.zza(zzkeVar2);
        }
        return zzkeVar;
    }
}
