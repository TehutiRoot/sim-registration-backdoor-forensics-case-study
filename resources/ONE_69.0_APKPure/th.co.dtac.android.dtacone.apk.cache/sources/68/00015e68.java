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

/* renamed from: ua2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22534ua2 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f107812a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f107813b;

    /* renamed from: c */
    public final /* synthetic */ InstallStatusListener f107814c;

    /* renamed from: d */
    public final /* synthetic */ zay f107815d;

    public BinderC22534ua2(zay zayVar, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InstallStatusListener installStatusListener) {
        this.f107815d = zayVar;
        this.f107812a = atomicReference;
        this.f107813b = taskCompletionSource;
        this.f107814c = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f107812a.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.f107813b);
        if (status.isSuccess() && (moduleInstallResponse == null || !moduleInstallResponse.zaa())) {
            return;
        }
        this.f107815d.doUnregisterEventListener(ListenerHolders.createListenerKey(this.f107814c, InstallStatusListener.class.getSimpleName()), 27306);
    }
}