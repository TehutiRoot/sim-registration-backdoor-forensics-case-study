package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fasterxml.jackson.databind.introspect.a */
/* loaded from: classes3.dex */
public final class C6106a extends AbstractC12155ks {

    /* renamed from: a */
    public final TypeResolutionContext f43379a;

    /* renamed from: b */
    public AnnotatedConstructor f43380b;

    public C6106a(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext) {
        super(annotationIntrospector);
        this.f43379a = typeResolutionContext;
    }

    /* renamed from: i */
    public static AnnotatedClass.Creators m49406i(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, JavaType javaType, Class cls) {
        return new C6106a(annotationIntrospector, typeResolutionContext).m49410e(javaType, cls);
    }

    /* renamed from: m */
    public static boolean m49402m(Constructor constructor) {
        return !constructor.isSynthetic();
    }

    /* renamed from: c */
    public final List m49412c(JavaType javaType, Class cls) {
        ClassUtil.Ctor ctor;
        ArrayList arrayList;
        int i;
        List list;
        ClassUtil.Ctor[] constructors;
        ClassUtil.Ctor[] constructors2;
        if (!javaType.isEnumType()) {
            ctor = null;
            arrayList = null;
            for (ClassUtil.Ctor ctor2 : ClassUtil.getConstructors(javaType.getRawClass())) {
                if (m49402m(ctor2.getConstructor())) {
                    if (ctor2.getParamCount() == 0) {
                        ctor = ctor2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ctor2);
                    }
                }
            }
        } else {
            ctor = null;
            arrayList = null;
        }
        if (arrayList == null) {
            list = Collections.emptyList();
            if (ctor == null) {
                return list;
            }
            i = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(null);
            }
            i = size;
            list = arrayList2;
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (ClassUtil.Ctor ctor3 : ClassUtil.getConstructors(cls)) {
                if (ctor3.getParamCount() == 0) {
                    if (ctor != null) {
                        this.f43380b = m49405j(ctor, ctor3);
                        ctor = null;
                    }
                } else if (arrayList != null) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            memberKeyArr[i3] = new MemberKey(((ClassUtil.Ctor) arrayList.get(i3)).getConstructor());
                        }
                    }
                    MemberKey memberKey = new MemberKey(ctor3.getConstructor());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i) {
                            break;
                        } else if (memberKey.equals(memberKeyArr[i4])) {
                            list.set(i4, m49403l((ClassUtil.Ctor) arrayList.get(i4), ctor3));
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        if (ctor != null) {
            this.f43380b = m49405j(ctor, null);
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (((AnnotatedConstructor) list.get(i5)) == null) {
                list.set(i5, m49403l((ClassUtil.Ctor) arrayList.get(i5), null));
            }
        }
        return list;
    }

    /* renamed from: d */
    public final List m49411d(JavaType javaType, Class cls) {
        Method[] classMethods;
        Method[] declaredMethods;
        ArrayList arrayList = null;
        for (Method method : ClassUtil.getClassMethods(javaType.getRawClass())) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (Method method2 : ClassUtil.getDeclaredMethods(cls)) {
                if (Modifier.isStatic(method2.getModifiers())) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            memberKeyArr[i2] = new MemberKey((Method) arrayList.get(i2));
                        }
                    }
                    MemberKey memberKey = new MemberKey(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (memberKey.equals(memberKeyArr[i3])) {
                            arrayList2.set(i3, m49404k((Method) arrayList.get(i3), method2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList2.get(i4)) == null) {
                arrayList2.set(i4, m49404k((Method) arrayList.get(i4), null));
            }
        }
        return arrayList2;
    }

    /* renamed from: e */
    public AnnotatedClass.Creators m49410e(JavaType javaType, Class cls) {
        List m49412c = m49412c(javaType, cls);
        List m49411d = m49411d(javaType, cls);
        AnnotationIntrospector annotationIntrospector = this._intr;
        if (annotationIntrospector != null) {
            AnnotatedConstructor annotatedConstructor = this.f43380b;
            if (annotatedConstructor != null && annotationIntrospector.hasIgnoreMarker(annotatedConstructor)) {
                this.f43380b = null;
            }
            int size = m49412c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this._intr.hasIgnoreMarker((AnnotatedMember) m49412c.get(size))) {
                    m49412c.remove(size);
                }
            }
            int size2 = m49411d.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (this._intr.hasIgnoreMarker((AnnotatedMember) m49411d.get(size2))) {
                    m49411d.remove(size2);
                }
            }
        }
        return new AnnotatedClass.Creators(this.f43380b, m49412c, m49411d);
    }

    /* renamed from: f */
    public final AnnotationMap m49409f(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        AnnotationCollector collectAnnotations = collectAnnotations(ctor.getConstructor().getDeclaredAnnotations());
        if (ctor2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, ctor2.getConstructor().getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }

    /* renamed from: g */
    public final AnnotationMap m49408g(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector collectAnnotations = collectAnnotations(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, annotatedElement2.getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }

    /* renamed from: h */
    public final AnnotationMap[] m49407h(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector collectAnnotations = collectAnnotations(AnnotationCollector.emptyCollector(), annotationArr[i]);
            if (annotationArr2 != null) {
                collectAnnotations = collectAnnotations(collectAnnotations, annotationArr2[i]);
            }
            annotationMapArr[i] = collectAnnotations.asAnnotationMap();
        }
        return annotationMapArr;
    }

    /* renamed from: j */
    public AnnotatedConstructor m49405j(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        Annotation[][] parameterAnnotations;
        if (this._intr == null) {
            return new AnnotatedConstructor(this.f43379a, ctor.getConstructor(), AbstractC12155ks.m26891a(), AbstractC12155ks.NO_ANNOTATION_MAPS);
        }
        TypeResolutionContext typeResolutionContext = this.f43379a;
        Constructor<?> constructor = ctor.getConstructor();
        AnnotationMap m49409f = m49409f(ctor, ctor2);
        Annotation[][] parameterAnnotations2 = ctor.getConstructor().getParameterAnnotations();
        if (ctor2 == null) {
            parameterAnnotations = null;
        } else {
            parameterAnnotations = ctor2.getConstructor().getParameterAnnotations();
        }
        return new AnnotatedConstructor(typeResolutionContext, constructor, m49409f, m49407h(parameterAnnotations2, parameterAnnotations));
    }

    /* renamed from: k */
    public AnnotatedMethod m49404k(Method method, Method method2) {
        Annotation[][] parameterAnnotations;
        int length = method.getParameterTypes().length;
        if (this._intr == null) {
            return new AnnotatedMethod(this.f43379a, method, AbstractC12155ks.m26891a(), AbstractC12155ks.m26890b(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(this.f43379a, method, m49408g(method, method2), AbstractC12155ks.NO_ANNOTATION_MAPS);
        }
        TypeResolutionContext typeResolutionContext = this.f43379a;
        AnnotationMap m49408g = m49408g(method, method2);
        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
        if (method2 == null) {
            parameterAnnotations = null;
        } else {
            parameterAnnotations = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(typeResolutionContext, method, m49408g, m49407h(parameterAnnotations2, parameterAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.introspect.AnnotatedConstructor m49403l(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r9, com.fasterxml.jackson.databind.util.ClassUtil.Ctor r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            int r3 = r9.getParamCount()
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8._intr
            if (r4 != 0) goto L1f
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r0 = r8.f43379a
            java.lang.reflect.Constructor r9 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r1 = p000.AbstractC12155ks.m26891a()
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r2 = p000.AbstractC12155ks.m26890b(r3)
            r10.<init>(r0, r9, r1, r2)
            return r10
        L1f:
            if (r3 != 0) goto L33
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8.f43379a
            java.lang.reflect.Constructor r2 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.m49409f(r9, r10)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r10 = p000.AbstractC12155ks.NO_ANNOTATION_MAPS
            r0.<init>(r1, r2, r9, r10)
            return r0
        L33:
            java.lang.annotation.Annotation[][] r4 = r9.getParameterAnnotations()
            int r5 = r4.length
            r6 = 0
            if (r3 == r5) goto L9b
            java.lang.Class r5 = r9.getDeclaringClass()
            boolean r7 = r5.isEnum()
            if (r7 == 0) goto L57
            int r7 = r4.length
            int r7 = r7 + r1
            if (r3 != r7) goto L57
            int r5 = r4.length
            int r5 = r5 + r1
            java.lang.annotation.Annotation[][] r5 = new java.lang.annotation.Annotation[r5]
            int r7 = r4.length
            java.lang.System.arraycopy(r4, r2, r5, r1, r7)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r6 = r8.m49407h(r5, r6)
        L55:
            r4 = r5
            goto L72
        L57:
            boolean r5 = r5.isMemberClass()
            if (r5 == 0) goto L72
            int r5 = r4.length
            int r5 = r5 + r0
            if (r3 != r5) goto L72
            int r5 = r4.length
            int r5 = r5 + r0
            java.lang.annotation.Annotation[][] r5 = new java.lang.annotation.Annotation[r5]
            int r7 = r4.length
            java.lang.System.arraycopy(r4, r2, r5, r0, r7)
            java.lang.annotation.Annotation[] r4 = p000.AbstractC12155ks.NO_ANNOTATIONS
            r5[r2] = r4
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r6 = r8.m49407h(r5, r6)
            goto L55
        L72:
            if (r6 == 0) goto L75
            goto La6
        L75:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r9
            r5[r0] = r3
            r5[r1] = r4
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r5)
            r10.<init>(r9)
            throw r10
        L9b:
            if (r10 != 0) goto L9e
            goto La2
        L9e:
            java.lang.annotation.Annotation[][] r6 = r10.getParameterAnnotations()
        La2:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r6 = r8.m49407h(r4, r6)
        La6:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8.f43379a
            java.lang.reflect.Constructor r2 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.m49409f(r9, r10)
            r0.<init>(r1, r2, r9, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.C6106a.m49403l(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }
}