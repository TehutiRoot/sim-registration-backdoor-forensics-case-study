package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* loaded from: classes3.dex */
public final class C6285b extends SchedulerConfig.ConfigValue {

    /* renamed from: a */
    public final long f44200a;

    /* renamed from: b */
    public final long f44201b;

    /* renamed from: c */
    public final Set f44202c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b */
    /* loaded from: classes3.dex */
    public static final class C6287b extends SchedulerConfig.ConfigValue.Builder {

        /* renamed from: a */
        public Long f44203a;

        /* renamed from: b */
        public Long f44204b;

        /* renamed from: c */
        public Set f44205c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String str = "";
            if (this.f44203a == null) {
                str = " delta";
            }
            if (this.f44204b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f44205c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C6285b(this.f44203a.longValue(), this.f44204b.longValue(), this.f44205c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long j) {
            this.f44203a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set set) {
            if (set != null) {
                this.f44205c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j) {
            this.f44204b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: a */
    public long mo49068a() {
        return this.f44200a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: b */
    public Set mo49067b() {
        return this.f44202c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: c */
    public long mo49066c() {
        return this.f44201b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        if (this.f44200a == configValue.mo49068a() && this.f44201b == configValue.mo49066c() && this.f44202c.equals(configValue.mo49067b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f44200a;
        long j2 = this.f44201b;
        return this.f44202c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f44200a + ", maxAllowedDelay=" + this.f44201b + ", flags=" + this.f44202c + "}";
    }

    public C6285b(long j, long j2, Set set) {
        this.f44200a = j;
        this.f44201b = j2;
        this.f44202c = set;
    }
}
