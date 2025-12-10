package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.SimRInfoCollection */
/* loaded from: classes8.dex */
public class SimRInfoCollection implements Parcelable {
    public static final Parcelable.Creator<SimRInfoCollection> CREATOR = new C14232a();
    @SerializedName("userId")
    private String phoneNumber;
    @SerializedName("rtrCode")
    private String rtrCode;

    /* renamed from: th.co.dtac.android.dtacone.model.SimRInfoCollection$a */
    /* loaded from: classes8.dex */
    public class C14232a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SimRInfoCollection createFromParcel(Parcel parcel) {
            return new SimRInfoCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SimRInfoCollection[] newArray(int i) {
            return new SimRInfoCollection[i];
        }
    }

    public SimRInfoCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getRtrCode() {
        return this.rtrCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.rtrCode);
    }

    public SimRInfoCollection(String str, String str2) {
        this.phoneNumber = str;
        this.rtrCode = str2;
    }

    public SimRInfoCollection(Parcel parcel) {
        this.phoneNumber = parcel.readString();
        this.rtrCode = parcel.readString();
    }
}
