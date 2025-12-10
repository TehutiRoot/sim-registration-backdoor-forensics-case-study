package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Mg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18084Mg2 implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    public final TaskCompletionSource f3938a;

    public C18084Mg2(TaskCompletionSource taskCompletionSource) {
        this.f3938a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.f3938a.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.getStatus();
        if (status.isSuccess()) {
            this.f3938a.setResult(new LocationSettingsResponse(locationSettingsResult));
        } else if (status.hasResolution()) {
            this.f3938a.setException(new ResolvableApiException(status));
        } else {
            this.f3938a.setException(new ApiException(status));
        }
    }
}