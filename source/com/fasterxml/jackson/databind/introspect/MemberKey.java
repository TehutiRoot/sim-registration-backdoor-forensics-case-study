package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class MemberKey {

    /* renamed from: c */
    public static final Class[] f43348c = new Class[0];

    /* renamed from: a */
    public final String f43349a;

    /* renamed from: b */
    public final Class[] f43350b;

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
        if (!this.f43349a.equals(memberKey.f43349a)) {
            return false;
        }
        Class[] clsArr = memberKey.f43350b;
        int length = this.f43350b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.f43350b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f43349a.hashCode() + this.f43350b.length;
    }

    public String toString() {
        return this.f43349a + "(" + this.f43350b.length + "-args)";
    }

    public MemberKey(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public MemberKey(String str, Class<?>[] clsArr) {
        this.f43349a = str;
        this.f43350b = clsArr == null ? f43348c : clsArr;
    }
}
