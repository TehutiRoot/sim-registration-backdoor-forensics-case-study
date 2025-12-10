package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* renamed from: com.google.firebase.installations.b */
/* loaded from: classes4.dex */
public class C8508b implements RM1 {

    /* renamed from: a */
    public final Utils f55536a;

    /* renamed from: b */
    public final TaskCompletionSource f55537b;

    public C8508b(Utils utils, TaskCompletionSource taskCompletionSource) {
        this.f55536a = utils;
        this.f55537b = taskCompletionSource;
    }

    @Override // p000.RM1
    /* renamed from: a */
    public boolean mo38610a(Exception exc) {
        this.f55537b.trySetException(exc);
        return true;
    }

    @Override // p000.RM1
    /* renamed from: b */
    public boolean mo38609b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.isRegistered() && !this.f55536a.isAuthTokenExpired(persistedInstallationEntry)) {
            this.f55537b.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
            return true;
        }
        return false;
    }
}