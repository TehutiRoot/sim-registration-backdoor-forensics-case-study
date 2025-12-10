package th.p047co.dtac.android.dtacone.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* renamed from: th.co.dtac.android.dtacone.model.stv.StvCollection */
/* loaded from: classes8.dex */
public class StvCollection implements Parcelable {
    public static final Parcelable.Creator<StvCollection> CREATOR = new C14259a();
    @SerializedName("descriptions")
    private Map<Integer, String> description;
    @SerializedName("marketDescription")
    private String marketDesc;
    @SerializedName("packageCode")
    private String packageCode;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
    private String packageName;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private int price;
    @SerializedName("ussdServiceCode")
    private String ussdServiceCode;

    /* renamed from: th.co.dtac.android.dtacone.model.stv.StvCollection$a */
    /* loaded from: classes8.dex */
    public class C14259a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public StvCollection createFromParcel(Parcel parcel) {
            return new StvCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public StvCollection[] newArray(int i) {
            return new StvCollection[i];
        }
    }

    public StvCollection(String str, String str2, String str3, String str4, int i, Map<Integer, String> map) {
        this.packageCode = str;
        this.packageName = str2;
        this.ussdServiceCode = str3;
        this.marketDesc = str4;
        this.price = i;
        this.description = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<Integer, String> getDescription() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int i) {
        this.price = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageCode);
        parcel.writeString(this.packageName);
        parcel.writeString(this.ussdServiceCode);
        parcel.writeString(this.marketDesc);
        parcel.writeInt(this.price);
    }

    public StvCollection(Parcel parcel) {
        this.packageCode = parcel.readString();
        this.packageName = parcel.readString();
        this.ussdServiceCode = parcel.readString();
        this.marketDesc = parcel.readString();
        this.price = parcel.readInt();
    }
}