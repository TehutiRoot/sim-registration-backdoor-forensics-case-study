package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneBuyDolPriceListBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.activity.OneBuyDolActivity;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolPaymentInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolCardListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceListResponse;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolCardListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolPriceListFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OneBuyDolPriceListFragment$setupObserve$2 extends Lambda implements Function1<Resource<? extends Pair<? extends OneBuyDolDirectAccountResponse, ? extends OneBuyDolCardListResponse>>, Unit> {
    final /* synthetic */ OneBuyDolPriceListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolPriceListFragment$setupObserve$2$WhenMappings */
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
    public OneBuyDolPriceListFragment$setupObserve$2(OneBuyDolPriceListFragment oneBuyDolPriceListFragment) {
        super(1);
        this.this$0 = oneBuyDolPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends OneBuyDolDirectAccountResponse, ? extends OneBuyDolCardListResponse>> resource) {
        invoke2((Resource<Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse>> resource) {
        Resource<Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse>> resourceContentIfNotHandled;
        OneBuyDolActivity m15944p;
        FragmentOneBuyDolPriceListBinding m15945o;
        OneBuyDolActivity m15944p2;
        OneBuyDolPriceListResponse.PriceListData priceListData;
        OneBuyDolActivity m15944p3;
        OneBuyDolActivity m15944p4;
        FragmentOneBuyDolPriceListBinding m15945o2;
        OneBuyDolPriceListResponse.PriceListData priceListData2;
        OneBuyDolActivity m15944p5;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneBuyDolPriceListFragment oneBuyDolPriceListFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneBuyDolPriceListFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneBuyDolPriceListFragment.dismissLoading();
                return;
            }
        }
        oneBuyDolPriceListFragment.dismissLoading();
        Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse> data = resource.getData();
        if (data != null) {
            OneBuyDolDirectAccountResponse first = data.getFirst();
            OneBuyDolCardListResponse second = data.getSecond();
            m15944p = oneBuyDolPriceListFragment.m15944p();
            m15945o = oneBuyDolPriceListFragment.m15945o();
            m15944p.setPhone(ViewTextExtKt.toStringFormat(m15945o.oneBuyDolPhoneNumberEditText));
            m15944p2 = oneBuyDolPriceListFragment.m15944p();
            priceListData = oneBuyDolPriceListFragment.f88460k;
            OneBuyDolPriceListResponse.PriceListData priceListData3 = null;
            if (priceListData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectPrice");
                priceListData = null;
            }
            m15944p2.setSelectPrice(priceListData);
            m15944p3 = oneBuyDolPriceListFragment.m15944p();
            m15944p3.setBuyDolListCards(second);
            m15944p4 = oneBuyDolPriceListFragment.m15944p();
            m15944p4.setDirectAccounts(first);
            OneBuyDolPaymentInfoFragment.Companion companion = OneBuyDolPaymentInfoFragment.Companion;
            m15945o2 = oneBuyDolPriceListFragment.m15945o();
            String stringFormat = ViewTextExtKt.toStringFormat(m15945o2.oneBuyDolPhoneNumberEditText);
            priceListData2 = oneBuyDolPriceListFragment.f88460k;
            if (priceListData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectPrice");
            } else {
                priceListData3 = priceListData2;
            }
            OneBuyDolPaymentInfoFragment newInstance = companion.newInstance(stringFormat, priceListData3, second, first);
            m15944p5 = oneBuyDolPriceListFragment.m15944p();
            m15944p5.addFragment(newInstance);
        }
    }
}