package th.p047co.dtac.android.dtacone.model.register;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.register.SimRListCollection */
/* loaded from: classes8.dex */
public class SimRListCollection implements Parcelable {
    public static final Parcelable.Creator<SimRListCollection> CREATOR = new C14250a();
    @SerializedName("simRList")
    private List<String> simRList;

    /* renamed from: th.co.dtac.android.dtacone.model.register.SimRListCollection$a */
    /* loaded from: classes8.dex */
    public class C14250a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SimRListCollection createFromParcel(Parcel parcel) {
            return new SimRListCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SimRListCollection[] newArray(int i) {
            return new SimRListCollection[i];
        }
    }

    public SimRListCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getSimRList() {
        return this.simRList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.simRList);
    }

    public SimRListCollection(Parcel parcel) {
        this.simRList = parcel.createStringArrayList();
    }
}