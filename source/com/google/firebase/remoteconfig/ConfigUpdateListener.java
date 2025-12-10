package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import javax.annotation.Nonnull;

/* loaded from: classes4.dex */
public interface ConfigUpdateListener {
    void onError(@Nonnull FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(@NonNull ConfigUpdate configUpdate);
}
