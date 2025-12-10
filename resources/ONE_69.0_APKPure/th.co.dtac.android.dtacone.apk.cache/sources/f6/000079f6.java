package ch.qos.logback.core;

import ch.qos.logback.core.spi.LifeCycle;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class LifeCycleManager {

    /* renamed from: a */
    public final Set f39725a = new HashSet();

    public void register(LifeCycle lifeCycle) {
        this.f39725a.add(lifeCycle);
    }

    public void reset() {
        for (LifeCycle lifeCycle : this.f39725a) {
            if (lifeCycle.isStarted()) {
                lifeCycle.stop();
            }
        }
        this.f39725a.clear();
    }
}