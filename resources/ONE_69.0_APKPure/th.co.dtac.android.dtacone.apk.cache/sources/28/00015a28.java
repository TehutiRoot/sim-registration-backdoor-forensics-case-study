package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.DiscountItem;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.SimTermSukCheckSimStockResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrPrepaidValidateBarcodeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPrepaidValidateBarcodeViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_registration/MrtrPrepaidValidateBarcodeViewModel$checkSimStock$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1855#2,2:238\n*S KotlinDebug\n*F\n+ 1 MrtrPrepaidValidateBarcodeViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_registration/MrtrPrepaidValidateBarcodeViewModel$checkSimStock$2\n*L\n208#1:238,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateBarcodeViewModel$checkSimStock$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateBarcodeViewModel$checkSimStock$2 extends Lambda implements Function1<SimTermSukCheckSimStockResponse, Unit> {
    final /* synthetic */ MrtrPrepaidValidateBarcodeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidValidateBarcodeViewModel$checkSimStock$2(MrtrPrepaidValidateBarcodeViewModel mrtrPrepaidValidateBarcodeViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidValidateBarcodeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        invoke2(simTermSukCheckSimStockResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        MrtrPrepaidRepository mrtrPrepaidRepository;
        MrtrPrepaidRepository mrtrPrepaidRepository2;
        MrtrPrepaidRepository mrtrPrepaidRepository3;
        mrtrPrepaidRepository = this.this$0.f106764b;
        mrtrPrepaidRepository.setCheckSimStockResponse(simTermSukCheckSimStockResponse);
        mrtrPrepaidRepository2 = this.this$0.f106764b;
        Integer lineAmount = simTermSukCheckSimStockResponse.getLineAmount();
        mrtrPrepaidRepository2.setTotalAmount(lineAmount != null ? lineAmount.intValue() : 0);
        List<DiscountItem> discount = simTermSukCheckSimStockResponse.getDiscount();
        if (discount != null) {
            MrtrPrepaidValidateBarcodeViewModel mrtrPrepaidValidateBarcodeViewModel = this.this$0;
            for (DiscountItem discountItem : discount) {
                mrtrPrepaidRepository3 = mrtrPrepaidValidateBarcodeViewModel.f106764b;
                int totalAmount = mrtrPrepaidRepository3.getTotalAmount();
                Integer lineAmount2 = discountItem.getLineAmount();
                mrtrPrepaidRepository3.setTotalAmount(totalAmount - (lineAmount2 != null ? lineAmount2.intValue() : 0));
            }
        }
        this.this$0.navigateNext();
    }
}