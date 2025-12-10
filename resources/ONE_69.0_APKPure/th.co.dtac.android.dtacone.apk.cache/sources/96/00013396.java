package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$insertDocument$1 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$insertDocument$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends OneCommonResponse>> {
    final /* synthetic */ Data $submitOrder;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$insertDocument$1(OneMnpViewModel oneMnpViewModel, Data data) {
        super(1);
        this.this$0 = oneMnpViewModel;
        this.$submitOrder = data;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends OneCommonResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        OneMnpRepository oneMnpRepository;
        String m13538M0;
        String m13509V0;
        OneValidateSimTrueResponse validateSimTrueResponse;
        OneValidateSimTrueResponse.Data data;
        SearchMsisdn searchMsisdn;
        String msisdn;
        String m13542L0;
        String m13454k1;
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
        oneMnpRepository = this.this$0.f92116c;
        Data data4 = this.$submitOrder;
        OneMnpViewModel oneMnpViewModel = this.this$0;
        String valueOf = String.valueOf(component1 + 1);
        String str = null;
        String orderId = data4 != null ? data4.getOrderId() : null;
        m13538M0 = oneMnpViewModel.m13538M0(component1);
        m13509V0 = oneMnpViewModel.m13509V0(component2);
        UpPassFormResult upPassFormResult = oneMnpViewModel.getUpPassFormResult();
        String encryptCBC = oneMnpRepository.encryptCBC(StringExtKt.toCheckEmptyAndDisplayDash((upPassFormResult == null || (idDocument4 = upPassFormResult.getIdDocument()) == null) ? null : idDocument4.getDocNumber()));
        UpPassFormResult upPassFormResult2 = oneMnpViewModel.getUpPassFormResult();
        String encryptCBC2 = oneMnpRepository.encryptCBC(StringExtKt.toCheckEmptyAndDisplayDash((upPassFormResult2 == null || (idDocument3 = upPassFormResult2.getIdDocument()) == null) ? null : idDocument3.getFirstName()));
        UpPassFormResult upPassFormResult3 = oneMnpViewModel.getUpPassFormResult();
        String encryptCBC3 = oneMnpRepository.encryptCBC(StringExtKt.toCheckEmptyAndDisplayDash((upPassFormResult3 == null || (idDocument2 = upPassFormResult3.getIdDocument()) == null) ? null : idDocument2.getLastName()));
        OneValidateSimTrueResponse validateSimTrueResponse3 = oneMnpViewModel.getValidateSimTrueResponse();
        String msisdn2 = (validateSimTrueResponse3 == null || (data3 = validateSimTrueResponse3.getData()) == null || (prepaidProfile2 = data3.getPrepaidProfile()) == null) ? null : prepaidProfile2.getMsisdn();
        if (msisdn2 == null || msisdn2.length() == 0 ? (validateSimTrueResponse = oneMnpViewModel.getValidateSimTrueResponse()) == null || (data = validateSimTrueResponse.getData()) == null || (searchMsisdn = data.getSearchMsisdn()) == null || (msisdn = searchMsisdn.getMsisdn()) == null : (validateSimTrueResponse2 = oneMnpViewModel.getValidateSimTrueResponse()) == null || (data2 = validateSimTrueResponse2.getData()) == null || (prepaidProfile = data2.getPrepaidProfile()) == null || (msisdn = prepaidProfile.getMsisdn()) == null) {
            msisdn = "";
        }
        String trackingId = data4 != null ? data4.getTrackingId() : null;
        m13542L0 = oneMnpViewModel.m13542L0();
        UpPassFormResult upPassFormResult4 = oneMnpViewModel.getUpPassFormResult();
        if (upPassFormResult4 != null && (idDocument = upPassFormResult4.getIdDocument()) != null) {
            str = idDocument.getDopaStatus();
        }
        String str2 = Intrinsics.areEqual(str, "pass") ? "Y" : "N";
        m13454k1 = oneMnpViewModel.m13454k1();
        return oneMnpRepository.insertDocument(new OneInsertDocumentRequest("PREPAID_REGISTER", valueOf, orderId, m13538M0, m13509V0, encryptCBC, encryptCBC2, encryptCBC3, msisdn, trackingId, m13542L0, str2, m13454k1)).toObservable().onErrorResumeNext(Observable.just(new OneCommonResponse("", "", "", "", null, CollectionsKt__CollectionsKt.emptyList(), "")));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends OneCommonResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}