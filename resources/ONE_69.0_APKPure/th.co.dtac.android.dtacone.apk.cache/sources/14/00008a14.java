package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* loaded from: classes3.dex */
public final class C6274b extends SchedulerConfig.ConfigValue {

    /* renamed from: a */
    public final long f44212a;

    /* renamed from: b */
    public final long f44213b;

    /* renamed from: c */
    public final Set f44214c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b */
    /* loaded from: classes3.dex */
    public static final class C6276b extends SchedulerConfig.ConfigValue.Builder {

        /* renamed from: a */
        public Long f44215a;

        /* renamed from: b */
        public Long f44216b;

        /* renamed from: c */
        public Set f44217c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String str = "";
            if (this.f44215a == null) {
                str = " delta";
            }
            if (this.f44216b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f44217c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C6274b(this.f44215a.longValue(), this.f44216b.longValue(), this.f44217c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long j) {
            this.f44215a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set set) {
            if (set != null) {
                this.f44217c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j) {
            this.f44216b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: a */
    public long mo49065a() {
        return this.f44212a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: b */
    public Set mo49064b() {
        return this.f44214c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: c */
    public long mo49063c() {
        return this.f44213b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        if (this.f44212a == configValue.mo49065a() && this.f44213b == configValue.mo49063c() && this.f44214c.equals(configValue.mo49064b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f44212a;
        long j2 = this.f44213b;
        return this.f44214c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f44212a + ", maxAllowedDelay=" + this.f44213b + ", flags=" + this.f44214c + "}";
    }

    public C6274b(long j, long j2, Set set) {
        this.f44212a = j;
        this.f44213b = j2;
        this.f44214c = set;
    }
}