package th.p047co.dtac.android.dtacone.model.change_sim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0010H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimResponseVerifyReason;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "transactionId", "", "oldSimCard", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldSimCard", "()Ljava/lang/String;", "getTransactionId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimResponseVerifyReason */
/* loaded from: classes8.dex */
public final class ChangeSimResponseVerifyReason implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("oldSimCard")
    @Nullable
    private final String oldSimCard;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<ChangeSimResponseVerifyReason> CREATOR = new Parcelable.Creator<ChangeSimResponseVerifyReason>() { // from class: th.co.dtac.android.dtacone.model.change_sim.ChangeSimResponseVerifyReason$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimResponseVerifyReason createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ChangeSimResponseVerifyReason(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimResponseVerifyReason[] newArray(int i) {
            return new ChangeSimResponseVerifyReason[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimResponseVerifyReason$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimResponseVerifyReason;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimResponseVerifyReason$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ChangeSimResponseVerifyReason(@Nullable String str, @Nullable String str2) {
        this.transactionId = str;
        this.oldSimCard = str2;
    }

    public static /* synthetic */ ChangeSimResponseVerifyReason copy$default(ChangeSimResponseVerifyReason changeSimResponseVerifyReason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeSimResponseVerifyReason.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = changeSimResponseVerifyReason.oldSimCard;
        }
        return changeSimResponseVerifyReason.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.transactionId;
    }

    @Nullable
    public final String component2() {
        return this.oldSimCard;
    }

    @NotNull
    public final ChangeSimResponseVerifyReason copy(@Nullable String str, @Nullable String str2) {
        return new ChangeSimResponseVerifyReason(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeSimResponseVerifyReason) {
            ChangeSimResponseVerifyReason changeSimResponseVerifyReason = (ChangeSimResponseVerifyReason) obj;
            return Intrinsics.areEqual(this.transactionId, changeSimResponseVerifyReason.transactionId) && Intrinsics.areEqual(this.oldSimCard, changeSimResponseVerifyReason.oldSimCard);
        }
        return false;
    }

    @Nullable
    public final String getOldSimCard() {
        return this.oldSimCard;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.oldSimCard;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.transactionId;
        String str2 = this.oldSimCard;
        return "ChangeSimResponseVerifyReason(transactionId=" + str + ", oldSimCard=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transactionId);
        dest.writeString(this.oldSimCard);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeSimResponseVerifyReason(@NotNull Parcel source) {
        this(source.readString(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
