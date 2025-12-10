package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

/* renamed from: Nz */
/* loaded from: classes6.dex */
public final class C0971Nz {

    /* renamed from: a */
    public final Class f4322a;

    /* renamed from: b */
    public final Constructor f4323b;

    /* renamed from: c */
    public final Method f4324c;

    /* renamed from: d */
    public final List f4325d;

    /* renamed from: e */
    public final Integer f4326e;

    /* renamed from: f */
    public final List f4327f;

    /* renamed from: g */
    public final List f4328g;

    public C0971Nz(Class cls, Constructor constructor) {
        this(cls, constructor, null);
    }

    /* renamed from: c */
    public static CodecConfigurationException m67167c(Class cls, boolean z, String str) {
        String str2;
        if (z) {
            str2 = "constructor";
        } else {
            str2 = FirebaseAnalytics.Param.METHOD;
        }
        return new CodecConfigurationException(String.format("Invalid @BsonCreator %s in %s. %s", str2, cls.getSimpleName(), str));
    }

    /* renamed from: a */
    public final void m67169a() {
        if (this.f4323b == null && this.f4324c == null) {
            throw new CodecConfigurationException(String.format("Cannot find a public constructor for '%s'.", this.f4322a.getSimpleName()));
        }
    }

    /* renamed from: b */
    public CodecConfigurationException m67168b(Class cls, String str) {
        boolean z;
        if (this.f4323b != null) {
            z = true;
        } else {
            z = false;
        }
        return m67167c(cls, z, str);
    }

    /* renamed from: d */
    public Integer m67166d() {
        return this.f4326e;
    }

    /* renamed from: e */
    public Object m67165e() {
        m67169a();
        try {
            Constructor constructor = this.f4323b;
            if (constructor != null) {
                return constructor.newInstance(null);
            }
            return this.f4324c.invoke(this.f4322a, null);
        } catch (Exception e) {
            throw new CodecConfigurationException(e.getMessage(), e);
        }
    }

    /* renamed from: f */
    public Object m67164f(Object[] objArr) {
        m67169a();
        try {
            Constructor constructor = this.f4323b;
            if (constructor != null) {
                return constructor.newInstance(objArr);
            }
            return this.f4324c.invoke(this.f4322a, objArr);
        } catch (Exception e) {
            throw new CodecConfigurationException(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    public List m67163g() {
        return this.f4328g;
    }

    /* renamed from: h */
    public List m67162h() {
        return this.f4327f;
    }

    /* renamed from: i */
    public List m67161i() {
        return this.f4325d;
    }

    /* renamed from: j */
    public Class m67160j() {
        return this.f4322a;
    }

    public C0971Nz(Class cls, Method method) {
        this(cls, null, method);
    }

    public C0971Nz(Class cls, Constructor constructor, Method method) {
        Annotation[][] parameterAnnotations;
        this.f4325d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f4327f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f4328g = arrayList2;
        this.f4322a = cls;
        this.f4323b = constructor;
        this.f4324c = method;
        Integer num = null;
        if (constructor != null || method != null) {
            Class<?>[] parameterTypes = constructor != null ? constructor.getParameterTypes() : method.getParameterTypes();
            Type[] genericParameterTypes = constructor != null ? constructor.getGenericParameterTypes() : method.getGenericParameterTypes();
            arrayList.addAll(Arrays.asList(parameterTypes));
            arrayList2.addAll(Arrays.asList(genericParameterTypes));
            if (constructor != null) {
                parameterAnnotations = constructor.getParameterAnnotations();
            } else {
                parameterAnnotations = method.getParameterAnnotations();
            }
            Integer num2 = null;
            for (int i = 0; i < parameterAnnotations.length; i++) {
                Annotation[] annotationArr = parameterAnnotations[i];
                int length = annotationArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Annotation annotation = annotationArr[i2];
                        if (annotation.annotationType().equals(BsonProperty.class)) {
                            this.f4325d.add((BsonProperty) annotation);
                            break;
                        } else if (annotation.annotationType().equals(BsonId.class)) {
                            this.f4325d.add(null);
                            num2 = Integer.valueOf(i);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            num = num2;
        }
        this.f4326e = num;
    }
}