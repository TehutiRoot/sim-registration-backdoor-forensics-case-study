package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneActivateResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePermissionsItem;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAssignPoolingResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTCheckPrivilegeResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTGetScabResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionResponse;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.FaceCompareResponseSubmit;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.config.FaceNotFoundCountBeforeManualAccept;
import th.p047co.dtac.android.dtacone.model.prepaid.config.FaceRecognitionByPass;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.SimTermSukCheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentRequest;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentResponse;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidRegisterType;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Ý\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bã\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0005\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\u000f\u0012\b\b\u0002\u0010!\u001a\u00020\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020\u001b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u000f\u0012\b\b\u0002\u0010*\u001a\u00020\u000f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u00020\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010M\u001a\u00020\u001b\u0012\u0012\b\u0002\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010N\u0018\u00010D\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010Z\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010Z\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010]\u0012\b\b\u0002\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bJ\u0018\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0018\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\be\u0010dJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bh\u0010gJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bi\u0010gJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bj\u0010gJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bk\u0010gJ\u0012\u0010l\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0012\u0010p\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0012\u0010v\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0012\u0010x\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bx\u0010yJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0010\u0010|\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b|\u0010}J\u0012\u0010~\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0013\u0010\u0080\u0001\u001a\u00020\u000fHÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0013\u0010\u0082\u0001\u001a\u00020\u000fHÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u0013\u0010\u0083\u0001\u001a\u00020\u000fHÆ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001J\u0012\u0010\u0084\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010}J\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010gJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010gJ\u0012\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010gJ\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010gJ\u0013\u0010\u008b\u0001\u001a\u00020\u000fHÆ\u0003¢\u0006\u0006\b\u008b\u0001\u0010\u0081\u0001J\u0013\u0010\u008c\u0001\u001a\u00020\u000fHÆ\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u0081\u0001J\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008f\u0001\u0010gJ\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010gJ\u0013\u0010\u0091\u0001\u001a\u00020/HÆ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0006\b\u0095\u0001\u0010\u0094\u0001J\u0012\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0096\u0001\u0010gJ\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0014\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0099\u0001\u0010gJ\u0015\u0010\u009a\u0001\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0015\u0010 \u0001\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0006\b \u0001\u0010\u008e\u0001J\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0006\b¡\u0001\u0010\u008e\u0001J\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0006\b¢\u0001\u0010\u008e\u0001J\u0014\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b£\u0001\u0010gJ\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010BHÆ\u0003¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001a\u0010¦\u0001\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010DHÆ\u0003¢\u0006\u0005\b¦\u0001\u0010dJ\u0015\u0010§\u0001\u001a\u0004\u0018\u00010GHÆ\u0003¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0015\u0010©\u0001\u001a\u0004\u0018\u00010IHÆ\u0003¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0014\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b«\u0001\u0010gJ\u0014\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b¬\u0001\u0010gJ\u0012\u0010\u00ad\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u00ad\u0001\u0010}J\u001c\u0010®\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010N\u0018\u00010DHÆ\u0003¢\u0006\u0005\b®\u0001\u0010dJ\u0015\u0010¯\u0001\u001a\u0004\u0018\u00010NHÆ\u0003¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0014\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b±\u0001\u0010gJ\u0015\u0010²\u0001\u001a\u0004\u0018\u00010RHÆ\u0003¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0014\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b´\u0001\u0010gJ\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0015\u0010·\u0001\u001a\u0004\u0018\u00010VHÆ\u0003¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0015\u0010¹\u0001\u001a\u0004\u0018\u00010XHÆ\u0003¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0015\u0010»\u0001\u001a\u0004\u0018\u00010ZHÆ\u0003¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0015\u0010½\u0001\u001a\u0004\u0018\u00010ZHÆ\u0003¢\u0006\u0006\b½\u0001\u0010¼\u0001J\u0015\u0010¾\u0001\u001a\u0004\u0018\u00010]HÆ\u0003¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u0013\u0010À\u0001\u001a\u00020_HÆ\u0003¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0089\u0006\u0010Â\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\u001b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00103\u001a\u0004\u0018\u0001012\b\b\u0002\u00104\u001a\u00020\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010M\u001a\u00020\u001b2\u0012\b\u0002\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010N\u0018\u00010D2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010]2\b\b\u0002\u0010`\u001a\u00020_HÆ\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0012\u0010Ä\u0001\u001a\u00020\u0003HÖ\u0001¢\u0006\u0005\bÄ\u0001\u0010gJ\u0013\u0010Å\u0001\u001a\u00020\u000fHÖ\u0001¢\u0006\u0006\bÅ\u0001\u0010\u0081\u0001J\u001e\u0010Ç\u0001\u001a\u00020\u001b2\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\bÇ\u0001\u0010È\u0001R/\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010d\"\u0006\bÌ\u0001\u0010Í\u0001R/\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÎ\u0001\u0010Ê\u0001\u001a\u0005\bÏ\u0001\u0010d\"\u0006\bÐ\u0001\u0010Í\u0001R)\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0005\bÓ\u0001\u0010g\"\u0006\bÔ\u0001\u0010Õ\u0001R)\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÖ\u0001\u0010Ò\u0001\u001a\u0005\b×\u0001\u0010g\"\u0006\bØ\u0001\u0010Õ\u0001R)\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÙ\u0001\u0010Ò\u0001\u001a\u0005\bÚ\u0001\u0010g\"\u0006\bÛ\u0001\u0010Õ\u0001R)\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÜ\u0001\u0010Ò\u0001\u001a\u0005\bÝ\u0001\u0010g\"\u0006\bÞ\u0001\u0010Õ\u0001R)\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bß\u0001\u0010Ò\u0001\u001a\u0005\bà\u0001\u0010g\"\u0006\bá\u0001\u0010Õ\u0001R)\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0005\bä\u0001\u0010m\"\u0006\bå\u0001\u0010æ\u0001R)\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bç\u0001\u0010è\u0001\u001a\u0005\bé\u0001\u0010o\"\u0006\bê\u0001\u0010ë\u0001R)\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bì\u0001\u0010í\u0001\u001a\u0005\bî\u0001\u0010q\"\u0006\bï\u0001\u0010ð\u0001R)\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0005\bó\u0001\u0010s\"\u0006\bô\u0001\u0010õ\u0001R)\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0005\bø\u0001\u0010u\"\u0006\bù\u0001\u0010ú\u0001R)\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0005\bý\u0001\u0010w\"\u0006\bþ\u0001\u0010ÿ\u0001R)\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0005\b\u0082\u0002\u0010y\"\u0006\b\u0083\u0002\u0010\u0084\u0002R)\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0005\b\u0087\u0002\u0010{\"\u0006\b\u0088\u0002\u0010\u0089\u0002R&\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0004\b\u001c\u0010}\"\u0006\b\u008c\u0002\u0010\u008d\u0002R)\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008e\u0002\u0010\u008f\u0002\u001a\u0005\b\u0090\u0002\u0010\u007f\"\u0006\b\u0091\u0002\u0010\u0092\u0002R(\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0081\u0001\"\u0006\b\u0096\u0002\u0010\u0097\u0002R(\u0010 \u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0002\u0010\u0094\u0002\u001a\u0006\b\u0099\u0002\u0010\u0081\u0001\"\u0006\b\u009a\u0002\u0010\u0097\u0002R(\u0010!\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010\u0094\u0002\u001a\u0006\b\u009c\u0002\u0010\u0081\u0001\"\u0006\b\u009d\u0002\u0010\u0097\u0002R&\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009e\u0002\u0010\u008b\u0002\u001a\u0004\b\"\u0010}\"\u0006\b\u009f\u0002\u0010\u008d\u0002R)\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0002\u0010Ò\u0001\u001a\u0005\b¡\u0002\u0010g\"\u0006\b¢\u0002\u0010Õ\u0001R)\u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b£\u0002\u0010Ò\u0001\u001a\u0005\b¤\u0002\u0010g\"\u0006\b¥\u0002\u0010Õ\u0001R'\u0010%\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¦\u0002\u0010Ò\u0001\u001a\u0005\b§\u0002\u0010g\"\u0006\b¨\u0002\u0010Õ\u0001R*\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0006\b«\u0002\u0010\u0089\u0001\"\u0006\b¬\u0002\u0010\u00ad\u0002R)\u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b®\u0002\u0010Ò\u0001\u001a\u0005\b¯\u0002\u0010g\"\u0006\b°\u0002\u0010Õ\u0001R(\u0010)\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0002\u0010\u0094\u0002\u001a\u0006\b²\u0002\u0010\u0081\u0001\"\u0006\b³\u0002\u0010\u0097\u0002R(\u0010*\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0002\u0010\u0094\u0002\u001a\u0006\bµ\u0002\u0010\u0081\u0001\"\u0006\b¶\u0002\u0010\u0097\u0002R*\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0002\u0010¸\u0002\u001a\u0006\b¹\u0002\u0010\u008e\u0001\"\u0006\bº\u0002\u0010»\u0002R)\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¼\u0002\u0010Ò\u0001\u001a\u0005\b½\u0002\u0010g\"\u0006\b¾\u0002\u0010Õ\u0001R)\u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¿\u0002\u0010Ò\u0001\u001a\u0005\bÀ\u0002\u0010g\"\u0006\bÁ\u0002\u0010Õ\u0001R(\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÂ\u0002\u0010Ã\u0002\u001a\u0006\bÄ\u0002\u0010\u0092\u0001\"\u0006\bÅ\u0002\u0010Æ\u0002R*\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0002\u0010È\u0002\u001a\u0006\bÉ\u0002\u0010\u0094\u0001\"\u0006\bÊ\u0002\u0010Ë\u0002R*\u00103\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÌ\u0002\u0010È\u0002\u001a\u0006\bÍ\u0002\u0010\u0094\u0001\"\u0006\bÎ\u0002\u0010Ë\u0002R'\u00104\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0094\u0002\u0010Ò\u0001\u001a\u0005\bÏ\u0002\u0010g\"\u0006\bÐ\u0002\u0010Õ\u0001R*\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÑ\u0002\u0010Ò\u0002\u001a\u0006\bÓ\u0002\u0010\u0098\u0001\"\u0006\bÔ\u0002\u0010Õ\u0002R)\u00107\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÖ\u0002\u0010Ò\u0001\u001a\u0005\b×\u0002\u0010g\"\u0006\bØ\u0002\u0010Õ\u0001R*\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÙ\u0002\u0010Ú\u0002\u001a\u0006\bÛ\u0002\u0010\u009b\u0001\"\u0006\bÜ\u0002\u0010Ý\u0002R*\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÞ\u0002\u0010ß\u0002\u001a\u0006\bà\u0002\u0010\u009d\u0001\"\u0006\bá\u0002\u0010â\u0002R*\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bã\u0002\u0010ä\u0002\u001a\u0006\bå\u0002\u0010\u009f\u0001\"\u0006\bæ\u0002\u0010ç\u0002R*\u0010>\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bè\u0002\u0010¸\u0002\u001a\u0006\bé\u0002\u0010\u008e\u0001\"\u0006\bê\u0002\u0010»\u0002R*\u0010?\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bë\u0002\u0010¸\u0002\u001a\u0006\bì\u0002\u0010\u008e\u0001\"\u0006\bí\u0002\u0010»\u0002R*\u0010@\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bî\u0002\u0010¸\u0002\u001a\u0006\bï\u0002\u0010\u008e\u0001\"\u0006\bð\u0002\u0010»\u0002R)\u0010A\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bñ\u0002\u0010Ò\u0001\u001a\u0005\bò\u0002\u0010g\"\u0006\bó\u0002\u0010Õ\u0001R*\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bô\u0002\u0010õ\u0002\u001a\u0006\bö\u0002\u0010¥\u0001\"\u0006\b÷\u0002\u0010ø\u0002R/\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bù\u0002\u0010Ê\u0001\u001a\u0005\bú\u0002\u0010d\"\u0006\bû\u0002\u0010Í\u0001R*\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bü\u0002\u0010ý\u0002\u001a\u0006\bþ\u0002\u0010¨\u0001\"\u0006\bÿ\u0002\u0010\u0080\u0003R*\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0003\u0010\u0082\u0003\u001a\u0006\b\u0083\u0003\u0010ª\u0001\"\u0006\b\u0084\u0003\u0010\u0085\u0003R)\u0010K\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0086\u0003\u0010Ò\u0001\u001a\u0005\b\u0087\u0003\u0010g\"\u0006\b\u0088\u0003\u0010Õ\u0001R)\u0010L\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0003\u0010Ò\u0001\u001a\u0005\b\u008a\u0003\u0010g\"\u0006\b\u008b\u0003\u0010Õ\u0001R'\u0010M\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008c\u0003\u0010\u008b\u0002\u001a\u0005\b\u008d\u0003\u0010}\"\u0006\b\u008e\u0003\u0010\u008d\u0002R1\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010N\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0002\u0010Ê\u0001\u001a\u0005\b\u008f\u0003\u0010d\"\u0006\b\u0090\u0003\u0010Í\u0001R*\u0010P\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0003\u0010\u0092\u0003\u001a\u0006\b\u0093\u0003\u0010°\u0001\"\u0006\b\u0094\u0003\u0010\u0095\u0003R)\u0010Q\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0003\u0010Ò\u0001\u001a\u0005\b\u0097\u0003\u0010g\"\u0006\b\u0098\u0003\u0010Õ\u0001R*\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0003\u0010\u009a\u0003\u001a\u0006\b\u009b\u0003\u0010³\u0001\"\u0006\b\u009c\u0003\u0010\u009d\u0003R)\u0010T\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009e\u0003\u0010Ò\u0001\u001a\u0005\b\u009f\u0003\u0010g\"\u0006\b \u0003\u0010Õ\u0001R*\u0010U\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0003\u0010¢\u0003\u001a\u0006\b£\u0003\u0010¶\u0001\"\u0006\b¤\u0003\u0010¥\u0003R*\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0003\u0010§\u0003\u001a\u0006\b¨\u0003\u0010¸\u0001\"\u0006\b©\u0003\u0010ª\u0003R*\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0003\u0010¬\u0003\u001a\u0006\b\u00ad\u0003\u0010º\u0001\"\u0006\b®\u0003\u0010¯\u0003R*\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0003\u0010±\u0003\u001a\u0006\b²\u0003\u0010¼\u0001\"\u0006\b³\u0003\u0010´\u0003R*\u0010\\\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0003\u0010±\u0003\u001a\u0006\b¶\u0003\u0010¼\u0001\"\u0006\b·\u0003\u0010´\u0003R*\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¸\u0003\u0010¹\u0003\u001a\u0006\bº\u0003\u0010¿\u0001\"\u0006\b»\u0003\u0010¼\u0003R(\u0010`\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b½\u0003\u0010¾\u0003\u001a\u0006\b¿\u0003\u0010Á\u0001\"\u0006\bÀ\u0003\u0010Á\u0003¨\u0006Â\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/OnePrepaidModel;", "", "", "", "optionalImages", "attachmentNames", "featureCode", "idCard", "ocrIdCard", "cameraBirthDate", "imageName", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "getAuthorization", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "validateBarcodeData", "", "lastOptionalImageName", "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "faceRecognitionByPass", "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;", "faceNotFoundCountBeforeManualAccept", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformation", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "card", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "prepaidValidateIdCardResponse", "", "isFromSmartCard", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "checkSimStockResponse", "kycAttempted", "attempted", "kycAttemp", "isKYC", "displaySubscriberNumber", "cardType", "registerType", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "consentNonTelcoResponse", "consentVersionLabel", "successType", "totalAmount", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "checkSimStockError", "postcode", "postcodeSequenceString", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;", "xSIMConsentRequest", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "xSIMConsentResponse", "xSIMConsentResponsePreview", "imageSignatureConsentXSim", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;", "prepaidAssignPoolingResponse", "familySimPostpaidNumber", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;", "registerRequest", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;", "registerResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "cutSimStockResponse", "cutSimStockError", "assignPoolingError", "activationError", "nontelcoConsentType", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;", "activationResponse", "", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionsItem;", "permissions", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "validateSimTrueResponse", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "validateProfileResponse", "orderId", "trackingId", "reRegisterFlag", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "campaignList", "selectedCampaign", "itemId", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;", "scabData", "ocrBirthDate", "campaignFlag", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;", "checkPrivilege", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;", "queryTransactionResponse", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "upPassFormResult", "upPassFormCompareResult", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;", "faceCompareResponseSubmit", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "currentFormType", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;ZLth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;Ljava/lang/String;IILth/co/dtac/android/dtacone/model/error/ErrorCollection;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;Ljava/util/List;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "component9", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "component10", "()Ljava/lang/Integer;", "component11", "()Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "component12", "()Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;", "component13", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "component14", "()Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "component15", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "component16", "()Z", "component17", "()Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "component18", "()I", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "()Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "component26", "component27", "component28", "component29", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "component30", "component31", "component32", "()Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;", "component33", "()Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "component34", "component35", "component36", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;", "component37", "component38", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;", "component39", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;", "component40", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "component41", "component42", "component43", "component44", "component45", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;", "component46", "component47", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "component48", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "component49", "component50", "component51", "component52", "component53", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "component54", "component55", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;", "component56", "component57", "()Ljava/lang/Boolean;", "component58", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;", "component59", "()Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;", "component60", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "component61", "component62", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;", "component63", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;ZLth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;Ljava/lang/String;IILth/co/dtac/android/dtacone/model/error/ErrorCollection;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;Ljava/util/List;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;)Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/OnePrepaidModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getOptionalImages", "setOptionalImages", "(Ljava/util/List;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getAttachmentNames", "setAttachmentNames", OperatorName.CURVE_TO, "Ljava/lang/String;", "getFeatureCode", "setFeatureCode", "(Ljava/lang/String;)V", "d", "getIdCard", "setIdCard", "e", "getOcrIdCard", "setOcrIdCard", OperatorName.FILL_NON_ZERO, "getCameraBirthDate", "setCameraBirthDate", OperatorName.NON_STROKING_GRAY, "getImageName", "setImageName", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "getGetAuthorization", "setGetAuthorization", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;)V", "i", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "getValidateBarcodeData", "setValidateBarcodeData", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;)V", OperatorName.SET_LINE_JOINSTYLE, "Ljava/lang/Integer;", "getLastOptionalImageName", "setLastOptionalImageName", "(Ljava/lang/Integer;)V", OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "getFaceRecognitionByPass", "setFaceRecognitionByPass", "(Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;)V", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;", "getFaceNotFoundCountBeforeManualAccept", "setFaceNotFoundCountBeforeManualAccept", "(Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;)V", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "getCardInformation", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "getCard", "setCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;)V", "o", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "getPrepaidValidateIdCardResponse", "setPrepaidValidateIdCardResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;)V", "p", "Z", "setFromSmartCard", "(Z)V", OperatorName.SAVE, "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "getCheckSimStockResponse", "setCheckSimStockResponse", "(Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;)V", PDPageLabelRange.STYLE_ROMAN_LOWER, "I", "getKycAttempted", "setKycAttempted", "(I)V", OperatorName.CLOSE_AND_STROKE, "getAttempted", "setAttempted", "t", "getKycAttemp", "setKycAttemp", "u", "setKYC", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getDisplaySubscriberNumber", "setDisplaySubscriberNumber", OperatorName.SET_LINE_WIDTH, "getCardType", "setCardType", "x", "getRegisterType", "setRegisterType", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "getConsentNonTelcoResponse", "setConsentNonTelcoResponse", "(Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;)V", "z", "getConsentVersionLabel", "setConsentVersionLabel", "A", "getSuccessType", "setSuccessType", "B", "getTotalAmount", "setTotalAmount", "C", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "getCheckSimStockError", "setCheckSimStockError", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "D", "getPostcode", "setPostcode", ExifInterface.LONGITUDE_EAST, "getPostcodeSequenceString", "setPostcodeSequenceString", "F", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;", "getXSIMConsentRequest", "setXSIMConsentRequest", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;)V", OperatorName.STROKING_COLOR_GRAY, "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "getXSIMConsentResponse", "setXSIMConsentResponse", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;)V", "H", "getXSIMConsentResponsePreview", "setXSIMConsentResponsePreview", "getImageSignatureConsentXSim", "setImageSignatureConsentXSim", OperatorName.SET_LINE_CAPSTYLE, "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;", "getPrepaidAssignPoolingResponse", "setPrepaidAssignPoolingResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;)V", "K", "getFamilySimPostpaidNumber", "setFamilySimPostpaidNumber", "L", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;", "getRegisterRequest", "setRegisterRequest", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;)V", "M", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;", "getRegisterResponse", "setRegisterResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;)V", "N", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "getCutSimStockResponse", "setCutSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;)V", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getCutSimStockError", "setCutSimStockError", "P", "getAssignPoolingError", "setAssignPoolingError", OperatorName.RESTORE, "getActivationError", "setActivationError", "R", "getNontelcoConsentType", "setNontelcoConsentType", "S", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;", "getActivationResponse", "setActivationResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneActivateResponse;)V", "T", "getPermissions", "setPermissions", PDBorderStyleDictionary.STYLE_UNDERLINE, "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "getValidateSimTrueResponse", "setValidateSimTrueResponse", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "getValidateProfileResponse", "setValidateProfileResponse", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;)V", "W", "getOrderId", "setOrderId", "X", "getTrackingId", "setTrackingId", "Y", "getReRegisterFlag", "setReRegisterFlag", "getCampaignList", "setCampaignList", "a0", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "getSelectedCampaign", "setSelectedCampaign", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;)V", "b0", "getItemId", "setItemId", "c0", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;", "getScabData", "setScabData", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;)V", OperatorName.TYPE3_D0, "getOcrBirthDate", "setOcrBirthDate", "e0", "Ljava/lang/Boolean;", "getCampaignFlag", "setCampaignFlag", "(Ljava/lang/Boolean;)V", "f0", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;", "getCheckPrivilege", "setCheckPrivilege", "(Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;)V", "g0", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;", "getQueryTransactionResponse", "setQueryTransactionResponse", "(Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse$Data;)V", "h0", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "getUpPassFormResult", "setUpPassFormResult", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;)V", "i0", "getUpPassFormCompareResult", "setUpPassFormCompareResult", "j0", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;", "getFaceCompareResponseSubmit", "setFaceCompareResponseSubmit", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;)V", "k0", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "getCurrentFormType", "setCurrentFormType", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.OnePrepaidModel */
/* loaded from: classes10.dex */
public final class OnePrepaidModel {
    public static final int $stable = 8;

    /* renamed from: A */
    public int f95842A;

    /* renamed from: B */
    public int f95843B;

    /* renamed from: C */
    public ErrorCollection f95844C;

    /* renamed from: D */
    public String f95845D;

    /* renamed from: E */
    public String f95846E;

    /* renamed from: F */
    public XSIMConsentRequest f95847F;

    /* renamed from: G */
    public XSIMConsentResponse f95848G;

    /* renamed from: H */
    public XSIMConsentResponse f95849H;

    /* renamed from: I */
    public String f95850I;

    /* renamed from: J */
    public OnePrepaidAssignPoolingResponse f95851J;

    /* renamed from: K */
    public String f95852K;

    /* renamed from: L */
    public MrtrPrepaidRegisterRequest f95853L;

    /* renamed from: M */
    public OnePrepaidRegisterResponse f95854M;

    /* renamed from: N */
    public CutSimStockResponse f95855N;

    /* renamed from: O */
    public ErrorCollection f95856O;

    /* renamed from: P */
    public ErrorCollection f95857P;

    /* renamed from: Q */
    public ErrorCollection f95858Q;

    /* renamed from: R */
    public String f95859R;

    /* renamed from: S */
    public OneActivateResponse f95860S;

    /* renamed from: T */
    public List f95861T;

    /* renamed from: U */
    public OneValidateSimTrueResponse f95862U;

    /* renamed from: V */
    public OneChangeOwnerValidateProfileResponse f95863V;

    /* renamed from: W */
    public String f95864W;

    /* renamed from: X */
    public String f95865X;

    /* renamed from: Y */
    public boolean f95866Y;

    /* renamed from: Z */
    public List f95867Z;

    /* renamed from: a */
    public List f95868a;

    /* renamed from: a0 */
    public CampaignItem f95869a0;

    /* renamed from: b */
    public List f95870b;

    /* renamed from: b0 */
    public String f95871b0;

    /* renamed from: c */
    public String f95872c;

    /* renamed from: c0 */
    public OnePrepaidRegisterTGetScabResponse f95873c0;

    /* renamed from: d */
    public String f95874d;

    /* renamed from: d0 */
    public String f95875d0;

    /* renamed from: e */
    public String f95876e;

    /* renamed from: e0 */
    public Boolean f95877e0;

    /* renamed from: f */
    public String f95878f;

    /* renamed from: f0 */
    public OnePrepaidRegisterTCheckPrivilegeResponse f95879f0;

    /* renamed from: g */
    public String f95880g;

    /* renamed from: g0 */
    public QueryTransactionResponse.Data f95881g0;

    /* renamed from: h */
    public OnePrepaidAuthorizationResponse.Data f95882h;

    /* renamed from: h0 */
    public UpPassFormResult f95883h0;

    /* renamed from: i */
    public OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData f95884i;

    /* renamed from: i0 */
    public UpPassFormResult f95885i0;

    /* renamed from: j */
    public Integer f95886j;

    /* renamed from: j0 */
    public FaceCompareResponseSubmit f95887j0;

    /* renamed from: k */
    public FaceRecognitionByPass f95888k;

    /* renamed from: k0 */
    public UpPassFormType f95889k0;

    /* renamed from: l */
    public FaceNotFoundCountBeforeManualAccept f95890l;

    /* renamed from: m */
    public IdCardInformationCollection f95891m;

    /* renamed from: n */
    public CardCollection f95892n;

    /* renamed from: o */
    public OnePrepaidValidateIdCardResponse f95893o;

    /* renamed from: p */
    public boolean f95894p;

    /* renamed from: q */
    public SimTermSukCheckSimStockResponse f95895q;

    /* renamed from: r */
    public int f95896r;

    /* renamed from: s */
    public int f95897s;

    /* renamed from: t */
    public int f95898t;

    /* renamed from: u */
    public boolean f95899u;

    /* renamed from: v */
    public String f95900v;

    /* renamed from: w */
    public String f95901w;

    /* renamed from: x */
    public String f95902x;

    /* renamed from: y */
    public ConsentNonTelcoResponse f95903y;

    /* renamed from: z */
    public String f95904z;

    public OnePrepaidModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0, 0, 0, false, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, Integer.MAX_VALUE, null);
    }

    @Nullable
    public final List<String> component1() {
        return this.f95868a;
    }

    @Nullable
    public final Integer component10() {
        return this.f95886j;
    }

    @Nullable
    public final FaceRecognitionByPass component11() {
        return this.f95888k;
    }

    @Nullable
    public final FaceNotFoundCountBeforeManualAccept component12() {
        return this.f95890l;
    }

    @Nullable
    public final IdCardInformationCollection component13() {
        return this.f95891m;
    }

    @Nullable
    public final CardCollection component14() {
        return this.f95892n;
    }

    @Nullable
    public final OnePrepaidValidateIdCardResponse component15() {
        return this.f95893o;
    }

    public final boolean component16() {
        return this.f95894p;
    }

    @Nullable
    public final SimTermSukCheckSimStockResponse component17() {
        return this.f95895q;
    }

    public final int component18() {
        return this.f95896r;
    }

    public final int component19() {
        return this.f95897s;
    }

    @Nullable
    public final List<String> component2() {
        return this.f95870b;
    }

    public final int component20() {
        return this.f95898t;
    }

    public final boolean component21() {
        return this.f95899u;
    }

    @Nullable
    public final String component22() {
        return this.f95900v;
    }

    @Nullable
    public final String component23() {
        return this.f95901w;
    }

    @NotNull
    public final String component24() {
        return this.f95902x;
    }

    @Nullable
    public final ConsentNonTelcoResponse component25() {
        return this.f95903y;
    }

    @Nullable
    public final String component26() {
        return this.f95904z;
    }

    public final int component27() {
        return this.f95842A;
    }

    public final int component28() {
        return this.f95843B;
    }

    @Nullable
    public final ErrorCollection component29() {
        return this.f95844C;
    }

    @Nullable
    public final String component3() {
        return this.f95872c;
    }

    @Nullable
    public final String component30() {
        return this.f95845D;
    }

    @Nullable
    public final String component31() {
        return this.f95846E;
    }

    @NotNull
    public final XSIMConsentRequest component32() {
        return this.f95847F;
    }

    @Nullable
    public final XSIMConsentResponse component33() {
        return this.f95848G;
    }

    @Nullable
    public final XSIMConsentResponse component34() {
        return this.f95849H;
    }

    @NotNull
    public final String component35() {
        return this.f95850I;
    }

    @Nullable
    public final OnePrepaidAssignPoolingResponse component36() {
        return this.f95851J;
    }

    @Nullable
    public final String component37() {
        return this.f95852K;
    }

    @Nullable
    public final MrtrPrepaidRegisterRequest component38() {
        return this.f95853L;
    }

    @Nullable
    public final OnePrepaidRegisterResponse component39() {
        return this.f95854M;
    }

    @Nullable
    public final String component4() {
        return this.f95874d;
    }

    @Nullable
    public final CutSimStockResponse component40() {
        return this.f95855N;
    }

    @Nullable
    public final ErrorCollection component41() {
        return this.f95856O;
    }

    @Nullable
    public final ErrorCollection component42() {
        return this.f95857P;
    }

    @Nullable
    public final ErrorCollection component43() {
        return this.f95858Q;
    }

    @Nullable
    public final String component44() {
        return this.f95859R;
    }

    @Nullable
    public final OneActivateResponse component45() {
        return this.f95860S;
    }

    @Nullable
    public final List<OnePermissionsItem> component46() {
        return this.f95861T;
    }

    @Nullable
    public final OneValidateSimTrueResponse component47() {
        return this.f95862U;
    }

    @Nullable
    public final OneChangeOwnerValidateProfileResponse component48() {
        return this.f95863V;
    }

    @Nullable
    public final String component49() {
        return this.f95864W;
    }

    @Nullable
    public final String component5() {
        return this.f95876e;
    }

    @Nullable
    public final String component50() {
        return this.f95865X;
    }

    public final boolean component51() {
        return this.f95866Y;
    }

    @Nullable
    public final List<CampaignItem> component52() {
        return this.f95867Z;
    }

    @Nullable
    public final CampaignItem component53() {
        return this.f95869a0;
    }

    @Nullable
    public final String component54() {
        return this.f95871b0;
    }

    @Nullable
    public final OnePrepaidRegisterTGetScabResponse component55() {
        return this.f95873c0;
    }

    @Nullable
    public final String component56() {
        return this.f95875d0;
    }

    @Nullable
    public final Boolean component57() {
        return this.f95877e0;
    }

    @Nullable
    public final OnePrepaidRegisterTCheckPrivilegeResponse component58() {
        return this.f95879f0;
    }

    @Nullable
    public final QueryTransactionResponse.Data component59() {
        return this.f95881g0;
    }

    @Nullable
    public final String component6() {
        return this.f95878f;
    }

    @Nullable
    public final UpPassFormResult component60() {
        return this.f95883h0;
    }

    @Nullable
    public final UpPassFormResult component61() {
        return this.f95885i0;
    }

    @Nullable
    public final FaceCompareResponseSubmit component62() {
        return this.f95887j0;
    }

    @NotNull
    public final UpPassFormType component63() {
        return this.f95889k0;
    }

    @Nullable
    public final String component7() {
        return this.f95880g;
    }

    @Nullable
    public final OnePrepaidAuthorizationResponse.Data component8() {
        return this.f95882h;
    }

    @Nullable
    public final OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData component9() {
        return this.f95884i;
    }

    @NotNull
    public final OnePrepaidModel copy(@Nullable List<String> list, @Nullable List<String> list2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable OnePrepaidAuthorizationResponse.Data data, @Nullable OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData, @Nullable Integer num, @Nullable FaceRecognitionByPass faceRecognitionByPass, @Nullable FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable CardCollection cardCollection, @Nullable OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse, boolean z, @Nullable SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse, int i, int i2, int i3, boolean z2, @Nullable String str6, @Nullable String str7, @NotNull String registerType, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, @Nullable String str8, int i4, int i5, @Nullable ErrorCollection errorCollection, @Nullable String str9, @Nullable String str10, @NotNull XSIMConsentRequest xSIMConsentRequest, @Nullable XSIMConsentResponse xSIMConsentResponse, @Nullable XSIMConsentResponse xSIMConsentResponse2, @NotNull String imageSignatureConsentXSim, @Nullable OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse, @Nullable String str11, @Nullable MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, @Nullable OnePrepaidRegisterResponse onePrepaidRegisterResponse, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable ErrorCollection errorCollection2, @Nullable ErrorCollection errorCollection3, @Nullable ErrorCollection errorCollection4, @Nullable String str12, @Nullable OneActivateResponse oneActivateResponse, @Nullable List<OnePermissionsItem> list3, @Nullable OneValidateSimTrueResponse oneValidateSimTrueResponse, @Nullable OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse, @Nullable String str13, @Nullable String str14, boolean z3, @Nullable List<CampaignItem> list4, @Nullable CampaignItem campaignItem, @Nullable String str15, @Nullable OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse, @Nullable String str16, @Nullable Boolean bool, @Nullable OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse, @Nullable QueryTransactionResponse.Data data2, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @Nullable FaceCompareResponseSubmit faceCompareResponseSubmit, @NotNull UpPassFormType currentFormType) {
        Intrinsics.checkNotNullParameter(registerType, "registerType");
        Intrinsics.checkNotNullParameter(xSIMConsentRequest, "xSIMConsentRequest");
        Intrinsics.checkNotNullParameter(imageSignatureConsentXSim, "imageSignatureConsentXSim");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        return new OnePrepaidModel(list, list2, str, str2, str3, str4, str5, data, validateBarcodeData, num, faceRecognitionByPass, faceNotFoundCountBeforeManualAccept, idCardInformationCollection, cardCollection, onePrepaidValidateIdCardResponse, z, simTermSukCheckSimStockResponse, i, i2, i3, z2, str6, str7, registerType, consentNonTelcoResponse, str8, i4, i5, errorCollection, str9, str10, xSIMConsentRequest, xSIMConsentResponse, xSIMConsentResponse2, imageSignatureConsentXSim, onePrepaidAssignPoolingResponse, str11, mrtrPrepaidRegisterRequest, onePrepaidRegisterResponse, cutSimStockResponse, errorCollection2, errorCollection3, errorCollection4, str12, oneActivateResponse, list3, oneValidateSimTrueResponse, oneChangeOwnerValidateProfileResponse, str13, str14, z3, list4, campaignItem, str15, onePrepaidRegisterTGetScabResponse, str16, bool, onePrepaidRegisterTCheckPrivilegeResponse, data2, upPassFormResult, upPassFormResult2, faceCompareResponseSubmit, currentFormType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidModel) {
            OnePrepaidModel onePrepaidModel = (OnePrepaidModel) obj;
            return Intrinsics.areEqual(this.f95868a, onePrepaidModel.f95868a) && Intrinsics.areEqual(this.f95870b, onePrepaidModel.f95870b) && Intrinsics.areEqual(this.f95872c, onePrepaidModel.f95872c) && Intrinsics.areEqual(this.f95874d, onePrepaidModel.f95874d) && Intrinsics.areEqual(this.f95876e, onePrepaidModel.f95876e) && Intrinsics.areEqual(this.f95878f, onePrepaidModel.f95878f) && Intrinsics.areEqual(this.f95880g, onePrepaidModel.f95880g) && Intrinsics.areEqual(this.f95882h, onePrepaidModel.f95882h) && Intrinsics.areEqual(this.f95884i, onePrepaidModel.f95884i) && Intrinsics.areEqual(this.f95886j, onePrepaidModel.f95886j) && Intrinsics.areEqual(this.f95888k, onePrepaidModel.f95888k) && Intrinsics.areEqual(this.f95890l, onePrepaidModel.f95890l) && Intrinsics.areEqual(this.f95891m, onePrepaidModel.f95891m) && Intrinsics.areEqual(this.f95892n, onePrepaidModel.f95892n) && Intrinsics.areEqual(this.f95893o, onePrepaidModel.f95893o) && this.f95894p == onePrepaidModel.f95894p && Intrinsics.areEqual(this.f95895q, onePrepaidModel.f95895q) && this.f95896r == onePrepaidModel.f95896r && this.f95897s == onePrepaidModel.f95897s && this.f95898t == onePrepaidModel.f95898t && this.f95899u == onePrepaidModel.f95899u && Intrinsics.areEqual(this.f95900v, onePrepaidModel.f95900v) && Intrinsics.areEqual(this.f95901w, onePrepaidModel.f95901w) && Intrinsics.areEqual(this.f95902x, onePrepaidModel.f95902x) && Intrinsics.areEqual(this.f95903y, onePrepaidModel.f95903y) && Intrinsics.areEqual(this.f95904z, onePrepaidModel.f95904z) && this.f95842A == onePrepaidModel.f95842A && this.f95843B == onePrepaidModel.f95843B && Intrinsics.areEqual(this.f95844C, onePrepaidModel.f95844C) && Intrinsics.areEqual(this.f95845D, onePrepaidModel.f95845D) && Intrinsics.areEqual(this.f95846E, onePrepaidModel.f95846E) && Intrinsics.areEqual(this.f95847F, onePrepaidModel.f95847F) && Intrinsics.areEqual(this.f95848G, onePrepaidModel.f95848G) && Intrinsics.areEqual(this.f95849H, onePrepaidModel.f95849H) && Intrinsics.areEqual(this.f95850I, onePrepaidModel.f95850I) && Intrinsics.areEqual(this.f95851J, onePrepaidModel.f95851J) && Intrinsics.areEqual(this.f95852K, onePrepaidModel.f95852K) && Intrinsics.areEqual(this.f95853L, onePrepaidModel.f95853L) && Intrinsics.areEqual(this.f95854M, onePrepaidModel.f95854M) && Intrinsics.areEqual(this.f95855N, onePrepaidModel.f95855N) && Intrinsics.areEqual(this.f95856O, onePrepaidModel.f95856O) && Intrinsics.areEqual(this.f95857P, onePrepaidModel.f95857P) && Intrinsics.areEqual(this.f95858Q, onePrepaidModel.f95858Q) && Intrinsics.areEqual(this.f95859R, onePrepaidModel.f95859R) && Intrinsics.areEqual(this.f95860S, onePrepaidModel.f95860S) && Intrinsics.areEqual(this.f95861T, onePrepaidModel.f95861T) && Intrinsics.areEqual(this.f95862U, onePrepaidModel.f95862U) && Intrinsics.areEqual(this.f95863V, onePrepaidModel.f95863V) && Intrinsics.areEqual(this.f95864W, onePrepaidModel.f95864W) && Intrinsics.areEqual(this.f95865X, onePrepaidModel.f95865X) && this.f95866Y == onePrepaidModel.f95866Y && Intrinsics.areEqual(this.f95867Z, onePrepaidModel.f95867Z) && Intrinsics.areEqual(this.f95869a0, onePrepaidModel.f95869a0) && Intrinsics.areEqual(this.f95871b0, onePrepaidModel.f95871b0) && Intrinsics.areEqual(this.f95873c0, onePrepaidModel.f95873c0) && Intrinsics.areEqual(this.f95875d0, onePrepaidModel.f95875d0) && Intrinsics.areEqual(this.f95877e0, onePrepaidModel.f95877e0) && Intrinsics.areEqual(this.f95879f0, onePrepaidModel.f95879f0) && Intrinsics.areEqual(this.f95881g0, onePrepaidModel.f95881g0) && Intrinsics.areEqual(this.f95883h0, onePrepaidModel.f95883h0) && Intrinsics.areEqual(this.f95885i0, onePrepaidModel.f95885i0) && Intrinsics.areEqual(this.f95887j0, onePrepaidModel.f95887j0) && Intrinsics.areEqual(this.f95889k0, onePrepaidModel.f95889k0);
        }
        return false;
    }

    @Nullable
    public final ErrorCollection getActivationError() {
        return this.f95858Q;
    }

    @Nullable
    public final OneActivateResponse getActivationResponse() {
        return this.f95860S;
    }

    @Nullable
    public final ErrorCollection getAssignPoolingError() {
        return this.f95857P;
    }

    @Nullable
    public final List<String> getAttachmentNames() {
        return this.f95870b;
    }

    public final int getAttempted() {
        return this.f95897s;
    }

    @Nullable
    public final String getCameraBirthDate() {
        return this.f95878f;
    }

    @Nullable
    public final Boolean getCampaignFlag() {
        return this.f95877e0;
    }

    @Nullable
    public final List<CampaignItem> getCampaignList() {
        return this.f95867Z;
    }

    @Nullable
    public final CardCollection getCard() {
        return this.f95892n;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformation() {
        return this.f95891m;
    }

    @Nullable
    public final String getCardType() {
        return this.f95901w;
    }

    @Nullable
    public final OnePrepaidRegisterTCheckPrivilegeResponse getCheckPrivilege() {
        return this.f95879f0;
    }

    @Nullable
    public final ErrorCollection getCheckSimStockError() {
        return this.f95844C;
    }

    @Nullable
    public final SimTermSukCheckSimStockResponse getCheckSimStockResponse() {
        return this.f95895q;
    }

    @Nullable
    public final ConsentNonTelcoResponse getConsentNonTelcoResponse() {
        return this.f95903y;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.f95904z;
    }

    @NotNull
    public final UpPassFormType getCurrentFormType() {
        return this.f95889k0;
    }

    @Nullable
    public final ErrorCollection getCutSimStockError() {
        return this.f95856O;
    }

    @Nullable
    public final CutSimStockResponse getCutSimStockResponse() {
        return this.f95855N;
    }

    @Nullable
    public final String getDisplaySubscriberNumber() {
        return this.f95900v;
    }

    @Nullable
    public final FaceCompareResponseSubmit getFaceCompareResponseSubmit() {
        return this.f95887j0;
    }

    @Nullable
    public final FaceNotFoundCountBeforeManualAccept getFaceNotFoundCountBeforeManualAccept() {
        return this.f95890l;
    }

    @Nullable
    public final FaceRecognitionByPass getFaceRecognitionByPass() {
        return this.f95888k;
    }

    @Nullable
    public final String getFamilySimPostpaidNumber() {
        return this.f95852K;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.f95872c;
    }

    @Nullable
    public final OnePrepaidAuthorizationResponse.Data getGetAuthorization() {
        return this.f95882h;
    }

    @Nullable
    public final String getIdCard() {
        return this.f95874d;
    }

    @Nullable
    public final String getImageName() {
        return this.f95880g;
    }

    @NotNull
    public final String getImageSignatureConsentXSim() {
        return this.f95850I;
    }

    @Nullable
    public final String getItemId() {
        return this.f95871b0;
    }

    public final int getKycAttemp() {
        return this.f95898t;
    }

    public final int getKycAttempted() {
        return this.f95896r;
    }

    @Nullable
    public final Integer getLastOptionalImageName() {
        return this.f95886j;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.f95859R;
    }

    @Nullable
    public final String getOcrBirthDate() {
        return this.f95875d0;
    }

    @Nullable
    public final String getOcrIdCard() {
        return this.f95876e;
    }

    @Nullable
    public final List<String> getOptionalImages() {
        return this.f95868a;
    }

    @Nullable
    public final String getOrderId() {
        return this.f95864W;
    }

    @Nullable
    public final List<OnePermissionsItem> getPermissions() {
        return this.f95861T;
    }

    @Nullable
    public final String getPostcode() {
        return this.f95845D;
    }

    @Nullable
    public final String getPostcodeSequenceString() {
        return this.f95846E;
    }

    @Nullable
    public final OnePrepaidAssignPoolingResponse getPrepaidAssignPoolingResponse() {
        return this.f95851J;
    }

    @Nullable
    public final OnePrepaidValidateIdCardResponse getPrepaidValidateIdCardResponse() {
        return this.f95893o;
    }

    @Nullable
    public final QueryTransactionResponse.Data getQueryTransactionResponse() {
        return this.f95881g0;
    }

    public final boolean getReRegisterFlag() {
        return this.f95866Y;
    }

    @Nullable
    public final MrtrPrepaidRegisterRequest getRegisterRequest() {
        return this.f95853L;
    }

    @Nullable
    public final OnePrepaidRegisterResponse getRegisterResponse() {
        return this.f95854M;
    }

    @NotNull
    public final String getRegisterType() {
        return this.f95902x;
    }

    @Nullable
    public final OnePrepaidRegisterTGetScabResponse getScabData() {
        return this.f95873c0;
    }

    @Nullable
    public final CampaignItem getSelectedCampaign() {
        return this.f95869a0;
    }

    public final int getSuccessType() {
        return this.f95842A;
    }

    public final int getTotalAmount() {
        return this.f95843B;
    }

    @Nullable
    public final String getTrackingId() {
        return this.f95865X;
    }

    @Nullable
    public final UpPassFormResult getUpPassFormCompareResult() {
        return this.f95885i0;
    }

    @Nullable
    public final UpPassFormResult getUpPassFormResult() {
        return this.f95883h0;
    }

    @Nullable
    public final OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData getValidateBarcodeData() {
        return this.f95884i;
    }

    @Nullable
    public final OneChangeOwnerValidateProfileResponse getValidateProfileResponse() {
        return this.f95863V;
    }

    @Nullable
    public final OneValidateSimTrueResponse getValidateSimTrueResponse() {
        return this.f95862U;
    }

    @NotNull
    public final XSIMConsentRequest getXSIMConsentRequest() {
        return this.f95847F;
    }

    @Nullable
    public final XSIMConsentResponse getXSIMConsentResponse() {
        return this.f95848G;
    }

    @Nullable
    public final XSIMConsentResponse getXSIMConsentResponsePreview() {
        return this.f95849H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List list = this.f95868a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f95870b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f95872c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95874d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95876e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95878f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95880g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OnePrepaidAuthorizationResponse.Data data = this.f95882h;
        int hashCode8 = (hashCode7 + (data == null ? 0 : data.hashCode())) * 31;
        OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData = this.f95884i;
        int hashCode9 = (hashCode8 + (validateBarcodeData == null ? 0 : validateBarcodeData.hashCode())) * 31;
        Integer num = this.f95886j;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        FaceRecognitionByPass faceRecognitionByPass = this.f95888k;
        int hashCode11 = (hashCode10 + (faceRecognitionByPass == null ? 0 : faceRecognitionByPass.hashCode())) * 31;
        FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept = this.f95890l;
        int hashCode12 = (hashCode11 + (faceNotFoundCountBeforeManualAccept == null ? 0 : faceNotFoundCountBeforeManualAccept.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.f95891m;
        int hashCode13 = (hashCode12 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        CardCollection cardCollection = this.f95892n;
        int hashCode14 = (hashCode13 + (cardCollection == null ? 0 : cardCollection.hashCode())) * 31;
        OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse = this.f95893o;
        int hashCode15 = (hashCode14 + (onePrepaidValidateIdCardResponse == null ? 0 : onePrepaidValidateIdCardResponse.hashCode())) * 31;
        boolean z = this.f95894p;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode15 + i) * 31;
        SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse = this.f95895q;
        int hashCode16 = (((((((i2 + (simTermSukCheckSimStockResponse == null ? 0 : simTermSukCheckSimStockResponse.hashCode())) * 31) + this.f95896r) * 31) + this.f95897s) * 31) + this.f95898t) * 31;
        boolean z2 = this.f95899u;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode16 + i3) * 31;
        String str6 = this.f95900v;
        int hashCode17 = (i4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f95901w;
        int hashCode18 = (((hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.f95902x.hashCode()) * 31;
        ConsentNonTelcoResponse consentNonTelcoResponse = this.f95903y;
        int hashCode19 = (hashCode18 + (consentNonTelcoResponse == null ? 0 : consentNonTelcoResponse.hashCode())) * 31;
        String str8 = this.f95904z;
        int hashCode20 = (((((hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.f95842A) * 31) + this.f95843B) * 31;
        ErrorCollection errorCollection = this.f95844C;
        int hashCode21 = (hashCode20 + (errorCollection == null ? 0 : errorCollection.hashCode())) * 31;
        String str9 = this.f95845D;
        int hashCode22 = (hashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f95846E;
        int hashCode23 = (((hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.f95847F.hashCode()) * 31;
        XSIMConsentResponse xSIMConsentResponse = this.f95848G;
        int hashCode24 = (hashCode23 + (xSIMConsentResponse == null ? 0 : xSIMConsentResponse.hashCode())) * 31;
        XSIMConsentResponse xSIMConsentResponse2 = this.f95849H;
        int hashCode25 = (((hashCode24 + (xSIMConsentResponse2 == null ? 0 : xSIMConsentResponse2.hashCode())) * 31) + this.f95850I.hashCode()) * 31;
        OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse = this.f95851J;
        int hashCode26 = (hashCode25 + (onePrepaidAssignPoolingResponse == null ? 0 : onePrepaidAssignPoolingResponse.hashCode())) * 31;
        String str11 = this.f95852K;
        int hashCode27 = (hashCode26 + (str11 == null ? 0 : str11.hashCode())) * 31;
        MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest = this.f95853L;
        int hashCode28 = (hashCode27 + (mrtrPrepaidRegisterRequest == null ? 0 : mrtrPrepaidRegisterRequest.hashCode())) * 31;
        OnePrepaidRegisterResponse onePrepaidRegisterResponse = this.f95854M;
        int hashCode29 = (hashCode28 + (onePrepaidRegisterResponse == null ? 0 : onePrepaidRegisterResponse.hashCode())) * 31;
        CutSimStockResponse cutSimStockResponse = this.f95855N;
        int hashCode30 = (hashCode29 + (cutSimStockResponse == null ? 0 : cutSimStockResponse.hashCode())) * 31;
        ErrorCollection errorCollection2 = this.f95856O;
        int hashCode31 = (hashCode30 + (errorCollection2 == null ? 0 : errorCollection2.hashCode())) * 31;
        ErrorCollection errorCollection3 = this.f95857P;
        int hashCode32 = (hashCode31 + (errorCollection3 == null ? 0 : errorCollection3.hashCode())) * 31;
        ErrorCollection errorCollection4 = this.f95858Q;
        int hashCode33 = (hashCode32 + (errorCollection4 == null ? 0 : errorCollection4.hashCode())) * 31;
        String str12 = this.f95859R;
        int hashCode34 = (hashCode33 + (str12 == null ? 0 : str12.hashCode())) * 31;
        OneActivateResponse oneActivateResponse = this.f95860S;
        int hashCode35 = (hashCode34 + (oneActivateResponse == null ? 0 : oneActivateResponse.hashCode())) * 31;
        List list3 = this.f95861T;
        int hashCode36 = (hashCode35 + (list3 == null ? 0 : list3.hashCode())) * 31;
        OneValidateSimTrueResponse oneValidateSimTrueResponse = this.f95862U;
        int hashCode37 = (hashCode36 + (oneValidateSimTrueResponse == null ? 0 : oneValidateSimTrueResponse.hashCode())) * 31;
        OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse = this.f95863V;
        int hashCode38 = (hashCode37 + (oneChangeOwnerValidateProfileResponse == null ? 0 : oneChangeOwnerValidateProfileResponse.hashCode())) * 31;
        String str13 = this.f95864W;
        int hashCode39 = (hashCode38 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f95865X;
        int hashCode40 = (hashCode39 + (str14 == null ? 0 : str14.hashCode())) * 31;
        boolean z3 = this.f95866Y;
        int i5 = (hashCode40 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        List list4 = this.f95867Z;
        int hashCode41 = (i5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        CampaignItem campaignItem = this.f95869a0;
        int hashCode42 = (hashCode41 + (campaignItem == null ? 0 : campaignItem.hashCode())) * 31;
        String str15 = this.f95871b0;
        int hashCode43 = (hashCode42 + (str15 == null ? 0 : str15.hashCode())) * 31;
        OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse = this.f95873c0;
        int hashCode44 = (hashCode43 + (onePrepaidRegisterTGetScabResponse == null ? 0 : onePrepaidRegisterTGetScabResponse.hashCode())) * 31;
        String str16 = this.f95875d0;
        int hashCode45 = (hashCode44 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.f95877e0;
        int hashCode46 = (hashCode45 + (bool == null ? 0 : bool.hashCode())) * 31;
        OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse = this.f95879f0;
        int hashCode47 = (hashCode46 + (onePrepaidRegisterTCheckPrivilegeResponse == null ? 0 : onePrepaidRegisterTCheckPrivilegeResponse.hashCode())) * 31;
        QueryTransactionResponse.Data data2 = this.f95881g0;
        int hashCode48 = (hashCode47 + (data2 == null ? 0 : data2.hashCode())) * 31;
        UpPassFormResult upPassFormResult = this.f95883h0;
        int hashCode49 = (hashCode48 + (upPassFormResult == null ? 0 : upPassFormResult.hashCode())) * 31;
        UpPassFormResult upPassFormResult2 = this.f95885i0;
        int hashCode50 = (hashCode49 + (upPassFormResult2 == null ? 0 : upPassFormResult2.hashCode())) * 31;
        FaceCompareResponseSubmit faceCompareResponseSubmit = this.f95887j0;
        return ((hashCode50 + (faceCompareResponseSubmit != null ? faceCompareResponseSubmit.hashCode() : 0)) * 31) + this.f95889k0.hashCode();
    }

    public final boolean isFromSmartCard() {
        return this.f95894p;
    }

    public final boolean isKYC() {
        return this.f95899u;
    }

    public final void setActivationError(@Nullable ErrorCollection errorCollection) {
        this.f95858Q = errorCollection;
    }

    public final void setActivationResponse(@Nullable OneActivateResponse oneActivateResponse) {
        this.f95860S = oneActivateResponse;
    }

    public final void setAssignPoolingError(@Nullable ErrorCollection errorCollection) {
        this.f95857P = errorCollection;
    }

    public final void setAttachmentNames(@Nullable List<String> list) {
        this.f95870b = list;
    }

    public final void setAttempted(int i) {
        this.f95897s = i;
    }

    public final void setCameraBirthDate(@Nullable String str) {
        this.f95878f = str;
    }

    public final void setCampaignFlag(@Nullable Boolean bool) {
        this.f95877e0 = bool;
    }

    public final void setCampaignList(@Nullable List<CampaignItem> list) {
        this.f95867Z = list;
    }

    public final void setCard(@Nullable CardCollection cardCollection) {
        this.f95892n = cardCollection;
    }

    public final void setCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.f95891m = idCardInformationCollection;
    }

    public final void setCardType(@Nullable String str) {
        this.f95901w = str;
    }

    public final void setCheckPrivilege(@Nullable OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse) {
        this.f95879f0 = onePrepaidRegisterTCheckPrivilegeResponse;
    }

    public final void setCheckSimStockError(@Nullable ErrorCollection errorCollection) {
        this.f95844C = errorCollection;
    }

    public final void setCheckSimStockResponse(@Nullable SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        this.f95895q = simTermSukCheckSimStockResponse;
    }

    public final void setConsentNonTelcoResponse(@Nullable ConsentNonTelcoResponse consentNonTelcoResponse) {
        this.f95903y = consentNonTelcoResponse;
    }

    public final void setConsentVersionLabel(@Nullable String str) {
        this.f95904z = str;
    }

    public final void setCurrentFormType(@NotNull UpPassFormType upPassFormType) {
        Intrinsics.checkNotNullParameter(upPassFormType, "<set-?>");
        this.f95889k0 = upPassFormType;
    }

    public final void setCutSimStockError(@Nullable ErrorCollection errorCollection) {
        this.f95856O = errorCollection;
    }

    public final void setCutSimStockResponse(@Nullable CutSimStockResponse cutSimStockResponse) {
        this.f95855N = cutSimStockResponse;
    }

    public final void setDisplaySubscriberNumber(@Nullable String str) {
        this.f95900v = str;
    }

    public final void setFaceCompareResponseSubmit(@Nullable FaceCompareResponseSubmit faceCompareResponseSubmit) {
        this.f95887j0 = faceCompareResponseSubmit;
    }

    public final void setFaceNotFoundCountBeforeManualAccept(@Nullable FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept) {
        this.f95890l = faceNotFoundCountBeforeManualAccept;
    }

    public final void setFaceRecognitionByPass(@Nullable FaceRecognitionByPass faceRecognitionByPass) {
        this.f95888k = faceRecognitionByPass;
    }

    public final void setFamilySimPostpaidNumber(@Nullable String str) {
        this.f95852K = str;
    }

    public final void setFeatureCode(@Nullable String str) {
        this.f95872c = str;
    }

    public final void setFromSmartCard(boolean z) {
        this.f95894p = z;
    }

    public final void setGetAuthorization(@Nullable OnePrepaidAuthorizationResponse.Data data) {
        this.f95882h = data;
    }

    public final void setIdCard(@Nullable String str) {
        this.f95874d = str;
    }

    public final void setImageName(@Nullable String str) {
        this.f95880g = str;
    }

    public final void setImageSignatureConsentXSim(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f95850I = str;
    }

    public final void setItemId(@Nullable String str) {
        this.f95871b0 = str;
    }

    public final void setKYC(boolean z) {
        this.f95899u = z;
    }

    public final void setKycAttemp(int i) {
        this.f95898t = i;
    }

    public final void setKycAttempted(int i) {
        this.f95896r = i;
    }

    public final void setLastOptionalImageName(@Nullable Integer num) {
        this.f95886j = num;
    }

    public final void setNontelcoConsentType(@Nullable String str) {
        this.f95859R = str;
    }

    public final void setOcrBirthDate(@Nullable String str) {
        this.f95875d0 = str;
    }

    public final void setOcrIdCard(@Nullable String str) {
        this.f95876e = str;
    }

    public final void setOptionalImages(@Nullable List<String> list) {
        this.f95868a = list;
    }

    public final void setOrderId(@Nullable String str) {
        this.f95864W = str;
    }

    public final void setPermissions(@Nullable List<OnePermissionsItem> list) {
        this.f95861T = list;
    }

    public final void setPostcode(@Nullable String str) {
        this.f95845D = str;
    }

    public final void setPostcodeSequenceString(@Nullable String str) {
        this.f95846E = str;
    }

    public final void setPrepaidAssignPoolingResponse(@Nullable OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse) {
        this.f95851J = onePrepaidAssignPoolingResponse;
    }

    public final void setPrepaidValidateIdCardResponse(@Nullable OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse) {
        this.f95893o = onePrepaidValidateIdCardResponse;
    }

    public final void setQueryTransactionResponse(@Nullable QueryTransactionResponse.Data data) {
        this.f95881g0 = data;
    }

    public final void setReRegisterFlag(boolean z) {
        this.f95866Y = z;
    }

    public final void setRegisterRequest(@Nullable MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest) {
        this.f95853L = mrtrPrepaidRegisterRequest;
    }

    public final void setRegisterResponse(@Nullable OnePrepaidRegisterResponse onePrepaidRegisterResponse) {
        this.f95854M = onePrepaidRegisterResponse;
    }

    public final void setRegisterType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f95902x = str;
    }

    public final void setScabData(@Nullable OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse) {
        this.f95873c0 = onePrepaidRegisterTGetScabResponse;
    }

    public final void setSelectedCampaign(@Nullable CampaignItem campaignItem) {
        this.f95869a0 = campaignItem;
    }

    public final void setSuccessType(int i) {
        this.f95842A = i;
    }

    public final void setTotalAmount(int i) {
        this.f95843B = i;
    }

    public final void setTrackingId(@Nullable String str) {
        this.f95865X = str;
    }

    public final void setUpPassFormCompareResult(@Nullable UpPassFormResult upPassFormResult) {
        this.f95885i0 = upPassFormResult;
    }

    public final void setUpPassFormResult(@Nullable UpPassFormResult upPassFormResult) {
        this.f95883h0 = upPassFormResult;
    }

    public final void setValidateBarcodeData(@Nullable OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData) {
        this.f95884i = validateBarcodeData;
    }

    public final void setValidateProfileResponse(@Nullable OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        this.f95863V = oneChangeOwnerValidateProfileResponse;
    }

    public final void setValidateSimTrueResponse(@Nullable OneValidateSimTrueResponse oneValidateSimTrueResponse) {
        this.f95862U = oneValidateSimTrueResponse;
    }

    public final void setXSIMConsentRequest(@NotNull XSIMConsentRequest xSIMConsentRequest) {
        Intrinsics.checkNotNullParameter(xSIMConsentRequest, "<set-?>");
        this.f95847F = xSIMConsentRequest;
    }

    public final void setXSIMConsentResponse(@Nullable XSIMConsentResponse xSIMConsentResponse) {
        this.f95848G = xSIMConsentResponse;
    }

    public final void setXSIMConsentResponsePreview(@Nullable XSIMConsentResponse xSIMConsentResponse) {
        this.f95849H = xSIMConsentResponse;
    }

    @NotNull
    public String toString() {
        List list = this.f95868a;
        List list2 = this.f95870b;
        String str = this.f95872c;
        String str2 = this.f95874d;
        String str3 = this.f95876e;
        String str4 = this.f95878f;
        String str5 = this.f95880g;
        OnePrepaidAuthorizationResponse.Data data = this.f95882h;
        OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData = this.f95884i;
        Integer num = this.f95886j;
        FaceRecognitionByPass faceRecognitionByPass = this.f95888k;
        FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept = this.f95890l;
        IdCardInformationCollection idCardInformationCollection = this.f95891m;
        CardCollection cardCollection = this.f95892n;
        OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse = this.f95893o;
        boolean z = this.f95894p;
        SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse = this.f95895q;
        int i = this.f95896r;
        int i2 = this.f95897s;
        int i3 = this.f95898t;
        boolean z2 = this.f95899u;
        String str6 = this.f95900v;
        String str7 = this.f95901w;
        String str8 = this.f95902x;
        ConsentNonTelcoResponse consentNonTelcoResponse = this.f95903y;
        String str9 = this.f95904z;
        int i4 = this.f95842A;
        int i5 = this.f95843B;
        ErrorCollection errorCollection = this.f95844C;
        String str10 = this.f95845D;
        String str11 = this.f95846E;
        XSIMConsentRequest xSIMConsentRequest = this.f95847F;
        XSIMConsentResponse xSIMConsentResponse = this.f95848G;
        XSIMConsentResponse xSIMConsentResponse2 = this.f95849H;
        String str12 = this.f95850I;
        OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse = this.f95851J;
        String str13 = this.f95852K;
        MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest = this.f95853L;
        OnePrepaidRegisterResponse onePrepaidRegisterResponse = this.f95854M;
        CutSimStockResponse cutSimStockResponse = this.f95855N;
        ErrorCollection errorCollection2 = this.f95856O;
        ErrorCollection errorCollection3 = this.f95857P;
        ErrorCollection errorCollection4 = this.f95858Q;
        String str14 = this.f95859R;
        OneActivateResponse oneActivateResponse = this.f95860S;
        List list3 = this.f95861T;
        OneValidateSimTrueResponse oneValidateSimTrueResponse = this.f95862U;
        OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse = this.f95863V;
        String str15 = this.f95864W;
        String str16 = this.f95865X;
        boolean z3 = this.f95866Y;
        List list4 = this.f95867Z;
        CampaignItem campaignItem = this.f95869a0;
        String str17 = this.f95871b0;
        OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse = this.f95873c0;
        String str18 = this.f95875d0;
        Boolean bool = this.f95877e0;
        OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse = this.f95879f0;
        QueryTransactionResponse.Data data2 = this.f95881g0;
        UpPassFormResult upPassFormResult = this.f95883h0;
        UpPassFormResult upPassFormResult2 = this.f95885i0;
        FaceCompareResponseSubmit faceCompareResponseSubmit = this.f95887j0;
        UpPassFormType upPassFormType = this.f95889k0;
        return "OnePrepaidModel(optionalImages=" + list + ", attachmentNames=" + list2 + ", featureCode=" + str + ", idCard=" + str2 + ", ocrIdCard=" + str3 + ", cameraBirthDate=" + str4 + ", imageName=" + str5 + ", getAuthorization=" + data + ", validateBarcodeData=" + validateBarcodeData + ", lastOptionalImageName=" + num + ", faceRecognitionByPass=" + faceRecognitionByPass + ", faceNotFoundCountBeforeManualAccept=" + faceNotFoundCountBeforeManualAccept + ", cardInformation=" + idCardInformationCollection + ", card=" + cardCollection + ", prepaidValidateIdCardResponse=" + onePrepaidValidateIdCardResponse + ", isFromSmartCard=" + z + ", checkSimStockResponse=" + simTermSukCheckSimStockResponse + ", kycAttempted=" + i + ", attempted=" + i2 + ", kycAttemp=" + i3 + ", isKYC=" + z2 + ", displaySubscriberNumber=" + str6 + ", cardType=" + str7 + ", registerType=" + str8 + ", consentNonTelcoResponse=" + consentNonTelcoResponse + ", consentVersionLabel=" + str9 + ", successType=" + i4 + ", totalAmount=" + i5 + ", checkSimStockError=" + errorCollection + ", postcode=" + str10 + ", postcodeSequenceString=" + str11 + ", xSIMConsentRequest=" + xSIMConsentRequest + ", xSIMConsentResponse=" + xSIMConsentResponse + ", xSIMConsentResponsePreview=" + xSIMConsentResponse2 + ", imageSignatureConsentXSim=" + str12 + ", prepaidAssignPoolingResponse=" + onePrepaidAssignPoolingResponse + ", familySimPostpaidNumber=" + str13 + ", registerRequest=" + mrtrPrepaidRegisterRequest + ", registerResponse=" + onePrepaidRegisterResponse + ", cutSimStockResponse=" + cutSimStockResponse + ", cutSimStockError=" + errorCollection2 + ", assignPoolingError=" + errorCollection3 + ", activationError=" + errorCollection4 + ", nontelcoConsentType=" + str14 + ", activationResponse=" + oneActivateResponse + ", permissions=" + list3 + ", validateSimTrueResponse=" + oneValidateSimTrueResponse + ", validateProfileResponse=" + oneChangeOwnerValidateProfileResponse + ", orderId=" + str15 + ", trackingId=" + str16 + ", reRegisterFlag=" + z3 + ", campaignList=" + list4 + ", selectedCampaign=" + campaignItem + ", itemId=" + str17 + ", scabData=" + onePrepaidRegisterTGetScabResponse + ", ocrBirthDate=" + str18 + ", campaignFlag=" + bool + ", checkPrivilege=" + onePrepaidRegisterTCheckPrivilegeResponse + ", queryTransactionResponse=" + data2 + ", upPassFormResult=" + upPassFormResult + ", upPassFormCompareResult=" + upPassFormResult2 + ", faceCompareResponseSubmit=" + faceCompareResponseSubmit + ", currentFormType=" + upPassFormType + ")";
    }

    public OnePrepaidModel(@Nullable List<String> list, @Nullable List<String> list2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable OnePrepaidAuthorizationResponse.Data data, @Nullable OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData, @Nullable Integer num, @Nullable FaceRecognitionByPass faceRecognitionByPass, @Nullable FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable CardCollection cardCollection, @Nullable OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse, boolean z, @Nullable SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse, int i, int i2, int i3, boolean z2, @Nullable String str6, @Nullable String str7, @NotNull String registerType, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, @Nullable String str8, int i4, int i5, @Nullable ErrorCollection errorCollection, @Nullable String str9, @Nullable String str10, @NotNull XSIMConsentRequest xSIMConsentRequest, @Nullable XSIMConsentResponse xSIMConsentResponse, @Nullable XSIMConsentResponse xSIMConsentResponse2, @NotNull String imageSignatureConsentXSim, @Nullable OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse, @Nullable String str11, @Nullable MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, @Nullable OnePrepaidRegisterResponse onePrepaidRegisterResponse, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable ErrorCollection errorCollection2, @Nullable ErrorCollection errorCollection3, @Nullable ErrorCollection errorCollection4, @Nullable String str12, @Nullable OneActivateResponse oneActivateResponse, @Nullable List<OnePermissionsItem> list3, @Nullable OneValidateSimTrueResponse oneValidateSimTrueResponse, @Nullable OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse, @Nullable String str13, @Nullable String str14, boolean z3, @Nullable List<CampaignItem> list4, @Nullable CampaignItem campaignItem, @Nullable String str15, @Nullable OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse, @Nullable String str16, @Nullable Boolean bool, @Nullable OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse, @Nullable QueryTransactionResponse.Data data2, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @Nullable FaceCompareResponseSubmit faceCompareResponseSubmit, @NotNull UpPassFormType currentFormType) {
        Intrinsics.checkNotNullParameter(registerType, "registerType");
        Intrinsics.checkNotNullParameter(xSIMConsentRequest, "xSIMConsentRequest");
        Intrinsics.checkNotNullParameter(imageSignatureConsentXSim, "imageSignatureConsentXSim");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        this.f95868a = list;
        this.f95870b = list2;
        this.f95872c = str;
        this.f95874d = str2;
        this.f95876e = str3;
        this.f95878f = str4;
        this.f95880g = str5;
        this.f95882h = data;
        this.f95884i = validateBarcodeData;
        this.f95886j = num;
        this.f95888k = faceRecognitionByPass;
        this.f95890l = faceNotFoundCountBeforeManualAccept;
        this.f95891m = idCardInformationCollection;
        this.f95892n = cardCollection;
        this.f95893o = onePrepaidValidateIdCardResponse;
        this.f95894p = z;
        this.f95895q = simTermSukCheckSimStockResponse;
        this.f95896r = i;
        this.f95897s = i2;
        this.f95898t = i3;
        this.f95899u = z2;
        this.f95900v = str6;
        this.f95901w = str7;
        this.f95902x = registerType;
        this.f95903y = consentNonTelcoResponse;
        this.f95904z = str8;
        this.f95842A = i4;
        this.f95843B = i5;
        this.f95844C = errorCollection;
        this.f95845D = str9;
        this.f95846E = str10;
        this.f95847F = xSIMConsentRequest;
        this.f95848G = xSIMConsentResponse;
        this.f95849H = xSIMConsentResponse2;
        this.f95850I = imageSignatureConsentXSim;
        this.f95851J = onePrepaidAssignPoolingResponse;
        this.f95852K = str11;
        this.f95853L = mrtrPrepaidRegisterRequest;
        this.f95854M = onePrepaidRegisterResponse;
        this.f95855N = cutSimStockResponse;
        this.f95856O = errorCollection2;
        this.f95857P = errorCollection3;
        this.f95858Q = errorCollection4;
        this.f95859R = str12;
        this.f95860S = oneActivateResponse;
        this.f95861T = list3;
        this.f95862U = oneValidateSimTrueResponse;
        this.f95863V = oneChangeOwnerValidateProfileResponse;
        this.f95864W = str13;
        this.f95865X = str14;
        this.f95866Y = z3;
        this.f95867Z = list4;
        this.f95869a0 = campaignItem;
        this.f95871b0 = str15;
        this.f95873c0 = onePrepaidRegisterTGetScabResponse;
        this.f95875d0 = str16;
        this.f95877e0 = bool;
        this.f95879f0 = onePrepaidRegisterTCheckPrivilegeResponse;
        this.f95881g0 = data2;
        this.f95883h0 = upPassFormResult;
        this.f95885i0 = upPassFormResult2;
        this.f95887j0 = faceCompareResponseSubmit;
        this.f95889k0 = currentFormType;
    }

    public /* synthetic */ OnePrepaidModel(List list, List list2, String str, String str2, String str3, String str4, String str5, OnePrepaidAuthorizationResponse.Data data, OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData, Integer num, FaceRecognitionByPass faceRecognitionByPass, FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, IdCardInformationCollection idCardInformationCollection, CardCollection cardCollection, OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse, boolean z, SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse, int i, int i2, int i3, boolean z2, String str6, String str7, String str8, ConsentNonTelcoResponse consentNonTelcoResponse, String str9, int i4, int i5, ErrorCollection errorCollection, String str10, String str11, XSIMConsentRequest xSIMConsentRequest, XSIMConsentResponse xSIMConsentResponse, XSIMConsentResponse xSIMConsentResponse2, String str12, OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse, String str13, MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, OnePrepaidRegisterResponse onePrepaidRegisterResponse, CutSimStockResponse cutSimStockResponse, ErrorCollection errorCollection2, ErrorCollection errorCollection3, ErrorCollection errorCollection4, String str14, OneActivateResponse oneActivateResponse, List list3, OneValidateSimTrueResponse oneValidateSimTrueResponse, OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse, String str15, String str16, boolean z3, List list4, CampaignItem campaignItem, String str17, OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse, String str18, Boolean bool, OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse, QueryTransactionResponse.Data data2, UpPassFormResult upPassFormResult, UpPassFormResult upPassFormResult2, FaceCompareResponseSubmit faceCompareResponseSubmit, UpPassFormType upPassFormType, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? new ArrayList() : list, (i6 & 2) != 0 ? new ArrayList() : list2, (i6 & 4) != 0 ? null : str, (i6 & 8) != 0 ? null : str2, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? null : str4, (i6 & 64) != 0 ? null : str5, (i6 & 128) != 0 ? null : data, (i6 & 256) != 0 ? null : validateBarcodeData, (i6 & 512) != 0 ? null : num, (i6 & 1024) != 0 ? null : faceRecognitionByPass, (i6 & 2048) != 0 ? null : faceNotFoundCountBeforeManualAccept, (i6 & 4096) != 0 ? null : idCardInformationCollection, (i6 & 8192) != 0 ? null : cardCollection, (i6 & 16384) != 0 ? null : onePrepaidValidateIdCardResponse, (i6 & 32768) != 0 ? false : z, (i6 & 65536) != 0 ? null : simTermSukCheckSimStockResponse, (i6 & 131072) != 0 ? 0 : i, (i6 & 262144) != 0 ? 0 : i2, (i6 & 524288) != 0 ? 0 : i3, (i6 & 1048576) != 0 ? false : z2, (i6 & 2097152) != 0 ? null : str6, (i6 & 4194304) != 0 ? null : str7, (i6 & 8388608) != 0 ? PrepaidRegisterType.REGISTER_ONLY : str8, (i6 & 16777216) != 0 ? null : consentNonTelcoResponse, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str9, (i6 & 67108864) != 0 ? 0 : i4, (i6 & 134217728) != 0 ? 0 : i5, (i6 & 268435456) != 0 ? null : errorCollection, (i6 & PKIFailureInfo.duplicateCertReq) != 0 ? null : str10, (i6 & 1073741824) != 0 ? null : str11, (i6 & Integer.MIN_VALUE) != 0 ? new XSIMConsentRequest(null, null, null, null, null, null, null, null, null, null, null, 2047, null) : xSIMConsentRequest, (i7 & 1) != 0 ? null : xSIMConsentResponse, (i7 & 2) != 0 ? null : xSIMConsentResponse2, (i7 & 4) != 0 ? "" : str12, (i7 & 8) != 0 ? null : onePrepaidAssignPoolingResponse, (i7 & 16) != 0 ? null : str13, (i7 & 32) != 0 ? null : mrtrPrepaidRegisterRequest, (i7 & 64) != 0 ? null : onePrepaidRegisterResponse, (i7 & 128) != 0 ? null : cutSimStockResponse, (i7 & 256) != 0 ? null : errorCollection2, (i7 & 512) != 0 ? null : errorCollection3, (i7 & 1024) != 0 ? null : errorCollection4, (i7 & 2048) != 0 ? "" : str14, (i7 & 4096) != 0 ? null : oneActivateResponse, (i7 & 8192) != 0 ? null : list3, (i7 & 16384) != 0 ? null : oneValidateSimTrueResponse, (i7 & 32768) != 0 ? null : oneChangeOwnerValidateProfileResponse, (i7 & 65536) != 0 ? null : str15, (i7 & 131072) != 0 ? null : str16, (i7 & 262144) == 0 ? z3 : false, (i7 & 524288) != 0 ? null : list4, (i7 & 1048576) != 0 ? null : campaignItem, (i7 & 2097152) != 0 ? null : str17, (i7 & 4194304) != 0 ? null : onePrepaidRegisterTGetScabResponse, (i7 & 8388608) != 0 ? null : str18, (i7 & 16777216) != 0 ? null : bool, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : onePrepaidRegisterTCheckPrivilegeResponse, (i7 & 67108864) != 0 ? null : data2, (i7 & 134217728) != 0 ? null : upPassFormResult, (i7 & 268435456) != 0 ? null : upPassFormResult2, (i7 & PKIFailureInfo.duplicateCertReq) != 0 ? null : faceCompareResponseSubmit, (i7 & 1073741824) != 0 ? new UpPassFormType.Ocr(null, null, false, null, 15, null) : upPassFormType);
    }
}