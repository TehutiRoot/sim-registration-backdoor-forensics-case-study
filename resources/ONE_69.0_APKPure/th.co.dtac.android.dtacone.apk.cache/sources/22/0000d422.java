package io.reactivex.rxkotlin;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007J\u0083\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2 \b\u0004\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0087\bJ¡\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2&\b\u0004\u0010\u000e\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\r0\u0012H\u0087\bJ¿\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2,\b\u0004\u0010\u000e\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\r0\u0015H\u0087\bJÝ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n22\b\u0004\u0010\u000e\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\r0\u0018H\u0087\bJû\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n28\b\u0004\u0010\u000e\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\r0\u001bH\u0087\bJ\u0099\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\u001c*\u00020\u0001\"\b\b\b\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2>\b\u0004\u0010\u000e\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\r0\u001eH\u0087\bJ·\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\u001c*\u00020\u0001\"\b\b\b\u0010\u001f*\u00020\u0001\"\b\b\t\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0\n2D\b\u0004\u0010\u000e\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\r0!H\u0087\bJJ\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"0\u0004\"\b\b\u0000\u0010#*\u00020\u0001\"\b\b\u0001\u0010$*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\nH\u0007Je\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010#*\u00020\u0001\"\b\b\u0001\u0010$*\u00020\u0001\"\b\b\u0002\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\r0%H\u0087\b¨\u0006&"}, m29142d2 = {"Lio/reactivex/rxkotlin/Maybes;", "", "()V", "zip", "Lio/reactivex/Maybe;", "Lkotlin/Triple;", "T1", "T2", "T3", "s1", "Lio/reactivex/MaybeSource;", "s2", "s3", "R", "zipper", "Lkotlin/Function3;", "T4", "s4", "Lkotlin/Function4;", "T5", "s5", "Lkotlin/Function5;", "T6", "s6", "Lkotlin/Function6;", "T7", "s7", "Lkotlin/Function7;", "T8", "s8", "Lkotlin/Function8;", "T9", "s9", "Lkotlin/Function9;", "Lkotlin/Pair;", "T", PDBorderStyleDictionary.STYLE_UNDERLINE, "Lkotlin/Function2;", "rxkotlin"}, m29141k = 1, m29140mv = {1, 1, 15})
/* loaded from: classes5.dex */
public final class Maybes {
    public static final Maybes INSTANCE = new Maybes();

    /* renamed from: io.reactivex.rxkotlin.Maybes$a */
    /* loaded from: classes5.dex */
    public static final class C11173a implements BiFunction {

        /* renamed from: a */
        public static final C11173a f66360a = new C11173a();

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public final Pair apply(Object t, Object u) {
            Intrinsics.checkParameterIsNotNull(t, "t");
            Intrinsics.checkParameterIsNotNull(u, "u");
            return new Pair(t, u);
        }
    }

    /* renamed from: io.reactivex.rxkotlin.Maybes$b */
    /* loaded from: classes5.dex */
    public static final class C11174b implements Function3 {

        /* renamed from: a */
        public static final C11174b f66361a = new C11174b();

        @Override // io.reactivex.functions.Function3
        /* renamed from: a */
        public final Triple apply(Object t1, Object t2, Object t3) {
            Intrinsics.checkParameterIsNotNull(t1, "t1");
            Intrinsics.checkParameterIsNotNull(t2, "t2");
            Intrinsics.checkParameterIsNotNull(t3, "t3");
            return new Triple(t1, t2, t3);
        }
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T, U, R> Maybe<R> zip(@NotNull MaybeSource<T> s1, @NotNull MaybeSource<U> s2, @NotNull final Function2<? super T, ? super U, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T t, @NotNull U u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return (R) Function2.this.invoke(t, u);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2,\n      …-> zipper.invoke(t, u) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T, U> Maybe<Pair<T, U>> zip(@NotNull MaybeSource<T> s1, @NotNull MaybeSource<U> s2) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Maybe<Pair<T, U>> zip = Maybe.zip(s1, s2, C11173a.f66360a);
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2,\n      …n { t, u -> Pair(t, u) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, R> Maybe<R> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3, @NotNull final kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, s3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$3
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) kotlin.jvm.functions.Function3.this.invoke(t1, t2, t3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3,\n  …per.invoke(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3> Maybe<Triple<T1, T2, T3>> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Maybe<Triple<T1, T2, T3>> zip = Maybe.zip(s1, s2, s3, C11174b.f66361a);
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3,\n  … -> Triple(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, R> Maybe<R> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3, @NotNull MaybeSource<T4> s4, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Intrinsics.checkParameterIsNotNull(s4, "s4");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, s3, s4, new io.reactivex.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$5
            @Override // io.reactivex.functions.Function4
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                return (R) Function4.this.invoke(t1, t2, t3, t4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3, s4…invoke(t1, t2, t3, t4) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, R> Maybe<R> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3, @NotNull MaybeSource<T4> s4, @NotNull MaybeSource<T5> s5, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Intrinsics.checkParameterIsNotNull(s4, "s4");
        Intrinsics.checkParameterIsNotNull(s5, "s5");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, s3, s4, s5, new io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$6
            @Override // io.reactivex.functions.Function5
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4, @NotNull T5 t5) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                return (R) Function5.this.invoke(t1, t2, t3, t4, t5);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3, s4…ke(t1, t2, t3, t4, t5) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, R> Maybe<R> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3, @NotNull MaybeSource<T4> s4, @NotNull MaybeSource<T5> s5, @NotNull MaybeSource<T6> s6, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Intrinsics.checkParameterIsNotNull(s4, "s4");
        Intrinsics.checkParameterIsNotNull(s5, "s5");
        Intrinsics.checkParameterIsNotNull(s6, "s6");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, s3, s4, s5, s6, new io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$7
            @Override // io.reactivex.functions.Function6
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4, @NotNull T5 t5, @NotNull T6 t6) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                return (R) Function6.this.invoke(t1, t2, t3, t4, t5, t6);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3, s4…1, t2, t3, t4, t5, t6) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, T7, R> Maybe<R> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3, @NotNull MaybeSource<T4> s4, @NotNull MaybeSource<T5> s5, @NotNull MaybeSource<T6> s6, @NotNull MaybeSource<T7> s7, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Intrinsics.checkParameterIsNotNull(s4, "s4");
        Intrinsics.checkParameterIsNotNull(s5, "s5");
        Intrinsics.checkParameterIsNotNull(s6, "s6");
        Intrinsics.checkParameterIsNotNull(s7, "s7");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, s3, s4, s5, s6, s7, new io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$8
            @Override // io.reactivex.functions.Function7
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4, @NotNull T5 t5, @NotNull T6 t6, @NotNull T7 t7) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                Intrinsics.checkParameterIsNotNull(t7, "t7");
                return (R) Function7.this.invoke(t1, t2, t3, t4, t5, t6, t7);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3, s4…2, t3, t4, t5, t6, t7) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Maybe<R> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3, @NotNull MaybeSource<T4> s4, @NotNull MaybeSource<T5> s5, @NotNull MaybeSource<T6> s6, @NotNull MaybeSource<T7> s7, @NotNull MaybeSource<T8> s8, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Intrinsics.checkParameterIsNotNull(s4, "s4");
        Intrinsics.checkParameterIsNotNull(s5, "s5");
        Intrinsics.checkParameterIsNotNull(s6, "s6");
        Intrinsics.checkParameterIsNotNull(s7, "s7");
        Intrinsics.checkParameterIsNotNull(s8, "s8");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, s3, s4, s5, s6, s7, s8, new io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$9
            @Override // io.reactivex.functions.Function8
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4, @NotNull T5 t5, @NotNull T6 t6, @NotNull T7 t7, @NotNull T8 t8) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                Intrinsics.checkParameterIsNotNull(t7, "t7");
                Intrinsics.checkParameterIsNotNull(t8, "t8");
                return (R) Function8.this.invoke(t1, t2, t3, t4, t5, t6, t7, t8);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3, s4…3, t4, t5, t6, t7, t8) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Maybe<R> zip(@NotNull MaybeSource<T1> s1, @NotNull MaybeSource<T2> s2, @NotNull MaybeSource<T3> s3, @NotNull MaybeSource<T4> s4, @NotNull MaybeSource<T5> s5, @NotNull MaybeSource<T6> s6, @NotNull MaybeSource<T7> s7, @NotNull MaybeSource<T8> s8, @NotNull MaybeSource<T9> s9, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Intrinsics.checkParameterIsNotNull(s4, "s4");
        Intrinsics.checkParameterIsNotNull(s5, "s5");
        Intrinsics.checkParameterIsNotNull(s6, "s6");
        Intrinsics.checkParameterIsNotNull(s7, "s7");
        Intrinsics.checkParameterIsNotNull(s8, "s8");
        Intrinsics.checkParameterIsNotNull(s9, "s9");
        Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        Maybe<R> zip = Maybe.zip(s1, s2, s3, s4, s5, s6, s7, s8, s9, new io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$10
            @Override // io.reactivex.functions.Function9
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4, @NotNull T5 t5, @NotNull T6 t6, @NotNull T7 t7, @NotNull T8 t8, @NotNull T9 t9) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                Intrinsics.checkParameterIsNotNull(t7, "t7");
                Intrinsics.checkParameterIsNotNull(t8, "t8");
                Intrinsics.checkParameterIsNotNull(t9, "t9");
                return (R) Function9.this.invoke(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Maybe.zip(s1, s2, s3, s4…4, t5, t6, t7, t8, t9) })");
        return zip;
    }
}