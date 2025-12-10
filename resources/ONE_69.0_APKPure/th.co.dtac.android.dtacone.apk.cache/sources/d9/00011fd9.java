package th.p047co.dtac.android.dtacone.model.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostcodeResponseCollection */
/* loaded from: classes8.dex */
public class PostcodeResponseCollection implements Parcelable {
    public static final Parcelable.Creator<PostcodeResponseCollection> CREATOR = new C14241a();
    @SerializedName("data")
    List<Postcode> postcodes;

    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostcodeResponseCollection$a */
    /* loaded from: classes8.dex */
    public class C14241a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PostcodeResponseCollection createFromParcel(Parcel parcel) {
            return new PostcodeResponseCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PostcodeResponseCollection[] newArray(int i) {
            return new PostcodeResponseCollection[i];
        }
    }

    public PostcodeResponseCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Postcode> getPostcodes() {
        return this.postcodes;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.postcodes);
    }

    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostcodeResponseCollection$Postcode */
    /* loaded from: classes8.dex */
    public class Postcode implements Parcelable {
        public final Parcelable.Creator<Postcode> CREATOR = new C14240a();
        @SerializedName("postcode")
        private String postcode;
        @SerializedName("postcodeSeq")
        private String postcodeSeq;

        /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostcodeResponseCollection$Postcode$a */
        /* loaded from: classes8.dex */
        public class C14240a implements Parcelable.Creator {
            public C14240a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Postcode createFromParcel(Parcel parcel) {
                return new Postcode(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Postcode[] newArray(int i) {
                return new Postcode[i];
            }
        }

        public Postcode() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getPostcode() {
            return this.postcode;
        }

        public String getPostcodeSeq() {
            return this.postcodeSeq;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.postcodeSeq);
            parcel.writeString(this.postcode);
        }

        public Postcode(Parcel parcel) {
            this.postcodeSeq = parcel.readString();
            this.postcode = parcel.readString();
        }
    }

    public PostcodeResponseCollection(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.postcodes = arrayList;
        parcel.readList(arrayList, Postcode.class.getClassLoader());
    }
}