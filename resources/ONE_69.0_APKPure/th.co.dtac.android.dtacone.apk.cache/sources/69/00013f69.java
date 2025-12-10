package th.p047co.dtac.android.dtacone.view.appOne.staff.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011Jz\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010+R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u0010\u0013R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010-\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010@¨\u0006A"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/model/StaffsItem;", "Landroid/os/Parcelable;", "", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/PermissionsItem;", "permissions", "", "displayDate", "name", "", "id", "soldAmount", "credit", "userId", "listPermission", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/staff/model/StaffsItem;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getPermissions", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getDisplayDate", OperatorName.CURVE_TO, "getName", "d", "Ljava/lang/Integer;", "getId", "e", "getSoldAmount", OperatorName.FILL_NON_ZERO, "getCredit", OperatorName.NON_STROKING_GRAY, "getUserId", OperatorName.CLOSE_PATH, "getListPermission", "setListPermission", "(Ljava/util/List;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.model.StaffsItem */
/* loaded from: classes10.dex */
public final class StaffsItem implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<StaffsItem> CREATOR = new Creator();
    @SerializedName("permissions")
    @Nullable

    /* renamed from: a */
    private final List<PermissionsItem> f97382a;
    @SerializedName("displayDate")
    @Nullable

    /* renamed from: b */
    private final String f97383b;
    @SerializedName("name")
    @Nullable

    /* renamed from: c */
    private final String f97384c;
    @SerializedName("id")
    @Nullable

    /* renamed from: d */
    private final Integer f97385d;
    @SerializedName("soldAmount")
    @Nullable

    /* renamed from: e */
    private final Integer f97386e;
    @SerializedName("credit")
    @Nullable

    /* renamed from: f */
    private final Integer f97387f;
    @SerializedName("userId")
    @Nullable

    /* renamed from: g */
    private final String f97388g;

    /* renamed from: h */
    public transient List f97389h;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.model.StaffsItem$Creator */
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<StaffsItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StaffsItem createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(PermissionsItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new StaffsItem(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StaffsItem[] newArray(int i) {
            return new StaffsItem[i];
        }
    }

    public StaffsItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final List<PermissionsItem> component1() {
        return this.f97382a;
    }

    @Nullable
    public final String component2() {
        return this.f97383b;
    }

    @Nullable
    public final String component3() {
        return this.f97384c;
    }

    @Nullable
    public final Integer component4() {
        return this.f97385d;
    }

    @Nullable
    public final Integer component5() {
        return this.f97386e;
    }

    @Nullable
    public final Integer component6() {
        return this.f97387f;
    }

    @Nullable
    public final String component7() {
        return this.f97388g;
    }

    @NotNull
    public final List<String> component8() {
        return this.f97389h;
    }

    @NotNull
    public final StaffsItem copy(@Nullable List<PermissionsItem> list, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3, @NotNull List<String> listPermission) {
        Intrinsics.checkNotNullParameter(listPermission, "listPermission");
        return new StaffsItem(list, str, str2, num, num2, num3, str3, listPermission);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StaffsItem) {
            StaffsItem staffsItem = (StaffsItem) obj;
            return Intrinsics.areEqual(this.f97382a, staffsItem.f97382a) && Intrinsics.areEqual(this.f97383b, staffsItem.f97383b) && Intrinsics.areEqual(this.f97384c, staffsItem.f97384c) && Intrinsics.areEqual(this.f97385d, staffsItem.f97385d) && Intrinsics.areEqual(this.f97386e, staffsItem.f97386e) && Intrinsics.areEqual(this.f97387f, staffsItem.f97387f) && Intrinsics.areEqual(this.f97388g, staffsItem.f97388g) && Intrinsics.areEqual(this.f97389h, staffsItem.f97389h);
        }
        return false;
    }

    @Nullable
    public final Integer getCredit() {
        return this.f97387f;
    }

    @Nullable
    public final String getDisplayDate() {
        return this.f97383b;
    }

    @Nullable
    public final Integer getId() {
        return this.f97385d;
    }

    @NotNull
    public final List<String> getListPermission() {
        return this.f97389h;
    }

    @Nullable
    public final String getName() {
        return this.f97384c;
    }

    @Nullable
    public final List<PermissionsItem> getPermissions() {
        return this.f97382a;
    }

    @Nullable
    public final Integer getSoldAmount() {
        return this.f97386e;
    }

    @Nullable
    public final String getUserId() {
        return this.f97388g;
    }

    public int hashCode() {
        List<PermissionsItem> list = this.f97382a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f97383b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97384c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f97385d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f97386e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f97387f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f97388g;
        return ((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f97389h.hashCode();
    }

    public final void setListPermission(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97389h = list;
    }

    @NotNull
    public String toString() {
        List<PermissionsItem> list = this.f97382a;
        String str = this.f97383b;
        String str2 = this.f97384c;
        Integer num = this.f97385d;
        Integer num2 = this.f97386e;
        Integer num3 = this.f97387f;
        String str3 = this.f97388g;
        List list2 = this.f97389h;
        return "StaffsItem(permissions=" + list + ", displayDate=" + str + ", name=" + str2 + ", id=" + num + ", soldAmount=" + num2 + ", credit=" + num3 + ", userId=" + str3 + ", listPermission=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<PermissionsItem> list = this.f97382a;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (PermissionsItem permissionsItem : list) {
                permissionsItem.writeToParcel(out, i);
            }
        }
        out.writeString(this.f97383b);
        out.writeString(this.f97384c);
        Integer num = this.f97385d;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f97386e;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f97387f;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        out.writeString(this.f97388g);
        out.writeStringList(this.f97389h);
    }

    public StaffsItem(@Nullable List<PermissionsItem> list, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3, @NotNull List<String> listPermission) {
        Intrinsics.checkNotNullParameter(listPermission, "listPermission");
        this.f97382a = list;
        this.f97383b = str;
        this.f97384c = str2;
        this.f97385d = num;
        this.f97386e = num2;
        this.f97387f = num3;
        this.f97388g = str3;
        this.f97389h = listPermission;
    }

    public /* synthetic */ StaffsItem(List list, String str, String str2, Integer num, Integer num2, Integer num3, String str3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) == 0 ? str3 : null, (i & 128) != 0 ? new ArrayList() : list2);
    }
}