package p046rx.internal.operators;

import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.SingleOperatorCast */
/* loaded from: classes7.dex */
public class SingleOperatorCast<T, R> implements Func1<T, R> {

    /* renamed from: a */
    public final Class f79211a;

    public SingleOperatorCast(Class<R> cls) {
        this.f79211a = cls;
    }

    @Override // p046rx.functions.Func1
    public R call(T t) {
        return (R) this.f79211a.cast(t);
    }
}