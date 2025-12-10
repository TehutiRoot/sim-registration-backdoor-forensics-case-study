package p000;

import java.util.Objects;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOQuadFunction;

/* renamed from: Ba0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC17349Ba0 {
    /* renamed from: a */
    public static IOQuadFunction m69097a(final IOQuadFunction iOQuadFunction, final IOFunction iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOQuadFunction() { // from class: Aa0
            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public /* synthetic */ IOQuadFunction andThen(IOFunction iOFunction2) {
                return AbstractC17349Ba0.m69097a(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                return AbstractC17349Ba0.m69096b(IOQuadFunction.this, iOFunction, obj, obj2, obj3, obj4);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ Object m69096b(IOQuadFunction iOQuadFunction, IOFunction iOFunction, Object obj, Object obj2, Object obj3, Object obj4) {
        return iOFunction.apply(iOQuadFunction.apply(obj, obj2, obj3, obj4));
    }
}