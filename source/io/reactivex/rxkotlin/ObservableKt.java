package io.reactivex.rxkotlin;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000¬\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u000bH\u0007¢\u0006\u0004\b\u0003\u0010\r\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0011H\u0007¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0016\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0017H\u0007¢\u0006\u0004\b\u0003\u0010\u0019\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007¢\u0006\u0004\b\u0003\u0010\u001d\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u001eH\u0007¢\u0006\u0004\b\u0003\u0010\u001f\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000 H\u0007¢\u0006\u0004\b\u0003\u0010!\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b\u0003\u0010#\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000$H\u0007¢\u0006\u0004\b\u0003\u0010%\u001a1\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007¢\u0006\u0004\b&\u0010#\u001a1\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007¢\u0006\u0004\b'\u0010#\u001a1\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u0001H\u0007¢\u0006\u0004\b(\u0010)\u001a1\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u0001H\u0007¢\u0006\u0004\b*\u0010)\u001aP\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010+*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0,H\u0087\b¢\u0006\u0004\b.\u0010/\u001ae\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010+*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00104\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u000000¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00010,H\u0087\b¢\u0006\u0004\b5\u00106\u001ae\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010+*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00107\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u000000¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00010,H\u0087\b¢\u0006\u0004\b8\u00106\u001a*\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010+\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¢\u0006\u0004\b9\u0010)\u001a*\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010+\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¢\u0006\u0004\b:\u0010)\u001a)\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000 H\u0002¢\u0006\u0004\b;\u0010<\u001a/\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\b=\u0010)\u001a/\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\b>\u0010)\u001a/\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\b?\u0010)\u001a/\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\b@\u0010)\u001aK\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0D\"\b\b\u0000\u0010A*\u00020\u001a\"\b\b\u0001\u0010B*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0\u0001H\u0007¢\u0006\u0004\bF\u0010G\u001aQ\u0010I\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010H0E0D\"\b\b\u0000\u0010A*\u00020\u001a\"\b\b\u0001\u0010B*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0\u0001H\u0007¢\u0006\u0004\bI\u0010G\u001a/\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000J0\"H\u0007¢\u0006\u0004\b>\u0010#¨\u0006K"}, m28850d2 = {"", "Lio/reactivex/Observable;", "", "toObservable", "([Z)Lio/reactivex/Observable;", "", "", "([B)Lio/reactivex/Observable;", "", "", "([C)Lio/reactivex/Observable;", "", "", "([S)Lio/reactivex/Observable;", "", "", "([I)Lio/reactivex/Observable;", "", "", "([J)Lio/reactivex/Observable;", "", "", "([F)Lio/reactivex/Observable;", "", "", "([D)Lio/reactivex/Observable;", "", "T", "", "([Ljava/lang/Object;)Lio/reactivex/Observable;", "Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/IntProgression;)Lio/reactivex/Observable;", "", "(Ljava/util/Iterator;)Lio/reactivex/Observable;", "", "(Ljava/lang/Iterable;)Lio/reactivex/Observable;", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Lio/reactivex/Observable;", "merge", "mergeDelayError", "flatMapIterable", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "concatMapIterable", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "zipFunction", "zip", "cast", "ofType", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Iterator;)Ljava/lang/Iterable;", "mergeAll", "concatAll", "switchLatest", "switchOnNext", "A", "B", "Lkotlin/Pair;", "Lio/reactivex/Single;", "", "toMap", "(Lio/reactivex/Observable;)Lio/reactivex/Single;", "", "toMultimap", "Lio/reactivex/ObservableSource;", "rxkotlin"}, m28849k = 2, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class ObservableKt {

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$a */
    /* loaded from: classes5.dex */
    public static final class C11189a implements Function {

        /* renamed from: a */
        public static final C11189a f66309a = new C11189a();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Observable apply(Observable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$b */
    /* loaded from: classes5.dex */
    public static final class C11190b implements Function {

        /* renamed from: a */
        public static final C11190b f66310a = new C11190b();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Iterable apply(Iterable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$c */
    /* loaded from: classes5.dex */
    public static final class C11191c implements Function {

        /* renamed from: a */
        public static final C11191c f66311a = new C11191c();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Iterable apply(Iterable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$d */
    /* loaded from: classes5.dex */
    public static final class C11192d implements Function {

        /* renamed from: a */
        public static final C11192d f66312a = new C11192d();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Observable apply(Observable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$e */
    /* loaded from: classes5.dex */
    public static final class C11193e implements Function {

        /* renamed from: a */
        public static final C11193e f66313a = new C11193e();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Observable apply(Observable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$f */
    /* loaded from: classes5.dex */
    public static final class C11194f implements Function {

        /* renamed from: a */
        public static final C11194f f66314a = new C11194f();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getFirst();
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$g */
    /* loaded from: classes5.dex */
    public static final class C11195g implements Function {

        /* renamed from: a */
        public static final C11195g f66315a = new C11195g();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getSecond();
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$h */
    /* loaded from: classes5.dex */
    public static final class C11196h implements Function {

        /* renamed from: a */
        public static final C11196h f66316a = new C11196h();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getFirst();
        }
    }

    /* renamed from: io.reactivex.rxkotlin.ObservableKt$i */
    /* loaded from: classes5.dex */
    public static final class C11197i implements Function {

        /* renamed from: a */
        public static final C11197i f66317a = new C11197i();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getSecond();
        }
    }

    /* renamed from: a */
    public static final Iterable m29823a(Iterator it) {
        return new ObservableKt$toIterable$1(it);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final /* synthetic */ <R> Observable<R> cast(@NotNull Observable<?> cast) {
        Intrinsics.checkParameterIsNotNull(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable = (Observable<R>) cast.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable, "cast(R::class.java)");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> combineLatest(@NotNull Iterable<? extends Observable<T>> combineLatest, @NotNull final Function1<? super List<? extends T>, ? extends R> combineFunction) {
        Intrinsics.checkParameterIsNotNull(combineLatest, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(combineFunction, "combineFunction");
        Observable<R> combineLatest2 = Observable.combineLatest(combineLatest, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt$combineLatest$1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Function1 function1 = Function1.this;
                List asList = ArraysKt___ArraysJvmKt.asList(it);
                ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(asList, 10));
                for (T t : asList) {
                    if (t == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Observable.combineLatest…List().map { it as T }) }");
        return combineLatest2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> concatAll(@NotNull Observable<Observable<T>> concatAll) {
        Intrinsics.checkParameterIsNotNull(concatAll, "$this$concatAll");
        Observable<T> observable = (Observable<T>) concatAll.concatMap(C11189a.f66309a);
        Intrinsics.checkExpressionValueIsNotNull(observable, "concatMap { it }");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> concatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> concatMapIterable) {
        Intrinsics.checkParameterIsNotNull(concatMapIterable, "$this$concatMapIterable");
        Observable<T> observable = (Observable<T>) concatMapIterable.concatMapIterable(C11190b.f66310a);
        Intrinsics.checkExpressionValueIsNotNull(observable, "concatMapIterable { it }");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> flatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> flatMapIterable) {
        Intrinsics.checkParameterIsNotNull(flatMapIterable, "$this$flatMapIterable");
        Observable<T> observable = (Observable<T>) flatMapIterable.flatMapIterable(C11191c.f66311a);
        Intrinsics.checkExpressionValueIsNotNull(observable, "flatMapIterable { it }");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> flatMapSequence(@NotNull Observable<T> flatMapSequence, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> body) {
        Intrinsics.checkParameterIsNotNull(flatMapSequence, "$this$flatMapSequence");
        Intrinsics.checkParameterIsNotNull(body, "body");
        Observable<R> flatMap = flatMapSequence.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$flatMapSequence$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ObservableKt$flatMapSequence$1<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            @NotNull
            public final Observable<R> apply(@NotNull T it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return ObservableKt.toObservable((Sequence) Function1.this.invoke(it));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flatMap, "flatMap { body(it).toObservable() }");
        return flatMap;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> merge(@NotNull Iterable<? extends Observable<? extends T>> merge) {
        Intrinsics.checkParameterIsNotNull(merge, "$this$merge");
        Observable<T> merge2 = Observable.merge(toObservable(merge));
        Intrinsics.checkExpressionValueIsNotNull(merge2, "Observable.merge(this.toObservable())");
        return merge2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeAll(@NotNull Observable<Observable<T>> mergeAll) {
        Intrinsics.checkParameterIsNotNull(mergeAll, "$this$mergeAll");
        Observable<T> observable = (Observable<T>) mergeAll.flatMap(C11192d.f66312a);
        Intrinsics.checkExpressionValueIsNotNull(observable, "flatMap { it }");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeDelayError(@NotNull Iterable<? extends Observable<? extends T>> mergeDelayError) {
        Intrinsics.checkParameterIsNotNull(mergeDelayError, "$this$mergeDelayError");
        Observable<T> mergeDelayError2 = Observable.mergeDelayError(toObservable(mergeDelayError));
        Intrinsics.checkExpressionValueIsNotNull(mergeDelayError2, "Observable.mergeDelayError(this.toObservable())");
        return mergeDelayError2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final /* synthetic */ <R> Observable<R> ofType(@NotNull Observable<?> ofType) {
        Intrinsics.checkParameterIsNotNull(ofType, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable = (Observable<R>) ofType.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable, "ofType(R::class.java)");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> switchLatest(@NotNull Observable<Observable<T>> switchLatest) {
        Intrinsics.checkParameterIsNotNull(switchLatest, "$this$switchLatest");
        Observable<T> observable = (Observable<T>) switchLatest.switchMap(C11193e.f66313a);
        Intrinsics.checkExpressionValueIsNotNull(observable, "switchMap { it }");
        return observable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> switchOnNext(@NotNull Observable<Observable<T>> switchOnNext) {
        Intrinsics.checkParameterIsNotNull(switchOnNext, "$this$switchOnNext");
        Observable<T> switchOnNext2 = Observable.switchOnNext(switchOnNext);
        Intrinsics.checkExpressionValueIsNotNull(switchOnNext2, "Observable.switchOnNext(this)");
        return switchOnNext2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Observable<Pair<A, B>> toMap) {
        Intrinsics.checkParameterIsNotNull(toMap, "$this$toMap");
        Single<Map<A, B>> single = (Single<Map<A, B>>) toMap.toMap(C11194f.f66314a, C11195g.f66315a);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Observable<Pair<A, B>> toMultimap) {
        Intrinsics.checkParameterIsNotNull(toMultimap, "$this$toMultimap");
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) toMultimap.toMultimap(C11196h.f66316a, C11197i.f66317a);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Boolean> toObservable(@NotNull boolean[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> zip(@NotNull Iterable<? extends Observable<T>> zip, @NotNull final Function1<? super List<? extends T>, ? extends R> zipFunction) {
        Intrinsics.checkParameterIsNotNull(zip, "$this$zip");
        Intrinsics.checkParameterIsNotNull(zipFunction, "zipFunction");
        Observable<R> zip2 = Observable.zip(zip, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt$zip$1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Function1 function1 = Function1.this;
                List asList = ArraysKt___ArraysJvmKt.asList(it);
                ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(asList, 10));
                for (T t : asList) {
                    if (t == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip2, "Observable.zip(this) { z…List().map { it as T }) }");
        return zip2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> concatAll(@NotNull Iterable<? extends ObservableSource<T>> concatAll) {
        Intrinsics.checkParameterIsNotNull(concatAll, "$this$concatAll");
        Observable<T> concat = Observable.concat(concatAll);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Observable.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Byte> toObservable(@NotNull byte[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Character> toObservable(@NotNull char[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Short> toObservable(@NotNull short[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull int[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Long> toObservable(@NotNull long[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Float> toObservable(@NotNull float[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Double> toObservable(@NotNull double[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull T[] toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        Observable<T> fromArray = Observable.fromArray(Arrays.copyOf(toObservable, toObservable.length));
        Intrinsics.checkExpressionValueIsNotNull(fromArray, "Observable.fromArray(*this)");
        return fromArray;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull IntProgression toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        if (toObservable.getStep() != 1 || toObservable.getLast() - toObservable.getFirst() >= Integer.MAX_VALUE) {
            Observable<Integer> fromIterable = Observable.fromIterable(toObservable);
            Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
            return fromIterable;
        }
        Observable<Integer> range = Observable.range(toObservable.getFirst(), Math.max(0, (toObservable.getLast() - toObservable.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(range, "Observable.range(first, …max(0, last - first + 1))");
        return range;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterator<? extends T> toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(m29823a(toObservable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterable<? extends T> toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        Observable<T> fromIterable = Observable.fromIterable(toObservable);
        Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
        return fromIterable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Sequence<? extends T> toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(SequencesKt___SequencesKt.asIterable(toObservable));
    }
}
