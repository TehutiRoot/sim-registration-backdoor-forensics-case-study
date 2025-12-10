package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.prepaid.CardInformationCollection */
/* loaded from: classes8.dex */
public class CardInformationCollection implements Parcelable {
    public static final Parcelable.Creator<CardInformationCollection> CREATOR = new C14244a();
    @SerializedName("address1")
    private String address;
    @SerializedName("amphur")
    private String amphur;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private String countryCode;
    @SerializedName("postcode")
    private String postcode;
    @SerializedName("postcodeSequence")
    private String postcodeSequence;
    @SerializedName("province")
    private String province;

    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.CardInformationCollection$a */
    /* loaded from: classes8.dex */
    public class C14244a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CardInformationCollection createFromParcel(Parcel parcel) {
            return new CardInformationCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CardInformationCollection[] newArray(int i) {
            return new CardInformationCollection[i];
        }
    }

    public CardInformationCollection(String str, String str2, String str3, String str4, String str5, String str6) {
        this.postcode = str;
        this.postcodeSequence = str2;
        this.countryCode = str3;
        this.address = str4;
        this.amphur = str5;
        this.province = str6;
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

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public String getPostcodeSequence() {
        return this.postcodeSequence;
    }

    public String getProvince() {
        return this.province;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.postcode);
        parcel.writeString(this.postcodeSequence);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.address);
        parcel.writeString(this.amphur);
        parcel.writeString(this.province);
    }

    public CardInformationCollection(Parcel parcel) {
        this.postcode = parcel.readString();
        this.postcodeSequence = parcel.readString();
        this.countryCode = parcel.readString();
        this.address = parcel.readString();
        this.amphur = parcel.readString();
        this.province = parcel.readString();
    }
}