package p000;

import com.google.android.gms.internal.firebase_ml.zzia;
import com.google.android.gms.internal.firebase_ml.zzig;
import com.google.android.gms.internal.firebase_ml.zztm;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: lx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20988lx2 extends zzia {

    /* renamed from: a */
    public final zztm f71788a;

    /* renamed from: b */
    public final zzig f71789b;

    public C20988lx2(zzig zzigVar, zztm zztmVar) {
        this.f71789b = zzigVar;
        this.f71788a = zztmVar;
        zztmVar.setLenient(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void flush() {
        this.f71788a.flush();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void writeBoolean(boolean z) {
        this.f71788a.zzaw(z);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void writeString(String str) {
        this.f71788a.zzcg(str);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zza(BigInteger bigInteger) {
        this.f71788a.zza(bigInteger);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzai(int i) {
        this.f71788a.zzu(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzan(String str) {
        this.f71788a.zzcf(str);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zze(long j) {
        this.f71788a.zzu(j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhb() {
        this.f71788a.zzrt();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhc() {
        this.f71788a.zzru();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhd() {
        this.f71788a.zzrv();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhe() {
        this.f71788a.zzrw();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhf() {
        this.f71788a.zzry();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhg() {
        this.f71788a.setIndent("  ");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzj(float f) {
        this.f71788a.zzb(f);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zza(double d) {
        this.f71788a.zzb(d);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zza(BigDecimal bigDecimal) {
        this.f71788a.zza(bigDecimal);
    }
}
