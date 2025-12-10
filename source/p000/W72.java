package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* renamed from: W72 */
/* loaded from: classes3.dex */
public final class W72 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ ModuleInstallStatusUpdate f7132a;

    public W72(X72 x72, ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f7132a = moduleInstallStatusUpdate;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((InstallStatusListener) obj).onInstallStatusUpdated(this.f7132a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
