package th.p047co.dtac.android.dtacone.model.updateprepaid;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidPhotoList */
/* loaded from: classes8.dex */
public class UpdatePrepaidPhotoList implements Parcelable {
    public static final Parcelable.Creator<UpdatePrepaidPhotoList> CREATOR = new C14262a();
    private String cardType;

    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidPhotoList$a */
    /* loaded from: classes8.dex */
    public class C14262a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UpdatePrepaidPhotoList createFromParcel(Parcel parcel) {
            return new UpdatePrepaidPhotoList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UpdatePrepaidPhotoList[] newArray(int i) {
            return new UpdatePrepaidPhotoList[i];
        }
    }

    public UpdatePrepaidPhotoList(String str) {
        this.cardType = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardType() {
        return this.cardType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardType);
    }

    public UpdatePrepaidPhotoList(Parcel parcel) {
        this.cardType = parcel.readString();
    }
}