package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Pf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18238Pf2 implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    public final TaskCompletionSource f4808a;

    public C18238Pf2(TaskCompletionSource taskCompletionSource) {
        this.f4808a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.f4808a.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.getStatus();
        if (status.isSuccess()) {
            this.f4808a.setResult(new LocationSettingsResponse(locationSettingsResult));
        } else if (status.hasResolution()) {
            this.f4808a.setException(new ResolvableApiException(status));
        } else {
            this.f4808a.setException(new ApiException(status));
        }
    }
}
