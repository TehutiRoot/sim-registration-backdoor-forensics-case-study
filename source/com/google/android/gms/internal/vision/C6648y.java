package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.y */
/* loaded from: classes3.dex */
public final class C6648y extends AbstractC20303hy2 {
    @Override // p000.AbstractC20303hy2
    /* renamed from: a */
    public final int mo30696a(Map.Entry entry) {
        return ((zzjb.C6653a) entry.getKey()).f47633b;
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: b */
    public final Object mo30695b(zzio zzioVar, zzkk zzkkVar, int i) {
        return zzioVar.zza(zzkkVar, i);
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: c */
    public final Object mo30694c(InterfaceC20523jE2 interfaceC20523jE2, Object obj, zzio zzioVar, Iy2 iy2, Object obj2, AbstractC22590vF2 abstractC22590vF2) {
        Object m67833c;
        zzjb.zze zzeVar = (zzjb.zze) obj;
        zzjb.C6653a c6653a = zzeVar.f47642d;
        int i = c6653a.f47633b;
        boolean z = c6653a.f47635d;
        zzml zzmlVar = c6653a.f47634c;
        Object obj3 = null;
        if (zzmlVar != zzml.zzn) {
            int[] iArr = AbstractC22539uy2.f107538a;
            switch (iArr[zzmlVar.ordinal()]) {
                case 1:
                    obj3 = Double.valueOf(interfaceC20523jE2.zzd());
                    break;
                case 2:
                    obj3 = Float.valueOf(interfaceC20523jE2.zze());
                    break;
                case 3:
                    obj3 = Long.valueOf(interfaceC20523jE2.zzg());
                    break;
                case 4:
                    obj3 = Long.valueOf(interfaceC20523jE2.zzf());
                    break;
                case 5:
                    obj3 = Integer.valueOf(interfaceC20523jE2.zzh());
                    break;
                case 6:
                    obj3 = Long.valueOf(interfaceC20523jE2.zzi());
                    break;
                case 7:
                    obj3 = Integer.valueOf(interfaceC20523jE2.zzj());
                    break;
                case 8:
                    obj3 = Boolean.valueOf(interfaceC20523jE2.zzk());
                    break;
                case 9:
                    obj3 = Integer.valueOf(interfaceC20523jE2.zzo());
                    break;
                case 10:
                    obj3 = Integer.valueOf(interfaceC20523jE2.zzq());
                    break;
                case 11:
                    obj3 = Long.valueOf(interfaceC20523jE2.zzr());
                    break;
                case 12:
                    obj3 = Integer.valueOf(interfaceC20523jE2.zzs());
                    break;
                case 13:
                    obj3 = Long.valueOf(interfaceC20523jE2.zzt());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    obj3 = interfaceC20523jE2.zzn();
                    break;
                case 16:
                    obj3 = interfaceC20523jE2.zzl();
                    break;
                case 17:
                    obj3 = interfaceC20523jE2.mo29257t(zzeVar.f47641c.getClass(), zzioVar);
                    break;
                case 18:
                    obj3 = interfaceC20523jE2.mo29256u(zzeVar.f47641c.getClass(), zzioVar);
                    break;
            }
            zzjb.C6653a c6653a2 = zzeVar.f47642d;
            if (c6653a2.f47635d) {
                iy2.m67826j(c6653a2, obj3);
            } else {
                int i2 = iArr[c6653a2.f47634c.ordinal()];
                if ((i2 == 17 || i2 == 18) && (m67833c = iy2.m67833c(zzeVar.f47642d)) != null) {
                    obj3 = zzjf.m46420c(m67833c, obj3);
                }
                iy2.m67830f(zzeVar.f47642d, obj3);
            }
            return obj2;
        }
        interfaceC20523jE2.zzh();
        throw null;
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: d */
    public final Iy2 mo30693d(Object obj) {
        return ((zzjb.zzc) obj).zzc;
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: e */
    public final void mo30692e(zzht zzhtVar, Object obj, zzio zzioVar, Iy2 iy2) {
        byte[] bArr;
        zzjb.zze zzeVar = (zzjb.zze) obj;
        zzkk zze = zzeVar.f47641c.zzq().zze();
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
            Su2 su2 = new Su2(wrap, true);
            DD2.m68673a().m68671c(zze).mo31332d(zze, su2, zzioVar);
            iy2.m67830f(zzeVar.f47642d, zze);
            if (su2.zza() == Integer.MAX_VALUE) {
                return;
            }
            throw zzjk.zze();
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: f */
    public final void mo30691f(InterfaceC20523jE2 interfaceC20523jE2, Object obj, zzio zzioVar, Iy2 iy2) {
        zzjb.zze zzeVar = (zzjb.zze) obj;
        iy2.m67830f(zzeVar.f47642d, interfaceC20523jE2.mo29256u(zzeVar.f47641c.getClass(), zzioVar));
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: g */
    public final void mo30690g(InterfaceC21048mH2 interfaceC21048mH2, Map.Entry entry) {
        zzjb.C6653a c6653a = (zzjb.C6653a) entry.getKey();
        if (c6653a.f47635d) {
            switch (AbstractC22539uy2.f107538a[c6653a.f47634c.ordinal()]) {
                case 1:
                    AbstractC21039mE2.m26325l(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 2:
                    AbstractC21039mE2.m26312y(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 3:
                    AbstractC21039mE2.m26364C(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 4:
                    AbstractC21039mE2.m26360G(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 5:
                    AbstractC21039mE2.m26347T(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 6:
                    AbstractC21039mE2.m26353N(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 7:
                    AbstractC21039mE2.m26339a0(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 8:
                    AbstractC21039mE2.m26333d0(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 9:
                    AbstractC21039mE2.m26344W(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 10:
                    AbstractC21039mE2.m26337b0(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 11:
                    AbstractC21039mE2.m26350Q(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 12:
                    AbstractC21039mE2.m26341Z(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 13:
                    AbstractC21039mE2.m26356K(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 14:
                    AbstractC21039mE2.m26347T(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, false);
                    return;
                case 15:
                    AbstractC21039mE2.m26314w(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2);
                    return;
                case 16:
                    AbstractC21039mE2.m26327j(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        AbstractC21039mE2.m26313x(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, DD2.m68673a().m68672b(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC21039mE2.m26326k(c6653a.f47633b, (List) entry.getValue(), interfaceC21048mH2, DD2.m68673a().m68672b(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (AbstractC22539uy2.f107538a[c6653a.f47634c.ordinal()]) {
            case 1:
                interfaceC21048mH2.mo26288m(c6653a.f47633b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC21048mH2.mo26287n(c6653a.f47633b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC21048mH2.mo26289l(c6653a.f47633b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC21048mH2.mo26292i(c6653a.f47633b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC21048mH2.mo26284q(c6653a.f47633b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC21048mH2.mo26308C(c6653a.f47633b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC21048mH2.mo26278w(c6653a.f47633b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC21048mH2.mo26310A(c6653a.f47633b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC21048mH2.mo26309B(c6653a.f47633b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC21048mH2.zza(c6653a.f47633b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC21048mH2.mo26295f(c6653a.f47633b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC21048mH2.mo26283r(c6653a.f47633b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC21048mH2.mo26307D(c6653a.f47633b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC21048mH2.mo26284q(c6653a.f47633b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC21048mH2.mo26304G(c6653a.f47633b, (zzht) entry.getValue());
                return;
            case 16:
                interfaceC21048mH2.mo26306E(c6653a.f47633b, (String) entry.getValue());
                return;
            case 17:
                interfaceC21048mH2.mo26305F(c6653a.f47633b, entry.getValue(), DD2.m68673a().m68672b(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC21048mH2.mo26303H(c6653a.f47633b, entry.getValue(), DD2.m68673a().m68672b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: h */
    public final boolean mo30689h(zzkk zzkkVar) {
        return zzkkVar instanceof zzjb.zzc;
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: i */
    public final Iy2 mo30688i(Object obj) {
        return ((zzjb.zzc) obj).m46424i();
    }

    @Override // p000.AbstractC20303hy2
    /* renamed from: j */
    public final void mo30687j(Object obj) {
        mo30693d(obj).m67827i();
    }
}
