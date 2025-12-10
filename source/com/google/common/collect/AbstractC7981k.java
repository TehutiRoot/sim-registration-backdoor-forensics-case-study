package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.k */
/* loaded from: classes4.dex */
public abstract class AbstractC7981k {
    /* renamed from: a */
    public static Object[] m40231a(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    /* renamed from: b */
    public static Class m40230b(Enum r0) {
        return r0.getDeclaringClass();
    }

    /* renamed from: c */
    public static Object[] m40229c(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: d */
    public static Map m40228d(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    /* renamed from: e */
    public static Set m40227e(int i) {
        return CompactHashSet.createWithExpectedSize(i);
    }

    /* renamed from: f */
    public static Map m40226f(int i) {
        return CompactLinkedHashMap.createWithExpectedSize(i);
    }

    /* renamed from: g */
    public static Set m40225g(int i) {
        return CompactLinkedHashSet.createWithExpectedSize(i);
    }

    /* renamed from: h */
    public static Map m40224h() {
        return CompactHashMap.create();
    }

    /* renamed from: i */
    public static Map m40223i(int i) {
        return Maps.newLinkedHashMapWithExpectedSize(i);
    }

    /* renamed from: j */
    public static MapMaker m40222j(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }
}
