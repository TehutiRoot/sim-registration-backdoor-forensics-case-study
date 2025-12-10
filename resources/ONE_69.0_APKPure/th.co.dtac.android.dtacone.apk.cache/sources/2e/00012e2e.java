package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.mixpanel.android.java_websocket.WebSocket;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PackageItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleTrueModel;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostVerifySubscriberPreToPostData;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostVerifySubscriberPreToPostResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$verifySubscriber$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$verifySubscriber$3 extends Lambda implements Function1<OnePre2PostVerifySubscriberPreToPostResponse, Unit> {
    final /* synthetic */ String $subscriberNumber;
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$verifySubscriber$3(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel, String str) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
        this.$subscriberNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePre2PostVerifySubscriberPreToPostResponse onePre2PostVerifySubscriberPreToPostResponse) {
        invoke2(onePre2PostVerifySubscriberPreToPostResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePre2PostVerifySubscriberPreToPostResponse onePre2PostVerifySubscriberPreToPostResponse) {
        MutableLiveData m14873P0;
        Integer pricePlanRc;
        String pricePlanDescription;
        String pricePlan;
        String pricePlanDescription2;
        String pricePlanPeriod;
        Integer pricePlanRc2;
        String pricePlanSocCode;
        String pricePlan2;
        String proposition;
        String proposition2;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        this.this$0.getOneModel().setSubscriberNumber(StringExtKt.toRemoveDash(this.$subscriberNumber));
        OneDeviceSaleTrueModel oneModel = this.this$0.getOneModel();
        OnePre2PostVerifySubscriberPreToPostData data = onePre2PostVerifySubscriberPreToPostResponse.getData();
        String str = "";
        String str2 = (data == null || (proposition2 = data.getProposition()) == null) ? "" : proposition2;
        OnePre2PostVerifySubscriberPreToPostData data2 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        oneModel.setPre2postPropositionTrueSelectedItem(new PropositionListItem(null, null, str2, null, null, null, (data2 == null || (proposition = data2.getProposition()) == null) ? "" : proposition, null, null, WebSocket.DEFAULT_WSS_PORT, null));
        OneDeviceSaleTrueModel oneModel2 = this.this$0.getOneModel();
        OnePre2PostVerifySubscriberPreToPostData data3 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        String str3 = (data3 == null || (pricePlan2 = data3.getPricePlan()) == null) ? "" : pricePlan2;
        OnePre2PostVerifySubscriberPreToPostData data4 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        String str4 = (data4 == null || (pricePlanSocCode = data4.getPricePlanSocCode()) == null) ? "" : pricePlanSocCode;
        OnePre2PostVerifySubscriberPreToPostData data5 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        int i = 0;
        int intValue = (data5 == null || (pricePlanRc2 = data5.getPricePlanRc()) == null) ? 0 : pricePlanRc2.intValue();
        OnePre2PostVerifySubscriberPreToPostData data6 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        String str5 = (data6 == null || (pricePlanPeriod = data6.getPricePlanPeriod()) == null) ? "" : pricePlanPeriod;
        OnePre2PostVerifySubscriberPreToPostData data7 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        String str6 = (data7 == null || (pricePlanDescription2 = data7.getPricePlanDescription()) == null) ? "" : pricePlanDescription2;
        OnePre2PostVerifySubscriberPreToPostData data8 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        String str7 = (data8 == null || (pricePlan = data8.getPricePlan()) == null) ? "" : pricePlan;
        OnePre2PostVerifySubscriberPreToPostData data9 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        if (data9 != null && (pricePlanDescription = data9.getPricePlanDescription()) != null) {
            str = pricePlanDescription;
        }
        List listOf = AbstractC10100ds.listOf(str);
        OnePre2PostVerifySubscriberPreToPostData data10 = onePre2PostVerifySubscriberPreToPostResponse.getData();
        if (data10 != null && (pricePlanRc = data10.getPricePlanRc()) != null) {
            i = pricePlanRc.intValue();
        }
        oneModel2.setPackageTrueSelectedItem(new PriceplanListItem(str4, null, null, str5, str6, null, null, new PackageItem(null, null, null, null, String.valueOf(i), null, null, null, listOf, null, null, null, null, null, str7, null, null, null, 245487, null), null, Integer.valueOf(intValue), null, null, str3, null, null, null, 60774, null));
        m14873P0 = this.this$0.m14873P0();
        m14873P0.setValue(Resource.Companion.success(onePre2PostVerifySubscriberPreToPostResponse));
    }
}