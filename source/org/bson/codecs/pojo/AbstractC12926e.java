package org.bson.codecs.pojo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: org.bson.codecs.pojo.e */
/* loaded from: classes6.dex */
public abstract class AbstractC12926e {

    /* renamed from: org.bson.codecs.pojo.e$a */
    /* loaded from: classes6.dex */
    public static class C12927a {

        /* renamed from: a */
        public final Collection f75925a;

        /* renamed from: b */
        public final Collection f75926b;

        public C12927a(Collection collection, Collection collection2) {
            this.f75925a = collection;
            this.f75926b = collection2;
        }

        /* renamed from: a */
        public Collection m24204a() {
            return this.f75925a;
        }

        /* renamed from: b */
        public Collection m24203b() {
            return this.f75926b;
        }
    }

    /* renamed from: a */
    public static C12927a m24208a(Class cls) {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isPublic(method.getModifiers()) && !method.isBridge()) {
                if (m24207b(method)) {
                    arrayList2.add(method);
                } else if (m24206c(method)) {
                    arrayList.add(method);
                }
            }
        }
        return new C12927a(arrayList2, arrayList);
    }

    /* renamed from: b */
    public static boolean m24207b(Method method) {
        if (method.getParameterTypes().length > 0) {
            return false;
        }
        if (method.getName().startsWith("get") && method.getName().length() > 3) {
            return Character.isUpperCase(method.getName().charAt(3));
        }
        if (!method.getName().startsWith("is") || method.getName().length() <= 2) {
            return false;
        }
        return Character.isUpperCase(method.getName().charAt(2));
    }

    /* renamed from: c */
    public static boolean m24206c(Method method) {
        if (method.getName().startsWith("set") && method.getName().length() > 3 && method.getParameterTypes().length == 1) {
            return Character.isUpperCase(method.getName().charAt(3));
        }
        return false;
    }

    /* renamed from: d */
    public static String m24205d(Method method) {
        int i;
        String name = method.getName();
        if (name.startsWith("is")) {
            i = 2;
        } else {
            i = 3;
        }
        char[] charArray = name.substring(i, name.length()).toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }
}
