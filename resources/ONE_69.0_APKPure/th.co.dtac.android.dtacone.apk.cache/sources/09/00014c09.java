package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimCommonFragment$navigateNextToCommon$upPassFormOnSuccessCallback$1 */
/* loaded from: classes9.dex */
public final class C16025xad270483 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ ESimCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16025xad270483(ESimCommonFragment eSimCommonFragment) {
        super(1);
        this.this$0 = eSimCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        ESimViewModel eSimViewModel;
        ESimViewModel eSimViewModel2;
        ESimPostpaidViewModel eSimPostpaidViewModel;
        IdDocumentResult idDocument;
        ESimViewModel eSimViewModel3;
        IdDocumentResult idDocument2;
        ESimViewModel eSimViewModel4;
        ESimPostpaidViewModel eSimPostpaidViewModel2;
        ESimPostpaidViewModel eSimPostpaidViewModel3;
        ESimPostpaidViewModel eSimPostpaidViewModel4;
        ESimPostpaidViewModel eSimPostpaidViewModel5;
        ESimPostpaidViewModel eSimPostpaidViewModel6;
        ESimPostpaidViewModel eSimPostpaidViewModel7;
        IdDocumentResult idDocument3;
        IdCardInformationCollection idCardInformation;
        ESimPostpaidViewModel eSimPostpaidViewModel8;
        ESimViewModel eSimViewModel5;
        ESimViewModel eSimViewModel6;
        ESimViewModel eSimViewModel7;
        ESimViewModel eSimViewModel8;
        ESimViewModel eSimViewModel9;
        ESimViewModel eSimViewModel10;
        ESimViewModel eSimViewModel11;
        IdDocumentResult idDocument4;
        Intrinsics.checkNotNullParameter(result, "result");
        String json = new Gson().toJson(result);
        StringBuilder sb = new StringBuilder();
        sb.append("result: ");
        sb.append(json);
        UpPassFormType formType = result.getFormType();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("formType: ");
        sb2.append(formType);
        UpPassFormResult upPassFormResult = null;
        r3 = null;
        IdCardInformationCollection idCardInformationCollection = null;
        r3 = null;
        IdDocumentResult idDocumentResult = null;
        UpPassFormResult upPassFormResult2 = null;
        r3 = null;
        IdDocumentResult idDocumentResult2 = null;
        if (result.getFormType() instanceof UpPassFormType.Ocr) {
            eSimViewModel4 = this.this$0.getESimViewModel();
            boolean z = false;
            if (eSimViewModel4.isPrepaid()) {
                eSimViewModel5 = this.this$0.getESimViewModel();
                eSimViewModel5.setUpPassFormResult(result);
                eSimViewModel6 = this.this$0.getESimViewModel();
                eSimViewModel7 = this.this$0.getESimViewModel();
                UpPassFormResult upPassFormResult3 = eSimViewModel7.getUpPassFormResult();
                if (upPassFormResult3 != null && upPassFormResult3.isCardReader()) {
                    z = true;
                }
                eSimViewModel6.setSmartCard(z);
                eSimViewModel8 = this.this$0.getESimViewModel();
                UpPassFormResult upPassFormResult4 = eSimViewModel8.getUpPassFormResult();
                if (upPassFormResult4 != null && upPassFormResult4.isCardReader()) {
                    eSimViewModel10 = this.this$0.getESimViewModel();
                    eSimViewModel11 = this.this$0.getESimViewModel();
                    UpPassFormResult upPassFormResult5 = eSimViewModel11.getUpPassFormResult();
                    if (upPassFormResult5 != null && (idDocument4 = upPassFormResult5.getIdDocument()) != null) {
                        idCardInformationCollection = idDocument4.getIdCardInformation();
                    }
                    eSimViewModel10.storeIdCardInformation(idCardInformationCollection);
                }
                eSimViewModel9 = this.this$0.getESimViewModel();
                if (eSimViewModel9.isESimFromSystem()) {
                    this.this$0.m7818w();
                    return;
                } else {
                    this.this$0.getConcatPresenter().concatWithBarcode(BitmapUtil.IMAGE_BARCODE, BitmapUtil.IMAGE_ID_CARD);
                    return;
                }
            }
            eSimPostpaidViewModel2 = this.this$0.getESimPostpaidViewModel();
            eSimPostpaidViewModel2.setUpPassFormResult(result);
            eSimPostpaidViewModel3 = this.this$0.getESimPostpaidViewModel();
            eSimPostpaidViewModel4 = this.this$0.getESimPostpaidViewModel();
            UpPassFormResult upPassFormResult6 = eSimPostpaidViewModel4.getUpPassFormResult();
            if (upPassFormResult6 != null && upPassFormResult6.isCardReader()) {
                z = true;
            }
            eSimPostpaidViewModel3.setSmartCard(z);
            eSimPostpaidViewModel5 = this.this$0.getESimPostpaidViewModel();
            UpPassFormResult upPassFormResult7 = eSimPostpaidViewModel5.getUpPassFormResult();
            if (upPassFormResult7 != null && upPassFormResult7.isCardReader()) {
                eSimPostpaidViewModel7 = this.this$0.getESimPostpaidViewModel();
                UpPassFormResult upPassFormResult8 = eSimPostpaidViewModel7.getUpPassFormResult();
                if (upPassFormResult8 != null && (idDocument3 = upPassFormResult8.getIdDocument()) != null && (idCardInformation = idDocument3.getIdCardInformation()) != null) {
                    eSimPostpaidViewModel8 = this.this$0.getESimPostpaidViewModel();
                    eSimPostpaidViewModel8.storeIdCardInformation(idCardInformation);
                }
            }
            eSimPostpaidViewModel6 = this.this$0.getESimPostpaidViewModel();
            eSimPostpaidViewModel6.validateIdNumberForCommon(eSimPostpaidViewModel6.getUpPassFormResult());
            return;
        }
        FaceCompareResult faceCompare = result.getFaceCompare();
        Boolean valueOf = faceCompare != null ? Boolean.valueOf(faceCompare.isSuccess()) : null;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onSuccessCallback: isSuccess = ");
        sb3.append(valueOf);
        FaceCompareResult faceCompare2 = result.getFaceCompare();
        if (faceCompare2 == null || !faceCompare2.isSuccess()) {
            return;
        }
        eSimViewModel = this.this$0.getESimViewModel();
        boolean isPrepaid = eSimViewModel.isPrepaid();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("onSuccessCallback: isPrepaid = ");
        sb4.append(isPrepaid);
        eSimViewModel2 = this.this$0.getESimViewModel();
        if (eSimViewModel2.isPrepaid()) {
            eSimViewModel3 = this.this$0.getESimViewModel();
            eSimViewModel3.mapCompareDocument(result);
            UpPassFormResult upPassFormResult9 = eSimViewModel3.getUpPassFormResult();
            if (upPassFormResult9 != null) {
                UpPassFormResult upPassFormResult10 = eSimViewModel3.getUpPassFormResult();
                if (upPassFormResult10 != null && (idDocument2 = upPassFormResult10.getIdDocument()) != null) {
                    idDocumentResult = idDocument2.copy((r55 & 1) != 0 ? idDocument2.docType : null, (r55 & 2) != 0 ? idDocument2.verificationDocType : null, (r55 & 4) != 0 ? idDocument2.docNumber : null, (r55 & 8) != 0 ? idDocument2.prefix : null, (r55 & 16) != 0 ? idDocument2.firstName : null, (r55 & 32) != 0 ? idDocument2.middleName : null, (r55 & 64) != 0 ? idDocument2.lastName : null, (r55 & 128) != 0 ? idDocument2.gender : null, (r55 & 256) != 0 ? idDocument2.birthday : null, (r55 & 512) != 0 ? idDocument2.birthdayUpPass : null, (r55 & 1024) != 0 ? idDocument2.houseNo : null, (r55 & 2048) != 0 ? idDocument2.moo : null, (r55 & 4096) != 0 ? idDocument2.road : null, (r55 & 8192) != 0 ? idDocument2.soi : null, (r55 & 16384) != 0 ? idDocument2.subDistrict : null, (r55 & 32768) != 0 ? idDocument2.district : null, (r55 & 65536) != 0 ? idDocument2.province : null, (r55 & 131072) != 0 ? idDocument2.country : null, (r55 & 262144) != 0 ? idDocument2.postcode : null, (r55 & 524288) != 0 ? idDocument2.issue : null, (r55 & 1048576) != 0 ? idDocument2.expire : null, (r55 & 2097152) != 0 ? idDocument2.bp1Number : null, (r55 & 4194304) != 0 ? idDocument2.chipId : null, (r55 & 8388608) != 0 ? idDocument2.laserCode : null, (r55 & 16777216) != 0 ? idDocument2.address : null, (r55 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? idDocument2.docImage : null, (r55 & 67108864) != 0 ? idDocument2.faceImage : null, (r55 & 134217728) != 0 ? idDocument2.dopaStatus : null, (r55 & 268435456) != 0 ? idDocument2.dopaFlag : null, (r55 & PKIFailureInfo.duplicateCertReq) != 0 ? idDocument2.isDopaByPass : false, (r55 & 1073741824) != 0 ? idDocument2.verificationDopa : null, (r55 & Integer.MIN_VALUE) != 0 ? idDocument2.isManualKeyIn : false, (r56 & 1) != 0 ? idDocument2.verificationSlugId : result.getFaceCompare().getVerificationSlugId(), (r56 & 2) != 0 ? idDocument2.verificationForm : null, (r56 & 4) != 0 ? idDocument2.idCardInformation : null, (r56 & 8) != 0 ? idDocument2.firstNameEng : null, (r56 & 16) != 0 ? idDocument2.lastNameEng : null);
                }
                upPassFormResult2 = UpPassFormResult.copy$default(upPassFormResult9, null, false, idDocumentResult, null, 11, null);
            }
            eSimViewModel3.setUpPassFormResult(upPassFormResult2);
            this.this$0.m7829B(result);
            this.this$0.m7816y();
            return;
        }
        eSimPostpaidViewModel = this.this$0.getESimPostpaidViewModel();
        UpPassFormResult upPassFormResult11 = eSimPostpaidViewModel.getUpPassFormResult();
        if (upPassFormResult11 != null) {
            UpPassFormResult upPassFormResult12 = eSimPostpaidViewModel.getUpPassFormResult();
            if (upPassFormResult12 != null && (idDocument = upPassFormResult12.getIdDocument()) != null) {
                idDocumentResult2 = idDocument.copy((r55 & 1) != 0 ? idDocument.docType : null, (r55 & 2) != 0 ? idDocument.verificationDocType : null, (r55 & 4) != 0 ? idDocument.docNumber : null, (r55 & 8) != 0 ? idDocument.prefix : null, (r55 & 16) != 0 ? idDocument.firstName : null, (r55 & 32) != 0 ? idDocument.middleName : null, (r55 & 64) != 0 ? idDocument.lastName : null, (r55 & 128) != 0 ? idDocument.gender : null, (r55 & 256) != 0 ? idDocument.birthday : null, (r55 & 512) != 0 ? idDocument.birthdayUpPass : null, (r55 & 1024) != 0 ? idDocument.houseNo : null, (r55 & 2048) != 0 ? idDocument.moo : null, (r55 & 4096) != 0 ? idDocument.road : null, (r55 & 8192) != 0 ? idDocument.soi : null, (r55 & 16384) != 0 ? idDocument.subDistrict : null, (r55 & 32768) != 0 ? idDocument.district : null, (r55 & 65536) != 0 ? idDocument.province : null, (r55 & 131072) != 0 ? idDocument.country : null, (r55 & 262144) != 0 ? idDocument.postcode : null, (r55 & 524288) != 0 ? idDocument.issue : null, (r55 & 1048576) != 0 ? idDocument.expire : null, (r55 & 2097152) != 0 ? idDocument.bp1Number : null, (r55 & 4194304) != 0 ? idDocument.chipId : null, (r55 & 8388608) != 0 ? idDocument.laserCode : null, (r55 & 16777216) != 0 ? idDocument.address : null, (r55 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? idDocument.docImage : null, (r55 & 67108864) != 0 ? idDocument.faceImage : null, (r55 & 134217728) != 0 ? idDocument.dopaStatus : null, (r55 & 268435456) != 0 ? idDocument.dopaFlag : null, (r55 & PKIFailureInfo.duplicateCertReq) != 0 ? idDocument.isDopaByPass : false, (r55 & 1073741824) != 0 ? idDocument.verificationDopa : null, (r55 & Integer.MIN_VALUE) != 0 ? idDocument.isManualKeyIn : false, (r56 & 1) != 0 ? idDocument.verificationSlugId : result.getFaceCompare().getVerificationSlugId(), (r56 & 2) != 0 ? idDocument.verificationForm : null, (r56 & 4) != 0 ? idDocument.idCardInformation : null, (r56 & 8) != 0 ? idDocument.firstNameEng : null, (r56 & 16) != 0 ? idDocument.lastNameEng : null);
            }
            upPassFormResult = UpPassFormResult.copy$default(upPassFormResult11, null, false, idDocumentResult2, null, 11, null);
        }
        eSimPostpaidViewModel.setUpPassFormResult(upPassFormResult);
        this.this$0.m7829B(result);
        this.this$0.m7830A();
    }
}