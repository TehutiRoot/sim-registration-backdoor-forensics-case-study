package th.p047co.dtac.android.dtacone.model.home.groupService.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupItemItem;", "", "allow", "", "menuOrder", "", "featureCode", "featureName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAllow", "()Ljava/lang/String;", "getFeatureCode", "getFeatureName", "getMenuOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupItemItem;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.home.groupService.response.GroupItemItem */
/* loaded from: classes8.dex */
public final class GroupItemItem {
    public static final int $stable = 0;
    @SerializedName("allow")
    @Nullable
    private final String allow;
    @SerializedName("featureCode")
    @Nullable
    private final String featureCode;
    @SerializedName("featureName")
    @Nullable
    private final String featureName;
    @SerializedName("menuOrder")
    @Nullable
    private final Integer menuOrder;

    public GroupItemItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GroupItemItem copy$default(GroupItemItem groupItemItem, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupItemItem.allow;
        }
        if ((i & 2) != 0) {
            num = groupItemItem.menuOrder;
        }
        if ((i & 4) != 0) {
            str2 = groupItemItem.featureCode;
        }
        if ((i & 8) != 0) {
            str3 = groupItemItem.featureName;
        }
        return groupItemItem.copy(str, num, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.allow;
    }

    @Nullable
    public final Integer component2() {
        return this.menuOrder;
    }

    @Nullable
    public final String component3() {
        return this.featureCode;
    }

    @Nullable
    public final String component4() {
        return this.featureName;
    }

    @NotNull
    public final GroupItemItem copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3) {
        return new GroupItemItem(str, num, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupItemItem) {
            GroupItemItem groupItemItem = (GroupItemItem) obj;
            return Intrinsics.areEqual(this.allow, groupItemItem.allow) && Intrinsics.areEqual(this.menuOrder, groupItemItem.menuOrder) && Intrinsics.areEqual(this.featureCode, groupItemItem.featureCode) && Intrinsics.areEqual(this.featureName, groupItemItem.featureName);
        }
        return false;
    }

    @Nullable
    public final String getAllow() {
        return this.allow;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final String getFeatureName() {
        return this.featureName;
    }

    @Nullable
    public final Integer getMenuOrder() {
        return this.menuOrder;
    }

    public int hashCode() {
        String str = this.allow;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.menuOrder;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.featureCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.featureName;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.allow;
        Integer num = this.menuOrder;
        String str2 = this.featureCode;
        String str3 = this.featureName;
        return "GroupItemItem(allow=" + str + ", menuOrder=" + num + ", featureCode=" + str2 + ", featureName=" + str3 + ")";
    }

    public GroupItemItem(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3) {
        this.allow = str;
        this.menuOrder = num;
        this.featureCode = str2;
        this.featureName = str3;
    }

    public /* synthetic */ GroupItemItem(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}