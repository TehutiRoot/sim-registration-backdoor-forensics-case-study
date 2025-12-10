package th.p047co.dtac.android.dtacone.model.appOne.device_salve;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSet;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidatePackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.ContractItem;
import th.p047co.dtac.android.dtacone.model.device_sale.Campaign;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleCampaignResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleItemInfo;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.model.device_sale.FieldInput;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageItem;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.util.p052enum.DeviceSaleCampaignType;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ReceiptInfo;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0003\b\u0088\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00101\u001a\u00020\u0007\u0012\b\b\u0002\u00102\u001a\u00020\u0003\u0012\b\b\u0002\u00103\u001a\u00020\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105¢\u0006\u0002\u00106J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010PJ\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010.HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010cJ\n\u0010®\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010¸\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Jö\u0002\u0010¹\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u000105HÆ\u0001¢\u0006\u0003\u0010º\u0001J\u0015\u0010»\u0001\u001a\u00020\u00032\t\u0010¼\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010½\u0001\u001a\u00030¾\u0001HÖ\u0001J\n\u0010¿\u0001\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001c\u0010/\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010`\"\u0004\ba\u0010bR\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\b0\u0010c\"\u0004\bd\u0010eR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010`\"\u0004\bg\u0010bR\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010`\"\u0004\bh\u0010bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010`\"\u0004\bi\u0010bR\u001a\u00102\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010`\"\u0004\bj\u0010bR\u001a\u00103\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010`\"\u0004\bk\u0010bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010Y\"\u0004\bu\u0010[R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001e\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u00101\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u00108\"\u0005\b\u008b\u0001\u0010:R \u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u00108\"\u0005\b\u0091\u0001\u0010:R \u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006À\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/device_salve/OneDeviceSaleModel;", "", "isRequirePaymentInfo", "", "flowIdCampaignType", "Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "customerNumber", "canBuyDeviceWithContract", "verifySubscriberModel", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;", "itemInfo", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;", "campaign", "Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "inputFields", "", "Lth/co/dtac/android/dtacone/model/device_sale/FieldInput;", "blacklistSharingStatus", "extraAdvanceAmount", "", "receiptInfo", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;", "newIMEIResponse", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "isFromPostpaid", "selectedDiscount", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "deviceSummaryContractItem", "Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "check1IDXDeviceResponse", "Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "isOverruleSuccess", "isDefaultPackage", "validateSimBarcodeResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "mPackage", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "packageSetRetailer", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "packageGroupCodeResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;", "specialPackageItem", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "postpaidPackageSetRetailerResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "hardwareNumberResponse", "isDeviceInfoScreen", "simBarcode", "isWithContract", "isWithDevice", "deviceSaleCampaignResponse", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignResponse;", "(ZLth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;Lth/co/dtac/android/dtacone/model/device_sale/Campaign;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;ZLth/co/dtac/android/dtacone/model/device_sale/Discount;Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;ZZLth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/Boolean;Ljava/lang/String;ZZLth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignResponse;)V", "getBlacklistSharingStatus", "()Ljava/lang/String;", "setBlacklistSharingStatus", "(Ljava/lang/String;)V", "getCampaign", "()Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "setCampaign", "(Lth/co/dtac/android/dtacone/model/device_sale/Campaign;)V", "getCanBuyDeviceWithContract", "setCanBuyDeviceWithContract", "getCheck1IDXDeviceResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "setCheck1IDXDeviceResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;)V", "getCustomerNumber", "setCustomerNumber", "getDeviceSaleCampaignResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignResponse;", "setDeviceSaleCampaignResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignResponse;)V", "getDeviceSummaryContractItem", "()Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "setDeviceSummaryContractItem", "(Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;)V", "getExtraAdvanceAmount", "()Ljava/lang/Float;", "setExtraAdvanceAmount", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getFlowIdCampaignType", "()Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;", "setFlowIdCampaignType", "(Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;)V", "getHardwareNumberResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "setHardwareNumberResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;)V", "getInputFields", "()Ljava/util/List;", "setInputFields", "(Ljava/util/List;)V", "()Z", "setDefaultPackage", "(Z)V", "()Ljava/lang/Boolean;", "setDeviceInfoScreen", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setFromPostpaid", "setOverruleSuccess", "setRequirePaymentInfo", "setWithContract", "setWithDevice", "getItemInfo", "()Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;", "setItemInfo", "(Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;)V", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "getNewIMEIResponse", "setNewIMEIResponse", "getPackageGroupCodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;", "setPackageGroupCodeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;)V", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "setPackageSetRetailer", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;)V", "getPostpaidPackageSetRetailerResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "setPostpaidPackageSetRetailerResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;)V", "getReceiptInfo", "()Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;", "setReceiptInfo", "(Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;)V", "getSelectedDiscount", "()Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "setSelectedDiscount", "(Lth/co/dtac/android/dtacone/model/device_sale/Discount;)V", "getSimBarcode", "setSimBarcode", "getSpecialPackageItem", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "setSpecialPackageItem", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;)V", "getSubscriberNumber", "setSubscriberNumber", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;)V", "getVerifySubscriberModel", "()Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;", "setVerifySubscriberModel", "(Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;Lth/co/dtac/android/dtacone/model/device_sale/Campaign;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;ZLth/co/dtac/android/dtacone/model/device_sale/Discount;Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;ZZLth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/Boolean;Ljava/lang/String;ZZLth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignResponse;)Lth/co/dtac/android/dtacone/model/appOne/device_salve/OneDeviceSaleModel;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.device_salve.OneDeviceSaleModel */
/* loaded from: classes8.dex */
public final class OneDeviceSaleModel {
    public static final int $stable = 8;
    @Nullable
    private String blacklistSharingStatus;
    @Nullable
    private Campaign campaign;
    @Nullable
    private String canBuyDeviceWithContract;
    @Nullable
    private Check1IDXDeviceResponse check1IDXDeviceResponse;
    @NotNull
    private String customerNumber;
    @Nullable
    private DeviceSaleCampaignResponse deviceSaleCampaignResponse;
    @Nullable
    private ContractItem deviceSummaryContractItem;
    @Nullable
    private Float extraAdvanceAmount;
    @NotNull
    private DeviceSaleCampaignType flowIdCampaignType;
    @Nullable
    private GetNewIMEIResponse hardwareNumberResponse;
    @Nullable
    private List<FieldInput> inputFields;
    private boolean isDefaultPackage;
    @Nullable
    private Boolean isDeviceInfoScreen;
    private boolean isFromPostpaid;
    private boolean isOverruleSuccess;
    private boolean isRequirePaymentInfo;
    private transient boolean isWithContract;
    private transient boolean isWithDevice;
    @Nullable
    private DeviceSaleItemInfo itemInfo;
    @Nullable
    private Package mPackage;
    @Nullable
    private GetNewIMEIResponse newIMEIResponse;
    @Nullable
    private OnePostpaidValidatePackageGroupCodeResponse packageGroupCodeResponse;
    @Nullable
    private OnePostpaidPackageSet packageSetRetailer;
    @Nullable
    private OnePostpaidPackageSetResponse postpaidPackageSetRetailerResponse;
    @Nullable
    private ReceiptInfo receiptInfo;
    @Nullable
    private Discount selectedDiscount;
    @NotNull
    private transient String simBarcode;
    @Nullable
    private SpecialPackageItem specialPackageItem;
    @NotNull
    private String subscriberNumber;
    @Nullable
    private OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse;
    @Nullable
    private DeviceSaleVerifySubrResponse verifySubscriberModel;

    public OneDeviceSaleModel() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, Integer.MAX_VALUE, null);
    }

    public final boolean component1() {
        return this.isRequirePaymentInfo;
    }

    @Nullable
    public final String component10() {
        return this.blacklistSharingStatus;
    }

    @Nullable
    public final Float component11() {
        return this.extraAdvanceAmount;
    }

    @Nullable
    public final ReceiptInfo component12() {
        return this.receiptInfo;
    }

    @Nullable
    public final GetNewIMEIResponse component13() {
        return this.newIMEIResponse;
    }

    public final boolean component14() {
        return this.isFromPostpaid;
    }

    @Nullable
    public final Discount component15() {
        return this.selectedDiscount;
    }

    @Nullable
    public final ContractItem component16() {
        return this.deviceSummaryContractItem;
    }

    @Nullable
    public final Check1IDXDeviceResponse component17() {
        return this.check1IDXDeviceResponse;
    }

    public final boolean component18() {
        return this.isOverruleSuccess;
    }

    public final boolean component19() {
        return this.isDefaultPackage;
    }

    @NotNull
    public final DeviceSaleCampaignType component2() {
        return this.flowIdCampaignType;
    }

    @Nullable
    public final OnePostpaidValidateSimBarcodeResponse component20() {
        return this.validateSimBarcodeResponse;
    }

    @Nullable
    public final Package component21() {
        return this.mPackage;
    }

    @Nullable
    public final OnePostpaidPackageSet component22() {
        return this.packageSetRetailer;
    }

    @Nullable
    public final OnePostpaidValidatePackageGroupCodeResponse component23() {
        return this.packageGroupCodeResponse;
    }

    @Nullable
    public final SpecialPackageItem component24() {
        return this.specialPackageItem;
    }

    @Nullable
    public final OnePostpaidPackageSetResponse component25() {
        return this.postpaidPackageSetRetailerResponse;
    }

    @Nullable
    public final GetNewIMEIResponse component26() {
        return this.hardwareNumberResponse;
    }

    @Nullable
    public final Boolean component27() {
        return this.isDeviceInfoScreen;
    }

    @NotNull
    public final String component28() {
        return this.simBarcode;
    }

    public final boolean component29() {
        return this.isWithContract;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    public final boolean component30() {
        return this.isWithDevice;
    }

    @Nullable
    public final DeviceSaleCampaignResponse component31() {
        return this.deviceSaleCampaignResponse;
    }

    @NotNull
    public final String component4() {
        return this.customerNumber;
    }

    @Nullable
    public final String component5() {
        return this.canBuyDeviceWithContract;
    }

    @Nullable
    public final DeviceSaleVerifySubrResponse component6() {
        return this.verifySubscriberModel;
    }

    @Nullable
    public final DeviceSaleItemInfo component7() {
        return this.itemInfo;
    }

    @Nullable
    public final Campaign component8() {
        return this.campaign;
    }

    @Nullable
    public final List<FieldInput> component9() {
        return this.inputFields;
    }

    @NotNull
    public final OneDeviceSaleModel copy(boolean z, @NotNull DeviceSaleCampaignType flowIdCampaignType, @NotNull String subscriberNumber, @NotNull String customerNumber, @Nullable String str, @Nullable DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse, @Nullable DeviceSaleItemInfo deviceSaleItemInfo, @Nullable Campaign campaign, @Nullable List<FieldInput> list, @Nullable String str2, @Nullable Float f, @Nullable ReceiptInfo receiptInfo, @Nullable GetNewIMEIResponse getNewIMEIResponse, boolean z2, @Nullable Discount discount, @Nullable ContractItem contractItem, @Nullable Check1IDXDeviceResponse check1IDXDeviceResponse, boolean z3, boolean z4, @Nullable OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse, @Nullable Package r54, @Nullable OnePostpaidPackageSet onePostpaidPackageSet, @Nullable OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse, @Nullable SpecialPackageItem specialPackageItem, @Nullable OnePostpaidPackageSetResponse onePostpaidPackageSetResponse, @Nullable GetNewIMEIResponse getNewIMEIResponse2, @Nullable Boolean bool, @NotNull String simBarcode, boolean z5, boolean z6, @Nullable DeviceSaleCampaignResponse deviceSaleCampaignResponse) {
        Intrinsics.checkNotNullParameter(flowIdCampaignType, "flowIdCampaignType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(simBarcode, "simBarcode");
        return new OneDeviceSaleModel(z, flowIdCampaignType, subscriberNumber, customerNumber, str, deviceSaleVerifySubrResponse, deviceSaleItemInfo, campaign, list, str2, f, receiptInfo, getNewIMEIResponse, z2, discount, contractItem, check1IDXDeviceResponse, z3, z4, onePostpaidValidateSimBarcodeResponse, r54, onePostpaidPackageSet, onePostpaidValidatePackageGroupCodeResponse, specialPackageItem, onePostpaidPackageSetResponse, getNewIMEIResponse2, bool, simBarcode, z5, z6, deviceSaleCampaignResponse);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleModel) {
            OneDeviceSaleModel oneDeviceSaleModel = (OneDeviceSaleModel) obj;
            return this.isRequirePaymentInfo == oneDeviceSaleModel.isRequirePaymentInfo && this.flowIdCampaignType == oneDeviceSaleModel.flowIdCampaignType && Intrinsics.areEqual(this.subscriberNumber, oneDeviceSaleModel.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, oneDeviceSaleModel.customerNumber) && Intrinsics.areEqual(this.canBuyDeviceWithContract, oneDeviceSaleModel.canBuyDeviceWithContract) && Intrinsics.areEqual(this.verifySubscriberModel, oneDeviceSaleModel.verifySubscriberModel) && Intrinsics.areEqual(this.itemInfo, oneDeviceSaleModel.itemInfo) && Intrinsics.areEqual(this.campaign, oneDeviceSaleModel.campaign) && Intrinsics.areEqual(this.inputFields, oneDeviceSaleModel.inputFields) && Intrinsics.areEqual(this.blacklistSharingStatus, oneDeviceSaleModel.blacklistSharingStatus) && Intrinsics.areEqual((Object) this.extraAdvanceAmount, (Object) oneDeviceSaleModel.extraAdvanceAmount) && Intrinsics.areEqual(this.receiptInfo, oneDeviceSaleModel.receiptInfo) && Intrinsics.areEqual(this.newIMEIResponse, oneDeviceSaleModel.newIMEIResponse) && this.isFromPostpaid == oneDeviceSaleModel.isFromPostpaid && Intrinsics.areEqual(this.selectedDiscount, oneDeviceSaleModel.selectedDiscount) && Intrinsics.areEqual(this.deviceSummaryContractItem, oneDeviceSaleModel.deviceSummaryContractItem) && Intrinsics.areEqual(this.check1IDXDeviceResponse, oneDeviceSaleModel.check1IDXDeviceResponse) && this.isOverruleSuccess == oneDeviceSaleModel.isOverruleSuccess && this.isDefaultPackage == oneDeviceSaleModel.isDefaultPackage && Intrinsics.areEqual(this.validateSimBarcodeResponse, oneDeviceSaleModel.validateSimBarcodeResponse) && Intrinsics.areEqual(this.mPackage, oneDeviceSaleModel.mPackage) && Intrinsics.areEqual(this.packageSetRetailer, oneDeviceSaleModel.packageSetRetailer) && Intrinsics.areEqual(this.packageGroupCodeResponse, oneDeviceSaleModel.packageGroupCodeResponse) && Intrinsics.areEqual(this.specialPackageItem, oneDeviceSaleModel.specialPackageItem) && Intrinsics.areEqual(this.postpaidPackageSetRetailerResponse, oneDeviceSaleModel.postpaidPackageSetRetailerResponse) && Intrinsics.areEqual(this.hardwareNumberResponse, oneDeviceSaleModel.hardwareNumberResponse) && Intrinsics.areEqual(this.isDeviceInfoScreen, oneDeviceSaleModel.isDeviceInfoScreen) && Intrinsics.areEqual(this.simBarcode, oneDeviceSaleModel.simBarcode) && this.isWithContract == oneDeviceSaleModel.isWithContract && this.isWithDevice == oneDeviceSaleModel.isWithDevice && Intrinsics.areEqual(this.deviceSaleCampaignResponse, oneDeviceSaleModel.deviceSaleCampaignResponse);
        }
        return false;
    }

    @Nullable
    public final String getBlacklistSharingStatus() {
        return this.blacklistSharingStatus;
    }

    @Nullable
    public final Campaign getCampaign() {
        return this.campaign;
    }

    @Nullable
    public final String getCanBuyDeviceWithContract() {
        return this.canBuyDeviceWithContract;
    }

    @Nullable
    public final Check1IDXDeviceResponse getCheck1IDXDeviceResponse() {
        return this.check1IDXDeviceResponse;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final DeviceSaleCampaignResponse getDeviceSaleCampaignResponse() {
        return this.deviceSaleCampaignResponse;
    }

    @Nullable
    public final ContractItem getDeviceSummaryContractItem() {
        return this.deviceSummaryContractItem;
    }

    @Nullable
    public final Float getExtraAdvanceAmount() {
        return this.extraAdvanceAmount;
    }

    @NotNull
    public final DeviceSaleCampaignType getFlowIdCampaignType() {
        return this.flowIdCampaignType;
    }

    @Nullable
    public final GetNewIMEIResponse getHardwareNumberResponse() {
        return this.hardwareNumberResponse;
    }

    @Nullable
    public final List<FieldInput> getInputFields() {
        return this.inputFields;
    }

    @Nullable
    public final DeviceSaleItemInfo getItemInfo() {
        return this.itemInfo;
    }

    @Nullable
    public final Package getMPackage() {
        return this.mPackage;
    }

    @Nullable
    public final GetNewIMEIResponse getNewIMEIResponse() {
        return this.newIMEIResponse;
    }

    @Nullable
    public final OnePostpaidValidatePackageGroupCodeResponse getPackageGroupCodeResponse() {
        return this.packageGroupCodeResponse;
    }

    @Nullable
    public final OnePostpaidPackageSet getPackageSetRetailer() {
        return this.packageSetRetailer;
    }

    @Nullable
    public final OnePostpaidPackageSetResponse getPostpaidPackageSetRetailerResponse() {
        return this.postpaidPackageSetRetailerResponse;
    }

    @Nullable
    public final ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    @Nullable
    public final Discount getSelectedDiscount() {
        return this.selectedDiscount;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.simBarcode;
    }

    @Nullable
    public final SpecialPackageItem getSpecialPackageItem() {
        return this.specialPackageItem;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final OnePostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.validateSimBarcodeResponse;
    }

    @Nullable
    public final DeviceSaleVerifySubrResponse getVerifySubscriberModel() {
        return this.verifySubscriberModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v74, types: [boolean] */
    public int hashCode() {
        boolean z = this.isRequirePaymentInfo;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((((r0 * 31) + this.flowIdCampaignType.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31;
        String str = this.canBuyDeviceWithContract;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse = this.verifySubscriberModel;
        int hashCode3 = (hashCode2 + (deviceSaleVerifySubrResponse == null ? 0 : deviceSaleVerifySubrResponse.hashCode())) * 31;
        DeviceSaleItemInfo deviceSaleItemInfo = this.itemInfo;
        int hashCode4 = (hashCode3 + (deviceSaleItemInfo == null ? 0 : deviceSaleItemInfo.hashCode())) * 31;
        Campaign campaign = this.campaign;
        int hashCode5 = (hashCode4 + (campaign == null ? 0 : campaign.hashCode())) * 31;
        List<FieldInput> list = this.inputFields;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.blacklistSharingStatus;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.extraAdvanceAmount;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        ReceiptInfo receiptInfo = this.receiptInfo;
        int hashCode9 = (hashCode8 + (receiptInfo == null ? 0 : receiptInfo.hashCode())) * 31;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        int hashCode10 = (hashCode9 + (getNewIMEIResponse == null ? 0 : getNewIMEIResponse.hashCode())) * 31;
        ?? r2 = this.isFromPostpaid;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int i2 = (hashCode10 + i) * 31;
        Discount discount = this.selectedDiscount;
        int hashCode11 = (i2 + (discount == null ? 0 : discount.hashCode())) * 31;
        ContractItem contractItem = this.deviceSummaryContractItem;
        int hashCode12 = (hashCode11 + (contractItem == null ? 0 : contractItem.hashCode())) * 31;
        Check1IDXDeviceResponse check1IDXDeviceResponse = this.check1IDXDeviceResponse;
        int hashCode13 = (hashCode12 + (check1IDXDeviceResponse == null ? 0 : check1IDXDeviceResponse.hashCode())) * 31;
        ?? r22 = this.isOverruleSuccess;
        int i3 = r22;
        if (r22 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode13 + i3) * 31;
        ?? r23 = this.isDefaultPackage;
        int i5 = r23;
        if (r23 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse = this.validateSimBarcodeResponse;
        int hashCode14 = (i6 + (onePostpaidValidateSimBarcodeResponse == null ? 0 : onePostpaidValidateSimBarcodeResponse.hashCode())) * 31;
        Package r24 = this.mPackage;
        int hashCode15 = (hashCode14 + (r24 == null ? 0 : r24.hashCode())) * 31;
        OnePostpaidPackageSet onePostpaidPackageSet = this.packageSetRetailer;
        int hashCode16 = (hashCode15 + (onePostpaidPackageSet == null ? 0 : onePostpaidPackageSet.hashCode())) * 31;
        OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse = this.packageGroupCodeResponse;
        int hashCode17 = (hashCode16 + (onePostpaidValidatePackageGroupCodeResponse == null ? 0 : onePostpaidValidatePackageGroupCodeResponse.hashCode())) * 31;
        SpecialPackageItem specialPackageItem = this.specialPackageItem;
        int hashCode18 = (hashCode17 + (specialPackageItem == null ? 0 : specialPackageItem.hashCode())) * 31;
        OnePostpaidPackageSetResponse onePostpaidPackageSetResponse = this.postpaidPackageSetRetailerResponse;
        int hashCode19 = (hashCode18 + (onePostpaidPackageSetResponse == null ? 0 : onePostpaidPackageSetResponse.hashCode())) * 31;
        GetNewIMEIResponse getNewIMEIResponse2 = this.hardwareNumberResponse;
        int hashCode20 = (hashCode19 + (getNewIMEIResponse2 == null ? 0 : getNewIMEIResponse2.hashCode())) * 31;
        Boolean bool = this.isDeviceInfoScreen;
        int hashCode21 = (((hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31) + this.simBarcode.hashCode()) * 31;
        ?? r25 = this.isWithContract;
        int i7 = r25;
        if (r25 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode21 + i7) * 31;
        boolean z2 = this.isWithDevice;
        int i9 = (i8 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        DeviceSaleCampaignResponse deviceSaleCampaignResponse = this.deviceSaleCampaignResponse;
        return i9 + (deviceSaleCampaignResponse != null ? deviceSaleCampaignResponse.hashCode() : 0);
    }

    public final boolean isDefaultPackage() {
        return this.isDefaultPackage;
    }

    @Nullable
    public final Boolean isDeviceInfoScreen() {
        return this.isDeviceInfoScreen;
    }

    public final boolean isFromPostpaid() {
        return this.isFromPostpaid;
    }

    public final boolean isOverruleSuccess() {
        return this.isOverruleSuccess;
    }

    public final boolean isRequirePaymentInfo() {
        return this.isRequirePaymentInfo;
    }

    public final boolean isWithContract() {
        return this.isWithContract;
    }

    public final boolean isWithDevice() {
        return this.isWithDevice;
    }

    public final void setBlacklistSharingStatus(@Nullable String str) {
        this.blacklistSharingStatus = str;
    }

    public final void setCampaign(@Nullable Campaign campaign) {
        this.campaign = campaign;
    }

    public final void setCanBuyDeviceWithContract(@Nullable String str) {
        this.canBuyDeviceWithContract = str;
    }

    public final void setCheck1IDXDeviceResponse(@Nullable Check1IDXDeviceResponse check1IDXDeviceResponse) {
        this.check1IDXDeviceResponse = check1IDXDeviceResponse;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setDefaultPackage(boolean z) {
        this.isDefaultPackage = z;
    }

    public final void setDeviceInfoScreen(@Nullable Boolean bool) {
        this.isDeviceInfoScreen = bool;
    }

    public final void setDeviceSaleCampaignResponse(@Nullable DeviceSaleCampaignResponse deviceSaleCampaignResponse) {
        this.deviceSaleCampaignResponse = deviceSaleCampaignResponse;
    }

    public final void setDeviceSummaryContractItem(@Nullable ContractItem contractItem) {
        this.deviceSummaryContractItem = contractItem;
    }

    public final void setExtraAdvanceAmount(@Nullable Float f) {
        this.extraAdvanceAmount = f;
    }

    public final void setFlowIdCampaignType(@NotNull DeviceSaleCampaignType deviceSaleCampaignType) {
        Intrinsics.checkNotNullParameter(deviceSaleCampaignType, "<set-?>");
        this.flowIdCampaignType = deviceSaleCampaignType;
    }

    public final void setFromPostpaid(boolean z) {
        this.isFromPostpaid = z;
    }

    public final void setHardwareNumberResponse(@Nullable GetNewIMEIResponse getNewIMEIResponse) {
        this.hardwareNumberResponse = getNewIMEIResponse;
    }

    public final void setInputFields(@Nullable List<FieldInput> list) {
        this.inputFields = list;
    }

    public final void setItemInfo(@Nullable DeviceSaleItemInfo deviceSaleItemInfo) {
        this.itemInfo = deviceSaleItemInfo;
    }

    public final void setMPackage(@Nullable Package r1) {
        this.mPackage = r1;
    }

    public final void setNewIMEIResponse(@Nullable GetNewIMEIResponse getNewIMEIResponse) {
        this.newIMEIResponse = getNewIMEIResponse;
    }

    public final void setOverruleSuccess(boolean z) {
        this.isOverruleSuccess = z;
    }

    public final void setPackageGroupCodeResponse(@Nullable OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse) {
        this.packageGroupCodeResponse = onePostpaidValidatePackageGroupCodeResponse;
    }

    public final void setPackageSetRetailer(@Nullable OnePostpaidPackageSet onePostpaidPackageSet) {
        this.packageSetRetailer = onePostpaidPackageSet;
    }

    public final void setPostpaidPackageSetRetailerResponse(@Nullable OnePostpaidPackageSetResponse onePostpaidPackageSetResponse) {
        this.postpaidPackageSetRetailerResponse = onePostpaidPackageSetResponse;
    }

    public final void setReceiptInfo(@Nullable ReceiptInfo receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    public final void setRequirePaymentInfo(boolean z) {
        this.isRequirePaymentInfo = z;
    }

    public final void setSelectedDiscount(@Nullable Discount discount) {
        this.selectedDiscount = discount;
    }

    public final void setSimBarcode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simBarcode = str;
    }

    public final void setSpecialPackageItem(@Nullable SpecialPackageItem specialPackageItem) {
        this.specialPackageItem = specialPackageItem;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setValidateSimBarcodeResponse(@Nullable OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse) {
        this.validateSimBarcodeResponse = onePostpaidValidateSimBarcodeResponse;
    }

    public final void setVerifySubscriberModel(@Nullable DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse) {
        this.verifySubscriberModel = deviceSaleVerifySubrResponse;
    }

    public final void setWithContract(boolean z) {
        this.isWithContract = z;
    }

    public final void setWithDevice(boolean z) {
        this.isWithDevice = z;
    }

    @NotNull
    public String toString() {
        boolean z = this.isRequirePaymentInfo;
        DeviceSaleCampaignType deviceSaleCampaignType = this.flowIdCampaignType;
        String str = this.subscriberNumber;
        String str2 = this.customerNumber;
        String str3 = this.canBuyDeviceWithContract;
        DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse = this.verifySubscriberModel;
        DeviceSaleItemInfo deviceSaleItemInfo = this.itemInfo;
        Campaign campaign = this.campaign;
        List<FieldInput> list = this.inputFields;
        String str4 = this.blacklistSharingStatus;
        Float f = this.extraAdvanceAmount;
        ReceiptInfo receiptInfo = this.receiptInfo;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        boolean z2 = this.isFromPostpaid;
        Discount discount = this.selectedDiscount;
        ContractItem contractItem = this.deviceSummaryContractItem;
        Check1IDXDeviceResponse check1IDXDeviceResponse = this.check1IDXDeviceResponse;
        boolean z3 = this.isOverruleSuccess;
        boolean z4 = this.isDefaultPackage;
        OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse = this.validateSimBarcodeResponse;
        Package r15 = this.mPackage;
        OnePostpaidPackageSet onePostpaidPackageSet = this.packageSetRetailer;
        OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse = this.packageGroupCodeResponse;
        SpecialPackageItem specialPackageItem = this.specialPackageItem;
        OnePostpaidPackageSetResponse onePostpaidPackageSetResponse = this.postpaidPackageSetRetailerResponse;
        GetNewIMEIResponse getNewIMEIResponse2 = this.hardwareNumberResponse;
        Boolean bool = this.isDeviceInfoScreen;
        String str5 = this.simBarcode;
        boolean z5 = this.isWithContract;
        boolean z6 = this.isWithDevice;
        DeviceSaleCampaignResponse deviceSaleCampaignResponse = this.deviceSaleCampaignResponse;
        return "OneDeviceSaleModel(isRequirePaymentInfo=" + z + ", flowIdCampaignType=" + deviceSaleCampaignType + ", subscriberNumber=" + str + ", customerNumber=" + str2 + ", canBuyDeviceWithContract=" + str3 + ", verifySubscriberModel=" + deviceSaleVerifySubrResponse + ", itemInfo=" + deviceSaleItemInfo + ", campaign=" + campaign + ", inputFields=" + list + ", blacklistSharingStatus=" + str4 + ", extraAdvanceAmount=" + f + ", receiptInfo=" + receiptInfo + ", newIMEIResponse=" + getNewIMEIResponse + ", isFromPostpaid=" + z2 + ", selectedDiscount=" + discount + ", deviceSummaryContractItem=" + contractItem + ", check1IDXDeviceResponse=" + check1IDXDeviceResponse + ", isOverruleSuccess=" + z3 + ", isDefaultPackage=" + z4 + ", validateSimBarcodeResponse=" + onePostpaidValidateSimBarcodeResponse + ", mPackage=" + r15 + ", packageSetRetailer=" + onePostpaidPackageSet + ", packageGroupCodeResponse=" + onePostpaidValidatePackageGroupCodeResponse + ", specialPackageItem=" + specialPackageItem + ", postpaidPackageSetRetailerResponse=" + onePostpaidPackageSetResponse + ", hardwareNumberResponse=" + getNewIMEIResponse2 + ", isDeviceInfoScreen=" + bool + ", simBarcode=" + str5 + ", isWithContract=" + z5 + ", isWithDevice=" + z6 + ", deviceSaleCampaignResponse=" + deviceSaleCampaignResponse + ")";
    }

    public OneDeviceSaleModel(boolean z, @NotNull DeviceSaleCampaignType flowIdCampaignType, @NotNull String subscriberNumber, @NotNull String customerNumber, @Nullable String str, @Nullable DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse, @Nullable DeviceSaleItemInfo deviceSaleItemInfo, @Nullable Campaign campaign, @Nullable List<FieldInput> list, @Nullable String str2, @Nullable Float f, @Nullable ReceiptInfo receiptInfo, @Nullable GetNewIMEIResponse getNewIMEIResponse, boolean z2, @Nullable Discount discount, @Nullable ContractItem contractItem, @Nullable Check1IDXDeviceResponse check1IDXDeviceResponse, boolean z3, boolean z4, @Nullable OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse, @Nullable Package r27, @Nullable OnePostpaidPackageSet onePostpaidPackageSet, @Nullable OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse, @Nullable SpecialPackageItem specialPackageItem, @Nullable OnePostpaidPackageSetResponse onePostpaidPackageSetResponse, @Nullable GetNewIMEIResponse getNewIMEIResponse2, @Nullable Boolean bool, @NotNull String simBarcode, boolean z5, boolean z6, @Nullable DeviceSaleCampaignResponse deviceSaleCampaignResponse) {
        Intrinsics.checkNotNullParameter(flowIdCampaignType, "flowIdCampaignType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(simBarcode, "simBarcode");
        this.isRequirePaymentInfo = z;
        this.flowIdCampaignType = flowIdCampaignType;
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
        this.canBuyDeviceWithContract = str;
        this.verifySubscriberModel = deviceSaleVerifySubrResponse;
        this.itemInfo = deviceSaleItemInfo;
        this.campaign = campaign;
        this.inputFields = list;
        this.blacklistSharingStatus = str2;
        this.extraAdvanceAmount = f;
        this.receiptInfo = receiptInfo;
        this.newIMEIResponse = getNewIMEIResponse;
        this.isFromPostpaid = z2;
        this.selectedDiscount = discount;
        this.deviceSummaryContractItem = contractItem;
        this.check1IDXDeviceResponse = check1IDXDeviceResponse;
        this.isOverruleSuccess = z3;
        this.isDefaultPackage = z4;
        this.validateSimBarcodeResponse = onePostpaidValidateSimBarcodeResponse;
        this.mPackage = r27;
        this.packageSetRetailer = onePostpaidPackageSet;
        this.packageGroupCodeResponse = onePostpaidValidatePackageGroupCodeResponse;
        this.specialPackageItem = specialPackageItem;
        this.postpaidPackageSetRetailerResponse = onePostpaidPackageSetResponse;
        this.hardwareNumberResponse = getNewIMEIResponse2;
        this.isDeviceInfoScreen = bool;
        this.simBarcode = simBarcode;
        this.isWithContract = z5;
        this.isWithDevice = z6;
        this.deviceSaleCampaignResponse = deviceSaleCampaignResponse;
    }

    public /* synthetic */ OneDeviceSaleModel(boolean z, DeviceSaleCampaignType deviceSaleCampaignType, String str, String str2, String str3, DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse, DeviceSaleItemInfo deviceSaleItemInfo, Campaign campaign, List list, String str4, Float f, ReceiptInfo receiptInfo, GetNewIMEIResponse getNewIMEIResponse, boolean z2, Discount discount, ContractItem contractItem, Check1IDXDeviceResponse check1IDXDeviceResponse, boolean z3, boolean z4, OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse, Package r53, OnePostpaidPackageSet onePostpaidPackageSet, OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse, SpecialPackageItem specialPackageItem, OnePostpaidPackageSetResponse onePostpaidPackageSetResponse, GetNewIMEIResponse getNewIMEIResponse2, Boolean bool, String str5, boolean z5, boolean z6, DeviceSaleCampaignResponse deviceSaleCampaignResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? DeviceSaleCampaignType.NO_CONTRACT : deviceSaleCampaignType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : deviceSaleVerifySubrResponse, (i & 64) != 0 ? null : deviceSaleItemInfo, (i & 128) != 0 ? null : campaign, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : receiptInfo, (i & 4096) != 0 ? null : getNewIMEIResponse, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? null : discount, (i & 32768) != 0 ? null : contractItem, (i & 65536) != 0 ? null : check1IDXDeviceResponse, (i & 131072) != 0 ? false : z3, (i & 262144) != 0 ? false : z4, (i & 524288) != 0 ? null : onePostpaidValidateSimBarcodeResponse, (i & 1048576) != 0 ? null : r53, (i & 2097152) != 0 ? null : onePostpaidPackageSet, (i & 4194304) != 0 ? null : onePostpaidValidatePackageGroupCodeResponse, (i & 8388608) != 0 ? null : specialPackageItem, (i & 16777216) != 0 ? null : onePostpaidPackageSetResponse, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : getNewIMEIResponse2, (i & 67108864) != 0 ? Boolean.FALSE : bool, (i & 134217728) != 0 ? "" : str5, (i & 268435456) != 0 ? false : z5, (i & PKIFailureInfo.duplicateCertReq) != 0 ? false : z6, (i & 1073741824) != 0 ? null : deviceSaleCampaignResponse);
    }
}
