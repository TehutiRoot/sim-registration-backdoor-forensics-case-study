package p000;

import java.util.Objects;
import java.util.function.BiFunction;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: H90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class H90 {
    /* renamed from: a */
    public static IOBiFunction m68164a(final IOBiFunction iOBiFunction, final IOFunction iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOBiFunction() { // from class: F90
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction2) {
                return H90.m68164a(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return H90.m68162c(IOBiFunction.this, iOFunction, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return H90.m68163b(this);
            }
        };
    }

    /* renamed from: b */
    public static BiFunction m68163b(final IOBiFunction iOBiFunction) {
        return new BiFunction() { // from class: G90
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return H90.m68161d(IOBiFunction.this, obj, obj2);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ Object m68162c(IOBiFunction iOBiFunction, IOFunction iOFunction, Object obj, Object obj2) {
        return iOFunction.apply(iOBiFunction.apply(obj, obj2));
    }

    /* renamed from: d */
    public static /* synthetic */ Object m68161d(IOBiFunction iOBiFunction, Object obj, Object obj2) {
        return Uncheck.apply(iOBiFunction, obj, obj2);
    }
}