package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: f82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19817f82 extends AbstractC22569v82 {

    /* renamed from: b */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f61726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19817f82(C19989g82 c19989g82, zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.f61726b = connectionProgressReportCallbacks;
    }

    @Override // p000.AbstractC22569v82
    /* renamed from: a */
    public final void mo1105a() {
        this.f61726b.onReportServiceBinding(new ConnectionResult(16, null));
    }
}
