package th.p047co.dtac.android.dtacone.model.p2post.submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.Pre2PostMailingAddressCollection */
/* loaded from: classes8.dex */
public class Pre2PostMailingAddressCollection implements Parcelable {
    public static final Parcelable.Creator<Pre2PostMailingAddressCollection> CREATOR = new C14231a();
    @SerializedName("district")
    private String district;
    @SerializedName("email")
    private String email;
    @SerializedName("houseNo")
    private String houseNo;
    @SerializedName("invoiceType")
    private String invoiceType;
    @SerializedName("mailingAddressType")
    private String mailingAddressType;
    @SerializedName("postCode")
    private String postCode;
    @SerializedName("postCodeSeqn")
    private String postCodeSeqn;
    @SerializedName("province")
    private String province;
    @SerializedName("subDistrict")
    private String subDistrict;

    /* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.Pre2PostMailingAddressCollection$a */
    /* loaded from: classes8.dex */
    public class C14231a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Pre2PostMailingAddressCollection createFromParcel(Parcel parcel) {
            return new Pre2PostMailingAddressCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Pre2PostMailingAddressCollection[] newArray(int i) {
            return new Pre2PostMailingAddressCollection[i];
        }
    }

    public Pre2PostMailingAddressCollection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.houseNo = str;
        this.province = str2;
        this.district = str3;
        this.subDistrict = str4;
        this.postCode = str5;
        this.postCodeSeqn = str6;
        this.email = str7;
        this.mailingAddressType = str8;
        this.invoiceType = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.houseNo);
        parcel.writeString(this.province);
        parcel.writeString(this.district);
        parcel.writeString(this.subDistrict);
        parcel.writeString(this.postCode);
        parcel.writeString(this.postCodeSeqn);
        parcel.writeString(this.email);
        parcel.writeString(this.mailingAddressType);
        parcel.writeString(this.invoiceType);
    }

    public Pre2PostMailingAddressCollection() {
    }

    public Pre2PostMailingAddressCollection(Parcel parcel) {
        this.houseNo = parcel.readString();
        this.province = parcel.readString();
        this.district = parcel.readString();
        this.subDistrict = parcel.readString();
        this.postCode = parcel.readString();
        this.postCodeSeqn = parcel.readString();
        this.email = parcel.readString();
        this.mailingAddressType = parcel.readString();
        this.invoiceType = parcel.readString();
    }
}