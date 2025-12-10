package th.p047co.dtac.android.dtacone.model.change_password;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.model.BaseUserCollection;

/* renamed from: th.co.dtac.android.dtacone.model.change_password.ChangePasswordCollection */
/* loaded from: classes8.dex */
public class ChangePasswordCollection extends BaseUserCollection {
    public static final Parcelable.Creator<ChangePasswordCollection> CREATOR = new C14237a();
    @SerializedName("oldPassword")
    private String oldPassword;

    /* renamed from: th.co.dtac.android.dtacone.model.change_password.ChangePasswordCollection$a */
    /* loaded from: classes8.dex */
    public class C14237a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChangePasswordCollection createFromParcel(Parcel parcel) {
            return new ChangePasswordCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChangePasswordCollection[] newArray(int i) {
            return new ChangePasswordCollection[i];
        }
    }

    public ChangePasswordCollection() {
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOldPassword() {
        return this.oldPassword;
    }

    public void setOldPassword(String str) {
        this.oldPassword = str;
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.oldPassword);
    }

    public ChangePasswordCollection(Parcel parcel) {
        super(parcel);
        this.oldPassword = parcel.readString();
    }
}
