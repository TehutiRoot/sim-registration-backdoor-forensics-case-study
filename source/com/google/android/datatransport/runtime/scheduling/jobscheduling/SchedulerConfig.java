package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6285b;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: classes3.dex */
public abstract class SchedulerConfig {

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public Clock f44170a;

        /* renamed from: b */
        public Map f44171b = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.f44171b.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            if (this.f44170a != null) {
                if (this.f44171b.keySet().size() >= Priority.values().length) {
                    Map map = this.f44171b;
                    this.f44171b = new HashMap();
                    return SchedulerConfig.m49096b(this.f44170a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public Builder setClock(Clock clock) {
            this.f44170a = clock;
            return this;
        }
    }

    @AutoValue
    /* loaded from: classes3.dex */
    public static abstract class ConfigValue {

        @AutoValue.Builder
        /* loaded from: classes3.dex */
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j);
        }

        public static Builder builder() {
            return new C6285b.C6287b().setFlags(Collections.emptySet());
        }

        /* renamed from: a */
        public abstract long mo49068a();

        /* renamed from: b */
        public abstract Set mo49067b();

        /* renamed from: c */
        public abstract long mo49066c();
    }

    /* loaded from: classes3.dex */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static SchedulerConfig m49096b(Clock clock, Map map) {
        return new C6284a(clock, map);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: e */
    public static Set m49095e(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(m49095e(Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    /* renamed from: a */
    public final long m49097a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2)));
    }

    /* renamed from: c */
    public abstract Clock mo49070c();

    @RequiresApi(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(getScheduleDelay(priority, j, i));
        m49094f(builder, ((ConfigValue) mo49069d().get(priority)).mo49067b());
        return builder;
    }

    /* renamed from: d */
    public abstract Map mo49069d();

    /* renamed from: f */
    public final void m49094f(JobInfo.Builder builder, Set set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public Set<Flag> getFlags(Priority priority) {
        return ((ConfigValue) mo49069d().get(priority)).mo49067b();
    }

    public long getScheduleDelay(Priority priority, long j, int i) {
        long time = j - mo49070c().getTime();
        ConfigValue configValue = (ConfigValue) mo49069d().get(priority);
        return Math.min(Math.max(m49097a(i, configValue.mo49068a()), time), configValue.mo49066c());
    }
}
