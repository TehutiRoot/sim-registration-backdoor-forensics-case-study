package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.SimTermSukCheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$uploadBarcode$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$uploadBarcode$3 extends Lambda implements Function1<UploadImageResponse, Unit> {
    final /* synthetic */ SimTermSukCheckSimStockResponse $checkSimStockResponse;
    final /* synthetic */ MultiSubscriber $sub;
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$uploadBarcode$3(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel, MultiSubscriber multiSubscriber, SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        super(1);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
        this.$sub = multiSubscriber;
        this.$checkSimStockResponse = simTermSukCheckSimStockResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UploadImageResponse uploadImageResponse) {
        invoke2(uploadImageResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(UploadImageResponse uploadImageResponse) {
        MutableLiveData m2099T;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        String filename = uploadImageResponse.getFilename();
        if (filename != null) {
            MultiSubscriber multiSubscriber = this.$sub;
            SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse = this.$checkSimStockResponse;
            MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel = this.this$0;
            MultiSubscriber multiSubscriber2 = new MultiSubscriber(multiSubscriber.getError(), filename, multiSubscriber.getValidateBarcodeResponse(), simTermSukCheckSimStockResponse, null, null, 48, null);
            List<MultiSubscriber> subscriberList = mrtrPrepaidMultiSimViewModel.getSubscriberList();
            if (subscriberList != null) {
                subscriberList.add(0, multiSubscriber2);
            }
        }
        m2099T = this.this$0.m2099T();
        m2099T.setValue(Resource.Companion.success(null));
    }
}