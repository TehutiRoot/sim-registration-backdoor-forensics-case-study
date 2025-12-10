package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* loaded from: classes3.dex */
public final class C6284a extends SchedulerConfig {

    /* renamed from: a */
    public final Clock f44198a;

    /* renamed from: b */
    public final Map f44199b;

    public C6284a(Clock clock, Map map) {
        if (clock != null) {
            this.f44198a = clock;
            if (map != null) {
                this.f44199b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: c */
    public Clock mo49070c() {
        return this.f44198a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: d */
    public Map mo49069d() {
        return this.f44199b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (this.f44198a.equals(schedulerConfig.mo49070c()) && this.f44199b.equals(schedulerConfig.mo49069d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f44198a.hashCode() ^ 1000003) * 1000003) ^ this.f44199b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f44198a + ", values=" + this.f44199b + "}";
    }
}
