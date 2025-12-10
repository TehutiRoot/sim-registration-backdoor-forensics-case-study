package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/OldContractInfo;", "", "contractNumber", "", "remainingDay", "firstDeviceEndContractDate", "firstDeviceDiscountAmount", "", "firstDeviceName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getContractNumber", "()Ljava/lang/String;", "getFirstDeviceDiscountAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFirstDeviceEndContractDate", "getFirstDeviceName", "getRemainingDay", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/device_sale/OldContractInfo;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.OldContractInfo */
/* loaded from: classes8.dex */
public final class OldContractInfo {
    public static final int $stable = 0;
    @SerializedName("contractNumber")
    @Nullable
    private final String contractNumber;
    @SerializedName("firstDeviceDiscountAmount")
    @Nullable
    private final Integer firstDeviceDiscountAmount;
    @SerializedName("firstDeviceEndContractDate")
    @Nullable
    private final String firstDeviceEndContractDate;
    @SerializedName("firstDeviceName")
    @Nullable
    private final String firstDeviceName;
    @SerializedName("remainingDay")
    @Nullable
    private final String remainingDay;

    public OldContractInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OldContractInfo copy$default(OldContractInfo oldContractInfo, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oldContractInfo.contractNumber;
        }
        if ((i & 2) != 0) {
            str2 = oldContractInfo.remainingDay;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = oldContractInfo.firstDeviceEndContractDate;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = oldContractInfo.firstDeviceDiscountAmount;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = oldContractInfo.firstDeviceName;
        }
        return oldContractInfo.copy(str, str5, str6, num2, str4);
    }

    @Nullable
    public final String component1() {
        return this.contractNumber;
    }

    @Nullable
    public final String component2() {
        return this.remainingDay;
    }

    @Nullable
    public final String component3() {
        return this.firstDeviceEndContractDate;
    }

    @Nullable
    public final Integer component4() {
        return this.firstDeviceDiscountAmount;
    }

    @Nullable
    public final String component5() {
        return this.firstDeviceName;
    }

    @NotNull
    public final OldContractInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4) {
        return new OldContractInfo(str, str2, str3, num, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OldContractInfo) {
            OldContractInfo oldContractInfo = (OldContractInfo) obj;
            return Intrinsics.areEqual(this.contractNumber, oldContractInfo.contractNumber) && Intrinsics.areEqual(this.remainingDay, oldContractInfo.remainingDay) && Intrinsics.areEqual(this.firstDeviceEndContractDate, oldContractInfo.firstDeviceEndContractDate) && Intrinsics.areEqual(this.firstDeviceDiscountAmount, oldContractInfo.firstDeviceDiscountAmount) && Intrinsics.areEqual(this.firstDeviceName, oldContractInfo.firstDeviceName);
        }
        return false;
    }

    @Nullable
    public final String getContractNumber() {
        return this.contractNumber;
    }

    @Nullable
    public final Integer getFirstDeviceDiscountAmount() {
        return this.firstDeviceDiscountAmount;
    }

    @Nullable
    public final String getFirstDeviceEndContractDate() {
        return this.firstDeviceEndContractDate;
    }

    @Nullable
    public final String getFirstDeviceName() {
        return this.firstDeviceName;
    }

    @Nullable
    public final String getRemainingDay() {
        return this.remainingDay;
    }

    public int hashCode() {
        String str = this.contractNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.remainingDay;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstDeviceEndContractDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.firstDeviceDiscountAmount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.firstDeviceName;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.contractNumber;
        String str2 = this.remainingDay;
        String str3 = this.firstDeviceEndContractDate;
        Integer num = this.firstDeviceDiscountAmount;
        String str4 = this.firstDeviceName;
        return "OldContractInfo(contractNumber=" + str + ", remainingDay=" + str2 + ", firstDeviceEndContractDate=" + str3 + ", firstDeviceDiscountAmount=" + num + ", firstDeviceName=" + str4 + ")";
    }

    public OldContractInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4) {
        this.contractNumber = str;
        this.remainingDay = str2;
        this.firstDeviceEndContractDate = str3;
        this.firstDeviceDiscountAmount = num;
        this.firstDeviceName = str4;
    }

    public /* synthetic */ OldContractInfo(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4);
    }
}