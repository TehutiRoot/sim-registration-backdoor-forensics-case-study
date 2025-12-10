package th.p047co.dtac.android.dtacone.model.staff;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.staff.StaffListCollection */
/* loaded from: classes8.dex */
public class StaffListCollection implements Parcelable {
    public static final Parcelable.Creator<StaffListCollection> CREATOR = new C14258a();
    private transient int limit;
    private transient String message;
    @SerializedName("staffs")
    private List<StaffCollection> staffs;

    /* renamed from: th.co.dtac.android.dtacone.model.staff.StaffListCollection$a */
    /* loaded from: classes8.dex */
    public class C14258a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public StaffListCollection createFromParcel(Parcel parcel) {
            return new StaffListCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public StaffListCollection[] newArray(int i) {
            return new StaffListCollection[i];
        }
    }

    public StaffListCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLimit() {
        return this.limit;
    }

    public String getMessage() {
        return this.message;
    }

    public List<StaffCollection> getStaffs() {
        return this.staffs;
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.staffs);
    }

    public StaffListCollection(Parcel parcel) {
        this.staffs = parcel.createTypedArrayList(StaffCollection.CREATOR);
    }
}