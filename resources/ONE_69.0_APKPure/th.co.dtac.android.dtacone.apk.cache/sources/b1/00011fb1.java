package th.p047co.dtac.android.dtacone.model.p2post.submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

/* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.Pre2PostSubmitCollection */
/* loaded from: classes8.dex */
public class Pre2PostSubmitCollection implements Parcelable {
    public static final Parcelable.Creator<Pre2PostSubmitCollection> CREATOR = new C14232a();
    @SerializedName("idCard")
    private Pre2PostIdCardCollection idCard;
    @SerializedName("idDocumentType")
    private String idDocumentType;
    @SerializedName("isSmartCardData")
    private String isSmartCardData;
    @SerializedName("mailingAddress")
    private Pre2PostMailingAddressCollection mailingAddress;
    @SerializedName("mrtrConsentId")
    private int mrtrConsentId;
    @SerializedName("otp")
    private String otp;
    @SerializedName("packageSetID")
    private String packageSetID;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    private String subscriberNumber;

    /* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.Pre2PostSubmitCollection$a */
    /* loaded from: classes8.dex */
    public class C14232a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Pre2PostSubmitCollection createFromParcel(Parcel parcel) {
            return new Pre2PostSubmitCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Pre2PostSubmitCollection[] newArray(int i) {
            return new Pre2PostSubmitCollection[i];
        }
    }

    public Pre2PostSubmitCollection(String str, String str2, String str3, String str4, Pre2PostIdCardCollection pre2PostIdCardCollection, Pre2PostMailingAddressCollection pre2PostMailingAddressCollection, String str5) {
        this.otp = str;
        this.packageSetID = str2;
        this.subscriberNumber = str3;
        this.isSmartCardData = str4;
        this.idCard = pre2PostIdCardCollection;
        this.mailingAddress = pre2PostMailingAddressCollection;
        this.idDocumentType = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Pre2PostIdCardCollection getIdCard() {
        return this.idCard;
    }

    public String getIdDocumentType() {
        return this.idDocumentType;
    }

    public String getIsSmartCardData() {
        return this.isSmartCardData;
    }

    public Pre2PostMailingAddressCollection getMailingAddress() {
        return this.mailingAddress;
    }

    public int getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    public String getOtp() {
        return this.otp;
    }

    public String getPackageSetID() {
        return this.packageSetID;
    }

    public String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public void setMrtrConsentId(int i) {
        this.mrtrConsentId = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.otp);
        parcel.writeString(this.packageSetID);
        parcel.writeString(this.subscriberNumber);
        parcel.writeString(this.isSmartCardData);
        parcel.writeParcelable(this.idCard, i);
        parcel.writeParcelable(this.mailingAddress, i);
        parcel.writeString(this.idDocumentType);
        parcel.writeInt(this.mrtrConsentId);
    }

    public Pre2PostSubmitCollection(Parcel parcel) {
        this.otp = parcel.readString();
        this.packageSetID = parcel.readString();
        this.subscriberNumber = parcel.readString();
        this.isSmartCardData = parcel.readString();
        this.idCard = (Pre2PostIdCardCollection) parcel.readParcelable(Pre2PostIdCardCollection.class.getClassLoader());
        this.mailingAddress = (Pre2PostMailingAddressCollection) parcel.readParcelable(Pre2PostMailingAddressCollection.class.getClassLoader());
        this.idDocumentType = parcel.readString();
        this.mrtrConsentId = parcel.readInt();
    }
}