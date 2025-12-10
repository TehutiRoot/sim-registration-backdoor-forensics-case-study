package com.google.firebase.p015ml.common.modeldownload;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions */
/* loaded from: classes4.dex */
public class FirebaseModelDownloadConditions {

    /* renamed from: a */
    public final boolean f55814a;

    /* renamed from: b */
    public final boolean f55815b;

    /* renamed from: c */
    public final boolean f55816c;

    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public boolean f55817a = false;

        /* renamed from: b */
        public boolean f55818b = false;

        /* renamed from: c */
        public boolean f55819c = false;

        @NonNull
        public FirebaseModelDownloadConditions build() {
            return new FirebaseModelDownloadConditions(this.f55817a, this.f55818b, this.f55819c);
        }

        @NonNull
        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireCharging() {
            this.f55817a = true;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireDeviceIdle() {
            this.f55819c = true;
            return this;
        }

        @NonNull
        public Builder requireWifi() {
            this.f55818b = true;
            return this;
        }
    }

    public FirebaseModelDownloadConditions(boolean z, boolean z2, boolean z3) {
        this.f55814a = z;
        this.f55815b = z2;
        this.f55816c = z3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseModelDownloadConditions)) {
            return false;
        }
        FirebaseModelDownloadConditions firebaseModelDownloadConditions = (FirebaseModelDownloadConditions) obj;
        if (this.f55814a == firebaseModelDownloadConditions.f55814a && this.f55816c == firebaseModelDownloadConditions.f55816c && this.f55815b == firebaseModelDownloadConditions.f55815b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f55814a), Boolean.valueOf(this.f55815b), Boolean.valueOf(this.f55816c));
    }

    public boolean isChargingRequired() {
        return this.f55814a;
    }

    public boolean isDeviceIdleRequired() {
        return this.f55816c;
    }

    public boolean isWifiRequired() {
        return this.f55815b;
    }
}