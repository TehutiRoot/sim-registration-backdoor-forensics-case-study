package io.reactivex.rxkotlin;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007¨\u0006\u000b"}, m29142d2 = {"cast", "Lio/reactivex/Single;", "R", "", "concatAll", "Lio/reactivex/Flowable;", "T", "", "Lio/reactivex/SingleSource;", "mergeAllSingles", "Lio/reactivex/Observable;", "rxkotlin"}, m29141k = 2, m29140mv = {1, 1, 15})
/* loaded from: classes5.dex */
public final class SingleKt {

    /* renamed from: io.reactivex.rxkotlin.SingleKt$a */
    /* loaded from: classes5.dex */
    public static final class C11192a implements Function {

        /* renamed from: a */
        public static final C11192a f66413a = new C11192a();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Single apply(Single it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.SingleKt$b */
    /* loaded from: classes5.dex */
    public static final class C11193b implements Function {

        /* renamed from: a */
        public static final C11193b f66414a = new C11193b();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Single apply(Single it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    @NotNull
    public static final /* synthetic */ <R> Single<R> cast(@NotNull Single<?> cast) {
        Intrinsics.checkParameterIsNotNull(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Single<R> single = (Single<R>) cast.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(single, "cast(R::class.java)");
        return single;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends SingleSource<T>> concatAll) {
        Intrinsics.checkParameterIsNotNull(concatAll, "$this$concatAll");
        Flowable<T> concat = Single.concat(concatAll);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Single.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeAllSingles(@NotNull Observable<Single<T>> mergeAllSingles) {
        Intrinsics.checkParameterIsNotNull(mergeAllSingles, "$this$mergeAllSingles");
        Observable<T> observable = (Observable<T>) mergeAllSingles.flatMapSingle(C11192a.f66413a);
        Intrinsics.checkExpressionValueIsNotNull(observable, "flatMapSingle { it }");
        return observable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllSingles(@NotNull Flowable<Single<T>> mergeAllSingles) {
        Intrinsics.checkParameterIsNotNull(mergeAllSingles, "$this$mergeAllSingles");
        Flowable<T> flowable = (Flowable<T>) mergeAllSingles.flatMapSingle(C11193b.f66414a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "flatMapSingle { it }");
        return flowable;
    }
}