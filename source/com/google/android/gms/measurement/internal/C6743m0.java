package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzny;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.google.android.gms.measurement.internal.m0 */
/* loaded from: classes3.dex */
public final class C6743m0 extends AbstractC20200hL2 {

    /* renamed from: g */
    public final zzes f48202g;

    /* renamed from: h */
    public final /* synthetic */ C22467ua2 f48203h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6743m0(C22467ua2 c22467ua2, String str, int i, zzes zzesVar) {
        super(str, i);
        this.f48203h = c22467ua2;
        this.f48202g = zzesVar;
    }

    @Override // p000.AbstractC20200hL2
    /* renamed from: a */
    public final int mo30883a() {
        return this.f48202g.zza();
    }

    @Override // p000.AbstractC20200hL2
    /* renamed from: b */
    public final boolean mo30882b() {
        return false;
    }

    @Override // p000.AbstractC20200hL2
    /* renamed from: c */
    public final boolean mo30881c() {
        return true;
    }

    /* renamed from: k */
    public final boolean m46361k(Long l, Long l2, zzgl zzglVar, boolean z) {
        boolean z2;
        Object obj;
        zzny.zzc();
        boolean zzs = this.f48203h.zzs.zzf().zzs(this.f62479a, zzeb.zzU);
        boolean zzg = this.f48202g.zzg();
        boolean zzh = this.f48202g.zzh();
        boolean zzi = this.f48202g.zzi();
        if (zzg || zzh || zzi) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z2) {
            zzem zzj = this.f48203h.zzs.zzay().zzj();
            Integer valueOf = Integer.valueOf(this.f62480b);
            if (this.f48202g.zzj()) {
                num = Integer.valueOf(this.f48202g.zza());
            }
            zzj.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        zzel zzb = this.f48202g.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzglVar.zzr()) {
            if (!zzb.zzi()) {
                this.f48203h.zzs.zzay().zzk().zzb("No number filter for long property. property", this.f48203h.zzs.zzj().zzf(zzglVar.zzf()));
            } else {
                bool = AbstractC20200hL2.m30874j(AbstractC20200hL2.m30876h(zzglVar.zzb(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzq()) {
            if (!zzb.zzi()) {
                this.f48203h.zzs.zzay().zzk().zzb("No number filter for double property. property", this.f48203h.zzs.zzj().zzf(zzglVar.zzf()));
            } else {
                bool = AbstractC20200hL2.m30874j(AbstractC20200hL2.m30877g(zzglVar.zza(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzt()) {
            if (!zzb.zzk()) {
                if (!zzb.zzi()) {
                    this.f48203h.zzs.zzay().zzk().zzb("No string or number filter defined. property", this.f48203h.zzs.zzj().zzf(zzglVar.zzf()));
                } else if (zzlb.m46158C(zzglVar.zzg())) {
                    bool = AbstractC20200hL2.m30874j(AbstractC20200hL2.m30875i(zzglVar.zzg(), zzb.zzc()), zzg2);
                } else {
                    this.f48203h.zzs.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.f48203h.zzs.zzj().zzf(zzglVar.zzf()), zzglVar.zzg());
                }
            } else {
                bool = AbstractC20200hL2.m30874j(AbstractC20200hL2.m30878f(zzglVar.zzg(), zzb.zzd(), this.f48203h.zzs.zzay()), zzg2);
            }
        } else {
            this.f48203h.zzs.zzay().zzk().zzb("User property has no value, property", this.f48203h.zzs.zzj().zzf(zzglVar.zzf()));
        }
        zzem zzj2 = this.f48203h.zzs.zzay().zzj();
        if (bool == null) {
            obj = AbstractJsonLexerKt.NULL;
        } else {
            obj = bool;
        }
        zzj2.zzb("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f62481c = Boolean.TRUE;
        if (zzi && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.f48202g.zzg()) {
            this.f62482d = bool;
        }
        if (bool.booleanValue() && z2 && zzglVar.zzs()) {
            long zzc = zzglVar.zzc();
            if (l != null) {
                zzc = l.longValue();
            }
            if (zzs && this.f48202g.zzg() && !this.f48202g.zzh() && l2 != null) {
                zzc = l2.longValue();
            }
            if (this.f48202g.zzh()) {
                this.f62484f = Long.valueOf(zzc);
            } else {
                this.f62483e = Long.valueOf(zzc);
            }
        }
        return true;
    }
}
