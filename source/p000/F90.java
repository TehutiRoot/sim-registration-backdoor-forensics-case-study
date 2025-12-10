package p000;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOBinaryOperator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: F90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class F90 {
    /* renamed from: a */
    public static BinaryOperator m68417a(final IOBinaryOperator iOBinaryOperator) {
        return new BinaryOperator() { // from class: C90
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return F90.m68416b(iOBinaryOperator, obj, obj2);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ Object m68416b(IOBinaryOperator iOBinaryOperator, Object obj, Object obj2) {
        return Uncheck.apply(iOBinaryOperator, obj, obj2);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m68415c(IOComparator iOComparator, Object obj, Object obj2) {
        if (iOComparator.compare(obj, obj2) < 0) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m68414d(IOComparator iOComparator, Object obj, Object obj2) {
        if (iOComparator.compare(obj, obj2) > 0) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: e */
    public static IOBinaryOperator m68413e(final IOComparator iOComparator) {
        Objects.requireNonNull(iOComparator);
        return new IOBinaryOperator() { // from class: D90
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return F90.m68415c(IOComparator.this, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }

            @Override // org.apache.commons.p028io.function.IOBinaryOperator
            public /* synthetic */ BinaryOperator asBinaryOperator() {
                return F90.m68417a(this);
            }
        };
    }

    /* renamed from: f */
    public static IOBinaryOperator m68412f(final IOComparator iOComparator) {
        Objects.requireNonNull(iOComparator);
        return new IOBinaryOperator() { // from class: E90
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return F90.m68414d(IOComparator.this, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }

            @Override // org.apache.commons.p028io.function.IOBinaryOperator
            public /* synthetic */ BinaryOperator asBinaryOperator() {
                return F90.m68417a(this);
            }
        };
    }
}
