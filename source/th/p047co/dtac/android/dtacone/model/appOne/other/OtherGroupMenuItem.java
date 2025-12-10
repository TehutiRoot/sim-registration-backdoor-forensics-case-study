package th.p047co.dtac.android.dtacone.model.appOne.other;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0019H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/other/OtherGroupMenuItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "section", "", "otherMenuList", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/other/OneOtherMenuCollection;", "isShowGroupTitle", "", "(Ljava/lang/String;Ljava/util/ArrayList;Z)V", "()Z", "getOtherMenuList", "()Ljava/util/ArrayList;", "setOtherMenuList", "(Ljava/util/ArrayList;)V", "getSection", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.other.OtherGroupMenuItem */
/* loaded from: classes8.dex */
public final class OtherGroupMenuItem implements Parcelable {
    private final boolean isShowGroupTitle;
    @Nullable
    private ArrayList<OneOtherMenuCollection> otherMenuList;
    @Nullable
    private final String section;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/other/OtherGroupMenuItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/other/OtherGroupMenuItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/other/OtherGroupMenuItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.other.OtherGroupMenuItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OtherGroupMenuItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OtherGroupMenuItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtherGroupMenuItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OtherGroupMenuItem[] newArray(int i) {
            return new OtherGroupMenuItem[i];
        }
    }

    public OtherGroupMenuItem() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtherGroupMenuItem copy$default(OtherGroupMenuItem otherGroupMenuItem, String str, ArrayList arrayList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otherGroupMenuItem.section;
        }
        if ((i & 2) != 0) {
            arrayList = otherGroupMenuItem.otherMenuList;
        }
        if ((i & 4) != 0) {
            z = otherGroupMenuItem.isShowGroupTitle;
        }
        return otherGroupMenuItem.copy(str, arrayList, z);
    }

    @Nullable
    public final String component1() {
        return this.section;
    }

    @Nullable
    public final ArrayList<OneOtherMenuCollection> component2() {
        return this.otherMenuList;
    }

    public final boolean component3() {
        return this.isShowGroupTitle;
    }

    @NotNull
    public final OtherGroupMenuItem copy(@Nullable String str, @Nullable ArrayList<OneOtherMenuCollection> arrayList, boolean z) {
        return new OtherGroupMenuItem(str, arrayList, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OtherGroupMenuItem) {
            OtherGroupMenuItem otherGroupMenuItem = (OtherGroupMenuItem) obj;
            return Intrinsics.areEqual(this.section, otherGroupMenuItem.section) && Intrinsics.areEqual(this.otherMenuList, otherGroupMenuItem.otherMenuList) && this.isShowGroupTitle == otherGroupMenuItem.isShowGroupTitle;
        }
        return false;
    }

    @Nullable
    public final ArrayList<OneOtherMenuCollection> getOtherMenuList() {
        return this.otherMenuList;
    }

    @Nullable
    public final String getSection() {
        return this.section;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.section;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<OneOtherMenuCollection> arrayList = this.otherMenuList;
        int hashCode2 = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        boolean z = this.isShowGroupTitle;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final boolean isShowGroupTitle() {
        return this.isShowGroupTitle;
    }

    public final void setOtherMenuList(@Nullable ArrayList<OneOtherMenuCollection> arrayList) {
        this.otherMenuList = arrayList;
    }

    @NotNull
    public String toString() {
        String str = this.section;
        ArrayList<OneOtherMenuCollection> arrayList = this.otherMenuList;
        boolean z = this.isShowGroupTitle;
        return "OtherGroupMenuItem(section=" + str + ", otherMenuList=" + arrayList + ", isShowGroupTitle=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.section);
        parcel.writeTypedList(this.otherMenuList);
        parcel.writeByte(this.isShowGroupTitle ? (byte) 1 : (byte) 0);
    }

    public OtherGroupMenuItem(@Nullable String str, @Nullable ArrayList<OneOtherMenuCollection> arrayList, boolean z) {
        this.section = str;
        this.otherMenuList = arrayList;
        this.isShowGroupTitle = z;
    }

    public /* synthetic */ OtherGroupMenuItem(String str, ArrayList arrayList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? true : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OtherGroupMenuItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.createTypedArrayList(OneOtherMenuCollection.CREATOR), parcel.readByte() != 0);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
