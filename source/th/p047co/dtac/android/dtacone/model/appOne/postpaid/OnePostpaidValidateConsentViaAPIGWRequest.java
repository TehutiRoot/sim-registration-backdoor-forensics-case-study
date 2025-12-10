package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003J\\\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\n\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWRequest;", "", "saleAgent", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/SaleAgent;", "product", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/ProductItem;", "orderId", "", "action", "isReadCard", "", "customer", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/CustomerValidateConsentViaAPIGW;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/SaleAgent;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/appOne/postpaid/CustomerValidateConsentViaAPIGW;)V", "getAction", "()Ljava/lang/String;", "getCustomer", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/CustomerValidateConsentViaAPIGW;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrderId", "getProduct", "()Ljava/util/List;", "getSaleAgent", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/SaleAgent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/SaleAgent;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/appOne/postpaid/CustomerValidateConsentViaAPIGW;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWRequest */
/* loaded from: classes8.dex */
public final class OnePostpaidValidateConsentViaAPIGWRequest {
    public static final int $stable = 8;
    @SerializedName("action")
    @Nullable
    private final String action;
    @SerializedName("customer")
    @Nullable
    private final CustomerValidateConsentViaAPIGW customer;
    @SerializedName("isReadCard")
    @Nullable
    private final Boolean isReadCard;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName("product")
    @Nullable
    private final List<ProductItem> product;
    @SerializedName("saleAgent")
    @Nullable
    private final SaleAgent saleAgent;

    public OnePostpaidValidateConsentViaAPIGWRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OnePostpaidValidateConsentViaAPIGWRequest copy$default(OnePostpaidValidateConsentViaAPIGWRequest onePostpaidValidateConsentViaAPIGWRequest, SaleAgent saleAgent, List list, String str, String str2, Boolean bool, CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW, int i, Object obj) {
        if ((i & 1) != 0) {
            saleAgent = onePostpaidValidateConsentViaAPIGWRequest.saleAgent;
        }
        List<ProductItem> list2 = list;
        if ((i & 2) != 0) {
            list2 = onePostpaidValidateConsentViaAPIGWRequest.product;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = onePostpaidValidateConsentViaAPIGWRequest.orderId;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = onePostpaidValidateConsentViaAPIGWRequest.action;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = onePostpaidValidateConsentViaAPIGWRequest.isReadCard;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            customerValidateConsentViaAPIGW = onePostpaidValidateConsentViaAPIGWRequest.customer;
        }
        return onePostpaidValidateConsentViaAPIGWRequest.copy(saleAgent, list3, str3, str4, bool2, customerValidateConsentViaAPIGW);
    }

    @Nullable
    public final SaleAgent component1() {
        return this.saleAgent;
    }

    @Nullable
    public final List<ProductItem> component2() {
        return this.product;
    }

    @Nullable
    public final String component3() {
        return this.orderId;
    }

    @Nullable
    public final String component4() {
        return this.action;
    }

    @Nullable
    public final Boolean component5() {
        return this.isReadCard;
    }

    @Nullable
    public final CustomerValidateConsentViaAPIGW component6() {
        return this.customer;
    }

    @NotNull
    public final OnePostpaidValidateConsentViaAPIGWRequest copy(@Nullable SaleAgent saleAgent, @Nullable List<ProductItem> list, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW) {
        return new OnePostpaidValidateConsentViaAPIGWRequest(saleAgent, list, str, str2, bool, customerValidateConsentViaAPIGW);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidValidateConsentViaAPIGWRequest) {
            OnePostpaidValidateConsentViaAPIGWRequest onePostpaidValidateConsentViaAPIGWRequest = (OnePostpaidValidateConsentViaAPIGWRequest) obj;
            return Intrinsics.areEqual(this.saleAgent, onePostpaidValidateConsentViaAPIGWRequest.saleAgent) && Intrinsics.areEqual(this.product, onePostpaidValidateConsentViaAPIGWRequest.product) && Intrinsics.areEqual(this.orderId, onePostpaidValidateConsentViaAPIGWRequest.orderId) && Intrinsics.areEqual(this.action, onePostpaidValidateConsentViaAPIGWRequest.action) && Intrinsics.areEqual(this.isReadCard, onePostpaidValidateConsentViaAPIGWRequest.isReadCard) && Intrinsics.areEqual(this.customer, onePostpaidValidateConsentViaAPIGWRequest.customer);
        }
        return false;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final CustomerValidateConsentViaAPIGW getCustomer() {
        return this.customer;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final List<ProductItem> getProduct() {
        return this.product;
    }

    @Nullable
    public final SaleAgent getSaleAgent() {
        return this.saleAgent;
    }

    public int hashCode() {
        SaleAgent saleAgent = this.saleAgent;
        int hashCode = (saleAgent == null ? 0 : saleAgent.hashCode()) * 31;
        List<ProductItem> list = this.product;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.orderId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isReadCard;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW = this.customer;
        return hashCode5 + (customerValidateConsentViaAPIGW != null ? customerValidateConsentViaAPIGW.hashCode() : 0);
    }

    @Nullable
    public final Boolean isReadCard() {
        return this.isReadCard;
    }

    @NotNull
    public String toString() {
        SaleAgent saleAgent = this.saleAgent;
        List<ProductItem> list = this.product;
        String str = this.orderId;
        String str2 = this.action;
        Boolean bool = this.isReadCard;
        CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW = this.customer;
        return "OnePostpaidValidateConsentViaAPIGWRequest(saleAgent=" + saleAgent + ", product=" + list + ", orderId=" + str + ", action=" + str2 + ", isReadCard=" + bool + ", customer=" + customerValidateConsentViaAPIGW + ")";
    }

    public OnePostpaidValidateConsentViaAPIGWRequest(@Nullable SaleAgent saleAgent, @Nullable List<ProductItem> list, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW) {
        this.saleAgent = saleAgent;
        this.product = list;
        this.orderId = str;
        this.action = str2;
        this.isReadCard = bool;
        this.customer = customerValidateConsentViaAPIGW;
    }

    public /* synthetic */ OnePostpaidValidateConsentViaAPIGWRequest(SaleAgent saleAgent, List list, String str, String str2, Boolean bool, CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : saleAgent, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : customerValidateConsentViaAPIGW);
    }
}
