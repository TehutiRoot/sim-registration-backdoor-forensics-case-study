package th.p047co.dtac.android.dtacone.app_one.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
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
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneGroupListCollection;", "Landroid/os/Parcelable;", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupCollection;", "groups", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getGroups", "()Ljava/util/List;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneGroupListCollection */
/* loaded from: classes7.dex */
public final class OneGroupListCollection implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OneGroupListCollection> CREATOR = new Creator();
    @SerializedName("groups")
    @Nullable

    /* renamed from: a */
    private final List<OneStvGroupCollection> f82125a;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneGroupListCollection$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OneGroupListCollection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneGroupListCollection createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(OneStvGroupCollection.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OneGroupListCollection(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneGroupListCollection[] newArray(int i) {
            return new OneGroupListCollection[i];
        }
    }

    public OneGroupListCollection() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<OneStvGroupCollection> getGroups() {
        return this.f82125a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<OneStvGroupCollection> list = this.f82125a;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (OneStvGroupCollection oneStvGroupCollection : list) {
            oneStvGroupCollection.writeToParcel(out, i);
        }
    }

    public OneGroupListCollection(@Nullable List<OneStvGroupCollection> list) {
        this.f82125a = list;
    }

    public /* synthetic */ OneGroupListCollection(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
