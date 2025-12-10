package p000;

import android.os.Handler;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: A82 */
/* loaded from: classes3.dex */
public final class A82 implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a */
    public final /* synthetic */ zabq f28a;

    public A82(zabq zabqVar) {
        this.f28a = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        Handler handler;
        handler = this.f28a.f44918m.f44766n;
        handler.post(new RunnableC23257z82(this));
    }
}
