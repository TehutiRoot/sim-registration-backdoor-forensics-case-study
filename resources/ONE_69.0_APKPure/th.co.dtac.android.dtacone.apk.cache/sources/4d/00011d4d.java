package th.p047co.dtac.android.dtacone.model.change_pro_happy.packageList.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pro_happy/packageList/response/Data;", "", "jsonMemberDefault", "Lth/co/dtac/android/dtacone/model/change_pro_happy/packageList/response/JsonMemberDefault;", "packages", "", "Lth/co/dtac/android/dtacone/model/change_pro_happy/packageList/response/PackagesItem;", "(Lth/co/dtac/android/dtacone/model/change_pro_happy/packageList/response/JsonMemberDefault;Ljava/util/List;)V", "getJsonMemberDefault", "()Lth/co/dtac/android/dtacone/model/change_pro_happy/packageList/response/JsonMemberDefault;", "getPackages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pro_happy.packageList.response.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 8;
    @SerializedName("default")
    @Nullable
    private final JsonMemberDefault jsonMemberDefault;
    @SerializedName("packages")
    @Nullable
    private final List<PackagesItem> packages;

    public Data() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, JsonMemberDefault jsonMemberDefault, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonMemberDefault = data.jsonMemberDefault;
        }
        if ((i & 2) != 0) {
            list = data.packages;
        }
        return data.copy(jsonMemberDefault, list);
    }

    @Nullable
    public final JsonMemberDefault component1() {
        return this.jsonMemberDefault;
    }

    @Nullable
    public final List<PackagesItem> component2() {
        return this.packages;
    }

    @NotNull
    public final Data copy(@Nullable JsonMemberDefault jsonMemberDefault, @Nullable List<PackagesItem> list) {
        return new Data(jsonMemberDefault, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.jsonMemberDefault, data.jsonMemberDefault) && Intrinsics.areEqual(this.packages, data.packages);
        }
        return false;
    }

    @Nullable
    public final JsonMemberDefault getJsonMemberDefault() {
        return this.jsonMemberDefault;
    }

    @Nullable
    public final List<PackagesItem> getPackages() {
        return this.packages;
    }

    public int hashCode() {
        JsonMemberDefault jsonMemberDefault = this.jsonMemberDefault;
        int hashCode = (jsonMemberDefault == null ? 0 : jsonMemberDefault.hashCode()) * 31;
        List<PackagesItem> list = this.packages;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        JsonMemberDefault jsonMemberDefault = this.jsonMemberDefault;
        List<PackagesItem> list = this.packages;
        return "Data(jsonMemberDefault=" + jsonMemberDefault + ", packages=" + list + ")";
    }

    public Data(@Nullable JsonMemberDefault jsonMemberDefault, @Nullable List<PackagesItem> list) {
        this.jsonMemberDefault = jsonMemberDefault;
        this.packages = list;
    }

    public /* synthetic */ Data(JsonMemberDefault jsonMemberDefault, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jsonMemberDefault, (i & 2) != 0 ? null : list);
    }
}