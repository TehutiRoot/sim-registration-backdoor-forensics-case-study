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
    public static final Annotations f43325h = AnnotationCollector.emptyAnnotations();

    /* renamed from: a */
    public final MapperConfig f43326a;

    /* renamed from: b */
    public final AnnotationIntrospector f43327b;

    /* renamed from: c */
    public final ClassIntrospector.MixInResolver f43328c;

    /* renamed from: d */
    public final TypeBindings f43329d;

    /* renamed from: e */
    public final JavaType f43330e;

    /* renamed from: f */
    public final Class f43331f;

    /* renamed from: g */
    public final Class f43332g;

    public AnnotatedClassResolver(MapperConfig mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        this.f43326a = mapperConfig;
        this.f43330e = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this.f43331f = rawClass;
        this.f43328c = mixInResolver;
        this.f43329d = javaType.getBindings();
        this.f43327b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.f43332g = mapperConfig.findMixInClassFor(rawClass);
    }

    /* renamed from: d */
    public static AnnotatedClass m49456d(MapperConfig mapperConfig, Class cls) {
        return new AnnotatedClass(cls);
    }

    /* renamed from: e */
    public static AnnotatedClass m49455e(Class cls) {
        return new AnnotatedClass(cls);
    }

    /* renamed from: i */
    public static boolean m49451i(MapperConfig mapperConfig, Class cls) {
        if (mapperConfig != null && mapperConfig.findMixInClassFor(cls) != null) {
            return false;
        }
        return true;
    }

    public static AnnotatedClass resolve(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && m49451i(mapperConfig, javaType.getRawClass())) {
            return m49456d(mapperConfig, javaType.getRawClass());
        }
        return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).m49453g();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls) {
        return resolveWithoutSuperTypes(mapperConfig, cls, mapperConfig);
    }

    /* renamed from: a */
    public final AnnotationCollector m49459a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.isPresent(annotation)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation);
                    if (this.f43327b.isAnnotationBundle(annotation)) {
                        annotationCollector = m49457c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: b */
    public final AnnotationCollector m49458b(AnnotationCollector annotationCollector, Class cls, Class cls2) {
        if (cls2 != null) {
            annotationCollector = m49459a(annotationCollector, ClassUtil.findClassAnnotations(cls2));
            for (Class<?> cls3 : ClassUtil.findSuperClasses(cls2, cls, false)) {
                annotationCollector = m49459a(annotationCollector, ClassUtil.findClassAnnotations(cls3));
            }
        }
        return annotationCollector;
    }

    /* renamed from: c */
    public final AnnotationCollector m49457c(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] findClassAnnotations;
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this.f43327b.isAnnotationBundle(annotation2)) {
                    annotationCollector = m49457c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: f */
    public final Annotations m49454f(List list) {
        if (this.f43327b == null) {
            return f43325h;
        }
        AnnotationCollector emptyCollector = AnnotationCollector.emptyCollector();
        Class cls = this.f43332g;
        if (cls != null) {
            emptyCollector = m49458b(emptyCollector, this.f43331f, cls);
        }
        AnnotationCollector m49459a = m49459a(emptyCollector, ClassUtil.findClassAnnotations(this.f43331f));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JavaType javaType = (JavaType) it.next();
            if (this.f43328c != null) {
                Class<?> rawClass = javaType.getRawClass();
                m49459a = m49458b(m49459a, rawClass, this.f43328c.findMixInClassFor(rawClass));
            }
            m49459a = m49459a(m49459a, ClassUtil.findClassAnnotations(javaType.getRawClass()));
        }
        ClassIntrospector.MixInResolver mixInResolver = this.f43328c;
        if (mixInResolver != null) {
            m49459a = m49458b(m49459a, Object.class, mixInResolver.findMixInClassFor(Object.class));
        }
        return m49459a.asAnnotations();
    }

    /* renamed from: g */
    public AnnotatedClass m49453g() {
        List<JavaType> findSuperTypes = ClassUtil.findSuperTypes(this.f43330e, (Class<?>) null, false);
        return new AnnotatedClass(this.f43330e, this.f43331f, findSuperTypes, this.f43332g, m49454f(findSuperTypes), this.f43329d, this.f43327b, this.f43328c, this.f43326a.getTypeFactory());
    }

    /* renamed from: h */
    public AnnotatedClass m49452h() {
        List emptyList = Collections.emptyList();
        Class cls = this.f43331f;
        Class cls2 = this.f43332g;
        Annotations m49454f = m49454f(emptyList);
        TypeBindings typeBindings = this.f43329d;
        AnnotationIntrospector annotationIntrospector = this.f43327b;
        MapperConfig mapperConfig = this.f43326a;
        return new AnnotatedClass(null, cls, emptyList, cls2, m49454f, typeBindings, annotationIntrospector, mapperConfig, mapperConfig.getTypeFactory());
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && m49451i(mapperConfig, javaType.getRawClass())) {
            return m49456d(mapperConfig, javaType.getRawClass());
        }
        return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).m49452h();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        if (cls.isArray() && m49451i(mapperConfig, cls)) {
            return m49456d(mapperConfig, cls);
        }
        return new AnnotatedClassResolver(mapperConfig, cls, mixInResolver).m49452h();
    }

    public AnnotatedClassResolver(MapperConfig mapperConfig, Class cls, ClassIntrospector.MixInResolver mixInResolver) {
        this.f43326a = mapperConfig;
        this.f43330e = null;
        this.f43331f = cls;
        this.f43328c = mixInResolver;
        this.f43329d = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this.f43327b = null;
            this.f43332g = null;
            return;
        }
        this.f43327b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.f43332g = mapperConfig.findMixInClassFor(cls);
    }
}
