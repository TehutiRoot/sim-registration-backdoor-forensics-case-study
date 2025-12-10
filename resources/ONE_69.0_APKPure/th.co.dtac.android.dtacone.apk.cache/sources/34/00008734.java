package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class MemberKey {

    /* renamed from: c */
    public static final Class[] f43360c = new Class[0];

    /* renamed from: a */
    public final String f43361a;

    /* renamed from: b */
    public final Class[] f43362b;

    public MemberKey(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != MemberKey.class) {
            return false;
        }
        MemberKey memberKey = (MemberKey) obj;
        if (!this.f43361a.equals(memberKey.f43361a)) {
            return false;
        }
        Class[] clsArr = memberKey.f43362b;
        int length = this.f43362b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.f43362b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f43361a.hashCode() + this.f43362b.length;
    }

    public String toString() {
        return this.f43361a + "(" + this.f43362b.length + "-args)";
    }

    public MemberKey(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public MemberKey(String str, Class<?>[] clsArr) {
        this.f43361a = str;
        this.f43362b = clsArr == null ? f43360c : clsArr;
    }
}