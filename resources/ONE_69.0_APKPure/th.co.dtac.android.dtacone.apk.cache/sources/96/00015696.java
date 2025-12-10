package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.DiscountItem;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.SimTermSukCheckSimStockResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nESimViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ESimViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/esim/ESimViewModel$checkSimStock$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3149:1\n1855#2,2:3150\n*S KotlinDebug\n*F\n+ 1 ESimViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/esim/ESimViewModel$checkSimStock$3\n*L\n1472#1:3150,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$checkSimStock$3 */
/* loaded from: classes9.dex */
public final class ESimViewModel$checkSimStock$3 extends Lambda implements Function1<SimTermSukCheckSimStockResponse, Unit> {
    final /* synthetic */ Boolean $isPhysical;
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$checkSimStock$3(ESimViewModel eSimViewModel, Boolean bool) {
        super(1);
        this.this$0 = eSimViewModel;
        this.$isPhysical = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        invoke2(simTermSukCheckSimStockResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        ESimRepository eSimRepository;
        ESimRepository eSimRepository2;
        MutableLiveData m2681y0;
        ESimRepository eSimRepository3;
        eSimRepository = this.this$0.f105820b;
        eSimRepository.setCheckSimStockResponse(simTermSukCheckSimStockResponse);
        eSimRepository2 = this.this$0.f105820b;
        Integer lineAmount = simTermSukCheckSimStockResponse.getLineAmount();
        eSimRepository2.setTotalAmount(lineAmount != null ? lineAmount.intValue() : 0);
        List<DiscountItem> discount = simTermSukCheckSimStockResponse.getDiscount();
        if (discount != null) {
            ESimViewModel eSimViewModel = this.this$0;
            for (DiscountItem discountItem : discount) {
                eSimRepository3 = eSimViewModel.f105820b;
                int totalAmount = eSimRepository3.getTotalAmount();
                Integer lineAmount2 = discountItem.getLineAmount();
                eSimRepository3.setTotalAmount(totalAmount - (lineAmount2 != null ? lineAmount2.intValue() : 0));
            }
        }
        if (Intrinsics.areEqual(this.$isPhysical, Boolean.TRUE)) {
            this.this$0.navigateNext();
            return;
        }
        m2681y0 = this.this$0.m2681y0();
        m2681y0.postValue(Resource.Companion.success("onComplete"));
    }
}