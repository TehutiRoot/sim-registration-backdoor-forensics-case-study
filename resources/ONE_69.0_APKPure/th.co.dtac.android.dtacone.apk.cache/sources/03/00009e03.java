package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzny;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.google.android.gms.measurement.internal.m0 */
/* loaded from: classes3.dex */
public final class C6732m0 extends AbstractC19737eM2 {

    /* renamed from: g */
    public final zzes f48214g;

    /* renamed from: h */
    public final /* synthetic */ C22018rb2 f48215h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6732m0(C22018rb2 c22018rb2, String str, int i, zzes zzesVar) {
        super(str, i);
        this.f48215h = c22018rb2;
        this.f48214g = zzesVar;
    }

    @Override // p000.AbstractC19737eM2
    /* renamed from: a */
    public final int mo31710a() {
        return this.f48214g.zza();
    }

    @Override // p000.AbstractC19737eM2
    /* renamed from: b */
    public final boolean mo31709b() {
        return false;
    }

    @Override // p000.AbstractC19737eM2
    /* renamed from: c */
    public final boolean mo31708c() {
        return true;
    }

    /* renamed from: k */
    public final boolean m46346k(Long l, Long l2, zzgl zzglVar, boolean z) {
        boolean z2;
        Object obj;
        zzny.zzc();
        boolean zzs = this.f48215h.zzs.zzf().zzs(this.f61557a, zzeb.zzU);
        boolean zzg = this.f48214g.zzg();
        boolean zzh = this.f48214g.zzh();
        boolean zzi = this.f48214g.zzi();
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
            zzem zzj = this.f48215h.zzs.zzay().zzj();
            Integer valueOf = Integer.valueOf(this.f61558b);
            if (this.f48214g.zzj()) {
                num = Integer.valueOf(this.f48214g.zza());
            }
            zzj.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        zzel zzb = this.f48214g.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzglVar.zzr()) {
            if (!zzb.zzi()) {
                this.f48215h.zzs.zzay().zzk().zzb("No number filter for long property. property", this.f48215h.zzs.zzj().zzf(zzglVar.zzf()));
            } else {
                bool = AbstractC19737eM2.m31701j(AbstractC19737eM2.m31703h(zzglVar.zzb(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzq()) {
            if (!zzb.zzi()) {
                this.f48215h.zzs.zzay().zzk().zzb("No number filter for double property. property", this.f48215h.zzs.zzj().zzf(zzglVar.zzf()));
            } else {
                bool = AbstractC19737eM2.m31701j(AbstractC19737eM2.m31704g(zzglVar.zza(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzt()) {
            if (!zzb.zzk()) {
                if (!zzb.zzi()) {
                    this.f48215h.zzs.zzay().zzk().zzb("No string or number filter defined. property", this.f48215h.zzs.zzj().zzf(zzglVar.zzf()));
                } else if (zzlb.m46143C(zzglVar.zzg())) {
                    bool = AbstractC19737eM2.m31701j(AbstractC19737eM2.m31702i(zzglVar.zzg(), zzb.zzc()), zzg2);
                } else {
                    this.f48215h.zzs.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.f48215h.zzs.zzj().zzf(zzglVar.zzf()), zzglVar.zzg());
                }
            } else {
                bool = AbstractC19737eM2.m31701j(AbstractC19737eM2.m31705f(zzglVar.zzg(), zzb.zzd(), this.f48215h.zzs.zzay()), zzg2);
            }
        } else {
            this.f48215h.zzs.zzay().zzk().zzb("User property has no value, property", this.f48215h.zzs.zzj().zzf(zzglVar.zzf()));
        }
        zzem zzj2 = this.f48215h.zzs.zzay().zzj();
        if (bool == null) {
            obj = AbstractJsonLexerKt.NULL;
        } else {
            obj = bool;
        }
        zzj2.zzb("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f61559c = Boolean.TRUE;
        if (zzi && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.f48214g.zzg()) {
            this.f61560d = bool;
        }
        if (bool.booleanValue() && z2 && zzglVar.zzs()) {
            long zzc = zzglVar.zzc();
            if (l != null) {
                zzc = l.longValue();
            }
            if (zzs && this.f48214g.zzg() && !this.f48214g.zzh() && l2 != null) {
                zzc = l2.longValue();
            }
            if (this.f48214g.zzh()) {
                this.f61562f = Long.valueOf(zzc);
            } else {
                this.f61561e = Long.valueOf(zzc);
            }
        }
        return true;
    }
}