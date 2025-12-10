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
public class AnnotatedFieldCollector extends AbstractC12155ks {

    /* renamed from: a */
    public final TypeFactory f43345a;

    /* renamed from: b */
    public final ClassIntrospector.MixInResolver f43346b;

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector$a */
    /* loaded from: classes3.dex */
    public static final class C6087a {

        /* renamed from: a */
        public final TypeResolutionContext f43347a;

        /* renamed from: b */
        public final Field f43348b;

        /* renamed from: c */
        public AnnotationCollector f43349c = AnnotationCollector.emptyCollector();

        public C6087a(TypeResolutionContext typeResolutionContext, Field field) {
            this.f43347a = typeResolutionContext;
            this.f43348b = field;
        }

        /* renamed from: a */
        public AnnotatedField m49443a() {
            return new AnnotatedField(this.f43347a, this.f43348b, this.f43349c.asAnnotationMap());
        }
    }

    public AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this.f43345a = typeFactory;
        this.f43346b = annotationIntrospector == null ? null : mixInResolver;
    }

    public static List<AnnotatedField> collectFields(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType) {
        return new AnnotatedFieldCollector(annotationIntrospector, typeFactory, mixInResolver).m49444f(typeResolutionContext, javaType);
    }

    /* renamed from: c */
    public final void m49447c(Class cls, Class cls2, Map map) {
        Field[] declaredFields;
        C6087a c6087a;
        for (Class<?> cls3 : ClassUtil.findSuperClasses(cls, cls2, true)) {
            for (Field field : ClassUtil.getDeclaredFields(cls3)) {
                if (m49445e(field) && (c6087a = (C6087a) map.get(field.getName())) != null) {
                    c6087a.f43349c = collectAnnotations(c6087a.f43349c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    /* renamed from: d */
    public final Map m49446d(TypeResolutionContext typeResolutionContext, JavaType javaType, Map map) {
        Field[] declaredFields;
        Class<?> findMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map m49446d = m49446d(new TypeResolutionContext.Basic(this.f43345a, superClass.getBindings()), superClass, map);
        for (Field field : ClassUtil.getDeclaredFields(rawClass)) {
            if (m49445e(field)) {
                if (m49446d == null) {
                    m49446d = new LinkedHashMap();
                }
                C6087a c6087a = new C6087a(typeResolutionContext, field);
                if (this._intr != null) {
                    c6087a.f43349c = collectAnnotations(c6087a.f43349c, field.getDeclaredAnnotations());
                }
                m49446d.put(field.getName(), c6087a);
            }
        }
        ClassIntrospector.MixInResolver mixInResolver = this.f43346b;
        if (mixInResolver != null && (findMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) != null) {
            m49447c(findMixInClassFor, rawClass, m49446d);
        }
        return m49446d;
    }

    /* renamed from: e */
    public final boolean m49445e(Field field) {
        if (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public List m49444f(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        Map m49446d = m49446d(typeResolutionContext, javaType, null);
        if (m49446d == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(m49446d.size());
        for (C6087a c6087a : m49446d.values()) {
            arrayList.add(c6087a.m49443a());
        }
        return arrayList;
    }
}