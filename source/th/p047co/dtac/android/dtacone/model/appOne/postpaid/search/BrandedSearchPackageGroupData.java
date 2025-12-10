package th.p047co.dtac.android.dtacone.model.appOne.postpaid.search;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePackageGroups;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/search/BrandedSearchPackageGroupData;", "", "total", "", "warningMessage", "", "listPackageGroups", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePackageGroups;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getListPackageGroups", "()Ljava/util/List;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWarningMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/search/BrandedSearchPackageGroupData;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.search.BrandedSearchPackageGroupData */
/* loaded from: classes8.dex */
public final class BrandedSearchPackageGroupData {
    public static final int $stable = 8;
    @SerializedName("listPackageGroups")
    @Nullable
    private final List<OnePackageGroups> listPackageGroups;
    @SerializedName("total")
    @Nullable
    private final Integer total;
    @SerializedName("warningMessage")
    @Nullable
    private final String warningMessage;

    public BrandedSearchPackageGroupData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrandedSearchPackageGroupData copy$default(BrandedSearchPackageGroupData brandedSearchPackageGroupData, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = brandedSearchPackageGroupData.total;
        }
        if ((i & 2) != 0) {
            str = brandedSearchPackageGroupData.warningMessage;
        }
        if ((i & 4) != 0) {
            list = brandedSearchPackageGroupData.listPackageGroups;
        }
        return brandedSearchPackageGroupData.copy(num, str, list);
    }

    @Nullable
    public final Integer component1() {
        return this.total;
    }

    @Nullable
    public final String component2() {
        return this.warningMessage;
    }

    @Nullable
    public final List<OnePackageGroups> component3() {
        return this.listPackageGroups;
    }

    @NotNull
    public final BrandedSearchPackageGroupData copy(@Nullable Integer num, @Nullable String str, @Nullable List<OnePackageGroups> list) {
        return new BrandedSearchPackageGroupData(num, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrandedSearchPackageGroupData) {
            BrandedSearchPackageGroupData brandedSearchPackageGroupData = (BrandedSearchPackageGroupData) obj;
            return Intrinsics.areEqual(this.total, brandedSearchPackageGroupData.total) && Intrinsics.areEqual(this.warningMessage, brandedSearchPackageGroupData.warningMessage) && Intrinsics.areEqual(this.listPackageGroups, brandedSearchPackageGroupData.listPackageGroups);
        }
        return false;
    }

    @Nullable
    public final List<OnePackageGroups> getListPackageGroups() {
        return this.listPackageGroups;
    }

    @Nullable
    public final Integer getTotal() {
        return this.total;
    }

    @Nullable
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        Integer num = this.total;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.warningMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<OnePackageGroups> list = this.listPackageGroups;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.total;
        String str = this.warningMessage;
        List<OnePackageGroups> list = this.listPackageGroups;
        return "BrandedSearchPackageGroupData(total=" + num + ", warningMessage=" + str + ", listPackageGroups=" + list + ")";
    }

    public BrandedSearchPackageGroupData(@Nullable Integer num, @Nullable String str, @Nullable List<OnePackageGroups> list) {
        this.total = num;
        this.warningMessage = str;
        this.listPackageGroups = list;
    }

    public /* synthetic */ BrandedSearchPackageGroupData(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
