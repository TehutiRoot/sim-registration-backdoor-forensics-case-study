package p000;

import java.util.Objects;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOTriFunction;

/* renamed from: Rb0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC18392Rb0 {
    /* renamed from: a */
    public static IOTriFunction m66627a(final IOTriFunction iOTriFunction, final IOFunction iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOTriFunction() { // from class: Qb0
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction2) {
                return AbstractC18392Rb0.m66627a(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return AbstractC18392Rb0.m66626b(IOTriFunction.this, iOFunction, obj, obj2, obj3);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ Object m66626b(IOTriFunction iOTriFunction, IOFunction iOFunction, Object obj, Object obj2, Object obj3) {
        return iOFunction.apply(iOTriFunction.apply(obj, obj2, obj3));
    }
}