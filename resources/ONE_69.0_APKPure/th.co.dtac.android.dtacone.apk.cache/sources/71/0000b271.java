package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import javax.annotation.Nonnull;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int i, @NonNull String str) {
        super(str);
        this.httpStatusCode = i;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th2) {
        super(str, th2);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, @Nonnull FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nonnull FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, @Nullable Throwable th2, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th2, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th2, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th2, code);
        this.httpStatusCode = i;
    }
}