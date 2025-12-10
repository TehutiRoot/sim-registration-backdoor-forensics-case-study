package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0014¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/SearchPackageGroupByRefRequest;", "", "userLan", "", "userCode", "userFormatType", "packageGroupRefNo", "packageRefNo", "packageType", "criteria", "campaignPaymentTypeCriteria", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignPaymentTypeCriteria", "()Ljava/lang/String;", "getCriteria", "getPackageGroupRefNo", "getPackageRefNo", "getPackageType", "getUserCode", "setUserCode", "(Ljava/lang/String;)V", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.SearchPackageGroupByRefRequest */
/* loaded from: classes8.dex */
public final class SearchPackageGroupByRefRequest {
    public static final int $stable = 8;
    @SerializedName("campaignPaymentTypeCriteria")
    @Nullable
    private final String campaignPaymentTypeCriteria;
    @SerializedName("criteria")
    @NotNull
    private final String criteria;
    @SerializedName("packageGroupRefNo")
    @NotNull
    private final String packageGroupRefNo;
    @SerializedName("packageRefNo")
    @NotNull
    private final String packageRefNo;
    @SerializedName("packageType")
    @NotNull
    private final String packageType;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public SearchPackageGroupByRefRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.userFormatType;
    }

    @NotNull
    public final String component4() {
        return this.packageGroupRefNo;
    }

    @NotNull
    public final String component5() {
        return this.packageRefNo;
    }

    @NotNull
    public final String component6() {
        return this.packageType;
    }

    @NotNull
    public final String component7() {
        return this.criteria;
    }

    @Nullable
    public final String component8() {
        return this.campaignPaymentTypeCriteria;
    }

    @NotNull
    public final SearchPackageGroupByRefRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String packageGroupRefNo, @NotNull String packageRefNo, @NotNull String packageType, @NotNull String criteria, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(packageRefNo, "packageRefNo");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        return new SearchPackageGroupByRefRequest(userLan, userCode, userFormatType, packageGroupRefNo, packageRefNo, packageType, criteria, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchPackageGroupByRefRequest) {
            SearchPackageGroupByRefRequest searchPackageGroupByRefRequest = (SearchPackageGroupByRefRequest) obj;
            return Intrinsics.areEqual(this.userLan, searchPackageGroupByRefRequest.userLan) && Intrinsics.areEqual(this.userCode, searchPackageGroupByRefRequest.userCode) && Intrinsics.areEqual(this.userFormatType, searchPackageGroupByRefRequest.userFormatType) && Intrinsics.areEqual(this.packageGroupRefNo, searchPackageGroupByRefRequest.packageGroupRefNo) && Intrinsics.areEqual(this.packageRefNo, searchPackageGroupByRefRequest.packageRefNo) && Intrinsics.areEqual(this.packageType, searchPackageGroupByRefRequest.packageType) && Intrinsics.areEqual(this.criteria, searchPackageGroupByRefRequest.criteria) && Intrinsics.areEqual(this.campaignPaymentTypeCriteria, searchPackageGroupByRefRequest.campaignPaymentTypeCriteria);
        }
        return false;
    }

    @Nullable
    public final String getCampaignPaymentTypeCriteria() {
        return this.campaignPaymentTypeCriteria;
    }

    @NotNull
    public final String getCriteria() {
        return this.criteria;
    }

    @NotNull
    public final String getPackageGroupRefNo() {
        return this.packageGroupRefNo;
    }

    @NotNull
    public final String getPackageRefNo() {
        return this.packageRefNo;
    }

    @NotNull
    public final String getPackageType() {
        return this.packageType;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.packageGroupRefNo.hashCode()) * 31) + this.packageRefNo.hashCode()) * 31) + this.packageType.hashCode()) * 31) + this.criteria.hashCode()) * 31;
        String str = this.campaignPaymentTypeCriteria;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.userFormatType;
        String str4 = this.packageGroupRefNo;
        String str5 = this.packageRefNo;
        String str6 = this.packageType;
        String str7 = this.criteria;
        String str8 = this.campaignPaymentTypeCriteria;
        return "SearchPackageGroupByRefRequest(userLan=" + str + ", userCode=" + str2 + ", userFormatType=" + str3 + ", packageGroupRefNo=" + str4 + ", packageRefNo=" + str5 + ", packageType=" + str6 + ", criteria=" + str7 + ", campaignPaymentTypeCriteria=" + str8 + ")";
    }

    public SearchPackageGroupByRefRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String packageGroupRefNo, @NotNull String packageRefNo, @NotNull String packageType, @NotNull String criteria, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(packageRefNo, "packageRefNo");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        this.userLan = userLan;
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.packageGroupRefNo = packageGroupRefNo;
        this.packageRefNo = packageRefNo;
        this.packageType = packageType;
        this.criteria = criteria;
        this.campaignPaymentTypeCriteria = str;
    }

    public /* synthetic */ SearchPackageGroupByRefRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : str8);
    }
}