package com.google.mlkit.common.model;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes4.dex */
public class DownloadConditions {

    /* renamed from: a */
    public final boolean f56884a;

    /* renamed from: b */
    public final boolean f56885b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public boolean f56886a = false;

        /* renamed from: b */
        public boolean f56887b = false;

        @NonNull
        public DownloadConditions build() {
            return new DownloadConditions(this.f56886a, this.f56887b, null);
        }

        @NonNull
        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireCharging() {
            this.f56886a = true;
            return this;
        }

        @NonNull
        public Builder requireWifi() {
            this.f56887b = true;
            return this;
        }
    }

    public /* synthetic */ DownloadConditions(boolean z, boolean z2, zzb zzbVar) {
        this.f56884a = z;
        this.f56885b = z2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadConditions)) {
            return false;
        }
        DownloadConditions downloadConditions = (DownloadConditions) obj;
        if (this.f56884a == downloadConditions.f56884a && this.f56885b == downloadConditions.f56885b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f56884a), Boolean.valueOf(this.f56885b));
    }

    public boolean isChargingRequired() {
        return this.f56884a;
    }

    public boolean isWifiRequired() {
        return this.f56885b;
    }
}
