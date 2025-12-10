package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;

/* renamed from: P4 */
/* loaded from: classes6.dex */
public class C1060P4 implements InvocationHandler {

    /* renamed from: a */
    public final Class f4661a;

    /* renamed from: b */
    public final Map f4662b;

    /* renamed from: c */
    public final Lazy f4663c;

    /* renamed from: d */
    public final Lazy f4664d;

    /* renamed from: e */
    public final List f4665e;

    public C1060P4(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f4661a = cls;
        this.f4662b = map;
        this.f4663c = lazy;
        this.f4664d = lazy2;
        this.f4665e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object m28933e;
        m28933e = AnnotationConstructorCallerKt.m28933e(this.f4661a, this.f4662b, this.f4663c, this.f4664d, this.f4665e, obj, method, objArr);
        return m28933e;
    }
}