package p000;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* renamed from: P50 */
/* loaded from: classes4.dex */
public class P50 implements UL1 {

    /* renamed from: a */
    public final TaskCompletionSource f4639a;

    public P50(TaskCompletionSource taskCompletionSource) {
        this.f4639a = taskCompletionSource;
    }

    @Override // p000.UL1
    /* renamed from: a */
    public boolean mo38618a(Exception exc) {
        return false;
    }

    @Override // p000.UL1
    /* renamed from: b */
    public boolean mo38617b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.f4639a.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
