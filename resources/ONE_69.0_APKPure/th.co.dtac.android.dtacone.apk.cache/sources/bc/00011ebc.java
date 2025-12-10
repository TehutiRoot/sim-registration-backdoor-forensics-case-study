package th.p047co.dtac.android.dtacone.model.mnp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.mnp.PostcodeDataCollection */
/* loaded from: classes8.dex */
public class PostcodeDataCollection implements Parcelable {
    public static final Parcelable.Creator<PostcodeDataCollection> CREATOR = new C14229a();
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private String countryCode;
    @SerializedName("postcode")
    private String postcode;
    @SerializedName("postcodeSeq")
    private String postcodeSeq;
    @SerializedName("provinceCode")
    private String provinceCode;

    /* renamed from: th.co.dtac.android.dtacone.model.mnp.PostcodeDataCollection$a */
    /* loaded from: classes8.dex */
    public class C14229a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PostcodeDataCollection createFromParcel(Parcel parcel) {
            return new PostcodeDataCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PostcodeDataCollection[] newArray(int i) {
            return new PostcodeDataCollection[i];
        }
    }

    public PostcodeDataCollection(String str, String str2, String str3, String str4) {
        this.postcode = str;
        this.postcodeSeq = str2;
        this.countryCode = str3;
        this.provinceCode = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public String getPostcodeSeq() {
        return this.postcodeSeq;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.postcode);
        parcel.writeString(this.postcodeSeq);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.provinceCode);
    }

    public PostcodeDataCollection(Parcel parcel) {
        this.postcode = parcel.readString();
        this.postcodeSeq = parcel.readString();
        this.countryCode = parcel.readString();
        this.provinceCode = parcel.readString();
    }
}