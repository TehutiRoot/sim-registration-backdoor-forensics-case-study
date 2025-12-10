package th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleValidateStockData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.PostpaidValidateConsentViaAPIGWData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.PricePlanData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.PricePlansStatus;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.PDFFormData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.CampaignProductCategoryItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCustomerPreverifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateAllowProtectionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExistingCustomerScoreResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExtraAdvancePaymentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ProductMasterInfoItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ValidateBlacklist3OperData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ValidateSerialByDealer;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidatePre2PostTrueCompanyDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostVerifySubscriberPreToPostData;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OneVerifyPrivilegeSubscribeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;
import th.p047co.dtac.android.dtacone.model.blacklist.ExtraAdvanceMasterInformation;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000û\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bí\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0005\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0014\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00106\u001a\u00020\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u0014\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010F\u001a\u00020\b\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\u001c\b\u0002\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010Pj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`Q\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010T\u001a\u00020\b\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010V\u001a\u0012\u0012\u0004\u0012\u00020W0Pj\b\u0012\u0004\u0012\u00020W`Q\u0012\b\b\u0002\u0010X\u001a\u00020\u0003\u0012\b\b\u0002\u0010Y\u001a\u00020\b\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010[\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010_¢\u0006\u0002\u0010`J\n\u0010\u008e\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0002\u001a\u00020\bHÆ\u0003J\n\u0010\u0090\u0002\u001a\u00020\bHÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0012\u0010\u0093\u0002\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0010\u0010\u0094\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017HÆ\u0003J\f\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0010\u0010\u0098\u0002\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017HÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010#HÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010%HÆ\u0003J\u0012\u0010\u009d\u0002\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0014HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\bHÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u000100HÆ\u0003J\n\u0010¤\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010©\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010ª\u0002\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010>HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\n\u0010¯\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010BHÆ\u0003J\u0012\u0010±\u0002\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u0014HÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010³\u0002\u001a\u00020\bHÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010HHÆ\u0003J\f\u0010µ\u0002\u001a\u0004\u0018\u00010JHÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u00010LHÆ\u0003J\f\u0010·\u0002\u001a\u0004\u0018\u00010NHÆ\u0003J\u001e\u0010¸\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010Pj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`QHÆ\u0003J\u0012\u0010¹\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0003\u0010Ô\u0001J\n\u0010º\u0002\u001a\u00020\bHÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¼\u0002\u001a\u00020\bHÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001a\u0010¾\u0002\u001a\u0012\u0012\u0004\u0012\u00020W0Pj\b\u0012\u0004\u0012\u00020W`QHÆ\u0003J\n\u0010¿\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0002\u001a\u00020\bHÆ\u0003J\f\u0010Á\u0002\u001a\u0004\u0018\u00010[HÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010]HÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010_HÆ\u0003J\n\u0010Ä\u0002\u001a\u00020\bHÆ\u0003J\n\u0010Å\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0002\u001a\u00020\u0003HÆ\u0003Jà\u0005\u0010È\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00142\b\b\u0002\u0010(\u001a\u00020\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00106\u001a\u00020\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u00142\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010F\u001a\u00020\b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\u001c\b\u0002\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010Pj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010T\u001a\u00020\b2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010V\u001a\u0012\u0012\u0004\u0012\u00020W0Pj\b\u0012\u0004\u0012\u00020W`Q2\b\b\u0002\u0010X\u001a\u00020\u00032\b\b\u0002\u0010Y\u001a\u00020\b2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010_HÆ\u0001¢\u0006\u0003\u0010É\u0002J\u0015\u0010Ê\u0002\u001a\u00020\b2\t\u0010Ë\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010Ì\u0002\u001a\u00030Í\u0002HÖ\u0001J\n\u0010Î\u0002\u001a\u00020\u0003HÖ\u0001R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR*\u0010V\u001a\u0012\u0012\u0004\u0012\u00020W0Pj\b\u0012\u0004\u0012\u00020W`QX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001c\u0010S\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010r\"\u0004\bv\u0010tR\u001c\u0010U\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010r\"\u0004\bx\u0010tR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010r\"\u0004\bz\u0010tR\u001c\u0010^\u001a\u0004\u0018\u00010_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001b\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010r\"\u0005\b\u0080\u0001\u0010tR \u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R \u00102\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010r\"\u0005\b\u008a\u0001\u0010tR\u001c\u0010X\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010r\"\u0005\b\u008c\u0001\u0010tR \u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010r\"\u0005\b\u0092\u0001\u0010tR\u001c\u00106\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010r\"\u0005\b\u0094\u0001\u0010tR0\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010Pj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`QX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010n\"\u0005\b\u0096\u0001\u0010pR\u001c\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010r\"\u0005\b\u0098\u0001\u0010tR\u001d\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\t\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001d\u0010F\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bF\u0010\u0099\u0001\"\u0006\b\u009c\u0001\u0010\u009b\u0001R\u001d\u0010Y\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bY\u0010\u0099\u0001\"\u0006\b\u009d\u0001\u0010\u009b\u0001R\u001d\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0007\u0010\u0099\u0001\"\u0006\b\u009e\u0001\u0010\u009b\u0001R\u001d\u0010T\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bT\u0010\u0099\u0001\"\u0006\b\u009f\u0001\u0010\u009b\u0001R\u001d\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u000e\u0010\u0099\u0001\"\u0006\b \u0001\u0010\u009b\u0001R\u001d\u0010(\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b(\u0010\u0099\u0001\"\u0006\b¡\u0001\u0010\u009b\u0001R\u001d\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\r\u0010\u0099\u0001\"\u0006\b¢\u0001\u0010\u009b\u0001R \u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R \u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010r\"\u0005\b¬\u0001\u0010tR \u00101\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0001\u0010\u0086\u0001\"\u0006\b®\u0001\u0010\u0088\u0001R\u001e\u0010E\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010r\"\u0005\b°\u0001\u0010tR&\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R \u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¹\u0001\u0010²\u0001\"\u0006\bº\u0001\u0010´\u0001R \u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R \u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R \u0010I\u001a\u0004\u0018\u00010JX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R&\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÇ\u0001\u0010²\u0001\"\u0006\bÈ\u0001\u0010´\u0001R \u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R \u0010)\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÑ\u0001\u0010²\u0001\"\u0006\bÒ\u0001\u0010´\u0001R#\u0010R\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0015\n\u0003\u0010×\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R \u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\u001e\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u0010r\"\u0005\bÝ\u0001\u0010tR\u001e\u0010.\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0001\u0010r\"\u0005\bß\u0001\u0010tR \u0010\\\u001a\u0004\u0018\u00010]X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R \u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R \u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R \u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R \u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R \u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R \u0010Z\u001a\u0004\u0018\u00010[X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R \u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R \u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0002\u0010²\u0001\"\u0006\b\u0085\u0002\u0010´\u0001R \u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R \u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002¨\u0006Ï\u0002"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleTrueModel;", "", "companyCode", "", "imeiResult", "dtrCode", "deviceModel", "isFromScanIMEI", "", "isChangeIMEI", "idCardType", "otpCode", "custImage", "isSmartCard", "isOpenMarket", "pricePlansResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlanData;", "pricePlansDetailStatusResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlansStatus;", "pricePlansDetailListResponse", "", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "referenceDocListFileName", "", "selectedMaterial", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;", "validateSerialByDealer", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateSerialByDealer;", "campaignTrueItem", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/CampaignProductCategoryItem;", "verificationList", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest$VerificationItem;", "campaignSaleTypeResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse$Data;", "mailingAddress", "Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "idCardInformationCollection", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "propositionList", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/DataItem;", "isSkipPropositionFlg", "propositionTrueItem", "propositionRebateResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;", "validateConsentResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;", "transactionId", "pre2postPropositionTrueSelectedItem", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "packageTrueSelectedItem", "deviceSalePackageTrueSelectedItem", "authorizationData", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "idNumber", "validateStockData", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleValidateStockData;", "validateExistingData", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;", "validateBlacklist3OperData", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateBlacklist3OperData;", "validateExtraAdvancePaymentData", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentResponse;", "validateAllowProtectionData", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse;", "verifyPrivilegeSubscriber", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OneVerifyPrivilegeSubscribeResponse;", "pdfForms", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/PDFFormData;", "pdfData", "isCheckBlackList", "deviceSaleData", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;", "productPriceResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;", "verifySubscriberPreToPostData", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;", "itemProtectSelected", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse$Data$TrueProtectPackage;", "imageListFromP2P", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "requireFaceRecognition", "confidentRatio", "isKYC", "consentId", "checkBlackListData", "Lth/co/dtac/android/dtacone/model/blacklist/ExtraAdvanceMasterInformation;", "featureCode", "isContract", "validatePre2PostResponse", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;", "upPassFormResult", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "customerPreverifyResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyResponse$Data;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlanData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlansStatus;Ljava/util/List;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateSerialByDealer;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/CampaignProductCategoryItem;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse$Data;Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/util/List;ZLth/co/dtac/android/dtacone/model/appOne/postpaid/DataItem;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleValidateStockData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateBlacklist3OperData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentResponse;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OneVerifyPrivilegeSubscribeResponse;Ljava/util/List;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse$Data$TrueProtectPackage;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyResponse$Data;)V", "getAuthorizationData", "()Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", "setAuthorizationData", "(Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;)V", "getCampaignSaleTypeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse$Data;", "setCampaignSaleTypeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse$Data;)V", "getCampaignTrueItem", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/CampaignProductCategoryItem;", "setCampaignTrueItem", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/CampaignProductCategoryItem;)V", "getCheckBlackListData", "()Ljava/util/ArrayList;", "setCheckBlackListData", "(Ljava/util/ArrayList;)V", "getCompanyCode", "()Ljava/lang/String;", "setCompanyCode", "(Ljava/lang/String;)V", "getConfidentRatio", "setConfidentRatio", "getConsentId", "setConsentId", "getCustImage", "setCustImage", "getCustomerPreverifyResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyResponse$Data;", "setCustomerPreverifyResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyResponse$Data;)V", "getDeviceModel", "setDeviceModel", "getDeviceSaleData", "()Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;", "setDeviceSaleData", "(Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;)V", "getDeviceSalePackageTrueSelectedItem", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "setDeviceSalePackageTrueSelectedItem", "(Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;)V", "getDtrCode", "setDtrCode", "getFeatureCode", "setFeatureCode", "getIdCardInformationCollection", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setIdCardInformationCollection", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getIdCardType", "setIdCardType", "getIdNumber", "setIdNumber", "getImageListFromP2P", "setImageListFromP2P", "getImeiResult", "setImeiResult", "()Z", "setChangeIMEI", "(Z)V", "setCheckBlackList", "setContract", "setFromScanIMEI", "setKYC", "setOpenMarket", "setSkipPropositionFlg", "setSmartCard", "getItemProtectSelected", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse$Data$TrueProtectPackage;", "setItemProtectSelected", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse$Data$TrueProtectPackage;)V", "getMailingAddress", "()Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "setMailingAddress", "(Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;)V", "getOtpCode", "setOtpCode", "getPackageTrueSelectedItem", "setPackageTrueSelectedItem", "getPdfData", "setPdfData", "getPdfForms", "()Ljava/util/List;", "setPdfForms", "(Ljava/util/List;)V", "getPre2postPropositionTrueSelectedItem", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "setPre2postPropositionTrueSelectedItem", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;)V", "getPricePlansDetailListResponse", "setPricePlansDetailListResponse", "getPricePlansDetailStatusResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlansStatus;", "setPricePlansDetailStatusResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlansStatus;)V", "getPricePlansResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlanData;", "setPricePlansResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlanData;)V", "getProductPriceResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;", "setProductPriceResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;)V", "getPropositionList", "setPropositionList", "getPropositionRebateResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;", "setPropositionRebateResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;)V", "getPropositionTrueItem", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/DataItem;", "setPropositionTrueItem", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/DataItem;)V", "getReferenceDocListFileName", "setReferenceDocListFileName", "getRequireFaceRecognition", "()Ljava/lang/Boolean;", "setRequireFaceRecognition", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSelectedMaterial", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;", "setSelectedMaterial", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;)V", "getSubscriberNumber", "setSubscriberNumber", "getTransactionId", "setTransactionId", "getUpPassFormResult", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "setUpPassFormResult", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;)V", "getValidateAllowProtectionData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse;", "setValidateAllowProtectionData", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse;)V", "getValidateBlacklist3OperData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateBlacklist3OperData;", "setValidateBlacklist3OperData", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateBlacklist3OperData;)V", "getValidateConsentResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;", "setValidateConsentResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;)V", "getValidateExistingData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;", "setValidateExistingData", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;)V", "getValidateExtraAdvancePaymentData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentResponse;", "setValidateExtraAdvancePaymentData", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentResponse;)V", "getValidatePre2PostResponse", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;", "setValidatePre2PostResponse", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;)V", "getValidateSerialByDealer", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateSerialByDealer;", "setValidateSerialByDealer", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateSerialByDealer;)V", "getValidateStockData", "()Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleValidateStockData;", "setValidateStockData", "(Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleValidateStockData;)V", "getVerificationList", "setVerificationList", "getVerifyPrivilegeSubscriber", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OneVerifyPrivilegeSubscribeResponse;", "setVerifyPrivilegeSubscriber", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OneVerifyPrivilegeSubscribeResponse;)V", "getVerifySubscriberPreToPostData", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;", "setVerifySubscriberPreToPostData", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlanData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/PricePlansStatus;Ljava/util/List;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateSerialByDealer;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/CampaignProductCategoryItem;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse$Data;Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/util/List;ZLth/co/dtac/android/dtacone/model/appOne/postpaid/DataItem;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleValidateStockData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateBlacklist3OperData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentResponse;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OneVerifyPrivilegeSubscribeResponse;Ljava/util/List;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse$Data$TrueProtectPackage;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyResponse$Data;)Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleTrueModel;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleTrueModel */
/* loaded from: classes8.dex */
public final class OneDeviceSaleTrueModel {
    public static final int $stable = 8;
    @Nullable
    private OneDeviceSaleAuthorizationData authorizationData;
    @Nullable
    private OneCampaignSaleTypeResponse.Data campaignSaleTypeResponse;
    @Nullable
    private CampaignProductCategoryItem campaignTrueItem;
    @NotNull
    private ArrayList<ExtraAdvanceMasterInformation> checkBlackListData;
    @NotNull
    private String companyCode;
    @Nullable
    private String confidentRatio;
    @Nullable
    private String consentId;
    @NotNull
    private String custImage;
    @Nullable
    private OneCustomerPreverifyResponse.Data customerPreverifyResponse;
    @NotNull
    private String deviceModel;
    @Nullable
    private OneDeviceSaleData deviceSaleData;
    @Nullable
    private PriceplanListItem deviceSalePackageTrueSelectedItem;
    @NotNull
    private String dtrCode;
    @NotNull
    private String featureCode;
    @Nullable
    private IdCardInformationCollection idCardInformationCollection;
    @NotNull
    private String idCardType;
    @NotNull
    private String idNumber;
    @Nullable
    private ArrayList<String> imageListFromP2P;
    @NotNull
    private String imeiResult;
    private boolean isChangeIMEI;
    private boolean isCheckBlackList;
    private boolean isContract;
    private boolean isFromScanIMEI;
    private boolean isKYC;
    private boolean isOpenMarket;
    private boolean isSkipPropositionFlg;
    private boolean isSmartCard;
    @Nullable
    private OneValidateAllowProtectionResponse.Data.TrueProtectPackage itemProtectSelected;
    @Nullable
    private OneAddressMailingData mailingAddress;
    @NotNull
    private String otpCode;
    @Nullable
    private PriceplanListItem packageTrueSelectedItem;
    @Nullable
    private String pdfData;
    @Nullable
    private List<PDFFormData> pdfForms;
    @Nullable
    private PropositionListItem pre2postPropositionTrueSelectedItem;
    @Nullable
    private List<PriceplanListItem> pricePlansDetailListResponse;
    @Nullable
    private PricePlansStatus pricePlansDetailStatusResponse;
    @Nullable
    private PricePlanData pricePlansResponse;
    @Nullable
    private OneProductPriceResponse.Data productPriceResponse;
    @Nullable
    private List<DataItem> propositionList;
    @Nullable
    private OnePropositionRebateResponse.Data propositionRebateResponse;
    @Nullable
    private DataItem propositionTrueItem;
    @NotNull
    private List<String> referenceDocListFileName;
    @Nullable
    private Boolean requireFaceRecognition;
    @Nullable
    private ProductMasterInfoItem selectedMaterial;
    @Nullable
    private String subscriberNumber;
    @Nullable
    private String transactionId;
    @Nullable
    private UpPassFormResult upPassFormResult;
    @Nullable
    private OneValidateAllowProtectionResponse validateAllowProtectionData;
    @Nullable
    private ValidateBlacklist3OperData validateBlacklist3OperData;
    @Nullable
    private PostpaidValidateConsentViaAPIGWData validateConsentResponse;
    @Nullable
    private OneValidateExistingCustomerScoreResponse validateExistingData;
    @Nullable
    private OneValidateExtraAdvancePaymentResponse validateExtraAdvancePaymentData;
    @Nullable
    private OnePre2PostValidatePre2PostTrueCompanyDataResponse validatePre2PostResponse;
    @Nullable
    private ValidateSerialByDealer validateSerialByDealer;
    @Nullable
    private OneDeviceSaleValidateStockData validateStockData;
    @NotNull
    private List<OneCheckPrivilegeRequest.VerificationItem> verificationList;
    @Nullable
    private OneVerifyPrivilegeSubscribeResponse verifyPrivilegeSubscriber;
    @Nullable
    private OnePre2PostVerifySubscriberPreToPostData verifySubscriberPreToPostData;

    public OneDeviceSaleTrueModel() {
        this(null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, -1, 67108863, null);
    }

    @NotNull
    public final String component1() {
        return this.companyCode;
    }

    public final boolean component10() {
        return this.isSmartCard;
    }

    public final boolean component11() {
        return this.isOpenMarket;
    }

    @Nullable
    public final PricePlanData component12() {
        return this.pricePlansResponse;
    }

    @Nullable
    public final PricePlansStatus component13() {
        return this.pricePlansDetailStatusResponse;
    }

    @Nullable
    public final List<PriceplanListItem> component14() {
        return this.pricePlansDetailListResponse;
    }

    @NotNull
    public final List<String> component15() {
        return this.referenceDocListFileName;
    }

    @Nullable
    public final ProductMasterInfoItem component16() {
        return this.selectedMaterial;
    }

    @Nullable
    public final ValidateSerialByDealer component17() {
        return this.validateSerialByDealer;
    }

    @Nullable
    public final CampaignProductCategoryItem component18() {
        return this.campaignTrueItem;
    }

    @NotNull
    public final List<OneCheckPrivilegeRequest.VerificationItem> component19() {
        return this.verificationList;
    }

    @NotNull
    public final String component2() {
        return this.imeiResult;
    }

    @Nullable
    public final OneCampaignSaleTypeResponse.Data component20() {
        return this.campaignSaleTypeResponse;
    }

    @Nullable
    public final OneAddressMailingData component21() {
        return this.mailingAddress;
    }

    @Nullable
    public final IdCardInformationCollection component22() {
        return this.idCardInformationCollection;
    }

    @Nullable
    public final List<DataItem> component23() {
        return this.propositionList;
    }

    public final boolean component24() {
        return this.isSkipPropositionFlg;
    }

    @Nullable
    public final DataItem component25() {
        return this.propositionTrueItem;
    }

    @Nullable
    public final OnePropositionRebateResponse.Data component26() {
        return this.propositionRebateResponse;
    }

    @Nullable
    public final PostpaidValidateConsentViaAPIGWData component27() {
        return this.validateConsentResponse;
    }

    @Nullable
    public final String component28() {
        return this.transactionId;
    }

    @Nullable
    public final PropositionListItem component29() {
        return this.pre2postPropositionTrueSelectedItem;
    }

    @NotNull
    public final String component3() {
        return this.dtrCode;
    }

    @Nullable
    public final PriceplanListItem component30() {
        return this.packageTrueSelectedItem;
    }

    @Nullable
    public final PriceplanListItem component31() {
        return this.deviceSalePackageTrueSelectedItem;
    }

    @Nullable
    public final OneDeviceSaleAuthorizationData component32() {
        return this.authorizationData;
    }

    @Nullable
    public final String component33() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component34() {
        return this.idNumber;
    }

    @Nullable
    public final OneDeviceSaleValidateStockData component35() {
        return this.validateStockData;
    }

    @Nullable
    public final OneValidateExistingCustomerScoreResponse component36() {
        return this.validateExistingData;
    }

    @Nullable
    public final ValidateBlacklist3OperData component37() {
        return this.validateBlacklist3OperData;
    }

    @Nullable
    public final OneValidateExtraAdvancePaymentResponse component38() {
        return this.validateExtraAdvancePaymentData;
    }

    @Nullable
    public final OneValidateAllowProtectionResponse component39() {
        return this.validateAllowProtectionData;
    }

    @NotNull
    public final String component4() {
        return this.deviceModel;
    }

    @Nullable
    public final OneVerifyPrivilegeSubscribeResponse component40() {
        return this.verifyPrivilegeSubscriber;
    }

    @Nullable
    public final List<PDFFormData> component41() {
        return this.pdfForms;
    }

    @Nullable
    public final String component42() {
        return this.pdfData;
    }

    public final boolean component43() {
        return this.isCheckBlackList;
    }

    @Nullable
    public final OneDeviceSaleData component44() {
        return this.deviceSaleData;
    }

    @Nullable
    public final OneProductPriceResponse.Data component45() {
        return this.productPriceResponse;
    }

    @Nullable
    public final OnePre2PostVerifySubscriberPreToPostData component46() {
        return this.verifySubscriberPreToPostData;
    }

    @Nullable
    public final OneValidateAllowProtectionResponse.Data.TrueProtectPackage component47() {
        return this.itemProtectSelected;
    }

    @Nullable
    public final ArrayList<String> component48() {
        return this.imageListFromP2P;
    }

    @Nullable
    public final Boolean component49() {
        return this.requireFaceRecognition;
    }

    public final boolean component5() {
        return this.isFromScanIMEI;
    }

    @Nullable
    public final String component50() {
        return this.confidentRatio;
    }

    public final boolean component51() {
        return this.isKYC;
    }

    @Nullable
    public final String component52() {
        return this.consentId;
    }

    @NotNull
    public final ArrayList<ExtraAdvanceMasterInformation> component53() {
        return this.checkBlackListData;
    }

    @NotNull
    public final String component54() {
        return this.featureCode;
    }

    public final boolean component55() {
        return this.isContract;
    }

    @Nullable
    public final OnePre2PostValidatePre2PostTrueCompanyDataResponse component56() {
        return this.validatePre2PostResponse;
    }

    @Nullable
    public final UpPassFormResult component57() {
        return this.upPassFormResult;
    }

    @Nullable
    public final OneCustomerPreverifyResponse.Data component58() {
        return this.customerPreverifyResponse;
    }

    public final boolean component6() {
        return this.isChangeIMEI;
    }

    @NotNull
    public final String component7() {
        return this.idCardType;
    }

    @NotNull
    public final String component8() {
        return this.otpCode;
    }

    @NotNull
    public final String component9() {
        return this.custImage;
    }

    @NotNull
    public final OneDeviceSaleTrueModel copy(@NotNull String companyCode, @NotNull String imeiResult, @NotNull String dtrCode, @NotNull String deviceModel, boolean z, boolean z2, @NotNull String idCardType, @NotNull String otpCode, @NotNull String custImage, boolean z3, boolean z4, @Nullable PricePlanData pricePlanData, @Nullable PricePlansStatus pricePlansStatus, @Nullable List<PriceplanListItem> list, @NotNull List<String> referenceDocListFileName, @Nullable ProductMasterInfoItem productMasterInfoItem, @Nullable ValidateSerialByDealer validateSerialByDealer, @Nullable CampaignProductCategoryItem campaignProductCategoryItem, @NotNull List<OneCheckPrivilegeRequest.VerificationItem> verificationList, @Nullable OneCampaignSaleTypeResponse.Data data, @Nullable OneAddressMailingData oneAddressMailingData, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable List<DataItem> list2, boolean z5, @Nullable DataItem dataItem, @Nullable OnePropositionRebateResponse.Data data2, @Nullable PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, @Nullable String str, @Nullable PropositionListItem propositionListItem, @Nullable PriceplanListItem priceplanListItem, @Nullable PriceplanListItem priceplanListItem2, @Nullable OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData, @Nullable String str2, @NotNull String idNumber, @Nullable OneDeviceSaleValidateStockData oneDeviceSaleValidateStockData, @Nullable OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse, @Nullable ValidateBlacklist3OperData validateBlacklist3OperData, @Nullable OneValidateExtraAdvancePaymentResponse oneValidateExtraAdvancePaymentResponse, @Nullable OneValidateAllowProtectionResponse oneValidateAllowProtectionResponse, @Nullable OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse, @Nullable List<PDFFormData> list3, @Nullable String str3, boolean z6, @Nullable OneDeviceSaleData oneDeviceSaleData, @Nullable OneProductPriceResponse.Data data3, @Nullable OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData, @Nullable OneValidateAllowProtectionResponse.Data.TrueProtectPackage trueProtectPackage, @Nullable ArrayList<String> arrayList, @Nullable Boolean bool, @Nullable String str4, boolean z7, @Nullable String str5, @NotNull ArrayList<ExtraAdvanceMasterInformation> checkBlackListData, @NotNull String featureCode, boolean z8, @Nullable OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse, @Nullable UpPassFormResult upPassFormResult, @Nullable OneCustomerPreverifyResponse.Data data4) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(imeiResult, "imeiResult");
        Intrinsics.checkNotNullParameter(dtrCode, "dtrCode");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(custImage, "custImage");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verificationList, "verificationList");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(checkBlackListData, "checkBlackListData");
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        return new OneDeviceSaleTrueModel(companyCode, imeiResult, dtrCode, deviceModel, z, z2, idCardType, otpCode, custImage, z3, z4, pricePlanData, pricePlansStatus, list, referenceDocListFileName, productMasterInfoItem, validateSerialByDealer, campaignProductCategoryItem, verificationList, data, oneAddressMailingData, idCardInformationCollection, list2, z5, dataItem, data2, postpaidValidateConsentViaAPIGWData, str, propositionListItem, priceplanListItem, priceplanListItem2, oneDeviceSaleAuthorizationData, str2, idNumber, oneDeviceSaleValidateStockData, oneValidateExistingCustomerScoreResponse, validateBlacklist3OperData, oneValidateExtraAdvancePaymentResponse, oneValidateAllowProtectionResponse, oneVerifyPrivilegeSubscribeResponse, list3, str3, z6, oneDeviceSaleData, data3, onePre2PostVerifySubscriberPreToPostData, trueProtectPackage, arrayList, bool, str4, z7, str5, checkBlackListData, featureCode, z8, onePre2PostValidatePre2PostTrueCompanyDataResponse, upPassFormResult, data4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleTrueModel) {
            OneDeviceSaleTrueModel oneDeviceSaleTrueModel = (OneDeviceSaleTrueModel) obj;
            return Intrinsics.areEqual(this.companyCode, oneDeviceSaleTrueModel.companyCode) && Intrinsics.areEqual(this.imeiResult, oneDeviceSaleTrueModel.imeiResult) && Intrinsics.areEqual(this.dtrCode, oneDeviceSaleTrueModel.dtrCode) && Intrinsics.areEqual(this.deviceModel, oneDeviceSaleTrueModel.deviceModel) && this.isFromScanIMEI == oneDeviceSaleTrueModel.isFromScanIMEI && this.isChangeIMEI == oneDeviceSaleTrueModel.isChangeIMEI && Intrinsics.areEqual(this.idCardType, oneDeviceSaleTrueModel.idCardType) && Intrinsics.areEqual(this.otpCode, oneDeviceSaleTrueModel.otpCode) && Intrinsics.areEqual(this.custImage, oneDeviceSaleTrueModel.custImage) && this.isSmartCard == oneDeviceSaleTrueModel.isSmartCard && this.isOpenMarket == oneDeviceSaleTrueModel.isOpenMarket && Intrinsics.areEqual(this.pricePlansResponse, oneDeviceSaleTrueModel.pricePlansResponse) && Intrinsics.areEqual(this.pricePlansDetailStatusResponse, oneDeviceSaleTrueModel.pricePlansDetailStatusResponse) && Intrinsics.areEqual(this.pricePlansDetailListResponse, oneDeviceSaleTrueModel.pricePlansDetailListResponse) && Intrinsics.areEqual(this.referenceDocListFileName, oneDeviceSaleTrueModel.referenceDocListFileName) && Intrinsics.areEqual(this.selectedMaterial, oneDeviceSaleTrueModel.selectedMaterial) && Intrinsics.areEqual(this.validateSerialByDealer, oneDeviceSaleTrueModel.validateSerialByDealer) && Intrinsics.areEqual(this.campaignTrueItem, oneDeviceSaleTrueModel.campaignTrueItem) && Intrinsics.areEqual(this.verificationList, oneDeviceSaleTrueModel.verificationList) && Intrinsics.areEqual(this.campaignSaleTypeResponse, oneDeviceSaleTrueModel.campaignSaleTypeResponse) && Intrinsics.areEqual(this.mailingAddress, oneDeviceSaleTrueModel.mailingAddress) && Intrinsics.areEqual(this.idCardInformationCollection, oneDeviceSaleTrueModel.idCardInformationCollection) && Intrinsics.areEqual(this.propositionList, oneDeviceSaleTrueModel.propositionList) && this.isSkipPropositionFlg == oneDeviceSaleTrueModel.isSkipPropositionFlg && Intrinsics.areEqual(this.propositionTrueItem, oneDeviceSaleTrueModel.propositionTrueItem) && Intrinsics.areEqual(this.propositionRebateResponse, oneDeviceSaleTrueModel.propositionRebateResponse) && Intrinsics.areEqual(this.validateConsentResponse, oneDeviceSaleTrueModel.validateConsentResponse) && Intrinsics.areEqual(this.transactionId, oneDeviceSaleTrueModel.transactionId) && Intrinsics.areEqual(this.pre2postPropositionTrueSelectedItem, oneDeviceSaleTrueModel.pre2postPropositionTrueSelectedItem) && Intrinsics.areEqual(this.packageTrueSelectedItem, oneDeviceSaleTrueModel.packageTrueSelectedItem) && Intrinsics.areEqual(this.deviceSalePackageTrueSelectedItem, oneDeviceSaleTrueModel.deviceSalePackageTrueSelectedItem) && Intrinsics.areEqual(this.authorizationData, oneDeviceSaleTrueModel.authorizationData) && Intrinsics.areEqual(this.subscriberNumber, oneDeviceSaleTrueModel.subscriberNumber) && Intrinsics.areEqual(this.idNumber, oneDeviceSaleTrueModel.idNumber) && Intrinsics.areEqual(this.validateStockData, oneDeviceSaleTrueModel.validateStockData) && Intrinsics.areEqual(this.validateExistingData, oneDeviceSaleTrueModel.validateExistingData) && Intrinsics.areEqual(this.validateBlacklist3OperData, oneDeviceSaleTrueModel.validateBlacklist3OperData) && Intrinsics.areEqual(this.validateExtraAdvancePaymentData, oneDeviceSaleTrueModel.validateExtraAdvancePaymentData) && Intrinsics.areEqual(this.validateAllowProtectionData, oneDeviceSaleTrueModel.validateAllowProtectionData) && Intrinsics.areEqual(this.verifyPrivilegeSubscriber, oneDeviceSaleTrueModel.verifyPrivilegeSubscriber) && Intrinsics.areEqual(this.pdfForms, oneDeviceSaleTrueModel.pdfForms) && Intrinsics.areEqual(this.pdfData, oneDeviceSaleTrueModel.pdfData) && this.isCheckBlackList == oneDeviceSaleTrueModel.isCheckBlackList && Intrinsics.areEqual(this.deviceSaleData, oneDeviceSaleTrueModel.deviceSaleData) && Intrinsics.areEqual(this.productPriceResponse, oneDeviceSaleTrueModel.productPriceResponse) && Intrinsics.areEqual(this.verifySubscriberPreToPostData, oneDeviceSaleTrueModel.verifySubscriberPreToPostData) && Intrinsics.areEqual(this.itemProtectSelected, oneDeviceSaleTrueModel.itemProtectSelected) && Intrinsics.areEqual(this.imageListFromP2P, oneDeviceSaleTrueModel.imageListFromP2P) && Intrinsics.areEqual(this.requireFaceRecognition, oneDeviceSaleTrueModel.requireFaceRecognition) && Intrinsics.areEqual(this.confidentRatio, oneDeviceSaleTrueModel.confidentRatio) && this.isKYC == oneDeviceSaleTrueModel.isKYC && Intrinsics.areEqual(this.consentId, oneDeviceSaleTrueModel.consentId) && Intrinsics.areEqual(this.checkBlackListData, oneDeviceSaleTrueModel.checkBlackListData) && Intrinsics.areEqual(this.featureCode, oneDeviceSaleTrueModel.featureCode) && this.isContract == oneDeviceSaleTrueModel.isContract && Intrinsics.areEqual(this.validatePre2PostResponse, oneDeviceSaleTrueModel.validatePre2PostResponse) && Intrinsics.areEqual(this.upPassFormResult, oneDeviceSaleTrueModel.upPassFormResult) && Intrinsics.areEqual(this.customerPreverifyResponse, oneDeviceSaleTrueModel.customerPreverifyResponse);
        }
        return false;
    }

    @Nullable
    public final OneDeviceSaleAuthorizationData getAuthorizationData() {
        return this.authorizationData;
    }

    @Nullable
    public final OneCampaignSaleTypeResponse.Data getCampaignSaleTypeResponse() {
        return this.campaignSaleTypeResponse;
    }

    @Nullable
    public final CampaignProductCategoryItem getCampaignTrueItem() {
        return this.campaignTrueItem;
    }

    @NotNull
    public final ArrayList<ExtraAdvanceMasterInformation> getCheckBlackListData() {
        return this.checkBlackListData;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getConfidentRatio() {
        return this.confidentRatio;
    }

    @Nullable
    public final String getConsentId() {
        return this.consentId;
    }

    @NotNull
    public final String getCustImage() {
        return this.custImage;
    }

    @Nullable
    public final OneCustomerPreverifyResponse.Data getCustomerPreverifyResponse() {
        return this.customerPreverifyResponse;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final OneDeviceSaleData getDeviceSaleData() {
        return this.deviceSaleData;
    }

    @Nullable
    public final PriceplanListItem getDeviceSalePackageTrueSelectedItem() {
        return this.deviceSalePackageTrueSelectedItem;
    }

    @NotNull
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @NotNull
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final IdCardInformationCollection getIdCardInformationCollection() {
        return this.idCardInformationCollection;
    }

    @NotNull
    public final String getIdCardType() {
        return this.idCardType;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final ArrayList<String> getImageListFromP2P() {
        return this.imageListFromP2P;
    }

    @NotNull
    public final String getImeiResult() {
        return this.imeiResult;
    }

    @Nullable
    public final OneValidateAllowProtectionResponse.Data.TrueProtectPackage getItemProtectSelected() {
        return this.itemProtectSelected;
    }

    @Nullable
    public final OneAddressMailingData getMailingAddress() {
        return this.mailingAddress;
    }

    @NotNull
    public final String getOtpCode() {
        return this.otpCode;
    }

    @Nullable
    public final PriceplanListItem getPackageTrueSelectedItem() {
        return this.packageTrueSelectedItem;
    }

    @Nullable
    public final String getPdfData() {
        return this.pdfData;
    }

    @Nullable
    public final List<PDFFormData> getPdfForms() {
        return this.pdfForms;
    }

    @Nullable
    public final PropositionListItem getPre2postPropositionTrueSelectedItem() {
        return this.pre2postPropositionTrueSelectedItem;
    }

    @Nullable
    public final List<PriceplanListItem> getPricePlansDetailListResponse() {
        return this.pricePlansDetailListResponse;
    }

    @Nullable
    public final PricePlansStatus getPricePlansDetailStatusResponse() {
        return this.pricePlansDetailStatusResponse;
    }

    @Nullable
    public final PricePlanData getPricePlansResponse() {
        return this.pricePlansResponse;
    }

    @Nullable
    public final OneProductPriceResponse.Data getProductPriceResponse() {
        return this.productPriceResponse;
    }

    @Nullable
    public final List<DataItem> getPropositionList() {
        return this.propositionList;
    }

    @Nullable
    public final OnePropositionRebateResponse.Data getPropositionRebateResponse() {
        return this.propositionRebateResponse;
    }

    @Nullable
    public final DataItem getPropositionTrueItem() {
        return this.propositionTrueItem;
    }

    @NotNull
    public final List<String> getReferenceDocListFileName() {
        return this.referenceDocListFileName;
    }

    @Nullable
    public final Boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final ProductMasterInfoItem getSelectedMaterial() {
        return this.selectedMaterial;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    public final UpPassFormResult getUpPassFormResult() {
        return this.upPassFormResult;
    }

    @Nullable
    public final OneValidateAllowProtectionResponse getValidateAllowProtectionData() {
        return this.validateAllowProtectionData;
    }

    @Nullable
    public final ValidateBlacklist3OperData getValidateBlacklist3OperData() {
        return this.validateBlacklist3OperData;
    }

    @Nullable
    public final PostpaidValidateConsentViaAPIGWData getValidateConsentResponse() {
        return this.validateConsentResponse;
    }

    @Nullable
    public final OneValidateExistingCustomerScoreResponse getValidateExistingData() {
        return this.validateExistingData;
    }

    @Nullable
    public final OneValidateExtraAdvancePaymentResponse getValidateExtraAdvancePaymentData() {
        return this.validateExtraAdvancePaymentData;
    }

    @Nullable
    public final OnePre2PostValidatePre2PostTrueCompanyDataResponse getValidatePre2PostResponse() {
        return this.validatePre2PostResponse;
    }

    @Nullable
    public final ValidateSerialByDealer getValidateSerialByDealer() {
        return this.validateSerialByDealer;
    }

    @Nullable
    public final OneDeviceSaleValidateStockData getValidateStockData() {
        return this.validateStockData;
    }

    @NotNull
    public final List<OneCheckPrivilegeRequest.VerificationItem> getVerificationList() {
        return this.verificationList;
    }

    @Nullable
    public final OneVerifyPrivilegeSubscribeResponse getVerifyPrivilegeSubscriber() {
        return this.verifyPrivilegeSubscriber;
    }

    @Nullable
    public final OnePre2PostVerifySubscriberPreToPostData getVerifySubscriberPreToPostData() {
        return this.verifySubscriberPreToPostData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.companyCode.hashCode() * 31) + this.imeiResult.hashCode()) * 31) + this.dtrCode.hashCode()) * 31) + this.deviceModel.hashCode()) * 31;
        boolean z = this.isFromScanIMEI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isChangeIMEI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode2 = (((((((i2 + i3) * 31) + this.idCardType.hashCode()) * 31) + this.otpCode.hashCode()) * 31) + this.custImage.hashCode()) * 31;
        boolean z3 = this.isSmartCard;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z4 = this.isOpenMarket;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        PricePlanData pricePlanData = this.pricePlansResponse;
        int hashCode3 = (i7 + (pricePlanData == null ? 0 : pricePlanData.hashCode())) * 31;
        PricePlansStatus pricePlansStatus = this.pricePlansDetailStatusResponse;
        int hashCode4 = (hashCode3 + (pricePlansStatus == null ? 0 : pricePlansStatus.hashCode())) * 31;
        List<PriceplanListItem> list = this.pricePlansDetailListResponse;
        int hashCode5 = (((hashCode4 + (list == null ? 0 : list.hashCode())) * 31) + this.referenceDocListFileName.hashCode()) * 31;
        ProductMasterInfoItem productMasterInfoItem = this.selectedMaterial;
        int hashCode6 = (hashCode5 + (productMasterInfoItem == null ? 0 : productMasterInfoItem.hashCode())) * 31;
        ValidateSerialByDealer validateSerialByDealer = this.validateSerialByDealer;
        int hashCode7 = (hashCode6 + (validateSerialByDealer == null ? 0 : validateSerialByDealer.hashCode())) * 31;
        CampaignProductCategoryItem campaignProductCategoryItem = this.campaignTrueItem;
        int hashCode8 = (((hashCode7 + (campaignProductCategoryItem == null ? 0 : campaignProductCategoryItem.hashCode())) * 31) + this.verificationList.hashCode()) * 31;
        OneCampaignSaleTypeResponse.Data data = this.campaignSaleTypeResponse;
        int hashCode9 = (hashCode8 + (data == null ? 0 : data.hashCode())) * 31;
        OneAddressMailingData oneAddressMailingData = this.mailingAddress;
        int hashCode10 = (hashCode9 + (oneAddressMailingData == null ? 0 : oneAddressMailingData.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformationCollection;
        int hashCode11 = (hashCode10 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        List<DataItem> list2 = this.propositionList;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        boolean z5 = this.isSkipPropositionFlg;
        int i8 = z5;
        if (z5 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode12 + i8) * 31;
        DataItem dataItem = this.propositionTrueItem;
        int hashCode13 = (i9 + (dataItem == null ? 0 : dataItem.hashCode())) * 31;
        OnePropositionRebateResponse.Data data2 = this.propositionRebateResponse;
        int hashCode14 = (hashCode13 + (data2 == null ? 0 : data2.hashCode())) * 31;
        PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData = this.validateConsentResponse;
        int hashCode15 = (hashCode14 + (postpaidValidateConsentViaAPIGWData == null ? 0 : postpaidValidateConsentViaAPIGWData.hashCode())) * 31;
        String str = this.transactionId;
        int hashCode16 = (hashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        PropositionListItem propositionListItem = this.pre2postPropositionTrueSelectedItem;
        int hashCode17 = (hashCode16 + (propositionListItem == null ? 0 : propositionListItem.hashCode())) * 31;
        PriceplanListItem priceplanListItem = this.packageTrueSelectedItem;
        int hashCode18 = (hashCode17 + (priceplanListItem == null ? 0 : priceplanListItem.hashCode())) * 31;
        PriceplanListItem priceplanListItem2 = this.deviceSalePackageTrueSelectedItem;
        int hashCode19 = (hashCode18 + (priceplanListItem2 == null ? 0 : priceplanListItem2.hashCode())) * 31;
        OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData = this.authorizationData;
        int hashCode20 = (hashCode19 + (oneDeviceSaleAuthorizationData == null ? 0 : oneDeviceSaleAuthorizationData.hashCode())) * 31;
        String str2 = this.subscriberNumber;
        int hashCode21 = (((hashCode20 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.idNumber.hashCode()) * 31;
        OneDeviceSaleValidateStockData oneDeviceSaleValidateStockData = this.validateStockData;
        int hashCode22 = (hashCode21 + (oneDeviceSaleValidateStockData == null ? 0 : oneDeviceSaleValidateStockData.hashCode())) * 31;
        OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse = this.validateExistingData;
        int hashCode23 = (hashCode22 + (oneValidateExistingCustomerScoreResponse == null ? 0 : oneValidateExistingCustomerScoreResponse.hashCode())) * 31;
        ValidateBlacklist3OperData validateBlacklist3OperData = this.validateBlacklist3OperData;
        int hashCode24 = (hashCode23 + (validateBlacklist3OperData == null ? 0 : validateBlacklist3OperData.hashCode())) * 31;
        OneValidateExtraAdvancePaymentResponse oneValidateExtraAdvancePaymentResponse = this.validateExtraAdvancePaymentData;
        int hashCode25 = (hashCode24 + (oneValidateExtraAdvancePaymentResponse == null ? 0 : oneValidateExtraAdvancePaymentResponse.hashCode())) * 31;
        OneValidateAllowProtectionResponse oneValidateAllowProtectionResponse = this.validateAllowProtectionData;
        int hashCode26 = (hashCode25 + (oneValidateAllowProtectionResponse == null ? 0 : oneValidateAllowProtectionResponse.hashCode())) * 31;
        OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse = this.verifyPrivilegeSubscriber;
        int hashCode27 = (hashCode26 + (oneVerifyPrivilegeSubscribeResponse == null ? 0 : oneVerifyPrivilegeSubscribeResponse.hashCode())) * 31;
        List<PDFFormData> list3 = this.pdfForms;
        int hashCode28 = (hashCode27 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.pdfData;
        int hashCode29 = (hashCode28 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z6 = this.isCheckBlackList;
        int i10 = z6;
        if (z6 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode29 + i10) * 31;
        OneDeviceSaleData oneDeviceSaleData = this.deviceSaleData;
        int hashCode30 = (i11 + (oneDeviceSaleData == null ? 0 : oneDeviceSaleData.hashCode())) * 31;
        OneProductPriceResponse.Data data3 = this.productPriceResponse;
        int hashCode31 = (hashCode30 + (data3 == null ? 0 : data3.hashCode())) * 31;
        OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData = this.verifySubscriberPreToPostData;
        int hashCode32 = (hashCode31 + (onePre2PostVerifySubscriberPreToPostData == null ? 0 : onePre2PostVerifySubscriberPreToPostData.hashCode())) * 31;
        OneValidateAllowProtectionResponse.Data.TrueProtectPackage trueProtectPackage = this.itemProtectSelected;
        int hashCode33 = (hashCode32 + (trueProtectPackage == null ? 0 : trueProtectPackage.hashCode())) * 31;
        ArrayList<String> arrayList = this.imageListFromP2P;
        int hashCode34 = (hashCode33 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Boolean bool = this.requireFaceRecognition;
        int hashCode35 = (hashCode34 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.confidentRatio;
        int hashCode36 = (hashCode35 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z7 = this.isKYC;
        int i12 = z7;
        if (z7 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode36 + i12) * 31;
        String str5 = this.consentId;
        int hashCode37 = (((((i13 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.checkBlackListData.hashCode()) * 31) + this.featureCode.hashCode()) * 31;
        boolean z8 = this.isContract;
        int i14 = (hashCode37 + (z8 ? 1 : z8 ? 1 : 0)) * 31;
        OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse = this.validatePre2PostResponse;
        int hashCode38 = (i14 + (onePre2PostValidatePre2PostTrueCompanyDataResponse == null ? 0 : onePre2PostValidatePre2PostTrueCompanyDataResponse.hashCode())) * 31;
        UpPassFormResult upPassFormResult = this.upPassFormResult;
        int hashCode39 = (hashCode38 + (upPassFormResult == null ? 0 : upPassFormResult.hashCode())) * 31;
        OneCustomerPreverifyResponse.Data data4 = this.customerPreverifyResponse;
        return hashCode39 + (data4 != null ? data4.hashCode() : 0);
    }

    public final boolean isChangeIMEI() {
        return this.isChangeIMEI;
    }

    public final boolean isCheckBlackList() {
        return this.isCheckBlackList;
    }

    public final boolean isContract() {
        return this.isContract;
    }

    public final boolean isFromScanIMEI() {
        return this.isFromScanIMEI;
    }

    public final boolean isKYC() {
        return this.isKYC;
    }

    public final boolean isOpenMarket() {
        return this.isOpenMarket;
    }

    public final boolean isSkipPropositionFlg() {
        return this.isSkipPropositionFlg;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAuthorizationData(@Nullable OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData) {
        this.authorizationData = oneDeviceSaleAuthorizationData;
    }

    public final void setCampaignSaleTypeResponse(@Nullable OneCampaignSaleTypeResponse.Data data) {
        this.campaignSaleTypeResponse = data;
    }

    public final void setCampaignTrueItem(@Nullable CampaignProductCategoryItem campaignProductCategoryItem) {
        this.campaignTrueItem = campaignProductCategoryItem;
    }

    public final void setChangeIMEI(boolean z) {
        this.isChangeIMEI = z;
    }

    public final void setCheckBlackList(boolean z) {
        this.isCheckBlackList = z;
    }

    public final void setCheckBlackListData(@NotNull ArrayList<ExtraAdvanceMasterInformation> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.checkBlackListData = arrayList;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setConfidentRatio(@Nullable String str) {
        this.confidentRatio = str;
    }

    public final void setConsentId(@Nullable String str) {
        this.consentId = str;
    }

    public final void setContract(boolean z) {
        this.isContract = z;
    }

    public final void setCustImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.custImage = str;
    }

    public final void setCustomerPreverifyResponse(@Nullable OneCustomerPreverifyResponse.Data data) {
        this.customerPreverifyResponse = data;
    }

    public final void setDeviceModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceModel = str;
    }

    public final void setDeviceSaleData(@Nullable OneDeviceSaleData oneDeviceSaleData) {
        this.deviceSaleData = oneDeviceSaleData;
    }

    public final void setDeviceSalePackageTrueSelectedItem(@Nullable PriceplanListItem priceplanListItem) {
        this.deviceSalePackageTrueSelectedItem = priceplanListItem;
    }

    public final void setDtrCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dtrCode = str;
    }

    public final void setFeatureCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.featureCode = str;
    }

    public final void setFromScanIMEI(boolean z) {
        this.isFromScanIMEI = z;
    }

    public final void setIdCardInformationCollection(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.idCardInformationCollection = idCardInformationCollection;
    }

    public final void setIdCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idCardType = str;
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setImageListFromP2P(@Nullable ArrayList<String> arrayList) {
        this.imageListFromP2P = arrayList;
    }

    public final void setImeiResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imeiResult = str;
    }

    public final void setItemProtectSelected(@Nullable OneValidateAllowProtectionResponse.Data.TrueProtectPackage trueProtectPackage) {
        this.itemProtectSelected = trueProtectPackage;
    }

    public final void setKYC(boolean z) {
        this.isKYC = z;
    }

    public final void setMailingAddress(@Nullable OneAddressMailingData oneAddressMailingData) {
        this.mailingAddress = oneAddressMailingData;
    }

    public final void setOpenMarket(boolean z) {
        this.isOpenMarket = z;
    }

    public final void setOtpCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpCode = str;
    }

    public final void setPackageTrueSelectedItem(@Nullable PriceplanListItem priceplanListItem) {
        this.packageTrueSelectedItem = priceplanListItem;
    }

    public final void setPdfData(@Nullable String str) {
        this.pdfData = str;
    }

    public final void setPdfForms(@Nullable List<PDFFormData> list) {
        this.pdfForms = list;
    }

    public final void setPre2postPropositionTrueSelectedItem(@Nullable PropositionListItem propositionListItem) {
        this.pre2postPropositionTrueSelectedItem = propositionListItem;
    }

    public final void setPricePlansDetailListResponse(@Nullable List<PriceplanListItem> list) {
        this.pricePlansDetailListResponse = list;
    }

    public final void setPricePlansDetailStatusResponse(@Nullable PricePlansStatus pricePlansStatus) {
        this.pricePlansDetailStatusResponse = pricePlansStatus;
    }

    public final void setPricePlansResponse(@Nullable PricePlanData pricePlanData) {
        this.pricePlansResponse = pricePlanData;
    }

    public final void setProductPriceResponse(@Nullable OneProductPriceResponse.Data data) {
        this.productPriceResponse = data;
    }

    public final void setPropositionList(@Nullable List<DataItem> list) {
        this.propositionList = list;
    }

    public final void setPropositionRebateResponse(@Nullable OnePropositionRebateResponse.Data data) {
        this.propositionRebateResponse = data;
    }

    public final void setPropositionTrueItem(@Nullable DataItem dataItem) {
        this.propositionTrueItem = dataItem;
    }

    public final void setReferenceDocListFileName(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.referenceDocListFileName = list;
    }

    public final void setRequireFaceRecognition(@Nullable Boolean bool) {
        this.requireFaceRecognition = bool;
    }

    public final void setSelectedMaterial(@Nullable ProductMasterInfoItem productMasterInfoItem) {
        this.selectedMaterial = productMasterInfoItem;
    }

    public final void setSkipPropositionFlg(boolean z) {
        this.isSkipPropositionFlg = z;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.subscriberNumber = str;
    }

    public final void setTransactionId(@Nullable String str) {
        this.transactionId = str;
    }

    public final void setUpPassFormResult(@Nullable UpPassFormResult upPassFormResult) {
        this.upPassFormResult = upPassFormResult;
    }

    public final void setValidateAllowProtectionData(@Nullable OneValidateAllowProtectionResponse oneValidateAllowProtectionResponse) {
        this.validateAllowProtectionData = oneValidateAllowProtectionResponse;
    }

    public final void setValidateBlacklist3OperData(@Nullable ValidateBlacklist3OperData validateBlacklist3OperData) {
        this.validateBlacklist3OperData = validateBlacklist3OperData;
    }

    public final void setValidateConsentResponse(@Nullable PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData) {
        this.validateConsentResponse = postpaidValidateConsentViaAPIGWData;
    }

    public final void setValidateExistingData(@Nullable OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse) {
        this.validateExistingData = oneValidateExistingCustomerScoreResponse;
    }

    public final void setValidateExtraAdvancePaymentData(@Nullable OneValidateExtraAdvancePaymentResponse oneValidateExtraAdvancePaymentResponse) {
        this.validateExtraAdvancePaymentData = oneValidateExtraAdvancePaymentResponse;
    }

    public final void setValidatePre2PostResponse(@Nullable OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse) {
        this.validatePre2PostResponse = onePre2PostValidatePre2PostTrueCompanyDataResponse;
    }

    public final void setValidateSerialByDealer(@Nullable ValidateSerialByDealer validateSerialByDealer) {
        this.validateSerialByDealer = validateSerialByDealer;
    }

    public final void setValidateStockData(@Nullable OneDeviceSaleValidateStockData oneDeviceSaleValidateStockData) {
        this.validateStockData = oneDeviceSaleValidateStockData;
    }

    public final void setVerificationList(@NotNull List<OneCheckPrivilegeRequest.VerificationItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.verificationList = list;
    }

    public final void setVerifyPrivilegeSubscriber(@Nullable OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse) {
        this.verifyPrivilegeSubscriber = oneVerifyPrivilegeSubscribeResponse;
    }

    public final void setVerifySubscriberPreToPostData(@Nullable OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData) {
        this.verifySubscriberPreToPostData = onePre2PostVerifySubscriberPreToPostData;
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.imeiResult;
        String str3 = this.dtrCode;
        String str4 = this.deviceModel;
        boolean z = this.isFromScanIMEI;
        boolean z2 = this.isChangeIMEI;
        String str5 = this.idCardType;
        String str6 = this.otpCode;
        String str7 = this.custImage;
        boolean z3 = this.isSmartCard;
        boolean z4 = this.isOpenMarket;
        PricePlanData pricePlanData = this.pricePlansResponse;
        PricePlansStatus pricePlansStatus = this.pricePlansDetailStatusResponse;
        List<PriceplanListItem> list = this.pricePlansDetailListResponse;
        List<String> list2 = this.referenceDocListFileName;
        ProductMasterInfoItem productMasterInfoItem = this.selectedMaterial;
        ValidateSerialByDealer validateSerialByDealer = this.validateSerialByDealer;
        CampaignProductCategoryItem campaignProductCategoryItem = this.campaignTrueItem;
        List<OneCheckPrivilegeRequest.VerificationItem> list3 = this.verificationList;
        OneCampaignSaleTypeResponse.Data data = this.campaignSaleTypeResponse;
        OneAddressMailingData oneAddressMailingData = this.mailingAddress;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformationCollection;
        List<DataItem> list4 = this.propositionList;
        boolean z5 = this.isSkipPropositionFlg;
        DataItem dataItem = this.propositionTrueItem;
        OnePropositionRebateResponse.Data data2 = this.propositionRebateResponse;
        PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData = this.validateConsentResponse;
        String str8 = this.transactionId;
        PropositionListItem propositionListItem = this.pre2postPropositionTrueSelectedItem;
        PriceplanListItem priceplanListItem = this.packageTrueSelectedItem;
        PriceplanListItem priceplanListItem2 = this.deviceSalePackageTrueSelectedItem;
        OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData = this.authorizationData;
        String str9 = this.subscriberNumber;
        String str10 = this.idNumber;
        OneDeviceSaleValidateStockData oneDeviceSaleValidateStockData = this.validateStockData;
        OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse = this.validateExistingData;
        ValidateBlacklist3OperData validateBlacklist3OperData = this.validateBlacklist3OperData;
        OneValidateExtraAdvancePaymentResponse oneValidateExtraAdvancePaymentResponse = this.validateExtraAdvancePaymentData;
        OneValidateAllowProtectionResponse oneValidateAllowProtectionResponse = this.validateAllowProtectionData;
        OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse = this.verifyPrivilegeSubscriber;
        List<PDFFormData> list5 = this.pdfForms;
        String str11 = this.pdfData;
        boolean z6 = this.isCheckBlackList;
        OneDeviceSaleData oneDeviceSaleData = this.deviceSaleData;
        OneProductPriceResponse.Data data3 = this.productPriceResponse;
        OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData = this.verifySubscriberPreToPostData;
        OneValidateAllowProtectionResponse.Data.TrueProtectPackage trueProtectPackage = this.itemProtectSelected;
        ArrayList<String> arrayList = this.imageListFromP2P;
        Boolean bool = this.requireFaceRecognition;
        String str12 = this.confidentRatio;
        boolean z7 = this.isKYC;
        String str13 = this.consentId;
        ArrayList<ExtraAdvanceMasterInformation> arrayList2 = this.checkBlackListData;
        String str14 = this.featureCode;
        boolean z8 = this.isContract;
        OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse = this.validatePre2PostResponse;
        UpPassFormResult upPassFormResult = this.upPassFormResult;
        OneCustomerPreverifyResponse.Data data4 = this.customerPreverifyResponse;
        return "OneDeviceSaleTrueModel(companyCode=" + str + ", imeiResult=" + str2 + ", dtrCode=" + str3 + ", deviceModel=" + str4 + ", isFromScanIMEI=" + z + ", isChangeIMEI=" + z2 + ", idCardType=" + str5 + ", otpCode=" + str6 + ", custImage=" + str7 + ", isSmartCard=" + z3 + ", isOpenMarket=" + z4 + ", pricePlansResponse=" + pricePlanData + ", pricePlansDetailStatusResponse=" + pricePlansStatus + ", pricePlansDetailListResponse=" + list + ", referenceDocListFileName=" + list2 + ", selectedMaterial=" + productMasterInfoItem + ", validateSerialByDealer=" + validateSerialByDealer + ", campaignTrueItem=" + campaignProductCategoryItem + ", verificationList=" + list3 + ", campaignSaleTypeResponse=" + data + ", mailingAddress=" + oneAddressMailingData + ", idCardInformationCollection=" + idCardInformationCollection + ", propositionList=" + list4 + ", isSkipPropositionFlg=" + z5 + ", propositionTrueItem=" + dataItem + ", propositionRebateResponse=" + data2 + ", validateConsentResponse=" + postpaidValidateConsentViaAPIGWData + ", transactionId=" + str8 + ", pre2postPropositionTrueSelectedItem=" + propositionListItem + ", packageTrueSelectedItem=" + priceplanListItem + ", deviceSalePackageTrueSelectedItem=" + priceplanListItem2 + ", authorizationData=" + oneDeviceSaleAuthorizationData + ", subscriberNumber=" + str9 + ", idNumber=" + str10 + ", validateStockData=" + oneDeviceSaleValidateStockData + ", validateExistingData=" + oneValidateExistingCustomerScoreResponse + ", validateBlacklist3OperData=" + validateBlacklist3OperData + ", validateExtraAdvancePaymentData=" + oneValidateExtraAdvancePaymentResponse + ", validateAllowProtectionData=" + oneValidateAllowProtectionResponse + ", verifyPrivilegeSubscriber=" + oneVerifyPrivilegeSubscribeResponse + ", pdfForms=" + list5 + ", pdfData=" + str11 + ", isCheckBlackList=" + z6 + ", deviceSaleData=" + oneDeviceSaleData + ", productPriceResponse=" + data3 + ", verifySubscriberPreToPostData=" + onePre2PostVerifySubscriberPreToPostData + ", itemProtectSelected=" + trueProtectPackage + ", imageListFromP2P=" + arrayList + ", requireFaceRecognition=" + bool + ", confidentRatio=" + str12 + ", isKYC=" + z7 + ", consentId=" + str13 + ", checkBlackListData=" + arrayList2 + ", featureCode=" + str14 + ", isContract=" + z8 + ", validatePre2PostResponse=" + onePre2PostValidatePre2PostTrueCompanyDataResponse + ", upPassFormResult=" + upPassFormResult + ", customerPreverifyResponse=" + data4 + ")";
    }

    public OneDeviceSaleTrueModel(@NotNull String companyCode, @NotNull String imeiResult, @NotNull String dtrCode, @NotNull String deviceModel, boolean z, boolean z2, @NotNull String idCardType, @NotNull String otpCode, @NotNull String custImage, boolean z3, boolean z4, @Nullable PricePlanData pricePlanData, @Nullable PricePlansStatus pricePlansStatus, @Nullable List<PriceplanListItem> list, @NotNull List<String> referenceDocListFileName, @Nullable ProductMasterInfoItem productMasterInfoItem, @Nullable ValidateSerialByDealer validateSerialByDealer, @Nullable CampaignProductCategoryItem campaignProductCategoryItem, @NotNull List<OneCheckPrivilegeRequest.VerificationItem> verificationList, @Nullable OneCampaignSaleTypeResponse.Data data, @Nullable OneAddressMailingData oneAddressMailingData, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable List<DataItem> list2, boolean z5, @Nullable DataItem dataItem, @Nullable OnePropositionRebateResponse.Data data2, @Nullable PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, @Nullable String str, @Nullable PropositionListItem propositionListItem, @Nullable PriceplanListItem priceplanListItem, @Nullable PriceplanListItem priceplanListItem2, @Nullable OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData, @Nullable String str2, @NotNull String idNumber, @Nullable OneDeviceSaleValidateStockData oneDeviceSaleValidateStockData, @Nullable OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse, @Nullable ValidateBlacklist3OperData validateBlacklist3OperData, @Nullable OneValidateExtraAdvancePaymentResponse oneValidateExtraAdvancePaymentResponse, @Nullable OneValidateAllowProtectionResponse oneValidateAllowProtectionResponse, @Nullable OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse, @Nullable List<PDFFormData> list3, @Nullable String str3, boolean z6, @Nullable OneDeviceSaleData oneDeviceSaleData, @Nullable OneProductPriceResponse.Data data3, @Nullable OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData, @Nullable OneValidateAllowProtectionResponse.Data.TrueProtectPackage trueProtectPackage, @Nullable ArrayList<String> arrayList, @Nullable Boolean bool, @Nullable String str4, boolean z7, @Nullable String str5, @NotNull ArrayList<ExtraAdvanceMasterInformation> checkBlackListData, @NotNull String featureCode, boolean z8, @Nullable OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse, @Nullable UpPassFormResult upPassFormResult, @Nullable OneCustomerPreverifyResponse.Data data4) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(imeiResult, "imeiResult");
        Intrinsics.checkNotNullParameter(dtrCode, "dtrCode");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(custImage, "custImage");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verificationList, "verificationList");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(checkBlackListData, "checkBlackListData");
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        this.companyCode = companyCode;
        this.imeiResult = imeiResult;
        this.dtrCode = dtrCode;
        this.deviceModel = deviceModel;
        this.isFromScanIMEI = z;
        this.isChangeIMEI = z2;
        this.idCardType = idCardType;
        this.otpCode = otpCode;
        this.custImage = custImage;
        this.isSmartCard = z3;
        this.isOpenMarket = z4;
        this.pricePlansResponse = pricePlanData;
        this.pricePlansDetailStatusResponse = pricePlansStatus;
        this.pricePlansDetailListResponse = list;
        this.referenceDocListFileName = referenceDocListFileName;
        this.selectedMaterial = productMasterInfoItem;
        this.validateSerialByDealer = validateSerialByDealer;
        this.campaignTrueItem = campaignProductCategoryItem;
        this.verificationList = verificationList;
        this.campaignSaleTypeResponse = data;
        this.mailingAddress = oneAddressMailingData;
        this.idCardInformationCollection = idCardInformationCollection;
        this.propositionList = list2;
        this.isSkipPropositionFlg = z5;
        this.propositionTrueItem = dataItem;
        this.propositionRebateResponse = data2;
        this.validateConsentResponse = postpaidValidateConsentViaAPIGWData;
        this.transactionId = str;
        this.pre2postPropositionTrueSelectedItem = propositionListItem;
        this.packageTrueSelectedItem = priceplanListItem;
        this.deviceSalePackageTrueSelectedItem = priceplanListItem2;
        this.authorizationData = oneDeviceSaleAuthorizationData;
        this.subscriberNumber = str2;
        this.idNumber = idNumber;
        this.validateStockData = oneDeviceSaleValidateStockData;
        this.validateExistingData = oneValidateExistingCustomerScoreResponse;
        this.validateBlacklist3OperData = validateBlacklist3OperData;
        this.validateExtraAdvancePaymentData = oneValidateExtraAdvancePaymentResponse;
        this.validateAllowProtectionData = oneValidateAllowProtectionResponse;
        this.verifyPrivilegeSubscriber = oneVerifyPrivilegeSubscribeResponse;
        this.pdfForms = list3;
        this.pdfData = str3;
        this.isCheckBlackList = z6;
        this.deviceSaleData = oneDeviceSaleData;
        this.productPriceResponse = data3;
        this.verifySubscriberPreToPostData = onePre2PostVerifySubscriberPreToPostData;
        this.itemProtectSelected = trueProtectPackage;
        this.imageListFromP2P = arrayList;
        this.requireFaceRecognition = bool;
        this.confidentRatio = str4;
        this.isKYC = z7;
        this.consentId = str5;
        this.checkBlackListData = checkBlackListData;
        this.featureCode = featureCode;
        this.isContract = z8;
        this.validatePre2PostResponse = onePre2PostValidatePre2PostTrueCompanyDataResponse;
        this.upPassFormResult = upPassFormResult;
        this.customerPreverifyResponse = data4;
    }

    public /* synthetic */ OneDeviceSaleTrueModel(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, boolean z3, boolean z4, PricePlanData pricePlanData, PricePlansStatus pricePlansStatus, List list, List list2, ProductMasterInfoItem productMasterInfoItem, ValidateSerialByDealer validateSerialByDealer, CampaignProductCategoryItem campaignProductCategoryItem, List list3, OneCampaignSaleTypeResponse.Data data, OneAddressMailingData oneAddressMailingData, IdCardInformationCollection idCardInformationCollection, List list4, boolean z5, DataItem dataItem, OnePropositionRebateResponse.Data data2, PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, String str8, PropositionListItem propositionListItem, PriceplanListItem priceplanListItem, PriceplanListItem priceplanListItem2, OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData, String str9, String str10, OneDeviceSaleValidateStockData oneDeviceSaleValidateStockData, OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse, ValidateBlacklist3OperData validateBlacklist3OperData, OneValidateExtraAdvancePaymentResponse oneValidateExtraAdvancePaymentResponse, OneValidateAllowProtectionResponse oneValidateAllowProtectionResponse, OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse, List list5, String str11, boolean z6, OneDeviceSaleData oneDeviceSaleData, OneProductPriceResponse.Data data3, OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData, OneValidateAllowProtectionResponse.Data.TrueProtectPackage trueProtectPackage, ArrayList arrayList, Boolean bool, String str12, boolean z7, String str13, ArrayList arrayList2, String str14, boolean z8, OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse, UpPassFormResult upPassFormResult, OneCustomerPreverifyResponse.Data data4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? null : pricePlanData, (i & 4096) != 0 ? null : pricePlansStatus, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? new ArrayList() : list2, (i & 32768) != 0 ? null : productMasterInfoItem, (i & 65536) != 0 ? null : validateSerialByDealer, (i & 131072) != 0 ? null : campaignProductCategoryItem, (i & 262144) != 0 ? new ArrayList() : list3, (i & 524288) != 0 ? null : data, (i & 1048576) != 0 ? null : oneAddressMailingData, (i & 2097152) != 0 ? null : idCardInformationCollection, (i & 4194304) != 0 ? null : list4, (i & 8388608) != 0 ? false : z5, (i & 16777216) != 0 ? null : dataItem, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : data2, (i & 67108864) != 0 ? null : postpaidValidateConsentViaAPIGWData, (i & 134217728) != 0 ? null : str8, (i & 268435456) != 0 ? null : propositionListItem, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : priceplanListItem, (i & 1073741824) != 0 ? null : priceplanListItem2, (i & Integer.MIN_VALUE) != 0 ? null : oneDeviceSaleAuthorizationData, (i2 & 1) != 0 ? null : str9, (i2 & 2) != 0 ? "" : str10, (i2 & 4) != 0 ? null : oneDeviceSaleValidateStockData, (i2 & 8) != 0 ? null : oneValidateExistingCustomerScoreResponse, (i2 & 16) != 0 ? null : validateBlacklist3OperData, (i2 & 32) != 0 ? null : oneValidateExtraAdvancePaymentResponse, (i2 & 64) != 0 ? null : oneValidateAllowProtectionResponse, (i2 & 128) != 0 ? null : oneVerifyPrivilegeSubscribeResponse, (i2 & 256) != 0 ? null : list5, (i2 & 512) != 0 ? null : str11, (i2 & 1024) != 0 ? false : z6, (i2 & 2048) != 0 ? null : oneDeviceSaleData, (i2 & 4096) != 0 ? null : data3, (i2 & 8192) != 0 ? null : onePre2PostVerifySubscriberPreToPostData, (i2 & 16384) != 0 ? null : trueProtectPackage, (i2 & 32768) != 0 ? null : arrayList, (i2 & 65536) != 0 ? Boolean.FALSE : bool, (i2 & 131072) != 0 ? "" : str12, (i2 & 262144) != 0 ? false : z7, (i2 & 524288) != 0 ? "" : str13, (i2 & 1048576) != 0 ? new ArrayList() : arrayList2, (i2 & 2097152) != 0 ? "" : str14, (i2 & 4194304) != 0 ? false : z8, (i2 & 8388608) != 0 ? null : onePre2PostValidatePre2PostTrueCompanyDataResponse, (i2 & 16777216) != 0 ? null : upPassFormResult, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? data4 : null);
    }
}
