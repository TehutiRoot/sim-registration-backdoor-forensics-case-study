package th.p047co.dtac.android.dtacone.model.change_sim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000eH\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimReason;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "reasonChangeSim", "", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimReasonCollection;", "(Ljava/util/List;)V", "getReasonChangeSim", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimReason */
/* loaded from: classes8.dex */
public final class ChangeSimReason implements Parcelable {
    @Nullable
    private final List<ChangeSimReasonCollection> reasonChangeSim;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<ChangeSimReason> CREATOR = new Parcelable.Creator<ChangeSimReason>() { // from class: th.co.dtac.android.dtacone.model.change_sim.ChangeSimReason$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimReason createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ChangeSimReason(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimReason[] newArray(int i) {
            return new ChangeSimReason[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimReason$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimReason;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimReason$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ChangeSimReason(@Nullable List<ChangeSimReasonCollection> list) {
        this.reasonChangeSim = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSimReason copy$default(ChangeSimReason changeSimReason, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = changeSimReason.reasonChangeSim;
        }
        return changeSimReason.copy(list);
    }

    @Nullable
    public final List<ChangeSimReasonCollection> component1() {
        return this.reasonChangeSim;
    }

    @NotNull
    public final ChangeSimReason copy(@Nullable List<ChangeSimReasonCollection> list) {
        return new ChangeSimReason(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeSimReason) && Intrinsics.areEqual(this.reasonChangeSim, ((ChangeSimReason) obj).reasonChangeSim);
    }

    @Nullable
    public final List<ChangeSimReasonCollection> getReasonChangeSim() {
        return this.reasonChangeSim;
    }

    public int hashCode() {
        List<ChangeSimReasonCollection> list = this.reasonChangeSim;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        List<ChangeSimReasonCollection> list = this.reasonChangeSim;
        return "ChangeSimReason(reasonChangeSim=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeTypedList(this.reasonChangeSim);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeSimReason(@NotNull Parcel source) {
        this(source.createTypedArrayList(ChangeSimReasonCollection.CREATOR));
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
