package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.PerformanceReportsCollection */
/* loaded from: classes8.dex */
public class PerformanceReportsCollection implements Parcelable {
    public static final Parcelable.Creator<PerformanceReportsCollection> CREATOR = new C14229a();
    @SerializedName("commissionAmount")
    private double commissionAmount;
    @SerializedName("dataAsOf")
    private String dataAsOf;
    @SerializedName("epinToCustomerAmount")
    private double epinToCustomerAmount;
    @SerializedName("refillToCustomerAmount")
    private double refillToCustomerAmount;
    @SerializedName("refillToRTRAmount")
    private double refillToRTRAmount;
    @SerializedName("stvToCustomerAmount")
    private double stvToCustomerAmount;

    /* renamed from: th.co.dtac.android.dtacone.model.PerformanceReportsCollection$a */
    /* loaded from: classes8.dex */
    public class C14229a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PerformanceReportsCollection createFromParcel(Parcel parcel) {
            return new PerformanceReportsCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PerformanceReportsCollection[] newArray(int i) {
            return new PerformanceReportsCollection[i];
        }
    }

    public PerformanceReportsCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getCommissionAmount() {
        return this.commissionAmount;
    }

    public String getDataAsOf() {
        return this.dataAsOf;
    }

    public double getEpinToCustomerAmount() {
        return this.epinToCustomerAmount;
    }

    public double getRefillToCustomerAmount() {
        return this.refillToCustomerAmount;
    }

    public double getRefillToRTRAmount() {
        return this.refillToRTRAmount;
    }

    public double getStvToCustomerAmount() {
        return this.stvToCustomerAmount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.dataAsOf);
        parcel.writeDouble(this.commissionAmount);
        parcel.writeDouble(this.refillToRTRAmount);
        parcel.writeDouble(this.refillToCustomerAmount);
        parcel.writeDouble(this.stvToCustomerAmount);
        parcel.writeDouble(this.epinToCustomerAmount);
    }

    public PerformanceReportsCollection(String str, double d, double d2, double d3, double d4, double d5) {
        this.dataAsOf = str;
        this.commissionAmount = d;
        this.refillToRTRAmount = d2;
        this.refillToCustomerAmount = d3;
        this.stvToCustomerAmount = d4;
        this.epinToCustomerAmount = d5;
    }

    public PerformanceReportsCollection(Parcel parcel) {
        this.dataAsOf = parcel.readString();
        this.commissionAmount = parcel.readDouble();
        this.refillToRTRAmount = parcel.readDouble();
        this.refillToCustomerAmount = parcel.readDouble();
        this.stvToCustomerAmount = parcel.readDouble();
        this.epinToCustomerAmount = parcel.readDouble();
    }
}
