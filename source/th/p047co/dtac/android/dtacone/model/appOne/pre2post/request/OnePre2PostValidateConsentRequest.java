package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostValidateConsentRequest;", "", "action", "", "customer", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostCustomerRequest;", "orderId", "readCard", "", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostCustomerRequest;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAction", "()Ljava/lang/String;", "getCustomer", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostCustomerRequest;", "getOrderId", "getReadCard", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostCustomerRequest;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostValidateConsentRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostValidateConsentRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostValidateConsentRequest {
    public static final int $stable = 0;
    @SerializedName("action")
    @Nullable
    private final String action;
    @SerializedName("customer")
    @Nullable
    private final OnePre2PostCustomerRequest customer;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName("readCard")
    @Nullable
    private final Boolean readCard;

    public OnePre2PostValidateConsentRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OnePre2PostValidateConsentRequest copy$default(OnePre2PostValidateConsentRequest onePre2PostValidateConsentRequest, String str, OnePre2PostCustomerRequest onePre2PostCustomerRequest, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostValidateConsentRequest.action;
        }
        if ((i & 2) != 0) {
            onePre2PostCustomerRequest = onePre2PostValidateConsentRequest.customer;
        }
        if ((i & 4) != 0) {
            str2 = onePre2PostValidateConsentRequest.orderId;
        }
        if ((i & 8) != 0) {
            bool = onePre2PostValidateConsentRequest.readCard;
        }
        return onePre2PostValidateConsentRequest.copy(str, onePre2PostCustomerRequest, str2, bool);
    }

    @Nullable
    public final String component1() {
        return this.action;
    }

    @Nullable
    public final OnePre2PostCustomerRequest component2() {
        return this.customer;
    }

    @Nullable
    public final String component3() {
        return this.orderId;
    }

    @Nullable
    public final Boolean component4() {
        return this.readCard;
    }

    @NotNull
    public final OnePre2PostValidateConsentRequest copy(@Nullable String str, @Nullable OnePre2PostCustomerRequest onePre2PostCustomerRequest, @Nullable String str2, @Nullable Boolean bool) {
        return new OnePre2PostValidateConsentRequest(str, onePre2PostCustomerRequest, str2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostValidateConsentRequest) {
            OnePre2PostValidateConsentRequest onePre2PostValidateConsentRequest = (OnePre2PostValidateConsentRequest) obj;
            return Intrinsics.areEqual(this.action, onePre2PostValidateConsentRequest.action) && Intrinsics.areEqual(this.customer, onePre2PostValidateConsentRequest.customer) && Intrinsics.areEqual(this.orderId, onePre2PostValidateConsentRequest.orderId) && Intrinsics.areEqual(this.readCard, onePre2PostValidateConsentRequest.readCard);
        }
        return false;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final OnePre2PostCustomerRequest getCustomer() {
        return this.customer;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Boolean getReadCard() {
        return this.readCard;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OnePre2PostCustomerRequest onePre2PostCustomerRequest = this.customer;
        int hashCode2 = (hashCode + (onePre2PostCustomerRequest == null ? 0 : onePre2PostCustomerRequest.hashCode())) * 31;
        String str2 = this.orderId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.readCard;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        OnePre2PostCustomerRequest onePre2PostCustomerRequest = this.customer;
        String str2 = this.orderId;
        Boolean bool = this.readCard;
        return "OnePre2PostValidateConsentRequest(action=" + str + ", customer=" + onePre2PostCustomerRequest + ", orderId=" + str2 + ", readCard=" + bool + ")";
    }

    public OnePre2PostValidateConsentRequest(@Nullable String str, @Nullable OnePre2PostCustomerRequest onePre2PostCustomerRequest, @Nullable String str2, @Nullable Boolean bool) {
        this.action = str;
        this.customer = onePre2PostCustomerRequest;
        this.orderId = str2;
        this.readCard = bool;
    }

    public /* synthetic */ OnePre2PostValidateConsentRequest(String str, OnePre2PostCustomerRequest onePre2PostCustomerRequest, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : onePre2PostCustomerRequest, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
