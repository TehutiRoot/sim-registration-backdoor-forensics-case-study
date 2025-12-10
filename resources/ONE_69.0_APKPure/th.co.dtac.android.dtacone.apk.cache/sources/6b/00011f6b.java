package th.p047co.dtac.android.dtacone.model.mrtr_prepaid.save_result.request;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.request.Discount;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.request.PaymentItem;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0007HÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001e¨\u0006S"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid/save_result/request/SaveSimStockResultRequest;", "", "simCardNumber", "", "stockResult", "orderNumber", "orderID", "", "channel", "errorMessage", FirebaseAnalytics.Param.DISCOUNT, "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/request/Discount;", "errorCode", "customerNumber", "priceLevel", "productName", "transactionType", "objectReferenceID", "productCode", "userLan", "subChannel", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "payment", "", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/request/PaymentItem;", "locationCode", "productType", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/request/Discount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getCustomerNumber", "getDiscount", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/request/Discount;", "getErrorCode", "getErrorMessage", "getLocationCode", "getObjectReferenceID", "getOrderID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderNumber", "getPayment", "()Ljava/util/List;", "getPriceLevel", "getProductCode", "getProductName", "getProductType", "getSimCardNumber", "getStatus", "getStockResult", "getSubChannel", "getSubscriberNumber", "getTransactionType", "getUserLan", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/request/Discount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid/save_result/request/SaveSimStockResultRequest;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid.save_result.request.SaveSimStockResultRequest */
/* loaded from: classes8.dex */
public final class SaveSimStockResultRequest {
    public static final int $stable = 8;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("customerNumber")
    @Nullable
    private final String customerNumber;
    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    @Nullable
    private final Discount discount;
    @SerializedName("errorCode")
    @Nullable
    private final String errorCode;
    @SerializedName("errorMessage")
    @Nullable
    private final String errorMessage;
    @SerializedName("locationCode")
    @Nullable
    private final String locationCode;
    @SerializedName("objectReferenceID")
    @Nullable
    private final String objectReferenceID;
    @SerializedName("orderID")
    @Nullable
    private final Integer orderID;
    @SerializedName("orderNumber")
    @Nullable
    private final String orderNumber;
    @SerializedName("payment")
    @Nullable
    private final List<PaymentItem> payment;
    @SerializedName("priceLevel")
    @Nullable
    private final String priceLevel;
    @SerializedName("productCode")
    @Nullable
    private final String productCode;
    @SerializedName("productName")
    @Nullable
    private final String productName;
    @SerializedName("productType")
    @Nullable
    private final String productType;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;
    @SerializedName("stockResult")
    @Nullable
    private final String stockResult;
    @SerializedName("subChannel")
    @Nullable
    private final String subChannel;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("transactionType")
    @Nullable
    private final String transactionType;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    public SaveSimStockResultRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component10() {
        return this.priceLevel;
    }

    @Nullable
    public final String component11() {
        return this.productName;
    }

    @Nullable
    public final String component12() {
        return this.transactionType;
    }

    @Nullable
    public final String component13() {
        return this.objectReferenceID;
    }

    @Nullable
    public final String component14() {
        return this.productCode;
    }

    @Nullable
    public final String component15() {
        return this.userLan;
    }

    @Nullable
    public final String component16() {
        return this.subChannel;
    }

    @Nullable
    public final String component17() {
        return this.subscriberNumber;
    }

    @Nullable
    public final List<PaymentItem> component18() {
        return this.payment;
    }

    @Nullable
    public final String component19() {
        return this.locationCode;
    }

    @Nullable
    public final String component2() {
        return this.stockResult;
    }

    @Nullable
    public final String component20() {
        return this.productType;
    }

    @Nullable
    public final String component21() {
        return this.status;
    }

    @Nullable
    public final String component3() {
        return this.orderNumber;
    }

    @Nullable
    public final Integer component4() {
        return this.orderID;
    }

    @Nullable
    public final String component5() {
        return this.channel;
    }

    @Nullable
    public final String component6() {
        return this.errorMessage;
    }

    @Nullable
    public final Discount component7() {
        return this.discount;
    }

    @Nullable
    public final String component8() {
        return this.errorCode;
    }

    @Nullable
    public final String component9() {
        return this.customerNumber;
    }

    @NotNull
    public final SaveSimStockResultRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Discount discount, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable List<PaymentItem> list, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        return new SaveSimStockResultRequest(str, str2, str3, num, str4, str5, discount, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, list, str16, str17, str18);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveSimStockResultRequest) {
            SaveSimStockResultRequest saveSimStockResultRequest = (SaveSimStockResultRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, saveSimStockResultRequest.simCardNumber) && Intrinsics.areEqual(this.stockResult, saveSimStockResultRequest.stockResult) && Intrinsics.areEqual(this.orderNumber, saveSimStockResultRequest.orderNumber) && Intrinsics.areEqual(this.orderID, saveSimStockResultRequest.orderID) && Intrinsics.areEqual(this.channel, saveSimStockResultRequest.channel) && Intrinsics.areEqual(this.errorMessage, saveSimStockResultRequest.errorMessage) && Intrinsics.areEqual(this.discount, saveSimStockResultRequest.discount) && Intrinsics.areEqual(this.errorCode, saveSimStockResultRequest.errorCode) && Intrinsics.areEqual(this.customerNumber, saveSimStockResultRequest.customerNumber) && Intrinsics.areEqual(this.priceLevel, saveSimStockResultRequest.priceLevel) && Intrinsics.areEqual(this.productName, saveSimStockResultRequest.productName) && Intrinsics.areEqual(this.transactionType, saveSimStockResultRequest.transactionType) && Intrinsics.areEqual(this.objectReferenceID, saveSimStockResultRequest.objectReferenceID) && Intrinsics.areEqual(this.productCode, saveSimStockResultRequest.productCode) && Intrinsics.areEqual(this.userLan, saveSimStockResultRequest.userLan) && Intrinsics.areEqual(this.subChannel, saveSimStockResultRequest.subChannel) && Intrinsics.areEqual(this.subscriberNumber, saveSimStockResultRequest.subscriberNumber) && Intrinsics.areEqual(this.payment, saveSimStockResultRequest.payment) && Intrinsics.areEqual(this.locationCode, saveSimStockResultRequest.locationCode) && Intrinsics.areEqual(this.productType, saveSimStockResultRequest.productType) && Intrinsics.areEqual(this.status, saveSimStockResultRequest.status);
        }
        return false;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final Discount getDiscount() {
        return this.discount;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getLocationCode() {
        return this.locationCode;
    }

    @Nullable
    public final String getObjectReferenceID() {
        return this.objectReferenceID;
    }

    @Nullable
    public final Integer getOrderID() {
        return this.orderID;
    }

    @Nullable
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public final List<PaymentItem> getPayment() {
        return this.payment;
    }

    @Nullable
    public final String getPriceLevel() {
        return this.priceLevel;
    }

    @Nullable
    public final String getProductCode() {
        return this.productCode;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStockResult() {
        return this.stockResult;
    }

    @Nullable
    public final String getSubChannel() {
        return this.subChannel;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stockResult;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.orderID;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.channel;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorMessage;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Discount discount = this.discount;
        int hashCode7 = (hashCode6 + (discount == null ? 0 : discount.hashCode())) * 31;
        String str6 = this.errorCode;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customerNumber;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.priceLevel;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productName;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.transactionType;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.objectReferenceID;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.productCode;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.userLan;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.subChannel;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.subscriberNumber;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<PaymentItem> list = this.payment;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        String str16 = this.locationCode;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.productType;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.status;
        return hashCode20 + (str18 != null ? str18.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.stockResult;
        String str3 = this.orderNumber;
        Integer num = this.orderID;
        String str4 = this.channel;
        String str5 = this.errorMessage;
        Discount discount = this.discount;
        String str6 = this.errorCode;
        String str7 = this.customerNumber;
        String str8 = this.priceLevel;
        String str9 = this.productName;
        String str10 = this.transactionType;
        String str11 = this.objectReferenceID;
        String str12 = this.productCode;
        String str13 = this.userLan;
        String str14 = this.subChannel;
        String str15 = this.subscriberNumber;
        List<PaymentItem> list = this.payment;
        String str16 = this.locationCode;
        String str17 = this.productType;
        String str18 = this.status;
        return "SaveSimStockResultRequest(simCardNumber=" + str + ", stockResult=" + str2 + ", orderNumber=" + str3 + ", orderID=" + num + ", channel=" + str4 + ", errorMessage=" + str5 + ", discount=" + discount + ", errorCode=" + str6 + ", customerNumber=" + str7 + ", priceLevel=" + str8 + ", productName=" + str9 + ", transactionType=" + str10 + ", objectReferenceID=" + str11 + ", productCode=" + str12 + ", userLan=" + str13 + ", subChannel=" + str14 + ", subscriberNumber=" + str15 + ", payment=" + list + ", locationCode=" + str16 + ", productType=" + str17 + ", status=" + str18 + ")";
    }

    public SaveSimStockResultRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Discount discount, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable List<PaymentItem> list, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        this.simCardNumber = str;
        this.stockResult = str2;
        this.orderNumber = str3;
        this.orderID = num;
        this.channel = str4;
        this.errorMessage = str5;
        this.discount = discount;
        this.errorCode = str6;
        this.customerNumber = str7;
        this.priceLevel = str8;
        this.productName = str9;
        this.transactionType = str10;
        this.objectReferenceID = str11;
        this.productCode = str12;
        this.userLan = str13;
        this.subChannel = str14;
        this.subscriberNumber = str15;
        this.payment = list;
        this.locationCode = str16;
        this.productType = str17;
        this.status = str18;
    }

    public /* synthetic */ SaveSimStockResultRequest(String str, String str2, String str3, Integer num, String str4, String str5, Discount discount, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : discount, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : list, (i & 262144) != 0 ? null : str16, (i & 524288) != 0 ? null : str17, (i & 1048576) != 0 ? null : str18);
    }
}