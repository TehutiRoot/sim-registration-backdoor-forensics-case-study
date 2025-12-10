package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class SubscriberExceptionContext {

    /* renamed from: a */
    public final EventBus f53761a;

    /* renamed from: b */
    public final Object f53762b;

    /* renamed from: c */
    public final Object f53763c;

    /* renamed from: d */
    public final Method f53764d;

    public SubscriberExceptionContext(EventBus eventBus, Object obj, Object obj2, Method method) {
        this.f53761a = (EventBus) Preconditions.checkNotNull(eventBus);
        this.f53762b = Preconditions.checkNotNull(obj);
        this.f53763c = Preconditions.checkNotNull(obj2);
        this.f53764d = (Method) Preconditions.checkNotNull(method);
    }

    public Object getEvent() {
        return this.f53762b;
    }

    public EventBus getEventBus() {
        return this.f53761a;
    }

    public Object getSubscriber() {
        return this.f53763c;
    }

    public Method getSubscriberMethod() {
        return this.f53764d;
    }
}
