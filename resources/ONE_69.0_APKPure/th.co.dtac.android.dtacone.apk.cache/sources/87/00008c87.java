package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ModuleInstallRequest {

    /* renamed from: a */
    public final List f45219a;

    /* renamed from: b */
    public final InstallStatusListener f45220b;

    /* renamed from: c */
    public final Executor f45221c;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public final List f45222a = new ArrayList();

        /* renamed from: b */
        public InstallStatusListener f45223b;

        /* renamed from: c */
        public Executor f45224c;

        @NonNull
        @CanIgnoreReturnValue
        public Builder addApi(@NonNull OptionalModuleApi optionalModuleApi) {
            this.f45222a.add(optionalModuleApi);
            return this;
        }

        @NonNull
        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.f45222a, this.f45223b, this.f45224c, true, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setListener(@NonNull InstallStatusListener installStatusListener, @Nullable Executor executor) {
            this.f45223b = installStatusListener;
            this.f45224c = executor;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setListener(@NonNull InstallStatusListener installStatusListener) {
            return setListener(installStatusListener, null);
        }
    }

    public /* synthetic */ ModuleInstallRequest(List list, InstallStatusListener installStatusListener, Executor executor, boolean z, zac zacVar) {
        Preconditions.checkNotNull(list, "APIs must not be null.");
        Preconditions.checkArgument(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            Preconditions.checkNotNull(installStatusListener, "Listener must not be null when listener executor is set.");
        }
        this.f45219a = list;
        this.f45220b = installStatusListener;
        this.f45221c = executor;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public List<OptionalModuleApi> getApis() {
        return this.f45219a;
    }

    @Nullable
    public InstallStatusListener getListener() {
        return this.f45220b;
    }

    @Nullable
    public Executor getListenerExecutor() {
        return this.f45221c;
    }
}