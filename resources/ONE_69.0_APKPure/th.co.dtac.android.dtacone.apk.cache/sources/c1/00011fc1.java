package th.p047co.dtac.android.dtacone.model.permission;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.permission.Permission */
/* loaded from: classes8.dex */
public class Permission implements Parcelable {
    public static final Parcelable.Creator<Permission> CREATOR = new C14235a();
    @SerializedName("allow")
    private String allow;
    @SerializedName("description")
    private String description;
    @SerializedName("name")
    private String name;

    /* renamed from: th.co.dtac.android.dtacone.model.permission.Permission$a */
    /* loaded from: classes8.dex */
    public class C14235a implements Parcelable.Creator {
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

    public Permission(String str, String str2, String str3) {
        this.name = str;
        this.description = str2;
        this.allow = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAllow() {
        return this.allow;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAllow() {
        return this.allow.equalsIgnoreCase("Y");
    }

    public void setAllow(String str) {
        this.allow = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.allow);
    }

    public void setAllow(boolean z) {
        if (z) {
            this.allow = "Y";
        } else {
            this.allow = "N";
        }
    }

    public Permission(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.allow = parcel.readString();
    }
}