package th.p047co.dtac.android.dtacone.model.change_pro_happy.validateProfile.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/request/CustomerInfo;", "", "subscriber", "", "pricePlan", "idNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "setIdNumber", "(Ljava/lang/String;)V", "getPricePlan", "getSubscriber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pro_happy.validateProfile.request.CustomerInfo */
/* loaded from: classes8.dex */
public final class CustomerInfo {
    public static final int $stable = 8;
    @SerializedName("idNumber")
    @Nullable
    private String idNumber;
    @SerializedName("pricePlan")
    @Nullable
    private final String pricePlan;
    @SerializedName("subscriber")
    @Nullable
    private final String subscriber;

    public CustomerInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerInfo.subscriber;
        }
        if ((i & 2) != 0) {
            str2 = customerInfo.pricePlan;
        }
        if ((i & 4) != 0) {
            str3 = customerInfo.idNumber;
        }
        return customerInfo.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.subscriber;
    }

    @Nullable
    public final String component2() {
        return this.pricePlan;
    }

    @Nullable
    public final String component3() {
        return this.idNumber;
    }

    @NotNull
    public final CustomerInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new CustomerInfo(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerInfo) {
            CustomerInfo customerInfo = (CustomerInfo) obj;
            return Intrinsics.areEqual(this.subscriber, customerInfo.subscriber) && Intrinsics.areEqual(this.pricePlan, customerInfo.pricePlan) && Intrinsics.areEqual(this.idNumber, customerInfo.idNumber);
        }
        return false;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getPricePlan() {
        return this.pricePlan;
    }

    @Nullable
    public final String getSubscriber() {
        return this.subscriber;
    }

    public int hashCode() {
        String str = this.subscriber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pricePlan;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idNumber;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setIdNumber(@Nullable String str) {
        this.idNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.subscriber;
        String str2 = this.pricePlan;
        String str3 = this.idNumber;
        return "CustomerInfo(subscriber=" + str + ", pricePlan=" + str2 + ", idNumber=" + str3 + ")";
    }

    public CustomerInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.subscriber = str;
        this.pricePlan = str2;
        this.idNumber = str3;
    }

    public /* synthetic */ CustomerInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}