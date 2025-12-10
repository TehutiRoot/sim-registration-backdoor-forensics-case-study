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
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28850d2 = {"Lco/omise/android/models/Limits;", "Landroid/os/Parcelable;", "installmentAmount", "Lco/omise/android/models/InstallmentAmount;", "(Lco/omise/android/models/InstallmentAmount;)V", "getInstallmentAmount", "()Lco/omise/android/models/InstallmentAmount;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Limits implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<Limits> CREATOR = new Creator();
    @JsonProperty("installment_amount")
    @Nullable
    private final InstallmentAmount installmentAmount;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Limits> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Limits createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Limits(parcel.readInt() == 0 ? null : InstallmentAmount.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Limits[] newArray(int i) {
            return new Limits[i];
        }
    }

    public Limits() {
        this(null, 1, null);
    }

    public static /* synthetic */ Limits copy$default(Limits limits, InstallmentAmount installmentAmount, int i, Object obj) {
        if ((i & 1) != 0) {
            installmentAmount = limits.installmentAmount;
        }
        return limits.copy(installmentAmount);
    }

    @Nullable
    public final InstallmentAmount component1() {
        return this.installmentAmount;
    }

    @NotNull
    public final Limits copy(@Nullable InstallmentAmount installmentAmount) {
        return new Limits(installmentAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Limits) && Intrinsics.areEqual(this.installmentAmount, ((Limits) obj).installmentAmount);
    }

    @Nullable
    public final InstallmentAmount getInstallmentAmount() {
        return this.installmentAmount;
    }

    public int hashCode() {
        InstallmentAmount installmentAmount = this.installmentAmount;
        if (installmentAmount == null) {
            return 0;
        }
        return installmentAmount.hashCode();
    }

    @NotNull
    public String toString() {
        return "Limits(installmentAmount=" + this.installmentAmount + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        InstallmentAmount installmentAmount = this.installmentAmount;
        if (installmentAmount == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        installmentAmount.writeToParcel(out, i);
    }

    public Limits(@Nullable InstallmentAmount installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public /* synthetic */ Limits(InstallmentAmount installmentAmount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : installmentAmount);
    }
}
