package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1", m29092f = "ProcessErrorSharedFlow.kt", m29091i = {}, m29090l = {23}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1 */
/* loaded from: classes10.dex */
public final class ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<CommonErrorResponse> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isShowError$delegate;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ SharedFlow<CommonErrorResponse> $onProcessError;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1$1", m29092f = "ProcessErrorSharedFlow.kt", m29091i = {}, m29090l = {24}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1$1 */
    /* loaded from: classes10.dex */
    public static final class C153301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<CommonErrorResponse> $error$delegate;
        final /* synthetic */ MutableState<Boolean> $isShowError$delegate;
        final /* synthetic */ SharedFlow<CommonErrorResponse> $onProcessError;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1$1$1", m29092f = "ProcessErrorSharedFlow.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C153311 extends SuspendLambda implements Function2<CommonErrorResponse, Continuation<? super Unit>, Object> {
            final /* synthetic */ MutableState<CommonErrorResponse> $error$delegate;
            final /* synthetic */ MutableState<Boolean> $isShowError$delegate;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C153311(MutableState<CommonErrorResponse> mutableState, MutableState<Boolean> mutableState2, Continuation<? super C153311> continuation) {
                super(2, continuation);
                this.$error$delegate = mutableState;
                this.$isShowError$delegate = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C153311 c153311 = new C153311(this.$error$delegate, this.$isShowError$delegate, continuation);
                c153311.L$0 = obj;
                return c153311;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ProcessErrorSharedFlowKt.m9592b(this.$error$delegate, (CommonErrorResponse) this.L$0);
                    ProcessErrorSharedFlowKt.m9590d(this.$isShowError$delegate, true);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CommonErrorResponse commonErrorResponse, @Nullable Continuation<? super Unit> continuation) {
                return ((C153311) create(commonErrorResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153301(SharedFlow<CommonErrorResponse> sharedFlow, MutableState<CommonErrorResponse> mutableState, MutableState<Boolean> mutableState2, Continuation<? super C153301> continuation) {
            super(2, continuation);
            this.$onProcessError = sharedFlow;
            this.$error$delegate = mutableState;
            this.$isShowError$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C153301(this.$onProcessError, this.$error$delegate, this.$isShowError$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SharedFlow<CommonErrorResponse> sharedFlow = this.$onProcessError;
                C153311 c153311 = new C153311(this.$error$delegate, this.$isShowError$delegate, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c153311, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C153301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1(Lifecycle lifecycle, SharedFlow<CommonErrorResponse> sharedFlow, MutableState<CommonErrorResponse> mutableState, MutableState<Boolean> mutableState2, Continuation<? super ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$onProcessError = sharedFlow;
        this.$error$delegate = mutableState;
        this.$isShowError$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1(this.$lifecycle, this.$onProcessError, this.$error$delegate, this.$isShowError$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C153301 c153301 = new C153301(this.$onProcessError, this.$error$delegate, this.$isShowError$delegate, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c153301, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}