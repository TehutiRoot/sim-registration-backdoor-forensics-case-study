package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* loaded from: classes3.dex */
public final class C6273a extends SchedulerConfig {

    /* renamed from: a */
    public final Clock f44210a;

    /* renamed from: b */
    public final Map f44211b;

    public C6273a(Clock clock, Map map) {
        if (clock != null) {
            this.f44210a = clock;
            if (map != null) {
                this.f44211b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: c */
    public Clock mo49067c() {
        return this.f44210a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: d */
    public Map mo49066d() {
        return this.f44211b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (this.f44210a.equals(schedulerConfig.mo49067c()) && this.f44211b.equals(schedulerConfig.mo49066d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f44210a.hashCode() ^ 1000003) * 1000003) ^ this.f44211b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f44210a + ", values=" + this.f44211b + "}";
    }
}