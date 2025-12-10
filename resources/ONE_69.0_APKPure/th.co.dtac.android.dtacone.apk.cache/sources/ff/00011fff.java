package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

/* renamed from: th.co.dtac.android.dtacone.model.prepaid.CardCollection */
/* loaded from: classes8.dex */
public class CardCollection implements Parcelable {
    public static final Parcelable.Creator<CardCollection> CREATOR = new C14243a();
    @SerializedName("address1")
    private String address;
    @SerializedName("amphur")
    private String amphur;
    @Expose(deserialize = false, serialize = false)
    private String birthDate;
    @SerializedName("identityType")
    private String cardType;
    @Expose(deserialize = false, serialize = false)
    private String firstName;
    @Expose(deserialize = false, serialize = false)
    private String gender;
    @SerializedName("identityNumber")
    private String identityNumber;
    @SerializedName("isSmartCardData")
    private String isSmartCardData;
    @Expose(deserialize = false, serialize = false)
    private String lastName;
    @SerializedName("province")
    private String province;
    @SerializedName("simcardNumber")
    private String simcardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    private String subscriberNumber;
    @Expose(deserialize = false, serialize = false)
    private String title;

    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.CardCollection$a */
    /* loaded from: classes8.dex */
    public class C14243a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CardCollection createFromParcel(Parcel parcel) {
            return new CardCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CardCollection[] newArray(int i) {
            return new CardCollection[i];
        }
    }

    public CardCollection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.cardType = "01";
        this.identityNumber = str;
        this.amphur = str5;
        this.province = str6;
        this.address = str7;
        this.isSmartCardData = "Y";
        this.subscriberNumber = str8;
        this.simcardNumber = str9;
        this.title = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.birthDate = str10;
        this.gender = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAmphur() {
        return this.amphur;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public String getIsSmartCardData() {
        return this.isSmartCardData;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getProvince() {
        return this.province;
    }

    public String getSimcardNumber() {
        return this.simcardNumber;
    }

    public String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSubscriberNumber(String str) {
        this.subscriberNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardType);
        parcel.writeString(this.identityNumber);
        parcel.writeString(this.amphur);
        parcel.writeString(this.province);
        parcel.writeString(this.address);
        parcel.writeString(this.isSmartCardData);
        parcel.writeString(this.subscriberNumber);
        parcel.writeString(this.simcardNumber);
        parcel.writeString(this.title);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.birthDate);
        parcel.writeString(this.gender);
    }

    public CardCollection(String str, String str2, String str3, String str4) {
        this.cardType = str;
        this.identityNumber = str2;
        this.amphur = "";
        this.province = "";
        this.address = "";
        this.isSmartCardData = "N";
        this.subscriberNumber = str3;
        this.simcardNumber = str4;
        this.title = "";
        this.firstName = "";
        this.lastName = "";
    }

    public CardCollection(Parcel parcel) {
        this.cardType = parcel.readString();
        this.identityNumber = parcel.readString();
        this.amphur = parcel.readString();
        this.province = parcel.readString();
        this.address = parcel.readString();
        this.isSmartCardData = parcel.readString();
        this.subscriberNumber = parcel.readString();
        this.simcardNumber = parcel.readString();
        this.title = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.birthDate = parcel.readString();
        this.gender = parcel.readString();
    }
}