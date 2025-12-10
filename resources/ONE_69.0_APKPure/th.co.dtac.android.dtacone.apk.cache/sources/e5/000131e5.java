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
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneCustomerPreVerifyState;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdNumberFormFragment$setUpViewModel$1$2", m29092f = "OneMnpIdNumberFormFragment.kt", m29091i = {}, m29090l = {BitmapUtil.IMAGE_180_DEGREE}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdNumberFormFragment$setUpViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneMnpIdNumberFormFragment$setUpViewModel$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpIdNumberFormFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneCustomerPreVerifyState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdNumberFormFragment$setUpViewModel$1$2$1", m29092f = "OneMnpIdNumberFormFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdNumberFormFragment$setUpViewModel$1$2$1 */
    /* loaded from: classes10.dex */
    public static final class C147401 extends SuspendLambda implements Function2<OneCustomerPreVerifyState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpIdNumberFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147401(OneMnpIdNumberFormFragment oneMnpIdNumberFormFragment, Continuation<? super C147401> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpIdNumberFormFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147401 c147401 = new C147401(this.this$0, continuation);
            c147401.L$0 = obj;
            return c147401;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OneMnpViewModel viewModel;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneCustomerPreVerifyState oneCustomerPreVerifyState = (OneCustomerPreVerifyState) this.L$0;
                if (oneCustomerPreVerifyState instanceof OneCustomerPreVerifyState.Success) {
                    this.this$0.dismissLoading();
                    viewModel = this.this$0.getViewModel();
                    viewModel.callPreVerify();
                } else if (oneCustomerPreVerifyState instanceof OneCustomerPreVerifyState.Error) {
                    this.this$0.dismissLoading();
                } else if (oneCustomerPreVerifyState instanceof OneCustomerPreVerifyState.Loading) {
                    this.this$0.showLoading();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneCustomerPreVerifyState oneCustomerPreVerifyState, @Nullable Continuation<? super Unit> continuation) {
            return ((C147401) create(oneCustomerPreVerifyState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpIdNumberFormFragment$setUpViewModel$1$2(OneMnpViewModel oneMnpViewModel, OneMnpIdNumberFormFragment oneMnpIdNumberFormFragment, Continuation<? super OneMnpIdNumberFormFragment$setUpViewModel$1$2> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpIdNumberFormFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpIdNumberFormFragment$setUpViewModel$1$2(this.$this_apply, this.this$0, continuation);
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
            StateFlow<OneCustomerPreVerifyState> customerPreVerifyState = this.$this_apply.getCustomerPreVerifyState();
            C147401 c147401 = new C147401(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(customerPreVerifyState, c147401, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpIdNumberFormFragment$setUpViewModel$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}