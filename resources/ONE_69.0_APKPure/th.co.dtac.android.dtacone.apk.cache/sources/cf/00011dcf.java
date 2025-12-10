package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.PACKAGE_SUMMARY;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%¨\u0006@"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/NextCyclePackage;", "", "displayPackageDate", "", "packageGroupCode", "packageSequence", "packageGroupDescription", "packageStartDate", "packageEndDate", "recurringFlag", "packageType", "billingProductFlag", "chargeFlag", "transactionFlag", "lastChangeDatetime", "page", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PACKAGE_SUMMARY;", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PACKAGE_SUMMARY;Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PACKAGE_SUMMARY;)V", "getBillingProductFlag", "()Ljava/lang/String;", "setBillingProductFlag", "(Ljava/lang/String;)V", "getChargeFlag", "setChargeFlag", "getDisplayPackageDate", "getLastChangeDatetime", "setLastChangeDatetime", "getPackageEndDate", "getPackageGroupCode", "getPackageGroupDescription", "getPackageSequence", "getPackageStartDate", "getPackageType", "getPage", "()Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PACKAGE_SUMMARY;", "setPage", "(Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PACKAGE_SUMMARY;)V", "getRecurringFlag", "getTransactionFlag", "setTransactionFlag", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.NextCyclePackage */
/* loaded from: classes8.dex */
public final class NextCyclePackage {
    public static final int $stable = 8;
    @SerializedName("billingProductFlag")
    @Nullable
    private String billingProductFlag;
    @SerializedName("chargeFlag")
    @Nullable
    private String chargeFlag;
    @SerializedName("displayPackageDate")
    @Nullable
    private final String displayPackageDate;
    @SerializedName("lastChangeDatetime")
    @Nullable
    private String lastChangeDatetime;
    @SerializedName("packageEndDate")
    @Nullable
    private final String packageEndDate;
    @SerializedName("packageGroupCode")
    @Nullable
    private final String packageGroupCode;
    @SerializedName("packageGroupDescription")
    @Nullable
    private final String packageGroupDescription;
    @SerializedName("packageSequence")
    @Nullable
    private final String packageSequence;
    @SerializedName("packageStartDate")
    @Nullable
    private final String packageStartDate;
    @SerializedName("packageType")
    @Nullable
    private final String packageType;
    @Nullable
    private PACKAGE_SUMMARY page;
    @SerializedName("recurringFlag")
    @Nullable
    private final String recurringFlag;
    @SerializedName("transactionFlag")
    @Nullable
    private String transactionFlag;
    @Nullable
    private PACKAGE_SUMMARY type;

    public NextCyclePackage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Nullable
    public final String component1() {
        return this.displayPackageDate;
    }

    @Nullable
    public final String component10() {
        return this.chargeFlag;
    }

    @Nullable
    public final String component11() {
        return this.transactionFlag;
    }

    @Nullable
    public final String component12() {
        return this.lastChangeDatetime;
    }

    @Nullable
    public final PACKAGE_SUMMARY component13() {
        return this.page;
    }

    @Nullable
    public final PACKAGE_SUMMARY component14() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String component3() {
        return this.packageSequence;
    }

    @Nullable
    public final String component4() {
        return this.packageGroupDescription;
    }

    @Nullable
    public final String component5() {
        return this.packageStartDate;
    }

    @Nullable
    public final String component6() {
        return this.packageEndDate;
    }

    @Nullable
    public final String component7() {
        return this.recurringFlag;
    }

    @Nullable
    public final String component8() {
        return this.packageType;
    }

    @Nullable
    public final String component9() {
        return this.billingProductFlag;
    }

    @NotNull
    public final NextCyclePackage copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable PACKAGE_SUMMARY package_summary, @Nullable PACKAGE_SUMMARY package_summary2) {
        return new NextCyclePackage(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, package_summary, package_summary2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NextCyclePackage) {
            NextCyclePackage nextCyclePackage = (NextCyclePackage) obj;
            return Intrinsics.areEqual(this.displayPackageDate, nextCyclePackage.displayPackageDate) && Intrinsics.areEqual(this.packageGroupCode, nextCyclePackage.packageGroupCode) && Intrinsics.areEqual(this.packageSequence, nextCyclePackage.packageSequence) && Intrinsics.areEqual(this.packageGroupDescription, nextCyclePackage.packageGroupDescription) && Intrinsics.areEqual(this.packageStartDate, nextCyclePackage.packageStartDate) && Intrinsics.areEqual(this.packageEndDate, nextCyclePackage.packageEndDate) && Intrinsics.areEqual(this.recurringFlag, nextCyclePackage.recurringFlag) && Intrinsics.areEqual(this.packageType, nextCyclePackage.packageType) && Intrinsics.areEqual(this.billingProductFlag, nextCyclePackage.billingProductFlag) && Intrinsics.areEqual(this.chargeFlag, nextCyclePackage.chargeFlag) && Intrinsics.areEqual(this.transactionFlag, nextCyclePackage.transactionFlag) && Intrinsics.areEqual(this.lastChangeDatetime, nextCyclePackage.lastChangeDatetime) && this.page == nextCyclePackage.page && this.type == nextCyclePackage.type;
        }
        return false;
    }

    @Nullable
    public final String getBillingProductFlag() {
        return this.billingProductFlag;
    }

    @Nullable
    public final String getChargeFlag() {
        return this.chargeFlag;
    }

    @Nullable
    public final String getDisplayPackageDate() {
        return this.displayPackageDate;
    }

    @Nullable
    public final String getLastChangeDatetime() {
        return this.lastChangeDatetime;
    }

    @Nullable
    public final String getPackageEndDate() {
        return this.packageEndDate;
    }

    @Nullable
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String getPackageGroupDescription() {
        return this.packageGroupDescription;
    }

    @Nullable
    public final String getPackageSequence() {
        return this.packageSequence;
    }

    @Nullable
    public final String getPackageStartDate() {
        return this.packageStartDate;
    }

    @Nullable
    public final String getPackageType() {
        return this.packageType;
    }

    @Nullable
    public final PACKAGE_SUMMARY getPage() {
        return this.page;
    }

    @Nullable
    public final String getRecurringFlag() {
        return this.recurringFlag;
    }

    @Nullable
    public final String getTransactionFlag() {
        return this.transactionFlag;
    }

    @Nullable
    public final PACKAGE_SUMMARY getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.displayPackageDate;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageGroupCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageSequence;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageGroupDescription;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.packageStartDate;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.packageEndDate;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recurringFlag;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.packageType;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.billingProductFlag;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.chargeFlag;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.transactionFlag;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastChangeDatetime;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        PACKAGE_SUMMARY package_summary = this.page;
        int hashCode13 = (hashCode12 + (package_summary == null ? 0 : package_summary.hashCode())) * 31;
        PACKAGE_SUMMARY package_summary2 = this.type;
        return hashCode13 + (package_summary2 != null ? package_summary2.hashCode() : 0);
    }

    public final void setBillingProductFlag(@Nullable String str) {
        this.billingProductFlag = str;
    }

    public final void setChargeFlag(@Nullable String str) {
        this.chargeFlag = str;
    }

    public final void setLastChangeDatetime(@Nullable String str) {
        this.lastChangeDatetime = str;
    }

    public final void setPage(@Nullable PACKAGE_SUMMARY package_summary) {
        this.page = package_summary;
    }

    public final void setTransactionFlag(@Nullable String str) {
        this.transactionFlag = str;
    }

    public final void setType(@Nullable PACKAGE_SUMMARY package_summary) {
        this.type = package_summary;
    }

    @NotNull
    public String toString() {
        String str = this.displayPackageDate;
        String str2 = this.packageGroupCode;
        String str3 = this.packageSequence;
        String str4 = this.packageGroupDescription;
        String str5 = this.packageStartDate;
        String str6 = this.packageEndDate;
        String str7 = this.recurringFlag;
        String str8 = this.packageType;
        String str9 = this.billingProductFlag;
        String str10 = this.chargeFlag;
        String str11 = this.transactionFlag;
        String str12 = this.lastChangeDatetime;
        PACKAGE_SUMMARY package_summary = this.page;
        PACKAGE_SUMMARY package_summary2 = this.type;
        return "NextCyclePackage(displayPackageDate=" + str + ", packageGroupCode=" + str2 + ", packageSequence=" + str3 + ", packageGroupDescription=" + str4 + ", packageStartDate=" + str5 + ", packageEndDate=" + str6 + ", recurringFlag=" + str7 + ", packageType=" + str8 + ", billingProductFlag=" + str9 + ", chargeFlag=" + str10 + ", transactionFlag=" + str11 + ", lastChangeDatetime=" + str12 + ", page=" + package_summary + ", type=" + package_summary2 + ")";
    }

    public NextCyclePackage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable PACKAGE_SUMMARY package_summary, @Nullable PACKAGE_SUMMARY package_summary2) {
        this.displayPackageDate = str;
        this.packageGroupCode = str2;
        this.packageSequence = str3;
        this.packageGroupDescription = str4;
        this.packageStartDate = str5;
        this.packageEndDate = str6;
        this.recurringFlag = str7;
        this.packageType = str8;
        this.billingProductFlag = str9;
        this.chargeFlag = str10;
        this.transactionFlag = str11;
        this.lastChangeDatetime = str12;
        this.page = package_summary;
        this.type = package_summary2;
    }

    public /* synthetic */ NextCyclePackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, PACKAGE_SUMMARY package_summary, PACKAGE_SUMMARY package_summary2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : package_summary, (i & 8192) == 0 ? package_summary2 : null);
    }
}