package ch.qos.logback.core;

import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BasicStatusManager implements StatusManager {
    public static final int MAX_HEADER_COUNT = 150;
    public static final int TAIL_SIZE = 150;

    /* renamed from: a */
    public int f39706a = 0;
    protected final List<Status> statusList = new ArrayList();
    protected final CyclicBuffer<Status> tailBuffer = new CyclicBuffer<>(150);
    protected final LogbackLock statusListLock = new LogbackLock();

    /* renamed from: b */
    public int f39707b = 0;
    protected final List<StatusListener> statusListenerList = new ArrayList();
    protected final LogbackLock statusListenerListLock = new LogbackLock();

    /* renamed from: a */
    public final boolean m51543a(List list, Class cls) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((StatusListener) it.next()).getClass() == cls) {
                return true;
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public void add(Status status) {
        m51542b(status);
        this.f39706a++;
        if (status.getLevel() > this.f39707b) {
            this.f39707b = status.getLevel();
        }
        synchronized (this.statusListLock) {
            try {
                if (this.statusList.size() < 150) {
                    this.statusList.add(status);
                } else {
                    this.tailBuffer.add(status);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public boolean addUniquely(StatusListener statusListener, Object obj) {
        for (StatusListener statusListener2 : getCopyOfStatusListenerList()) {
            if (statusListener2.getClass().isInstance(statusListener)) {
                add(new WarnStatus("A previous listener of type [" + statusListener2.getClass() + "] has been already registered. Skipping double registration.", obj));
                return false;
            }
        }
        add(statusListener);
        return true;
    }

    /* renamed from: b */
    public final void m51542b(Status status) {
        synchronized (this.statusListenerListLock) {
            try {
                for (StatusListener statusListener : this.statusListenerList) {
                    statusListener.addStatusEvent(status);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public void clear() {
        synchronized (this.statusListLock) {
            this.f39706a = 0;
            this.statusList.clear();
            this.tailBuffer.clear();
        }
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public List<Status> getCopyOfStatusList() {
        ArrayList arrayList;
        synchronized (this.statusListLock) {
            arrayList = new ArrayList(this.statusList);
            arrayList.addAll(this.tailBuffer.asList());
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public List<StatusListener> getCopyOfStatusListenerList() {
        ArrayList arrayList;
        synchronized (this.statusListenerListLock) {
            arrayList = new ArrayList(this.statusListenerList);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public int getCount() {
        return this.f39706a;
    }

    public int getLevel() {
        return this.f39707b;
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public void remove(StatusListener statusListener) {
        synchronized (this.statusListenerListLock) {
            this.statusListenerList.remove(statusListener);
        }
    }

    @Override // ch.qos.logback.core.status.StatusManager
    public boolean add(StatusListener statusListener) {
        synchronized (this.statusListenerListLock) {
            try {
                if ((statusListener instanceof OnConsoleStatusListener) && m51543a(this.statusListenerList, statusListener.getClass())) {
                    return false;
                }
                this.statusListenerList.add(statusListener);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}