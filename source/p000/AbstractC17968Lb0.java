package p000;

import java.util.Objects;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOTriFunction;

/* renamed from: Lb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC17968Lb0 {
    /* renamed from: a */
    public static IOTriFunction m67508a(final IOTriFunction iOTriFunction, final IOFunction iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOTriFunction() { // from class: Kb0
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction2) {
                return AbstractC17968Lb0.m67508a(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Object apply;
                apply = iOFunction.apply(IOTriFunction.this.apply(obj, obj2, obj3));
                return apply;
            }
        };
    }
}
