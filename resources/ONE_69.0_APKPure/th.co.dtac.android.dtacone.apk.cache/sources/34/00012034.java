package th.p047co.dtac.android.dtacone.model.rectify;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* renamed from: th.co.dtac.android.dtacone.model.rectify.RectifyListCollection */
/* loaded from: classes8.dex */
public class RectifyListCollection implements Parcelable, Serializable {
    public static final Parcelable.Creator<RectifyListCollection> CREATOR = new C14248a();
    @SerializedName("amount")
    private int amount;
    @SerializedName("createdDateTime")
    private String createdDateTime;
    @SerializedName("customerNumber")
    private String customerNumber;
    @SerializedName("marketDescription")
    private String marketDescription;
    @SerializedName("featureCode")
    private String rectifyFeatureCode;
    @SerializedName("type")
    private String rectifyType;
    @SerializedName("simR")
    private String simR;
    @SerializedName("transactionID")
    private String transactionID;
    @SerializedName("ussdServiceCode")
    private String ussdServiceCode;

    /* renamed from: th.co.dtac.android.dtacone.model.rectify.RectifyListCollection$a */
    /* loaded from: classes8.dex */
    public class C14248a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RectifyListCollection createFromParcel(Parcel parcel) {
            return new RectifyListCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RectifyListCollection[] newArray(int i) {
            return new RectifyListCollection[i];
        }
    }

    public RectifyListCollection(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.createdDateTime = str;
        this.rectifyType = str2;
        this.rectifyFeatureCode = str8;
        this.amount = i;
        this.simR = str3;
        this.transactionID = str4;
        this.customerNumber = str5;
        this.marketDescription = str6;
        this.ussdServiceCode = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getCreatedDateTime() {
        return this.createdDateTime;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getFeatureCode() {
        return this.rectifyFeatureCode;
    }

    public String getMarketDescription() {
        return this.marketDescription;
    }

    public String getRectifyType() {
        return this.rectifyType;
    }

    public String getSimR() {
        return this.simR;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public String getUssdServiceCode() {
        return this.ussdServiceCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.createdDateTime);
        parcel.writeString(this.rectifyType);
        parcel.writeString(this.rectifyFeatureCode);
        parcel.writeFloat(this.amount);
        parcel.writeString(this.simR);
        parcel.writeString(this.transactionID);
        parcel.writeString(this.customerNumber);
        parcel.writeString(this.marketDescription);
        parcel.writeString(this.ussdServiceCode);
    }

    public RectifyListCollection() {
        this.rectifyFeatureCode = "";
    }

    public RectifyListCollection(Parcel parcel) {
        this.rectifyFeatureCode = "";
        this.createdDateTime = parcel.readString();
        this.rectifyType = parcel.readString();
        this.rectifyFeatureCode = parcel.readString();
        this.amount = parcel.readInt();
        this.simR = parcel.readString();
        this.transactionID = parcel.readString();
        this.customerNumber = parcel.readString();
        this.marketDescription = parcel.readString();
        this.ussdServiceCode = parcel.readString();
    }
}