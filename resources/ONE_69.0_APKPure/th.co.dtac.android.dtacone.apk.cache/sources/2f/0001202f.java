package th.p047co.dtac.android.dtacone.model.profile;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/profile/GroupItem;", "", "allow", "", "featureCode", "featureName", "menuOrder", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAllow", "()Ljava/lang/String;", "getFeatureCode", "getFeatureName", "getMenuOrder", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.profile.GroupItem */
/* loaded from: classes8.dex */
public final class GroupItem {
    public static final int $stable = 0;
    @SerializedName("allow")
    @NotNull
    private final String allow;
    @SerializedName("featureCode")
    @NotNull
    private final String featureCode;
    @SerializedName("featureName")
    @NotNull
    private final String featureName;
    @SerializedName("menuOrder")
    private final int menuOrder;

    public GroupItem(@NotNull String allow, @NotNull String featureCode, @NotNull String featureName, int i) {
        Intrinsics.checkNotNullParameter(allow, "allow");
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        this.allow = allow;
        this.featureCode = featureCode;
        this.featureName = featureName;
        this.menuOrder = i;
    }

    public static /* synthetic */ GroupItem copy$default(GroupItem groupItem, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = groupItem.allow;
        }
        if ((i2 & 2) != 0) {
            str2 = groupItem.featureCode;
        }
        if ((i2 & 4) != 0) {
            str3 = groupItem.featureName;
        }
        if ((i2 & 8) != 0) {
            i = groupItem.menuOrder;
        }
        return groupItem.copy(str, str2, str3, i);
    }

    @NotNull
    public final String component1() {
        return this.allow;
    }

    @NotNull
    public final String component2() {
        return this.featureCode;
    }

    @NotNull
    public final String component3() {
        return this.featureName;
    }

    public final int component4() {
        return this.menuOrder;
    }

    @NotNull
    public final GroupItem copy(@NotNull String allow, @NotNull String featureCode, @NotNull String featureName, int i) {
        Intrinsics.checkNotNullParameter(allow, "allow");
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        return new GroupItem(allow, featureCode, featureName, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupItem) {
            GroupItem groupItem = (GroupItem) obj;
            return Intrinsics.areEqual(this.allow, groupItem.allow) && Intrinsics.areEqual(this.featureCode, groupItem.featureCode) && Intrinsics.areEqual(this.featureName, groupItem.featureName) && this.menuOrder == groupItem.menuOrder;
        }
        return false;
    }

    @NotNull
    public final String getAllow() {
        return this.allow;
    }

    @NotNull
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }

    public final int getMenuOrder() {
        return this.menuOrder;
    }

    public int hashCode() {
        return (((((this.allow.hashCode() * 31) + this.featureCode.hashCode()) * 31) + this.featureName.hashCode()) * 31) + this.menuOrder;
    }

    @NotNull
    public String toString() {
        String str = this.allow;
        String str2 = this.featureCode;
        String str3 = this.featureName;
        int i = this.menuOrder;
        return "GroupItem(allow=" + str + ", featureCode=" + str2 + ", featureName=" + str3 + ", menuOrder=" + i + ")";
    }
}