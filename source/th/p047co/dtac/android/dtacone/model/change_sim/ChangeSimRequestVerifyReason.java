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
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "idCardNumber", "reasonCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdCardNumber", "()Ljava/lang/String;", "getReasonCode", "getSubscriberNumber", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason */
/* loaded from: classes8.dex */
public final class ChangeSimRequestVerifyReason implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("idCardNumber")
    @Nullable
    private final String idCardNumber;
    @SerializedName("reasonCode")
    @Nullable
    private final String reasonCode;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<ChangeSimRequestVerifyReason> CREATOR = new Parcelable.Creator<ChangeSimRequestVerifyReason>() { // from class: th.co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimRequestVerifyReason createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ChangeSimRequestVerifyReason(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimRequestVerifyReason[] newArray(int i) {
            return new ChangeSimRequestVerifyReason[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ChangeSimRequestVerifyReason(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.subscriberNumber = str;
        this.idCardNumber = str2;
        this.reasonCode = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getIdCardNumber() {
        return this.idCardNumber;
    }

    @Nullable
    public final String getReasonCode() {
        return this.reasonCode;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.subscriberNumber);
        dest.writeString(this.idCardNumber);
        dest.writeString(this.reasonCode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeSimRequestVerifyReason(@NotNull Parcel source) {
        this(source.readString(), source.readString(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
