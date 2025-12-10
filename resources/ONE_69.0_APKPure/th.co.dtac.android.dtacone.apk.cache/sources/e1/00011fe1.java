package th.p047co.dtac.android.dtacone.model.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostpaidPackageGroupCollection */
/* loaded from: classes8.dex */
public class PostpaidPackageGroupCollection implements Parcelable {
    public static final Parcelable.Creator<PostpaidPackageGroupCollection> CREATOR = new C14242a();
    private String groupName;
    private ArrayList<Object> packageSets;

    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostpaidPackageGroupCollection$a */
    /* loaded from: classes8.dex */
    public class C14242a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PostpaidPackageGroupCollection createFromParcel(Parcel parcel) {
            return new PostpaidPackageGroupCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PostpaidPackageGroupCollection[] newArray(int i) {
            return new PostpaidPackageGroupCollection[i];
        }
    }

    public PostpaidPackageGroupCollection(String str, ArrayList<Object> arrayList) {
        this.groupName = str;
        this.packageSets = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.groupName);
        parcel.writeList(this.packageSets);
    }

    public PostpaidPackageGroupCollection(Parcel parcel) {
        this.groupName = parcel.readString();
        ArrayList<Object> arrayList = new ArrayList<>();
        this.packageSets = arrayList;
        parcel.readList(arrayList, Object.class.getClassLoader());
    }
}