package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.y */
/* loaded from: classes3.dex */
public final class C6637y extends AbstractC19841ez2 {
    @Override // p000.AbstractC19841ez2
    /* renamed from: a */
    public final int mo31570a(Map.Entry entry) {
        return ((zzjb.C6642a) entry.getKey()).f47645b;
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: b */
    public final Object mo31569b(zzio zzioVar, zzkk zzkkVar, int i) {
        return zzioVar.zza(zzkkVar, i);
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: c */
    public final Object mo31568c(InterfaceC20062gF2 interfaceC20062gF2, Object obj, zzio zzioVar, Fz2 fz2, Object obj2, AbstractC22141sG2 abstractC22141sG2) {
        Object m68355c;
        zzjb.zze zzeVar = (zzjb.zze) obj;
        zzjb.C6642a c6642a = zzeVar.f47654d;
        int i = c6642a.f47645b;
        boolean z = c6642a.f47647d;
        zzml zzmlVar = c6642a.f47646c;
        Object obj3 = null;
        if (zzmlVar != zzml.zzn) {
            int[] iArr = AbstractC22090rz2.f79749a;
            switch (iArr[zzmlVar.ordinal()]) {
                case 1:
                    obj3 = Double.valueOf(interfaceC20062gF2.zzd());
                    break;
                case 2:
                    obj3 = Float.valueOf(interfaceC20062gF2.zze());
                    break;
                case 3:
                    obj3 = Long.valueOf(interfaceC20062gF2.zzg());
                    break;
                case 4:
                    obj3 = Long.valueOf(interfaceC20062gF2.zzf());
                    break;
                case 5:
                    obj3 = Integer.valueOf(interfaceC20062gF2.zzh());
                    break;
                case 6:
                    obj3 = Long.valueOf(interfaceC20062gF2.zzi());
                    break;
                case 7:
                    obj3 = Integer.valueOf(interfaceC20062gF2.zzj());
                    break;
                case 8:
                    obj3 = Boolean.valueOf(interfaceC20062gF2.zzk());
                    break;
                case 9:
                    obj3 = Integer.valueOf(interfaceC20062gF2.zzo());
                    break;
                case 10:
                    obj3 = Integer.valueOf(interfaceC20062gF2.zzq());
                    break;
                case 11:
                    obj3 = Long.valueOf(interfaceC20062gF2.zzr());
                    break;
                case 12:
                    obj3 = Integer.valueOf(interfaceC20062gF2.zzs());
                    break;
                case 13:
                    obj3 = Long.valueOf(interfaceC20062gF2.zzt());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    obj3 = interfaceC20062gF2.zzn();
                    break;
                case 16:
                    obj3 = interfaceC20062gF2.zzl();
                    break;
                case 17:
                    obj3 = interfaceC20062gF2.mo31403t(zzeVar.f47653c.getClass(), zzioVar);
                    break;
                case 18:
                    obj3 = interfaceC20062gF2.mo31402u(zzeVar.f47653c.getClass(), zzioVar);
                    break;
            }
            zzjb.C6642a c6642a2 = zzeVar.f47654d;
            if (c6642a2.f47647d) {
                fz2.m68348j(c6642a2, obj3);
            } else {
                int i2 = iArr[c6642a2.f47646c.ordinal()];
                if ((i2 == 17 || i2 == 18) && (m68355c = fz2.m68355c(zzeVar.f47654d)) != null) {
                    obj3 = zzjf.m46405c(m68355c, obj3);
                }
                fz2.m68352f(zzeVar.f47654d, obj3);
            }
            return obj2;
        }
        interfaceC20062gF2.zzh();
        throw null;
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: d */
    public final Fz2 mo31567d(Object obj) {
        return ((zzjb.zzc) obj).zzc;
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: e */
    public final void mo31566e(zzht zzhtVar, Object obj, zzio zzioVar, Fz2 fz2) {
        byte[] bArr;
        zzjb.zze zzeVar = (zzjb.zze) obj;
        zzkk zze = zzeVar.f47653c.zzq().zze();
        int zza = zzhtVar.zza();
        if (zza == 0) {
            bArr = zzjf.zzb;
        } else {
            byte[] bArr2 = new byte[zza];
            zzhtVar.zza(bArr2, 0, 0, zza);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            Pv2 pv2 = new Pv2(wrap, true);
            AE2.m69300a().m69298c(zze).mo46597d(zze, pv2, zzioVar);
            fz2.m68352f(zzeVar.f47654d, zze);
            if (pv2.zza() == Integer.MAX_VALUE) {
                return;
            }
            throw zzjk.zze();
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: f */
    public final void mo31565f(InterfaceC20062gF2 interfaceC20062gF2, Object obj, zzio zzioVar, Fz2 fz2) {
        zzjb.zze zzeVar = (zzjb.zze) obj;
        fz2.m68352f(zzeVar.f47654d, interfaceC20062gF2.mo31402u(zzeVar.f47653c.getClass(), zzioVar));
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: g */
    public final void mo31564g(InterfaceC20590jI2 interfaceC20590jI2, Map.Entry entry) {
        zzjb.C6642a c6642a = (zzjb.C6642a) entry.getKey();
        if (c6642a.f47647d) {
            switch (AbstractC22090rz2.f79749a[c6642a.f47646c.ordinal()]) {
                case 1:
                    AbstractC20581jF2.m29560l(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 2:
                    AbstractC20581jF2.m29547y(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 3:
                    AbstractC20581jF2.m29599C(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 4:
                    AbstractC20581jF2.m29595G(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 5:
                    AbstractC20581jF2.m29582T(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 6:
                    AbstractC20581jF2.m29588N(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 7:
                    AbstractC20581jF2.m29574a0(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 8:
                    AbstractC20581jF2.m29568d0(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 9:
                    AbstractC20581jF2.m29579W(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 10:
                    AbstractC20581jF2.m29572b0(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 11:
                    AbstractC20581jF2.m29585Q(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 12:
                    AbstractC20581jF2.m29576Z(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 13:
                    AbstractC20581jF2.m29591K(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 14:
                    AbstractC20581jF2.m29582T(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, false);
                    return;
                case 15:
                    AbstractC20581jF2.m29549w(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2);
                    return;
                case 16:
                    AbstractC20581jF2.m29562j(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        AbstractC20581jF2.m29548x(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, AE2.m69300a().m69299b(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC20581jF2.m29561k(c6642a.f47645b, (List) entry.getValue(), interfaceC20590jI2, AE2.m69300a().m69299b(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (AbstractC22090rz2.f79749a[c6642a.f47646c.ordinal()]) {
            case 1:
                interfaceC20590jI2.mo13m(c6642a.f47645b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC20590jI2.mo12n(c6642a.f47645b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC20590jI2.mo14l(c6642a.f47645b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC20590jI2.mo17i(c6642a.f47645b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC20590jI2.mo9q(c6642a.f47645b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC20590jI2.mo34C(c6642a.f47645b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC20590jI2.mo3w(c6642a.f47645b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC20590jI2.mo36A(c6642a.f47645b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC20590jI2.mo35B(c6642a.f47645b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC20590jI2.zza(c6642a.f47645b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC20590jI2.mo20f(c6642a.f47645b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC20590jI2.mo8r(c6642a.f47645b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC20590jI2.mo33D(c6642a.f47645b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC20590jI2.mo9q(c6642a.f47645b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC20590jI2.mo30G(c6642a.f47645b, (zzht) entry.getValue());
                return;
            case 16:
                interfaceC20590jI2.mo32E(c6642a.f47645b, (String) entry.getValue());
                return;
            case 17:
                interfaceC20590jI2.mo31F(c6642a.f47645b, entry.getValue(), AE2.m69300a().m69299b(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC20590jI2.mo29H(c6642a.f47645b, entry.getValue(), AE2.m69300a().m69299b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: h */
    public final boolean mo31563h(zzkk zzkkVar) {
        return zzkkVar instanceof zzjb.zzc;
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: i */
    public final Fz2 mo31562i(Object obj) {
        return ((zzjb.zzc) obj).m46409i();
    }

    @Override // p000.AbstractC19841ez2
    /* renamed from: j */
    public final void mo31561j(Object obj) {
        mo31567d(obj).m68349i();
    }
}