package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneDirectAccountListModel;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneBuyDolChargeV2Request;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolVerifyOtpFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OneBuyDolVerifyOtpFragment$setupObserve$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneBuyDolVerifyOtpFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolVerifyOtpFragment$setupObserve$1$WhenMappings */
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
    public OneBuyDolVerifyOtpFragment$setupObserve$1(OneBuyDolVerifyOtpFragment oneBuyDolVerifyOtpFragment) {
        super(1);
        this.this$0 = oneBuyDolVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        OneBuyDolViewModel m15917r;
        String str;
        OneDirectAccountListModel oneDirectAccountListModel;
        OneDirectAccountListModel oneDirectAccountListModel2;
        OneDirectAccountListModel oneDirectAccountListModel3;
        OneBuyDolPriceListResponse.PriceListData priceListData;
        OneBuyDolPriceListResponse.PriceListData priceListData2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneBuyDolVerifyOtpFragment oneBuyDolVerifyOtpFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneBuyDolVerifyOtpFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneBuyDolVerifyOtpFragment.dismissLoading();
                return;
            }
        }
        oneBuyDolVerifyOtpFragment.dismissLoading();
        oneBuyDolVerifyOtpFragment.m15920o();
        m15917r = oneBuyDolVerifyOtpFragment.m15917r();
        OneBuyDolChargeV2Request.CREATOR creator = OneBuyDolChargeV2Request.CREATOR;
        str = oneBuyDolVerifyOtpFragment.f88498i;
        String data = resourceContentIfNotHandled.getData();
        if (data == null) {
            data = "";
        }
        oneDirectAccountListModel = oneBuyDolVerifyOtpFragment.f88499j;
        String str2 = (oneDirectAccountListModel == null || (str2 = oneDirectAccountListModel.getAccountPayment()) == null) ? "" : "";
        oneDirectAccountListModel2 = oneBuyDolVerifyOtpFragment.f88499j;
        String str3 = (oneDirectAccountListModel2 == null || (str3 = oneDirectAccountListModel2.getBankCode()) == null) ? "" : "";
        oneDirectAccountListModel3 = oneBuyDolVerifyOtpFragment.f88499j;
        String str4 = (oneDirectAccountListModel3 == null || (str4 = oneDirectAccountListModel3.getAliasBankName()) == null) ? "" : "";
        priceListData = oneBuyDolVerifyOtpFragment.f88501l;
        int amount = priceListData != null ? priceListData.getAmount() : 0;
        priceListData2 = oneBuyDolVerifyOtpFragment.f88501l;
        m15917r.chargeBankAccount(creator.createRequestChargeDirectAccount(str, data, str2, str3, str4, amount, priceListData2 != null ? priceListData2.getFee() : 0.0f));
    }
}