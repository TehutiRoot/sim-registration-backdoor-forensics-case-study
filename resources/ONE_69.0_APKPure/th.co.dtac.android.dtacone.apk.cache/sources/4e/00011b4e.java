package th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/OnePostpaidRetailerPackageDetailRequest;", "", "simType", "", "transactionType", "minPriceValue", "", "packageCode", "withDevice", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getMinPriceValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPackageCode", "()Ljava/lang/String;", "getSimType", "getTransactionType", "getWithDevice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/OnePostpaidRetailerPackageDetailRequest;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.OnePostpaidRetailerPackageDetailRequest */
/* loaded from: classes8.dex */
public final class OnePostpaidRetailerPackageDetailRequest {
    public static final int $stable = 0;
    @SerializedName("minPriceValue")
    @Nullable
    private final Integer minPriceValue;
    @SerializedName("packageCode")
    @Nullable
    private final String packageCode;
    @SerializedName("simType")
    @Nullable
    private final String simType;
    @SerializedName("transactionType")
    @Nullable
    private final String transactionType;
    @SerializedName("withDevice")
    @Nullable
    private final Boolean withDevice;

    public OnePostpaidRetailerPackageDetailRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OnePostpaidRetailerPackageDetailRequest copy$default(OnePostpaidRetailerPackageDetailRequest onePostpaidRetailerPackageDetailRequest, String str, String str2, Integer num, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostpaidRetailerPackageDetailRequest.simType;
        }
        if ((i & 2) != 0) {
            str2 = onePostpaidRetailerPackageDetailRequest.transactionType;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            num = onePostpaidRetailerPackageDetailRequest.minPriceValue;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = onePostpaidRetailerPackageDetailRequest.packageCode;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            bool = onePostpaidRetailerPackageDetailRequest.withDevice;
        }
        return onePostpaidRetailerPackageDetailRequest.copy(str, str4, num2, str5, bool);
    }

    @Nullable
    public final String component1() {
        return this.simType;
    }

    @Nullable
    public final String component2() {
        return this.transactionType;
    }

    @Nullable
    public final Integer component3() {
        return this.minPriceValue;
    }

    @Nullable
    public final String component4() {
        return this.packageCode;
    }

    @Nullable
    public final Boolean component5() {
        return this.withDevice;
    }

    @NotNull
    public final OnePostpaidRetailerPackageDetailRequest copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Boolean bool) {
        return new OnePostpaidRetailerPackageDetailRequest(str, str2, num, str3, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidRetailerPackageDetailRequest) {
            OnePostpaidRetailerPackageDetailRequest onePostpaidRetailerPackageDetailRequest = (OnePostpaidRetailerPackageDetailRequest) obj;
            return Intrinsics.areEqual(this.simType, onePostpaidRetailerPackageDetailRequest.simType) && Intrinsics.areEqual(this.transactionType, onePostpaidRetailerPackageDetailRequest.transactionType) && Intrinsics.areEqual(this.minPriceValue, onePostpaidRetailerPackageDetailRequest.minPriceValue) && Intrinsics.areEqual(this.packageCode, onePostpaidRetailerPackageDetailRequest.packageCode) && Intrinsics.areEqual(this.withDevice, onePostpaidRetailerPackageDetailRequest.withDevice);
        }
        return false;
    }

    @Nullable
    public final Integer getMinPriceValue() {
        return this.minPriceValue;
    }

    @Nullable
    public final String getPackageCode() {
        return this.packageCode;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final Boolean getWithDevice() {
        return this.withDevice;
    }

    public int hashCode() {
        String str = this.simType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transactionType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.minPriceValue;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.packageCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.withDevice;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simType;
        String str2 = this.transactionType;
        Integer num = this.minPriceValue;
        String str3 = this.packageCode;
        Boolean bool = this.withDevice;
        return "OnePostpaidRetailerPackageDetailRequest(simType=" + str + ", transactionType=" + str2 + ", minPriceValue=" + num + ", packageCode=" + str3 + ", withDevice=" + bool + ")";
    }

    public OnePostpaidRetailerPackageDetailRequest(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Boolean bool) {
        this.simType = str;
        this.transactionType = str2;
        this.minPriceValue = num;
        this.packageCode = str3;
        this.withDevice = bool;
    }

    public /* synthetic */ OnePostpaidRetailerPackageDetailRequest(String str, String str2, Integer num, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }
}