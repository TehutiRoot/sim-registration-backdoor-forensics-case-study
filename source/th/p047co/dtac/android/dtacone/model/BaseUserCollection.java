package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.BaseUserCollection */
/* loaded from: classes8.dex */
public abstract class BaseUserCollection implements Parcelable {
    protected transient String confirmPassword;
    protected transient int maxPasswordLength;
    protected transient int minPasswordLength;
    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    protected String password;
    @SerializedName("userId")
    protected String phoneNumber;

    public BaseUserCollection() {
        this.minPasswordLength = 6;
        this.maxPasswordLength = 6;
    }

    @Override // android.os.Parcelable
    public abstract int describeContents();

    public String getConfirmPassword() {
        return this.confirmPassword;
    }

    public int getMaxPasswordLength() {
        return this.maxPasswordLength;
    }

    public int getMinPasswordLength() {
        return this.minPasswordLength;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setConfirmPassword(String str) {
        this.confirmPassword = str;
    }

    public void setMaxPasswordLength(int i) {
        this.maxPasswordLength = i;
    }

    public void setMinPasswordLength(int i) {
        this.minPasswordLength = i;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setSpecificPasswordLength(int i) {
        setMinPasswordLength(i);
        setMaxPasswordLength(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.password);
        parcel.writeString(this.confirmPassword);
        parcel.writeInt(this.minPasswordLength);
        parcel.writeInt(this.maxPasswordLength);
    }

    public BaseUserCollection(String str, String str2) {
        this.minPasswordLength = 6;
        this.maxPasswordLength = 6;
        this.password = str;
        this.confirmPassword = str2;
    }

    public BaseUserCollection(Parcel parcel) {
        this.minPasswordLength = 6;
        this.maxPasswordLength = 6;
        this.phoneNumber = parcel.readString();
        this.password = parcel.readString();
        this.confirmPassword = parcel.readString();
        this.minPasswordLength = parcel.readInt();
        this.maxPasswordLength = parcel.readInt();
    }
}
