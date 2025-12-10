package th.p047co.dtac.android.dtacone.model.p2post.submit.recommend.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.model.p2post.MailingAddressCollection;
import th.p047co.dtac.android.dtacone.model.p2post.submit.Pre2PostIdCardCollection;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

/* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.recommend.response.Pre2PostRecommendPackageSubmitCollection */
/* loaded from: classes8.dex */
public class Pre2PostRecommendPackageSubmitCollection implements Parcelable {
    public static final Parcelable.Creator<Pre2PostRecommendPackageSubmitCollection> CREATOR = new C14233a();
    @SerializedName("idCard")
    private Pre2PostIdCardCollection idCard;
    @SerializedName("idDocumentType")
    private String idDocumentType;
    @SerializedName("isSmartCardData")
    private String isSmartCardData;
    @SerializedName("mailingAddress")
    private MailingAddressCollection mailingAddress;
    @SerializedName("mrtrConsentId")
    private int mrtrConsentId;
    @SerializedName("otp")
    private String otp;
    @SerializedName("package")
    private PackageItem packageItem;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    private String subscriberNumber;
    @SerializedName("withDevice")
    private Boolean withDevice;

    /* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.recommend.response.Pre2PostRecommendPackageSubmitCollection$a */
    /* loaded from: classes8.dex */
    public class C14233a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Pre2PostRecommendPackageSubmitCollection createFromParcel(Parcel parcel) {
            return new Pre2PostRecommendPackageSubmitCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Pre2PostRecommendPackageSubmitCollection[] newArray(int i) {
            return new Pre2PostRecommendPackageSubmitCollection[i];
        }
    }

    public Pre2PostRecommendPackageSubmitCollection(String str, PackageItem packageItem, String str2, String str3, Pre2PostIdCardCollection pre2PostIdCardCollection, MailingAddressCollection mailingAddressCollection, String str4, Boolean bool) {
        this.otp = str;
        this.packageItem = packageItem;
        this.subscriberNumber = str2;
        this.isSmartCardData = str3;
        this.idCard = pre2PostIdCardCollection;
        this.mailingAddress = mailingAddressCollection;
        this.idDocumentType = str4;
        this.withDevice = bool;
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

    public MailingAddressCollection getMailingAddress() {
        return this.mailingAddress;
    }

    public int getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    public String getOtp() {
        return this.otp;
    }

    public PackageItem getPackageItem() {
        return this.packageItem;
    }

    public String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public void setMrtrConsentId(int i) {
        this.mrtrConsentId = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.otp);
        parcel.writeParcelable(this.packageItem, i);
        parcel.writeString(this.subscriberNumber);
        parcel.writeString(this.isSmartCardData);
        parcel.writeParcelable(this.idCard, i);
        parcel.writeParcelable(this.mailingAddress, i);
        parcel.writeString(this.idDocumentType);
        parcel.writeInt(this.mrtrConsentId);
        Boolean bool = this.withDevice;
        if (bool == null) {
            i2 = 0;
        } else if (bool.booleanValue()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        parcel.writeByte((byte) i2);
    }

    public Pre2PostRecommendPackageSubmitCollection(Parcel parcel) {
        Boolean valueOf;
        this.otp = parcel.readString();
        this.packageItem = (PackageItem) parcel.readParcelable(PackageItem.class.getClassLoader());
        this.subscriberNumber = parcel.readString();
        this.isSmartCardData = parcel.readString();
        this.idCard = (Pre2PostIdCardCollection) parcel.readParcelable(Pre2PostIdCardCollection.class.getClassLoader());
        this.mailingAddress = (MailingAddressCollection) parcel.readParcelable(MailingAddressCollection.class.getClassLoader());
        this.idDocumentType = parcel.readString();
        this.mrtrConsentId = parcel.readInt();
        byte readByte = parcel.readByte();
        if (readByte == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(readByte == 1);
        }
        this.withDevice = valueOf;
    }
}