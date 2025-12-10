package th.p047co.dtac.android.dtacone.model.p2post.validate;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: th.co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection */
/* loaded from: classes8.dex */
public class BirthDayCollection implements Parcelable {
    public static final Parcelable.Creator<BirthDayCollection> CREATOR = new C14234a();
    private int day;
    private int month;
    private int year;

    /* renamed from: th.co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection$a */
    /* loaded from: classes8.dex */
    public class C14234a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BirthDayCollection createFromParcel(Parcel parcel) {
            return new BirthDayCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BirthDayCollection[] newArray(int i) {
            return new BirthDayCollection[i];
        }
    }

    public BirthDayCollection(int i, int i2, int i3) {
        this.day = i;
        this.month = i2;
        this.year = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.day);
        parcel.writeInt(this.month);
        parcel.writeInt(this.year);
    }

    public BirthDayCollection(Parcel parcel) {
        this.day = parcel.readInt();
        this.month = parcel.readInt();
        this.year = parcel.readInt();
    }
}