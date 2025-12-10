package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* loaded from: classes4.dex */
public class Event<T> {

    /* renamed from: a */
    public final Class f55446a;

    /* renamed from: b */
    public final Object f55447b;

    public Event(Class<T> cls, T t) {
        this.f55446a = (Class) Preconditions.checkNotNull(cls);
        this.f55447b = Preconditions.checkNotNull(t);
    }

    public T getPayload() {
        return (T) this.f55447b;
    }

    public Class<T> getType() {
        return this.f55446a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f55446a, this.f55447b);
    }
}
