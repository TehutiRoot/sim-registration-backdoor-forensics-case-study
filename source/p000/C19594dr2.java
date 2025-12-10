package p000;

import com.google.android.gms.internal.firebase_ml.zzgg;
import com.google.android.gms.internal.firebase_ml.zzhc;
import com.google.android.gms.internal.firebase_ml.zzhd;
import com.google.android.gms.internal.firebase_ml.zzhi;

/* renamed from: dr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19594dr2 implements zzhi {

    /* renamed from: a */
    public final /* synthetic */ zzhi f61334a;

    /* renamed from: b */
    public final /* synthetic */ zzhc f61335b;

    /* renamed from: c */
    public final /* synthetic */ zzgg f61336c;

    public C19594dr2(zzgg zzggVar, zzhi zzhiVar, zzhc zzhcVar) {
        this.f61336c = zzggVar;
        this.f61334a = zzhiVar;
        this.f61335b = zzhcVar;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhi
    public final void zzb(zzhd zzhdVar) {
        zzhi zzhiVar = this.f61334a;
        if (zzhiVar != null) {
            zzhiVar.zzb(zzhdVar);
        }
        if (!zzhdVar.zzgm() && this.f61335b.zzgk()) {
            throw this.f61336c.zza(zzhdVar);
        }
    }
}
