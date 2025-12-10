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
public final class C0982Nz {

    /* renamed from: a */
    public final Class f4257a;

    /* renamed from: b */
    public final Constructor f4258b;

    /* renamed from: c */
    public final Method f4259c;

    /* renamed from: d */
    public final List f4260d;

    /* renamed from: e */
    public final Integer f4261e;

    /* renamed from: f */
    public final List f4262f;

    /* renamed from: g */
    public final List f4263g;

    public C0982Nz(Class cls, Constructor constructor) {
        this(cls, constructor, null);
    }

    /* renamed from: c */
    public static CodecConfigurationException m67149c(Class cls, boolean z, String str) {
        String str2;
        if (z) {
            str2 = "constructor";
        } else {
            str2 = FirebaseAnalytics.Param.METHOD;
        }
        return new CodecConfigurationException(String.format("Invalid @BsonCreator %s in %s. %s", str2, cls.getSimpleName(), str));
    }

    /* renamed from: a */
    public final void m67151a() {
        if (this.f4258b == null && this.f4259c == null) {
            throw new CodecConfigurationException(String.format("Cannot find a public constructor for '%s'.", this.f4257a.getSimpleName()));
        }
    }

    /* renamed from: b */
    public CodecConfigurationException m67150b(Class cls, String str) {
        boolean z;
        if (this.f4258b != null) {
            z = true;
        } else {
            z = false;
        }
        return m67149c(cls, z, str);
    }

    /* renamed from: d */
    public Integer m67148d() {
        return this.f4261e;
    }

    /* renamed from: e */
    public Object m67147e() {
        m67151a();
        try {
            Constructor constructor = this.f4258b;
            if (constructor != null) {
                return constructor.newInstance(null);
            }
            return this.f4259c.invoke(this.f4257a, null);
        } catch (Exception e) {
            throw new CodecConfigurationException(e.getMessage(), e);
        }
    }

    /* renamed from: f */
    public Object m67146f(Object[] objArr) {
        m67151a();
        try {
            Constructor constructor = this.f4258b;
            if (constructor != null) {
                return constructor.newInstance(objArr);
            }
            return this.f4259c.invoke(this.f4257a, objArr);
        } catch (Exception e) {
            throw new CodecConfigurationException(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    public List m67145g() {
        return this.f4263g;
    }

    /* renamed from: h */
    public List m67144h() {
        return this.f4262f;
    }

    /* renamed from: i */
    public List m67143i() {
        return this.f4260d;
    }

    /* renamed from: j */
    public Class m67142j() {
        return this.f4257a;
    }

    public C0982Nz(Class cls, Method method) {
        this(cls, null, method);
    }

    public C0982Nz(Class cls, Constructor constructor, Method method) {
        Annotation[][] parameterAnnotations;
        this.f4260d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f4262f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f4263g = arrayList2;
        this.f4257a = cls;
        this.f4258b = constructor;
        this.f4259c = method;
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
                            this.f4260d.add((BsonProperty) annotation);
                            break;
                        } else if (annotation.annotationType().equals(BsonId.class)) {
                            this.f4260d.add(null);
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
        this.f4261e = num;
    }
}
