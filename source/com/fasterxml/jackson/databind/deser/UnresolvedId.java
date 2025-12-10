package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.util.ClassUtil;

/* loaded from: classes3.dex */
public class UnresolvedId {

    /* renamed from: a */
    public final Object f43283a;

    /* renamed from: b */
    public final JsonLocation f43284b;

    /* renamed from: c */
    public final Class f43285c;

    public UnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.f43283a = obj;
        this.f43285c = cls;
        this.f43284b = jsonLocation;
    }

    public Object getId() {
        return this.f43283a;
    }

    public JsonLocation getLocation() {
        return this.f43284b;
    }

    public Class<?> getType() {
        return this.f43285c;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.f43283a, ClassUtil.nameOf(this.f43285c), this.f43284b);
    }
}
