package th.p047co.dtac.android.dtacone.view.fragment.upPass;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$onViewCreated$2", m29092f = "UpPassFormFragment.kt", m29091i = {}, m29090l = {350}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$onViewCreated$2 */
/* loaded from: classes9.dex */
public final class UpPassFormFragment$onViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UpPassFormFragment this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$onViewCreated$2$1", m29092f = "UpPassFormFragment.kt", m29091i = {}, m29090l = {351}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$onViewCreated$2$1 */
    /* loaded from: classes9.dex */
    public static final class C164721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UpPassFormFragment this$0;

        /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$onViewCreated$2$1$a */
        /* loaded from: classes9.dex */
        public static final class C16473a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ UpPassFormFragment f105073a;

            public C16473a(UpPassFormFragment upPassFormFragment) {
                this.f105073a = upPassFormFragment;
            }

            /* renamed from: a */
            public final Object m3416a(boolean z, Continuation continuation) {
                UpPassViewModel upPassViewModel;
                if (z) {
                    this.f105073a.m3418p();
                    upPassViewModel = this.f105073a.f105064l;
                    if (upPassViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        upPassViewModel = null;
                    }
                    upPassViewModel.triggerRestartComplete();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m3416a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C164721(UpPassFormFragment upPassFormFragment, Continuation<? super C164721> continuation) {
            super(2, continuation);
            this.this$0 = upPassFormFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C164721(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UpPassViewModel upPassViewModel;
            Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                upPassViewModel = this.this$0.f105064l;
                if (upPassViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    upPassViewModel = null;
                }
                StateFlow<Boolean> requestRestart = upPassViewModel.getRequestRestart();
                C16473a c16473a = new C16473a(this.this$0);
                this.label = 1;
                if (requestRestart.collect(c16473a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C164721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormFragment$onViewCreated$2(UpPassFormFragment upPassFormFragment, Continuation<? super UpPassFormFragment$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = upPassFormFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassFormFragment$onViewCreated$2(this.this$0, continuation);
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
            UpPassFormFragment upPassFormFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C164721 c164721 = new C164721(upPassFormFragment, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(upPassFormFragment, state, c164721, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassFormFragment$onViewCreated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}