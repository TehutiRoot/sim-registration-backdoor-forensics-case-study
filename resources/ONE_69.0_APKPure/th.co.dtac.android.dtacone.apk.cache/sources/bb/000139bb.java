package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "responses", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$4 */
/* loaded from: classes10.dex */
public final class OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$4 extends Lambda implements Function1<List<OneGetPricePlansDetailResponse>, Unit> {
    final /* synthetic */ Function1<String, Unit> $dataNotFound;
    final /* synthetic */ Integer $repeatCount;
    final /* synthetic */ OnePricePlansViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$4(Integer num, OnePricePlansViewModel onePricePlansViewModel, Function1<? super String, Unit> function1) {
        super(1);
        this.$repeatCount = num;
        this.this$0 = onePricePlansViewModel;
        this.$dataNotFound = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<OneGetPricePlansDetailResponse> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<OneGetPricePlansDetailResponse> list) {
        int size = list.size();
        Integer num = this.$repeatCount;
        if (num != null && size == num.intValue()) {
            List<PriceplanListItem> pricePlansDetailListResponse = this.this$0.getPricePlansDetailListResponse();
            if (pricePlansDetailListResponse == null || pricePlansDetailListResponse.isEmpty()) {
                this.$dataNotFound.invoke("ขออภัยค่ะ ไม่สามารถดึงข้อมูลแพ็กเกจได้\nกรุณาติดต่อ 9700 เพื่อตรวจสอบค่ะ");
            }
        }
    }
}