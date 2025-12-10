package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoResponse;", "", "arpuaverage3months", "", "behavior", "customerNumber", "generatedPeriod", "internetusagevolumnaverage3months", "minuteofuseaverage3months", "refillamountaverage3months", "refillaverage3months", "retentionGrade", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "isError", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getArpuaverage3months", "()Ljava/lang/String;", "getBehavior", "getCustomerNumber", "getGeneratedPeriod", "getInternetusagevolumnaverage3months", "()Z", "setError", "(Z)V", "getMinuteofuseaverage3months", "getRefillamountaverage3months", "getRefillaverage3months", "getRetentionGrade", "getSubscriberNumber", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoResponse */
/* loaded from: classes8.dex */
public final class DataUsageInfoResponse {
    public static final int $stable = 8;
    @SerializedName("arpuaverage3months")
    @NotNull
    private final String arpuaverage3months;
    @SerializedName("behavior")
    @NotNull
    private final String behavior;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("generatedPeriod")
    @NotNull
    private final String generatedPeriod;
    @SerializedName("internetusagevolumnaverage3months")
    @NotNull
    private final String internetusagevolumnaverage3months;
    private transient boolean isError;
    @SerializedName("minuteofuseaverage3months")
    @NotNull
    private final String minuteofuseaverage3months;
    @SerializedName("refillamountaverage3months")
    @NotNull
    private final String refillamountaverage3months;
    @SerializedName("refillaverage3months")
    @NotNull
    private final String refillaverage3months;
    @SerializedName("retentionGrade")
    @NotNull
    private final String retentionGrade;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;

    public DataUsageInfoResponse() {
        this(null, null, null, null, null, null, null, null, null, null, false, 2047, null);
    }

    @NotNull
    public final String component1() {
        return this.arpuaverage3months;
    }

    @NotNull
    public final String component10() {
        return this.subscriberNumber;
    }

    public final boolean component11() {
        return this.isError;
    }

    @NotNull
    public final String component2() {
        return this.behavior;
    }

    @NotNull
    public final String component3() {
        return this.customerNumber;
    }

    @NotNull
    public final String component4() {
        return this.generatedPeriod;
    }

    @NotNull
    public final String component5() {
        return this.internetusagevolumnaverage3months;
    }

    @NotNull
    public final String component6() {
        return this.minuteofuseaverage3months;
    }

    @NotNull
    public final String component7() {
        return this.refillamountaverage3months;
    }

    @NotNull
    public final String component8() {
        return this.refillaverage3months;
    }

    @NotNull
    public final String component9() {
        return this.retentionGrade;
    }

    @NotNull
    public final DataUsageInfoResponse copy(@NotNull String arpuaverage3months, @NotNull String behavior, @NotNull String customerNumber, @NotNull String generatedPeriod, @NotNull String internetusagevolumnaverage3months, @NotNull String minuteofuseaverage3months, @NotNull String refillamountaverage3months, @NotNull String refillaverage3months, @NotNull String retentionGrade, @NotNull String subscriberNumber, boolean z) {
        Intrinsics.checkNotNullParameter(arpuaverage3months, "arpuaverage3months");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(generatedPeriod, "generatedPeriod");
        Intrinsics.checkNotNullParameter(internetusagevolumnaverage3months, "internetusagevolumnaverage3months");
        Intrinsics.checkNotNullParameter(minuteofuseaverage3months, "minuteofuseaverage3months");
        Intrinsics.checkNotNullParameter(refillamountaverage3months, "refillamountaverage3months");
        Intrinsics.checkNotNullParameter(refillaverage3months, "refillaverage3months");
        Intrinsics.checkNotNullParameter(retentionGrade, "retentionGrade");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        return new DataUsageInfoResponse(arpuaverage3months, behavior, customerNumber, generatedPeriod, internetusagevolumnaverage3months, minuteofuseaverage3months, refillamountaverage3months, refillaverage3months, retentionGrade, subscriberNumber, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataUsageInfoResponse) {
            DataUsageInfoResponse dataUsageInfoResponse = (DataUsageInfoResponse) obj;
            return Intrinsics.areEqual(this.arpuaverage3months, dataUsageInfoResponse.arpuaverage3months) && Intrinsics.areEqual(this.behavior, dataUsageInfoResponse.behavior) && Intrinsics.areEqual(this.customerNumber, dataUsageInfoResponse.customerNumber) && Intrinsics.areEqual(this.generatedPeriod, dataUsageInfoResponse.generatedPeriod) && Intrinsics.areEqual(this.internetusagevolumnaverage3months, dataUsageInfoResponse.internetusagevolumnaverage3months) && Intrinsics.areEqual(this.minuteofuseaverage3months, dataUsageInfoResponse.minuteofuseaverage3months) && Intrinsics.areEqual(this.refillamountaverage3months, dataUsageInfoResponse.refillamountaverage3months) && Intrinsics.areEqual(this.refillaverage3months, dataUsageInfoResponse.refillaverage3months) && Intrinsics.areEqual(this.retentionGrade, dataUsageInfoResponse.retentionGrade) && Intrinsics.areEqual(this.subscriberNumber, dataUsageInfoResponse.subscriberNumber) && this.isError == dataUsageInfoResponse.isError;
        }
        return false;
    }

    @NotNull
    public final String getArpuaverage3months() {
        return this.arpuaverage3months;
    }

    @NotNull
    public final String getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getGeneratedPeriod() {
        return this.generatedPeriod;
    }

    @NotNull
    public final String getInternetusagevolumnaverage3months() {
        return this.internetusagevolumnaverage3months;
    }

    @NotNull
    public final String getMinuteofuseaverage3months() {
        return this.minuteofuseaverage3months;
    }

    @NotNull
    public final String getRefillamountaverage3months() {
        return this.refillamountaverage3months;
    }

    @NotNull
    public final String getRefillaverage3months() {
        return this.refillaverage3months;
    }

    @NotNull
    public final String getRetentionGrade() {
        return this.retentionGrade;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((this.arpuaverage3months.hashCode() * 31) + this.behavior.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.generatedPeriod.hashCode()) * 31) + this.internetusagevolumnaverage3months.hashCode()) * 31) + this.minuteofuseaverage3months.hashCode()) * 31) + this.refillamountaverage3months.hashCode()) * 31) + this.refillaverage3months.hashCode()) * 31) + this.retentionGrade.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31;
        boolean z = this.isError;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final void setError(boolean z) {
        this.isError = z;
    }

    @NotNull
    public String toString() {
        String str = this.arpuaverage3months;
        String str2 = this.behavior;
        String str3 = this.customerNumber;
        String str4 = this.generatedPeriod;
        String str5 = this.internetusagevolumnaverage3months;
        String str6 = this.minuteofuseaverage3months;
        String str7 = this.refillamountaverage3months;
        String str8 = this.refillaverage3months;
        String str9 = this.retentionGrade;
        String str10 = this.subscriberNumber;
        boolean z = this.isError;
        return "DataUsageInfoResponse(arpuaverage3months=" + str + ", behavior=" + str2 + ", customerNumber=" + str3 + ", generatedPeriod=" + str4 + ", internetusagevolumnaverage3months=" + str5 + ", minuteofuseaverage3months=" + str6 + ", refillamountaverage3months=" + str7 + ", refillaverage3months=" + str8 + ", retentionGrade=" + str9 + ", subscriberNumber=" + str10 + ", isError=" + z + ")";
    }

    public DataUsageInfoResponse(@NotNull String arpuaverage3months, @NotNull String behavior, @NotNull String customerNumber, @NotNull String generatedPeriod, @NotNull String internetusagevolumnaverage3months, @NotNull String minuteofuseaverage3months, @NotNull String refillamountaverage3months, @NotNull String refillaverage3months, @NotNull String retentionGrade, @NotNull String subscriberNumber, boolean z) {
        Intrinsics.checkNotNullParameter(arpuaverage3months, "arpuaverage3months");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(generatedPeriod, "generatedPeriod");
        Intrinsics.checkNotNullParameter(internetusagevolumnaverage3months, "internetusagevolumnaverage3months");
        Intrinsics.checkNotNullParameter(minuteofuseaverage3months, "minuteofuseaverage3months");
        Intrinsics.checkNotNullParameter(refillamountaverage3months, "refillamountaverage3months");
        Intrinsics.checkNotNullParameter(refillaverage3months, "refillaverage3months");
        Intrinsics.checkNotNullParameter(retentionGrade, "retentionGrade");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.arpuaverage3months = arpuaverage3months;
        this.behavior = behavior;
        this.customerNumber = customerNumber;
        this.generatedPeriod = generatedPeriod;
        this.internetusagevolumnaverage3months = internetusagevolumnaverage3months;
        this.minuteofuseaverage3months = minuteofuseaverage3months;
        this.refillamountaverage3months = refillamountaverage3months;
        this.refillaverage3months = refillaverage3months;
        this.retentionGrade = retentionGrade;
        this.subscriberNumber = subscriberNumber;
        this.isError = z;
    }

    public /* synthetic */ DataUsageInfoResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "", (i & 1024) != 0 ? false : z);
    }
}