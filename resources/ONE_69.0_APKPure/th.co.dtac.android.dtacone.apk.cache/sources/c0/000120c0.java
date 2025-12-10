package th.p047co.dtac.android.dtacone.model.topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;

/* renamed from: th.co.dtac.android.dtacone.model.topup.BalanceCollection */
/* loaded from: classes8.dex */
public class BalanceCollection implements Parcelable {
    public static final Parcelable.Creator<BalanceCollection> CREATOR = new C14260a();
    @SerializedName("balance")
    private String balance;
    private ErrorCollection error;
    @SerializedName("lastUpdate")
    private String lastUpdate;

    /* renamed from: th.co.dtac.android.dtacone.model.topup.BalanceCollection$a */
    /* loaded from: classes8.dex */
    public class C14260a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BalanceCollection createFromParcel(Parcel parcel) {
            return new BalanceCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BalanceCollection[] newArray(int i) {
            return new BalanceCollection[i];
        }
    }

    public BalanceCollection(Parcel parcel) {
        this.balance = parcel.readString();
        this.lastUpdate = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBalance() {
        return this.balance;
    }

    public ErrorCollection getError() {
        return this.error;
    }

    public String getLastUpdate() {
        return this.lastUpdate;
    }

    public void setBalance(String str) {
        this.balance = str;
    }

    public void setError(ErrorCollection errorCollection) {
        this.error = errorCollection;
    }

    public void setLastUpdate(String str) {
        this.lastUpdate = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.balance);
        parcel.writeString(this.lastUpdate);
    }

    public BalanceCollection() {
    }

    public BalanceCollection(String str, String str2) {
        this.balance = str;
        this.lastUpdate = str2;
    }
}