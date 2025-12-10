package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitOrderRequest;", "", "orderItem", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OrderItem;", "ou", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Ou;", "account", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Account;", "customer", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Customer;", "campaign", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Campaign;", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/OrderItem;Lth/co/dtac/android/dtacone/model/appOne/prepaid/Ou;Lth/co/dtac/android/dtacone/model/appOne/prepaid/Account;Lth/co/dtac/android/dtacone/model/appOne/prepaid/Customer;Lth/co/dtac/android/dtacone/model/appOne/prepaid/Campaign;)V", "getAccount", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Account;", "getCampaign", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Campaign;", "getCustomer", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Customer;", "getOrderItem", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/OrderItem;", "getOu", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Ou;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitOrderRequest */
/* loaded from: classes8.dex */
public final class OnePrepaidSubmitOrderRequest {
    public static final int $stable = 8;
    @SerializedName("account")
    @Nullable
    private final Account account;
    @SerializedName("campaign")
    @Nullable
    private final Campaign campaign;
    @SerializedName("customer")
    @Nullable
    private final Customer customer;
    @SerializedName("orderItem")
    @Nullable
    private final OrderItem orderItem;
    @SerializedName("ou")
    @Nullable

    /* renamed from: ou */
    private final C14235Ou f85063ou;

    public OnePrepaidSubmitOrderRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OnePrepaidSubmitOrderRequest copy$default(OnePrepaidSubmitOrderRequest onePrepaidSubmitOrderRequest, OrderItem orderItem, C14235Ou c14235Ou, Account account, Customer customer, Campaign campaign, int i, Object obj) {
        if ((i & 1) != 0) {
            orderItem = onePrepaidSubmitOrderRequest.orderItem;
        }
        if ((i & 2) != 0) {
            c14235Ou = onePrepaidSubmitOrderRequest.f85063ou;
        }
        C14235Ou c14235Ou2 = c14235Ou;
        if ((i & 4) != 0) {
            account = onePrepaidSubmitOrderRequest.account;
        }
        Account account2 = account;
        if ((i & 8) != 0) {
            customer = onePrepaidSubmitOrderRequest.customer;
        }
        Customer customer2 = customer;
        if ((i & 16) != 0) {
            campaign = onePrepaidSubmitOrderRequest.campaign;
        }
        return onePrepaidSubmitOrderRequest.copy(orderItem, c14235Ou2, account2, customer2, campaign);
    }

    @Nullable
    public final OrderItem component1() {
        return this.orderItem;
    }

    @Nullable
    public final C14235Ou component2() {
        return this.f85063ou;
    }

    @Nullable
    public final Account component3() {
        return this.account;
    }

    @Nullable
    public final Customer component4() {
        return this.customer;
    }

    @Nullable
    public final Campaign component5() {
        return this.campaign;
    }

    @NotNull
    public final OnePrepaidSubmitOrderRequest copy(@Nullable OrderItem orderItem, @Nullable C14235Ou c14235Ou, @Nullable Account account, @Nullable Customer customer, @Nullable Campaign campaign) {
        return new OnePrepaidSubmitOrderRequest(orderItem, c14235Ou, account, customer, campaign);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidSubmitOrderRequest) {
            OnePrepaidSubmitOrderRequest onePrepaidSubmitOrderRequest = (OnePrepaidSubmitOrderRequest) obj;
            return Intrinsics.areEqual(this.orderItem, onePrepaidSubmitOrderRequest.orderItem) && Intrinsics.areEqual(this.f85063ou, onePrepaidSubmitOrderRequest.f85063ou) && Intrinsics.areEqual(this.account, onePrepaidSubmitOrderRequest.account) && Intrinsics.areEqual(this.customer, onePrepaidSubmitOrderRequest.customer) && Intrinsics.areEqual(this.campaign, onePrepaidSubmitOrderRequest.campaign);
        }
        return false;
    }

    @Nullable
    public final Account getAccount() {
        return this.account;
    }

    @Nullable
    public final Campaign getCampaign() {
        return this.campaign;
    }

    @Nullable
    public final Customer getCustomer() {
        return this.customer;
    }

    @Nullable
    public final OrderItem getOrderItem() {
        return this.orderItem;
    }

    @Nullable
    public final C14235Ou getOu() {
        return this.f85063ou;
    }

    public int hashCode() {
        OrderItem orderItem = this.orderItem;
        int hashCode = (orderItem == null ? 0 : orderItem.hashCode()) * 31;
        C14235Ou c14235Ou = this.f85063ou;
        int hashCode2 = (hashCode + (c14235Ou == null ? 0 : c14235Ou.hashCode())) * 31;
        Account account = this.account;
        int hashCode3 = (hashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        Customer customer = this.customer;
        int hashCode4 = (hashCode3 + (customer == null ? 0 : customer.hashCode())) * 31;
        Campaign campaign = this.campaign;
        return hashCode4 + (campaign != null ? campaign.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OrderItem orderItem = this.orderItem;
        C14235Ou c14235Ou = this.f85063ou;
        Account account = this.account;
        Customer customer = this.customer;
        Campaign campaign = this.campaign;
        return "OnePrepaidSubmitOrderRequest(orderItem=" + orderItem + ", ou=" + c14235Ou + ", account=" + account + ", customer=" + customer + ", campaign=" + campaign + ")";
    }

    public OnePrepaidSubmitOrderRequest(@Nullable OrderItem orderItem, @Nullable C14235Ou c14235Ou, @Nullable Account account, @Nullable Customer customer, @Nullable Campaign campaign) {
        this.orderItem = orderItem;
        this.f85063ou = c14235Ou;
        this.account = account;
        this.customer = customer;
        this.campaign = campaign;
    }

    public /* synthetic */ OnePrepaidSubmitOrderRequest(OrderItem orderItem, C14235Ou c14235Ou, Account account, Customer customer, Campaign campaign, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderItem, (i & 2) != 0 ? null : c14235Ou, (i & 4) != 0 ? null : account, (i & 8) != 0 ? null : customer, (i & 16) != 0 ? null : campaign);
    }
}
