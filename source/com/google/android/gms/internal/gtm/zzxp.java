package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzxp;
import com.google.android.gms.internal.gtm.zzxv;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzxp<MessageType extends zzxv<MessageType, BuilderType>, BuilderType extends zzxp<MessageType, BuilderType>> extends zztk<MessageType, BuilderType> {
    protected zzxv zza;
    private final zzxv zzb;

    public zzxp(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaq()) {
            this.zza = messagetype.zzad();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzzp.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final zzxp zzA(zzxv zzxvVar) {
        if (!this.zzb.equals(zzxvVar)) {
            if (!this.zza.zzaq()) {
                zzH();
            }
            zza(this.zza, zzxvVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zzzf
    /* renamed from: zzB */
    public final MessageType zzD() {
        MessageType zzE = zzE();
        if (zzE.zzay()) {
            return zzE;
        }
        throw new zzaaj(zzE);
    }

    @Override // com.google.android.gms.internal.gtm.zzzf
    /* renamed from: zzC */
    public MessageType zzE() {
        if (!this.zza.zzaq()) {
            return (MessageType) this.zza;
        }
        this.zza.zzal();
        return (MessageType) this.zza;
    }

    public final void zzG() {
        if (!this.zza.zzaq()) {
            zzH();
        }
    }

    public void zzH() {
        zzxv zzad = this.zzb.zzad();
        zza(zzad, this.zza);
        this.zza = zzad;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final /* synthetic */ zzzg zzax() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzay() {
        return zzxv.zzap(this.zza, false);
    }

    @Override // com.google.android.gms.internal.gtm.zztk
    public final /* synthetic */ zztk zzw(zztl zztlVar) {
        zzA((zzxv) zztlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zztk, com.google.android.gms.internal.gtm.zzzf
    public final /* bridge */ /* synthetic */ zzzf zzy(zzuj zzujVar, zzxf zzxfVar) throws IOException {
        if (!this.zza.zzaq()) {
            zzH();
        }
        try {
            zzzp.zza().zzb(this.zza.getClass()).zzh(this.zza, zzuk.zzq(zzujVar), zzxfVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zztk
    /* renamed from: zzz */
    public final zzxp zzv() {
        zzxp zzxpVar = (zzxp) this.zzb.zzb(5, null, null);
        zzxpVar.zza = zzE();
        return zzxpVar;
    }
}
