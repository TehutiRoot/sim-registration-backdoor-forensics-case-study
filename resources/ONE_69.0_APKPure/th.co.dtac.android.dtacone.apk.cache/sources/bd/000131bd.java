package th.p047co.dtac.android.dtacone.view.appOne.mnp.activity;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneMaxAllowApproveState;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity$setupObserve$1$7", m29092f = "OneMnpActivity.kt", m29091i = {}, m29090l = {398}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity$setupObserve$1$7 */
/* loaded from: classes10.dex */
public final class OneMnpActivity$setupObserve$1$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpActivity this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneMaxAllowApproveState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity$setupObserve$1$7$1", m29092f = "OneMnpActivity.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity$setupObserve$1$7$1 */
    /* loaded from: classes10.dex */
    public static final class C147371 extends SuspendLambda implements Function2<OneMaxAllowApproveState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147371(OneMnpActivity oneMnpActivity, Continuation<? super C147371> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147371 c147371 = new C147371(this.this$0, continuation);
            c147371.L$0 = obj;
            return c147371;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            MutableStateFlow mutableStateFlow3;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneMaxAllowApproveState oneMaxAllowApproveState = (OneMaxAllowApproveState) this.L$0;
                if (oneMaxAllowApproveState instanceof OneMaxAllowApproveState.Loading) {
                    mutableStateFlow3 = this.this$0.f91349u;
                    mutableStateFlow3.setValue(Boxing.boxBoolean(true));
                } else if (oneMaxAllowApproveState instanceof OneMaxAllowApproveState.Success) {
                    mutableStateFlow2 = this.this$0.f91349u;
                    mutableStateFlow2.setValue(Boxing.boxBoolean(false));
                    this.this$0.m13998k0();
                } else if (oneMaxAllowApproveState instanceof OneMaxAllowApproveState.Error) {
                    mutableStateFlow = this.this$0.f91349u;
                    mutableStateFlow.setValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneMaxAllowApproveState oneMaxAllowApproveState, @Nullable Continuation<? super Unit> continuation) {
            return ((C147371) create(oneMaxAllowApproveState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpActivity$setupObserve$1$7(OneMnpViewModel oneMnpViewModel, OneMnpActivity oneMnpActivity, Continuation<? super OneMnpActivity$setupObserve$1$7> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpActivity$setupObserve$1$7(this.$this_apply, this.this$0, continuation);
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
            StateFlow<OneMaxAllowApproveState> maxAllowApproveState = this.$this_apply.getMaxAllowApproveState();
            C147371 c147371 = new C147371(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(maxAllowApproveState, c147371, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpActivity$setupObserve$1$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}