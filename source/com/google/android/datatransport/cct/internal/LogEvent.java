package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C6246g;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class LogEvent {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract Builder mo49155a(byte[] bArr);

        /* renamed from: b */
        public abstract Builder mo49154b(String str);

        @NonNull
        public abstract LogEvent build();

        @NonNull
        public abstract Builder setComplianceData(@Nullable ComplianceData complianceData);

        @NonNull
        public abstract Builder setEventCode(@Nullable Integer num);

        @NonNull
        public abstract Builder setEventTimeMs(long j);

        @NonNull
        public abstract Builder setEventUptimeMs(long j);

        @NonNull
        public abstract Builder setExperimentIds(@Nullable ExperimentIds experimentIds);

        @NonNull
        public abstract Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo);

        @NonNull
        public abstract Builder setTimezoneOffsetSeconds(long j);
    }

    /* renamed from: a */
    public static Builder m49157a() {
        return new C6246g.C6248b();
    }

    @NonNull
    public static Builder jsonBuilder(@NonNull String str) {
        return m49157a().mo49154b(str);
    }

    @NonNull
    public static Builder protoBuilder(@NonNull byte[] bArr) {
        return m49157a().mo49155a(bArr);
    }

    @Nullable
    public abstract ComplianceData getComplianceData();

    @Nullable
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @Nullable
    public abstract ExperimentIds getExperimentIds();

    @Nullable
    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    @Nullable
    public abstract byte[] getSourceExtension();

    @Nullable
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
