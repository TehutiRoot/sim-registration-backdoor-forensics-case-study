package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzax implements ProxyApi.SpatulaHeaderResult {

    /* renamed from: a */
    public Status f45447a;

    /* renamed from: b */
    public String f45448b;

    public zzax(@Nonnull String str) {
        this.f45448b = (String) Preconditions.checkNotNull(str);
        this.f45447a = Status.RESULT_SUCCESS;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult
    @Nullable
    public final String getSpatulaHeader() {
        return this.f45448b;
    }

    @Override // com.google.android.gms.common.api.Result
    @Nullable
    public final Status getStatus() {
        return this.f45447a;
    }

    public zzax(@Nonnull Status status) {
        this.f45447a = (Status) Preconditions.checkNotNull(status);
    }
}