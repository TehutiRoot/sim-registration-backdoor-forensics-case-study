package p000;

import com.google.android.gms.internal.firebase_ml.zzgg;
import com.google.android.gms.internal.firebase_ml.zzhc;
import com.google.android.gms.internal.firebase_ml.zzhd;
import com.google.android.gms.internal.firebase_ml.zzhi;

/* renamed from: as2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19128as2 implements zzhi {

    /* renamed from: a */
    public final /* synthetic */ zzhi f38925a;

    /* renamed from: b */
    public final /* synthetic */ zzhc f38926b;

    /* renamed from: c */
    public final /* synthetic */ zzgg f38927c;

    public C19128as2(zzgg zzggVar, zzhi zzhiVar, zzhc zzhcVar) {
        this.f38927c = zzggVar;
        this.f38925a = zzhiVar;
        this.f38926b = zzhcVar;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhi
    public final void zzb(zzhd zzhdVar) {
        zzhi zzhiVar = this.f38925a;
        if (zzhiVar != null) {
            zzhiVar.zzb(zzhdVar);
        }
        if (!zzhdVar.zzgm() && this.f38926b.zzgk()) {
            throw this.f38927c.zza(zzhdVar);
        }
    }
}