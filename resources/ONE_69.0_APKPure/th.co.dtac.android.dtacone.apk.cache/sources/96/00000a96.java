package p000;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOBinaryOperator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: L90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class L90 {
    /* renamed from: a */
    public static BinaryOperator m67624a(final IOBinaryOperator iOBinaryOperator) {
        return new BinaryOperator() { // from class: I90
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return L90.m67623b(IOBinaryOperator.this, obj, obj2);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ Object m67623b(IOBinaryOperator iOBinaryOperator, Object obj, Object obj2) {
        return Uncheck.apply(iOBinaryOperator, obj, obj2);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m67622c(IOComparator iOComparator, Object obj, Object obj2) {
        if (iOComparator.compare(obj, obj2) < 0) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m67621d(IOComparator iOComparator, Object obj, Object obj2) {
        if (iOComparator.compare(obj, obj2) > 0) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: e */
    public static IOBinaryOperator m67620e(final IOComparator iOComparator) {
        Objects.requireNonNull(iOComparator);
        return new IOBinaryOperator() { // from class: J90
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return H90.m68164a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return L90.m67622c(IOComparator.this, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return H90.m68163b(this);
            }

            @Override // org.apache.commons.p028io.function.IOBinaryOperator
            public /* synthetic */ BinaryOperator asBinaryOperator() {
                return L90.m67624a(this);
            }
        };
    }

    /* renamed from: f */
    public static IOBinaryOperator m67619f(final IOComparator iOComparator) {
        Objects.requireNonNull(iOComparator);
        return new IOBinaryOperator() { // from class: K90
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return H90.m68164a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return L90.m67621d(IOComparator.this, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return H90.m68163b(this);
            }

            @Override // org.apache.commons.p028io.function.IOBinaryOperator
            public /* synthetic */ BinaryOperator asBinaryOperator() {
                return L90.m67624a(this);
            }
        };
    }
}