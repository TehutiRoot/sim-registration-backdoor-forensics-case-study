package th.p047co.dtac.android.dtacone.model.newsfeed.list.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/newsfeed/list/response/Group;", "", "groupName", "", "groupId", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGroupName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/newsfeed/list/response/Group;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.newsfeed.list.response.Group */
/* loaded from: classes8.dex */
public final class Group {
    public static final int $stable = 0;
    @SerializedName("groupId")
    @Nullable
    private final Integer groupId;
    @SerializedName("groupName")
    @Nullable
    private final String groupName;

    public Group() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Group copy$default(Group group, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = group.groupName;
        }
        if ((i & 2) != 0) {
            num = group.groupId;
        }
        return group.copy(str, num);
    }

    @Nullable
    public final String component1() {
        return this.groupName;
    }

    @Nullable
    public final Integer component2() {
        return this.groupId;
    }

    @NotNull
    public final Group copy(@Nullable String str, @Nullable Integer num) {
        return new Group(str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Group) {
            Group group = (Group) obj;
            return Intrinsics.areEqual(this.groupName, group.groupName) && Intrinsics.areEqual(this.groupId, group.groupId);
        }
        return false;
    }

    @Nullable
    public final Integer getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    public int hashCode() {
        String str = this.groupName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.groupId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.groupName;
        Integer num = this.groupId;
        return "Group(groupName=" + str + ", groupId=" + num + ")";
    }

    public Group(@Nullable String str, @Nullable Integer num) {
        this.groupName = str;
        this.groupId = num;
    }

    public /* synthetic */ Group(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}