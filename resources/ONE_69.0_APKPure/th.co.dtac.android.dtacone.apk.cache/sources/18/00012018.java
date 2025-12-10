package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

/* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidImage */
/* loaded from: classes8.dex */
public class PrepaidImage implements Parcelable {
    public static final Parcelable.Creator<PrepaidImage> CREATOR = new C14245a();
    @SerializedName("filename")
    private String fileName;
    @SerializedName(ResponseProcessor.CONTENT_TYPE_IMAGE)
    private String imageUpload;
    @SerializedName("simcardNumber")
    private String simCardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    private String subscriberNumber;

    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidImage$a */
    /* loaded from: classes8.dex */
    public class C14245a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrepaidImage createFromParcel(Parcel parcel) {
            return new PrepaidImage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrepaidImage[] newArray(int i) {
            return new PrepaidImage[i];
        }
    }

    public PrepaidImage(String str, String str2, String str3) {
        this.imageUpload = str;
        this.subscriberNumber = str2;
        this.simCardNumber = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getImageUpload() {
        return this.imageUpload;
    }

    public String getSimCardNumber() {
        return this.simCardNumber;
    }

    public String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public void setSimCardNumber(String str) {
        this.simCardNumber = str;
    }

    public void setSubscriberNumber(String str) {
        this.subscriberNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageUpload);
        parcel.writeString(this.subscriberNumber);
        parcel.writeString(this.simCardNumber);
        parcel.writeString(this.fileName);
    }

    public PrepaidImage(Parcel parcel) {
        this.imageUpload = parcel.readString();
        this.subscriberNumber = parcel.readString();
        this.simCardNumber = parcel.readString();
        this.fileName = parcel.readString();
    }
}