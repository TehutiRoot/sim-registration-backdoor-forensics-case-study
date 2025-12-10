package th.p047co.dtac.android.dtacone.model.permission;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.permission.SavePermissionCollection */
/* loaded from: classes8.dex */
public class SavePermissionCollection implements Parcelable {
    public static final Parcelable.Creator<SavePermissionCollection> CREATOR = new C14238a();
    @SerializedName("permissions")
    private List<Permission> permissions;
    @SerializedName("mrtrUserID")
    private Long userID;

    /* renamed from: th.co.dtac.android.dtacone.model.permission.SavePermissionCollection$a */
    /* loaded from: classes8.dex */
    public class C14238a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SavePermissionCollection createFromParcel(Parcel parcel) {
            return new SavePermissionCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SavePermissionCollection[] newArray(int i) {
            return new SavePermissionCollection[i];
        }
    }

    public SavePermissionCollection(Long l, List<Permission> list) {
        this.userID = l;
        this.permissions = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public Long getUserID() {
        return this.userID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.permissions);
    }

    /* renamed from: th.co.dtac.android.dtacone.model.permission.SavePermissionCollection$Permission */
    /* loaded from: classes8.dex */
    public static class Permission implements Parcelable {
        public static final Parcelable.Creator<Permission> CREATOR = new C14237a();
        @SerializedName("allow")
        private String allow;
        @SerializedName("name")
        private String name;

        /* renamed from: th.co.dtac.android.dtacone.model.permission.SavePermissionCollection$Permission$a */
        /* loaded from: classes8.dex */
        public class C14237a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Permission createFromParcel(Parcel parcel) {
                return new Permission(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Permission[] newArray(int i) {
                return new Permission[i];
            }
        }

        public Permission(String str, boolean z) {
            this.name = str;
            if (z) {
                this.allow = "Y";
            } else {
                this.allow = "N";
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAllow() {
            return this.allow;
        }

        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.allow);
        }

        public Permission(Parcel parcel) {
            this.name = parcel.readString();
            this.allow = parcel.readString();
        }
    }

    public SavePermissionCollection(Parcel parcel) {
        this.permissions = parcel.createTypedArrayList(Permission.CREATOR);
    }
}