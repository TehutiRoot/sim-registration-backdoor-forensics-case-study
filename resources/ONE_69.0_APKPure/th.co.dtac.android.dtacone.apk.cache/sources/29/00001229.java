package p000;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* renamed from: T50 */
/* loaded from: classes4.dex */
public class T50 implements RM1 {

    /* renamed from: a */
    public final TaskCompletionSource f6252a;

    public T50(TaskCompletionSource taskCompletionSource) {
        this.f6252a = taskCompletionSource;
    }

    @Override // p000.RM1
    /* renamed from: a */
    public boolean mo38610a(Exception exc) {
        return false;
    }

    @Override // p000.RM1
    /* renamed from: b */
    public boolean mo38609b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.f6252a.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}