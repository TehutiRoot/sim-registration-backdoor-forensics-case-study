package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* loaded from: classes3.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {
    @NonNull
    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;
    @NonNull
    public final UnregisterListenerMethod zaa;
    @NonNull
    public final Runnable zab;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class Builder<A extends Api.AnyClient, L> {

        /* renamed from: a */
        public RemoteCall f44809a;

        /* renamed from: b */
        public RemoteCall f44810b;

        /* renamed from: d */
        public ListenerHolder f44812d;

        /* renamed from: e */
        public Feature[] f44813e;

        /* renamed from: g */
        public int f44815g;

        /* renamed from: c */
        public Runnable f44811c = zacj.zaa;

        /* renamed from: f */
        public boolean f44814f = true;

        public /* synthetic */ Builder(zacm zacmVar) {
        }

        @NonNull
        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (this.f44809a != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Must set register function");
            if (this.f44810b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Must set unregister function");
            if (this.f44812d != null) {
                z3 = true;
            }
            Preconditions.checkArgument(z3, "Must set holder");
            return new RegistrationMethods<>(new C6334d(this, this.f44812d, this.f44813e, this.f44814f, this.f44815g), new C6335e(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.f44812d.getListenerKey(), "Key must not be null")), this.f44811c, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(@NonNull Runnable runnable) {
            this.f44811c = runnable;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder<A, L> register(@NonNull RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.f44809a = remoteCall;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.f44814f = z;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder<A, L> setFeatures(@NonNull Feature... featureArr) {
            this.f44813e = featureArr;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder<A, L> setMethodKey(int i) {
            this.f44815g = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder<A, L> unregister(@NonNull RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.f44810b = remoteCall;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder<A, L> withHolder(@NonNull ListenerHolder<L> listenerHolder) {
            this.f44812d = listenerHolder;
            return this;
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacnVar) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    @NonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>(null);
    }
}