package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Group;", "", "groupName", "", "packages", "", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Default;", "(Ljava/lang/String;Ljava/util/List;)V", "getGroupName", "()Ljava/lang/String;", "getPackages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.Group */
/* loaded from: classes8.dex */
public final class Group {
    public static final int $stable = 8;
    @Nullable
    private final String groupName;
    @Nullable
    private final List<Default> packages;

    public Group() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Group copy$default(Group group, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = group.groupName;
        }
        if ((i & 2) != 0) {
            list = group.packages;
        }
        return group.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.groupName;
    }

    @Nullable
    public final List<Default> component2() {
        return this.packages;
    }

    @NotNull
    public final Group copy(@Nullable String str, @Nullable List<Default> list) {
        return new Group(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Group) {
            Group group = (Group) obj;
            return Intrinsics.areEqual(this.groupName, group.groupName) && Intrinsics.areEqual(this.packages, group.packages);
        }
        return false;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    public final List<Default> getPackages() {
        return this.packages;
    }

    public int hashCode() {
        String str = this.groupName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Default> list = this.packages;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.groupName;
        List<Default> list = this.packages;
        return "Group(groupName=" + str + ", packages=" + list + ")";
    }

    public Group(@Nullable String str, @Nullable List<Default> list) {
        this.groupName = str;
        this.packages = list;
    }

    public /* synthetic */ Group(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}