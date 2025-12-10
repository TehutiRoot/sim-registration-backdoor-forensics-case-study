package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGenAppFormsRequest;", "", "customerInfo", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGenAppFormsCustomerInfoRequest;", "feature", "", "orderId", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGenAppFormsCustomerInfoRequest;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerInfo", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGenAppFormsCustomerInfoRequest;", "getFeature", "()Ljava/lang/String;", "getOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostGenAppFormsRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostGenAppFormsRequest {
    public static final int $stable = 0;
    @SerializedName("customerInfo")
    @Nullable
    private final OnePre2PostGenAppFormsCustomerInfoRequest customerInfo;
    @SerializedName("feature")
    @Nullable
    private final String feature;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;

    public OnePre2PostGenAppFormsRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OnePre2PostGenAppFormsRequest copy$default(OnePre2PostGenAppFormsRequest onePre2PostGenAppFormsRequest, OnePre2PostGenAppFormsCustomerInfoRequest onePre2PostGenAppFormsCustomerInfoRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            onePre2PostGenAppFormsCustomerInfoRequest = onePre2PostGenAppFormsRequest.customerInfo;
        }
        if ((i & 2) != 0) {
            str = onePre2PostGenAppFormsRequest.feature;
        }
        if ((i & 4) != 0) {
            str2 = onePre2PostGenAppFormsRequest.orderId;
        }
        return onePre2PostGenAppFormsRequest.copy(onePre2PostGenAppFormsCustomerInfoRequest, str, str2);
    }

    @Nullable
    public final OnePre2PostGenAppFormsCustomerInfoRequest component1() {
        return this.customerInfo;
    }

    @Nullable
    public final String component2() {
        return this.feature;
    }

    @Nullable
    public final String component3() {
        return this.orderId;
    }

    @NotNull
    public final OnePre2PostGenAppFormsRequest copy(@Nullable OnePre2PostGenAppFormsCustomerInfoRequest onePre2PostGenAppFormsCustomerInfoRequest, @Nullable String str, @Nullable String str2) {
        return new OnePre2PostGenAppFormsRequest(onePre2PostGenAppFormsCustomerInfoRequest, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostGenAppFormsRequest) {
            OnePre2PostGenAppFormsRequest onePre2PostGenAppFormsRequest = (OnePre2PostGenAppFormsRequest) obj;
            return Intrinsics.areEqual(this.customerInfo, onePre2PostGenAppFormsRequest.customerInfo) && Intrinsics.areEqual(this.feature, onePre2PostGenAppFormsRequest.feature) && Intrinsics.areEqual(this.orderId, onePre2PostGenAppFormsRequest.orderId);
        }
        return false;
    }

    @Nullable
    public final OnePre2PostGenAppFormsCustomerInfoRequest getCustomerInfo() {
        return this.customerInfo;
    }

    @Nullable
    public final String getFeature() {
        return this.feature;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        OnePre2PostGenAppFormsCustomerInfoRequest onePre2PostGenAppFormsCustomerInfoRequest = this.customerInfo;
        int hashCode = (onePre2PostGenAppFormsCustomerInfoRequest == null ? 0 : onePre2PostGenAppFormsCustomerInfoRequest.hashCode()) * 31;
        String str = this.feature;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OnePre2PostGenAppFormsCustomerInfoRequest onePre2PostGenAppFormsCustomerInfoRequest = this.customerInfo;
        String str = this.feature;
        String str2 = this.orderId;
        return "OnePre2PostGenAppFormsRequest(customerInfo=" + onePre2PostGenAppFormsCustomerInfoRequest + ", feature=" + str + ", orderId=" + str2 + ")";
    }

    public OnePre2PostGenAppFormsRequest(@Nullable OnePre2PostGenAppFormsCustomerInfoRequest onePre2PostGenAppFormsCustomerInfoRequest, @Nullable String str, @Nullable String str2) {
        this.customerInfo = onePre2PostGenAppFormsCustomerInfoRequest;
        this.feature = str;
        this.orderId = str2;
    }

    public /* synthetic */ OnePre2PostGenAppFormsRequest(OnePre2PostGenAppFormsCustomerInfoRequest onePre2PostGenAppFormsCustomerInfoRequest, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onePre2PostGenAppFormsCustomerInfoRequest, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
