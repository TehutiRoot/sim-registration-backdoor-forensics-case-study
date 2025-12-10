package th.p047co.dtac.android.dtacone.viewmodel.esim;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$uploadImagePhysical$1 */
/* loaded from: classes9.dex */
public final class ESimViewModel$uploadImagePhysical$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$uploadImagePhysical$1(ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimViewModel;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends UploadImageResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        ESimRepository eSimRepository;
        ESimRepository eSimRepository2;
        String m2721e0;
        ESimRepository eSimRepository3;
        String subscriberNumber;
        String str;
        ESimRepository eSimRepository4;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        indexedValue.component1();
        eSimRepository = this.this$0.f105820b;
        eSimRepository2 = this.this$0.f105820b;
        String simCardNumber = eSimRepository2.getSimCardNumber();
        m2721e0 = this.this$0.m2721e0(indexedValue.component2());
        if (this.this$0.isPrepaid()) {
            eSimRepository4 = this.this$0.f105820b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = eSimRepository4.getMrtrPrepaidValidateBarcodeResponse();
            if (mrtrPrepaidValidateBarcodeResponse != null) {
                subscriberNumber = mrtrPrepaidValidateBarcodeResponse.getSubscriberNumber();
                str = subscriberNumber;
            }
            str = null;
        } else {
            eSimRepository3 = this.this$0.f105820b;
            MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = eSimRepository3.getValidateSimBarcodeResponse();
            if (validateSimBarcodeResponse != null) {
                subscriberNumber = validateSimBarcodeResponse.getSubscriberNumber();
                str = subscriberNumber;
            }
            str = null;
        }
        return eSimRepository.uploadImage(new UploadImageRequest(simCardNumber, m2721e0, PermissionConstant.M_ESIM, str, null, 16, null)).toObservable();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends UploadImageResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}