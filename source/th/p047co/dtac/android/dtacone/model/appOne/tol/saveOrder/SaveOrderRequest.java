package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountItem;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.Campaign;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010\"\u001a\u00020#\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0 \u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\t\u0010O\u001a\u00020\u0013HÆ\u0003J\t\u0010P\u001a\u00020\u0013HÆ\u0003J\t\u0010Q\u001a\u00020\u0016HÆ\u0003J\t\u0010R\u001a\u00020\u0018HÆ\u0003J\t\u0010S\u001a\u00020\u001aHÆ\u0003J\t\u0010T\u001a\u00020\u001cHÆ\u0003J\t\u0010U\u001a\u00020\u001eHÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0003J\t\u0010W\u001a\u00020#HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020%0 HÆ\u0003J\t\u0010Z\u001a\u00020'HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\rHÆ\u0003J\t\u0010a\u001a\u00020\u000fHÆ\u0003Jç\u0001\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010\"\u001a\u00020#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0 2\b\b\u0002\u0010&\u001a\u00020'HÆ\u0001J\u0013\u0010c\u001a\u00020\u00072\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020fHÖ\u0001J\t\u0010g\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020%0 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00109R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010.¨\u0006h"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderRequest;", "", "orderId", "", "tolNumber", "installFlag", "campaignWaiveSelected", "", "campaignWaiveReasons", "companyCode", "gisInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderGisInfo;", "customerInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderCustomerInfo;", "contactInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderContactInfo;", "saleAgent", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderSaleAgent;", "customerAddressInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderAddressInfo;", "installAddressInfo", "campaignInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "marketingInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "discountInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;", "deviceInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;", "callVerifyInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;", "flpInfo", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderFlpInfo;", "reserveTimeInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderReserveTimeInfo;", "consentInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderConsentInfo;", "cardReaderInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderCardReaderInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderGisInfo;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderCustomerInfo;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderContactInfo;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderSaleAgent;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderAddressInfo;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderAddressInfo;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderReserveTimeInfo;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderCardReaderInfo;)V", "getCallVerifyInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;", "getCampaignInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "getCampaignWaiveReasons", "()Ljava/lang/String;", "getCampaignWaiveSelected", "()Z", "getCardReaderInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderCardReaderInfo;", "getCompanyCode", "getConsentInfo", "()Ljava/util/List;", "getContactInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderContactInfo;", "getCustomerAddressInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderAddressInfo;", "getCustomerInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderCustomerInfo;", "getDeviceInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;", "getDiscountInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;", "getFlpInfo", "getGisInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderGisInfo;", "getInstallAddressInfo", "getInstallFlag", "getMarketingInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "getOrderId", "getReserveTimeInfo", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderReserveTimeInfo;", "getSaleAgent", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderSaleAgent;", "getTolNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderRequest */
/* loaded from: classes8.dex */
public final class SaveOrderRequest {
    public static final int $stable = 8;
    @SerializedName("callVerifyInfo")
    @NotNull
    private final CallVerifyData callVerifyInfo;
    @SerializedName("campaignInfo")
    @NotNull
    private final Campaign campaignInfo;
    @SerializedName("campaignWaiveReasons")
    @NotNull
    private final String campaignWaiveReasons;
    @SerializedName("campaignWaiveSelected")
    private final boolean campaignWaiveSelected;
    @SerializedName("cardReaderInfo")
    @NotNull
    private final SaveOrderCardReaderInfo cardReaderInfo;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("consentInfo")
    @NotNull
    private final List<SaveOrderConsentInfo> consentInfo;
    @SerializedName("contactInfo")
    @NotNull
    private final SaveOrderContactInfo contactInfo;
    @SerializedName("customerAddressInfo")
    @NotNull
    private final SaveOrderAddressInfo customerAddressInfo;
    @SerializedName("customerInfo")
    @NotNull
    private final SaveOrderCustomerInfo customerInfo;
    @SerializedName("deviceInfo")
    @NotNull
    private final DeviceRouterItem deviceInfo;
    @SerializedName("discountInfo")
    @NotNull
    private final DiscountItem discountInfo;
    @SerializedName("flpInfo")
    @NotNull
    private final List<SaveOrderFlpInfo> flpInfo;
    @SerializedName("gisInfo")
    @NotNull
    private final SaveOrderGisInfo gisInfo;
    @SerializedName("installAddressInfo")
    @NotNull
    private final SaveOrderAddressInfo installAddressInfo;
    @SerializedName("installFlag")
    @NotNull
    private final String installFlag;
    @SerializedName("marketingInfo")
    @NotNull
    private final MarketingDetails marketingInfo;
    @SerializedName("orderId")
    @NotNull
    private final String orderId;
    @SerializedName("reserveTimeInfo")
    @NotNull
    private final SaveOrderReserveTimeInfo reserveTimeInfo;
    @SerializedName("saleAgent")
    @NotNull
    private final SaveOrderSaleAgent saleAgent;
    @SerializedName("tolNumber")
    @NotNull
    private final String tolNumber;

    public SaveOrderRequest(@NotNull String orderId, @NotNull String tolNumber, @NotNull String installFlag, boolean z, @NotNull String campaignWaiveReasons, @NotNull String companyCode, @NotNull SaveOrderGisInfo gisInfo, @NotNull SaveOrderCustomerInfo customerInfo, @NotNull SaveOrderContactInfo contactInfo, @NotNull SaveOrderSaleAgent saleAgent, @NotNull SaveOrderAddressInfo customerAddressInfo, @NotNull SaveOrderAddressInfo installAddressInfo, @NotNull Campaign campaignInfo, @NotNull MarketingDetails marketingInfo, @NotNull DiscountItem discountInfo, @NotNull DeviceRouterItem deviceInfo, @NotNull CallVerifyData callVerifyInfo, @NotNull List<SaveOrderFlpInfo> flpInfo, @NotNull SaveOrderReserveTimeInfo reserveTimeInfo, @NotNull List<SaveOrderConsentInfo> consentInfo, @NotNull SaveOrderCardReaderInfo cardReaderInfo) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(tolNumber, "tolNumber");
        Intrinsics.checkNotNullParameter(installFlag, "installFlag");
        Intrinsics.checkNotNullParameter(campaignWaiveReasons, "campaignWaiveReasons");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(gisInfo, "gisInfo");
        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
        Intrinsics.checkNotNullParameter(contactInfo, "contactInfo");
        Intrinsics.checkNotNullParameter(saleAgent, "saleAgent");
        Intrinsics.checkNotNullParameter(customerAddressInfo, "customerAddressInfo");
        Intrinsics.checkNotNullParameter(installAddressInfo, "installAddressInfo");
        Intrinsics.checkNotNullParameter(campaignInfo, "campaignInfo");
        Intrinsics.checkNotNullParameter(marketingInfo, "marketingInfo");
        Intrinsics.checkNotNullParameter(discountInfo, "discountInfo");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callVerifyInfo, "callVerifyInfo");
        Intrinsics.checkNotNullParameter(flpInfo, "flpInfo");
        Intrinsics.checkNotNullParameter(reserveTimeInfo, "reserveTimeInfo");
        Intrinsics.checkNotNullParameter(consentInfo, "consentInfo");
        Intrinsics.checkNotNullParameter(cardReaderInfo, "cardReaderInfo");
        this.orderId = orderId;
        this.tolNumber = tolNumber;
        this.installFlag = installFlag;
        this.campaignWaiveSelected = z;
        this.campaignWaiveReasons = campaignWaiveReasons;
        this.companyCode = companyCode;
        this.gisInfo = gisInfo;
        this.customerInfo = customerInfo;
        this.contactInfo = contactInfo;
        this.saleAgent = saleAgent;
        this.customerAddressInfo = customerAddressInfo;
        this.installAddressInfo = installAddressInfo;
        this.campaignInfo = campaignInfo;
        this.marketingInfo = marketingInfo;
        this.discountInfo = discountInfo;
        this.deviceInfo = deviceInfo;
        this.callVerifyInfo = callVerifyInfo;
        this.flpInfo = flpInfo;
        this.reserveTimeInfo = reserveTimeInfo;
        this.consentInfo = consentInfo;
        this.cardReaderInfo = cardReaderInfo;
    }

    @NotNull
    public final String component1() {
        return this.orderId;
    }

    @NotNull
    public final SaveOrderSaleAgent component10() {
        return this.saleAgent;
    }

    @NotNull
    public final SaveOrderAddressInfo component11() {
        return this.customerAddressInfo;
    }

    @NotNull
    public final SaveOrderAddressInfo component12() {
        return this.installAddressInfo;
    }

    @NotNull
    public final Campaign component13() {
        return this.campaignInfo;
    }

    @NotNull
    public final MarketingDetails component14() {
        return this.marketingInfo;
    }

    @NotNull
    public final DiscountItem component15() {
        return this.discountInfo;
    }

    @NotNull
    public final DeviceRouterItem component16() {
        return this.deviceInfo;
    }

    @NotNull
    public final CallVerifyData component17() {
        return this.callVerifyInfo;
    }

    @NotNull
    public final List<SaveOrderFlpInfo> component18() {
        return this.flpInfo;
    }

    @NotNull
    public final SaveOrderReserveTimeInfo component19() {
        return this.reserveTimeInfo;
    }

    @NotNull
    public final String component2() {
        return this.tolNumber;
    }

    @NotNull
    public final List<SaveOrderConsentInfo> component20() {
        return this.consentInfo;
    }

    @NotNull
    public final SaveOrderCardReaderInfo component21() {
        return this.cardReaderInfo;
    }

    @NotNull
    public final String component3() {
        return this.installFlag;
    }

    public final boolean component4() {
        return this.campaignWaiveSelected;
    }

    @NotNull
    public final String component5() {
        return this.campaignWaiveReasons;
    }

    @NotNull
    public final String component6() {
        return this.companyCode;
    }

    @NotNull
    public final SaveOrderGisInfo component7() {
        return this.gisInfo;
    }

    @NotNull
    public final SaveOrderCustomerInfo component8() {
        return this.customerInfo;
    }

    @NotNull
    public final SaveOrderContactInfo component9() {
        return this.contactInfo;
    }

    @NotNull
    public final SaveOrderRequest copy(@NotNull String orderId, @NotNull String tolNumber, @NotNull String installFlag, boolean z, @NotNull String campaignWaiveReasons, @NotNull String companyCode, @NotNull SaveOrderGisInfo gisInfo, @NotNull SaveOrderCustomerInfo customerInfo, @NotNull SaveOrderContactInfo contactInfo, @NotNull SaveOrderSaleAgent saleAgent, @NotNull SaveOrderAddressInfo customerAddressInfo, @NotNull SaveOrderAddressInfo installAddressInfo, @NotNull Campaign campaignInfo, @NotNull MarketingDetails marketingInfo, @NotNull DiscountItem discountInfo, @NotNull DeviceRouterItem deviceInfo, @NotNull CallVerifyData callVerifyInfo, @NotNull List<SaveOrderFlpInfo> flpInfo, @NotNull SaveOrderReserveTimeInfo reserveTimeInfo, @NotNull List<SaveOrderConsentInfo> consentInfo, @NotNull SaveOrderCardReaderInfo cardReaderInfo) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(tolNumber, "tolNumber");
        Intrinsics.checkNotNullParameter(installFlag, "installFlag");
        Intrinsics.checkNotNullParameter(campaignWaiveReasons, "campaignWaiveReasons");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(gisInfo, "gisInfo");
        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
        Intrinsics.checkNotNullParameter(contactInfo, "contactInfo");
        Intrinsics.checkNotNullParameter(saleAgent, "saleAgent");
        Intrinsics.checkNotNullParameter(customerAddressInfo, "customerAddressInfo");
        Intrinsics.checkNotNullParameter(installAddressInfo, "installAddressInfo");
        Intrinsics.checkNotNullParameter(campaignInfo, "campaignInfo");
        Intrinsics.checkNotNullParameter(marketingInfo, "marketingInfo");
        Intrinsics.checkNotNullParameter(discountInfo, "discountInfo");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callVerifyInfo, "callVerifyInfo");
        Intrinsics.checkNotNullParameter(flpInfo, "flpInfo");
        Intrinsics.checkNotNullParameter(reserveTimeInfo, "reserveTimeInfo");
        Intrinsics.checkNotNullParameter(consentInfo, "consentInfo");
        Intrinsics.checkNotNullParameter(cardReaderInfo, "cardReaderInfo");
        return new SaveOrderRequest(orderId, tolNumber, installFlag, z, campaignWaiveReasons, companyCode, gisInfo, customerInfo, contactInfo, saleAgent, customerAddressInfo, installAddressInfo, campaignInfo, marketingInfo, discountInfo, deviceInfo, callVerifyInfo, flpInfo, reserveTimeInfo, consentInfo, cardReaderInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderRequest) {
            SaveOrderRequest saveOrderRequest = (SaveOrderRequest) obj;
            return Intrinsics.areEqual(this.orderId, saveOrderRequest.orderId) && Intrinsics.areEqual(this.tolNumber, saveOrderRequest.tolNumber) && Intrinsics.areEqual(this.installFlag, saveOrderRequest.installFlag) && this.campaignWaiveSelected == saveOrderRequest.campaignWaiveSelected && Intrinsics.areEqual(this.campaignWaiveReasons, saveOrderRequest.campaignWaiveReasons) && Intrinsics.areEqual(this.companyCode, saveOrderRequest.companyCode) && Intrinsics.areEqual(this.gisInfo, saveOrderRequest.gisInfo) && Intrinsics.areEqual(this.customerInfo, saveOrderRequest.customerInfo) && Intrinsics.areEqual(this.contactInfo, saveOrderRequest.contactInfo) && Intrinsics.areEqual(this.saleAgent, saveOrderRequest.saleAgent) && Intrinsics.areEqual(this.customerAddressInfo, saveOrderRequest.customerAddressInfo) && Intrinsics.areEqual(this.installAddressInfo, saveOrderRequest.installAddressInfo) && Intrinsics.areEqual(this.campaignInfo, saveOrderRequest.campaignInfo) && Intrinsics.areEqual(this.marketingInfo, saveOrderRequest.marketingInfo) && Intrinsics.areEqual(this.discountInfo, saveOrderRequest.discountInfo) && Intrinsics.areEqual(this.deviceInfo, saveOrderRequest.deviceInfo) && Intrinsics.areEqual(this.callVerifyInfo, saveOrderRequest.callVerifyInfo) && Intrinsics.areEqual(this.flpInfo, saveOrderRequest.flpInfo) && Intrinsics.areEqual(this.reserveTimeInfo, saveOrderRequest.reserveTimeInfo) && Intrinsics.areEqual(this.consentInfo, saveOrderRequest.consentInfo) && Intrinsics.areEqual(this.cardReaderInfo, saveOrderRequest.cardReaderInfo);
        }
        return false;
    }

    @NotNull
    public final CallVerifyData getCallVerifyInfo() {
        return this.callVerifyInfo;
    }

    @NotNull
    public final Campaign getCampaignInfo() {
        return this.campaignInfo;
    }

    @NotNull
    public final String getCampaignWaiveReasons() {
        return this.campaignWaiveReasons;
    }

    public final boolean getCampaignWaiveSelected() {
        return this.campaignWaiveSelected;
    }

    @NotNull
    public final SaveOrderCardReaderInfo getCardReaderInfo() {
        return this.cardReaderInfo;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final List<SaveOrderConsentInfo> getConsentInfo() {
        return this.consentInfo;
    }

    @NotNull
    public final SaveOrderContactInfo getContactInfo() {
        return this.contactInfo;
    }

    @NotNull
    public final SaveOrderAddressInfo getCustomerAddressInfo() {
        return this.customerAddressInfo;
    }

    @NotNull
    public final SaveOrderCustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    @NotNull
    public final DeviceRouterItem getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final DiscountItem getDiscountInfo() {
        return this.discountInfo;
    }

    @NotNull
    public final List<SaveOrderFlpInfo> getFlpInfo() {
        return this.flpInfo;
    }

    @NotNull
    public final SaveOrderGisInfo getGisInfo() {
        return this.gisInfo;
    }

    @NotNull
    public final SaveOrderAddressInfo getInstallAddressInfo() {
        return this.installAddressInfo;
    }

    @NotNull
    public final String getInstallFlag() {
        return this.installFlag;
    }

    @NotNull
    public final MarketingDetails getMarketingInfo() {
        return this.marketingInfo;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final SaveOrderReserveTimeInfo getReserveTimeInfo() {
        return this.reserveTimeInfo;
    }

    @NotNull
    public final SaveOrderSaleAgent getSaleAgent() {
        return this.saleAgent;
    }

    @NotNull
    public final String getTolNumber() {
        return this.tolNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.orderId.hashCode() * 31) + this.tolNumber.hashCode()) * 31) + this.installFlag.hashCode()) * 31;
        boolean z = this.campaignWaiveSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((((((((((((((((((((((((hashCode + i) * 31) + this.campaignWaiveReasons.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.gisInfo.hashCode()) * 31) + this.customerInfo.hashCode()) * 31) + this.contactInfo.hashCode()) * 31) + this.saleAgent.hashCode()) * 31) + this.customerAddressInfo.hashCode()) * 31) + this.installAddressInfo.hashCode()) * 31) + this.campaignInfo.hashCode()) * 31) + this.marketingInfo.hashCode()) * 31) + this.discountInfo.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + this.callVerifyInfo.hashCode()) * 31) + this.flpInfo.hashCode()) * 31) + this.reserveTimeInfo.hashCode()) * 31) + this.consentInfo.hashCode()) * 31) + this.cardReaderInfo.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.tolNumber;
        String str3 = this.installFlag;
        boolean z = this.campaignWaiveSelected;
        String str4 = this.campaignWaiveReasons;
        String str5 = this.companyCode;
        SaveOrderGisInfo saveOrderGisInfo = this.gisInfo;
        SaveOrderCustomerInfo saveOrderCustomerInfo = this.customerInfo;
        SaveOrderContactInfo saveOrderContactInfo = this.contactInfo;
        SaveOrderSaleAgent saveOrderSaleAgent = this.saleAgent;
        SaveOrderAddressInfo saveOrderAddressInfo = this.customerAddressInfo;
        SaveOrderAddressInfo saveOrderAddressInfo2 = this.installAddressInfo;
        Campaign campaign = this.campaignInfo;
        MarketingDetails marketingDetails = this.marketingInfo;
        DiscountItem discountItem = this.discountInfo;
        DeviceRouterItem deviceRouterItem = this.deviceInfo;
        CallVerifyData callVerifyData = this.callVerifyInfo;
        List<SaveOrderFlpInfo> list = this.flpInfo;
        SaveOrderReserveTimeInfo saveOrderReserveTimeInfo = this.reserveTimeInfo;
        List<SaveOrderConsentInfo> list2 = this.consentInfo;
        SaveOrderCardReaderInfo saveOrderCardReaderInfo = this.cardReaderInfo;
        return "SaveOrderRequest(orderId=" + str + ", tolNumber=" + str2 + ", installFlag=" + str3 + ", campaignWaiveSelected=" + z + ", campaignWaiveReasons=" + str4 + ", companyCode=" + str5 + ", gisInfo=" + saveOrderGisInfo + ", customerInfo=" + saveOrderCustomerInfo + ", contactInfo=" + saveOrderContactInfo + ", saleAgent=" + saveOrderSaleAgent + ", customerAddressInfo=" + saveOrderAddressInfo + ", installAddressInfo=" + saveOrderAddressInfo2 + ", campaignInfo=" + campaign + ", marketingInfo=" + marketingDetails + ", discountInfo=" + discountItem + ", deviceInfo=" + deviceRouterItem + ", callVerifyInfo=" + callVerifyData + ", flpInfo=" + list + ", reserveTimeInfo=" + saveOrderReserveTimeInfo + ", consentInfo=" + list2 + ", cardReaderInfo=" + saveOrderCardReaderInfo + ")";
    }
}
