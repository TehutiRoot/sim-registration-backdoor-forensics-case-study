package io.reactivex.rxkotlin;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000T\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006\u001a\u0019\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0015\u001aO\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0018\u001a_\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u001a\u001a9\u0010\u0012\u001a\u00020\u0011*\u00020\u001b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0004\b\u0012\u0010\u001c\u001a_\u0010\u001d\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a_\u0010\u001d\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001f\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 \" \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 \"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006%"}, m29142d2 = {"", "T", "Lkotlin/Function1;", "", "Lio/reactivex/functions/Consumer;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function1;)Lio/reactivex/functions/Consumer;", "", OperatorName.CURVE_TO, "Lkotlin/Function0;", "Lio/reactivex/functions/Action;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlin/jvm/functions/Function0;)Lio/reactivex/functions/Action;", "Lio/reactivex/Observable;", "onError", "onComplete", "onNext", "Lio/reactivex/disposables/Disposable;", "subscribeBy", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Flowable;", "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Single;", "onSuccess", "(Lio/reactivex/Single;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Maybe;", "(Lio/reactivex/Maybe;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Completable;", "(Lio/reactivex/Completable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lio/reactivex/disposables/Disposable;", "blockingSubscribeBy", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "onNextStub", "onErrorStub", "Lkotlin/jvm/functions/Function0;", "onCompleteStub", "rxkotlin"}, m29141k = 2, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class SubscribersKt {

    /* renamed from: a */
    public static final Function1 f66427a = SubscribersKt$onNextStub$1.INSTANCE;

    /* renamed from: b */
    public static final Function1 f66428b = SubscribersKt$onErrorStub$1.INSTANCE;

    /* renamed from: c */
    public static final Function0 f66429c = SubscribersKt$onCompleteStub$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [LP1] */
    /* renamed from: a */
    public static final Consumer m30141a(Function1 function1) {
        if (function1 == f66427a) {
            Consumer emptyConsumer = Functions.emptyConsumer();
            Intrinsics.checkExpressionValueIsNotNull(emptyConsumer, "Functions.emptyConsumer()");
            return emptyConsumer;
        }
        if (function1 != null) {
            function1 = new LP1(function1);
        }
        return (Consumer) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [KP1] */
    /* renamed from: b */
    public static final Action m30140b(Function0 function0) {
        if (function0 == f66429c) {
            Action action = Functions.EMPTY_ACTION;
            Intrinsics.checkExpressionValueIsNotNull(action, "Functions.EMPTY_ACTION");
            return action;
        }
        if (function0 != null) {
            function0 = new KP1(function0);
        }
        return (Action) function0;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static final <T> void blockingSubscribeBy(@NotNull Observable<T> blockingSubscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkParameterIsNotNull(blockingSubscribeBy, "$this$blockingSubscribeBy");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        blockingSubscribeBy.blockingSubscribe(m30141a(onNext), m30139c(onError), m30140b(onComplete));
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Observable observable, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f66428b;
        }
        if ((i & 2) != 0) {
            function0 = f66429c;
        }
        if ((i & 4) != 0) {
            function12 = f66427a;
        }
        blockingSubscribeBy(observable, function1, function0, function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [LP1] */
    /* renamed from: c */
    public static final Consumer m30139c(Function1 function1) {
        if (function1 == f66428b) {
            Consumer<Throwable> consumer = Functions.ON_ERROR_MISSING;
            Intrinsics.checkExpressionValueIsNotNull(consumer, "Functions.ON_ERROR_MISSING");
            return consumer;
        }
        if (function1 != null) {
            function1 = new LP1(function1);
        }
        return (Consumer) function1;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Observable<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkParameterIsNotNull(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        Disposable subscribe = subscribeBy.subscribe(m30141a(onNext), m30139c(onError), m30140b(onComplete));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Observable observable, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f66428b;
        }
        if ((i & 2) != 0) {
            function0 = f66429c;
        }
        if ((i & 4) != 0) {
            function12 = f66427a;
        }
        return subscribeBy(observable, function1, function0, function12);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public static final <T> void blockingSubscribeBy(@NotNull Flowable<T> blockingSubscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkParameterIsNotNull(blockingSubscribeBy, "$this$blockingSubscribeBy");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        blockingSubscribeBy.blockingSubscribe(m30141a(onNext), m30139c(onError), m30140b(onComplete));
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Disposable subscribeBy(@NotNull Flowable<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkParameterIsNotNull(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        Disposable subscribe = subscribeBy.subscribe(m30141a(onNext), m30139c(onError), m30140b(onComplete));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return subscribe;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Single<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkParameterIsNotNull(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        Intrinsics.checkParameterIsNotNull(onSuccess, "onSuccess");
        Disposable subscribe = subscribeBy.subscribe(m30141a(onSuccess), m30139c(onError));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return subscribe;
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Flowable flowable, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f66428b;
        }
        if ((i & 2) != 0) {
            function0 = f66429c;
        }
        if ((i & 4) != 0) {
            function12 = f66427a;
        }
        blockingSubscribeBy(flowable, function1, function0, function12);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Maybe<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkParameterIsNotNull(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        Intrinsics.checkParameterIsNotNull(onSuccess, "onSuccess");
        Disposable subscribe = subscribeBy.subscribe(m30141a(onSuccess), m30139c(onError), m30140b(onComplete));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "subscribe(onSuccess.asCo…ete.asOnCompleteAction())");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Flowable flowable, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f66428b;
        }
        if ((i & 2) != 0) {
            function0 = f66429c;
        }
        if ((i & 4) != 0) {
            function12 = f66427a;
        }
        return subscribeBy(flowable, function1, function0, function12);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Disposable subscribeBy(@NotNull Completable subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkParameterIsNotNull(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        Function1<? super Throwable, Unit> function1 = f66428b;
        if (onError == function1 && onComplete == f66429c) {
            Disposable subscribe = subscribeBy.subscribe();
            Intrinsics.checkExpressionValueIsNotNull(subscribe, "subscribe()");
            return subscribe;
        } else if (onError == function1) {
            Disposable subscribe2 = subscribeBy.subscribe(new KP1(onComplete));
            Intrinsics.checkExpressionValueIsNotNull(subscribe2, "subscribe(onComplete)");
            return subscribe2;
        } else {
            Disposable subscribe3 = subscribeBy.subscribe(m30140b(onComplete), new LP1(onError));
            Intrinsics.checkExpressionValueIsNotNull(subscribe3, "subscribe(onComplete.asO…ion(), Consumer(onError))");
            return subscribe3;
        }
    }

    public static /* synthetic */ Disposable subscribeBy$default(Single single, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f66428b;
        }
        if ((i & 2) != 0) {
            function12 = f66427a;
        }
        return subscribeBy(single, function1, function12);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Maybe maybe, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f66428b;
        }
        if ((i & 2) != 0) {
            function0 = f66429c;
        }
        if ((i & 4) != 0) {
            function12 = f66427a;
        }
        return subscribeBy(maybe, function1, function0, function12);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Completable completable, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f66428b;
        }
        if ((i & 2) != 0) {
            function0 = f66429c;
        }
        return subscribeBy(completable, function1, function0);
    }
}