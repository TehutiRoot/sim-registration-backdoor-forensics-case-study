package io.reactivex.rxkotlin;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(m29143d1 = {"\u0000¸\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u000bH\u0007¢\u0006\u0004\b\u0003\u0010\r\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0011H\u0007¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0016\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0017H\u0007¢\u0006\u0004\b\u0003\u0010\u0019\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007¢\u0006\u0004\b\u0003\u0010\u001d\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u001eH\u0007¢\u0006\u0004\b\u0003\u0010\u001f\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0004\b\u0003\u0010!\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b\u0003\u0010#\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b\u0003\u0010%\u001a1\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007¢\u0006\u0004\b&\u0010#\u001a1\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007¢\u0006\u0004\b'\u0010#\u001aP\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0)H\u0087\b¢\u0006\u0004\b+\u0010,\u001ae\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00010)H\u0087\b¢\u0006\u0004\b2\u00103\u001ae\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00104\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00010)H\u0087\b¢\u0006\u0004\b5\u00103\u001a*\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¢\u0006\u0004\b6\u00107\u001a*\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¢\u0006\u0004\b8\u00107\u001a)\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000 H\u0002¢\u0006\u0004\b9\u0010:\u001aM\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b2\u0010=\u001ak\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020A0\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a\"\b\b\u0002\u0010>*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0007¢\u0006\u0004\b2\u0010B\u001a/\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bC\u00107\u001a/\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bD\u00107\u001a/\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bE\u00107\u001a/\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bF\u00107\u001aK\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J0I\"\b\b\u0000\u0010G*\u00020\u001a\"\b\b\u0001\u0010H*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u0001H\u0007¢\u0006\u0004\bK\u0010L\u001aQ\u0010N\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010M0J0I\"\b\b\u0000\u0010G*\u00020\u001a\"\b\b\u0001\u0010H*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u0001H\u0007¢\u0006\u0004\bN\u0010L\u001a/\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000O0\"H\u0007¢\u0006\u0004\bD\u0010#¨\u0006P"}, m29142d2 = {"", "Lio/reactivex/Flowable;", "", "toFlowable", "([Z)Lio/reactivex/Flowable;", "", "", "([B)Lio/reactivex/Flowable;", "", "", "([C)Lio/reactivex/Flowable;", "", "", "([S)Lio/reactivex/Flowable;", "", "", "([I)Lio/reactivex/Flowable;", "", "", "([J)Lio/reactivex/Flowable;", "", "", "([F)Lio/reactivex/Flowable;", "", "", "([D)Lio/reactivex/Flowable;", "", "T", "", "([Ljava/lang/Object;)Lio/reactivex/Flowable;", "Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/IntProgression;)Lio/reactivex/Flowable;", "", "(Ljava/util/Iterator;)Lio/reactivex/Flowable;", "", "(Ljava/lang/Iterable;)Lio/reactivex/Flowable;", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Lio/reactivex/Flowable;", "merge", "mergeDelayError", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;", "zipFunction", "zip", "cast", "(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "ofType", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Iterator;)Ljava/lang/Iterable;", "flowable", "Lkotlin/Pair;", "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", PDBorderStyleDictionary.STYLE_UNDERLINE, "flowable1", "flowable2", "Lkotlin/Triple;", "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "mergeAll", "concatAll", "switchLatest", "switchOnNext", "A", "B", "Lio/reactivex/Single;", "", "toMap", "(Lio/reactivex/Flowable;)Lio/reactivex/Single;", "", "toMultimap", "Lorg/reactivestreams/Publisher;", "rxkotlin"}, m29141k = 2, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class FlowableKt {

    /* renamed from: io.reactivex.rxkotlin.FlowableKt$a */
    /* loaded from: classes5.dex */
    public static final class C11157a implements Function {

        /* renamed from: a */
        public static final C11157a f66318a = new C11157a();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Flowable apply(Flowable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowableKt$b */
    /* loaded from: classes5.dex */
    public static final class C11158b implements Function {

        /* renamed from: a */
        public static final C11158b f66319a = new C11158b();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Flowable apply(Flowable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowableKt$c */
    /* loaded from: classes5.dex */
    public static final class C11159c implements Function {

        /* renamed from: a */
        public static final C11159c f66320a = new C11159c();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Flowable apply(Flowable it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it;
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowableKt$d */
    /* loaded from: classes5.dex */
    public static final class C11160d implements Function {

        /* renamed from: a */
        public static final C11160d f66321a = new C11160d();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getFirst();
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowableKt$e */
    /* loaded from: classes5.dex */
    public static final class C11161e implements Function {

        /* renamed from: a */
        public static final C11161e f66322a = new C11161e();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getSecond();
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowableKt$f */
    /* loaded from: classes5.dex */
    public static final class C11162f implements Function {

        /* renamed from: a */
        public static final C11162f f66323a = new C11162f();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getFirst();
        }
    }

    /* renamed from: io.reactivex.rxkotlin.FlowableKt$g */
    /* loaded from: classes5.dex */
    public static final class C11163g implements Function {

        /* renamed from: a */
        public static final C11163g f66324a = new C11163g();

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public final Object apply(Pair it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return it.getSecond();
        }
    }

    /* renamed from: a */
    public static final Iterable m30183a(Iterator it) {
        return new FlowableKt$toIterable$1(it);
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> cast(@NotNull Flowable<?> cast) {
        Intrinsics.checkParameterIsNotNull(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable = (Flowable<R>) cast.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "cast(R::class.java)");
        return flowable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> combineLatest(@NotNull Iterable<? extends Flowable<T>> combineLatest, @NotNull final Function1<? super List<? extends T>, ? extends R> combineFunction) {
        Intrinsics.checkParameterIsNotNull(combineLatest, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(combineFunction, "combineFunction");
        Flowable<R> combineLatest2 = Flowable.combineLatest(combineLatest, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt$combineLatest$1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Function1 function1 = Function1.this;
                List asList = ArraysKt___ArraysJvmKt.asList(it);
                ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(asList, 10));
                for (T t : asList) {
                    if (t == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Flowable.combineLatest(t…List().map { it as T }) }");
        return combineLatest2;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Flowable<Flowable<T>> concatAll) {
        Intrinsics.checkParameterIsNotNull(concatAll, "$this$concatAll");
        Flowable<T> flowable = (Flowable<T>) concatAll.concatMap(C11157a.f66318a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "concatMap { it }");
        return flowable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> flatMapSequence(@NotNull Flowable<T> flatMapSequence, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> body) {
        Intrinsics.checkParameterIsNotNull(flatMapSequence, "$this$flatMapSequence");
        Intrinsics.checkParameterIsNotNull(body, "body");
        Flowable<R> flatMap = flatMapSequence.flatMap(new Function<T, Publisher<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt$flatMapSequence$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((FlowableKt$flatMapSequence$1<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            @NotNull
            public final Flowable<R> apply(@NotNull T it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return FlowableKt.toFlowable((Sequence) Function1.this.invoke(it));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flatMap, "flatMap { body(it).toFlowable() }");
        return flatMap;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> merge(@NotNull Iterable<? extends Flowable<? extends T>> merge) {
        Intrinsics.checkParameterIsNotNull(merge, "$this$merge");
        Flowable<T> merge2 = Flowable.merge(toFlowable(merge));
        Intrinsics.checkExpressionValueIsNotNull(merge2, "Flowable.merge(this.toFlowable())");
        return merge2;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAll(@NotNull Flowable<Flowable<T>> mergeAll) {
        Intrinsics.checkParameterIsNotNull(mergeAll, "$this$mergeAll");
        Flowable<T> flowable = (Flowable<T>) mergeAll.flatMap(C11158b.f66319a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "flatMap { it }");
        return flowable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeDelayError(@NotNull Iterable<? extends Flowable<? extends T>> mergeDelayError) {
        Intrinsics.checkParameterIsNotNull(mergeDelayError, "$this$mergeDelayError");
        Flowable<T> mergeDelayError2 = Flowable.mergeDelayError(toFlowable(mergeDelayError));
        Intrinsics.checkExpressionValueIsNotNull(mergeDelayError2, "Flowable.mergeDelayError(this.toFlowable())");
        return mergeDelayError2;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> ofType(@NotNull Flowable<?> ofType) {
        Intrinsics.checkParameterIsNotNull(ofType, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable = (Flowable<R>) ofType.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "ofType(R::class.java)");
        return flowable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchLatest(@NotNull Flowable<Flowable<T>> switchLatest) {
        Intrinsics.checkParameterIsNotNull(switchLatest, "$this$switchLatest");
        Flowable<T> flowable = (Flowable<T>) switchLatest.switchMap(C11159c.f66320a);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "switchMap { it }");
        return flowable;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchOnNext(@NotNull Flowable<Flowable<T>> switchOnNext) {
        Intrinsics.checkParameterIsNotNull(switchOnNext, "$this$switchOnNext");
        Flowable<T> switchOnNext2 = Flowable.switchOnNext(switchOnNext);
        Intrinsics.checkExpressionValueIsNotNull(switchOnNext2, "Flowable.switchOnNext(this)");
        return switchOnNext2;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Boolean> toFlowable(@NotNull boolean[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Flowable<Pair<A, B>> toMap) {
        Intrinsics.checkParameterIsNotNull(toMap, "$this$toMap");
        Single<Map<A, B>> single = (Single<Map<A, B>>) toMap.toMap(C11160d.f66321a, C11161e.f66322a);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Flowable<Pair<A, B>> toMultimap) {
        Intrinsics.checkParameterIsNotNull(toMultimap, "$this$toMultimap");
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) toMultimap.toMultimap(C11162f.f66323a, C11163g.f66324a);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> zip(@NotNull Iterable<? extends Flowable<T>> zip, @NotNull final Function1<? super List<? extends T>, ? extends R> zipFunction) {
        Intrinsics.checkParameterIsNotNull(zip, "$this$zip");
        Intrinsics.checkParameterIsNotNull(zipFunction, "zipFunction");
        Flowable<R> zip2 = Flowable.zip(zip, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt$zip$1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Function1 function1 = Function1.this;
                List asList = ArraysKt___ArraysJvmKt.asList(it);
                ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(asList, 10));
                for (T t : asList) {
                    if (t == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip2, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return zip2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [z30] */
    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<Pair<T, R>> combineLatest(@NotNull Flowable<T> combineLatest, @NotNull Flowable<R> flowable) {
        Intrinsics.checkParameterIsNotNull(combineLatest, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(flowable, "flowable");
        FlowableKt$combineLatest$2 flowableKt$combineLatest$2 = FlowableKt$combineLatest$2.INSTANCE;
        if (flowableKt$combineLatest$2 != null) {
            flowableKt$combineLatest$2 = new C23311z30(flowableKt$combineLatest$2);
        }
        Flowable<Pair<T, R>> combineLatest2 = Flowable.combineLatest(combineLatest, flowable, (BiFunction) flowableKt$combineLatest$2);
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return combineLatest2;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends Publisher<T>> concatAll) {
        Intrinsics.checkParameterIsNotNull(concatAll, "$this$concatAll");
        Flowable<T> concat = Flowable.concat(concatAll);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Flowable.concat(this)");
        return concat;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Byte> toFlowable(@NotNull byte[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [A30] */
    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R, U> Flowable<Triple<T, R, U>> combineLatest(@NotNull Flowable<T> combineLatest, @NotNull Flowable<R> flowable1, @NotNull Flowable<U> flowable2) {
        Intrinsics.checkParameterIsNotNull(combineLatest, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(flowable1, "flowable1");
        Intrinsics.checkParameterIsNotNull(flowable2, "flowable2");
        FlowableKt$combineLatest$3 flowableKt$combineLatest$3 = FlowableKt$combineLatest$3.INSTANCE;
        if (flowableKt$combineLatest$3 != null) {
            flowableKt$combineLatest$3 = new A30(flowableKt$combineLatest$3);
        }
        Flowable<Triple<T, R, U>> combineLatest2 = Flowable.combineLatest(combineLatest, flowable1, flowable2, (Function3) flowableKt$combineLatest$3);
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return combineLatest2;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Character> toFlowable(@NotNull char[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Short> toFlowable(@NotNull short[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Integer> toFlowable(@NotNull int[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Long> toFlowable(@NotNull long[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Float> toFlowable(@NotNull float[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Double> toFlowable(@NotNull double[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(@NotNull T[] toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        Flowable<T> fromArray = Flowable.fromArray(Arrays.copyOf(toFlowable, toFlowable.length));
        Intrinsics.checkExpressionValueIsNotNull(fromArray, "Flowable.fromArray(*this)");
        return fromArray;
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final Flowable<Integer> toFlowable(@NotNull IntProgression toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        if (toFlowable.getStep() != 1 || toFlowable.getLast() - toFlowable.getFirst() >= Integer.MAX_VALUE) {
            Flowable<Integer> fromIterable = Flowable.fromIterable(toFlowable);
            Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Flowable.fromIterable(this)");
            return fromIterable;
        }
        Flowable<Integer> range = Flowable.range(toFlowable.getFirst(), Math.max(0, (toFlowable.getLast() - toFlowable.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(range, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return range;
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Iterator<? extends T> toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(m30183a(toFlowable));
    }

    @NotNull
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(@NotNull Iterable<? extends T> toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        Flowable<T> fromIterable = Flowable.fromIterable(toFlowable);
        Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Flowable.fromIterable(this)");
        return fromIterable;
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Sequence<? extends T> toFlowable) {
        Intrinsics.checkParameterIsNotNull(toFlowable, "$this$toFlowable");
        return toFlowable(SequencesKt___SequencesKt.asIterable(toFlowable));
    }
}