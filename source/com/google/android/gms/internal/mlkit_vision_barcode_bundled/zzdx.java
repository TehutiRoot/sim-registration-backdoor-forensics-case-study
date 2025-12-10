package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;

/* loaded from: classes3.dex */
public class zzdx<MessageType extends zzed<MessageType, BuilderType>, BuilderType extends zzdx<MessageType, BuilderType>> extends zzcj<MessageType, BuilderType> {

    /* renamed from: a */
    public final zzed f46964a;
    protected zzed zza;

    public zzdx(MessageType messagetype) {
        this.f46964a = messagetype;
        if (!messagetype.m46874h()) {
            this.zza = messagetype.m46878d();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: a */
    public static void m46883a(Object obj, Object obj2) {
        Bp2.m68857a().m68856b(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp
    public final /* bridge */ /* synthetic */ zzfo zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp
    public final boolean zzac() {
        return zzed.zzW(this.zza, false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj
    /* renamed from: zzf */
    public final zzdx zze() {
        zzdx zzdxVar = (zzdx) this.f46964a.zzg(5, null, null);
        zzdxVar.zza = zzk();
        return zzdxVar;
    }

    public final zzdx zzg(zzed zzedVar) {
        if (!this.f46964a.equals(zzedVar)) {
            if (!this.zza.m46874h()) {
                zzn();
            }
            m46883a(this.zza, zzedVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    /* renamed from: zzh */
    public final MessageType zzj() {
        MessageType zzk = zzk();
        if (zzk.zzac()) {
            return zzk;
        }
        throw new zzgx(zzk);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    /* renamed from: zzi */
    public MessageType zzk() {
        if (!this.zza.m46874h()) {
            return (MessageType) this.zza;
        }
        this.zza.zzS();
        return (MessageType) this.zza;
    }

    public final void zzm() {
        if (!this.zza.m46874h()) {
            zzn();
        }
    }

    public void zzn() {
        zzed m46878d = this.f46964a.m46878d();
        m46883a(m46878d, this.zza);
        this.zza = m46878d;
    }
}
