package th.p047co.dtac.android.dtacone.model.inactive_user;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0016H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001e\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerCollection;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "displayLastLoginDate", "", "getDisplayLastLoginDate", "()Ljava/lang/String;", "setDisplayLastLoginDate", "(Ljava/lang/String;)V", "displayLastLoginTime", "getDisplayLastLoginTime", "setDisplayLastLoginTime", "displayRegisterDate", "getDisplayRegisterDate", "setDisplayRegisterDate", "displayRegisterTime", "getDisplayRegisterTime", "setDisplayRegisterTime", "mrtrUserId", "", "getMrtrUserId", "()I", "setMrtrUserId", "(I)V", "userId", "getUserId", "setUserId", "describeContents", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerCollection */
/* loaded from: classes8.dex */
public final class OwnerCollection implements Parcelable {
    @SerializedName("displayLastLoginDate")
    public String displayLastLoginDate;
    @SerializedName("displayLastLoginTime")
    public String displayLastLoginTime;
    @SerializedName("displayRegisterDate")
    public String displayRegisterDate;
    @SerializedName("displayRegisterTime")
    public String displayRegisterTime;
    @SerializedName("mrtrUserId")
    private int mrtrUserId;
    @SerializedName("userId")
    public String userId;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerCollection$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerCollection;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/inactive_user/OwnerCollection;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerCollection$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OwnerCollection> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OwnerCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OwnerCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OwnerCollection[] newArray(int i) {
            return new OwnerCollection[i];
        }
    }

    public OwnerCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getDisplayLastLoginDate() {
        String str = this.displayLastLoginDate;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("displayLastLoginDate");
        return null;
    }

    @NotNull
    public final String getDisplayLastLoginTime() {
        String str = this.displayLastLoginTime;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("displayLastLoginTime");
        return null;
    }

    @NotNull
    public final String getDisplayRegisterDate() {
        String str = this.displayRegisterDate;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("displayRegisterDate");
        return null;
    }

    @NotNull
    public final String getDisplayRegisterTime() {
        String str = this.displayRegisterTime;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("displayRegisterTime");
        return null;
    }

    public final int getMrtrUserId() {
        return this.mrtrUserId;
    }

    @NotNull
    public final String getUserId() {
        String str = this.userId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userId");
        return null;
    }

    public final void setDisplayLastLoginDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayLastLoginDate = str;
    }

    public final void setDisplayLastLoginTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayLastLoginTime = str;
    }

    public final void setDisplayRegisterDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayRegisterDate = str;
    }

    public final void setDisplayRegisterTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayRegisterTime = str;
    }

    public final void setMrtrUserId(int i) {
        this.mrtrUserId = i;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.mrtrUserId);
        parcel.writeString(getUserId());
        parcel.writeString(getDisplayRegisterDate());
        parcel.writeString(getDisplayRegisterTime());
        parcel.writeString(getDisplayLastLoginDate());
        parcel.writeString(getDisplayLastLoginTime());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OwnerCollection(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.mrtrUserId = parcel.readInt();
        setUserId(String.valueOf(parcel.readString()));
        setDisplayRegisterDate(String.valueOf(parcel.readString()));
        setDisplayRegisterTime(String.valueOf(parcel.readString()));
        setDisplayLastLoginDate(String.valueOf(parcel.readString()));
        setDisplayLastLoginTime(String.valueOf(parcel.readString()));
    }
}