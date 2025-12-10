package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeg;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzho;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp;

/* renamed from: uk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22497uk2 implements zzds {

    /* renamed from: a */
    public final int f107447a;

    /* renamed from: b */
    public final zzho f107448b;

    public C22497uk2(zzeg zzegVar, int i, zzho zzhoVar, boolean z, boolean z2) {
        this.f107447a = i;
        this.f107448b = zzhoVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f107447a - ((C22497uk2) obj).f107447a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final int zza() {
        return this.f107447a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzfn zzb(zzfn zzfnVar, zzfo zzfoVar) {
        ((zzdx) zzfnVar).zzg((zzed) zzfoVar);
        return zzfnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzft zzc(zzft zzftVar, zzft zzftVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzho zzd() {
        return this.f107448b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzhp zze() {
        return this.f107448b.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final boolean zzg() {
        return false;
    }
}
