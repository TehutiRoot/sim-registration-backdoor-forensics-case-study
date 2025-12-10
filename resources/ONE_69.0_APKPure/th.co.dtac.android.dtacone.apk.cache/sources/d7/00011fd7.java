package th.p047co.dtac.android.dtacone.model.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostcodeRequestCollection */
/* loaded from: classes8.dex */
public class PostcodeRequestCollection implements Parcelable {
    public static final Parcelable.Creator<PostcodeRequestCollection> CREATOR = new C14239a();
    @SerializedName("amphur")
    private String amphur;
    @SerializedName("province")
    private String province;

    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostcodeRequestCollection$a */
    /* loaded from: classes8.dex */
    public class C14239a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PostcodeRequestCollection createFromParcel(Parcel parcel) {
            return new PostcodeRequestCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PostcodeRequestCollection[] newArray(int i) {
            return new PostcodeRequestCollection[i];
        }
    }

    public PostcodeRequestCollection(String str, String str2) {
        this.amphur = str;
        this.province = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAmphur() {
        return this.amphur;
    }

    public String getProvince() {
        return this.province;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.amphur);
        parcel.writeString(this.province);
    }

    public PostcodeRequestCollection() {
    }

    public PostcodeRequestCollection(Parcel parcel) {
        this.amphur = parcel.readString();
        this.province = parcel.readString();
    }
}