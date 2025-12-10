package p000;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* renamed from: hW1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC20222hW1 {

    /* renamed from: a */
    public final Set f62513a = Sets.newHashSet();

    /* renamed from: a */
    public final void m30867a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f62513a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo30863e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo30862f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo30864d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo30866b((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        mo30865c((GenericArrayType) type);
                    } else {
                        throw new AssertionError("Unknown type: " + type);
                    }
                } catch (Throwable th2) {
                    this.f62513a.remove(type);
                    throw th2;
                }
            }
        }
    }

    /* renamed from: e */
    public abstract void mo30863e(TypeVariable typeVariable);

    /* renamed from: f */
    public abstract void mo30862f(WildcardType wildcardType);

    /* renamed from: b */
    public void mo30866b(Class cls) {
    }

    /* renamed from: c */
    public void mo30865c(GenericArrayType genericArrayType) {
    }

    /* renamed from: d */
    public void mo30864d(ParameterizedType parameterizedType) {
    }
}
