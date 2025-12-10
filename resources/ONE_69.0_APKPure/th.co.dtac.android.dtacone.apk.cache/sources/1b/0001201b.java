package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidPostcodeListCollection */
/* loaded from: classes8.dex */
public class PrepaidPostcodeListCollection implements Parcelable {
    public static final Parcelable.Creator<PrepaidPostcodeListCollection> CREATOR = new C14246a();
    @SerializedName("data")
    private List<CardInformationCollection> data;

    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidPostcodeListCollection$a */
    /* loaded from: classes8.dex */
    public class C14246a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrepaidPostcodeListCollection createFromParcel(Parcel parcel) {
            return new PrepaidPostcodeListCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrepaidPostcodeListCollection[] newArray(int i) {
            return new PrepaidPostcodeListCollection[i];
        }
    }

    public PrepaidPostcodeListCollection(List<CardInformationCollection> list) {
        this.data = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<CardInformationCollection> getData() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.data);
    }

    public PrepaidPostcodeListCollection(Parcel parcel) {
        this.data = parcel.createTypedArrayList(CardInformationCollection.CREATOR);
    }
}