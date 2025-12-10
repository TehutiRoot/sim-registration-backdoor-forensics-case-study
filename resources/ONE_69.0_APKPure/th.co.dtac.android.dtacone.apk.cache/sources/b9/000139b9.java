package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$2 */
/* loaded from: classes10.dex */
public final class OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$2 extends Lambda implements Function1<OneGetPricePlansDetailResponse, Unit> {
    final /* synthetic */ Function1<List<PriceplanListItem>, Unit> $updateList;
    final /* synthetic */ OnePricePlansViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$2(OnePricePlansViewModel onePricePlansViewModel, Function1<? super List<PriceplanListItem>, Unit> function1) {
        super(1);
        this.this$0 = onePricePlansViewModel;
        this.$updateList = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        invoke2(oneGetPricePlansDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        Data data = oneGetPricePlansDetailResponse.getData();
        if ((data != null ? data.getPricePlansStatus() : null) != null) {
            this.this$0.setPricePlansDetailStatusResponse(oneGetPricePlansDetailResponse.getData().getPricePlansStatus());
        }
        Data data2 = oneGetPricePlansDetailResponse.getData();
        List<PriceplanListItem> pricePlansList = data2 != null ? data2.getPricePlansList() : null;
        if (pricePlansList == null) {
            pricePlansList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!pricePlansList.isEmpty()) {
            OnePricePlansViewModel onePricePlansViewModel = this.this$0;
            Data data3 = oneGetPricePlansDetailResponse.getData();
            List<PriceplanListItem> pricePlansList2 = data3 != null ? data3.getPricePlansList() : null;
            if (pricePlansList2 == null) {
                pricePlansList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            onePricePlansViewModel.setPricePlansDetailListResponse(pricePlansList2);
            this.$updateList.invoke(this.this$0.getPricePlansDetailListResponse());
        }
    }
}