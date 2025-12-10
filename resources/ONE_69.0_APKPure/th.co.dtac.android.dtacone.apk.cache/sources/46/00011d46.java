package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/SearchPackageGroupRequest;", "", "packageRefNo", "", "packageGroupRefNo", "criteria", "packageType", "campaignPaymentTypeCriteria", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignPaymentTypeCriteria", "()Ljava/lang/String;", "getCriteria", "getPackageGroupRefNo", "getPackageRefNo", "getPackageType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.SearchPackageGroupRequest */
/* loaded from: classes8.dex */
public final class SearchPackageGroupRequest {
    public static final int $stable = 0;
    @Nullable
    private final String campaignPaymentTypeCriteria;
    @NotNull
    private final String criteria;
    @NotNull
    private final String packageGroupRefNo;
    @NotNull
    private final String packageRefNo;
    @Nullable
    private final String packageType;

    public SearchPackageGroupRequest(@NotNull String packageRefNo, @NotNull String packageGroupRefNo, @NotNull String criteria, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(packageRefNo, "packageRefNo");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        this.packageRefNo = packageRefNo;
        this.packageGroupRefNo = packageGroupRefNo;
        this.criteria = criteria;
        this.packageType = str;
        this.campaignPaymentTypeCriteria = str2;
    }

    public static /* synthetic */ SearchPackageGroupRequest copy$default(SearchPackageGroupRequest searchPackageGroupRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchPackageGroupRequest.packageRefNo;
        }
        if ((i & 2) != 0) {
            str2 = searchPackageGroupRequest.packageGroupRefNo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = searchPackageGroupRequest.criteria;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = searchPackageGroupRequest.packageType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = searchPackageGroupRequest.campaignPaymentTypeCriteria;
        }
        return searchPackageGroupRequest.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.packageRefNo;
    }

    @NotNull
    public final String component2() {
        return this.packageGroupRefNo;
    }

    @NotNull
    public final String component3() {
        return this.criteria;
    }

    @Nullable
    public final String component4() {
        return this.packageType;
    }

    @Nullable
    public final String component5() {
        return this.campaignPaymentTypeCriteria;
    }

    @NotNull
    public final SearchPackageGroupRequest copy(@NotNull String packageRefNo, @NotNull String packageGroupRefNo, @NotNull String criteria, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(packageRefNo, "packageRefNo");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        return new SearchPackageGroupRequest(packageRefNo, packageGroupRefNo, criteria, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchPackageGroupRequest) {
            SearchPackageGroupRequest searchPackageGroupRequest = (SearchPackageGroupRequest) obj;
            return Intrinsics.areEqual(this.packageRefNo, searchPackageGroupRequest.packageRefNo) && Intrinsics.areEqual(this.packageGroupRefNo, searchPackageGroupRequest.packageGroupRefNo) && Intrinsics.areEqual(this.criteria, searchPackageGroupRequest.criteria) && Intrinsics.areEqual(this.packageType, searchPackageGroupRequest.packageType) && Intrinsics.areEqual(this.campaignPaymentTypeCriteria, searchPackageGroupRequest.campaignPaymentTypeCriteria);
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

    @Nullable
    public final String getPackageType() {
        return this.packageType;
    }

    public int hashCode() {
        int hashCode = ((((this.packageRefNo.hashCode() * 31) + this.packageGroupRefNo.hashCode()) * 31) + this.criteria.hashCode()) * 31;
        String str = this.packageType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.campaignPaymentTypeCriteria;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageRefNo;
        String str2 = this.packageGroupRefNo;
        String str3 = this.criteria;
        String str4 = this.packageType;
        String str5 = this.campaignPaymentTypeCriteria;
        return "SearchPackageGroupRequest(packageRefNo=" + str + ", packageGroupRefNo=" + str2 + ", criteria=" + str3 + ", packageType=" + str4 + ", campaignPaymentTypeCriteria=" + str5 + ")";
    }

    public /* synthetic */ SearchPackageGroupRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}