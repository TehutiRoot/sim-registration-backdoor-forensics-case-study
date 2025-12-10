package th.p047co.dtac.android.dtacone.view.appOne.sellerID.fragment;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import es.dmoral.toasty.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.states.OneSelectShopState;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$3", m29092f = "OneOtherShopListFragment.kt", m29091i = {}, m29090l = {BuildConfig.VERSION_CODE}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$3 */
/* loaded from: classes10.dex */
public final class OneOtherShopListFragment$onViewCreated$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneOtherShopListFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/view/appOne/sellerID/states/OneSelectShopState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$3$1", m29092f = "OneOtherShopListFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$3$1 */
    /* loaded from: classes10.dex */
    public static final class C151511 extends SuspendLambda implements Function2<OneSelectShopState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneOtherShopListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C151511(OneOtherShopListFragment oneOtherShopListFragment, Continuation<? super C151511> continuation) {
            super(2, continuation);
            this.this$0 = oneOtherShopListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C151511 c151511 = new C151511(this.this$0, continuation);
            c151511.L$0 = obj;
            return c151511;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GetProfileViewModel getProfileViewModel;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneSelectShopState oneSelectShopState = (OneSelectShopState) this.L$0;
                if (oneSelectShopState instanceof OneSelectShopState.Success) {
                    getProfileViewModel = this.this$0.f97096j;
                    if (getProfileViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("getProfileViewModel");
                        getProfileViewModel = null;
                    }
                    getProfileViewModel.getUserProfile(false);
                } else {
                    boolean z = oneSelectShopState instanceof OneSelectShopState.Error;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneSelectShopState oneSelectShopState, @Nullable Continuation<? super Unit> continuation) {
            return ((C151511) create(oneSelectShopState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOtherShopListFragment$onViewCreated$1$3(OneOtherShopListFragment oneOtherShopListFragment, Continuation<? super OneOtherShopListFragment$onViewCreated$1$3> continuation) {
        super(2, continuation);
        this.this$0 = oneOtherShopListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneOtherShopListFragment$onViewCreated$1$3(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OneSellerViewModel oneSellerViewModel;
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
            oneSellerViewModel = this.this$0.f97095i;
            if (oneSellerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopListViewModel");
                oneSellerViewModel = null;
            }
            StateFlow<OneSelectShopState> selectShopState = oneSellerViewModel.getSelectShopState();
            C151511 c151511 = new C151511(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(selectShopState, c151511, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneOtherShopListFragment$onViewCreated$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}