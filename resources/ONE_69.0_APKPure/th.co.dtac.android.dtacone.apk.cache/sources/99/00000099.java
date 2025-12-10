package p000;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzan;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Ad2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17295Ad2 extends zzan {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f173a;

    public BinderC17295Ad2(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.f173a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(Status status, Location location) {
        TaskUtil.setResultOrApiException(status, location, this.f173a);
    }
}