package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.RrtProfileCollection */
/* loaded from: classes8.dex */
public class RrtProfileCollection implements Parcelable {
    public static final Parcelable.Creator<RrtProfileCollection> CREATOR = new C14231a();
    @SerializedName("dtrCode")
    private String dtrCode;
    @SerializedName("id")

    /* renamed from: id */
    private Long f85038id;
    @SerializedName("rtrName")
    private String name;
    @SerializedName("rtrCode")
    private String rtrCode;
    @SerializedName("simr")
    private String simrNumber;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;
    @SerializedName("userType")
    private String userType;

    /* renamed from: th.co.dtac.android.dtacone.model.RrtProfileCollection$a */
    /* loaded from: classes8.dex */
    public class C14231a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RrtProfileCollection createFromParcel(Parcel parcel) {
            return new RrtProfileCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RrtProfileCollection[] newArray(int i) {
            return new RrtProfileCollection[i];
        }
    }

    public RrtProfileCollection(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f85038id = l;
        this.simrNumber = str;
        this.name = str2;
        this.rtrCode = str3;
        this.dtrCode = str4;
        this.status = str5;
        this.userType = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDtrCode() {
        return this.dtrCode;
    }

    public Long getId() {
        return this.f85038id;
    }

    public String getName() {
        return this.name;
    }

    public String getRtrCode() {
        return this.rtrCode;
    }

    public String getSimrNumber() {
        return this.simrNumber;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setDtrCode(String str) {
        this.dtrCode = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRtrCode(String str) {
        this.rtrCode = str;
    }

    public void setSimrNumber(String str) {
        this.simrNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f85038id);
        parcel.writeString(this.simrNumber);
        parcel.writeString(this.name);
        parcel.writeString(this.rtrCode);
        parcel.writeString(this.dtrCode);
        parcel.writeString(this.status);
        parcel.writeString(this.userType);
    }

    public RrtProfileCollection(Parcel parcel) {
        this.f85038id = (Long) parcel.readSerializable();
        this.simrNumber = parcel.readString();
        this.name = parcel.readString();
        this.rtrCode = parcel.readString();
        this.dtrCode = parcel.readString();
        this.status = parcel.readString();
        this.userType = parcel.readString();
    }
}
