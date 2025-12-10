package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.insert_doc.OneInsertDocumentRequest;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel$insertDocument$1 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerViewModel$insertDocument$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends OneCommonResponse>> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ OneChangeOwnerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerViewModel$insertDocument$1(OneChangeOwnerViewModel oneChangeOwnerViewModel, String str) {
        super(1);
        this.this$0 = oneChangeOwnerViewModel;
        this.$orderId = str;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends OneCommonResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        OneChangeOwnerRepository oneChangeOwnerRepository;
        String m15303n;
        String m15301p;
        IdDocumentResult idDocument;
        IdDocumentResult idDocument2;
        IdDocumentResult idDocument3;
        IdDocumentResult idDocument4;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        int component1 = indexedValue.component1();
        oneChangeOwnerRepository = this.this$0.f89394b;
        OneChangeOwnerViewModel oneChangeOwnerViewModel = this.this$0;
        String str = this.$orderId;
        String valueOf = String.valueOf(component1 + 1);
        m15303n = oneChangeOwnerViewModel.m15303n(component1);
        m15301p = oneChangeOwnerViewModel.m15301p(indexedValue.component2());
        UpPassFormResult upPassResult = oneChangeOwnerRepository.getUpPassResult();
        String str2 = null;
        String encrypt = oneChangeOwnerRepository.toEncrypt(StringExtKt.toCheckEmptyAndDisplayDash((upPassResult == null || (idDocument4 = upPassResult.getIdDocument()) == null) ? null : idDocument4.getDocNumber()));
        UpPassFormResult upPassResult2 = oneChangeOwnerRepository.getUpPassResult();
        String encrypt2 = oneChangeOwnerRepository.toEncrypt(StringExtKt.toCheckEmptyAndDisplayDash((upPassResult2 == null || (idDocument3 = upPassResult2.getIdDocument()) == null) ? null : idDocument3.getFirstName()));
        UpPassFormResult upPassResult3 = oneChangeOwnerRepository.getUpPassResult();
        String encrypt3 = oneChangeOwnerRepository.toEncrypt(StringExtKt.toCheckEmptyAndDisplayDash((upPassResult3 == null || (idDocument2 = upPassResult3.getIdDocument()) == null) ? null : idDocument2.getLastName()));
        String encrypt4 = oneChangeOwnerRepository.toEncrypt(oneChangeOwnerRepository.getSubscriberNumber());
        UpPassFormResult upPassResult4 = oneChangeOwnerRepository.getUpPassResult();
        if (upPassResult4 != null && (idDocument = upPassResult4.getIdDocument()) != null) {
            str2 = idDocument.getDopaStatus();
        }
        String str3 = Intrinsics.areEqual(str2, "pass") ? "Y" : "N";
        String dipChipStatus = oneChangeOwnerRepository.dipChipStatus();
        FaceRecResponse faceRecResponse = oneChangeOwnerRepository.getFaceRecResponse();
        return oneChangeOwnerRepository.insertDocument(new OneInsertDocumentRequest("CHANGE_OWNER", valueOf, str, m15303n, m15301p, encrypt, encrypt2, encrypt3, encrypt4, null, dipChipStatus, str3, (faceRecResponse == null || (r1 = faceRecResponse.getConfidence()) == null) ? "" : "", 512, null)).toObservable();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends OneCommonResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}