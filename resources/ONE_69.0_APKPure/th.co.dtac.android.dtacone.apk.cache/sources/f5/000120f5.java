package th.p047co.dtac.android.dtacone.model.updateprepaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdateImageResponse */
/* loaded from: classes8.dex */
public class UpdateImageResponse implements Parcelable {
    public static final Parcelable.Creator<UpdateImageResponse> CREATOR = new C14261a();
    @SerializedName("filename")
    private String fileName;

    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdateImageResponse$a */
    /* loaded from: classes8.dex */
    public class C14261a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UpdateImageResponse createFromParcel(Parcel parcel) {
            return new UpdateImageResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UpdateImageResponse[] newArray(int i) {
            return new UpdateImageResponse[i];
        }
    }

    public UpdateImageResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.fileName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileName);
    }

    public UpdateImageResponse(String str) {
        this.fileName = str;
    }

    public UpdateImageResponse(Parcel parcel) {
        this.fileName = parcel.readString();
    }
}