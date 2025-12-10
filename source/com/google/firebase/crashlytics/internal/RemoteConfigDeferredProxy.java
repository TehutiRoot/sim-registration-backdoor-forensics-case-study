package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

/* loaded from: classes4.dex */
public class RemoteConfigDeferredProxy {

    /* renamed from: a */
    public final Deferred f54765a;

    public RemoteConfigDeferredProxy(Deferred<FirebaseRemoteConfigInterop> deferred) {
        this.f54765a = deferred;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39129a(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        m39128b(crashlyticsRemoteConfigListener, provider);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39128b(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber(RemoteConfigComponent.DEFAULT_NAMESPACE, crashlyticsRemoteConfigListener);
        Logger.getLogger().m39140d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().m39132w("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(userMetadata);
        this.f54765a.whenAvailable(new Deferred.DeferredHandler() { // from class: mv1
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                RemoteConfigDeferredProxy.m39129a(CrashlyticsRemoteConfigListener.this, provider);
            }
        });
    }
}
