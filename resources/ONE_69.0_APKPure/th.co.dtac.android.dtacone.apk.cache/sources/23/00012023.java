package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: th.co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection */
/* loaded from: classes8.dex */
public class UpdateProfileFormCollection implements Parcelable {
    public static final Parcelable.Creator<UpdateProfileFormCollection> CREATOR = new C14247a();
    private String birthDate;
    private String firstName;
    private String identityNumber;
    private String identityType;
    private String lastName;
    private String title;

    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection$a */
    /* loaded from: classes8.dex */
    public class C14247a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UpdateProfileFormCollection createFromParcel(Parcel parcel) {
            return new UpdateProfileFormCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UpdateProfileFormCollection[] newArray(int i) {
            return new UpdateProfileFormCollection[i];
        }
    }

    public UpdateProfileFormCollection(String str, String str2, String str3, String str4, String str5, String str6) {
        this.identityType = str;
        this.identityNumber = str2;
        this.title = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.birthDate = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public String getIdentityType() {
        return this.identityType;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.identityType);
        parcel.writeString(this.identityNumber);
        parcel.writeString(this.title);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.birthDate);
    }

    public UpdateProfileFormCollection(Parcel parcel) {
        this.identityType = parcel.readString();
        this.identityNumber = parcel.readString();
        this.title = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.birthDate = parcel.readString();
    }
}