package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.RegisterOwnerCollection */
/* loaded from: classes8.dex */
public class RegisterOwnerCollection extends BaseUserCollection {
    public static final Parcelable.Creator<RegisterOwnerCollection> CREATOR = new C14219a();
    @SerializedName("rtrCode")
    private String rtrCode;
    @SerializedName("simRToken")
    private String simRToken;

    /* renamed from: th.co.dtac.android.dtacone.model.RegisterOwnerCollection$a */
    /* loaded from: classes8.dex */
    public class C14219a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RegisterOwnerCollection createFromParcel(Parcel parcel) {
            return new RegisterOwnerCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RegisterOwnerCollection[] newArray(int i) {
            return new RegisterOwnerCollection[i];
        }
    }

    public RegisterOwnerCollection(String str, String str2) {
        this.simRToken = "";
        setPhoneNumber(str);
        this.rtrCode = str2;
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getRtrCode() {
        return this.rtrCode;
    }

    public String getSimRToken() {
        return this.simRToken;
    }

    public void setSimRToken(String str) {
        this.simRToken = str;
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.rtrCode);
        parcel.writeString(this.simRToken);
    }

    public RegisterOwnerCollection(Parcel parcel) {
        super(parcel);
        this.simRToken = "";
        this.rtrCode = parcel.readString();
        this.simRToken = parcel.readString();
    }
}