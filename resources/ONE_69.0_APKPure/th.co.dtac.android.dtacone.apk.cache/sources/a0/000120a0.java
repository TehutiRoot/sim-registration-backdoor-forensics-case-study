package th.p047co.dtac.android.dtacone.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
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
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/stv/StvGroupCollection;", "Landroid/os/Parcelable;", "packageType", "", "name", "type", "descriptions", "", "packages", "", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/List;)V", "getDescriptions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getPackageType", "getPackages", "()Ljava/util/List;", "getType", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.stv.StvGroupCollection */
/* loaded from: classes8.dex */
public final class StvGroupCollection implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<StvGroupCollection> CREATOR = new Creator();
    @SerializedName("descriptions")
    @NotNull
    private final String[] descriptions;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("packageType")
    @NotNull
    private final String packageType;
    @SerializedName("packages")
    @Nullable
    private final List<StvPackageCollection> packages;
    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.stv.StvGroupCollection$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<StvGroupCollection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StvGroupCollection createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(StvPackageCollection.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new StvGroupCollection(readString, readString2, readString3, createStringArray, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StvGroupCollection[] newArray(int i) {
            return new StvGroupCollection[i];
        }
    }

    public StvGroupCollection() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String[] getDescriptions() {
        return this.descriptions;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPackageType() {
        return this.packageType;
    }

    @Nullable
    public final List<StvPackageCollection> getPackages() {
        return this.packages;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.packageType);
        out.writeString(this.name);
        out.writeString(this.type);
        out.writeStringArray(this.descriptions);
        List<StvPackageCollection> list = this.packages;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (StvPackageCollection stvPackageCollection : list) {
            stvPackageCollection.writeToParcel(out, i);
        }
    }

    public StvGroupCollection(@NotNull String packageType, @NotNull String name, @NotNull String type, @NotNull String[] descriptions, @Nullable List<StvPackageCollection> list) {
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        this.packageType = packageType;
        this.name = name;
        this.type = type;
        this.descriptions = descriptions;
        this.packages = list;
    }

    public /* synthetic */ StvGroupCollection(String str, String str2, String str3, String[] strArr, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? new String[0] : strArr, (i & 16) != 0 ? null : list);
    }
}