package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AnnotatedFieldCollector extends AbstractC12179ks {

    /* renamed from: a */
    public final TypeFactory f43333a;

    /* renamed from: b */
    public final ClassIntrospector.MixInResolver f43334b;

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector$a */
    /* loaded from: classes3.dex */
    public static final class C6098a {

        /* renamed from: a */
        public final TypeResolutionContext f43335a;

        /* renamed from: b */
        public final Field f43336b;

        /* renamed from: c */
        public AnnotationCollector f43337c = AnnotationCollector.emptyCollector();

        public C6098a(TypeResolutionContext typeResolutionContext, Field field) {
            this.f43335a = typeResolutionContext;
            this.f43336b = field;
        }

        /* renamed from: a */
        public AnnotatedField m49446a() {
            return new AnnotatedField(this.f43335a, this.f43336b, this.f43337c.asAnnotationMap());
        }
    }

    public AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this.f43333a = typeFactory;
        this.f43334b = annotationIntrospector == null ? null : mixInResolver;
    }

    public static List<AnnotatedField> collectFields(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType) {
        return new AnnotatedFieldCollector(annotationIntrospector, typeFactory, mixInResolver).m49447f(typeResolutionContext, javaType);
    }

    /* renamed from: c */
    public final void m49450c(Class cls, Class cls2, Map map) {
        Field[] declaredFields;
        C6098a c6098a;
        for (Class<?> cls3 : ClassUtil.findSuperClasses(cls, cls2, true)) {
            for (Field field : ClassUtil.getDeclaredFields(cls3)) {
                if (m49448e(field) && (c6098a = (C6098a) map.get(field.getName())) != null) {
                    c6098a.f43337c = collectAnnotations(c6098a.f43337c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    /* renamed from: d */
    public final Map m49449d(TypeResolutionContext typeResolutionContext, JavaType javaType, Map map) {
        Field[] declaredFields;
        Class<?> findMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map m49449d = m49449d(new TypeResolutionContext.Basic(this.f43333a, superClass.getBindings()), superClass, map);
        for (Field field : ClassUtil.getDeclaredFields(rawClass)) {
            if (m49448e(field)) {
                if (m49449d == null) {
                    m49449d = new LinkedHashMap();
                }
                C6098a c6098a = new C6098a(typeResolutionContext, field);
                if (this._intr != null) {
                    c6098a.f43337c = collectAnnotations(c6098a.f43337c, field.getDeclaredAnnotations());
                }
                m49449d.put(field.getName(), c6098a);
            }
        }
        ClassIntrospector.MixInResolver mixInResolver = this.f43334b;
        if (mixInResolver != null && (findMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) != null) {
            m49450c(findMixInClassFor, rawClass, m49449d);
        }
        return m49449d;
    }

    /* renamed from: e */
    public final boolean m49448e(Field field) {
        if (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public List m49447f(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        Map m49449d = m49449d(typeResolutionContext, javaType, null);
        if (m49449d == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(m49449d.size());
        for (C6098a c6098a : m49449d.values()) {
            arrayList.add(c6098a.m49446a());
        }
        return arrayList;
    }
}
