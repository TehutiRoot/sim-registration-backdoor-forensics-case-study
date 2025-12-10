package th.p047co.dtac.android.dtacone.model.appOne.postpaid.search;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/search/OnePostpaidBrandedSearchPackageGroupRequest;", "", "packageGroupRefNo", "", "keyword", "(Ljava/lang/String;Ljava/lang/String;)V", "getKeyword", "()Ljava/lang/String;", "getPackageGroupRefNo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.search.OnePostpaidBrandedSearchPackageGroupRequest */
/* loaded from: classes8.dex */
public final class OnePostpaidBrandedSearchPackageGroupRequest {
    public static final int $stable = 0;
    @SerializedName("keyword")
    @Nullable
    private final String keyword;
    @SerializedName("packageGroupRefNo")
    @Nullable
    private final String packageGroupRefNo;

    public OnePostpaidBrandedSearchPackageGroupRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OnePostpaidBrandedSearchPackageGroupRequest copy$default(OnePostpaidBrandedSearchPackageGroupRequest onePostpaidBrandedSearchPackageGroupRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostpaidBrandedSearchPackageGroupRequest.packageGroupRefNo;
        }
        if ((i & 2) != 0) {
            str2 = onePostpaidBrandedSearchPackageGroupRequest.keyword;
        }
        return onePostpaidBrandedSearchPackageGroupRequest.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.packageGroupRefNo;
    }

    @Nullable
    public final String component2() {
        return this.keyword;
    }

    @NotNull
    public final OnePostpaidBrandedSearchPackageGroupRequest copy(@Nullable String str, @Nullable String str2) {
        return new OnePostpaidBrandedSearchPackageGroupRequest(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidBrandedSearchPackageGroupRequest) {
            OnePostpaidBrandedSearchPackageGroupRequest onePostpaidBrandedSearchPackageGroupRequest = (OnePostpaidBrandedSearchPackageGroupRequest) obj;
            return Intrinsics.areEqual(this.packageGroupRefNo, onePostpaidBrandedSearchPackageGroupRequest.packageGroupRefNo) && Intrinsics.areEqual(this.keyword, onePostpaidBrandedSearchPackageGroupRequest.keyword);
        }
        return false;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final String getPackageGroupRefNo() {
        return this.packageGroupRefNo;
    }

    public int hashCode() {
        String str = this.packageGroupRefNo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.keyword;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupRefNo;
        String str2 = this.keyword;
        return "OnePostpaidBrandedSearchPackageGroupRequest(packageGroupRefNo=" + str + ", keyword=" + str2 + ")";
    }

    public OnePostpaidBrandedSearchPackageGroupRequest(@Nullable String str, @Nullable String str2) {
        this.packageGroupRefNo = str;
        this.keyword = str2;
    }

    public /* synthetic */ OnePostpaidBrandedSearchPackageGroupRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
