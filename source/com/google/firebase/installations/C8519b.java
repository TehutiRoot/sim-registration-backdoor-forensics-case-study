package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* renamed from: com.google.firebase.installations.b */
/* loaded from: classes4.dex */
public class C8519b implements UL1 {

    /* renamed from: a */
    public final Utils f55524a;

    /* renamed from: b */
    public final TaskCompletionSource f55525b;

    public C8519b(Utils utils, TaskCompletionSource taskCompletionSource) {
        this.f55524a = utils;
        this.f55525b = taskCompletionSource;
    }

    @Override // p000.UL1
    /* renamed from: a */
    public boolean mo38618a(Exception exc) {
        this.f55525b.trySetException(exc);
        return true;
    }

    @Override // p000.UL1
    /* renamed from: b */
    public boolean mo38617b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.isRegistered() && !this.f55524a.isAuthTokenExpired(persistedInstallationEntry)) {
            this.f55525b.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
            return true;
        }
        return false;
    }
}
