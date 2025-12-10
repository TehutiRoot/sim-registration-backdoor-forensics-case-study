package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;

/* renamed from: P4 */
/* loaded from: classes6.dex */
public class C1072P4 implements InvocationHandler {

    /* renamed from: a */
    public final Class f4632a;

    /* renamed from: b */
    public final Map f4633b;

    /* renamed from: c */
    public final Lazy f4634c;

    /* renamed from: d */
    public final Lazy f4635d;

    /* renamed from: e */
    public final List f4636e;

    public C1072P4(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f4632a = cls;
        this.f4633b = map;
        this.f4634c = lazy;
        this.f4635d = lazy2;
        this.f4636e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object m28641e;
        m28641e = AnnotationConstructorCallerKt.m28641e(this.f4632a, this.f4633b, this.f4634c, this.f4635d, this.f4636e, obj, method, objArr);
        return m28641e;
    }
}
