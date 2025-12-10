package p000;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: uu */
/* loaded from: classes5.dex */
public abstract class AbstractC16857uu {
    /* renamed from: a */
    public static /* synthetic */ int m1175a(Comparator comparator, Object obj, Object obj2) {
        return m1167i(comparator, obj, obj2);
    }

    /* renamed from: b */
    public static /* synthetic */ int m1174b(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        return m1165k(comparator, comparator2, obj, obj2);
    }

    /* renamed from: c */
    public static /* synthetic */ int m1173c(Function1[] function1Arr, Object obj, Object obj2) {
        return m1170f(function1Arr, obj, obj2);
    }

    @NotNull
    public static <T> Comparator<T> compareBy(@NotNull final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: su
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC16857uu.m1173c(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static <T extends Comparable<?>> int compareValues(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T> int compareValuesBy(T t, T t2, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return m1169g(t, t2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: d */
    public static /* synthetic */ int m1172d(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        return m1166j(comparator, comparator2, obj, obj2);
    }

    /* renamed from: e */
    public static /* synthetic */ int m1171e(Comparator comparator, Object obj, Object obj2) {
        return m1168h(comparator, obj, obj2);
    }

    /* renamed from: f */
    public static final int m1170f(Function1[] selectors, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(selectors, "$selectors");
        return m1169g(obj, obj2, selectors);
    }

    /* renamed from: g */
    public static final int m1169g(Object obj, Object obj2, Function1[] function1Arr) {
        for (Function1 function1 : function1Arr) {
            int compareValues = compareValues((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
            if (compareValues != 0) {
                return compareValues;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static final int m1168h(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    /* renamed from: i */
    public static final int m1167i(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    /* renamed from: j */
    public static final int m1166j(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(this_then, "$this_then");
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        int compare = this_then.compare(obj, obj2);
        if (compare == 0) {
            return comparator.compare(obj, obj2);
        }
        return compare;
    }

    /* renamed from: k */
    public static final int m1165k(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(this_thenDescending, "$this_thenDescending");
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        int compare = this_thenDescending.compare(obj, obj2);
        if (compare == 0) {
            return comparator.compare(obj2, obj);
        }
        return compare;
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        PG0 pg0 = PG0.f4697a;
        Intrinsics.checkNotNull(pg0, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return pg0;
    }

    @NotNull
    public static final <T> Comparator<T> nullsFirst(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: tu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC16857uu.m1171e(comparator, obj, obj2);
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> nullsLast(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: pu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC16857uu.m1175a(comparator, obj, obj2);
            }
        };
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        C19098ay1 c19098ay1 = C19098ay1.f38889a;
        Intrinsics.checkNotNull(c19098ay1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return c19098ay1;
    }

    @NotNull
    public static final <T> Comparator<T> reversed(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof C19270by1) {
            return ((C19270by1) comparator).m51733a();
        }
        Comparator<T> comparator2 = PG0.f4697a;
        if (Intrinsics.areEqual(comparator, comparator2)) {
            C19098ay1 c19098ay1 = C19098ay1.f38889a;
            Intrinsics.checkNotNull(c19098ay1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return c19098ay1;
        }
        if (Intrinsics.areEqual(comparator, C19098ay1.f38889a)) {
            Intrinsics.checkNotNull(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new C19270by1(comparator);
        }
        return comparator2;
    }

    @NotNull
    public static final <T> Comparator<T> then(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: ru
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC16857uu.m1172d(comparator, comparator2, obj, obj2);
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> thenDescending(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: qu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC16857uu.m1174b(comparator, comparator2, obj, obj2);
            }
        };
    }
}
