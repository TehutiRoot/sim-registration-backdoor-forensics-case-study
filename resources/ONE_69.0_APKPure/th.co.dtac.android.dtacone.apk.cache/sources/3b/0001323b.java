package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneMaxAllowApproveState;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpReadSmartCardFragment$setupObserve$1$5", m29092f = "OneMnpReadSmartCardFragment.kt", m29091i = {}, m29090l = {238}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpReadSmartCardFragment$setupObserve$1$5 */
/* loaded from: classes10.dex */
public final class OneMnpReadSmartCardFragment$setupObserve$1$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpReadSmartCardFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneMaxAllowApproveState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpReadSmartCardFragment$setupObserve$1$5$1", m29092f = "OneMnpReadSmartCardFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpReadSmartCardFragment$setupObserve$1$5$1 */
    /* loaded from: classes10.dex */
    public static final class C147571 extends SuspendLambda implements Function2<OneMaxAllowApproveState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpReadSmartCardFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147571(OneMnpReadSmartCardFragment oneMnpReadSmartCardFragment, Continuation<? super C147571> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpReadSmartCardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147571 c147571 = new C147571(this.this$0, continuation);
            c147571.L$0 = obj;
            return c147571;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneMaxAllowApproveState oneMaxAllowApproveState = (OneMaxAllowApproveState) this.L$0;
                if (oneMaxAllowApproveState instanceof OneMaxAllowApproveState.Success) {
                    this.this$0.dismissLoading();
                    this.this$0.m13787q().replaceFragment(OneMnpCustomerCameraFragment.Companion.newInstance(), null);
                } else if (oneMaxAllowApproveState instanceof OneMaxAllowApproveState.Error) {
                    this.this$0.dismissLoading();
                } else if (oneMaxAllowApproveState instanceof OneMaxAllowApproveState.Loading) {
                    this.this$0.showLoading();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneMaxAllowApproveState oneMaxAllowApproveState, @Nullable Continuation<? super Unit> continuation) {
            return ((C147571) create(oneMaxAllowApproveState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpReadSmartCardFragment$setupObserve$1$5(OneMnpViewModel oneMnpViewModel, OneMnpReadSmartCardFragment oneMnpReadSmartCardFragment, Continuation<? super OneMnpReadSmartCardFragment$setupObserve$1$5> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpReadSmartCardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpReadSmartCardFragment$setupObserve$1$5(this.$this_apply, this.this$0, continuation);
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
            C147571 c147571 = new C147571(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(maxAllowApproveState, c147571, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpReadSmartCardFragment$setupObserve$1$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}