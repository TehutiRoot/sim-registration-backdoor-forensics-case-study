package p000;

import com.google.android.gms.internal.firebase_ml.zzia;
import com.google.android.gms.internal.firebase_ml.zzig;
import com.google.android.gms.internal.firebase_ml.zztm;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: iy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20530iy2 extends zzia {

    /* renamed from: a */
    public final zztm f67186a;

    /* renamed from: b */
    public final zzig f67187b;

    public C20530iy2(zzig zzigVar, zztm zztmVar) {
        this.f67187b = zzigVar;
        this.f67186a = zztmVar;
        zztmVar.setLenient(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void flush() {
        this.f67186a.flush();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void writeBoolean(boolean z) {
        this.f67186a.zzaw(z);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void writeString(String str) {
        this.f67186a.zzcg(str);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zza(BigInteger bigInteger) {
        this.f67186a.zza(bigInteger);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzai(int i) {
        this.f67186a.zzu(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzan(String str) {
        this.f67186a.zzcf(str);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zze(long j) {
        this.f67186a.zzu(j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhb() {
        this.f67186a.zzrt();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhc() {
        this.f67186a.zzru();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhd() {
        this.f67186a.zzrv();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhe() {
        this.f67186a.zzrw();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhf() {
        this.f67186a.zzry();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzhg() {
        this.f67186a.setIndent("  ");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zzj(float f) {
        this.f67186a.zzb(f);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zza(double d) {
        this.f67186a.zzb(d);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzia
    public final void zza(BigDecimal bigDecimal) {
        this.f67186a.zza(bigDecimal);
    }
}