package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* loaded from: classes4.dex */
public class Event<T> {

    /* renamed from: a */
    public final Class f55458a;

    /* renamed from: b */
    public final Object f55459b;

    public Event(Class<T> cls, T t) {
        this.f55458a = (Class) Preconditions.checkNotNull(cls);
        this.f55459b = Preconditions.checkNotNull(t);
    }

    public T getPayload() {
        return (T) this.f55459b;
    }

    public Class<T> getType() {
        return this.f55458a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f55458a, this.f55459b);
    }
}