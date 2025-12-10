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
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/stv/StvGroupListCollection;", "Landroid/os/Parcelable;", "groups", "", "Lth/co/dtac/android/dtacone/model/stv/StvGroupCollection;", "(Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.stv.StvGroupListCollection */
/* loaded from: classes8.dex */
public final class StvGroupListCollection implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<StvGroupListCollection> CREATOR = new Creator();
    @SerializedName("groups")
    @Nullable
    private final List<StvGroupCollection> groups;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.stv.StvGroupListCollection$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<StvGroupListCollection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StvGroupListCollection createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(StvGroupCollection.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new StvGroupListCollection(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StvGroupListCollection[] newArray(int i) {
            return new StvGroupListCollection[i];
        }
    }

    public StvGroupListCollection() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<StvGroupCollection> getGroups() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<StvGroupCollection> list = this.groups;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (StvGroupCollection stvGroupCollection : list) {
            stvGroupCollection.writeToParcel(out, i);
        }
    }

    public StvGroupListCollection(@Nullable List<StvGroupCollection> list) {
        this.groups = list;
    }

    public /* synthetic */ StvGroupListCollection(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}