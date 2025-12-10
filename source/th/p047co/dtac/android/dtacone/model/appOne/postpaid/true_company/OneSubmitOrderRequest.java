package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest;", "", "orderId", "", "orderData", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData;", "flowName", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData;Ljava/lang/String;)V", "getFlowName", "()Ljava/lang/String;", "getOrderData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData;", "getOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "OrderData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneSubmitOrderRequest */
/* loaded from: classes8.dex */
public final class OneSubmitOrderRequest {
    public static final int $stable = 0;
    @SerializedName("flowName")
    @Nullable
    private final String flowName;
    @SerializedName("orderData")
    @Nullable
    private final OrderData orderData;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001^B½\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010O\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÆ\u0002\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u001c2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!¨\u0006_"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData;", "", "idType", "", "serialNumber", HintConstants.AUTOFILL_HINT_GENDER, "partnerCode", "readCard", "serviceCode", "saleCode", "custName", "idNumber", "serviceName", "productName", "consentId", "eSign", "packageCode", "productIdNumber", "campaignName", "propoPromo", "campaignCode", "priceplanRc", "faceRecogStatus", "isIdentical", "confidentRatio", "faceCustCert", "approver", "deviceFlag", "", "device", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData$Device;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData$Device;)V", "getApprover", "()Ljava/lang/String;", "getCampaignCode", "getCampaignName", "getConfidentRatio", "getConsentId", "getCustName", "getDevice", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData$Device;", "getDeviceFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getESign", "getFaceCustCert", "getFaceRecogStatus", "getGender", "getIdNumber", "getIdType", "getPackageCode", "getPartnerCode", "getPriceplanRc", "getProductIdNumber", "getProductName", "getPropoPromo", "getReadCard", "getSaleCode", "getSerialNumber", "getServiceCode", "getServiceName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData$Device;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData;", "equals", "other", "hashCode", "", "toString", "Device", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneSubmitOrderRequest$OrderData */
    /* loaded from: classes8.dex */
    public static final class OrderData {
        public static final int $stable = 0;
        @SerializedName("approver")
        @Nullable
        private final String approver;
        @SerializedName("campaignCode")
        @Nullable
        private final String campaignCode;
        @SerializedName("campaignName")
        @Nullable
        private final String campaignName;
        @SerializedName("confidentRatio")
        @Nullable
        private final String confidentRatio;
        @SerializedName("consentId")
        @Nullable
        private final String consentId;
        @SerializedName("custName")
        @Nullable
        private final String custName;
        @SerializedName("device")
        @Nullable

        /* renamed from: device  reason: collision with root package name */
        private final Device f109518device;
        @SerializedName("deviceFlag")
        @Nullable
        private final Boolean deviceFlag;
        @SerializedName("eSign")
        @Nullable
        private final String eSign;
        @SerializedName("faceCustCert")
        @Nullable
        private final String faceCustCert;
        @SerializedName("faceRecogStatus")
        @Nullable
        private final String faceRecogStatus;
        @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
        @Nullable
        private final String gender;
        @SerializedName("idNumber")
        @Nullable
        private final String idNumber;
        @SerializedName("idType")
        @Nullable
        private final String idType;
        @SerializedName("isIdentical")
        @Nullable
        private final String isIdentical;
        @SerializedName("packageCode")
        @Nullable
        private final String packageCode;
        @SerializedName("partnerCode")
        @Nullable
        private final String partnerCode;
        @SerializedName("priceplanRc")
        @Nullable
        private final String priceplanRc;
        @SerializedName("productIdNumber")
        @Nullable
        private final String productIdNumber;
        @SerializedName("productName")
        @Nullable
        private final String productName;
        @SerializedName("propoPromo")
        @Nullable
        private final String propoPromo;
        @SerializedName("readCard")
        @Nullable
        private final String readCard;
        @SerializedName("saleCode")
        @Nullable
        private final String saleCode;
        @SerializedName("serialNumber")
        @Nullable
        private final String serialNumber;
        @SerializedName("serviceCode")
        @Nullable
        private final String serviceCode;
        @SerializedName("serviceName")
        @Nullable
        private final String serviceName;

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest$OrderData$Device;", "", "imei", "", "brand", "model", "rrp", "discountAmount", "advanceAmount", "deviceType", "blSharingResult", "campaignType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvanceAmount", "()Ljava/lang/String;", "getBlSharingResult", "getBrand", "getCampaignType", "getDeviceType", "getDiscountAmount", "getImei", "getModel", "getRrp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneSubmitOrderRequest$OrderData$Device */
        /* loaded from: classes8.dex */
        public static final class Device {
            public static final int $stable = 0;
            @SerializedName("advanceAmount")
            @Nullable
            private final String advanceAmount;
            @SerializedName("blSharingResult")
            @Nullable
            private final String blSharingResult;
            @SerializedName("brand")
            @Nullable
            private final String brand;
            @SerializedName("campaignType")
            @Nullable
            private final String campaignType;
            @SerializedName("deviceType")
            @Nullable
            private final String deviceType;
            @SerializedName("discountAmount")
            @Nullable
            private final String discountAmount;
            @SerializedName("imei")
            @Nullable
            private final String imei;
            @SerializedName("model")
            @Nullable
            private final String model;
            @SerializedName("rrp")
            @Nullable
            private final String rrp;

            public Device() {
                this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            }

            @Nullable
            public final String component1() {
                return this.imei;
            }

            @Nullable
            public final String component2() {
                return this.brand;
            }

            @Nullable
            public final String component3() {
                return this.model;
            }

            @Nullable
            public final String component4() {
                return this.rrp;
            }

            @Nullable
            public final String component5() {
                return this.discountAmount;
            }

            @Nullable
            public final String component6() {
                return this.advanceAmount;
            }

            @Nullable
            public final String component7() {
                return this.deviceType;
            }

            @Nullable
            public final String component8() {
                return this.blSharingResult;
            }

            @Nullable
            public final String component9() {
                return this.campaignType;
            }

            @NotNull
            public final Device copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
                return new Device(str, str2, str3, str4, str5, str6, str7, str8, str9);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Device) {
                    Device device2 = (Device) obj;
                    return Intrinsics.areEqual(this.imei, device2.imei) && Intrinsics.areEqual(this.brand, device2.brand) && Intrinsics.areEqual(this.model, device2.model) && Intrinsics.areEqual(this.rrp, device2.rrp) && Intrinsics.areEqual(this.discountAmount, device2.discountAmount) && Intrinsics.areEqual(this.advanceAmount, device2.advanceAmount) && Intrinsics.areEqual(this.deviceType, device2.deviceType) && Intrinsics.areEqual(this.blSharingResult, device2.blSharingResult) && Intrinsics.areEqual(this.campaignType, device2.campaignType);
                }
                return false;
            }

            @Nullable
            public final String getAdvanceAmount() {
                return this.advanceAmount;
            }

            @Nullable
            public final String getBlSharingResult() {
                return this.blSharingResult;
            }

            @Nullable
            public final String getBrand() {
                return this.brand;
            }

            @Nullable
            public final String getCampaignType() {
                return this.campaignType;
            }

            @Nullable
            public final String getDeviceType() {
                return this.deviceType;
            }

            @Nullable
            public final String getDiscountAmount() {
                return this.discountAmount;
            }

            @Nullable
            public final String getImei() {
                return this.imei;
            }

            @Nullable
            public final String getModel() {
                return this.model;
            }

            @Nullable
            public final String getRrp() {
                return this.rrp;
            }

            public int hashCode() {
                String str = this.imei;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.brand;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.model;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.rrp;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.discountAmount;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.advanceAmount;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.deviceType;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.blSharingResult;
                int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.campaignType;
                return hashCode8 + (str9 != null ? str9.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.imei;
                String str2 = this.brand;
                String str3 = this.model;
                String str4 = this.rrp;
                String str5 = this.discountAmount;
                String str6 = this.advanceAmount;
                String str7 = this.deviceType;
                String str8 = this.blSharingResult;
                String str9 = this.campaignType;
                return "Device(imei=" + str + ", brand=" + str2 + ", model=" + str3 + ", rrp=" + str4 + ", discountAmount=" + str5 + ", advanceAmount=" + str6 + ", deviceType=" + str7 + ", blSharingResult=" + str8 + ", campaignType=" + str9 + ")";
            }

            public Device(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
                this.imei = str;
                this.brand = str2;
                this.model = str3;
                this.rrp = str4;
                this.discountAmount = str5;
                this.advanceAmount = str6;
                this.deviceType = str7;
                this.blSharingResult = str8;
                this.campaignType = str9;
            }

            public /* synthetic */ Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
            }
        }

        public OrderData() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
        }

        @Nullable
        public final String component1() {
            return this.idType;
        }

        @Nullable
        public final String component10() {
            return this.serviceName;
        }

        @Nullable
        public final String component11() {
            return this.productName;
        }

        @Nullable
        public final String component12() {
            return this.consentId;
        }

        @Nullable
        public final String component13() {
            return this.eSign;
        }

        @Nullable
        public final String component14() {
            return this.packageCode;
        }

        @Nullable
        public final String component15() {
            return this.productIdNumber;
        }

        @Nullable
        public final String component16() {
            return this.campaignName;
        }

        @Nullable
        public final String component17() {
            return this.propoPromo;
        }

        @Nullable
        public final String component18() {
            return this.campaignCode;
        }

        @Nullable
        public final String component19() {
            return this.priceplanRc;
        }

        @Nullable
        public final String component2() {
            return this.serialNumber;
        }

        @Nullable
        public final String component20() {
            return this.faceRecogStatus;
        }

        @Nullable
        public final String component21() {
            return this.isIdentical;
        }

        @Nullable
        public final String component22() {
            return this.confidentRatio;
        }

        @Nullable
        public final String component23() {
            return this.faceCustCert;
        }

        @Nullable
        public final String component24() {
            return this.approver;
        }

        @Nullable
        public final Boolean component25() {
            return this.deviceFlag;
        }

        @Nullable
        public final Device component26() {
            return this.f109518device;
        }

        @Nullable
        public final String component3() {
            return this.gender;
        }

        @Nullable
        public final String component4() {
            return this.partnerCode;
        }

        @Nullable
        public final String component5() {
            return this.readCard;
        }

        @Nullable
        public final String component6() {
            return this.serviceCode;
        }

        @Nullable
        public final String component7() {
            return this.saleCode;
        }

        @Nullable
        public final String component8() {
            return this.custName;
        }

        @Nullable
        public final String component9() {
            return this.idNumber;
        }

        @NotNull
        public final OrderData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable Boolean bool, @Nullable Device device2) {
            return new OrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, bool, device2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OrderData) {
                OrderData orderData = (OrderData) obj;
                return Intrinsics.areEqual(this.idType, orderData.idType) && Intrinsics.areEqual(this.serialNumber, orderData.serialNumber) && Intrinsics.areEqual(this.gender, orderData.gender) && Intrinsics.areEqual(this.partnerCode, orderData.partnerCode) && Intrinsics.areEqual(this.readCard, orderData.readCard) && Intrinsics.areEqual(this.serviceCode, orderData.serviceCode) && Intrinsics.areEqual(this.saleCode, orderData.saleCode) && Intrinsics.areEqual(this.custName, orderData.custName) && Intrinsics.areEqual(this.idNumber, orderData.idNumber) && Intrinsics.areEqual(this.serviceName, orderData.serviceName) && Intrinsics.areEqual(this.productName, orderData.productName) && Intrinsics.areEqual(this.consentId, orderData.consentId) && Intrinsics.areEqual(this.eSign, orderData.eSign) && Intrinsics.areEqual(this.packageCode, orderData.packageCode) && Intrinsics.areEqual(this.productIdNumber, orderData.productIdNumber) && Intrinsics.areEqual(this.campaignName, orderData.campaignName) && Intrinsics.areEqual(this.propoPromo, orderData.propoPromo) && Intrinsics.areEqual(this.campaignCode, orderData.campaignCode) && Intrinsics.areEqual(this.priceplanRc, orderData.priceplanRc) && Intrinsics.areEqual(this.faceRecogStatus, orderData.faceRecogStatus) && Intrinsics.areEqual(this.isIdentical, orderData.isIdentical) && Intrinsics.areEqual(this.confidentRatio, orderData.confidentRatio) && Intrinsics.areEqual(this.faceCustCert, orderData.faceCustCert) && Intrinsics.areEqual(this.approver, orderData.approver) && Intrinsics.areEqual(this.deviceFlag, orderData.deviceFlag) && Intrinsics.areEqual(this.f109518device, orderData.f109518device);
            }
            return false;
        }

        @Nullable
        public final String getApprover() {
            return this.approver;
        }

        @Nullable
        public final String getCampaignCode() {
            return this.campaignCode;
        }

        @Nullable
        public final String getCampaignName() {
            return this.campaignName;
        }

        @Nullable
        public final String getConfidentRatio() {
            return this.confidentRatio;
        }

        @Nullable
        public final String getConsentId() {
            return this.consentId;
        }

        @Nullable
        public final String getCustName() {
            return this.custName;
        }

        @Nullable
        public final Device getDevice() {
            return this.f109518device;
        }

        @Nullable
        public final Boolean getDeviceFlag() {
            return this.deviceFlag;
        }

        @Nullable
        public final String getESign() {
            return this.eSign;
        }

        @Nullable
        public final String getFaceCustCert() {
            return this.faceCustCert;
        }

        @Nullable
        public final String getFaceRecogStatus() {
            return this.faceRecogStatus;
        }

        @Nullable
        public final String getGender() {
            return this.gender;
        }

        @Nullable
        public final String getIdNumber() {
            return this.idNumber;
        }

        @Nullable
        public final String getIdType() {
            return this.idType;
        }

        @Nullable
        public final String getPackageCode() {
            return this.packageCode;
        }

        @Nullable
        public final String getPartnerCode() {
            return this.partnerCode;
        }

        @Nullable
        public final String getPriceplanRc() {
            return this.priceplanRc;
        }

        @Nullable
        public final String getProductIdNumber() {
            return this.productIdNumber;
        }

        @Nullable
        public final String getProductName() {
            return this.productName;
        }

        @Nullable
        public final String getPropoPromo() {
            return this.propoPromo;
        }

        @Nullable
        public final String getReadCard() {
            return this.readCard;
        }

        @Nullable
        public final String getSaleCode() {
            return this.saleCode;
        }

        @Nullable
        public final String getSerialNumber() {
            return this.serialNumber;
        }

        @Nullable
        public final String getServiceCode() {
            return this.serviceCode;
        }

        @Nullable
        public final String getServiceName() {
            return this.serviceName;
        }

        public int hashCode() {
            String str = this.idType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.serialNumber;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gender;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.partnerCode;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.readCard;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.serviceCode;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.saleCode;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.custName;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.idNumber;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.serviceName;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.productName;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.consentId;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.eSign;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.packageCode;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.productIdNumber;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.campaignName;
            int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.propoPromo;
            int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.campaignCode;
            int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.priceplanRc;
            int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.faceRecogStatus;
            int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.isIdentical;
            int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.confidentRatio;
            int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.faceCustCert;
            int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.approver;
            int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
            Boolean bool = this.deviceFlag;
            int hashCode25 = (hashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
            Device device2 = this.f109518device;
            return hashCode25 + (device2 != null ? device2.hashCode() : 0);
        }

        @Nullable
        public final String isIdentical() {
            return this.isIdentical;
        }

        @NotNull
        public String toString() {
            String str = this.idType;
            String str2 = this.serialNumber;
            String str3 = this.gender;
            String str4 = this.partnerCode;
            String str5 = this.readCard;
            String str6 = this.serviceCode;
            String str7 = this.saleCode;
            String str8 = this.custName;
            String str9 = this.idNumber;
            String str10 = this.serviceName;
            String str11 = this.productName;
            String str12 = this.consentId;
            String str13 = this.eSign;
            String str14 = this.packageCode;
            String str15 = this.productIdNumber;
            String str16 = this.campaignName;
            String str17 = this.propoPromo;
            String str18 = this.campaignCode;
            String str19 = this.priceplanRc;
            String str20 = this.faceRecogStatus;
            String str21 = this.isIdentical;
            String str22 = this.confidentRatio;
            String str23 = this.faceCustCert;
            String str24 = this.approver;
            Boolean bool = this.deviceFlag;
            Device device2 = this.f109518device;
            return "OrderData(idType=" + str + ", serialNumber=" + str2 + ", gender=" + str3 + ", partnerCode=" + str4 + ", readCard=" + str5 + ", serviceCode=" + str6 + ", saleCode=" + str7 + ", custName=" + str8 + ", idNumber=" + str9 + ", serviceName=" + str10 + ", productName=" + str11 + ", consentId=" + str12 + ", eSign=" + str13 + ", packageCode=" + str14 + ", productIdNumber=" + str15 + ", campaignName=" + str16 + ", propoPromo=" + str17 + ", campaignCode=" + str18 + ", priceplanRc=" + str19 + ", faceRecogStatus=" + str20 + ", isIdentical=" + str21 + ", confidentRatio=" + str22 + ", faceCustCert=" + str23 + ", approver=" + str24 + ", deviceFlag=" + bool + ", device=" + device2 + ")";
        }

        public OrderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable Boolean bool, @Nullable Device device2) {
            this.idType = str;
            this.serialNumber = str2;
            this.gender = str3;
            this.partnerCode = str4;
            this.readCard = str5;
            this.serviceCode = str6;
            this.saleCode = str7;
            this.custName = str8;
            this.idNumber = str9;
            this.serviceName = str10;
            this.productName = str11;
            this.consentId = str12;
            this.eSign = str13;
            this.packageCode = str14;
            this.productIdNumber = str15;
            this.campaignName = str16;
            this.propoPromo = str17;
            this.campaignCode = str18;
            this.priceplanRc = str19;
            this.faceRecogStatus = str20;
            this.isIdentical = str21;
            this.confidentRatio = str22;
            this.faceCustCert = str23;
            this.approver = str24;
            this.deviceFlag = bool;
            this.f109518device = device2;
        }

        public /* synthetic */ OrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Boolean bool, Device device2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : bool, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : device2);
        }
    }

    public OneSubmitOrderRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneSubmitOrderRequest copy$default(OneSubmitOrderRequest oneSubmitOrderRequest, String str, OrderData orderData, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneSubmitOrderRequest.orderId;
        }
        if ((i & 2) != 0) {
            orderData = oneSubmitOrderRequest.orderData;
        }
        if ((i & 4) != 0) {
            str2 = oneSubmitOrderRequest.flowName;
        }
        return oneSubmitOrderRequest.copy(str, orderData, str2);
    }

    @Nullable
    public final String component1() {
        return this.orderId;
    }

    @Nullable
    public final OrderData component2() {
        return this.orderData;
    }

    @Nullable
    public final String component3() {
        return this.flowName;
    }

    @NotNull
    public final OneSubmitOrderRequest copy(@Nullable String str, @Nullable OrderData orderData, @Nullable String str2) {
        return new OneSubmitOrderRequest(str, orderData, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneSubmitOrderRequest) {
            OneSubmitOrderRequest oneSubmitOrderRequest = (OneSubmitOrderRequest) obj;
            return Intrinsics.areEqual(this.orderId, oneSubmitOrderRequest.orderId) && Intrinsics.areEqual(this.orderData, oneSubmitOrderRequest.orderData) && Intrinsics.areEqual(this.flowName, oneSubmitOrderRequest.flowName);
        }
        return false;
    }

    @Nullable
    public final String getFlowName() {
        return this.flowName;
    }

    @Nullable
    public final OrderData getOrderData() {
        return this.orderData;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        String str = this.orderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderData orderData = this.orderData;
        int hashCode2 = (hashCode + (orderData == null ? 0 : orderData.hashCode())) * 31;
        String str2 = this.flowName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        OrderData orderData = this.orderData;
        String str2 = this.flowName;
        return "OneSubmitOrderRequest(orderId=" + str + ", orderData=" + orderData + ", flowName=" + str2 + ")";
    }

    public OneSubmitOrderRequest(@Nullable String str, @Nullable OrderData orderData, @Nullable String str2) {
        this.orderId = str;
        this.orderData = orderData;
        this.flowName = str2;
    }

    public /* synthetic */ OneSubmitOrderRequest(String str, OrderData orderData, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : orderData, (i & 4) != 0 ? null : str2);
    }
}
