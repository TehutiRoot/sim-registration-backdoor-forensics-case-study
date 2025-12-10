package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolVerifyOtpFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneDirectAccountListModel;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceListResponse;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

@Metadata(m29143d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012R\u0010\u0002\u001aN\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0004 \b*&\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolPaymentInfoFragment$setObserve$1 */
/* loaded from: classes10.dex */
public final class OneBuyDolPaymentInfoFragment$setObserve$1 extends Lambda implements Function1<Resource<? extends Pair<? extends Boolean, ? extends Pair<? extends RequestOtpResponse, ? extends OneDirectAccountListModel>>>, Unit> {
    final /* synthetic */ OneBuyDolPaymentInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolPaymentInfoFragment$setObserve$1(OneBuyDolPaymentInfoFragment oneBuyDolPaymentInfoFragment) {
        super(1);
        this.this$0 = oneBuyDolPaymentInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends Boolean, ? extends Pair<? extends RequestOtpResponse, ? extends OneDirectAccountListModel>>> resource) {
        invoke2((Resource<Pair<Boolean, Pair<RequestOtpResponse, OneDirectAccountListModel>>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<Boolean, Pair<RequestOtpResponse, OneDirectAccountListModel>>> resource) {
        Resource<Pair<Boolean, Pair<RequestOtpResponse, OneDirectAccountListModel>>> resourceContentIfNotHandled;
        TabLayout tabLayout;
        WrapContentViewPager wrapContentViewPager;
        FrameLayout frameLayout;
        TextView textView;
        String str;
        OneBuyDolPriceListResponse.PriceListData priceListData;
        OneBuyDolPriceListResponse.PriceListData priceListData2;
        Pair<RequestOtpResponse, OneDirectAccountListModel> second;
        Pair<RequestOtpResponse, OneDirectAccountListModel> second2;
        TabLayout tabLayout2;
        WrapContentViewPager wrapContentViewPager2;
        FrameLayout frameLayout2;
        TextView textView2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneBuyDolPaymentInfoFragment oneBuyDolPaymentInfoFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            Pair<Boolean, Pair<RequestOtpResponse, OneDirectAccountListModel>> data = resourceContentIfNotHandled.getData();
            TextView textView3 = null;
            if (data == null || !data.getFirst().booleanValue()) {
                tabLayout = oneBuyDolPaymentInfoFragment.f88440o;
                if (tabLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                    tabLayout = null;
                }
                ViewVisibleExtKt.toInVisible(tabLayout);
                wrapContentViewPager = oneBuyDolPaymentInfoFragment.f88443r;
                if (wrapContentViewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                    wrapContentViewPager = null;
                }
                ViewVisibleExtKt.toInVisible(wrapContentViewPager);
                frameLayout = oneBuyDolPaymentInfoFragment.f88444s;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentInfoContainer");
                    frameLayout = null;
                }
                ViewVisibleExtKt.toVisible(frameLayout);
                textView = oneBuyDolPaymentInfoFragment.f88447v;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentMethodInfoDetailTextView");
                    textView = null;
                }
                textView.setText(oneBuyDolPaymentInfoFragment.getString(R.string.one_buy_dol_payment_info_check_and_verify_data));
                OneBuyDolVerifyOtpFragment.Companion companion = OneBuyDolVerifyOtpFragment.Companion;
                Pair<Boolean, Pair<RequestOtpResponse, OneDirectAccountListModel>> data2 = resource.getData();
                OneDirectAccountListModel second3 = (data2 == null || (second2 = data2.getSecond()) == null) ? null : second2.getSecond();
                str = oneBuyDolPaymentInfoFragment.f88435j;
                String international = PhoneNumberExtKt.toInternational(str);
                priceListData = oneBuyDolPaymentInfoFragment.f88438m;
                priceListData2 = oneBuyDolPaymentInfoFragment.f88438m;
                Pair<Boolean, Pair<RequestOtpResponse, OneDirectAccountListModel>> data3 = resource.getData();
                oneBuyDolPaymentInfoFragment.getChildFragmentManager().beginTransaction().replace(R.id.paymentInfoContainer, companion.newInstance(second3, international, priceListData, priceListData2, (data3 == null || (second = data3.getSecond()) == null) ? null : second.getFirst())).addToBackStack(null).commit();
                return;
            }
            tabLayout2 = oneBuyDolPaymentInfoFragment.f88440o;
            if (tabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                tabLayout2 = null;
            }
            ViewVisibleExtKt.toVisible(tabLayout2);
            wrapContentViewPager2 = oneBuyDolPaymentInfoFragment.f88443r;
            if (wrapContentViewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                wrapContentViewPager2 = null;
            }
            ViewVisibleExtKt.toVisible(wrapContentViewPager2);
            oneBuyDolPaymentInfoFragment.m15949r();
            frameLayout2 = oneBuyDolPaymentInfoFragment.f88444s;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentInfoContainer");
                frameLayout2 = null;
            }
            ViewVisibleExtKt.toInVisible(frameLayout2);
            textView2 = oneBuyDolPaymentInfoFragment.f88447v;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentMethodInfoDetailTextView");
            } else {
                textView3 = textView2;
            }
            textView3.setText(oneBuyDolPaymentInfoFragment.getString(R.string.one_buy_dol_payment_info_select_payment_method_detail));
        }
    }
}