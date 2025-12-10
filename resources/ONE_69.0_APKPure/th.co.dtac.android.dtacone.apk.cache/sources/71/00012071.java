package th.p047co.dtac.android.dtacone.model.self_update;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BM\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrContactPerson;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isFirstNameEditable", "", "firstName", "", "lastName", "isLastNameEditable", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "isPhoneNumberEditable", "idCard", "isIdCardNumberEditable", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Z)V", "getFirstName", "()Ljava/lang/String;", "getIdCard", "()Z", "getLastName", "getPhoneNumber", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrContactPerson */
/* loaded from: classes8.dex */
public final class RtrContactPerson implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("idCardNumber")
    @Nullable
    private final String idCard;
    @SerializedName("isFirstNameEditable")
    private final boolean isFirstNameEditable;
    @SerializedName("isIdCardNumberEditable")
    private final boolean isIdCardNumberEditable;
    @SerializedName("isLastNameEditable")
    private final boolean isLastNameEditable;
    @SerializedName("isPhoneNumberEditable")
    private final boolean isPhoneNumberEditable;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    @Nullable
    private final String phoneNumber;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<RtrContactPerson> CREATOR = new Parcelable.Creator<RtrContactPerson>() { // from class: th.co.dtac.android.dtacone.model.self_update.RtrContactPerson$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RtrContactPerson createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new RtrContactPerson(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RtrContactPerson[] newArray(int i) {
            return new RtrContactPerson[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrContactPerson$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/self_update/RtrContactPerson;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrContactPerson$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RtrContactPerson(boolean z, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, boolean z3, @Nullable String str4, boolean z4) {
        this.isFirstNameEditable = z;
        this.firstName = str;
        this.lastName = str2;
        this.isLastNameEditable = z2;
        this.phoneNumber = str3;
        this.isPhoneNumberEditable = z3;
        this.idCard = str4;
        this.isIdCardNumberEditable = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getIdCard() {
        return this.idCard;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean isFirstNameEditable() {
        return this.isFirstNameEditable;
    }

    public final boolean isIdCardNumberEditable() {
        return this.isIdCardNumberEditable;
    }

    public final boolean isLastNameEditable() {
        return this.isLastNameEditable;
    }

    public final boolean isPhoneNumberEditable() {
        return this.isPhoneNumberEditable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isFirstNameEditable ? 1 : 0);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeInt(this.isLastNameEditable ? 1 : 0);
        dest.writeString(this.phoneNumber);
        dest.writeInt(this.isPhoneNumberEditable ? 1 : 0);
        dest.writeString(this.idCard);
        dest.writeInt(this.isIdCardNumberEditable ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RtrContactPerson(@NotNull Parcel source) {
        this(1 == source.readInt(), source.readString(), source.readString(), 1 == source.readInt(), source.readString(), 1 == source.readInt(), source.readString(), 1 == source.readInt());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}