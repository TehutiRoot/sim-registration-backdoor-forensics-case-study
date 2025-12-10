package com.google.firebase.p015ml.common.modeldownload;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions */
/* loaded from: classes4.dex */
public class FirebaseModelDownloadConditions {

    /* renamed from: a */
    public final boolean f55802a;

    /* renamed from: b */
    public final boolean f55803b;

    /* renamed from: c */
    public final boolean f55804c;

    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public boolean f55805a = false;

        /* renamed from: b */
        public boolean f55806b = false;

        /* renamed from: c */
        public boolean f55807c = false;

        @NonNull
        public FirebaseModelDownloadConditions build() {
            return new FirebaseModelDownloadConditions(this.f55805a, this.f55806b, this.f55807c);
        }

        @NonNull
        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireCharging() {
            this.f55805a = true;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireDeviceIdle() {
            this.f55807c = true;
            return this;
        }

        @NonNull
        public Builder requireWifi() {
            this.f55806b = true;
            return this;
        }
    }

    public FirebaseModelDownloadConditions(boolean z, boolean z2, boolean z3) {
        this.f55802a = z;
        this.f55803b = z2;
        this.f55804c = z3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseModelDownloadConditions)) {
            return false;
        }
        FirebaseModelDownloadConditions firebaseModelDownloadConditions = (FirebaseModelDownloadConditions) obj;
        if (this.f55802a == firebaseModelDownloadConditions.f55802a && this.f55804c == firebaseModelDownloadConditions.f55804c && this.f55803b == firebaseModelDownloadConditions.f55803b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f55802a), Boolean.valueOf(this.f55803b), Boolean.valueOf(this.f55804c));
    }

    public boolean isChargingRequired() {
        return this.f55802a;
    }

    public boolean isDeviceIdleRequired() {
        return this.f55804c;
    }

    public boolean isWifiRequired() {
        return this.f55803b;
    }
}
