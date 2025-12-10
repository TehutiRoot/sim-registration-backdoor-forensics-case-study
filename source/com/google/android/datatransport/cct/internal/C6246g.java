package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.internal.g */
/* loaded from: classes3.dex */
public final class C6246g extends LogEvent {

    /* renamed from: a */
    public final long f43970a;

    /* renamed from: b */
    public final Integer f43971b;

    /* renamed from: c */
    public final ComplianceData f43972c;

    /* renamed from: d */
    public final long f43973d;

    /* renamed from: e */
    public final byte[] f43974e;

    /* renamed from: f */
    public final String f43975f;

    /* renamed from: g */
    public final long f43976g;

    /* renamed from: h */
    public final NetworkConnectionInfo f43977h;

    /* renamed from: i */
    public final ExperimentIds f43978i;

    /* renamed from: com.google.android.datatransport.cct.internal.g$b */
    /* loaded from: classes3.dex */
    public static final class C6248b extends LogEvent.Builder {

        /* renamed from: a */
        public Long f43979a;

        /* renamed from: b */
        public Integer f43980b;

        /* renamed from: c */
        public ComplianceData f43981c;

        /* renamed from: d */
        public Long f43982d;

        /* renamed from: e */
        public byte[] f43983e;

        /* renamed from: f */
        public String f43984f;

        /* renamed from: g */
        public Long f43985g;

        /* renamed from: h */
        public NetworkConnectionInfo f43986h;

        /* renamed from: i */
        public ExperimentIds f43987i;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: a */
        public LogEvent.Builder mo49155a(byte[] bArr) {
            this.f43983e = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: b */
        public LogEvent.Builder mo49154b(String str) {
            this.f43984f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent build() {
            String str = "";
            if (this.f43979a == null) {
                str = " eventTimeMs";
            }
            if (this.f43982d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f43985g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C6246g(this.f43979a.longValue(), this.f43980b, this.f43981c, this.f43982d.longValue(), this.f43983e, this.f43984f, this.f43985g.longValue(), this.f43986h, this.f43987i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setComplianceData(ComplianceData complianceData) {
            this.f43981c = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventCode(Integer num) {
            this.f43980b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventTimeMs(long j) {
            this.f43979a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventUptimeMs(long j) {
            this.f43982d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setExperimentIds(ExperimentIds experimentIds) {
            this.f43987i = experimentIds;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setNetworkConnectionInfo(NetworkConnectionInfo networkConnectionInfo) {
            this.f43986h = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setTimezoneOffsetSeconds(long j) {
            this.f43985g = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        ComplianceData complianceData;
        byte[] sourceExtension;
        String str;
        NetworkConnectionInfo networkConnectionInfo;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f43970a == logEvent.getEventTimeMs() && ((num = this.f43971b) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && ((complianceData = this.f43972c) != null ? complianceData.equals(logEvent.getComplianceData()) : logEvent.getComplianceData() == null) && this.f43973d == logEvent.getEventUptimeMs()) {
            byte[] bArr = this.f43974e;
            if (logEvent instanceof C6246g) {
                sourceExtension = ((C6246g) logEvent).f43974e;
            } else {
                sourceExtension = logEvent.getSourceExtension();
            }
            if (Arrays.equals(bArr, sourceExtension) && ((str = this.f43975f) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.f43976g == logEvent.getTimezoneOffsetSeconds() && ((networkConnectionInfo = this.f43977h) != null ? networkConnectionInfo.equals(logEvent.getNetworkConnectionInfo()) : logEvent.getNetworkConnectionInfo() == null)) {
                ExperimentIds experimentIds = this.f43978i;
                if (experimentIds == null) {
                    if (logEvent.getExperimentIds() == null) {
                        return true;
                    }
                } else if (experimentIds.equals(logEvent.getExperimentIds())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public ComplianceData getComplianceData() {
        return this.f43972c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public Integer getEventCode() {
        return this.f43971b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
        return this.f43970a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
        return this.f43973d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public ExperimentIds getExperimentIds() {
        return this.f43978i;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.f43977h;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public byte[] getSourceExtension() {
        return this.f43974e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public String getSourceExtensionJsonProto3() {
        return this.f43975f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
        return this.f43976g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.f43970a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f43971b;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        ComplianceData complianceData = this.f43972c;
        if (complianceData == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = complianceData.hashCode();
        }
        long j2 = this.f43973d;
        int hashCode5 = (((((i3 ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f43974e)) * 1000003;
        String str = this.f43975f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j3 = this.f43976g;
        int i4 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f43977h;
        if (networkConnectionInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = networkConnectionInfo.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        ExperimentIds experimentIds = this.f43978i;
        if (experimentIds != null) {
            i2 = experimentIds.hashCode();
        }
        return i5 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f43970a + ", eventCode=" + this.f43971b + ", complianceData=" + this.f43972c + ", eventUptimeMs=" + this.f43973d + ", sourceExtension=" + Arrays.toString(this.f43974e) + ", sourceExtensionJsonProto3=" + this.f43975f + ", timezoneOffsetSeconds=" + this.f43976g + ", networkConnectionInfo=" + this.f43977h + ", experimentIds=" + this.f43978i + "}";
    }

    public C6246g(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.f43970a = j;
        this.f43971b = num;
        this.f43972c = complianceData;
        this.f43973d = j2;
        this.f43974e = bArr;
        this.f43975f = str;
        this.f43976g = j3;
        this.f43977h = networkConnectionInfo;
        this.f43978i = experimentIds;
    }
}
