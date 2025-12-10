package th.p047co.dtac.android.dtacone.model.permission;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.permission.PermissionResponseCollection */
/* loaded from: classes8.dex */
public class PermissionResponseCollection implements Parcelable {
    public static final Parcelable.Creator<PermissionResponseCollection> CREATOR = new C14236a();
    @SerializedName("permissions")
    private List<Permission> permissions;

    /* renamed from: th.co.dtac.android.dtacone.model.permission.PermissionResponseCollection$a */
    /* loaded from: classes8.dex */
    public class C14236a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PermissionResponseCollection createFromParcel(Parcel parcel) {
            return new PermissionResponseCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PermissionResponseCollection[] newArray(int i) {
            return new PermissionResponseCollection[i];
        }
    }

    public PermissionResponseCollection(List<Permission> list) {
        this.permissions = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.permissions);
    }

    public PermissionResponseCollection(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.permissions = arrayList;
        parcel.readList(arrayList, Permission.class.getClassLoader());
    }
}