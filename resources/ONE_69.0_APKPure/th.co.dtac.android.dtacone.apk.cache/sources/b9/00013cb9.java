package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.BuildConfig;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.DataScabResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneActivateResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePermissionActivationRequest;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePermissionActivationResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePermissionsItem;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAssignPoolingResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTCheckPrivilegeRequest;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTCheckPrivilegeResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTGetScabResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTQueryCampaignRequest;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTQueryCampaignResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueRequest;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.PrepaidProfile;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.SimInfo;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.model.GetReceiptBase64Request;
import th.p047co.dtac.android.dtacone.model.GetReceiptBase64Response;
import th.p047co.dtac.android.dtacone.model.Version;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.insert_doc.OneInsertDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_worker.OneChangeOwnerSubmitWorkerResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Account;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.C14224Ou;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Campaign;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.CampaignDetail;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.ConsentItem;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.ContactMedium;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Customer;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.IndividualIdentification;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Medium;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Offers;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidConsentAcceptResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidCreateConsentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidCreateConsentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitWorkerRequest;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OrderCharacteristic;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OrderItem;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.ProductCharacteristicItem;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Scab;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Subscriber;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionResponse;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.assign_pooling.request.MrtrPrepaidAssignPoolingRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.request.CheckSimStockRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.family_sim.SaveFamilySimResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.save_result.request.SaveSimStockResultRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.request.MrtrPrepaidValidateBarcodeRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_id_card.request.MrtrPrepaidValidateIdCardRequest;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoRequest;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.config.FaceNotFoundCountBeforeManualAccept;
import th.p047co.dtac.android.dtacone.model.prepaid.config.FaceRecognitionByPass;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.DiscountItem;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.SimTermSukCheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.simTermSuk.cutSimStock.SimTermSukCutSimStockRequest;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentRequest;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.ForceType;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidRegisterType;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.p052enum.UserNameType;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneBuyDolAcceptConsentRequest;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OnePrepaidStatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.OnePrepaidModel;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000à\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010\u0016\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00172\u0006\u0010\u0016\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00172\u0006\u0010\u0016\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J%\u00100\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0\u00172\u0006\u0010\u0016\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00172\u0006\u0010\u0016\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00172\u0006\u0010\u0016\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00172\u0006\u0010\u0016\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00172\u0006\u0010\u0016\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010=J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00172\u0006\u0010\u0016\u001a\u00020:¢\u0006\u0004\bA\u0010=J\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00172\u0006\u0010\u0016\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00172\u0006\u0010\u0016\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00172\u0006\u0010\u0016\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00172\u0006\u0010\u0016\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T2\b\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u0017H\u0016¢\u0006\u0004\bY\u0010ZJ\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u00172\b\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b^\u0010_J\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u00172\u0006\u0010\u0016\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ\u0015\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u0017H\u0016¢\u0006\u0004\be\u0010ZJ\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u0017H\u0016¢\u0006\u0004\bg\u0010ZJ\u0015\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u0017H\u0016¢\u0006\u0004\bi\u0010ZJ\u000f\u0010j\u001a\u00020\u0012H\u0016¢\u0006\u0004\bj\u0010\u0014J\u0015\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001b0kH\u0016¢\u0006\u0004\bl\u0010mJ\u0015\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001b0kH\u0016¢\u0006\u0004\bn\u0010mJ\u000f\u0010o\u001a\u00020\u0012H\u0016¢\u0006\u0004\bo\u0010\u0014J\u000f\u0010p\u001a\u00020.H\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020.H\u0016¢\u0006\u0004\br\u0010qJ\u000f\u0010s\u001a\u00020.H\u0016¢\u0006\u0004\bs\u0010qJ\u0017\u0010u\u001a\u00020\u001b2\u0006\u0010t\u001a\u00020\u001bH\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010x\u001a\u00020\u001b2\u0006\u0010w\u001a\u00020\u001bH\u0016¢\u0006\u0004\bx\u0010vJ\u0019\u0010z\u001a\u00020\u001b2\b\u0010y\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\bz\u0010vJ.\u0010\u0080\u0001\u001a\u00020\u007f2\b\u0010{\u001a\u0004\u0018\u00010\u001b2\b\u0010|\u001a\u0004\u0018\u00010\u001b2\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\"\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u0082\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\"\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u00172\u0007\u0010\u0016\u001a\u00030\u0086\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u008a\u0001\u0010qJ\"\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020U0T2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\"\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020U0T2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001J\u0012\u0010\u0090\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0012\u0010\u0092\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0013\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0012\u0010\u0096\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0091\u0001J\u0012\u0010\u0097\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0091\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u009e\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u009f\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010 \u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R*\u0010©\u0001\u001a\u00030£\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R0\u0010°\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R.\u0010´\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b±\u0001\u0010\u0091\u0001\"\u0006\b²\u0001\u0010³\u0001R.\u0010·\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bµ\u0001\u0010\u0091\u0001\"\u0006\b¶\u0001\u0010³\u0001R)\u0010»\u0001\u001a\u00020\u00122\u0007\u0010«\u0001\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b¸\u0001\u0010\u0014\"\u0006\b¹\u0001\u0010º\u0001R.\u0010À\u0001\u001a\u0004\u0018\u00010\u001e2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R.\u0010Å\u0001\u001a\u0004\u0018\u00010*2\t\u0010«\u0001\u001a\u0004\u0018\u00010*8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010É\u0001\u001a\u00030Æ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ë\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010\u0091\u0001R=\u0010Ñ\u0001\u001a\f\u0012\u0005\u0012\u00030Í\u0001\u0018\u00010Ì\u00012\u0011\u0010«\u0001\u001a\f\u0012\u0005\u0012\u00030Í\u0001\u0018\u00010Ì\u00018V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\bÎ\u0001\u0010m\"\u0006\bÏ\u0001\u0010Ð\u0001R.\u0010Ö\u0001\u001a\u0004\u0018\u00010>2\t\u0010«\u0001\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R.\u0010Ù\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b×\u0001\u0010\u0091\u0001\"\u0006\bØ\u0001\u0010³\u0001R.\u0010Þ\u0001\u001a\u0004\u0018\u00010G2\t\u0010«\u0001\u001a\u0004\u0018\u00010G8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R.\u0010ã\u0001\u001a\u0004\u0018\u00010:2\t\u0010«\u0001\u001a\u0004\u0018\u00010:8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R.\u0010è\u0001\u001a\u0004\u0018\u00010;2\t\u0010«\u0001\u001a\u0004\u0018\u00010;8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R.\u0010í\u0001\u001a\u0004\u0018\u00010C2\t\u0010«\u0001\u001a\u0004\u0018\u00010C8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R9\u0010ð\u0001\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010k2\u000f\u0010«\u0001\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010k8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\bî\u0001\u0010m\"\u0006\bï\u0001\u0010Ð\u0001R.\u0010ó\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bñ\u0001\u0010\u0091\u0001\"\u0006\bò\u0001\u0010³\u0001R.\u0010ö\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bô\u0001\u0010\u0091\u0001\"\u0006\bõ\u0001\u0010³\u0001R.\u0010ù\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b÷\u0001\u0010\u0091\u0001\"\u0006\bø\u0001\u0010³\u0001R*\u0010ü\u0001\u001a\u00020\u001b2\u0007\u0010«\u0001\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bú\u0001\u0010\u0091\u0001\"\u0006\bû\u0001\u0010³\u0001R\u0017\u0010þ\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010\u0091\u0001R\u0017\u0010\u0080\u0002\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u0091\u0001R0\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u0081\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010\u0081\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R*\u0010\u008b\u0002\u001a\u00020R2\u0007\u0010«\u0001\u001a\u00020R8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R.\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0002\u0010\u0091\u0001\"\u0006\b\u008d\u0002\u0010³\u0001R0\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u008f\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010\u008f\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002R.\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0002\u0010\u0091\u0001\"\u0006\b\u0096\u0002\u0010³\u0001R*\u0010\u009a\u0002\u001a\u00020\u001b2\u0007\u0010«\u0001\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0002\u0010\u0091\u0001\"\u0006\b\u0099\u0002\u0010³\u0001R)\u0010\u009b\u0002\u001a\u00020\u00122\u0007\u0010«\u0001\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u009b\u0002\u0010\u0014\"\u0006\b\u009c\u0002\u0010º\u0001R9\u0010\u009f\u0002\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010k2\u000f\u0010«\u0001\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010k8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u009d\u0002\u0010m\"\u0006\b\u009e\u0002\u0010Ð\u0001R.\u0010¢\u0002\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b \u0002\u0010\u0091\u0001\"\u0006\b¡\u0002\u0010³\u0001R.\u0010¥\u0002\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b£\u0002\u0010\u0091\u0001\"\u0006\b¤\u0002\u0010³\u0001R.\u0010¨\u0002\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¦\u0002\u0010\u0091\u0001\"\u0006\b§\u0002\u0010³\u0001R0\u0010®\u0002\u001a\u0005\u0018\u00010©\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010©\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002R\u0016\u0010¯\u0002\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0002\u0010\u0014R.\u0010´\u0002\u001a\u0004\u0018\u00010R2\t\u0010«\u0001\u001a\u0004\u0018\u00010R8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R0\u0010º\u0002\u001a\u0005\u0018\u00010µ\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010µ\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¶\u0002\u0010·\u0002\"\u0006\b¸\u0002\u0010¹\u0002R0\u0010À\u0002\u001a\u0005\u0018\u00010»\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010»\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¼\u0002\u0010½\u0002\"\u0006\b¾\u0002\u0010¿\u0002R-\u0010~\u001a\u0004\u0018\u00010}2\t\u0010«\u0001\u001a\u0004\u0018\u00010}8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÁ\u0002\u0010Â\u0002\"\u0006\bÃ\u0002\u0010Ä\u0002R.\u0010É\u0002\u001a\u0004\u0018\u00010\u007f2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u007f8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÅ\u0002\u0010Æ\u0002\"\u0006\bÇ\u0002\u0010È\u0002R.\u0010Î\u0002\u001a\u0004\u0018\u00010&2\t\u0010«\u0001\u001a\u0004\u0018\u00010&8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0002\u0010Ë\u0002\"\u0006\bÌ\u0002\u0010Í\u0002R.\u0010Ñ\u0002\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÏ\u0002\u0010\u0091\u0001\"\u0006\bÐ\u0002\u0010³\u0001R.\u0010Ö\u0002\u001a\u0004\u0018\u00010\"2\t\u0010«\u0001\u001a\u0004\u0018\u00010\"8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÒ\u0002\u0010Ó\u0002\"\u0006\bÔ\u0002\u0010Õ\u0002R*\u0010Ù\u0002\u001a\u00020R2\u0007\u0010«\u0001\u001a\u00020R8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b×\u0002\u0010\u0088\u0002\"\u0006\bØ\u0002\u0010\u008a\u0002R)\u0010Ú\u0002\u001a\u00020\u00122\u0007\u0010«\u0001\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\bÚ\u0002\u0010\u0014\"\u0006\bÛ\u0002\u0010º\u0001R*\u0010Þ\u0002\u001a\u00020R2\u0007\u0010«\u0001\u001a\u00020R8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÜ\u0002\u0010\u0088\u0002\"\u0006\bÝ\u0002\u0010\u008a\u0002R*\u0010á\u0002\u001a\u00020R2\u0007\u0010«\u0001\u001a\u00020R8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bß\u0002\u0010\u0088\u0002\"\u0006\bà\u0002\u0010\u008a\u0002R\u0018\u0010å\u0002\u001a\u00030â\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bã\u0002\u0010ä\u0002R*\u0010è\u0002\u001a\u00020R2\u0007\u0010«\u0001\u001a\u00020R8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bæ\u0002\u0010\u0088\u0002\"\u0006\bç\u0002\u0010\u008a\u0002R0\u0010î\u0002\u001a\u0005\u0018\u00010é\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010é\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bê\u0002\u0010ë\u0002\"\u0006\bì\u0002\u0010í\u0002R0\u0010ñ\u0002\u001a\u0005\u0018\u00010é\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010é\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bï\u0002\u0010ë\u0002\"\u0006\bð\u0002\u0010í\u0002R0\u0010ô\u0002\u001a\u0005\u0018\u00010é\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010é\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bò\u0002\u0010ë\u0002\"\u0006\bó\u0002\u0010í\u0002R0\u0010÷\u0002\u001a\u0005\u0018\u00010é\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010é\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bõ\u0002\u0010ë\u0002\"\u0006\bö\u0002\u0010í\u0002R*\u0010ü\u0002\u001a\u0002022\u0007\u0010«\u0001\u001a\u0002028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bø\u0002\u0010ù\u0002\"\u0006\bú\u0002\u0010û\u0002R.\u0010\u0081\u0003\u001a\u0004\u0018\u0001032\t\u0010«\u0001\u001a\u0004\u0018\u0001038V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bý\u0002\u0010þ\u0002\"\u0006\bÿ\u0002\u0010\u0080\u0003R.\u0010\u0084\u0003\u001a\u0004\u0018\u0001032\t\u0010«\u0001\u001a\u0004\u0018\u0001038V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0003\u0010þ\u0002\"\u0006\b\u0083\u0003\u0010\u0080\u0003RA\u0010\u0088\u0003\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0003\u0018\u00010Ì\u00012\u0013\u0010«\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0003\u0018\u00010Ì\u00018V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0086\u0003\u0010m\"\u0006\b\u0087\u0003\u0010Ð\u0001R0\u0010\u008d\u0003\u001a\u0005\u0018\u00010\u0085\u00032\n\u0010«\u0001\u001a\u0005\u0018\u00010\u0085\u00038V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0003\u0010\u008a\u0003\"\u0006\b\u008b\u0003\u0010\u008c\u0003R.\u0010\u0090\u0003\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008e\u0003\u0010\u0091\u0001\"\u0006\b\u008f\u0003\u0010³\u0001R.\u0010\u0095\u0003\u001a\u0004\u0018\u00010\u00122\t\u0010«\u0001\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0091\u0003\u0010\u0092\u0003\"\u0006\b\u0093\u0003\u0010\u0094\u0003R0\u0010\u009a\u0003\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010\u0087\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0096\u0003\u0010\u0097\u0003\"\u0006\b\u0098\u0003\u0010\u0099\u0003R0\u0010 \u0003\u001a\u0005\u0018\u00010\u009b\u00032\n\u0010«\u0001\u001a\u0005\u0018\u00010\u009b\u00038V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0003\u0010\u009d\u0003\"\u0006\b\u009e\u0003\u0010\u009f\u0003¨\u0006¡\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/repository/OnePrepaidRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/repository/OnePrepaidRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;", "oneChangeOwnerApi", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "udidService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;Lth/co/dtac/android/dtacone/util/FileUtil;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;Lth/co/dtac/android/dtacone/manager/service/UdidService;)V", "", "isCutSim", "()Z", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/request/MrtrPrepaidValidateBarcodeRequest;", "request", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse;", "validateBarcode", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/request/MrtrPrepaidValidateBarcodeRequest;)Lio/reactivex/Single;", "", OptionalModuleUtils.BARCODE, "ocrMobileNumber", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "validateBarcodeTrue", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/request/CheckSimStockRequest;", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "checkSimStock", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/request/CheckSimStockRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/request/MrtrPrepaidValidateIdCardRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "validateIdCardNumber", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/request/MrtrPrepaidValidateIdCardRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileRequest;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "validateProfile", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoRequest;", "", "kotlin.jvm.PlatformType", "getPostCodeInfo", "(Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "getConsentXSIM", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/upload_image/request/UploadImageRequest;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "uploadImage", "(Lth/co/dtac/android/dtacone/model/upload_image/request/UploadImageRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;", "register", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;", RemoteConfigComponent.ACTIVATE_FILE_NAME, "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/family_sim/SaveFamilySimResponse;", "saveFamilySim", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/assign_pooling/request/MrtrPrepaidAssignPoolingRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;", "assignPooling", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/assign_pooling/request/MrtrPrepaidAssignPoolingRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/SimTermSukCutSimStockRequest;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "cutSimStock", "(Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/SimTermSukCutSimStockRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/save_result/request/SaveSimStockResultRequest;", "Ljava/lang/Void;", "saveSimStockResult", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/save_result/request/SaveSimStockResultRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionActivationRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionActivationResponse;", "getPermission", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionActivationRequest;)Lio/reactivex/Single;", "", "mrtrConsentId", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OnePrepaidStatusResponse;", "oneConsentAccept", "(Ljava/lang/Integer;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/GetReceiptBase64Response;", "printReceipt", "()Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Data;", "submitOrder", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse;", "queryTransaction", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/Data;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/insert_doc/OneInsertDocumentRequest;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "insertDocument", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/insert_doc/OneInsertDocumentRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_worker/OneChangeOwnerSubmitWorkerResponse;", "onePrepaidSubmitWorker", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidCreateConsentResponse;", "onePrepaidCreateConsentPDPA", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitOrderResponse;", "onePrepaidSubmitOrder", "isProForce", "", "getUploadImageList", "()Ljava/util/List;", "getUploadImageListForTrue", "isGotoPayment", "clearOptionalImage", "()V", "clearSignatureFile", "clearInternalFile", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", "data", "encryptPhoneNumberString", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "simCardNumber", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformation", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "getCardCollection", "(Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTQueryCampaignRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTQueryCampaignResponse;", "oneQueryCampaign", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTQueryCampaignRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeRequest;", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;", "checkPrivilege", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeRequest;)Lio/reactivex/Single;", "clearModel", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneBuyDolAcceptConsentRequest;", "acceptConsent", OperatorName.SET_LINE_JOINSTYLE, "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneBuyDolAcceptConsentRequest;)Lio/reactivex/Observable;", OperatorName.NON_STROKING_CMYK, "d", "()Ljava/lang/String;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/model/appOne/prepaid/IndividualIdentification;", "e", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/IndividualIdentification;", OperatorName.CLOSE_PATH, "i", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/util/FileUtil;", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/OnePrepaidModel;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/OnePrepaidModel;", "getModel", "()Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/OnePrepaidModel;", "setModel", "(Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/OnePrepaidModel;)V", "model", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;", "value", "getQueryTransactionResponse", "()Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;", "setQueryTransactionResponse", "(Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;)V", "queryTransactionResponse", "getOrderId", "setOrderId", "(Ljava/lang/String;)V", "orderId", "getTrackingId", "setTrackingId", "trackingId", "getReRegisterFlag", "setReRegisterFlag", "(Z)V", "reRegisterFlag", "getValidateSimTrueResponse", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "setValidateSimTrueResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;)V", "validateSimTrueResponse", "getValidateProfileResponse", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "setValidateProfileResponse", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;)V", "validateProfileResponse", "Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "getUserNow", "()Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "userNow", "getUserCode", "userCode", "", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionsItem;", "getPermissions", "setPermissions", "(Ljava/util/List;)V", "permissions", "getActivationResponse", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;", "setActivationResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;)V", "activationResponse", "getNontelcoConsentType", "setNontelcoConsentType", "nontelcoConsentType", "getCutSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "setCutSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;)V", "cutSimStockResponse", "getRegisterRequest", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;", "setRegisterRequest", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;)V", "registerRequest", "getRegisterResponse", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;", "setRegisterResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;)V", "registerResponse", "getPrepaidAssignPoolingResponse", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;", "setPrepaidAssignPoolingResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;)V", "prepaidAssignPoolingResponse", "getAttachmentNames", "setAttachmentNames", "attachmentNames", "getFamilySimPostpaidNumber", "setFamilySimPostpaidNumber", "familySimPostpaidNumber", "getPostcodeSequenceString", "setPostcodeSequenceString", "postcodeSequenceString", "getPostCode", "setPostCode", "postCode", "getImageSignatureConsentXSim", "setImageSignatureConsentXSim", "imageSignatureConsentXSim", "getUserName", "userName", "getUserFormatType", "userFormatType", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "getValidateBarcodeData", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "setValidateBarcodeData", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;)V", "validateBarcodeData", "getSuccessType", "()I", "setSuccessType", "(I)V", "successType", "getConsentVersionLabel", "setConsentVersionLabel", "consentVersionLabel", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "getConsentNonTelcoResponse", "()Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "setConsentNonTelcoResponse", "(Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;)V", "consentNonTelcoResponse", "getIdCard", "setIdCard", "idCard", "getRegisterType", "setRegisterType", "registerType", "isFromSmartCard", "setFromSmartCard", "getOptionalImages", "setOptionalImages", "optionalImages", "getFeatureCode", "setFeatureCode", "featureCode", "getDisplaySubscriberNumber", "setDisplaySubscriberNumber", "displaySubscriberNumber", "getCardType", "setCardType", "cardType", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "getGetAuthorization", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "setGetAuthorization", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;)V", "getAuthorization", "isCheckSimStock", "getLastOptionalImageName", "()Ljava/lang/Integer;", "setLastOptionalImageName", "(Ljava/lang/Integer;)V", "lastOptionalImageName", "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "getFaceRecognitionByPass", "()Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "setFaceRecognitionByPass", "(Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;)V", "faceRecognitionByPass", "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;", "getFaceNotFoundCountBeforeManualAccept", "()Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;", "setFaceNotFoundCountBeforeManualAccept", "(Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;)V", "faceNotFoundCountBeforeManualAccept", "getCardInformation", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getCard", "()Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "setCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;)V", "card", "getPrepaidValidateIdCardResponse", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "setPrepaidValidateIdCardResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;)V", "prepaidValidateIdCardResponse", "getImageName", "setImageName", "imageName", "getCheckSimStockResponse", "()Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "setCheckSimStockResponse", "(Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;)V", "checkSimStockResponse", "getKycAttempted", "setKycAttempted", "kycAttempted", "isKYC", "setKYC", "getAttempted", "setAttempted", "attempted", "getKycAttemp", "setKycAttemp", "kycAttemp", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "getUserSession", "()Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "userSession", "getTotalAmount", "setTotalAmount", "totalAmount", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "getCheckSimStockError", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "setCheckSimStockError", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "checkSimStockError", "getActivationError", "setActivationError", "activationError", "getAssignPoolingError", "setAssignPoolingError", "assignPoolingError", "getCutSimStockError", "setCutSimStockError", "cutSimStockError", "getXSIMConsentRequest", "()Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;", "setXSIMConsentRequest", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;)V", "xSIMConsentRequest", "getXSIMConsentResponse", "()Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "setXSIMConsentResponse", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;)V", "xSIMConsentResponse", "getXSIMConsentResponsePreview", "setXSIMConsentResponsePreview", "xSIMConsentResponsePreview", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "getCampaignList", "setCampaignList", "campaignList", "getSelectedCampaign", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "setSelectedCampaign", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;)V", "selectedCampaign", "getItemId", "setItemId", "itemId", "getCampaignFlag", "()Ljava/lang/Boolean;", "setCampaignFlag", "(Ljava/lang/Boolean;)V", "campaignFlag", "getCheckPrivilegeResponse", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;", "setCheckPrivilegeResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;)V", "checkPrivilegeResponse", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;", "getScabData", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;", "setScabData", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;)V", "scabData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnePrepaidRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePrepaidRepository.kt\nth/co/dtac/android/dtacone/view/appOne/prepaid_registration/repository/OnePrepaidRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1080:1\n766#2:1081\n857#2,2:1082\n766#2:1085\n857#2,2:1086\n1855#2,2:1088\n1855#2,2:1090\n1855#2,2:1092\n1855#2,2:1094\n1#3:1084\n*S KotlinDebug\n*F\n+ 1 OnePrepaidRepository.kt\nth/co/dtac/android/dtacone/view/appOne/prepaid_registration/repository/OnePrepaidRepositoryImpl\n*L\n921#1:1081\n921#1:1082,2\n939#1:1085\n939#1:1086,2\n950#1:1088,2\n966#1:1090,2\n980#1:1092,2\n1006#1:1094,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepositoryImpl */
/* loaded from: classes10.dex */
public final class OnePrepaidRepositoryImpl implements OnePrepaidRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f95937a;

    /* renamed from: b */
    public final OneChangeOwnerApi f95938b;

    /* renamed from: c */
    public FileUtil f95939c;

    /* renamed from: d */
    public final ConfigurationRepository f95940d;

    /* renamed from: e */
    public final RtrRx2Repository f95941e;

    /* renamed from: f */
    public final PreferencesViewModel f95942f;

    /* renamed from: g */
    public final UdidService f95943g;

    /* renamed from: h */
    public OnePrepaidModel f95944h;

    @Inject
    public OnePrepaidRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull OneChangeOwnerApi oneChangeOwnerApi, @NotNull FileUtil fileUtil, @NotNull ConfigurationRepository configurationRepository, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesViewModel pfViewModel, @NotNull UdidService udidService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(oneChangeOwnerApi, "oneChangeOwnerApi");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        this.f95937a = api;
        this.f95938b = oneChangeOwnerApi;
        this.f95939c = fileUtil;
        this.f95940d = configurationRepository;
        this.f95941e = rtrRx2Repository;
        this.f95942f = pfViewModel;
        this.f95943g = udidService;
        this.f95944h = new OnePrepaidModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0, 0, 0, false, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, Integer.MAX_VALUE, null);
    }

    /* renamed from: g */
    public static final Unit m10605g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final OnePrepaidStatusResponse m10600l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OnePrepaidStatusResponse) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final OnePrepaidSubmitOrderResponse m10599m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OnePrepaidSubmitOrderResponse) tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OneActivateResponse> activate(@NotNull MrtrPrepaidRegisterRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.onePrepaidActivate(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidAssignPoolingResponse> assignPooling(@NotNull MrtrPrepaidAssignPoolingRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.onePrepaidAssignPooling(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidRegisterTCheckPrivilegeResponse> checkPrivilege(@NotNull OnePrepaidRegisterTCheckPrivilegeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.onePrepaidRegisterCheckPrivilege(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<SimTermSukCheckSimStockResponse> checkSimStock(@NotNull CheckSimStockRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.simTermSukCheckSimStock(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void clearInternalFile() {
        boolean z;
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(BitmapUtil.IMAGE_ID_CARD);
        arrayList.add(BitmapUtil.IMAGE_ID_CARD_WITH_WATERMARK);
        arrayList.add(BitmapUtil.IMAGE_PREPAID_MERGED);
        arrayList.add(BitmapUtil.IMAGE_FACE);
        arrayList.add(BitmapUtil.IMAGE_BARCODE);
        arrayList.add(BitmapUtil.IMAGE_SIGNATURE_PURE);
        arrayList.add(BitmapUtil.IMAGE_SIGNATURE);
        OnePrepaidAuthorizationResponse.Data getAuthorization = getGetAuthorization();
        boolean z2 = false;
        if (getAuthorization != null) {
            z = Intrinsics.areEqual(getAuthorization.getRequireFaceRecognition(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(BitmapUtil.IMAGE_COMPARE);
            arrayList.add(BitmapUtil.IMAGE_COMPARE_WATERMARK);
        }
        List<String> optionalImages = getModel().getOptionalImages();
        if (optionalImages != null && (!optionalImages.isEmpty())) {
            z2 = true;
        }
        if (z2) {
            List<String> optionalImages2 = getModel().getOptionalImages();
            if (optionalImages2 == null) {
                optionalImages2 = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList.addAll(optionalImages2);
        }
        for (String str : arrayList) {
            if (this.f95939c.isFileExist(str)) {
                this.f95939c.deleteInternalFile(str);
            }
        }
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void clearModel() {
        setModel(new OnePrepaidModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0, 0, 0, false, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, Integer.MAX_VALUE, null));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void clearOptionalImage() {
        ArrayList<String> arrayList = new ArrayList();
        List<String> optionalImages = getModel().getOptionalImages();
        if (optionalImages != null && (!optionalImages.isEmpty())) {
            List<String> optionalImages2 = getModel().getOptionalImages();
            if (optionalImages2 == null) {
                optionalImages2 = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList.addAll(optionalImages2);
        }
        for (String str : arrayList) {
            if (this.f95939c.isFileExist(str)) {
                this.f95939c.deleteInternalFile(str);
            }
        }
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void clearSignatureFile() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(BitmapUtil.IMAGE_SIGNATURE_PURE);
        arrayList.add(BitmapUtil.IMAGE_SIGNATURE);
        for (String str : arrayList) {
            if (this.f95939c.isFileExist(str)) {
                this.f95939c.deleteInternalFile(str);
            }
        }
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<CutSimStockResponse> cutSimStock(@NotNull SimTermSukCutSimStockRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.simTermSukCutSimStock(request);
    }

    /* renamed from: d */
    public final String m10608d() {
        UpPassFormResult upPassFormResult = getModel().getUpPassFormResult();
        if (upPassFormResult != null && upPassFormResult.isCardReader()) {
            return "DipChip";
        }
        return OneMnpActivity.OCR_TAG;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String decryptCBC(@NotNull String cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (cipher.length() == 0) {
            return "";
        }
        return AESCryptUtil.decryptCBC(cipher, this.f95940d.dataPrivacyEncryptionAES256CBCKey());
    }

    /* renamed from: e */
    public final IndividualIdentification m10607e() {
        String str;
        String str2;
        String str3;
        String str4;
        String m10606f;
        IdDocumentResult idDocument;
        String birthday;
        String encryptCBC;
        String str5;
        String str6;
        String str7;
        String birthday2;
        String convertDateTH;
        IdDocumentResult idDocument2;
        String str8;
        IdDocumentResult idDocument3;
        String lastName;
        IdDocumentResult idDocument4;
        String firstName;
        UpPassFormResult upPassFormResult = getModel().getUpPassFormResult();
        if (upPassFormResult == null || (idDocument4 = upPassFormResult.getIdDocument()) == null || (firstName = idDocument4.getFirstName()) == null) {
            str = "";
        } else {
            str = firstName;
        }
        UpPassFormResult upPassFormResult2 = getModel().getUpPassFormResult();
        if (upPassFormResult2 == null || (idDocument3 = upPassFormResult2.getIdDocument()) == null || (lastName = idDocument3.getLastName()) == null) {
            str2 = "";
        } else {
            str2 = lastName;
        }
        String str9 = null;
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation = getCardInformation();
            if (cardInformation != null) {
                str8 = cardInformation.getGender();
            } else {
                str8 = null;
            }
            str3 = StringExtKt.toCheckEmptyAndDisplayDash(str8);
        } else {
            str3 = null;
        }
        UpPassFormResult upPassFormResult3 = getModel().getUpPassFormResult();
        if (upPassFormResult3 != null && (idDocument2 = upPassFormResult3.getIdDocument()) != null) {
            str4 = idDocument2.getPrefix();
        } else {
            str4 = null;
        }
        String checkEmptyToDisplayKhun = StringExtKt.toCheckEmptyToDisplayKhun(str4);
        if (isFromSmartCard()) {
            m10606f = "I";
        } else {
            m10606f = m10606f();
        }
        String str10 = m10606f;
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation2 = getCardInformation();
            if (cardInformation2 != null && (birthday2 = cardInformation2.getBirthday()) != null && (convertDateTH = StringExtKt.convertDateTH(birthday2, "yyyyMMdd", true, "yyyy-MM-dd", false)) != null) {
                encryptCBC = encryptCBC(convertDateTH + "T00:00:00Z");
                str5 = encryptCBC;
            }
            str5 = null;
        } else {
            UpPassFormResult upPassFormResult4 = getModel().getUpPassFormResult();
            if (upPassFormResult4 != null && (idDocument = upPassFormResult4.getIdDocument()) != null && (birthday = idDocument.getBirthday()) != null) {
                encryptCBC = encryptCBC(birthday + "T00:00:00Z");
                str5 = encryptCBC;
            }
            str5 = null;
        }
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation3 = getCardInformation();
            if (cardInformation3 != null) {
                str7 = cardInformation3.getExpire();
            } else {
                str7 = null;
            }
            if (str7 == null) {
                str7 = "2999-01-01";
            }
            str6 = StringExtKt.formatServerDateWithDefaultTime(str7);
        } else {
            str6 = null;
        }
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation4 = getCardInformation();
            if (cardInformation4 != null) {
                str9 = cardInformation4.getIdCard();
            }
            if (str9 == null) {
                str9 = StringExtKt.toCheckEmptyAndDisplayDash("");
            }
        } else {
            CardCollection card = getCard();
            if (card != null) {
                str9 = card.getIdentityNumber();
            }
            if (str9 == null) {
                str9 = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
        }
        return new IndividualIdentification(str, str2, HelpFormatter.DEFAULT_OPT_PREFIX, str3, str10, StandardStructureTypes.f60307TH, checkEmptyToDisplayKhun, str5, null, str6, encryptCBC(str9));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String encryptCBC(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return "";
        }
        return AESCryptUtil.encryptCBC(text, this.f95940d.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String encryptPhoneNumberString(@Nullable String str) {
        if (str != null && str.length() != 0) {
            String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(str);
            Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(data)");
            return AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f95940d.dataPrivacyEncryptionAES256CBCKey());
        }
        return "";
    }

    /* renamed from: f */
    public final String m10606f() {
        String cardType = getCardType();
        if (Intrinsics.areEqual(cardType, "THAI_ID_CARD")) {
            return "I";
        }
        if (Intrinsics.areEqual(cardType, "PASSPORT")) {
            return "P";
        }
        return "H";
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public ErrorCollection getActivationError() {
        return getModel().getActivationError();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OneActivateResponse getActivationResponse() {
        return getModel().getActivationResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public ErrorCollection getAssignPoolingError() {
        return getModel().getAssignPoolingError();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public List<String> getAttachmentNames() {
        return getModel().getAttachmentNames();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public int getAttempted() {
        return getModel().getAttempted();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public Boolean getCampaignFlag() {
        return getModel().getCampaignFlag();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public List<CampaignItem> getCampaignList() {
        return getModel().getCampaignList();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public CardCollection getCard() {
        return getModel().getCard();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
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

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public IdCardInformationCollection getCardInformation() {
        return getModel().getCardInformation();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getCardType() {
        return getModel().getCardType();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OnePrepaidRegisterTCheckPrivilegeResponse getCheckPrivilegeResponse() {
        return getModel().getCheckPrivilege();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public ErrorCollection getCheckSimStockError() {
        return getModel().getCheckSimStockError();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public SimTermSukCheckSimStockResponse getCheckSimStockResponse() {
        return getModel().getCheckSimStockResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public ConsentNonTelcoResponse getConsentNonTelcoResponse() {
        return getModel().getConsentNonTelcoResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getConsentVersionLabel() {
        return getModel().getConsentVersionLabel();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<XSIMConsentResponse> getConsentXSIM(@NotNull XSIMConsentRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.getConsentXSIM(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public ErrorCollection getCutSimStockError() {
        return getModel().getCutSimStockError();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public CutSimStockResponse getCutSimStockResponse() {
        return getModel().getCutSimStockResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getDisplaySubscriberNumber() {
        return getModel().getDisplaySubscriberNumber();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public FaceNotFoundCountBeforeManualAccept getFaceNotFoundCountBeforeManualAccept() {
        return getModel().getFaceNotFoundCountBeforeManualAccept();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public FaceRecognitionByPass getFaceRecognitionByPass() {
        return getModel().getFaceRecognitionByPass();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getFamilySimPostpaidNumber() {
        return getModel().getFamilySimPostpaidNumber();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getFeatureCode() {
        return getModel().getFeatureCode();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OnePrepaidAuthorizationResponse.Data getGetAuthorization() {
        return getModel().getGetAuthorization();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getIdCard() {
        return getModel().getIdCard();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getImageName() {
        return getModel().getImageName();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String getImageSignatureConsentXSim() {
        return getModel().getImageSignatureConsentXSim();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getItemId() {
        return getModel().getItemId();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public int getKycAttemp() {
        return getModel().getKycAttemp();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public int getKycAttempted() {
        return getModel().getKycAttempted();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public Integer getLastOptionalImageName() {
        return getModel().getLastOptionalImageName();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public OnePrepaidModel getModel() {
        return this.f95944h;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getNontelcoConsentType() {
        return getModel().getNontelcoConsentType();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public List<String> getOptionalImages() {
        return getModel().getOptionalImages();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getOrderId() {
        return getModel().getOrderId();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePermissionActivationResponse> getPermission(@NotNull OnePermissionActivationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.onePrepaidPermission(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public List<OnePermissionsItem> getPermissions() {
        return getModel().getPermissions();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getPostCode() {
        return getModel().getPostcode();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<Unit> getPostCodeInfo(@NotNull GetPostCodeInfoRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<GetPostCodeInfoResponse> postCodeInfo = this.f95937a.getPostCodeInfo(request);
        final OnePrepaidRepositoryImpl$getPostCodeInfo$1 onePrepaidRepositoryImpl$getPostCodeInfo$1 = new OnePrepaidRepositoryImpl$getPostCodeInfo$1(this);
        Single map = postCodeInfo.map(new Function() { // from class: t91
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Unit m10605g;
                m10605g = OnePrepaidRepositoryImpl.m10605g(onePrepaidRepositoryImpl$getPostCodeInfo$1, obj);
                return m10605g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun getPostCode…}\n            }\n        }");
        return map;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getPostcodeSequenceString() {
        return getModel().getPostcodeSequenceString();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OnePrepaidAssignPoolingResponse getPrepaidAssignPoolingResponse() {
        return getModel().getPrepaidAssignPoolingResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OnePrepaidValidateIdCardResponse getPrepaidValidateIdCardResponse() {
        return getModel().getPrepaidValidateIdCardResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public QueryTransactionResponse.Data getQueryTransactionResponse() {
        return getModel().getQueryTransactionResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public boolean getReRegisterFlag() {
        return getModel().getReRegisterFlag();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public MrtrPrepaidRegisterRequest getRegisterRequest() {
        return getModel().getRegisterRequest();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OnePrepaidRegisterResponse getRegisterResponse() {
        return getModel().getRegisterResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String getRegisterType() {
        return getModel().getRegisterType();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OnePrepaidRegisterTGetScabResponse getScabData() {
        return getModel().getScabData();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public CampaignItem getSelectedCampaign() {
        return getModel().getSelectedCampaign();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public int getSuccessType() {
        return getModel().getSuccessType();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public int getTotalAmount() {
        return getModel().getTotalAmount();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public String getTrackingId() {
        return getModel().getTrackingId();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public List<String> getUploadImageList() {
        ArrayList arrayList = new ArrayList();
        List<String> optionalImages = getOptionalImages();
        if (optionalImages != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : optionalImages) {
                if (this.f95939c.isFileExist((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        if (isFromSmartCard()) {
            arrayList.add(BitmapUtil.IMAGE_BARCODE);
        }
        return arrayList;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public List<String> getUploadImageListForTrue() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(BitmapUtil.IMAGE_PREPAID_MERGED);
        OnePrepaidAuthorizationResponse.Data getAuthorization = getGetAuthorization();
        if (getAuthorization != null) {
            z = Intrinsics.areEqual(getAuthorization.getRequireFaceRecognition(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(BitmapUtil.IMAGE_COMPARE);
        }
        List<String> optionalImages = getOptionalImages();
        if (optionalImages != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : optionalImages) {
                if (this.f95939c.isFileExist((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String getUserCode() {
        String userCode = this.f95941e.getUserSession().getUserCode();
        Intrinsics.checkNotNullExpressionValue(userCode, "rtrRx2Repository.userSession.userCode");
        return userCode;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String getUserFormatType() {
        String userName = this.f95941e.getSessionNow().getRetailerNumber();
        if (userName.length() >= 10) {
            Intrinsics.checkNotNullExpressionValue(userName, "userName");
            if (new Regex("[0-9]+").matches(userName)) {
                return UserNameType.TELEPHONE_NUMBER.INSTANCE.getUserFormatType();
            }
        }
        return UserNameType.USER_LAN.INSTANCE.getUserFormatType();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public String getUserName() {
        String retailerNumber = this.f95941e.getSessionNow().getRetailerNumber();
        Intrinsics.checkNotNullExpressionValue(retailerNumber, "rtrRx2Repository.sessionNow.retailerNumber");
        if (new Regex(".*[a-zA-Z]+.*").matches(retailerNumber)) {
            String retailerNumber2 = this.f95941e.getSessionNow().getRetailerNumber();
            Intrinsics.checkNotNullExpressionValue(retailerNumber2, "{\n                rtrRx2…ailerNumber\n            }");
            return retailerNumber2;
        }
        return PhoneNumberExtKt.toInternational(this.f95941e.getSessionNow().getRetailerNumber());
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public SessionEntity getUserNow() {
        return this.f95941e.getSessionNow();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public TokenCollection getUserSession() {
        return this.f95941e.getUserSession();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData getValidateBarcodeData() {
        return getModel().getValidateBarcodeData();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OneChangeOwnerValidateProfileResponse getValidateProfileResponse() {
        return getModel().getValidateProfileResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public OneValidateSimTrueResponse getValidateSimTrueResponse() {
        return getModel().getValidateSimTrueResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public XSIMConsentRequest getXSIMConsentRequest() {
        return getModel().getXSIMConsentRequest();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public XSIMConsentResponse getXSIMConsentResponse() {
        return getModel().getXSIMConsentResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @Nullable
    public XSIMConsentResponse getXSIMConsentResponsePreview() {
        return getModel().getXSIMConsentResponsePreview();
    }

    /* renamed from: h */
    public final String m10604h() {
        if (Intrinsics.areEqual(getRegisterType(), PrepaidRegisterType.REGISTER_ONLY)) {
            OnePrepaidAuthorizationResponse.Data getAuthorization = getGetAuthorization();
            if (Integer.parseInt((getAuthorization == null || (r0 = getAuthorization.getAutoAct()) == null) ? "0" : "0") > 0) {
                return ForceType.AUTOACT;
            }
            return ForceType.UNFORCE;
        }
        return ForceType.FORCE;
    }

    /* renamed from: i */
    public final String m10603i() {
        String str;
        String str2;
        OneValidateSimTrueResponse.Data data;
        SimInfo simInfo;
        OneValidateSimTrueResponse validateSimTrueResponse = getValidateSimTrueResponse();
        if (validateSimTrueResponse != null && (data = validateSimTrueResponse.getData()) != null && (simInfo = data.getSimInfo()) != null) {
            str = simInfo.getType();
        } else {
            str = null;
        }
        if (str == null) {
            return "66";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1787006733) {
            if (hashCode != 2137682) {
                if (hashCode != 2448090) {
                    return "66";
                }
                str2 = "PAIR";
            } else {
                str2 = "ESIM";
            }
            str.equals(str2);
            return "66";
        } else if (!str.equals("UNPAIR")) {
            return "66";
        } else {
            return "52";
        }
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OneCommonResponse> insertDocument(@NotNull OneInsertDocumentRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.onePrepaidInsertDocument(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public boolean isCheckSimStock() {
        OnePrepaidAuthorizationResponse.Data getAuthorization = getModel().getGetAuthorization();
        if (getAuthorization != null) {
            return Intrinsics.areEqual(getAuthorization.isCheckSim(), Boolean.TRUE);
        }
        return false;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public boolean isCutSim() {
        if (isCheckSimStock() && getCheckSimStockResponse() != null) {
            return true;
        }
        return false;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public boolean isFromSmartCard() {
        return getModel().isFromSmartCard();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public boolean isGotoPayment() {
        boolean z;
        List<DiscountItem> list;
        int i;
        List<DiscountItem> discount;
        int i2;
        Integer lineAmount;
        OnePrepaidAuthorizationResponse.Data getAuthorization = getGetAuthorization();
        if (getAuthorization != null) {
            z = Intrinsics.areEqual(getAuthorization.isCheckSim(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z || getCheckSimStockResponse() == null) {
            return false;
        }
        SimTermSukCheckSimStockResponse checkSimStockResponse = getCheckSimStockResponse();
        if (checkSimStockResponse != null) {
            list = checkSimStockResponse.getDiscount();
        } else {
            list = null;
        }
        if (list != null) {
            SimTermSukCheckSimStockResponse checkSimStockResponse2 = getCheckSimStockResponse();
            if (checkSimStockResponse2 != null && (lineAmount = checkSimStockResponse2.getLineAmount()) != null) {
                i = lineAmount.intValue();
            } else {
                i = 0;
            }
            SimTermSukCheckSimStockResponse checkSimStockResponse3 = getCheckSimStockResponse();
            if (checkSimStockResponse3 != null && (discount = checkSimStockResponse3.getDiscount()) != null) {
                for (DiscountItem discountItem : discount) {
                    Integer lineAmount2 = discountItem.getLineAmount();
                    if (lineAmount2 != null) {
                        i2 = lineAmount2.intValue();
                    } else {
                        i2 = 0;
                    }
                    i -= i2;
                }
            }
            if (i <= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public boolean isKYC() {
        return getModel().isKYC();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public boolean isProForce() {
        return Intrinsics.areEqual(m10604h(), ForceType.FORCE);
    }

    /* renamed from: j */
    public final Observable m10602j(OneBuyDolAcceptConsentRequest oneBuyDolAcceptConsentRequest) {
        return this.f95937a.acceptBuyDOLConsent(oneBuyDolAcceptConsentRequest);
    }

    /* renamed from: k */
    public final Observable m10601k(OneBuyDolAcceptConsentRequest oneBuyDolAcceptConsentRequest) {
        Observable<OnePrepaidConsentAcceptResponse> oneConsentAcceptT = this.f95937a.oneConsentAcceptT(oneBuyDolAcceptConsentRequest);
        final OnePrepaidRepositoryImpl$oneConsentAcceptT$1 onePrepaidRepositoryImpl$oneConsentAcceptT$1 = OnePrepaidRepositoryImpl$oneConsentAcceptT$1.INSTANCE;
        Observable<R> map = oneConsentAcceptT.map(new Function() { // from class: s91
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                OnePrepaidStatusResponse m10600l;
                m10600l = OnePrepaidRepositoryImpl.m10600l(onePrepaidRepositoryImpl$oneConsentAcceptT$1, obj);
                return m10600l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "api.oneConsentAcceptT(ac…dStatusResponse\n        }");
        return map;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Observable<OnePrepaidStatusResponse> oneConsentAccept(@Nullable Integer num) {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        Version version = new Version(MODEL, "android", BuildConfig.VERSION_NAME, RELEASE);
        OneBuyDolAcceptConsentRequest oneBuyDolAcceptConsentRequest = new OneBuyDolAcceptConsentRequest(this.f95941e.getSessionNow().getToken().getId(), num, version.getPlatform(), version.getOsVersion(), version.getDeviceModel(), version.getAppVersion(), this.f95943g.getAndroidID());
        if (this.f95942f.isCompanyTrue()) {
            return m10601k(oneBuyDolAcceptConsentRequest);
        }
        return m10602j(oneBuyDolAcceptConsentRequest);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidCreateConsentResponse> onePrepaidCreateConsentPDPA() {
        OneValidateSimTrueResponse.Data data;
        PrepaidProfile prepaidProfile;
        RTRApiRx2 rTRApiRx2 = this.f95937a;
        String uuid = UUID.randomUUID().toString();
        OneValidateSimTrueResponse validateSimTrueResponse = getValidateSimTrueResponse();
        String str = (validateSimTrueResponse == null || (data = validateSimTrueResponse.getData()) == null || (prepaidProfile = data.getPrepaidProfile()) == null || (str = prepaidProfile.getMsisdn()) == null) ? "" : "";
        String str2 = null;
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation = getCardInformation();
            if (cardInformation != null) {
                str2 = cardInformation.getIdCard();
            }
        } else {
            CardCollection card = getCard();
            if (card != null) {
                str2 = card.getIdentityNumber();
            }
        }
        return rTRApiRx2.onePrepaidCreateConsentPDPA(new OnePrepaidCreateConsentRequest(uuid, str, encryptCBC(StringExtKt.toCheckEmptyAndDisplayDash(str2)), CollectionsKt__CollectionsKt.arrayListOf(new ConsentItem("TUC"))));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidSubmitOrderResponse> onePrepaidSubmitOrder() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String m10603i;
        OnePrepaidSubmitOrderRequest onePrepaidSubmitOrderRequest;
        String str23;
        OneValidateSimTrueResponse.Data data;
        SimInfo simInfo;
        Scab scab;
        String str24;
        OneValidateSimTrueResponse.Data data2;
        SimInfo simInfo2;
        DataScabResponse data3;
        String str25;
        String str26;
        String moo;
        String str27;
        String str28;
        String str29;
        String str30;
        OneValidateSimTrueResponse.Data data4;
        SimInfo simInfo3;
        OneValidateSimTrueResponse.Data data5;
        PrepaidProfile prepaidProfile;
        OneValidateSimTrueResponse.Data data6;
        PrepaidProfile prepaidProfile2;
        OneValidateSimTrueResponse.Data data7;
        SimInfo simInfo4;
        String pricePlan;
        OneValidateSimTrueResponse.Data data8;
        SimInfo simInfo5;
        String soc;
        IdDocumentResult idDocument;
        String verificationDocType;
        IdDocumentResult idDocument2;
        String verificationSlugId;
        IdDocumentResult idDocument3;
        IdCardInformationCollection cardInformation;
        String issue;
        IdCardInformationCollection cardInformation2;
        String expire;
        FaceCompareResult faceCompare;
        UpPassFormResult upPassFormCompareResult = getModel().getUpPassFormCompareResult();
        String str31 = null;
        if (upPassFormCompareResult != null && (faceCompare = upPassFormCompareResult.getFaceCompare()) != null) {
            str = faceCompare.getCompareScore();
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        if (isFromSmartCard() && (cardInformation2 = getCardInformation()) != null && (expire = cardInformation2.getExpire()) != null) {
            str2 = StringExtKt.formatServerDate$default(expire, null, 1, null);
        } else {
            str2 = null;
        }
        OnePrepaidAuthorizationResponse.Data getAuthorization = getGetAuthorization();
        if (getAuthorization != null) {
            str3 = getAuthorization.getRedZone();
        } else {
            str3 = null;
        }
        if (isFromSmartCard() && (cardInformation = getCardInformation()) != null && (issue = cardInformation.getIssue()) != null) {
            str4 = StringExtKt.formatServerDate$default(issue, null, 1, null);
        } else {
            str4 = null;
        }
        boolean isKYC = isKYC();
        String str32 = HelpFormatter.DEFAULT_OPT_PREFIX;
        if (isKYC) {
            str5 = getUserNow().getToken().getRtrCode();
        } else {
            str5 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        if (!isFromSmartCard()) {
            str6 = "N";
        } else {
            str6 = "Y";
        }
        UpPassFormResult upPassFormResult = getModel().getUpPassFormResult();
        if (upPassFormResult != null && (idDocument3 = upPassFormResult.getIdDocument()) != null) {
            str7 = idDocument3.getDopaStatus();
        } else {
            str7 = null;
        }
        if (!Intrinsics.areEqual(str7, "pass")) {
            str8 = "N";
        } else {
            str8 = "Y";
        }
        String m10608d = m10608d();
        UpPassFormResult upPassFormResult2 = getModel().getUpPassFormResult();
        if (upPassFormResult2 == null || (idDocument2 = upPassFormResult2.getIdDocument()) == null || (verificationSlugId = idDocument2.getVerificationSlugId()) == null) {
            str9 = "";
        } else {
            str9 = verificationSlugId;
        }
        UpPassFormResult upPassFormResult3 = getModel().getUpPassFormResult();
        if (upPassFormResult3 == null || (idDocument = upPassFormResult3.getIdDocument()) == null || (verificationDocType = idDocument.getVerificationDocType()) == null) {
            str10 = "";
        } else {
            str10 = verificationDocType;
        }
        OrderCharacteristic orderCharacteristic = new OrderCharacteristic(valueOf, str2, "Y", str3, HelpFormatter.DEFAULT_OPT_PREFIX, str4, str5, str6, null, str10, m10608d, str8, str9, 256, null);
        if (Intrinsics.areEqual(m10604h(), ForceType.AUTOACT)) {
            Date date = new Date();
            OnePrepaidAuthorizationResponse.Data getAuthorization2 = getGetAuthorization();
            str11 = StringExtKt.formatServerDateWithDefaultTime(DateFormatExtKt.toDateString$default(DateFormatExtKt.addDayToDate(date, Integer.parseInt((getAuthorization2 == null || (r9 = getAuthorization2.getAutoAct()) == null) ? "0" : "0")), "yyyyMMdd", (Locale) null, 2, (Object) null), false, false);
        } else {
            str11 = null;
        }
        String m10604h = m10604h();
        OneValidateSimTrueResponse validateSimTrueResponse = getValidateSimTrueResponse();
        if (validateSimTrueResponse != null && (data8 = validateSimTrueResponse.getData()) != null && (simInfo5 = data8.getSimInfo()) != null && (soc = simInfo5.getSoc()) != null) {
            str12 = StringExtKt.toDefaultNull(soc);
        } else {
            str12 = null;
        }
        OneValidateSimTrueResponse validateSimTrueResponse2 = getValidateSimTrueResponse();
        if (validateSimTrueResponse2 != null && (data7 = validateSimTrueResponse2.getData()) != null && (simInfo4 = data7.getSimInfo()) != null && (pricePlan = simInfo4.getPricePlan()) != null) {
            str13 = StringExtKt.toDefaultNull(pricePlan);
        } else {
            str13 = null;
        }
        Offers offers = new Offers(str11, m10604h, str13, str12);
        OneValidateSimTrueResponse validateSimTrueResponse3 = getValidateSimTrueResponse();
        if (validateSimTrueResponse3 == null || (data6 = validateSimTrueResponse3.getData()) == null || (prepaidProfile2 = data6.getPrepaidProfile()) == null || (str14 = prepaidProfile2.getMsisdn()) == null) {
            str14 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        ProductCharacteristicItem productCharacteristicItem = new ProductCharacteristicItem(Constant.OnePostpaidVerifyKey.MSISDN, str14);
        OneValidateSimTrueResponse validateSimTrueResponse4 = getValidateSimTrueResponse();
        if (validateSimTrueResponse4 == null || (data5 = validateSimTrueResponse4.getData()) == null || (prepaidProfile = data5.getPrepaidProfile()) == null || (str15 = prepaidProfile.getSimCardNumber()) == null) {
            str15 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        C14224Ou c14224Ou = new C14224Ou(new Subscriber(offers, CollectionsKt__CollectionsKt.arrayListOf(productCharacteristicItem, new ProductCharacteristicItem("SIM", str15))));
        OneValidateSimTrueResponse validateSimTrueResponse5 = getValidateSimTrueResponse();
        if (validateSimTrueResponse5 == null || (data4 = validateSimTrueResponse5.getData()) == null || (simInfo3 = data4.getSimInfo()) == null || (str16 = simInfo3.getSimCompanyCode()) == null) {
            str16 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        Account account = new Account(str16);
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation3 = getCardInformation();
            if (cardInformation3 != null) {
                str30 = cardInformation3.getRoad();
            } else {
                str30 = null;
            }
            str17 = StringExtKt.toCheckEmptyAndDisplayDash(str30);
        } else {
            str17 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation4 = getCardInformation();
            if (cardInformation4 != null) {
                str29 = cardInformation4.getDistrict();
            } else {
                str29 = null;
            }
            str18 = StringExtKt.toCheckEmptyAndDisplayDash(str29);
        } else {
            str18 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation5 = getCardInformation();
            if (cardInformation5 != null) {
                str28 = cardInformation5.getHouseNo();
            } else {
                str28 = null;
            }
            str19 = StringExtKt.toCheckEmptyAndDisplayDash(str28);
        } else {
            str19 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        if (isFromSmartCard()) {
            str20 = StringExtKt.toCheckEmptyAndDisplayDash(getPostCode());
        } else {
            str20 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation6 = getCardInformation();
            if (cardInformation6 != null) {
                str27 = cardInformation6.getSoi();
            } else {
                str27 = null;
            }
            str21 = StringExtKt.toCheckEmptyAndDisplayDash(str27);
        } else {
            str21 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation7 = getCardInformation();
            if (cardInformation7 != null && (moo = cardInformation7.getMoo()) != null) {
                str26 = StringsKt__StringsKt.trim(moo).toString();
            } else {
                str26 = null;
            }
            str22 = StringExtKt.toCheckEmptyAndDisplayDash(str26);
        } else {
            str22 = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        if (isFromSmartCard()) {
            IdCardInformationCollection cardInformation8 = getCardInformation();
            if (cardInformation8 != null) {
                str25 = cardInformation8.getSubDistrict();
            } else {
                str25 = null;
            }
            str32 = StringExtKt.toCheckEmptyAndDisplayDash(str25);
        }
        Customer customer = new Customer(new ContactMedium(new Medium("THA", HelpFormatter.DEFAULT_OPT_PREFIX, str17, str18, HelpFormatter.DEFAULT_OPT_PREFIX, str19, HelpFormatter.DEFAULT_OPT_PREFIX, HelpFormatter.DEFAULT_OPT_PREFIX, str20, str21, str22, str32)), m10607e(), null, 4, null);
        if (getReRegisterFlag()) {
            m10603i = "12014";
        } else {
            m10603i = m10603i();
        }
        Boolean campaignFlag = getCampaignFlag();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(campaignFlag, bool) && getSelectedCampaign() != null) {
            OnePrepaidRegisterTGetScabResponse scabData = getScabData();
            if (scabData != null && (data3 = scabData.getData()) != null) {
                scab = new Scab(data3.getScabCode(), data3.getProvinceName(), data3.getDistrictName(), data3.getSubdistrictName());
            } else {
                scab = null;
            }
            OnePrepaidAuthorizationResponse.Data getAuthorization3 = getGetAuthorization();
            if (getAuthorization3 != null) {
                str24 = getAuthorization3.getDtrCode();
            } else {
                str24 = null;
            }
            OneValidateSimTrueResponse validateSimTrueResponse6 = getValidateSimTrueResponse();
            if (validateSimTrueResponse6 != null && (data2 = validateSimTrueResponse6.getData()) != null && (simInfo2 = data2.getSimInfo()) != null) {
                str31 = simInfo2.getType();
            }
            OrderItem orderItem = new OrderItem(orderCharacteristic, m10603i, str24, str31);
            CampaignItem selectedCampaign = getSelectedCampaign();
            String str33 = (selectedCampaign == null || (str33 = selectedCampaign.getPrivilegeCode()) == null) ? "" : "";
            CampaignItem selectedCampaign2 = getSelectedCampaign();
            String str34 = (selectedCampaign2 == null || (str34 = selectedCampaign2.getCampaignNameEn()) == null) ? "" : "";
            CampaignItem selectedCampaign3 = getSelectedCampaign();
            CampaignDetail campaignDetail = new CampaignDetail(str33, str34, (selectedCampaign3 == null || (r11 = selectedCampaign3.getMatCode()) == null) ? "" : "");
            String nontelcoConsentType = getNontelcoConsentType();
            if (nontelcoConsentType == null) {
                nontelcoConsentType = "";
            }
            onePrepaidSubmitOrderRequest = new OnePrepaidSubmitOrderRequest(orderItem, c14224Ou, account, customer, new Campaign(bool, scab, campaignDetail, nontelcoConsentType));
        } else {
            OnePrepaidAuthorizationResponse.Data getAuthorization4 = getGetAuthorization();
            if (getAuthorization4 != null) {
                str23 = getAuthorization4.getDtrCode();
            } else {
                str23 = null;
            }
            OneValidateSimTrueResponse validateSimTrueResponse7 = getValidateSimTrueResponse();
            if (validateSimTrueResponse7 != null && (data = validateSimTrueResponse7.getData()) != null && (simInfo = data.getSimInfo()) != null) {
                str31 = simInfo.getType();
            }
            onePrepaidSubmitOrderRequest = new OnePrepaidSubmitOrderRequest(new OrderItem(orderCharacteristic, m10603i, str23, str31), c14224Ou, account, customer, null, 16, null);
        }
        onePrepaidSubmitOrderRequest.toString();
        Single<OnePrepaidSubmitOrderResponse> onePrepaidSubmitOrder = this.f95937a.onePrepaidSubmitOrder(onePrepaidSubmitOrderRequest);
        final OnePrepaidRepositoryImpl$onePrepaidSubmitOrder$1 onePrepaidRepositoryImpl$onePrepaidSubmitOrder$1 = new OnePrepaidRepositoryImpl$onePrepaidSubmitOrder$1(this);
        Single map = onePrepaidSubmitOrder.map(new Function() { // from class: r91
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                OnePrepaidSubmitOrderResponse m10599m;
                m10599m = OnePrepaidRepositoryImpl.m10599m(onePrepaidRepositoryImpl$onePrepaidSubmitOrder$1, obj);
                return m10599m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onePrepaidS…       it\n        }\n    }");
        return map;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OneChangeOwnerSubmitWorkerResponse> onePrepaidSubmitWorker() {
        return this.f95937a.onePrepaidSubmitWorker(new OnePrepaidSubmitWorkerRequest("PREPAID_REGISTER", getOrderId(), getTrackingId()));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidRegisterTQueryCampaignResponse> oneQueryCampaign(@NotNull OnePrepaidRegisterTQueryCampaignRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.onePrepaidRegisterQueryCampaign(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<GetReceiptBase64Response> printReceipt() {
        String str;
        String str2;
        String orderNumber;
        String orderID;
        TokenCollection userSession = this.f95941e.getUserSession();
        RTRApiRx2 rTRApiRx2 = this.f95937a;
        String userLan = userSession.getUserLan();
        Intrinsics.checkNotNullExpressionValue(userLan, "profile.userLan");
        String locationCode = userSession.getLocationCode();
        Intrinsics.checkNotNullExpressionValue(locationCode, "profile.locationCode");
        CutSimStockResponse cutSimStockResponse = getCutSimStockResponse();
        if (cutSimStockResponse == null || (orderID = cutSimStockResponse.getOrderID()) == null) {
            str = "";
        } else {
            str = orderID;
        }
        CutSimStockResponse cutSimStockResponse2 = getCutSimStockResponse();
        if (cutSimStockResponse2 == null || (orderNumber = cutSimStockResponse2.getOrderNumber()) == null) {
            str2 = "";
        } else {
            str2 = orderNumber;
        }
        return rTRApiRx2.getReceiptBase64(new GetReceiptBase64Request(userLan, locationCode, str, str2, false, 16, null));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<QueryTransactionResponse> queryTransaction(@Nullable Data data) {
        String str;
        RTRApiRx2 rTRApiRx2 = this.f95937a;
        if (data != null) {
            str = data.getTrackingId();
        } else {
            str = null;
        }
        return rTRApiRx2.queryTransaction(new QueryTransactionRequest(null, "PREPAID_REGISTER", str, 1, null));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidRegisterResponse> register(@NotNull MrtrPrepaidRegisterRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.onePrepaidRegister(request);
    }

    @NotNull
    public final Single<SaveFamilySimResponse> saveFamilySim(@NotNull MrtrPrepaidRegisterRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.saveFamilySim(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<Void> saveSimStockResult(@NotNull SaveSimStockResultRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.saveSimResult(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setActivationError(@Nullable ErrorCollection errorCollection) {
        getModel().setActivationError(errorCollection);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setActivationResponse(@Nullable OneActivateResponse oneActivateResponse) {
        getModel().setActivationResponse(oneActivateResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setAssignPoolingError(@Nullable ErrorCollection errorCollection) {
        getModel().setAssignPoolingError(errorCollection);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setAttachmentNames(@Nullable List<String> list) {
        getModel().setAttachmentNames(list);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setAttempted(int i) {
        getModel().setAttempted(i);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCampaignFlag(@Nullable Boolean bool) {
        getModel().setCampaignFlag(bool);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCampaignList(@Nullable List<CampaignItem> list) {
        getModel().setCampaignList(list);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCard(@Nullable CardCollection cardCollection) {
        getModel().setCard(cardCollection);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        getModel().setCardInformation(idCardInformationCollection);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCardType(@Nullable String str) {
        getModel().setCardType(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCheckPrivilegeResponse(@Nullable OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse) {
        getModel().setCheckPrivilege(onePrepaidRegisterTCheckPrivilegeResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCheckSimStockError(@Nullable ErrorCollection errorCollection) {
        getModel().setCheckSimStockError(errorCollection);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCheckSimStockResponse(@Nullable SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        getModel().setCheckSimStockResponse(simTermSukCheckSimStockResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setConsentNonTelcoResponse(@Nullable ConsentNonTelcoResponse consentNonTelcoResponse) {
        getModel().setConsentNonTelcoResponse(consentNonTelcoResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setConsentVersionLabel(@Nullable String str) {
        getModel().setConsentVersionLabel(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCutSimStockError(@Nullable ErrorCollection errorCollection) {
        getModel().setCutSimStockError(errorCollection);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setCutSimStockResponse(@Nullable CutSimStockResponse cutSimStockResponse) {
        getModel().setCutSimStockResponse(cutSimStockResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setDisplaySubscriberNumber(@Nullable String str) {
        getModel().setDisplaySubscriberNumber(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setFaceNotFoundCountBeforeManualAccept(@Nullable FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept) {
        getModel().setFaceNotFoundCountBeforeManualAccept(faceNotFoundCountBeforeManualAccept);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setFaceRecognitionByPass(@Nullable FaceRecognitionByPass faceRecognitionByPass) {
        getModel().setFaceRecognitionByPass(faceRecognitionByPass);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setFamilySimPostpaidNumber(@Nullable String str) {
        getModel().setFamilySimPostpaidNumber(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setFeatureCode(@Nullable String str) {
        getModel().setFeatureCode(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setFromSmartCard(boolean z) {
        getModel().setFromSmartCard(z);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setGetAuthorization(@Nullable OnePrepaidAuthorizationResponse.Data data) {
        getModel().setGetAuthorization(data);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setIdCard(@Nullable String str) {
        getModel().setIdCard(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setImageName(@Nullable String str) {
        getModel().setImageName(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setImageSignatureConsentXSim(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getModel().setImageSignatureConsentXSim(value);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setItemId(@Nullable String str) {
        getModel().setItemId(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setKYC(boolean z) {
        getModel().setKYC(z);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setKycAttemp(int i) {
        getModel().setKycAttemp(i);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setKycAttempted(int i) {
        getModel().setKycAttempted(i);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setLastOptionalImageName(@Nullable Integer num) {
        getModel().setLastOptionalImageName(num);
    }

    public void setModel(@NotNull OnePrepaidModel onePrepaidModel) {
        Intrinsics.checkNotNullParameter(onePrepaidModel, "<set-?>");
        this.f95944h = onePrepaidModel;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setNontelcoConsentType(@Nullable String str) {
        getModel().setNontelcoConsentType(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setOptionalImages(@Nullable List<String> list) {
        getModel().setOptionalImages(list);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setOrderId(@Nullable String str) {
        getModel().setOrderId(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setPermissions(@Nullable List<OnePermissionsItem> list) {
        getModel().setPermissions(list);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setPostCode(@Nullable String str) {
        getModel().setPostcode(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setPostcodeSequenceString(@Nullable String str) {
        getModel().setPostcodeSequenceString(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setPrepaidAssignPoolingResponse(@Nullable OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse) {
        getModel().setPrepaidAssignPoolingResponse(onePrepaidAssignPoolingResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setPrepaidValidateIdCardResponse(@Nullable OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse) {
        getModel().setPrepaidValidateIdCardResponse(onePrepaidValidateIdCardResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setQueryTransactionResponse(@Nullable QueryTransactionResponse.Data data) {
        getModel().setQueryTransactionResponse(data);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setReRegisterFlag(boolean z) {
        getModel().setReRegisterFlag(z);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setRegisterRequest(@Nullable MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest) {
        getModel().setRegisterRequest(mrtrPrepaidRegisterRequest);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setRegisterResponse(@Nullable OnePrepaidRegisterResponse onePrepaidRegisterResponse) {
        getModel().setRegisterResponse(onePrepaidRegisterResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setRegisterType(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getModel().setRegisterType(value);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setScabData(@Nullable OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse) {
        getModel().setScabData(onePrepaidRegisterTGetScabResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setSelectedCampaign(@Nullable CampaignItem campaignItem) {
        getModel().setSelectedCampaign(campaignItem);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setSuccessType(int i) {
        getModel().setSuccessType(i);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setTotalAmount(int i) {
        getModel().setTotalAmount(i);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setTrackingId(@Nullable String str) {
        getModel().setTrackingId(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setValidateBarcodeData(@Nullable OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData) {
        getModel().setValidateBarcodeData(validateBarcodeData);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setValidateProfileResponse(@Nullable OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        getModel().setValidateProfileResponse(oneChangeOwnerValidateProfileResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setValidateSimTrueResponse(@Nullable OneValidateSimTrueResponse oneValidateSimTrueResponse) {
        getModel().setValidateSimTrueResponse(oneValidateSimTrueResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setXSIMConsentRequest(@NotNull XSIMConsentRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getModel().setXSIMConsentRequest(value);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setXSIMConsentResponse(@Nullable XSIMConsentResponse xSIMConsentResponse) {
        getModel().setXSIMConsentResponse(xSIMConsentResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    public void setXSIMConsentResponsePreview(@Nullable XSIMConsentResponse xSIMConsentResponse) {
        getModel().setXSIMConsentResponsePreview(xSIMConsentResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<UploadImageResponse> uploadImage(@NotNull UploadImageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.mrtrUploadImage(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidValidateSimBarcodeResponse> validateBarcode(@NotNull MrtrPrepaidValidateBarcodeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.oneValidateBarcode(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OneValidateSimTrueResponse> validateBarcodeTrue(@NotNull String barcode, @NotNull String ocrMobileNumber) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(ocrMobileNumber, "ocrMobileNumber");
        return this.f95937a.oneValidateSimT(new OneValidateSimTrueRequest(encryptCBC(barcode), "ICCID", "PREPAID_REGISTER", encryptCBC(ocrMobileNumber)));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OnePrepaidValidateIdCardResponse> validateIdCardNumber(@NotNull MrtrPrepaidValidateIdCardRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95937a.oneValidateIdCardNumber(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository
    @NotNull
    public Single<OneChangeOwnerValidateProfileResponse> validateProfile(@NotNull OneChangeOwnerValidateProfileRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f95938b.validateProfileTrue(request);
    }
}