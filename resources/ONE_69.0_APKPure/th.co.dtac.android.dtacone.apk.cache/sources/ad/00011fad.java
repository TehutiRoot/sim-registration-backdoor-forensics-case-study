package th.p047co.dtac.android.dtacone.model.p2post.submit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.Pre2PostIdCardCollection */
/* loaded from: classes8.dex */
public class Pre2PostIdCardCollection implements Parcelable {
    public static final Parcelable.Creator<Pre2PostIdCardCollection> CREATOR = new C14230a();
    @SerializedName("birthDate")
    private String birthDate;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private String countryCode;
    @SerializedName("district")
    private String district;
    @SerializedName("expireDate")
    private String expireDate;
    @SerializedName("firstNameEng")
    private String firstNameEng;
    @SerializedName("firstNameThai")
    private String firstNameThai;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    private String gender;
    @SerializedName("houseNo")
    private String houseNo;
    @SerializedName("idCardNumber")
    private String idCardNumber;
    @SerializedName("issueDate")
    private String issueDate;
    @SerializedName("lastNameEng")
    private String lastNameEng;
    @SerializedName("lastNameThai")
    private String lastNameThai;
    @SerializedName("moo")
    private String moo;
    @SerializedName("photo")
    private String photo;
    @SerializedName("photoId")
    private String photoId;
    @SerializedName("postCode")
    private String postCode;
    @SerializedName("postCodeSeqn")
    private String postCodeSeqn;
    @SerializedName("provinceCode")
    private String provinceCode;
    @SerializedName("provinceName")
    private String provinceName;
    @SerializedName("road")
    private String road;
    @SerializedName("soi")
    private String soi;
    @SerializedName("subDistrict")
    private String subDistrict;
    @SerializedName("titleEng")
    private String titleEng;
    @SerializedName("titleThai")
    private String titleThai;

    /* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.Pre2PostIdCardCollection$a */
    /* loaded from: classes8.dex */
    public class C14230a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Pre2PostIdCardCollection createFromParcel(Parcel parcel) {
            return new Pre2PostIdCardCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Pre2PostIdCardCollection[] newArray(int i) {
            return new Pre2PostIdCardCollection[i];
        }
    }

    public Pre2PostIdCardCollection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        this.idCardNumber = str;
        this.photo = str2;
        this.photoId = str3;
        this.issueDate = str4;
        this.expireDate = str5;
        this.birthDate = str6;
        this.gender = str7;
        this.firstNameThai = str8;
        this.lastNameThai = str9;
        this.firstNameEng = str10;
        this.lastNameEng = str11;
        this.titleThai = str12;
        this.titleEng = str13;
        this.countryCode = str14;
        this.provinceCode = str15;
        this.provinceName = str16;
        this.district = str17;
        this.subDistrict = str18;
        this.houseNo = str19;
        this.moo = str20;
        this.postCode = str21;
        this.postCodeSeqn = str22;
        this.road = str23;
        this.soi = str24;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getHouseNo() {
        return this.houseNo;
    }

    public String getMoo() {
        return this.moo;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getPostCodeSeqn() {
        return this.postCodeSeqn;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public String getRoad() {
        return this.road;
    }

    public String getSoi() {
        return this.soi;
    }

    public String getSubDistrict() {
        return this.subDistrict;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.idCardNumber);
        parcel.writeString(this.photo);
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
        parcel.writeString(this.countryCode);
        parcel.writeString(this.provinceCode);
        parcel.writeString(this.provinceName);
        parcel.writeString(this.district);
        parcel.writeString(this.subDistrict);
        parcel.writeString(this.houseNo);
        parcel.writeString(this.moo);
        parcel.writeString(this.postCode);
        parcel.writeString(this.postCodeSeqn);
        parcel.writeString(this.road);
        parcel.writeString(this.soi);
    }

    public Pre2PostIdCardCollection() {
    }

    public Pre2PostIdCardCollection(Parcel parcel) {
        this.idCardNumber = parcel.readString();
        this.photo = parcel.readString();
        this.photoId = parcel.readString();
        this.issueDate = parcel.readString();
        this.expireDate = parcel.readString();
        this.birthDate = parcel.readString();
        this.gender = parcel.readString();
        this.firstNameThai = parcel.readString();
        this.lastNameThai = parcel.readString();
        this.firstNameEng = parcel.readString();
        this.lastNameEng = parcel.readString();
        this.titleThai = parcel.readString();
        this.titleEng = parcel.readString();
        this.countryCode = parcel.readString();
        this.provinceCode = parcel.readString();
        this.provinceName = parcel.readString();
        this.district = parcel.readString();
        this.subDistrict = parcel.readString();
        this.houseNo = parcel.readString();
        this.moo = parcel.readString();
        this.postCode = parcel.readString();
        this.postCodeSeqn = parcel.readString();
        this.road = parcel.readString();
        this.soi = parcel.readString();
    }
}