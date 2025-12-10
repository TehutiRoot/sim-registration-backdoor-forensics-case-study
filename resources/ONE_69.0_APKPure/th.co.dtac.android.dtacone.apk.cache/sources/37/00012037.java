package th.p047co.dtac.android.dtacone.model.register;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.model.BaseUserCollection;

/* renamed from: th.co.dtac.android.dtacone.model.register.RegisterCollection */
/* loaded from: classes8.dex */
public class RegisterCollection extends BaseUserCollection {
    public static final Parcelable.Creator<RegisterCollection> CREATOR = new C14249a();
    @SerializedName("idCard")
    private String idCard;
    @SerializedName("msisdn")
    private String msisdn;
    @SerializedName("rtrCode")
    private String rtrCode;
    @SerializedName("simR")
    private String simR;
    @SerializedName("simRToken")
    private String simRToken;

    /* renamed from: th.co.dtac.android.dtacone.model.register.RegisterCollection$a */
    /* loaded from: classes8.dex */
    public class C14249a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RegisterCollection createFromParcel(Parcel parcel) {
            return new RegisterCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RegisterCollection[] newArray(int i) {
            return new RegisterCollection[i];
        }
    }

    public RegisterCollection() {
        this.simRToken = "";
        this.idCard = "";
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public String getRtrCode() {
        return this.rtrCode;
    }

    public void setIdCard(String str) {
        this.idCard = str;
    }

    public void setPassword(String str, String str2) {
        this.password = str;
        this.confirmPassword = str2;
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.simRToken);
        parcel.writeString(this.msisdn);
        parcel.writeString(this.rtrCode);
        parcel.writeString(this.simR);
    }

    public RegisterCollection(String str, String str2, String str3, String str4, String str5, String str6) {
        this.simRToken = str;
        this.msisdn = str2;
        this.rtrCode = str3;
        this.simR = str4;
        this.idCard = str5;
        this.password = str6;
    }

    public RegisterCollection(String str, String str2) {
        this.simRToken = "";
        this.idCard = "";
        setPhoneNumber(str);
        this.rtrCode = str2;
    }

    public RegisterCollection(Parcel parcel) {
        super(parcel);
        this.simRToken = "";
        this.idCard = "";
        this.simRToken = parcel.readString();
        this.msisdn = parcel.readString();
        this.rtrCode = parcel.readString();
        this.simR = parcel.readString();
    }
}