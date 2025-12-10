package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: c92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19352c92 extends AbstractC22120s92 {

    /* renamed from: b */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f39353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19352c92(C19525d92 c19525d92, zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.f39353b = connectionProgressReportCallbacks;
    }

    @Override // p000.AbstractC22120s92
    /* renamed from: a */
    public final void mo22860a() {
        this.f39353b.onReportServiceBinding(new ConnectionResult(16, null));
    }
}