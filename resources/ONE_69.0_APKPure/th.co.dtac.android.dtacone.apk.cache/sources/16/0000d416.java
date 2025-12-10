package io.reactivex.rxkotlin;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ad\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0007\u001a\u007f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\n0\fH\u0087\b\u001a\u009d\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2&\b\u0004\u0010\u000b\u001a \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\n0\u000fH\u0087\b\u001a»\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\u0010*\u00020\u0006\"\b\b\u0005\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\b2,\b\u0004\u0010\u000b\u001a&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\n0\u0012H\u0087\b\u001aF\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001aa\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b\u001aF\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001aa\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b¨\u0006\u0019"}, m29142d2 = {"withLatestFrom", "Lio/reactivex/Flowable;", "Lkotlin/Triple;", "T", "T1", "T2", "", "o1", "Lorg/reactivestreams/Publisher;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", PDBorderStyleDictionary.STYLE_UNDERLINE, "other", "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, m29141k = 2, m29140mv = {1, 1, 15})
/* loaded from: classes5.dex */
public final class FlowablesKt {

    /* renamed from: io.reactivex.rxkotlin.FlowablesKt$a */
    /* loaded from: classes5.dex */
    public static final class C11168a implements BiFunction {

        /* renamed from: a */
        public static final C11168a f66350a = new C11168a();

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public final Pair apply(Object t, Object u) {
            Intrinsics.checkParameterIsNotNull(t, "t");
            Intrinsics.checkParameterIsNotNull(u, "u");
            return new Pair(t, u);
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowablesKt$b */
    /* loaded from: classes5.dex */
    public static final class C11169b implements Function3 {

        /* renamed from: a */
        public static final C11169b f66351a = new C11169b();

        @Override // io.reactivex.functions.Function3
        /* renamed from: a */
        public final Triple apply(Object t, Object t1, Object t2) {
            Intrinsics.checkParameterIsNotNull(t, "t");
            Intrinsics.checkParameterIsNotNull(t1, "t1");
            Intrinsics.checkParameterIsNotNull(t2, "t2");
            return new Triple(t, t1, t2);
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowablesKt$c */
    /* loaded from: classes5.dex */
    public static final class C11170c implements BiFunction {

        /* renamed from: a */
        public static final C11170c f66352a = new C11170c();

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public final Pair apply(Object t, Object u) {
            Intrinsics.checkParameterIsNotNull(t, "t");
            Intrinsics.checkParameterIsNotNull(u, "u");
            return new Pair(t, u);
        }
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> withLatestFrom, @NotNull Publisher<U> other, @NotNull final Function2<? super T, ? super U, ? extends R> combiner) {
        Intrinsics.checkParameterIsNotNull(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        Flowable<R> withLatestFrom2 = withLatestFrom.withLatestFrom(other, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T t, @NotNull U u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return (R) Function2.this.invoke(t, u);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return withLatestFrom2;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> zipWith(@NotNull Flowable<T> zipWith, @NotNull Publisher<U> other, @NotNull final Function2<? super T, ? super U, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(zipWith, "$this$zipWith");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Flowable<R> zipWith2 = zipWith.zipWith(other, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$zipWith$1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T t, @NotNull U u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return (R) Function2.this.invoke(t, u);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zipWith2, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return zipWith2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> withLatestFrom(@NotNull Flowable<T> withLatestFrom, @NotNull Publisher<U> other) {
        Intrinsics.checkParameterIsNotNull(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Flowable<Pair<T, U>> flowable = (Flowable<Pair<T, U>>) withLatestFrom.withLatestFrom(other, C11168a.f66350a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return flowable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> zipWith(@NotNull Flowable<T> zipWith, @NotNull Publisher<U> other) {
        Intrinsics.checkParameterIsNotNull(zipWith, "$this$zipWith");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Flowable<Pair<T, U>> flowable = (Flowable<Pair<T, U>>) zipWith.zipWith(other, C11170c.f66352a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return flowable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> withLatestFrom, @NotNull Publisher<T1> o1, @NotNull Publisher<T2> o2, @NotNull final kotlin.jvm.functions.Function3<? super T, ? super T1, ? super T2, ? extends R> combiner) {
        Intrinsics.checkParameterIsNotNull(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(o1, "o1");
        Intrinsics.checkParameterIsNotNull(o2, "o2");
        Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        Flowable<R> withLatestFrom2 = withLatestFrom.withLatestFrom(o1, o2, new Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$3
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final R apply(@NotNull T t, @NotNull T1 t1, @NotNull T2 t2) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) kotlin.jvm.functions.Function3.this.invoke(t, t1, t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return withLatestFrom2;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2> Flowable<Triple<T, T1, T2>> withLatestFrom(@NotNull Flowable<T> withLatestFrom, @NotNull Publisher<T1> o1, @NotNull Publisher<T2> o2) {
        Intrinsics.checkParameterIsNotNull(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(o1, "o1");
        Intrinsics.checkParameterIsNotNull(o2, "o2");
        Flowable<Triple<T, T1, T2>> flowable = (Flowable<Triple<T, T1, T2>>) withLatestFrom.withLatestFrom(o1, o2, C11169b.f66351a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return flowable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, T3, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> withLatestFrom, @NotNull Publisher<T1> o1, @NotNull Publisher<T2> o2, @NotNull Publisher<T3> o3, @NotNull final Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> combiner) {
        Intrinsics.checkParameterIsNotNull(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(o1, "o1");
        Intrinsics.checkParameterIsNotNull(o2, "o2");
        Intrinsics.checkParameterIsNotNull(o3, "o3");
        Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        Flowable<R> withLatestFrom2 = withLatestFrom.withLatestFrom(o1, o2, o3, new io.reactivex.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$5
            @Override // io.reactivex.functions.Function4
            @NotNull
            public final R apply(@NotNull T t, @NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) Function4.this.invoke(t, t1, t2, t3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return withLatestFrom2;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> withLatestFrom, @NotNull Publisher<T1> o1, @NotNull Publisher<T2> o2, @NotNull Publisher<T3> o3, @NotNull Publisher<T4> o4, @NotNull final Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combiner) {
        Intrinsics.checkParameterIsNotNull(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(o1, "o1");
        Intrinsics.checkParameterIsNotNull(o2, "o2");
        Intrinsics.checkParameterIsNotNull(o3, "o3");
        Intrinsics.checkParameterIsNotNull(o4, "o4");
        Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        Flowable<R> withLatestFrom2 = withLatestFrom.withLatestFrom(o1, o2, o3, o4, new io.reactivex.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$6
            @Override // io.reactivex.functions.Function5
            @NotNull
            public final R apply(@NotNull T t, @NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                return (R) Function5.this.invoke(t, t1, t2, t3, t4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return withLatestFrom2;
    }
}