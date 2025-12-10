package th.p047co.dtac.android.dtacone.view.appOne.mnp.repository;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.ResponseBody;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.BuildConfig;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTCheckPrivilegeRequest;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTCheckPrivilegeResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueRequest;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.model.Version;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.insert_doc.OneInsertDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_worker.OneChangeOwnerSubmitWorkerResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpChangePricePlanRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpCheckBlackListRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpCheckSimInfoRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpCustomerPreVerifyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpPreVerifyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpPricePlanDetailRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpPricePlanRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpPropositionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpQueryPackageSetRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpSaveOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpSubmitOrderPortInRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpTSummitOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpValidateOperatorRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpValidateSimMnpProcessRequest;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpAuthorizationTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpCustomerPreVerifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpPreVerifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpPricePlanDetailResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpPricePlanResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpPropositionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpSaveOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpSubmitOrderPortInResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpTSummitOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpTruePackageListResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpValidateOperatorResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpValidateSimMnpProcessResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneSaveFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneSaveFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneVerifyAndGenAutoApproveCodeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneVerifyAndGenAutoApproveCodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.request.OneUploadDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.response.OneUploadDocumentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidConsentAcceptResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidCreateConsentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidCreateConsentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitWorkerRequest;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.check_sim_info.response.MnpCheckSimInfoResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.otp.MnpRequestOtpRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.otp.MnpRequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.otp.MnpVerifyOtpRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.response.MnpQueryPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.submit.request.MrtrMnpSubmitRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.submit.response.MrtrMnpSubmitResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.request.CheckSimStockRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.response.CheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.request.CutSimStockRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.save_result.request.SaveSimStockResultRequest;
import th.p047co.dtac.android.dtacone.model.otp_v3.request.RequestOtpV3Body;
import th.p047co.dtac.android.dtacone.model.otp_v3.request.RequestOtpV3Response;
import th.p047co.dtac.android.dtacone.model.otp_v3.verify.VerifyOtpTransactionResponse;
import th.p047co.dtac.android.dtacone.model.otp_v3.verify.VerifyOtpV3Request;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoRequest;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneBuyDolAcceptConsentRequest;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OnePrepaidStatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000º\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u0016\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010\u0016\u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00172\u0006\u0010\u0016\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010\u0016\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0017H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00172\u0006\u0010\u0016\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00172\u0006\u0010\u0016\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00172\u0006\u0010\u0016\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00172\u0006\u0010\u0016\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00172\u0006\u0010\u0016\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00172\u0006\u0010\u0016\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00172\u0006\u0010\u0016\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00172\u0006\u0010\u0016\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00172\u0006\u0010\u0016\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ+\u0010W\u001a\u00020V2\b\u0010R\u001a\u0004\u0018\u00010\u00122\b\u0010S\u001a\u0004\u0018\u00010\u00122\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bW\u0010XJ\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u00172\u0006\u0010\u0016\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00172\u0006\u0010\u0016\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020O0\u00172\u0006\u0010\u0016\u001a\u00020NH\u0016¢\u0006\u0004\ba\u0010QJ\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bc\u0010\u001aJ\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u00172\u0006\u0010\u0016\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u0012H\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u00122\u0006\u0010q\u001a\u00020\u0012H\u0016¢\u0006\u0004\br\u0010pJ\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020t0\u00172\u0006\u0010\u0016\u001a\u00020sH\u0016¢\u0006\u0004\bu\u0010vJ\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020x0\u00172\u0006\u0010\u0016\u001a\u00020wH\u0016¢\u0006\u0004\by\u0010zJ\u001d\u0010}\u001a\b\u0012\u0004\u0012\u00020|0\u00172\u0006\u0010\u0016\u001a\u00020{H\u0016¢\u0006\u0004\b}\u0010~J!\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u0083\u0001H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J!\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020|0\u00172\u0007\u0010\u0016\u001a\u00030\u0087\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\"\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\"\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u008e\u0001H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\"\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u0092\u0001H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\"\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u0096\u0001H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\"\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u009a\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0011\u0010\u009e\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u0014J\"\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u00172\u0007\u0010\u0016\u001a\u00030\u009f\u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\"\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010\u00172\u0007\u0010\u0016\u001a\u00030£\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\"\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010\u00172\u0007\u0010\u0016\u001a\u00030§\u0001H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J\"\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010\u00172\u0007\u0010\u0016\u001a\u00030«\u0001H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\"\u0010±\u0001\u001a\t\u0012\u0005\u0012\u00030°\u00010\u00172\u0007\u0010\u0016\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b±\u0001\u0010²\u0001J\"\u0010µ\u0001\u001a\t\u0012\u0005\u0012\u00030´\u00010\u00172\u0007\u0010\u0016\u001a\u00030³\u0001H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\"\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010\u00172\u0007\u0010\u0016\u001a\u00030·\u0001H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J\"\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010\u00172\u0007\u0010\u0016\u001a\u00030»\u0001H\u0016¢\u0006\u0006\b½\u0001\u0010¾\u0001J\"\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u00172\u0007\u0010\u0016\u001a\u00030¿\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0018\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030Ã\u00010\u0017H\u0016¢\u0006\u0005\bÄ\u0001\u0010-J\"\u0010Ç\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010\u00172\u0007\u0010\u0016\u001a\u00030Å\u0001H\u0016¢\u0006\u0006\bÇ\u0001\u0010È\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010Í\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001¨\u0006Ö\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/repository/OneMnpRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/repository/OneMnpRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;", "oneChangeOwnerApi", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "pref", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "udidService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/util/FileUtil;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/manager/service/UdidService;)V", "", OperatorName.CURVE_TO, "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationRequest;", "request", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "getAuthorization", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpRequest;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpResponse;", "requestOtp", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpVerifyOtpRequest;", "Lokhttp3/ResponseBody;", "oneMnpVerifyOtp", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpVerifyOtpRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpCheckBlackListRequest;", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "oneMnpCheckBlackList", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpCheckBlackListRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpQueryPackageSetRequest;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/MnpQueryPackageSetResponse;", "oneMnpQueryPackageSet", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpQueryPackageSetRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpTruePackageListResponse;", "oneTrueMnpQueryPackageSet", "()Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpCheckSimInfoRequest;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;", "oneMnpCheckSimInfo", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpCheckSimInfoRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/request/CheckSimStockRequest;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "oneMnpCheckSimStock", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/request/CheckSimStockRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoRequest;", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoResponse;", "oneMnpGetPostCodeInfo", "(Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/request/CutSimStockRequest;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "oneMnpCutSimStock", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/request/CutSimStockRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/save_result/request/SaveSimStockResultRequest;", "Ljava/lang/Void;", "oneMnpSubmitSimResult", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/save_result/request/SaveSimStockResultRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MrtrMnpSubmitRequest;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/response/MrtrMnpSubmitResponse;", "oneMnpSubmit", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MrtrMnpSubmitRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/upload_image/request/UploadImageRequest;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "oneMnpUploadImage", "(Lth/co/dtac/android/dtacone/model/upload_image/request/UploadImageRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/otp_v3/verify/VerifyOtpV3Request;", "Lth/co/dtac/android/dtacone/model/otp_v3/verify/VerifyOtpTransactionResponse;", "oneMnpVerifyOtpTransaction", "(Lth/co/dtac/android/dtacone/model/otp_v3/verify/VerifyOtpV3Request;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileRequest;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "validateProfile", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileRequest;)Lio/reactivex/Single;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "simCardNumber", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformation", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "getCardCollection", "(Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;", "checkPrivilege", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "oneMnpValidateSimT", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueRequest;)Lio/reactivex/Single;", "oneMnpValidateProfileTrue", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyResponse;", "getAuthorizationTrueCompany", "Lth/co/dtac/android/dtacone/model/otp_v3/request/RequestOtpV3Body;", "Lth/co/dtac/android/dtacone/model/otp_v3/request/RequestOtpV3Response;", "oneMnpRequestOtpTransactionTrueCompany", "(Lth/co/dtac/android/dtacone/model/otp_v3/request/RequestOtpV3Body;)Lio/reactivex/Single;", "", "mrtrConsentId", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OnePrepaidStatusResponse;", "oneConsentAcceptT", "(Ljava/lang/Integer;)Lio/reactivex/Observable;", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidCreateConsentRequest;", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidCreateConsentResponse;", "onePrepaidCreateConsentPDPA", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidCreateConsentRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitOrderRequest;", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitOrderResponse;", "onePrepaidSubmitOrder", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitOrderRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/insert_doc/OneInsertDocumentRequest;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "insertDocument", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/insert_doc/OneInsertDocumentRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitWorkerRequest;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_worker/OneChangeOwnerSubmitWorkerResponse;", "onePrepaidSubmitWorker", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitWorkerRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpValidateOperatorRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpValidateOperatorResponse;", "validateOperator", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpValidateOperatorRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpChangePricePlanRequest;", "oneMnpChangePricePlan", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpChangePricePlanRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpSubmitOrderPortInRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpSubmitOrderPortInResponse;", "oneMnpSubmitOrderPortIn", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpSubmitOrderPortInRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpValidateSimMnpProcessRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpValidateSimMnpProcessResponse;", "oneMnpValidateSimMnpProcess", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpValidateSimMnpProcessRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpCustomerPreVerifyRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpCustomerPreVerifyResponse;", "oneMnpCustomerPreVerify", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpCustomerPreVerifyRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPreVerifyRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpPreVerifyResponse;", "oneMnpPreVerify", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPreVerifyRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeRequest;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeResponse;", "onePostpaidVerifyAndGenAutoApproveCode", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeRequest;)Lio/reactivex/Single;", "generateTransactionID", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPropositionRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpPropositionResponse;", "oneMnpProposition", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPropositionRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPricePlanRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpPricePlanResponse;", "oneMnpPricePlan", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPricePlanRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPricePlanDetailRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpPricePlanDetailResponse;", "oneMnpPricePlanDetail", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPricePlanDetailRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpSaveOrderRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpSaveOrderResponse;", "oneMnpTSaveOrder", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpSaveOrderRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsRequest;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsResponse;", "oneUpdateAppForms", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormRequest;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormResponse;", "oneGenerateForm", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsResponse;", "oneGetForm", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneSaveFormsRequest;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneSaveFormsResponse;", "oneSaveForm", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneSaveFormsRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpTSummitOrderRequest;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpTSummitOrderResponse;", "oneMnpTSummitOrder", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpTSummitOrderRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "getOneTureLocation", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/uploadImage/request/OneUploadDocumentRequest;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/uploadImage/response/OneUploadDocumentResponse;", "oneCommonUploadImage", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/uploadImage/request/OneUploadDocumentRequest;)Lio/reactivex/Single;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "d", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "e", "Lth/co/dtac/android/dtacone/util/FileUtil;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneMnpRepositoryImpl implements OneMnpRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f91983a;

    /* renamed from: b */
    public final OneChangeOwnerApi f91984b;

    /* renamed from: c */
    public final PreferencesRepository f91985c;

    /* renamed from: d */
    public final ConfigurationRepository f91986d;

    /* renamed from: e */
    public final FileUtil f91987e;

    /* renamed from: f */
    public final RtrRx2Repository f91988f;

    /* renamed from: g */
    public final UdidService f91989g;

    public OneMnpRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull OneChangeOwnerApi oneChangeOwnerApi, @NotNull PreferencesRepository pref, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull UdidService udidService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(oneChangeOwnerApi, "oneChangeOwnerApi");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        this.f91983a = api;
        this.f91984b = oneChangeOwnerApi;
        this.f91985c = pref;
        this.f91986d = configurationRepository;
        this.f91987e = fileUtil;
        this.f91988f = rtrRx2Repository;
        this.f91989g = udidService;
    }

    /* renamed from: a */
    public static /* synthetic */ OnePrepaidStatusResponse m13592a(Function1 function1, Object obj) {
        return m13588e(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ MnpAuthorizationResponse m13591b(Function1 function1, Object obj) {
        return m13589d(function1, obj);
    }

    /* renamed from: d */
    public static final MnpAuthorizationResponse m13589d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MnpAuthorizationResponse) tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final OnePrepaidStatusResponse m13588e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OnePrepaidStatusResponse) tmp0.invoke(obj);
    }

    /* renamed from: c */
    public final String m13590c() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        String upperCase = AbstractC19741eO1.replace$default(uuid, HelpFormatter.DEFAULT_OPT_PREFIX, "", false, 4, (Object) null).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return StringsKt___StringsKt.takeLast(upperCase, 4);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OnePrepaidRegisterTCheckPrivilegeResponse> checkPrivilege(@NotNull OnePrepaidRegisterTCheckPrivilegeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.onePrepaidRegisterCheckPrivilege(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public String decryptCBC(@NotNull String cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (cipher.length() == 0) {
            return "";
        }
        return AESCryptUtil.decryptCBC(cipher, this.f91986d.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public String encryptCBC(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return "";
        }
        return AESCryptUtil.encryptCBC(text, this.f91986d.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public String generateTransactionID() {
        String currentDateFormatted = DateUtil.getCurrentDateFormatted();
        String m13590c = m13590c();
        return currentDateFormatted + "A1MNPO" + m13590c;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<MnpAuthorizationResponse> getAuthorization(@NotNull MnpAuthorizationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<MnpAuthorizationResponse> oneMnpAuthorization = this.f91983a.oneMnpAuthorization(request);
        final OneMnpRepositoryImpl$getAuthorization$1 oneMnpRepositoryImpl$getAuthorization$1 = new OneMnpRepositoryImpl$getAuthorization$1(this);
        Single map = oneMnpAuthorization.map(new Function() { // from class: JV0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneMnpRepositoryImpl.m13591b(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun getAuthoriz… response\n        }\n    }");
        return map;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpAuthorizationTrueCompanyResponse> getAuthorizationTrueCompany(@NotNull MnpAuthorizationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpAuthorizationTrueCompany(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public CardCollection getCardCollection(@Nullable String str, @Nullable String str2, @NotNull IdCardInformationCollection cardInformation) {
        Intrinsics.checkNotNullParameter(cardInformation, "cardInformation");
        String district = cardInformation.getDistrict();
        Intrinsics.checkNotNullExpressionValue(district, "cardInformation.district");
        String replace$default = AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(district, "อำเภอ", "", false, 4, (Object) null), "เขต", "", false, 4, (Object) null);
        String province = cardInformation.getProvince();
        Intrinsics.checkNotNullExpressionValue(province, "cardInformation.province");
        return new CardCollection(cardInformation.getIdCard(), cardInformation.getPrefixTH(), cardInformation.getFirstNameTH(), cardInformation.getSurnameTH(), replace$default, AbstractC19741eO1.replace$default(province, "จังหวัด", "", false, 4, (Object) null), cardInformation.getAddress(), str, str2, cardInformation.getBirthday(), cardInformation.getGender());
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneCommonTrueLocationResponse> getOneTureLocation() {
        return this.f91983a.getOneTrueLocation();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneCommonResponse> insertDocument(@NotNull OneInsertDocumentRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.onePrepaidInsertDocument(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneUploadDocumentResponse> oneCommonUploadImage(@NotNull OneUploadDocumentRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneCommonUploadImage(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Observable<OnePrepaidStatusResponse> oneConsentAcceptT(@Nullable Integer num) {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        Version version = new Version(MODEL, "android", BuildConfig.VERSION_NAME, RELEASE);
        Observable<OnePrepaidConsentAcceptResponse> oneConsentAcceptT = this.f91983a.oneConsentAcceptT(new OneBuyDolAcceptConsentRequest(this.f91988f.getSessionNow().getToken().getId(), num, version.getPlatform(), version.getOsVersion(), version.getDeviceModel(), version.getAppVersion(), this.f91989g.getAndroidID()));
        final OneMnpRepositoryImpl$oneConsentAcceptT$1 oneMnpRepositoryImpl$oneConsentAcceptT$1 = OneMnpRepositoryImpl$oneConsentAcceptT$1.INSTANCE;
        Observable map = oneConsentAcceptT.map(new Function() { // from class: KV0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneMnpRepositoryImpl.m13592a(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "api.oneConsentAcceptT(ac…tusResponse\n            }");
        return map;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneGenerateFormResponse> oneGenerateForm(@NotNull OneGenerateFormRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneGenerateForm(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneGetFormsResponse> oneGetForm(@NotNull OneGetFormsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneGetForms(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneCommonResponse> oneMnpChangePricePlan(@NotNull OneMnpChangePricePlanRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpChangePricePlan(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<StatusResponse> oneMnpCheckBlackList(@NotNull OneMnpCheckBlackListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpCheckBlackList(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<MnpCheckSimInfoResponse> oneMnpCheckSimInfo(@NotNull OneMnpCheckSimInfoRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpCheckSimInfo(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<CheckSimStockResponse> oneMnpCheckSimStock(@NotNull CheckSimStockRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpCheckSimStock(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpCustomerPreVerifyResponse> oneMnpCustomerPreVerify(@NotNull OneMnpCustomerPreVerifyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpCustomerPreVerify(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<CutSimStockResponse> oneMnpCutSimStock(@NotNull CutSimStockRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpCutSimStock(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<GetPostCodeInfoResponse> oneMnpGetPostCodeInfo(@NotNull GetPostCodeInfoRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpGetPostCodeInfo(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpPreVerifyResponse> oneMnpPreVerify(@NotNull OneMnpPreVerifyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpPostpaidPreVerify(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpPricePlanResponse> oneMnpPricePlan(@NotNull OneMnpPricePlanRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpPricePlan(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpPricePlanDetailResponse> oneMnpPricePlanDetail(@NotNull OneMnpPricePlanDetailRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpPricePlanDetail(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpPropositionResponse> oneMnpProposition(@NotNull OneMnpPropositionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpProposition(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<MnpQueryPackageSetResponse> oneMnpQueryPackageSet(@NotNull OneMnpQueryPackageSetRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpQueryPackageSet(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<RequestOtpV3Response> oneMnpRequestOtpTransactionTrueCompany(@NotNull RequestOtpV3Body request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpRequestOtpTransactionTrueCompany(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<MrtrMnpSubmitResponse> oneMnpSubmit(@NotNull MrtrMnpSubmitRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpSubmit(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpSubmitOrderPortInResponse> oneMnpSubmitOrderPortIn(@NotNull OneMnpSubmitOrderPortInRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpSubmitOrderPortIn(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<Void> oneMnpSubmitSimResult(@NotNull SaveSimStockResultRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpSubmitSimResult(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpSaveOrderResponse> oneMnpTSaveOrder(@NotNull OneMnpSaveOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpSaveOrder(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpTSummitOrderResponse> oneMnpTSummitOrder(@NotNull OneMnpTSummitOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpSubmitOrder(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<UploadImageResponse> oneMnpUploadImage(@NotNull UploadImageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpUploadImage(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneChangeOwnerValidateProfileResponse> oneMnpValidateProfileTrue(@NotNull OneChangeOwnerValidateProfileRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpValidateProfileTrue(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpValidateSimMnpProcessResponse> oneMnpValidateSimMnpProcess(@NotNull OneMnpValidateSimMnpProcessRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpValidateSimMnpProcess(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneValidateSimTrueResponse> oneMnpValidateSimT(@NotNull OneValidateSimTrueRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneValidateSimT(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<ResponseBody> oneMnpVerifyOtp(@NotNull MnpVerifyOtpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpVerifyOtp(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<VerifyOtpTransactionResponse> oneMnpVerifyOtpTransaction(@NotNull VerifyOtpV3Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpVerifyOtpTransaction(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneVerifyAndGenAutoApproveCodeResponse> onePostpaidVerifyAndGenAutoApproveCode(@NotNull OneVerifyAndGenAutoApproveCodeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.verifyAndGenAutoApproveCode(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OnePrepaidCreateConsentResponse> onePrepaidCreateConsentPDPA(@NotNull OnePrepaidCreateConsentRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.onePrepaidCreateConsentPDPA(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OnePrepaidSubmitOrderResponse> onePrepaidSubmitOrder(@NotNull OnePrepaidSubmitOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.onePrepaidSubmitOrder(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneChangeOwnerSubmitWorkerResponse> onePrepaidSubmitWorker(@NotNull OnePrepaidSubmitWorkerRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.onePrepaidSubmitWorker(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneSaveFormsResponse> oneSaveForm(@NotNull OneSaveFormsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneSaveForms(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpTruePackageListResponse> oneTrueMnpQueryPackageSet() {
        return this.f91983a.oneTrueMnpQueryPackageSet();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneUpdateAppFormsResponse> oneUpdateAppForms(@NotNull OneUpdateAppFormsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneUpdateAppForms(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<MnpRequestOtpResponse> requestOtp(@NotNull MnpRequestOtpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpRequestOtp(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneMnpValidateOperatorResponse> validateOperator(@NotNull OneMnpValidateOperatorRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91983a.oneMnpValidateOperator(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository
    @NotNull
    public Single<OneChangeOwnerValidateProfileResponse> validateProfile(@NotNull OneChangeOwnerValidateProfileRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f91984b.validateProfileTrue(request);
    }
}