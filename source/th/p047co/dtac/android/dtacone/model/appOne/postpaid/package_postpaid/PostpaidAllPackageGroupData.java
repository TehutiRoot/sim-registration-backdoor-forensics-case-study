package th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/PostpaidAllPackageGroupData;", "", "packageGroupRefNo", "", "(Ljava/lang/String;)V", "getPackageGroupRefNo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.PostpaidAllPackageGroupData */
/* loaded from: classes8.dex */
public final class PostpaidAllPackageGroupData {
    public static final int $stable = 0;
    @SerializedName("packageGroupRefNo")
    @Nullable
    private final String packageGroupRefNo;

    public PostpaidAllPackageGroupData() {
        this(null, 1, null);
    }

    public static /* synthetic */ PostpaidAllPackageGroupData copy$default(PostpaidAllPackageGroupData postpaidAllPackageGroupData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postpaidAllPackageGroupData.packageGroupRefNo;
        }
        return postpaidAllPackageGroupData.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.packageGroupRefNo;
    }

    @NotNull
    public final PostpaidAllPackageGroupData copy(@Nullable String str) {
        return new PostpaidAllPackageGroupData(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostpaidAllPackageGroupData) && Intrinsics.areEqual(this.packageGroupRefNo, ((PostpaidAllPackageGroupData) obj).packageGroupRefNo);
    }

    @Nullable
    public final String getPackageGroupRefNo() {
        return this.packageGroupRefNo;
    }

    public int hashCode() {
        String str = this.packageGroupRefNo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupRefNo;
        return "PostpaidAllPackageGroupData(packageGroupRefNo=" + str + ")";
    }

    public PostpaidAllPackageGroupData(@Nullable String str) {
        this.packageGroupRefNo = str;
    }

    public /* synthetic */ PostpaidAllPackageGroupData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
