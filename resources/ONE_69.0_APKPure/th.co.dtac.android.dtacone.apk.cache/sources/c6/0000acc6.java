package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@GwtCompatible
/* loaded from: classes4.dex */
public final class Primitives {

    /* renamed from: a */
    public static final Map f54090a;

    /* renamed from: b */
    public static final Map f54091b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        m39802a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        m39802a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        m39802a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        m39802a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        m39802a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        m39802a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        m39802a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        m39802a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        m39802a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f54090a = Collections.unmodifiableMap(linkedHashMap);
        f54091b = Collections.unmodifiableMap(linkedHashMap2);
    }

    /* renamed from: a */
    public static void m39802a(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static Set<Class<?>> allPrimitiveTypes() {
        return f54090a.keySet();
    }

    public static Set<Class<?>> allWrapperTypes() {
        return f54091b.keySet();
    }

    public static boolean isWrapperType(Class<?> cls) {
        return f54091b.containsKey(Preconditions.checkNotNull(cls));
    }

    public static <T> Class<T> unwrap(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class) f54091b.get(cls);
        if (cls2 != null) {
            return cls2;
        }
        return cls;
    }

    public static <T> Class<T> wrap(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class) f54090a.get(cls);
        if (cls2 != null) {
            return cls2;
        }
        return cls;
    }
}