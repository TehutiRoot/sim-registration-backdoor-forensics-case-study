package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/SearchPackageGroupBrandedPre2PostByRefRequest;", "", "packageGroupRefNo", "", "keyword", "(Ljava/lang/String;Ljava/lang/String;)V", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "getPackageGroupRefNo", "setPackageGroupRefNo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.SearchPackageGroupBrandedPre2PostByRefRequest */
/* loaded from: classes8.dex */
public final class SearchPackageGroupBrandedPre2PostByRefRequest {
    public static final int $stable = 8;
    @SerializedName("keyword")
    @NotNull
    private String keyword;
    @SerializedName("packageGroupRefNo")
    @NotNull
    private String packageGroupRefNo;

    public SearchPackageGroupBrandedPre2PostByRefRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SearchPackageGroupBrandedPre2PostByRefRequest copy$default(SearchPackageGroupBrandedPre2PostByRefRequest searchPackageGroupBrandedPre2PostByRefRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchPackageGroupBrandedPre2PostByRefRequest.packageGroupRefNo;
        }
        if ((i & 2) != 0) {
            str2 = searchPackageGroupBrandedPre2PostByRefRequest.keyword;
        }
        return searchPackageGroupBrandedPre2PostByRefRequest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.packageGroupRefNo;
    }

    @NotNull
    public final String component2() {
        return this.keyword;
    }

    @NotNull
    public final SearchPackageGroupBrandedPre2PostByRefRequest copy(@NotNull String packageGroupRefNo, @NotNull String keyword) {
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new SearchPackageGroupBrandedPre2PostByRefRequest(packageGroupRefNo, keyword);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchPackageGroupBrandedPre2PostByRefRequest) {
            SearchPackageGroupBrandedPre2PostByRefRequest searchPackageGroupBrandedPre2PostByRefRequest = (SearchPackageGroupBrandedPre2PostByRefRequest) obj;
            return Intrinsics.areEqual(this.packageGroupRefNo, searchPackageGroupBrandedPre2PostByRefRequest.packageGroupRefNo) && Intrinsics.areEqual(this.keyword, searchPackageGroupBrandedPre2PostByRefRequest.keyword);
        }
        return false;
    }

    @NotNull
    public final String getKeyword() {
        return this.keyword;
    }

    @NotNull
    public final String getPackageGroupRefNo() {
        return this.packageGroupRefNo;
    }

    public int hashCode() {
        return (this.packageGroupRefNo.hashCode() * 31) + this.keyword.hashCode();
    }

    public final void setKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keyword = str;
    }

    public final void setPackageGroupRefNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupRefNo = str;
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupRefNo;
        String str2 = this.keyword;
        return "SearchPackageGroupBrandedPre2PostByRefRequest(packageGroupRefNo=" + str + ", keyword=" + str2 + ")";
    }

    public SearchPackageGroupBrandedPre2PostByRefRequest(@NotNull String packageGroupRefNo, @NotNull String keyword) {
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.packageGroupRefNo = packageGroupRefNo;
        this.keyword = keyword;
    }

    public /* synthetic */ SearchPackageGroupBrandedPre2PostByRefRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}