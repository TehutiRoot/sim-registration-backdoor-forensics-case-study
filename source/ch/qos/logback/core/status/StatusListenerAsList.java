package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class StatusListenerAsList implements StatusListener {

    /* renamed from: a */
    public List f40133a = new ArrayList();

    @Override // ch.qos.logback.core.status.StatusListener
    public void addStatusEvent(Status status) {
        this.f40133a.add(status);
    }

    public List<Status> getStatusList() {
        return this.f40133a;
    }
}
