package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.DiscountItem;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.SimTermSukCheckSimStockResponse;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePrepaidViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePrepaidViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/prepaid_registration/viewmodel/OnePrepaidViewModel$checkSim$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1710:1\n1855#2,2:1711\n*S KotlinDebug\n*F\n+ 1 OnePrepaidViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/prepaid_registration/viewmodel/OnePrepaidViewModel$checkSim$2\n*L\n599#1:1711,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$checkSim$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$checkSim$2 extends Lambda implements Function1<SimTermSukCheckSimStockResponse, Unit> {
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$checkSim$2(OnePrepaidViewModel onePrepaidViewModel) {
        super(1);
        this.this$0 = onePrepaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        invoke2(simTermSukCheckSimStockResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        OnePrepaidRepository onePrepaidRepository;
        OnePrepaidRepository onePrepaidRepository2;
        OnePrepaidRepository onePrepaidRepository3;
        onePrepaidRepository = this.this$0.f95986b;
        onePrepaidRepository.setCheckSimStockResponse(simTermSukCheckSimStockResponse);
        onePrepaidRepository2 = this.this$0.f95986b;
        Integer lineAmount = simTermSukCheckSimStockResponse.getLineAmount();
        onePrepaidRepository2.setTotalAmount(lineAmount != null ? lineAmount.intValue() : 0);
        List<DiscountItem> discount = simTermSukCheckSimStockResponse.getDiscount();
        if (discount != null) {
            OnePrepaidViewModel onePrepaidViewModel = this.this$0;
            for (DiscountItem discountItem : discount) {
                onePrepaidRepository3 = onePrepaidViewModel.f95986b;
                int totalAmount = onePrepaidRepository3.getTotalAmount();
                Integer lineAmount2 = discountItem.getLineAmount();
                onePrepaidRepository3.setTotalAmount(totalAmount - (lineAmount2 != null ? lineAmount2.intValue() : 0));
            }
        }
        this.this$0.navigateNext();
    }
}