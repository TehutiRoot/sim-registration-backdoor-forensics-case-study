package th.p047co.dtac.android.dtacone.model.change_sim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B¥\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\b\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020*H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006/"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isSmartCard", "", "reasonCode", "idDocumentType", "idCardNumber", "photoId", "issueDate", "expireDate", "birthDate", HintConstants.AUTOFILL_HINT_GENDER, "firstNameThai", "lastNameThai", "firstNameEng", "lastNameEng", "titleThai", "titleEng", "idCardAddress", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfoIdCardAddress;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfoIdCardAddress;)V", "getBirthDate", "()Ljava/lang/String;", "getExpireDate", "getFirstNameEng", "getFirstNameThai", "getGender", "getIdCardAddress", "()Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfoIdCardAddress;", "getIdCardNumber", "getIdDocumentType", "getIssueDate", "getLastNameEng", "getLastNameThai", "getPhotoId", "getReasonCode", "getTitleEng", "getTitleThai", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimInfo */
/* loaded from: classes8.dex */
public final class ChangeSimInfo implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("birthDate")
    @Nullable
    private final String birthDate;
    @SerializedName("expireDate")
    @Nullable
    private final String expireDate;
    @SerializedName("firstNameEng")
    @Nullable
    private final String firstNameEng;
    @SerializedName("firstNameThai")
    @Nullable
    private final String firstNameThai;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private final String gender;
    @SerializedName("idCardAddress")
    @Nullable
    private final ChangeSimInfoIdCardAddress idCardAddress;
    @SerializedName("idCardNumber")
    @Nullable
    private final String idCardNumber;
    @SerializedName("idDocumentType")
    @Nullable
    private final String idDocumentType;
    @SerializedName("isSmartCard")
    @Nullable
    private final String isSmartCard;
    @SerializedName("issueDate")
    @Nullable
    private final String issueDate;
    @SerializedName("lastNameEng")
    @Nullable
    private final String lastNameEng;
    @SerializedName("lastNameThai")
    @Nullable
    private final String lastNameThai;
    @SerializedName("photoId")
    @Nullable
    private final String photoId;
    @SerializedName("reasonCode")
    @Nullable
    private final String reasonCode;
    @SerializedName("titleEng")
    @Nullable
    private final String titleEng;
    @SerializedName("titleThai")
    @Nullable
    private final String titleThai;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfo;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimInfo$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<ChangeSimInfo> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangeSimInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimInfo[] newArray(int i) {
            return new ChangeSimInfo[i];
        }
    }

    public ChangeSimInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable ChangeSimInfoIdCardAddress changeSimInfoIdCardAddress) {
        this.isSmartCard = str;
        this.reasonCode = str2;
        this.idDocumentType = str3;
        this.idCardNumber = str4;
        this.photoId = str5;
        this.issueDate = str6;
        this.expireDate = str7;
        this.birthDate = str8;
        this.gender = str9;
        this.firstNameThai = str10;
        this.lastNameThai = str11;
        this.firstNameEng = str12;
        this.lastNameEng = str13;
        this.titleThai = str14;
        this.titleEng = str15;
        this.idCardAddress = changeSimInfoIdCardAddress;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getExpireDate() {
        return this.expireDate;
    }

    @Nullable
    public final String getFirstNameEng() {
        return this.firstNameEng;
    }

    @Nullable
    public final String getFirstNameThai() {
        return this.firstNameThai;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final ChangeSimInfoIdCardAddress getIdCardAddress() {
        return this.idCardAddress;
    }

    @Nullable
    public final String getIdCardNumber() {
        return this.idCardNumber;
    }

    @Nullable
    public final String getIdDocumentType() {
        return this.idDocumentType;
    }

    @Nullable
    public final String getIssueDate() {
        return this.issueDate;
    }

    @Nullable
    public final String getLastNameEng() {
        return this.lastNameEng;
    }

    @Nullable
    public final String getLastNameThai() {
        return this.lastNameThai;
    }

    @Nullable
    public final String getPhotoId() {
        return this.photoId;
    }

    @Nullable
    public final String getReasonCode() {
        return this.reasonCode;
    }

    @Nullable
    public final String getTitleEng() {
        return this.titleEng;
    }

    @Nullable
    public final String getTitleThai() {
        return this.titleThai;
    }

    @Nullable
    public final String isSmartCard() {
        return this.isSmartCard;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.isSmartCard);
        parcel.writeString(this.reasonCode);
        parcel.writeString(this.idDocumentType);
        parcel.writeString(this.idCardNumber);
        parcel.writeString(this.photoId);
        parcel.writeString(this.issueDate);
        parcel.writeString(this.expireDate);
        parcel.writeString(this.birthDate);
        parcel.writeString(this.gender);
        parcel.writeString(this.firstNameThai);
        parcel.writeString(this.lastNameThai);
        parcel.writeString(this.firstNameEng);
        parcel.writeString(this.lastNameEng);
        parcel.writeString(this.titleThai);
        parcel.writeString(this.titleEng);
        parcel.writeParcelable(this.idCardAddress, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeSimInfo(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ChangeSimInfoIdCardAddress) parcel.readParcelable(ChangeSimInfoIdCardAddress.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
