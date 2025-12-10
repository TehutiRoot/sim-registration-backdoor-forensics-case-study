package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28850d2 = {"Lco/omise/android/models/InstallmentAmount;", "Landroid/os/Parcelable;", "min", "", "(Ljava/lang/Long;)V", "getMin", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lco/omise/android/models/InstallmentAmount;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class InstallmentAmount implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<InstallmentAmount> CREATOR = new Creator();
    @JsonProperty("min")
    @Nullable
    private final Long min;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<InstallmentAmount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InstallmentAmount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstallmentAmount(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InstallmentAmount[] newArray(int i) {
            return new InstallmentAmount[i];
        }
    }

    public InstallmentAmount() {
        this(null, 1, null);
    }

    public static /* synthetic */ InstallmentAmount copy$default(InstallmentAmount installmentAmount, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = installmentAmount.min;
        }
        return installmentAmount.copy(l);
    }

    @Nullable
    public final Long component1() {
        return this.min;
    }

    @NotNull
    public final InstallmentAmount copy(@Nullable Long l) {
        return new InstallmentAmount(l);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstallmentAmount) && Intrinsics.areEqual(this.min, ((InstallmentAmount) obj).min);
    }

    @Nullable
    public final Long getMin() {
        return this.min;
    }

    public int hashCode() {
        Long l = this.min;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @NotNull
    public String toString() {
        return "InstallmentAmount(min=" + this.min + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Long l = this.min;
        if (l == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeLong(l.longValue());
    }

    public InstallmentAmount(@Nullable Long l) {
        this.min = l;
    }

    public /* synthetic */ InstallmentAmount(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }
}
