package th.p047co.dtac.android.dtacone.model.rtr_performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RetailerProfileCollection */
/* loaded from: classes8.dex */
public class RetailerProfileCollection implements Parcelable {
    public static final Parcelable.Creator<RetailerProfileCollection> CREATOR = new C14252a();
    @SerializedName("areaSaleManagerSaleRefill")
    private ContactPersonCollection areaSaleManagerSaleRefill;
    @SerializedName("areaSaleManagerSaleSim")
    private ContactPersonCollection areaSaleManagerSaleSim;
    @SerializedName("bankAccount")
    private String bankAccount;
    @SerializedName("bankAccountName")
    private String bankAccountName;
    @SerializedName("bankName")
    private String bankName;
    @SerializedName("beneficiaryMobileNumber")
    private String beneficiaryMobileNumber;
    @SerializedName("commissionType")
    private String commissionType;
    @SerializedName("contactPerson")
    private ContactPersonCollection contactPerson;
    @SerializedName("dtrCode")
    private String dtrCode;
    @SerializedName("dtrName")
    private String dtrName;
    @SerializedName("rtrAddress")
    private String rtrAddress;
    @SerializedName("rtrCode")
    private String rtrCode;
    @SerializedName("rtrName")
    private String rtrName;

    /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RetailerProfileCollection$a */
    /* loaded from: classes8.dex */
    public class C14252a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RetailerProfileCollection createFromParcel(Parcel parcel) {
            return new RetailerProfileCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RetailerProfileCollection[] newArray(int i) {
            return new RetailerProfileCollection[i];
        }
    }

    public RetailerProfileCollection(String str, String str2, String str3, String str4, String str5, ContactPersonCollection contactPersonCollection, ContactPersonCollection contactPersonCollection2, ContactPersonCollection contactPersonCollection3, String str6, String str7, String str8, String str9, String str10) {
        this.rtrName = str;
        this.rtrCode = str2;
        this.rtrAddress = str3;
        this.dtrName = str4;
        this.dtrCode = str5;
        this.areaSaleManagerSaleSim = contactPersonCollection;
        this.areaSaleManagerSaleRefill = contactPersonCollection2;
        this.contactPerson = contactPersonCollection3;
        this.commissionType = str6;
        this.bankAccount = str7;
        this.bankAccountName = str8;
        this.bankName = str9;
        this.beneficiaryMobileNumber = str10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ContactPersonCollection getAreaSaleManagerSaleRefill() {
        return this.areaSaleManagerSaleRefill;
    }

    public ContactPersonCollection getAreaSaleManagerSaleSim() {
        return this.areaSaleManagerSaleSim;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getBeneficiaryMobileNumber() {
        return this.beneficiaryMobileNumber;
    }

    public String getCommissionType() {
        return this.commissionType;
    }

    public ContactPersonCollection getContactPerson() {
        return this.contactPerson;
    }

    public String getDtrCode() {
        return this.dtrCode;
    }

    public String getDtrName() {
        return this.dtrName;
    }

    public String getRtrAddress() {
        return this.rtrAddress;
    }

    public String getRtrCode() {
        return this.rtrCode;
    }

    public String getRtrName() {
        return this.rtrName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.rtrName);
        parcel.writeString(this.rtrCode);
        parcel.writeString(this.rtrAddress);
        parcel.writeString(this.dtrName);
        parcel.writeString(this.dtrCode);
        parcel.writeParcelable(this.areaSaleManagerSaleSim, i);
        parcel.writeParcelable(this.areaSaleManagerSaleRefill, i);
        parcel.writeParcelable(this.contactPerson, i);
        parcel.writeString(this.commissionType);
        parcel.writeString(this.bankAccount);
        parcel.writeString(this.bankAccountName);
        parcel.writeString(this.bankName);
        parcel.writeString(this.beneficiaryMobileNumber);
    }

    /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RetailerProfileCollection$ContactPersonCollection */
    /* loaded from: classes8.dex */
    public static class ContactPersonCollection implements Parcelable {
        public static final Parcelable.Creator<ContactPersonCollection> CREATOR = new C14251a();
        @SerializedName("code")
        private String code;
        @SerializedName("mobileNumber")
        private String mobileNumber;
        @SerializedName("name")
        private String name;

        /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RetailerProfileCollection$ContactPersonCollection$a */
        /* loaded from: classes8.dex */
        public class C14251a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ContactPersonCollection createFromParcel(Parcel parcel) {
                return new ContactPersonCollection(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ContactPersonCollection[] newArray(int i) {
                return new ContactPersonCollection[i];
            }
        }

        public ContactPersonCollection(String str, String str2, String str3) {
            this.code = str;
            this.name = str2;
            this.mobileNumber = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getCode() {
            return this.code;
        }

        public String getMobileNumber() {
            return this.mobileNumber;
        }

        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.code);
            parcel.writeString(this.name);
            parcel.writeString(this.mobileNumber);
        }

        public ContactPersonCollection(Parcel parcel) {
            this.code = parcel.readString();
            this.name = parcel.readString();
            this.mobileNumber = parcel.readString();
        }
    }

    public RetailerProfileCollection(Parcel parcel) {
        this.rtrName = parcel.readString();
        this.rtrCode = parcel.readString();
        this.rtrAddress = parcel.readString();
        this.dtrName = parcel.readString();
        this.dtrCode = parcel.readString();
        this.areaSaleManagerSaleSim = (ContactPersonCollection) parcel.readParcelable(ContactPersonCollection.class.getClassLoader());
        this.areaSaleManagerSaleRefill = (ContactPersonCollection) parcel.readParcelable(ContactPersonCollection.class.getClassLoader());
        this.contactPerson = (ContactPersonCollection) parcel.readParcelable(ContactPersonCollection.class.getClassLoader());
        this.commissionType = parcel.readString();
        this.bankAccount = parcel.readString();
        this.bankAccountName = parcel.readString();
        this.bankName = parcel.readString();
        this.beneficiaryMobileNumber = parcel.readString();
    }
}