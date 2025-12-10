package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzke;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzka<MessageType extends zzke<MessageType, BuilderType>, BuilderType extends zzka<MessageType, BuilderType>> extends zzim<MessageType, BuilderType> {

    /* renamed from: a */
    public final zzke f46329a;
    protected zzke zza;
    protected boolean zzb = false;

    public zzka(MessageType messagetype) {
        this.f46329a = messagetype;
        this.zza = (zzke) messagetype.zzl(4, null, null);
    }

    /* renamed from: a */
    public static final void m47158a(zzke zzkeVar, zzke zzkeVar2) {
        C21214nF2.m26147a().m26146b(zzkeVar.getClass()).zzg(zzkeVar, zzkeVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    /* renamed from: zzaB */
    public final zzka zzau() {
        zzka zzkaVar = (zzka) this.f46329a.zzl(5, null, null);
        zzkaVar.zzaC(zzaG());
        return zzkaVar;
    }

    public final zzka zzaC(zzke zzkeVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        m47158a(this.zza, zzkeVar);
        return this;
    }

    public final zzka zzaD(byte[] bArr, int i, int i2, zzjq zzjqVar) throws zzko {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        try {
            C21214nF2.m26147a().m26146b(this.zza.getClass()).mo47359b(this.zza, bArr, 0, i2, new C20475iy2(zzjqVar));
            return this;
        } catch (zzko e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzko.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzaE() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzke r0 = r5.zzaG()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzl(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            nF2 r3 = p000.C21214nF2.m26147a()
            java.lang.Class r4 = r0.getClass()
            DF2 r3 = r3.m26146b(r4)
            boolean r3 = r3.zzk(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzl(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.zzmm r1 = new com.google.android.gms.internal.measurement.zzmm
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzka.zzaE():com.google.android.gms.internal.measurement.zzke");
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    /* renamed from: zzaF */
    public MessageType zzaG() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzke zzkeVar = this.zza;
        C21214nF2.m26147a().m26146b(zzkeVar.getClass()).zzf(zzkeVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    public void zzaI() {
        zzke zzkeVar = (zzke) this.zza.zzl(4, null, null);
        m47158a(zzkeVar, this.zza);
        this.zza = zzkeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* synthetic */ zzim zzav(zzin zzinVar) {
        zzaC((zzke) zzinVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* bridge */ /* synthetic */ zzim zzaw(byte[] bArr, int i, int i2) throws zzko {
        zzaD(bArr, 0, i2, zzjq.f46326c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* bridge */ /* synthetic */ zzim zzax(byte[] bArr, int i, int i2, zzjq zzjqVar) throws zzko {
        zzaD(bArr, 0, i2, zzjqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzll zzbO() {
        return this.f46329a;
    }
}
