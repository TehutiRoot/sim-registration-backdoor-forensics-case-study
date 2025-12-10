package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__ZipKt {
    /* renamed from: b */
    public static final /* synthetic */ Flow m27207b(Iterable iterable, Function2 function2) {
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3((Flow[]) CollectionsKt___CollectionsKt.toList(iterable).toArray(new Flow[0]), function2);
    }

    /* renamed from: c */
    public static final Flow m27206c(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt.flowCombine(flow, flow2, function3);
    }

    /* renamed from: d */
    public static final Flow m27205d(Flow flow, Flow flow2, Flow flow3, final Function4 function4) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            @Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, m29142d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m29092f = "Zip.kt", m29091i = {}, m29090l = {333, 262}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n120#2,4:333\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 */
            /* loaded from: classes6.dex */
            public static final class C120942 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function4 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120942(Continuation continuation, Function4 function4) {
                    super(3, continuation);
                    this.$transform$inlined = function4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Function4 function4 = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        InlineMarker.mark(6);
                        obj = function4.invoke(obj2, obj3, obj4, this);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                public final Object invoke(@NotNull FlowCollector<Object> flowCollector, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                    C120942 c120942 = new C120942(continuation, this.$transform$inlined);
                    c120942.L$0 = flowCollector;
                    c120942.L$1 = objArr;
                    return c120942.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                Function0 m27193p;
                Flow[] flowArr2 = flowArr;
                m27193p = FlowKt__ZipKt.m27193p();
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, m27193p, new C120942(null, function4), continuation);
                if (combineInternal == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
                    return combineInternal;
                }
                return Unit.INSTANCE;
            }
        };
    }

    /* renamed from: e */
    public static final Flow m27204e(Flow flow, Flow flow2, Flow flow3, Flow flow4, final Function5 function5) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            @Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, m29142d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m29092f = "Zip.kt", m29091i = {}, m29090l = {333, 262}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n157#2,5:333\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 */
            /* loaded from: classes6.dex */
            public static final class C120952 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function5 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120952(Continuation continuation, Function5 function5) {
                    super(3, continuation);
                    this.$transform$inlined = function5;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Function5 function5 = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        InlineMarker.mark(6);
                        obj = function5.invoke(obj2, obj3, obj4, obj5, this);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                public final Object invoke(@NotNull FlowCollector<Object> flowCollector, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                    C120952 c120952 = new C120952(continuation, this.$transform$inlined);
                    c120952.L$0 = flowCollector;
                    c120952.L$1 = objArr;
                    return c120952.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                Function0 m27193p;
                Flow[] flowArr2 = flowArr;
                m27193p = FlowKt__ZipKt.m27193p();
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, m27193p, new C120952(null, function5), continuation);
                if (combineInternal == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
                    return combineInternal;
                }
                return Unit.INSTANCE;
            }
        };
    }

    /* renamed from: f */
    public static final Flow m27203f(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, final Function6 function6) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            @Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, m29142d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m29092f = "Zip.kt", m29091i = {}, m29090l = {333, 262}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n198#2,6:333\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 */
            /* loaded from: classes6.dex */
            public static final class C120962 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function6 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120962(Continuation continuation, Function6 function6) {
                    super(3, continuation);
                    this.$transform$inlined = function6;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Function6 function6 = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        InlineMarker.mark(6);
                        obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, this);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                public final Object invoke(@NotNull FlowCollector<Object> flowCollector, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                    C120962 c120962 = new C120962(continuation, this.$transform$inlined);
                    c120962.L$0 = flowCollector;
                    c120962.L$1 = objArr;
                    return c120962.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                Function0 m27193p;
                Flow[] flowArr2 = flowArr;
                m27193p = FlowKt__ZipKt.m27193p();
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, m27193p, new C120962(null, function6), continuation);
                if (combineInternal == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
                    return combineInternal;
                }
                return Unit.INSTANCE;
            }
        };
    }

    /* renamed from: g */
    public static final /* synthetic */ Flow m27202g(Flow[] flowArr, Function2 function2) {
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(flowArr, function2);
    }

    /* renamed from: h */
    public static final /* synthetic */ Flow m27201h(Iterable iterable, Function3 function3) {
        Intrinsics.needClassReification();
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$7((Flow[]) CollectionsKt___CollectionsKt.toList(iterable).toArray(new Flow[0]), function3, null));
    }

    /* renamed from: i */
    public static final Flow m27200i(Flow flow, Flow flow2, Function4 function4) {
        return FlowKt.flow(new C12101xd7c321e7(new Flow[]{flow, flow2}, null, function4));
    }

    /* renamed from: j */
    public static final Flow m27199j(Flow flow, Flow flow2, Flow flow3, Function5 function5) {
        return FlowKt.flow(new C12103xd7c321e8(new Flow[]{flow, flow2, flow3}, null, function5));
    }

    /* renamed from: k */
    public static final Flow m27198k(Flow flow, Flow flow2, Flow flow3, Flow flow4, Function6 function6) {
        return FlowKt.flow(new C12105xd7c321e9(new Flow[]{flow, flow2, flow3, flow4}, null, function6));
    }

    /* renamed from: l */
    public static final Flow m27197l(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, Function7 function7) {
        return FlowKt.flow(new C12107xd7c321ea(new Flow[]{flow, flow2, flow3, flow4, flow5}, null, function7));
    }

    /* renamed from: m */
    public static final /* synthetic */ Flow m27196m(Flow[] flowArr, Function3 function3) {
        Intrinsics.needClassReification();
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$6(flowArr, function3, null));
    }

    /* renamed from: n */
    public static final Flow m27195n(final Flow flow, final Flow flow2, final Function3 function3) {
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation<? super Unit> continuation) {
                Function0 m27193p;
                Flow[] flowArr = {Flow.this, flow2};
                m27193p = FlowKt__ZipKt.m27193p();
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr, m27193p, new FlowKt__ZipKt$combine$1$1(function3, null), continuation);
                if (combineInternal == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
                    return combineInternal;
                }
                return Unit.INSTANCE;
            }
        };
    }

    /* renamed from: o */
    public static final Flow m27194o(Flow flow, Flow flow2, Function4 function4) {
        return FlowKt.flow(new C12099xd7c321e6(new Flow[]{flow, flow2}, null, function4));
    }

    /* renamed from: p */
    public static final Function0 m27193p() {
        return FlowKt__ZipKt$nullArrayFactory$1.INSTANCE;
    }

    /* renamed from: q */
    public static final Flow m27192q(Flow flow, Flow flow2, Function3 function3) {
        return CombineKt.zipImpl(flow, flow2, function3);
    }
}