package io.reactivex.rxkotlin;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\b\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\n\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000b\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\f¨\u0006\r"}, m29142d2 = {"concatAll", "Lio/reactivex/Completable;", "", "Lio/reactivex/CompletableSource;", "mergeAllCompletables", "Lio/reactivex/Flowable;", "Lio/reactivex/Observable;", "toCompletable", "Lkotlin/Function0;", "", "Lio/reactivex/functions/Action;", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Future;", "rxkotlin"}, m29141k = 2, m29140mv = {1, 1, 15})
/* loaded from: classes5.dex */
public final class CompletableKt {

    /* renamed from: io.reactivex.rxkotlin.CompletableKt$a */
    /* loaded from: classes5.dex */
    public static final class C11155a implements Function {

        /* renamed from: a */
        public static final C11155a f66316a = new C11155a();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Completable apply(Completable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.CompletableKt$b */
    /* loaded from: classes5.dex */
    public static final class C11156b implements Function {

        /* renamed from: a */
        public static final C11156b f66317a = new C11156b();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Completable apply(Completable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Completable concatAll(@NotNull Iterable<? extends CompletableSource> concatAll) {
        Intrinsics.checkParameterIsNotNull(concatAll, "$this$concatAll");
        Completable concat = Completable.concat(concatAll);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Completable.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Completable mergeAllCompletables(@NotNull Observable<Completable> mergeAllCompletables) {
        Intrinsics.checkParameterIsNotNull(mergeAllCompletables, "$this$mergeAllCompletables");
        Completable flatMapCompletable = mergeAllCompletables.flatMapCompletable(C11155a.f66316a);
        Intrinsics.checkExpressionValueIsNotNull(flatMapCompletable, "flatMapCompletable { it }");
        return flatMapCompletable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Action toCompletable) {
        Intrinsics.checkParameterIsNotNull(toCompletable, "$this$toCompletable");
        Completable fromAction = Completable.fromAction(toCompletable);
        Intrinsics.checkExpressionValueIsNotNull(fromAction, "Completable.fromAction(this)");
        return fromAction;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final Completable mergeAllCompletables(@NotNull Flowable<Completable> mergeAllCompletables) {
        Intrinsics.checkParameterIsNotNull(mergeAllCompletables, "$this$mergeAllCompletables");
        Completable flatMapCompletable = mergeAllCompletables.flatMapCompletable(C11156b.f66317a);
        Intrinsics.checkExpressionValueIsNotNull(flatMapCompletable, "flatMapCompletable { it }");
        return flatMapCompletable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Callable<? extends Object> toCompletable) {
        Intrinsics.checkParameterIsNotNull(toCompletable, "$this$toCompletable");
        Completable fromCallable = Completable.fromCallable(toCompletable);
        Intrinsics.checkExpressionValueIsNotNull(fromCallable, "Completable.fromCallable(this)");
        return fromCallable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Future<? extends Object> toCompletable) {
        Intrinsics.checkParameterIsNotNull(toCompletable, "$this$toCompletable");
        Completable fromFuture = Completable.fromFuture(toCompletable);
        Intrinsics.checkExpressionValueIsNotNull(fromFuture, "Completable.fromFuture(this)");
        return fromFuture;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Function0<? extends Object> toCompletable) {
        Intrinsics.checkParameterIsNotNull(toCompletable, "$this$toCompletable");
        Completable fromCallable = Completable.fromCallable(new CallableC0344Eu(toCompletable));
        Intrinsics.checkExpressionValueIsNotNull(fromCallable, "Completable.fromCallable(this)");
        return fromCallable;
    }
}