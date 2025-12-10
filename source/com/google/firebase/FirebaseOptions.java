package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* loaded from: classes4.dex */
public final class FirebaseOptions {

    /* renamed from: a */
    public final String f54512a;

    /* renamed from: b */
    public final String f54513b;

    /* renamed from: c */
    public final String f54514c;

    /* renamed from: d */
    public final String f54515d;

    /* renamed from: e */
    public final String f54516e;

    /* renamed from: f */
    public final String f54517f;

    /* renamed from: g */
    public final String f54518g;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f54519a;

        /* renamed from: b */
        public String f54520b;

        /* renamed from: c */
        public String f54521c;

        /* renamed from: d */
        public String f54522d;

        /* renamed from: e */
        public String f54523e;

        /* renamed from: f */
        public String f54524f;

        /* renamed from: g */
        public String f54525g;

        public Builder() {
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.f54520b, this.f54519a, this.f54521c, this.f54522d, this.f54523e, this.f54524f, this.f54525g);
        }

        @NonNull
        public Builder setApiKey(@NonNull String str) {
            this.f54519a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String str) {
            this.f54520b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(@Nullable String str) {
            this.f54521c = str;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setGaTrackingId(@Nullable String str) {
            this.f54522d = str;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(@Nullable String str) {
            this.f54523e = str;
            return this;
        }

        @NonNull
        public Builder setProjectId(@Nullable String str) {
            this.f54525g = str;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(@Nullable String str) {
            this.f54524f = str;
            return this;
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions) {
            this.f54520b = firebaseOptions.f54513b;
            this.f54519a = firebaseOptions.f54512a;
            this.f54521c = firebaseOptions.f54514c;
            this.f54522d = firebaseOptions.f54515d;
            this.f54523e = firebaseOptions.f54516e;
            this.f54524f = firebaseOptions.f54517f;
            this.f54525g = firebaseOptions.f54518g;
        }
    }

    @Nullable
    public static FirebaseOptions fromResource(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        if (!Objects.equal(this.f54513b, firebaseOptions.f54513b) || !Objects.equal(this.f54512a, firebaseOptions.f54512a) || !Objects.equal(this.f54514c, firebaseOptions.f54514c) || !Objects.equal(this.f54515d, firebaseOptions.f54515d) || !Objects.equal(this.f54516e, firebaseOptions.f54516e) || !Objects.equal(this.f54517f, firebaseOptions.f54517f) || !Objects.equal(this.f54518g, firebaseOptions.f54518g)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getApiKey() {
        return this.f54512a;
    }

    @NonNull
    public String getApplicationId() {
        return this.f54513b;
    }

    @Nullable
    public String getDatabaseUrl() {
        return this.f54514c;
    }

    @Nullable
    @KeepForSdk
    public String getGaTrackingId() {
        return this.f54515d;
    }

    @Nullable
    public String getGcmSenderId() {
        return this.f54516e;
    }

    @Nullable
    public String getProjectId() {
        return this.f54518g;
    }

    @Nullable
    public String getStorageBucket() {
        return this.f54517f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f54513b, this.f54512a, this.f54514c, this.f54515d, this.f54516e, this.f54517f, this.f54518g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f54513b).add("apiKey", this.f54512a).add("databaseUrl", this.f54514c).add("gcmSenderId", this.f54516e).add("storageBucket", this.f54517f).add("projectId", this.f54518g).toString();
    }

    public FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f54513b = str;
        this.f54512a = str2;
        this.f54514c = str3;
        this.f54515d = str4;
        this.f54516e = str5;
        this.f54517f = str6;
        this.f54518g = str7;
    }
}
