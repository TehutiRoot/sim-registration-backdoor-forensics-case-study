package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/SearchPackageGroupRetailerPre2PostByRefRequest;", "", "keyword", "", "minPriceValue", "", "packageGroupCode", "simType", "transactionType", "withDevice", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKeyword", "()Ljava/lang/String;", "getMinPriceValue", "()I", "getPackageGroupCode", "getSimType", "getTransactionType", "getWithDevice", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.SearchPackageGroupRetailerPre2PostByRefRequest */
/* loaded from: classes8.dex */
public final class SearchPackageGroupRetailerPre2PostByRefRequest {
    public static final int $stable = 0;
    @SerializedName("keyword")
    @NotNull
    private final String keyword;
    @SerializedName("minPriceValue")
    private final int minPriceValue;
    @SerializedName("packageGroupCode")
    @NotNull
    private final String packageGroupCode;
    @SerializedName("simType")
    @NotNull
    private final String simType;
    @SerializedName("transactionType")
    @NotNull
    private final String transactionType;
    @SerializedName("withDevice")
    private final boolean withDevice;

    public SearchPackageGroupRetailerPre2PostByRefRequest(@NotNull String keyword, int i, @NotNull String packageGroupCode, @NotNull String simType, @NotNull String transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.keyword = keyword;
        this.minPriceValue = i;
        this.packageGroupCode = packageGroupCode;
        this.simType = simType;
        this.transactionType = transactionType;
        this.withDevice = z;
    }

    public static /* synthetic */ SearchPackageGroupRetailerPre2PostByRefRequest copy$default(SearchPackageGroupRetailerPre2PostByRefRequest searchPackageGroupRetailerPre2PostByRefRequest, String str, int i, String str2, String str3, String str4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchPackageGroupRetailerPre2PostByRefRequest.keyword;
        }
        if ((i2 & 2) != 0) {
            i = searchPackageGroupRetailerPre2PostByRefRequest.minPriceValue;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = searchPackageGroupRetailerPre2PostByRefRequest.packageGroupCode;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = searchPackageGroupRetailerPre2PostByRefRequest.simType;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = searchPackageGroupRetailerPre2PostByRefRequest.transactionType;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            z = searchPackageGroupRetailerPre2PostByRefRequest.withDevice;
        }
        return searchPackageGroupRetailerPre2PostByRefRequest.copy(str, i3, str5, str6, str7, z);
    }

    @NotNull
    public final String component1() {
        return this.keyword;
    }

    public final int component2() {
        return this.minPriceValue;
    }

    @NotNull
    public final String component3() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component4() {
        return this.simType;
    }

    @NotNull
    public final String component5() {
        return this.transactionType;
    }

    public final boolean component6() {
        return this.withDevice;
    }

    @NotNull
    public final SearchPackageGroupRetailerPre2PostByRefRequest copy(@NotNull String keyword, int i, @NotNull String packageGroupCode, @NotNull String simType, @NotNull String transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        return new SearchPackageGroupRetailerPre2PostByRefRequest(keyword, i, packageGroupCode, simType, transactionType, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchPackageGroupRetailerPre2PostByRefRequest) {
            SearchPackageGroupRetailerPre2PostByRefRequest searchPackageGroupRetailerPre2PostByRefRequest = (SearchPackageGroupRetailerPre2PostByRefRequest) obj;
            return Intrinsics.areEqual(this.keyword, searchPackageGroupRetailerPre2PostByRefRequest.keyword) && this.minPriceValue == searchPackageGroupRetailerPre2PostByRefRequest.minPriceValue && Intrinsics.areEqual(this.packageGroupCode, searchPackageGroupRetailerPre2PostByRefRequest.packageGroupCode) && Intrinsics.areEqual(this.simType, searchPackageGroupRetailerPre2PostByRefRequest.simType) && Intrinsics.areEqual(this.transactionType, searchPackageGroupRetailerPre2PostByRefRequest.transactionType) && this.withDevice == searchPackageGroupRetailerPre2PostByRefRequest.withDevice;
        }
        return false;
    }

    @NotNull
    public final String getKeyword() {
        return this.keyword;
    }

    public final int getMinPriceValue() {
        return this.minPriceValue;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getSimType() {
        return this.simType;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final boolean getWithDevice() {
        return this.withDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.keyword.hashCode() * 31) + this.minPriceValue) * 31) + this.packageGroupCode.hashCode()) * 31) + this.simType.hashCode()) * 31) + this.transactionType.hashCode()) * 31;
        boolean z = this.withDevice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        String str = this.keyword;
        int i = this.minPriceValue;
        String str2 = this.packageGroupCode;
        String str3 = this.simType;
        String str4 = this.transactionType;
        boolean z = this.withDevice;
        return "SearchPackageGroupRetailerPre2PostByRefRequest(keyword=" + str + ", minPriceValue=" + i + ", packageGroupCode=" + str2 + ", simType=" + str3 + ", transactionType=" + str4 + ", withDevice=" + z + ")";
    }
}