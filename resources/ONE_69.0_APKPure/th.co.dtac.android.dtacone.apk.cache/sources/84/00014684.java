package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberDataResponse;
import th.p047co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberDataResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$7 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$setUpViewModel$1$7 extends Lambda implements Function1<Resource<? extends Pair<? extends String, ? extends OneTopUpCheckSubscriberDataResponse>>, Unit> {
    final /* synthetic */ OneTopUpViewModel $this_apply;
    final /* synthetic */ OneTopupPriceListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$7$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopupPriceListFragment$setUpViewModel$1$7(OneTopupPriceListFragment oneTopupPriceListFragment, OneTopUpViewModel oneTopUpViewModel) {
        super(1);
        this.this$0 = oneTopupPriceListFragment;
        this.$this_apply = oneTopUpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends String, ? extends OneTopUpCheckSubscriberDataResponse>> resource) {
        invoke2((Resource<Pair<String, OneTopUpCheckSubscriberDataResponse>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<String, OneTopUpCheckSubscriberDataResponse>> resource) {
        Resource<Pair<String, OneTopUpCheckSubscriberDataResponse>> resourceContentIfNotHandled;
        ConstraintLayout constraintLayout;
        OneTopUpCheckSubscriberDataResponse second;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneTopupPriceListFragment oneTopupPriceListFragment = this.this$0;
        OneTopUpViewModel oneTopUpViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            oneTopupPriceListFragment.showLoading();
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            oneTopupPriceListFragment.dismissLoading();
        } else {
            Pair<String, OneTopUpCheckSubscriberDataResponse> data = resourceContentIfNotHandled.getData();
            if ((data == null || (second = data.getSecond()) == null) ? false : Intrinsics.areEqual(second.getDisplayBalance(), Boolean.TRUE)) {
                String first = resourceContentIfNotHandled.getData().getFirst();
                OneTopUpCheckSubscriberDataResponse second2 = resourceContentIfNotHandled.getData().getSecond();
                oneTopUpViewModel.getMainBalance(first, (second2 == null || (r5 = second2.getCustomerNumber()) == null) ? "" : "");
                return;
            }
            oneTopupPriceListFragment.dismissLoading();
            constraintLayout = oneTopupPriceListFragment.f98460Q;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceLayout");
                constraintLayout = null;
            }
            ViewVisibleExtKt.toGone(constraintLayout);
        }
    }
}