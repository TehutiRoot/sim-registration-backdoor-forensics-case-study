package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import com.feitian.readerdk.Tool.C6139DK;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import retrofit2.Response;
import th.p047co.dtac.android.dtacone.extension.Base64ExtKt;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.QueryResultResponse;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$getFormResult$1", m29092f = "UpPassViewModel.kt", m29091i = {}, m29090l = {170}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nUpPassViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$getFormResult$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,786:1\n230#2,5:787\n230#2,5:794\n230#2,5:799\n230#2,5:806\n230#2,5:811\n230#2,5:816\n230#2,5:821\n230#2,5:826\n1855#3,2:792\n1855#3,2:804\n*S KotlinDebug\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$getFormResult$1\n*L\n164#1:787,5\n204#1:794,5\n230#1:799,5\n256#1:806,5\n274#1:811,5\n286#1:816,5\n288#1:821,5\n305#1:826,5\n175#1:792,2\n244#1:804,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$getFormResult$1 */
/* loaded from: classes9.dex */
public final class UpPassViewModel$getFormResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UpPassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassViewModel$getFormResult$1(UpPassViewModel upPassViewModel, Continuation<? super UpPassViewModel$getFormResult$1> continuation) {
        super(2, continuation);
        this.this$0 = upPassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassViewModel$getFormResult$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MrtrErrorService mrtrErrorService;
        MrtrErrorService mrtrErrorService2;
        MrtrErrorService mrtrErrorService3;
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        MrtrErrorService mrtrErrorService4;
        String errorCode;
        MrtrErrorService mrtrErrorService5;
        String errorMessage;
        String errorUserId;
        MrtrErrorService mrtrErrorService6;
        String systemMessage;
        CommonErrorResponse copy;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        ResponseBody errorBody;
        Headers headers;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        Object result;
        CommonErrorResponse commonErrorResponse;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        Object value6;
        FaceCompareResult copy2;
        IdDocumentResult copy3;
        Object value7;
        FaceCompareResult copy4;
        FaceCompareResult copy5;
        FaceCompareResult copy6;
        MutableStateFlow mutableStateFlow6;
        Object value8;
        IdDocumentResult copy7;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableStateFlow4 = this.this$0.f107140i;
                do {
                    value4 = mutableStateFlow4.getValue();
                    UpPassFormState upPassFormState = (UpPassFormState) value4;
                } while (!mutableStateFlow4.compareAndSet(value4, UpPassFormState.LoadingResult.INSTANCE));
                if ((this.this$0.f107133b.getFormType() instanceof UpPassFormType.Ocr) || (this.this$0.f107133b.getFormType() instanceof UpPassFormType.OcrFaceCompareLiveness)) {
                    this.this$0.f107133b.setCardReaderMode(false);
                }
                UpPassRepository upPassRepository = this.this$0.f107133b;
                boolean booleanValue = this.this$0.isAuth().getValue().booleanValue();
                this.label = 1;
                result = upPassRepository.getResult(booleanValue, this);
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                result = obj;
            }
            QueryResultResponse queryResultResponse = (QueryResultResponse) result;
            StringBuilder sb = new StringBuilder();
            sb.append("getFormResult() - result: ");
            sb.append(queryResultResponse);
            Gson create = new GsonBuilder().setPrettyPrinting().create();
            String json = create.toJson(queryResultResponse);
            Intrinsics.checkNotNullExpressionValue(json, "json");
            for (String str : StringsKt__StringsKt.split$default((CharSequence) json, new String[]{"\n"}, false, 0, 6, (Object) null)) {
            }
            if (Intrinsics.areEqual(queryResultResponse.getCodeType(), "S")) {
                UpPassFormType formType = this.this$0.f107133b.getFormType();
                if (formType instanceof UpPassFormType.Ocr) {
                    this.this$0.f107133b.setIdDocumentResult(IdDocumentResult.Companion.from(queryResultResponse.getData()));
                    if (this.this$0.f107133b.getIdDocumentResult().isManualKeyIn()) {
                        UpPassRepository upPassRepository2 = this.this$0.f107133b;
                        IdDocumentResult idDocumentResult = this.this$0.f107133b.getIdDocumentResult();
                        String readDocumentImage = queryResultResponse.getData().getReadDocumentImage();
                        copy7 = idDocumentResult.copy((r55 & 1) != 0 ? idDocumentResult.docType : null, (r55 & 2) != 0 ? idDocumentResult.verificationDocType : null, (r55 & 4) != 0 ? idDocumentResult.docNumber : null, (r55 & 8) != 0 ? idDocumentResult.prefix : null, (r55 & 16) != 0 ? idDocumentResult.firstName : null, (r55 & 32) != 0 ? idDocumentResult.middleName : null, (r55 & 64) != 0 ? idDocumentResult.lastName : null, (r55 & 128) != 0 ? idDocumentResult.gender : null, (r55 & 256) != 0 ? idDocumentResult.birthday : null, (r55 & 512) != 0 ? idDocumentResult.birthdayUpPass : null, (r55 & 1024) != 0 ? idDocumentResult.houseNo : null, (r55 & 2048) != 0 ? idDocumentResult.moo : null, (r55 & 4096) != 0 ? idDocumentResult.road : null, (r55 & 8192) != 0 ? idDocumentResult.soi : null, (r55 & 16384) != 0 ? idDocumentResult.subDistrict : null, (r55 & 32768) != 0 ? idDocumentResult.district : null, (r55 & 65536) != 0 ? idDocumentResult.province : null, (r55 & 131072) != 0 ? idDocumentResult.country : null, (r55 & 262144) != 0 ? idDocumentResult.postcode : null, (r55 & 524288) != 0 ? idDocumentResult.issue : null, (r55 & 1048576) != 0 ? idDocumentResult.expire : null, (r55 & 2097152) != 0 ? idDocumentResult.bp1Number : null, (r55 & 4194304) != 0 ? idDocumentResult.chipId : null, (r55 & 8388608) != 0 ? idDocumentResult.laserCode : null, (r55 & 16777216) != 0 ? idDocumentResult.address : null, (r55 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? idDocumentResult.docImage : readDocumentImage != null ? Base64ExtKt.getBase64Image(readDocumentImage) : null, (r55 & 67108864) != 0 ? idDocumentResult.faceImage : null, (r55 & 134217728) != 0 ? idDocumentResult.dopaStatus : null, (r55 & 268435456) != 0 ? idDocumentResult.dopaFlag : null, (r55 & PKIFailureInfo.duplicateCertReq) != 0 ? idDocumentResult.isDopaByPass : false, (r55 & 1073741824) != 0 ? idDocumentResult.verificationDopa : null, (r55 & Integer.MIN_VALUE) != 0 ? idDocumentResult.isManualKeyIn : false, (r56 & 1) != 0 ? idDocumentResult.verificationSlugId : null, (r56 & 2) != 0 ? idDocumentResult.verificationForm : null, (r56 & 4) != 0 ? idDocumentResult.idCardInformation : null, (r56 & 8) != 0 ? idDocumentResult.firstNameEng : null, (r56 & 16) != 0 ? idDocumentResult.lastNameEng : null);
                        upPassRepository2.setIdDocumentResult(copy7);
                    }
                    this.this$0.f107133b.saveIdCardImage();
                } else if (formType instanceof UpPassFormType.FaceCompare ? true : formType instanceof UpPassFormType.FaceCompareLiveness) {
                    this.this$0.f107133b.setFaceCompareResult(FaceCompareResult.Companion.from(queryResultResponse.getData()));
                    if (this.this$0.f107133b.isCardReaderMode()) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) this.this$0.f107133b.getFaceCompareResult().getVerificationSlugId(), (CharSequence) ":", false, 2, (Object) null)) {
                            UpPassRepository upPassRepository3 = this.this$0.f107133b;
                            FaceCompareResult faceCompareResult = this.this$0.f107133b.getFaceCompareResult();
                            String str2 = (String) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) StringsKt__StringsKt.split$default((CharSequence) this.this$0.f107133b.getFaceCompareResult().getVerificationSlugId(), new String[]{":"}, false, 0, 6, (Object) null));
                            copy6 = faceCompareResult.copy((r28 & 1) != 0 ? faceCompareResult.faceImage : null, (r28 & 2) != 0 ? faceCompareResult.faceImageSelfie : null, (r28 & 4) != 0 ? faceCompareResult.compareMessage : null, (r28 & 8) != 0 ? faceCompareResult.compareStatus : null, (r28 & 16) != 0 ? faceCompareResult.compareScore : null, (r28 & 32) != 0 ? faceCompareResult.idDocImage : null, (r28 & 64) != 0 ? faceCompareResult.attemptCount : 0, (r28 & 128) != 0 ? faceCompareResult.manualKYC : false, (r28 & 256) != 0 ? faceCompareResult.manualKYC2ndLine : false, (r28 & 512) != 0 ? faceCompareResult.manualKYC2ndLineSuccess : false, (r28 & 1024) != 0 ? faceCompareResult.manualKYC2ndLineApproved : false, (r28 & 2048) != 0 ? faceCompareResult.verificationSlugId : str2 == null ? "" : str2, (r28 & 4096) != 0 ? faceCompareResult.verificationForm : null);
                            upPassRepository3.setFaceCompareResult(copy6);
                        }
                        if (StringsKt__StringsKt.contains$default((CharSequence) this.this$0.f107133b.getFaceCompareResult().getVerificationForm(), (CharSequence) ":", false, 2, (Object) null)) {
                            UpPassRepository upPassRepository4 = this.this$0.f107133b;
                            FaceCompareResult faceCompareResult2 = this.this$0.f107133b.getFaceCompareResult();
                            String str3 = (String) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) StringsKt__StringsKt.split$default((CharSequence) this.this$0.f107133b.getFaceCompareResult().getVerificationForm(), new String[]{":"}, false, 0, 6, (Object) null));
                            copy5 = faceCompareResult2.copy((r28 & 1) != 0 ? faceCompareResult2.faceImage : null, (r28 & 2) != 0 ? faceCompareResult2.faceImageSelfie : null, (r28 & 4) != 0 ? faceCompareResult2.compareMessage : null, (r28 & 8) != 0 ? faceCompareResult2.compareStatus : null, (r28 & 16) != 0 ? faceCompareResult2.compareScore : null, (r28 & 32) != 0 ? faceCompareResult2.idDocImage : null, (r28 & 64) != 0 ? faceCompareResult2.attemptCount : 0, (r28 & 128) != 0 ? faceCompareResult2.manualKYC : false, (r28 & 256) != 0 ? faceCompareResult2.manualKYC2ndLine : false, (r28 & 512) != 0 ? faceCompareResult2.manualKYC2ndLineSuccess : false, (r28 & 1024) != 0 ? faceCompareResult2.manualKYC2ndLineApproved : false, (r28 & 2048) != 0 ? faceCompareResult2.verificationSlugId : null, (r28 & 4096) != 0 ? faceCompareResult2.verificationForm : str3 == null ? "" : str3);
                            upPassRepository4.setFaceCompareResult(copy5);
                        }
                    }
                    MutableStateFlow mutableStateFlow7 = this.this$0.f107156y;
                    UpPassViewModel upPassViewModel = this.this$0;
                    do {
                        value7 = mutableStateFlow7.getValue();
                        FaceCompareResult faceCompareResult3 = (FaceCompareResult) value7;
                        if (upPassViewModel.f107133b.isCardReaderMode()) {
                            copy4 = r16.copy((r28 & 1) != 0 ? r16.faceImage : null, (r28 & 2) != 0 ? r16.faceImageSelfie : null, (r28 & 4) != 0 ? r16.compareMessage : null, (r28 & 8) != 0 ? r16.compareStatus : null, (r28 & 16) != 0 ? r16.compareScore : null, (r28 & 32) != 0 ? r16.idDocImage : upPassViewModel.f107133b.getIdDocumentResult().getDocImage(), (r28 & 64) != 0 ? r16.attemptCount : faceCompareResult3.getAttemptCount(), (r28 & 128) != 0 ? r16.manualKYC : false, (r28 & 256) != 0 ? r16.manualKYC2ndLine : false, (r28 & 512) != 0 ? r16.manualKYC2ndLineSuccess : false, (r28 & 1024) != 0 ? r16.manualKYC2ndLineApproved : false, (r28 & 2048) != 0 ? r16.verificationSlugId : null, (r28 & 4096) != 0 ? upPassViewModel.f107133b.getFaceCompareResult().verificationForm : null);
                        } else {
                            copy4 = r16.copy((r28 & 1) != 0 ? r16.faceImage : null, (r28 & 2) != 0 ? r16.faceImageSelfie : null, (r28 & 4) != 0 ? r16.compareMessage : null, (r28 & 8) != 0 ? r16.compareStatus : null, (r28 & 16) != 0 ? r16.compareScore : null, (r28 & 32) != 0 ? r16.idDocImage : null, (r28 & 64) != 0 ? r16.attemptCount : faceCompareResult3.getAttemptCount(), (r28 & 128) != 0 ? r16.manualKYC : false, (r28 & 256) != 0 ? r16.manualKYC2ndLine : false, (r28 & 512) != 0 ? r16.manualKYC2ndLineSuccess : false, (r28 & 1024) != 0 ? r16.manualKYC2ndLineApproved : false, (r28 & 2048) != 0 ? r16.verificationSlugId : null, (r28 & 4096) != 0 ? upPassViewModel.f107133b.getFaceCompareResult().verificationForm : null);
                        }
                    } while (!mutableStateFlow7.compareAndSet(value7, copy4));
                } else if (formType instanceof UpPassFormType.OcrFaceCompareLiveness) {
                    this.this$0.f107133b.setIdDocumentResult(IdDocumentResult.Companion.from(queryResultResponse.getData()));
                    if (this.this$0.f107133b.getIdDocumentResult().isManualKeyIn()) {
                        UpPassRepository upPassRepository5 = this.this$0.f107133b;
                        IdDocumentResult idDocumentResult2 = this.this$0.f107133b.getIdDocumentResult();
                        String readDocumentImage2 = queryResultResponse.getData().getReadDocumentImage();
                        copy3 = idDocumentResult2.copy((r55 & 1) != 0 ? idDocumentResult2.docType : null, (r55 & 2) != 0 ? idDocumentResult2.verificationDocType : null, (r55 & 4) != 0 ? idDocumentResult2.docNumber : null, (r55 & 8) != 0 ? idDocumentResult2.prefix : null, (r55 & 16) != 0 ? idDocumentResult2.firstName : null, (r55 & 32) != 0 ? idDocumentResult2.middleName : null, (r55 & 64) != 0 ? idDocumentResult2.lastName : null, (r55 & 128) != 0 ? idDocumentResult2.gender : null, (r55 & 256) != 0 ? idDocumentResult2.birthday : null, (r55 & 512) != 0 ? idDocumentResult2.birthdayUpPass : null, (r55 & 1024) != 0 ? idDocumentResult2.houseNo : null, (r55 & 2048) != 0 ? idDocumentResult2.moo : null, (r55 & 4096) != 0 ? idDocumentResult2.road : null, (r55 & 8192) != 0 ? idDocumentResult2.soi : null, (r55 & 16384) != 0 ? idDocumentResult2.subDistrict : null, (r55 & 32768) != 0 ? idDocumentResult2.district : null, (r55 & 65536) != 0 ? idDocumentResult2.province : null, (r55 & 131072) != 0 ? idDocumentResult2.country : null, (r55 & 262144) != 0 ? idDocumentResult2.postcode : null, (r55 & 524288) != 0 ? idDocumentResult2.issue : null, (r55 & 1048576) != 0 ? idDocumentResult2.expire : null, (r55 & 2097152) != 0 ? idDocumentResult2.bp1Number : null, (r55 & 4194304) != 0 ? idDocumentResult2.chipId : null, (r55 & 8388608) != 0 ? idDocumentResult2.laserCode : null, (r55 & 16777216) != 0 ? idDocumentResult2.address : null, (r55 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? idDocumentResult2.docImage : readDocumentImage2 != null ? Base64ExtKt.getBase64Image(readDocumentImage2) : null, (r55 & 67108864) != 0 ? idDocumentResult2.faceImage : null, (r55 & 134217728) != 0 ? idDocumentResult2.dopaStatus : null, (r55 & 268435456) != 0 ? idDocumentResult2.dopaFlag : null, (r55 & PKIFailureInfo.duplicateCertReq) != 0 ? idDocumentResult2.isDopaByPass : false, (r55 & 1073741824) != 0 ? idDocumentResult2.verificationDopa : null, (r55 & Integer.MIN_VALUE) != 0 ? idDocumentResult2.isManualKeyIn : false, (r56 & 1) != 0 ? idDocumentResult2.verificationSlugId : null, (r56 & 2) != 0 ? idDocumentResult2.verificationForm : null, (r56 & 4) != 0 ? idDocumentResult2.idCardInformation : null, (r56 & 8) != 0 ? idDocumentResult2.firstNameEng : null, (r56 & 16) != 0 ? idDocumentResult2.lastNameEng : null);
                        upPassRepository5.setIdDocumentResult(copy3);
                    }
                    this.this$0.f107133b.saveIdCardImage();
                    UpPassFormType formType2 = this.this$0.getFormType();
                    UpPassFormType.OcrFaceCompareLiveness ocrFaceCompareLiveness = formType2 instanceof UpPassFormType.OcrFaceCompareLiveness ? (UpPassFormType.OcrFaceCompareLiveness) formType2 : null;
                    if (ocrFaceCompareLiveness != null ? Intrinsics.areEqual(ocrFaceCompareLiveness.isFaceRecognition(), Boxing.boxBoolean(true)) : false) {
                        this.this$0.f107133b.setFaceCompareResult(FaceCompareResult.Companion.from(queryResultResponse.getData()));
                        MutableStateFlow mutableStateFlow8 = this.this$0.f107156y;
                        UpPassViewModel upPassViewModel2 = this.this$0;
                        do {
                            value6 = mutableStateFlow8.getValue();
                            copy2 = r16.copy((r28 & 1) != 0 ? r16.faceImage : null, (r28 & 2) != 0 ? r16.faceImageSelfie : null, (r28 & 4) != 0 ? r16.compareMessage : null, (r28 & 8) != 0 ? r16.compareStatus : null, (r28 & 16) != 0 ? r16.compareScore : null, (r28 & 32) != 0 ? r16.idDocImage : null, (r28 & 64) != 0 ? r16.attemptCount : ((FaceCompareResult) value6).getAttemptCount(), (r28 & 128) != 0 ? r16.manualKYC : false, (r28 & 256) != 0 ? r16.manualKYC2ndLine : false, (r28 & 512) != 0 ? r16.manualKYC2ndLineSuccess : false, (r28 & 1024) != 0 ? r16.manualKYC2ndLineApproved : false, (r28 & 2048) != 0 ? r16.verificationSlugId : null, (r28 & 4096) != 0 ? upPassViewModel2.f107133b.getFaceCompareResult().verificationForm : null);
                        } while (!mutableStateFlow8.compareAndSet(value6, copy2));
                    }
                }
                UpPassFormResult formResult = this.this$0.f107133b.getFormResult();
                String formResultJsonString = create.toJson(formResult);
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Intrinsics.checkNotNullExpressionValue(formResultJsonString, "formResultJsonString");
                for (String str4 : StringsKt__StringsKt.split$default((CharSequence) formResultJsonString, new String[]{"\n"}, false, 0, 6, (Object) null)) {
                    if (StringsKt__StringsKt.contains$default((CharSequence) str4, (CharSequence) "[", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) str4, (CharSequence) "]", false, 2, (Object) null)) {
                        booleanRef.element = true;
                        String replace = new Regex("\\S+").replace(str4, "");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(replace);
                        sb2.append(" ...");
                    }
                    if (booleanRef.element && StringsKt__StringsKt.contains$default((CharSequence) str4, (CharSequence) "]", false, 2, (Object) null)) {
                        booleanRef.element = false;
                    }
                }
                mutableStateFlow6 = this.this$0.f107140i;
                do {
                    value8 = mutableStateFlow6.getValue();
                    UpPassFormState upPassFormState2 = (UpPassFormState) value8;
                } while (!mutableStateFlow6.compareAndSet(value8, new UpPassFormState.SuccessResult(formResult)));
            } else {
                if (queryResultResponse.getCodeType().length() == 0) {
                    commonErrorResponse = new CommonErrorResponse("T", "200", "เกิดข้อผิดพลาด\nกรุณาลองใหม่อีกครั้ง", this.this$0.f107133b.getErrorUserId(), null, null, null, null, C6139DK.ERROR_RECEIVE_LRC, null);
                } else {
                    commonErrorResponse = new CommonErrorResponse(queryResultResponse.getCodeType(), queryResultResponse.getCode(), queryResultResponse.getDesc(), this.this$0.f107133b.getErrorUserId(), queryResultResponse.getSystemMessage(), null, null, null, 224, null);
                }
                mutableStateFlow5 = this.this$0.f107140i;
                do {
                    value5 = mutableStateFlow5.getValue();
                    UpPassFormState upPassFormState3 = (UpPassFormState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, new UpPassFormState.ErrorResult(commonErrorResponse)));
            }
        } catch (HttpException e) {
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getFormResult() - HttpException: ");
            sb3.append(message);
            Response<?> response = e.response();
            String str5 = (response == null || (headers = response.headers()) == null) ? null : headers.get("Content-Type");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("getFormResult() - contentType: ");
            sb4.append(str5);
            String string = (response == null || (errorBody = response.errorBody()) == null) ? null : errorBody.string();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("getFormResult() - errorBody: ");
            sb5.append(string);
            if (!((str5 == null || !StringsKt__StringsKt.contains$default((CharSequence) str5, (CharSequence) "application/json", false, 2, (Object) null)) ? false : false)) {
                mutableStateFlow2 = this.this$0.f107140i;
                UpPassViewModel upPassViewModel3 = this.this$0;
                do {
                    value2 = mutableStateFlow2.getValue();
                    UpPassFormState upPassFormState4 = (UpPassFormState) value2;
                    mrtrErrorService4 = upPassViewModel3.f107134c;
                    errorCode = mrtrErrorService4.getErrorCode(e);
                    Intrinsics.checkNotNullExpressionValue(errorCode, "errorService.getErrorCode(e)");
                    mrtrErrorService5 = upPassViewModel3.f107134c;
                    errorMessage = mrtrErrorService5.getErrorMessage(e);
                    Intrinsics.checkNotNullExpressionValue(errorMessage, "errorService.getErrorMessage(e)");
                    errorUserId = upPassViewModel3.f107133b.getErrorUserId();
                    mrtrErrorService6 = upPassViewModel3.f107134c;
                    systemMessage = mrtrErrorService6.getSystemMessage(e);
                    Intrinsics.checkNotNullExpressionValue(systemMessage, "errorService.getSystemMessage(e)");
                } while (!mutableStateFlow2.compareAndSet(value2, new UpPassFormState.ErrorResult(new CommonErrorResponse("T", errorCode, errorMessage, errorUserId, systemMessage, null, null, null, 224, null))));
            } else {
                Object fromJson = new Gson().fromJson(string, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(errorBod…rrorResponse::class.java)");
                copy = r3.copy((r18 & 1) != 0 ? r3.codeType : null, (r18 & 2) != 0 ? r3.code : null, (r18 & 4) != 0 ? r3.desc : null, (r18 & 8) != 0 ? r3.userId : this.this$0.f107133b.getErrorUserId(), (r18 & 16) != 0 ? r3.systemMessage : null, (r18 & 32) != 0 ? r3.replaceMessage : null, (r18 & 64) != 0 ? r3.responseDateTime : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).data : null);
                mutableStateFlow3 = this.this$0.f107140i;
                do {
                    value3 = mutableStateFlow3.getValue();
                    UpPassFormState upPassFormState5 = (UpPassFormState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new UpPassFormState.ErrorResult(copy)));
            }
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("getFormResult() - Exception: ");
            sb6.append(message2);
            mrtrErrorService = this.this$0.f107134c;
            String errorCode2 = mrtrErrorService.getErrorCode(e2);
            Intrinsics.checkNotNullExpressionValue(errorCode2, "errorService.getErrorCode(e)");
            mrtrErrorService2 = this.this$0.f107134c;
            String errorMessage2 = mrtrErrorService2.getErrorMessage(e2);
            Intrinsics.checkNotNullExpressionValue(errorMessage2, "errorService.getErrorMessage(e)");
            String errorUserId2 = this.this$0.f107133b.getErrorUserId();
            mrtrErrorService3 = this.this$0.f107134c;
            String systemMessage2 = mrtrErrorService3.getSystemMessage(e2);
            Intrinsics.checkNotNullExpressionValue(systemMessage2, "errorService.getSystemMessage(e)");
            CommonErrorResponse commonErrorResponse2 = new CommonErrorResponse("T", errorCode2, errorMessage2, errorUserId2, systemMessage2, null, null, null, 224, null);
            mutableStateFlow = this.this$0.f107140i;
            do {
                value = mutableStateFlow.getValue();
                UpPassFormState upPassFormState6 = (UpPassFormState) value;
            } while (!mutableStateFlow.compareAndSet(value, new UpPassFormState.ErrorResult(commonErrorResponse2)));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassViewModel$getFormResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}