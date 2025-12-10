package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$getPricePlansDetail$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$getPricePlansDetail$3 extends Lambda implements Function1<OneGetPricePlansDetailResponse, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$getPricePlansDetail$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        invoke2(oneGetPricePlansDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        MutableLiveData m11647X1;
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.this$0;
        Data data = oneGetPricePlansDetailResponse.getData();
        onePostpaidRegistrationViewModel.setPricePlansDetailListResponse(data != null ? data.getPricePlansList() : null);
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel2 = this.this$0;
        Data data2 = oneGetPricePlansDetailResponse.getData();
        onePostpaidRegistrationViewModel2.setPricePlansDetailStatusResponse(data2 != null ? data2.getPricePlansStatus() : null);
        m11647X1 = this.this$0.m11647X1();
        Resource.Companion companion = Resource.Companion;
        Data data3 = oneGetPricePlansDetailResponse.getData();
        m11647X1.postValue(companion.success(data3 != null ? data3.getPricePlansList() : null));
    }
}