package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.util.ClassUtil;

/* loaded from: classes3.dex */
public class UnresolvedId {

    /* renamed from: a */
    public final Object f43295a;

    /* renamed from: b */
    public final JsonLocation f43296b;

    /* renamed from: c */
    public final Class f43297c;

    public UnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.f43295a = obj;
        this.f43297c = cls;
        this.f43296b = jsonLocation;
    }

    public Object getId() {
        return this.f43295a;
    }

    public JsonLocation getLocation() {
        return this.f43296b;
    }

    public Class<?> getType() {
        return this.f43297c;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.f43295a, ClassUtil.nameOf(this.f43297c), this.f43296b);
    }
}