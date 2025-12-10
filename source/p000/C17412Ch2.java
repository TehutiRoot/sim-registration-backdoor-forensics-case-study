package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzg;

/* renamed from: Ch2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17412Ch2 extends Ym2 {

    /* renamed from: c */
    public final /* synthetic */ long f802c;

    /* renamed from: d */
    public final /* synthetic */ PendingIntent f803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17412Ch2(zzg zzgVar, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f802c = j;
        this.f803d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        boolean z;
        zzbe zzbeVar = (zzbe) anyClient;
        long j = this.f802c;
        PendingIntent pendingIntent = this.f803d;
        Preconditions.checkNotNull(pendingIntent);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "detectionIntervalMillis must be >= 0");
        ((zzam) zzbeVar.getService()).zzr(j, true, pendingIntent);
        setResult((C17412Ch2) Status.RESULT_SUCCESS);
    }
}
