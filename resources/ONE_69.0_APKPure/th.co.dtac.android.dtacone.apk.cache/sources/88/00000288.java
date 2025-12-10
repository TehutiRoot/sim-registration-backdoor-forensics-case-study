package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.phenotype.zza;

/* renamed from: Ce2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17428Ce2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ zza f796a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17428Ce2(zza zzaVar, Handler handler) {
        super(null);
        this.f796a = zzaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f796a.zzb();
    }
}