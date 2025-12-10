package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AnnotatedMethodCollector extends AbstractC12179ks {

    /* renamed from: a */
    public final ClassIntrospector.MixInResolver f43338a;

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector$a */
    /* loaded from: classes3.dex */
    public static final class C6099a {

        /* renamed from: a */
        public TypeResolutionContext f43339a;

        /* renamed from: b */
        public Method f43340b;

        /* renamed from: c */
        public AnnotationCollector f43341c;

        public C6099a(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.f43339a = typeResolutionContext;
            this.f43340b = method;
            this.f43341c = annotationCollector;
        }

        /* renamed from: a */
        public AnnotatedMethod m49442a() {
            Method method = this.f43340b;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.f43339a, method, this.f43341c.asAnnotationMap(), null);
        }
    }

    public AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this.f43338a = annotationIntrospector == null ? null : mixInResolver;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        return new AnnotatedMethodCollector(annotationIntrospector, mixInResolver).m49443e(typeFactory, typeResolutionContext, javaType, list, cls);
    }

    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, C6099a> map, Class<?> cls2) {
        Method[] declaredMethods;
        if (this._intr == null) {
            return;
        }
        for (Class<?> cls3 : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
            for (Method method : ClassUtil.getDeclaredMethods(cls3)) {
                if (m49444d(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    C6099a c6099a = map.get(memberKey);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (c6099a == null) {
                        map.put(memberKey, new C6099a(typeResolutionContext, null, collectAnnotations(declaredAnnotations)));
                    } else {
                        c6099a.f43341c = collectDefaultAnnotations(c6099a.f43341c, declaredAnnotations);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m49445c(TypeResolutionContext typeResolutionContext, Class cls, Map map, Class cls2) {
        Method[] classMethods;
        AnnotationCollector collectAnnotations;
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : ClassUtil.getClassMethods(cls)) {
            if (m49444d(method)) {
                MemberKey memberKey = new MemberKey(method);
                C6099a c6099a = (C6099a) map.get(memberKey);
                if (c6099a == null) {
                    if (this._intr == null) {
                        collectAnnotations = AnnotationCollector.emptyCollector();
                    } else {
                        collectAnnotations = collectAnnotations(method.getDeclaredAnnotations());
                    }
                    map.put(memberKey, new C6099a(typeResolutionContext, method, collectAnnotations));
                } else {
                    if (this._intr != null) {
                        c6099a.f43341c = collectDefaultAnnotations(c6099a.f43341c, method.getDeclaredAnnotations());
                    }
                    Method method2 = c6099a.f43340b;
                    if (method2 == null) {
                        c6099a.f43340b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        c6099a.f43340b = method;
                        c6099a.f43339a = typeResolutionContext;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean m49444d(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public AnnotatedMethodMap m49443e(TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, List list, Class cls) {
        Class<?> findMixInClassFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m49445c(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JavaType javaType2 = (JavaType) it.next();
            ClassIntrospector.MixInResolver mixInResolver = this.f43338a;
            if (mixInResolver == null) {
                findMixInClassFor = null;
            } else {
                findMixInClassFor = mixInResolver.findMixInClassFor(javaType2.getRawClass());
            }
            m49445c(new TypeResolutionContext.Basic(typeFactory, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, findMixInClassFor);
        }
        if (linkedHashMap.isEmpty()) {
            return new AnnotatedMethodMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AnnotatedMethod m49442a = ((C6099a) entry.getValue()).m49442a();
            if (m49442a != null) {
                linkedHashMap2.put(entry.getKey(), m49442a);
            }
        }
        return new AnnotatedMethodMap(linkedHashMap2);
    }
}
