package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.PrepaidProfile;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.SearchMsisdn;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.insert_doc.OneInsertDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Data;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$insertDocument$1 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$insertDocument$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends OneCommonResponse>> {
    final /* synthetic */ Data $submitOrder;
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$insertDocument$1(OnePrepaidViewModel onePrepaidViewModel, Data data) {
        super(1);
        this.this$0 = onePrepaidViewModel;
        this.$submitOrder = data;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends OneCommonResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        OnePrepaidRepository onePrepaidRepository;
        String m10583D;
        String m10580G;
        OnePrepaidRepository onePrepaidRepository2;
        OnePrepaidRepository onePrepaidRepository3;
        OnePrepaidRepository onePrepaidRepository4;
        OneValidateSimTrueResponse validateSimTrueResponse;
        OneValidateSimTrueResponse.Data data;
        SearchMsisdn searchMsisdn;
        String msisdn;
        String m10585B;
        FaceCompareResult faceCompare;
        String compareScore;
        IdDocumentResult idDocument;
        OneValidateSimTrueResponse validateSimTrueResponse2;
        OneValidateSimTrueResponse.Data data2;
        PrepaidProfile prepaidProfile;
        OneValidateSimTrueResponse.Data data3;
        PrepaidProfile prepaidProfile2;
        IdDocumentResult idDocument2;
        IdDocumentResult idDocument3;
        IdDocumentResult idDocument4;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        int component1 = indexedValue.component1();
        String component2 = indexedValue.component2();
        onePrepaidRepository = this.this$0.f95986b;
        Data data4 = this.$submitOrder;
        OnePrepaidViewModel onePrepaidViewModel = this.this$0;
        String valueOf = String.valueOf(component1 + 1);
        String str = null;
        String orderId = data4 != null ? data4.getOrderId() : null;
        m10583D = onePrepaidViewModel.m10583D(component1);
        m10580G = onePrepaidViewModel.m10580G(component2);
        onePrepaidRepository2 = onePrepaidViewModel.f95986b;
        UpPassFormResult upPassFormResult = onePrepaidRepository2.getModel().getUpPassFormResult();
        String encryptCBC = onePrepaidRepository.encryptCBC(StringExtKt.toCheckEmptyAndDisplayDash((upPassFormResult == null || (idDocument4 = upPassFormResult.getIdDocument()) == null) ? null : idDocument4.getDocNumber()));
        onePrepaidRepository3 = onePrepaidViewModel.f95986b;
        UpPassFormResult upPassFormResult2 = onePrepaidRepository3.getModel().getUpPassFormResult();
        String encryptCBC2 = onePrepaidRepository.encryptCBC(StringExtKt.toCheckEmptyAndDisplayDash((upPassFormResult2 == null || (idDocument3 = upPassFormResult2.getIdDocument()) == null) ? null : idDocument3.getFirstName()));
        onePrepaidRepository4 = onePrepaidViewModel.f95986b;
        UpPassFormResult upPassFormResult3 = onePrepaidRepository4.getModel().getUpPassFormResult();
        String encryptCBC3 = onePrepaidRepository.encryptCBC(StringExtKt.toCheckEmptyAndDisplayDash((upPassFormResult3 == null || (idDocument2 = upPassFormResult3.getIdDocument()) == null) ? null : idDocument2.getLastName()));
        OneValidateSimTrueResponse validateSimTrueResponse3 = onePrepaidRepository.getValidateSimTrueResponse();
        String msisdn2 = (validateSimTrueResponse3 == null || (data3 = validateSimTrueResponse3.getData()) == null || (prepaidProfile2 = data3.getPrepaidProfile()) == null) ? null : prepaidProfile2.getMsisdn();
        String str2 = (msisdn2 == null || msisdn2.length() == 0 ? (validateSimTrueResponse = onePrepaidRepository.getValidateSimTrueResponse()) == null || (data = validateSimTrueResponse.getData()) == null || (searchMsisdn = data.getSearchMsisdn()) == null || (msisdn = searchMsisdn.getMsisdn()) == null : (validateSimTrueResponse2 = onePrepaidRepository.getValidateSimTrueResponse()) == null || (data2 = validateSimTrueResponse2.getData()) == null || (prepaidProfile = data2.getPrepaidProfile()) == null || (msisdn = prepaidProfile.getMsisdn()) == null) ? "" : msisdn;
        String trackingId = data4 != null ? data4.getTrackingId() : null;
        UpPassFormResult upPassFormResult4 = onePrepaidRepository.getModel().getUpPassFormResult();
        if (upPassFormResult4 != null && (idDocument = upPassFormResult4.getIdDocument()) != null) {
            str = idDocument.getDopaStatus();
        }
        String str3 = Intrinsics.areEqual(str, "pass") ? "Y" : "N";
        m10585B = onePrepaidViewModel.m10585B();
        UpPassFormResult upPassFormCompareResult = onePrepaidRepository.getModel().getUpPassFormCompareResult();
        return onePrepaidRepository.insertDocument(new OneInsertDocumentRequest("PREPAID_REGISTER", valueOf, orderId, m10583D, m10580G, encryptCBC, encryptCBC2, encryptCBC3, str2, trackingId, m10585B, str3, (upPassFormCompareResult == null || (faceCompare = upPassFormCompareResult.getFaceCompare()) == null || (compareScore = faceCompare.getCompareScore()) == null) ? "" : compareScore)).toObservable();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends OneCommonResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}