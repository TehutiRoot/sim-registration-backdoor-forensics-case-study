package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* renamed from: T82 */
/* loaded from: classes3.dex */
public final class T82 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ ModuleInstallStatusUpdate f6273a;

    public T82(U82 u82, ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f6273a = moduleInstallStatusUpdate;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((InstallStatusListener) obj).onInstallStatusUpdated(this.f6273a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}