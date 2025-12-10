package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.request.OneUploadDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.response.OneUploadDocumentResponse;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/uploadImage/response/OneUploadDocumentResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$uploadImage$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$uploadImage$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends OneUploadDocumentResponse>> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$uploadImage$1(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends OneUploadDocumentResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository;
        String m14831h0;
        String m14831h02;
        ImageUtil imageUtil;
        int m14805s0;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        int component1 = indexedValue.component1();
        String component2 = indexedValue.component2();
        oneDeviceSaleTrueRepository = this.this$0.f90027b;
        String transactionId = this.this$0.getOneModel().getTransactionId();
        OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel = this.this$0;
        Boolean requireFaceRecognition = oneDeviceSaleTrueViewModel.getOneModel().getRequireFaceRecognition();
        m14831h0 = oneDeviceSaleTrueViewModel.m14831h0(component1, requireFaceRecognition != null ? requireFaceRecognition.booleanValue() : false);
        OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel2 = this.this$0;
        Boolean requireFaceRecognition2 = oneDeviceSaleTrueViewModel2.getOneModel().getRequireFaceRecognition();
        m14831h02 = oneDeviceSaleTrueViewModel2.m14831h0(component1, requireFaceRecognition2 != null ? requireFaceRecognition2.booleanValue() : false);
        imageUtil = this.this$0.f90037g;
        String imageBase64 = imageUtil.getImageBase64(component2);
        m14805s0 = this.this$0.m14805s0(component1);
        return oneDeviceSaleTrueRepository.uploadImageTrueCompany(new OneUploadDocumentRequest(transactionId, m14831h0, m14831h02, "image/jpg", imageBase64, Integer.valueOf(m14805s0), "jpg")).toObservable();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends OneUploadDocumentResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}