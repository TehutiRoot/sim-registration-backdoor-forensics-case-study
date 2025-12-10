package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AnnotatedClassResolver {

    /* renamed from: h */
    public static final Annotations f43337h = AnnotationCollector.emptyAnnotations();

    /* renamed from: a */
    public final MapperConfig f43338a;

    /* renamed from: b */
    public final AnnotationIntrospector f43339b;

    /* renamed from: c */
    public final ClassIntrospector.MixInResolver f43340c;

    /* renamed from: d */
    public final TypeBindings f43341d;

    /* renamed from: e */
    public final JavaType f43342e;

    /* renamed from: f */
    public final Class f43343f;

    /* renamed from: g */
    public final Class f43344g;

    public AnnotatedClassResolver(MapperConfig mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        this.f43338a = mapperConfig;
        this.f43342e = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this.f43343f = rawClass;
        this.f43340c = mixInResolver;
        this.f43341d = javaType.getBindings();
        this.f43339b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.f43344g = mapperConfig.findMixInClassFor(rawClass);
    }

    /* renamed from: d */
    public static AnnotatedClass m49453d(MapperConfig mapperConfig, Class cls) {
        return new AnnotatedClass(cls);
    }

    /* renamed from: e */
    public static AnnotatedClass m49452e(Class cls) {
        return new AnnotatedClass(cls);
    }

    /* renamed from: i */
    public static boolean m49448i(MapperConfig mapperConfig, Class cls) {
        if (mapperConfig != null && mapperConfig.findMixInClassFor(cls) != null) {
            return false;
        }
        return true;
    }

    public static AnnotatedClass resolve(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && m49448i(mapperConfig, javaType.getRawClass())) {
            return m49453d(mapperConfig, javaType.getRawClass());
        }
        return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).m49450g();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls) {
        return resolveWithoutSuperTypes(mapperConfig, cls, mapperConfig);
    }

    /* renamed from: a */
    public final AnnotationCollector m49456a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.isPresent(annotation)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation);
                    if (this.f43339b.isAnnotationBundle(annotation)) {
                        annotationCollector = m49454c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: b */
    public final AnnotationCollector m49455b(AnnotationCollector annotationCollector, Class cls, Class cls2) {
        if (cls2 != null) {
            annotationCollector = m49456a(annotationCollector, ClassUtil.findClassAnnotations(cls2));
            for (Class<?> cls3 : ClassUtil.findSuperClasses(cls2, cls, false)) {
                annotationCollector = m49456a(annotationCollector, ClassUtil.findClassAnnotations(cls3));
            }
        }
        return annotationCollector;
    }

    /* renamed from: c */
    public final AnnotationCollector m49454c(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] findClassAnnotations;
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this.f43339b.isAnnotationBundle(annotation2)) {
                    annotationCollector = m49454c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: f */
    public final Annotations m49451f(List list) {
        if (this.f43339b == null) {
            return f43337h;
        }
        AnnotationCollector emptyCollector = AnnotationCollector.emptyCollector();
        Class cls = this.f43344g;
        if (cls != null) {
            emptyCollector = m49455b(emptyCollector, this.f43343f, cls);
        }
        AnnotationCollector m49456a = m49456a(emptyCollector, ClassUtil.findClassAnnotations(this.f43343f));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JavaType javaType = (JavaType) it.next();
            if (this.f43340c != null) {
                Class<?> rawClass = javaType.getRawClass();
                m49456a = m49455b(m49456a, rawClass, this.f43340c.findMixInClassFor(rawClass));
            }
            m49456a = m49456a(m49456a, ClassUtil.findClassAnnotations(javaType.getRawClass()));
        }
        ClassIntrospector.MixInResolver mixInResolver = this.f43340c;
        if (mixInResolver != null) {
            m49456a = m49455b(m49456a, Object.class, mixInResolver.findMixInClassFor(Object.class));
        }
        return m49456a.asAnnotations();
    }

    /* renamed from: g */
    public AnnotatedClass m49450g() {
        List<JavaType> findSuperTypes = ClassUtil.findSuperTypes(this.f43342e, (Class<?>) null, false);
        return new AnnotatedClass(this.f43342e, this.f43343f, findSuperTypes, this.f43344g, m49451f(findSuperTypes), this.f43341d, this.f43339b, this.f43340c, this.f43338a.getTypeFactory());
    }

    /* renamed from: h */
    public AnnotatedClass m49449h() {
        List emptyList = Collections.emptyList();
        Class cls = this.f43343f;
        Class cls2 = this.f43344g;
        Annotations m49451f = m49451f(emptyList);
        TypeBindings typeBindings = this.f43341d;
        AnnotationIntrospector annotationIntrospector = this.f43339b;
        MapperConfig mapperConfig = this.f43338a;
        return new AnnotatedClass(null, cls, emptyList, cls2, m49451f, typeBindings, annotationIntrospector, mapperConfig, mapperConfig.getTypeFactory());
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && m49448i(mapperConfig, javaType.getRawClass())) {
            return m49453d(mapperConfig, javaType.getRawClass());
        }
        return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).m49449h();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        if (cls.isArray() && m49448i(mapperConfig, cls)) {
            return m49453d(mapperConfig, cls);
        }
        return new AnnotatedClassResolver(mapperConfig, cls, mixInResolver).m49449h();
    }

    public AnnotatedClassResolver(MapperConfig mapperConfig, Class cls, ClassIntrospector.MixInResolver mixInResolver) {
        this.f43338a = mapperConfig;
        this.f43342e = null;
        this.f43343f = cls;
        this.f43340c = mixInResolver;
        this.f43341d = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this.f43339b = null;
            this.f43344g = null;
            return;
        }
        this.f43339b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.f43344g = mapperConfig.findMixInClassFor(cls);
    }
}