package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* loaded from: classes4.dex */
public class DeadEvent {

    /* renamed from: a */
    public final Object f53752a;

    /* renamed from: b */
    public final Object f53753b;

    public DeadEvent(Object obj, Object obj2) {
        this.f53752a = Preconditions.checkNotNull(obj);
        this.f53753b = Preconditions.checkNotNull(obj2);
    }

    public Object getEvent() {
        return this.f53753b;
    }

    public Object getSource() {
        return this.f53752a;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("source", this.f53752a).add("event", this.f53753b).toString();
    }
}
