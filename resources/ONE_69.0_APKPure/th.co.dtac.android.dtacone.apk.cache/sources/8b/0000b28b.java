package com.google.firebase.remoteconfig;

import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$registration$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m29142d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "onUpdate", "configUpdate", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "com.google.firebase-firebase-config"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes4.dex */
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ FirebaseRemoteConfig f56359a;

    /* renamed from: b */
    public final /* synthetic */ ProducerScope f56360b;

    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, ProducerScope producerScope) {
        this.f56359a = firebaseRemoteConfig;
        this.f56360b = producerScope;
    }

    /* renamed from: b */
    public static final void m37770b(ProducerScope $this$callbackFlow, ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter($this$callbackFlow, "$$this$callbackFlow");
        Intrinsics.checkNotNullParameter(configUpdate, "$configUpdate");
        ChannelsKt.trySendBlocking($this$callbackFlow, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(@NotNull FirebaseRemoteConfigException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        CoroutineScopeKt.cancel(this.f56360b, "Error listening for config updates.", error);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(@NotNull final ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
        FirebaseRemoteConfig firebaseRemoteConfig = this.f56359a;
        final ProducerScope producerScope = this.f56360b;
        firebaseRemoteConfig.schedule(new Runnable() { // from class: lw1
            @Override // java.lang.Runnable
            public final void run() {
                RemoteConfigKt$configUpdates$1$registration$1.m37770b(ProducerScope.this, configUpdate);
            }
        });
    }
}