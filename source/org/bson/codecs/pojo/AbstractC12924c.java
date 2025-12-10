package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.bson.assertions.Assertions;
import org.bson.codecs.pojo.AbstractC12926e;
import org.bson.codecs.pojo.C12928f;
import org.bson.codecs.pojo.TypeData;

/* renamed from: org.bson.codecs.pojo.c */
/* loaded from: classes6.dex */
public abstract class AbstractC12924c {
    /* renamed from: a */
    public static void m24234a(C17686Go1 c17686Go1, Map map, TypeData typeData, List list, Type type) {
        C12928f m24227h = m24227h(list, type);
        map.put(c17686Go1.m68171h(), m24227h);
        c17686Go1.m68157v(m24227h, typeData);
    }

    /* renamed from: b */
    public static void m24233b(ClassModelBuilder classModelBuilder, Class cls) {
        Constructor<?>[] declaredConstructors;
        Annotation[] declaredAnnotations;
        classModelBuilder.type((Class) Assertions.notNull("clazz", cls));
        ArrayList arrayList = new ArrayList();
        TreeSet<String> treeSet = new TreeSet();
        Map hashMap = new HashMap();
        String simpleName = cls.getSimpleName();
        HashMap hashMap2 = new HashMap();
        Class cls2 = cls;
        TypeData typeData = null;
        while (!cls2.isEnum() && cls2.getSuperclass() != null) {
            arrayList.addAll(Arrays.asList(cls2.getDeclaredAnnotations()));
            ArrayList arrayList2 = new ArrayList();
            for (TypeVariable typeVariable : cls2.getTypeParameters()) {
                arrayList2.add(typeVariable.getName());
            }
            AbstractC12926e.C12927a m24208a = AbstractC12926e.m24208a(cls2);
            for (Method method : m24208a.m24203b()) {
                String m24205d = AbstractC12926e.m24205d(method);
                treeSet.add(m24205d);
                ArrayList arrayList3 = arrayList2;
                Class cls3 = cls2;
                C17686Go1 m24229f = m24229f(m24205d, simpleName, hashMap2, TypeData.m24245g(method), hashMap, typeData, arrayList2, m24231d(method));
                if (m24229f.m68169j() == null) {
                    m24229f.m68158u(method);
                    for (Annotation annotation : method.getDeclaredAnnotations()) {
                        m24229f.m68177b(annotation);
                    }
                }
                arrayList2 = arrayList3;
                cls2 = cls3;
            }
            ArrayList arrayList4 = arrayList2;
            Class cls4 = cls2;
            Iterator it = m24208a.m24204a().iterator();
            while (it.hasNext()) {
                Method method2 = (Method) it.next();
                String m24205d2 = AbstractC12926e.m24205d(method2);
                treeSet.add(m24205d2);
                C17686Go1 c17686Go1 = (C17686Go1) hashMap2.get(m24205d2);
                if (c17686Go1 == null || c17686Go1.m68172g() == null) {
                    Iterator it2 = it;
                    C17686Go1 m24229f2 = m24229f(m24205d2, simpleName, hashMap2, TypeData.m24245g(method2), hashMap, typeData, arrayList4, m24231d(method2));
                    if (m24229f2.m68172g() == null) {
                        m24229f2.m68159t(method2);
                        for (Annotation annotation2 : method2.getDeclaredAnnotations()) {
                            m24229f2.m68178a(annotation2);
                        }
                    }
                    it = it2;
                }
            }
            Field[] declaredFields = cls4.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                treeSet.add(field.getName());
                String str = simpleName;
                int i2 = i;
                int i3 = length;
                C17686Go1 m24230e = m24230e(field.getName(), simpleName, hashMap2, TypeData.m24246f(field), hashMap, typeData, arrayList4, field.getGenericType());
                if (m24230e != null && m24230e.m68173f() == null) {
                    m24230e.m68176c(field);
                    for (Annotation annotation3 : field.getDeclaredAnnotations()) {
                        m24230e.m68178a(annotation3);
                        m24230e.m68177b(annotation3);
                    }
                }
                i = i2 + 1;
                simpleName = str;
                length = i3;
            }
            typeData = TypeData.m24244h(cls4.getGenericSuperclass(), cls4);
            cls2 = cls4.getSuperclass();
        }
        Class cls5 = cls2;
        if (cls5.isInterface()) {
            arrayList.addAll(Arrays.asList(cls5.getDeclaredAnnotations()));
        }
        for (String str2 : treeSet) {
            C17686Go1 c17686Go12 = (C17686Go1) hashMap2.get(str2);
            if (c17686Go12.m68162q() || c17686Go12.m68164o()) {
                classModelBuilder.m24269a(m24232c(c17686Go12));
            }
        }
        Collections.reverse(arrayList);
        classModelBuilder.annotations(arrayList);
        classModelBuilder.m24267c(hashMap);
        Constructor<?> constructor = null;
        for (Constructor<?> constructor2 : cls.getDeclaredConstructors()) {
            if (constructor2.getParameterTypes().length == 0 && (Modifier.isPublic(constructor2.getModifiers()) || Modifier.isProtected(constructor2.getModifiers()))) {
                constructor2.setAccessible(true);
                constructor = constructor2;
            }
        }
        classModelBuilder.instanceCreatorFactory(new C18873Ze0(new C0982Nz(cls, constructor)));
    }

    /* renamed from: c */
    public static PropertyModelBuilder m24232c(C17686Go1 c17686Go1) {
        PropertyModelBuilder m24253c = PropertyModel.builder().m24254b(c17686Go1.m68171h()).readName(c17686Go1.m68171h()).writeName(c17686Go1.m68171h()).m24252d(c17686Go1.m68168k()).readAnnotations(c17686Go1.m68170i()).writeAnnotations(c17686Go1.m68165n()).propertySerialization(new C17750Ho1()).propertyAccessor(new C17494Do1(c17686Go1)).m24253c(c17686Go1.m68174e());
        if (c17686Go1.m68166m() != null) {
            m24225j(m24253c, c17686Go1);
        }
        return m24253c;
    }

    /* renamed from: d */
    public static Type m24231d(Method method) {
        if (AbstractC12926e.m24207b(method)) {
            return method.getGenericReturnType();
        }
        return method.getGenericParameterTypes()[0];
    }

    /* renamed from: e */
    public static C17686Go1 m24230e(String str, String str2, Map map, TypeData typeData, Map map2, TypeData typeData2, List list, Type type) {
        C17686Go1 m24228g = m24228g(str, str2, map, typeData);
        if (!m24228g.m68168k().getType().isAssignableFrom(typeData.getType())) {
            return null;
        }
        m24234a(m24228g, map2, typeData2, list, type);
        return m24228g;
    }

    /* renamed from: f */
    public static C17686Go1 m24229f(String str, String str2, Map map, TypeData typeData, Map map2, TypeData typeData2, List list, Type type) {
        C17686Go1 m24228g = m24228g(str, str2, map, typeData);
        if (!m24226i(m24228g.m68168k().getType(), typeData.getType())) {
            m24228g.m68160s(String.format("Property '%s' in %s, has differing data types: %s and %s.", str, str2, m24228g.m68168k(), typeData));
        }
        m24234a(m24228g, map2, typeData2, list, type);
        return m24228g;
    }

    /* renamed from: g */
    public static C17686Go1 m24228g(String str, String str2, Map map, TypeData typeData) {
        C17686Go1 c17686Go1 = (C17686Go1) map.get(str);
        if (c17686Go1 == null) {
            C17686Go1 c17686Go12 = new C17686Go1(str, str2, typeData);
            map.put(str, c17686Go12);
            return c17686Go12;
        }
        return c17686Go1;
    }

    /* renamed from: h */
    public static C12928f m24227h(List list, Type type) {
        int indexOf = list.indexOf(type.toString());
        C12928f.C12930b m24202a = C12928f.m24202a();
        if (indexOf != -1) {
            m24202a.m24199a(indexOf);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            for (int i = 0; i < parameterizedType.getActualTypeArguments().length; i++) {
                int indexOf2 = list.indexOf(parameterizedType.getActualTypeArguments()[i].toString());
                if (indexOf2 != -1) {
                    m24202a.m24198b(i, indexOf2);
                }
            }
        }
        return m24202a.m24197c();
    }

    /* renamed from: i */
    public static boolean m24226i(Class cls, Class cls2) {
        if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static void m24225j(PropertyModelBuilder propertyModelBuilder, C17686Go1 c17686Go1) {
        TypeData build;
        if (c17686Go1.m68167l().m24200c() && !c17686Go1.m68166m().isEmpty()) {
            Map m24201b = c17686Go1.m68167l().m24201b();
            Integer num = (Integer) m24201b.get(-1);
            if (num != null) {
                build = (TypeData) c17686Go1.m68166m().get(num.intValue());
            } else {
                TypeData.Builder m24250b = TypeData.m24250b(propertyModelBuilder.m24255a().getType());
                ArrayList arrayList = new ArrayList(propertyModelBuilder.m24255a().getTypeParameters());
                for (int i = 0; i < arrayList.size(); i++) {
                    for (Map.Entry entry : m24201b.entrySet()) {
                        if (((Integer) entry.getKey()).equals(Integer.valueOf(i))) {
                            arrayList.set(i, c17686Go1.m68166m().get(((Integer) entry.getValue()).intValue()));
                        }
                    }
                }
                m24250b.addTypeParameters(arrayList);
                build = m24250b.build();
            }
            propertyModelBuilder.m24252d(build);
        }
    }

    /* renamed from: k */
    public static Object m24224k(String str, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.format("%s cannot be null", str));
    }
}
