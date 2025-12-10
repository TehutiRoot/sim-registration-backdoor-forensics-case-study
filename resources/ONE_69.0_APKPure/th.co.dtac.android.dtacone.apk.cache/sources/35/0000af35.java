package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* loaded from: classes4.dex */
public interface InstallIdProvider {

    @AutoValue
    /* loaded from: classes4.dex */
    public static abstract class InstallIds {
        /* renamed from: a */
        public static InstallIds m39046a(String str, FirebaseInstallationId firebaseInstallationId) {
            return new C8348a(str, firebaseInstallationId.getFid(), firebaseInstallationId.getAuthToken());
        }

        public static InstallIds createWithoutFid(String str) {
            return new C8348a(str, null, null);
        }

        @NonNull
        public abstract String getCrashlyticsInstallId();

        @Nullable
        public abstract String getFirebaseAuthenticationToken();

        @Nullable
        public abstract String getFirebaseInstallationId();
    }

    InstallIds getInstallIds();
}