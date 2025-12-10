package p000;

import java.util.Objects;
import java.util.function.BiFunction;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: B90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class B90 {
    /* renamed from: a */
    public static IOBiFunction m68991a(final IOBiFunction iOBiFunction, final IOFunction iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOBiFunction() { // from class: z90
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction2) {
                return B90.m68991a(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return B90.m68989c(iOBiFunction, iOFunction, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        };
    }

    /* renamed from: b */
    public static BiFunction m68990b(final IOBiFunction iOBiFunction) {
        return new BiFunction() { // from class: A90
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return B90.m68988d(iOBiFunction, obj, obj2);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ Object m68989c(IOBiFunction iOBiFunction, IOFunction iOFunction, Object obj, Object obj2) {
        return iOFunction.apply(iOBiFunction.apply(obj, obj2));
    }

    /* renamed from: d */
    public static /* synthetic */ Object m68988d(IOBiFunction iOBiFunction, Object obj, Object obj2) {
        return Uncheck.apply(iOBiFunction, obj, obj2);
    }
}
