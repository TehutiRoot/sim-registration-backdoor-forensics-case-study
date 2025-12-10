package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$validateBarcode$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$validateBarcode$3 extends Lambda implements Function1<MrtrPrepaidValidateBarcodeResponse, Unit> {
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$validateBarcode$3(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse) {
        invoke2(mrtrPrepaidValidateBarcodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPrepaidValidateBarcodeResponse it) {
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository;
        MutableLiveData m2097V;
        MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel = this.this$0;
        String subscriberNumber = it.getSubscriberNumber();
        if (subscriberNumber == null) {
            subscriberNumber = "";
        }
        if (!mrtrPrepaidMultiSimViewModel.isDuplicateSubscriber(subscriberNumber)) {
            mrtrPrepaidMultiSimRepository = this.this$0.f106670b;
            if (mrtrPrepaidMultiSimRepository.isCheckSimStock()) {
                MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel2 = this.this$0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                mrtrPrepaidMultiSimViewModel2.m2054y(it);
                return;
            }
            MrtrPrepaidMultiSimViewModel.uploadBarcode$default(this.this$0, new MultiSubscriber(null, null, it, null, null, null, 59, null), null, 2, null);
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        ErrorCollection errorCollection = new ErrorCollection();
        errorCollection.setDescription("ขออภัยค่ะ เบอร์นี้มีการสแกนไปแล้วค่ะ");
        m2097V = this.this$0.m2097V();
        m2097V.setValue(Resource.Companion.success(errorCollection));
    }
}