package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.activity.OneBuyDolActivity;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolPaymentInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolCardListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolChargeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceResponse;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolCardListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolHistoryDetailFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OneBuyDolHistoryDetailFragment$setupObserve$1 extends Lambda implements Function1<Resource<? extends Pair<? extends OneBuyDolDirectAccountResponse, ? extends OneBuyDolCardListResponse>>, Unit> {
    final /* synthetic */ OneBuyDolHistoryDetailFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolHistoryDetailFragment$setupObserve$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
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
    public OneBuyDolHistoryDetailFragment$setupObserve$1(OneBuyDolHistoryDetailFragment oneBuyDolHistoryDetailFragment) {
        super(1);
        this.this$0 = oneBuyDolHistoryDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends OneBuyDolDirectAccountResponse, ? extends OneBuyDolCardListResponse>> resource) {
        invoke2((Resource<Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse>> resource) {
        Resource<Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse>> resourceContentIfNotHandled;
        OneBuyDolChargeResponse oneBuyDolChargeResponse;
        OneBuyDolChargeResponse oneBuyDolChargeResponse2;
        OneBuyDolChargeResponse oneBuyDolChargeResponse3;
        OneBuyDolChargeResponse oneBuyDolChargeResponse4;
        OneBuyDolActivity m15963m;
        OneBuyDolPriceResponse dolPrice;
        OneBuyDolPriceResponse dolPrice2;
        OneBuyDolPriceResponse dolPrice3;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneBuyDolHistoryDetailFragment oneBuyDolHistoryDetailFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneBuyDolHistoryDetailFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneBuyDolHistoryDetailFragment.dismissLoading();
                return;
            }
        }
        oneBuyDolHistoryDetailFragment.dismissLoading();
        Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse> data = resource.getData();
        if (data != null) {
            OneBuyDolDirectAccountResponse first = data.getFirst();
            OneBuyDolCardListResponse second = data.getSecond();
            oneBuyDolChargeResponse = oneBuyDolHistoryDetailFragment.f88426q;
            int amount = (oneBuyDolChargeResponse == null || (dolPrice3 = oneBuyDolChargeResponse.getDolPrice()) == null) ? 0 : dolPrice3.getAmount();
            oneBuyDolChargeResponse2 = oneBuyDolHistoryDetailFragment.f88426q;
            float fee = (oneBuyDolChargeResponse2 == null || (dolPrice2 = oneBuyDolChargeResponse2.getDolPrice()) == null) ? 0.0f : dolPrice2.getFee();
            oneBuyDolChargeResponse3 = oneBuyDolHistoryDetailFragment.f88426q;
            OneBuyDolPriceListResponse.PriceListData priceListData = new OneBuyDolPriceListResponse.PriceListData(amount, fee, (oneBuyDolChargeResponse3 == null || (dolPrice = oneBuyDolChargeResponse3.getDolPrice()) == null) ? 0.0f : dolPrice.getTotal(), false, 8, null);
            OneBuyDolPaymentInfoFragment.Companion companion = OneBuyDolPaymentInfoFragment.Companion;
            oneBuyDolChargeResponse4 = oneBuyDolHistoryDetailFragment.f88426q;
            OneBuyDolPaymentInfoFragment newInstance = companion.newInstance((oneBuyDolChargeResponse4 == null || (r3 = oneBuyDolChargeResponse4.getSimR()) == null) ? "" : "", priceListData, second, first);
            m15963m = oneBuyDolHistoryDetailFragment.m15963m();
            m15963m.addFragment(newInstance);
        }
    }
}