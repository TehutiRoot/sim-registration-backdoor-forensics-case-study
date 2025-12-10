package th.p047co.dtac.android.dtacone.model.staff;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.model.BaseUserCollection;

/* renamed from: th.co.dtac.android.dtacone.model.staff.AddNewStaffCollection */
/* loaded from: classes8.dex */
public class AddNewStaffCollection extends BaseUserCollection {
    public static final Parcelable.Creator<AddNewStaffCollection> CREATOR = new C14256a();
    @SerializedName("name")
    private String name;

    /* renamed from: th.co.dtac.android.dtacone.model.staff.AddNewStaffCollection$a */
    /* loaded from: classes8.dex */
    public class C14256a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AddNewStaffCollection createFromParcel(Parcel parcel) {
            return new AddNewStaffCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AddNewStaffCollection[] newArray(int i) {
            return new AddNewStaffCollection[i];
        }
    }

    public AddNewStaffCollection() {
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public AddNewStaffCollection(Parcel parcel) {
        super(parcel);
    }
}