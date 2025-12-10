package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.ForgotPasswordCollection */
/* loaded from: classes8.dex */
public class ForgotPasswordCollection extends BaseUserCollection {
    public static final Parcelable.Creator<ForgotPasswordCollection> CREATOR = new C14216a();
    @SerializedName("event")
    private String event;

    /* renamed from: th.co.dtac.android.dtacone.model.ForgotPasswordCollection$a */
    /* loaded from: classes8.dex */
    public class C14216a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ForgotPasswordCollection createFromParcel(Parcel parcel) {
            return new ForgotPasswordCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ForgotPasswordCollection[] newArray(int i) {
            return new ForgotPasswordCollection[i];
        }
    }

    public ForgotPasswordCollection(String str, String str2, String str3, String str4) {
        this.phoneNumber = str;
        this.password = str2;
        this.confirmPassword = str3;
        this.event = str4;
    }

    @Override // th.p047co.dtac.android.dtacone.model.BaseUserCollection, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ForgotPasswordCollection(String str, String str2) {
        this.password = str;
        this.confirmPassword = str2;
    }

    public ForgotPasswordCollection(Parcel parcel) {
        this.phoneNumber = parcel.readString();
        this.password = parcel.readString();
        this.event = parcel.readString();
    }
}