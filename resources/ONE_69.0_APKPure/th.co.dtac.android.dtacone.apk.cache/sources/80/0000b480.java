package com.google.mlkit.common.model;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes4.dex */
public class DownloadConditions {

    /* renamed from: a */
    public final boolean f56896a;

    /* renamed from: b */
    public final boolean f56897b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public boolean f56898a = false;

        /* renamed from: b */
        public boolean f56899b = false;

        @NonNull
        public DownloadConditions build() {
            return new DownloadConditions(this.f56898a, this.f56899b, null);
        }

        @NonNull
        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireCharging() {
            this.f56898a = true;
            return this;
        }

        @NonNull
        public Builder requireWifi() {
            this.f56899b = true;
            return this;
        }
    }

    public /* synthetic */ DownloadConditions(boolean z, boolean z2, zzb zzbVar) {
        this.f56896a = z;
        this.f56897b = z2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadConditions)) {
            return false;
        }
        DownloadConditions downloadConditions = (DownloadConditions) obj;
        if (this.f56896a == downloadConditions.f56896a && this.f56897b == downloadConditions.f56897b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f56896a), Boolean.valueOf(this.f56897b));
    }

    public boolean isChargingRequired() {
        return this.f56896a;
    }

    public boolean isWifiRequired() {
        return this.f56897b;
    }
}