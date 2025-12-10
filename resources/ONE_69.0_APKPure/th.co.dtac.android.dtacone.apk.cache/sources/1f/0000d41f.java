package io.reactivex.rxkotlin;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¨\u0006\f"}, m29142d2 = {"cast", "Lio/reactivex/Maybe;", "R", "", "concatAll", "Lio/reactivex/Flowable;", "T", "", "Lio/reactivex/MaybeSource;", "mergeAllMaybes", "Lio/reactivex/Observable;", "ofType", "rxkotlin"}, m29141k = 2, m29140mv = {1, 1, 15})
/* loaded from: classes5.dex */
public final class MaybeKt {

    /* renamed from: io.reactivex.rxkotlin.MaybeKt$a */
    /* loaded from: classes5.dex */
    public static final class C11171a implements Function {

        /* renamed from: a */
        public static final C11171a f66358a = new C11171a();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Maybe apply(Maybe it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.MaybeKt$b */
    /* loaded from: classes5.dex */
    public static final class C11172b implements Function {

        /* renamed from: a */
        public static final C11172b f66359a = new C11172b();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Maybe apply(Maybe it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final /* synthetic */ <R> Maybe<R> cast(@NotNull Maybe<?> cast) {
        Intrinsics.checkParameterIsNotNull(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe<R> maybe = (Maybe<R>) cast.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(maybe, "cast(R::class.java)");
        return maybe;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends MaybeSource<T>> concatAll) {
        Intrinsics.checkParameterIsNotNull(concatAll, "$this$concatAll");
        Flowable<T> concat = Maybe.concat(concatAll);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Maybe.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeAllMaybes(@NotNull Observable<Maybe<T>> mergeAllMaybes) {
        Intrinsics.checkParameterIsNotNull(mergeAllMaybes, "$this$mergeAllMaybes");
        Observable<T> observable = (Observable<T>) mergeAllMaybes.flatMapMaybe(C11171a.f66358a);
        Intrinsics.checkExpressionValueIsNotNull(observable, "flatMapMaybe { it }");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final /* synthetic */ <R> Maybe<R> ofType(@NotNull Maybe<?> ofType) {
        Intrinsics.checkParameterIsNotNull(ofType, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe<R> maybe = (Maybe<R>) ofType.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(maybe, "ofType(R::class.java)");
        return maybe;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllMaybes(@NotNull Flowable<Maybe<T>> mergeAllMaybes) {
        Intrinsics.checkParameterIsNotNull(mergeAllMaybes, "$this$mergeAllMaybes");
        Flowable<T> flowable = (Flowable<T>) mergeAllMaybes.flatMapMaybe(C11172b.f66359a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "flatMapMaybe { it }");
        return flowable;
    }
}