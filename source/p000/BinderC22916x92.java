package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: x92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22916x92 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f108250a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f108251b;

    /* renamed from: c */
    public final /* synthetic */ InstallStatusListener f108252c;

    /* renamed from: d */
    public final /* synthetic */ zay f108253d;

    public BinderC22916x92(zay zayVar, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InstallStatusListener installStatusListener) {
        this.f108253d = zayVar;
        this.f108250a = atomicReference;
        this.f108251b = taskCompletionSource;
        this.f108252c = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f108250a.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.f108251b);
        if (status.isSuccess() && (moduleInstallResponse == null || !moduleInstallResponse.zaa())) {
            return;
        }
        this.f108253d.doUnregisterEventListener(ListenerHolders.createListenerKey(this.f108252c, InstallStatusListener.class.getSimpleName()), 27306);
    }
}
