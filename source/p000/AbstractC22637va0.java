package p000;

import java.util.Objects;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOQuadFunction;

/* renamed from: va0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22637va0 {
    /* renamed from: a */
    public static IOQuadFunction m1021a(final IOQuadFunction iOQuadFunction, final IOFunction iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOQuadFunction() { // from class: ua0
            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public /* synthetic */ IOQuadFunction andThen(IOFunction iOFunction2) {
                return AbstractC22637va0.m1021a(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                Object apply;
                apply = iOFunction.apply(IOQuadFunction.this.apply(obj, obj2, obj3, obj4));
                return apply;
            }
        };
    }
}
