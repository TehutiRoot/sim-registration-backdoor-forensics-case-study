package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* loaded from: classes4.dex */
public class DeadEvent {

    /* renamed from: a */
    public final Object f53764a;

    /* renamed from: b */
    public final Object f53765b;

    public DeadEvent(Object obj, Object obj2) {
        this.f53764a = Preconditions.checkNotNull(obj);
        this.f53765b = Preconditions.checkNotNull(obj2);
    }

    public Object getEvent() {
        return this.f53765b;
    }

    public Object getSource() {
        return this.f53764a;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("source", this.f53764a).add("event", this.f53765b).toString();
    }
}