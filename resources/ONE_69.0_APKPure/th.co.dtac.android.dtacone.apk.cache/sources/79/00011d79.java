package th.p047co.dtac.android.dtacone.model.change_sim;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifySim */
/* loaded from: classes8.dex */
public class ChangeSimRequestVerifySim implements Parcelable {
    public static final Parcelable.Creator<ChangeSimRequestVerifySim> CREATOR = new C14227a();
    @SerializedName("cardNumber")
    private String cardNumber;
    @SerializedName("transactionId")
    private String transactionId;

    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifySim$a */
    /* loaded from: classes8.dex */
    public class C14227a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChangeSimRequestVerifySim createFromParcel(Parcel parcel) {
            return new ChangeSimRequestVerifySim(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChangeSimRequestVerifySim[] newArray(int i) {
            return new ChangeSimRequestVerifySim[i];
        }
    }

    public ChangeSimRequestVerifySim(String str, String str2) {
        this.transactionId = str;
        this.cardNumber = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.transactionId);
        parcel.writeString(this.cardNumber);
    }

    public ChangeSimRequestVerifySim(Parcel parcel) {
        this.transactionId = parcel.readString();
        this.cardNumber = parcel.readString();
    }
}