package p000;

import com.google.firebase.components.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: OS */
/* loaded from: classes4.dex */
public class C1014OS implements Subscriber, Publisher {

    /* renamed from: a */
    public final Map f4409a = new HashMap();

    /* renamed from: b */
    public Queue f4410b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f4411c;

    public C1014OS(Executor executor) {
        this.f4411c = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m67043a(Map.Entry entry, Event event) {
        m67040d(entry, event);
    }

    /* renamed from: d */
    public static /* synthetic */ void m67040d(Map.Entry entry, Event event) {
        ((EventHandler) entry.getKey()).handle(event);
    }

    /* renamed from: b */
    public void m67042b() {
        Queue<Event> queue;
        synchronized (this) {
            try {
                queue = this.f4410b;
                if (queue != null) {
                    this.f4410b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            for (Event event : queue) {
                publish(event);
            }
        }
    }

    /* renamed from: c */
    public final synchronized Set m67041c(Event event) {
        Set entrySet;
        try {
            Map map = (Map) this.f4409a.get(event.getType());
            if (map == null) {
                entrySet = Collections.emptySet();
            } else {
                entrySet = map.entrySet();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return entrySet;
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(final Event event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            try {
                Queue queue = this.f4410b;
                if (queue != null) {
                    queue.add(event);
                    return;
                }
                for (final Map.Entry entry : m67041c(event)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: NS
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1014OS.m67043a(entry, event);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized void subscribe(Class cls, Executor executor, EventHandler eventHandler) {
        try {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.f4409a.containsKey(cls)) {
                this.f4409a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f4409a.get(cls)).put(eventHandler, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized void unsubscribe(Class cls, EventHandler eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (!this.f4409a.containsKey(cls)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f4409a.get(cls);
        concurrentHashMap.remove(eventHandler);
        if (concurrentHashMap.isEmpty()) {
            this.f4409a.remove(cls);
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public void subscribe(Class cls, EventHandler eventHandler) {
        subscribe(cls, this.f4411c, eventHandler);
    }
}
