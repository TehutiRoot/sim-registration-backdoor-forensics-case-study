package p000;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzan;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: ic2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC20409ic2 extends zzan {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f62832a;

    public BinderC20409ic2(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.f62832a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(Status status, Location location) {
        TaskUtil.trySetResultOrApiException(status, location, this.f62832a);
    }
}
