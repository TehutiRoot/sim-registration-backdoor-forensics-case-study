package th.p047co.dtac.android.dtacone.view.appOne.eSign.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.remote.oneConsentAndESign.OneConsentAndESignApi;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentDataTmnResponse;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneBlacklistSharingConsentTemplateResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsResponse;
import th.p047co.dtac.android.dtacone.model.blacklist.GetBlacklistSharingConsentTemplateRequest;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneConsentNoticeDocResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneUpdateAppFormRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneVerifyQrCodeRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneConsentNoticeDocRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneSummitUnityResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneVerifyQrCodeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.VerifyQrCodeData;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/repository/OneConsentAndESignRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/repository/OneConsentAndESignRepository;", "Lth/co/dtac/android/dtacone/data/remote/oneConsentAndESign/OneConsentAndESignApi;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/oneConsentAndESign/OneConsentAndESignApi;)V", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneVerifyQrCodeRequest;", "request", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneVerifyQrCodeResponse;", "verifyQrCode", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneVerifyQrCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneConsentNoticeDocRequest;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;", "blackListConsentT", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneConsentNoticeDocRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lth/co/dtac/android/dtacone/model/blacklist/GetBlacklistSharingConsentTemplateRequest;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneBlacklistSharingConsentTemplateResponse;", "blackListConsentD", "(Lth/co/dtac/android/dtacone/model/blacklist/GetBlacklistSharingConsentTemplateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneUpdateAppFormRequest;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "updateAppForm", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneUpdateAppFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consentDomain", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "getOneConsentDataTMN", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentResponse;", "getConsent", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsResponse;", "getForms", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/VerifyQrCodeData;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneSummitUnityResponse;", "updateUnifyForm", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/VerifyQrCodeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/oneConsentAndESign/OneConsentAndESignApi;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/oneConsentAndESign/OneConsentAndESignApi;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneConsentAndESignRepositoryImpl implements OneConsentAndESignRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final OneConsentAndESignApi f90789a;

    @Inject
    public OneConsentAndESignRepositoryImpl(@NotNull OneConsentAndESignApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f90789a = api;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object blackListConsentD(@NotNull GetBlacklistSharingConsentTemplateRequest getBlacklistSharingConsentTemplateRequest, @NotNull Continuation<? super OneBlacklistSharingConsentTemplateResponse> continuation) {
        return this.f90789a.blackListConsentD(getBlacklistSharingConsentTemplateRequest, continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object blackListConsentT(@NotNull OneConsentNoticeDocRequest oneConsentNoticeDocRequest, @NotNull Continuation<? super OneConsentNoticeDocResponse> continuation) {
        return this.f90789a.blackListConsentT(oneConsentNoticeDocRequest, continuation);
    }

    @NotNull
    public final OneConsentAndESignApi getApi() {
        return this.f90789a;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object getConsent(@NotNull String str, @NotNull Continuation<? super OneConsentResponse> continuation) {
        return this.f90789a.getConsent(str, continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object getForms(@NotNull OneGetFormsRequest oneGetFormsRequest, @NotNull Continuation<? super OneGetFormsResponse> continuation) {
        return this.f90789a.getForms(oneGetFormsRequest, continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object getOneConsentDataTMN(@NotNull String str, @NotNull Continuation<? super OneConsentDataTmnResponse> continuation) {
        return this.f90789a.getOneConsentDataTMN(str, continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object updateAppForm(@NotNull OneUpdateAppFormRequest oneUpdateAppFormRequest, @NotNull Continuation<? super OneCommonResponse> continuation) {
        return this.f90789a.updateAppForm(oneUpdateAppFormRequest, continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object updateUnifyForm(@NotNull VerifyQrCodeData verifyQrCodeData, @NotNull Continuation<? super OneSummitUnityResponse> continuation) {
        return this.f90789a.submitPhotoConsent(verifyQrCodeData, continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository
    @Nullable
    public Object verifyQrCode(@NotNull OneVerifyQrCodeRequest oneVerifyQrCodeRequest, @NotNull Continuation<? super OneVerifyQrCodeResponse> continuation) {
        return this.f90789a.verifyQrCode(oneVerifyQrCodeRequest, continuation);
    }
}