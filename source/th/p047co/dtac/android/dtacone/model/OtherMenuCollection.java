package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;

/* renamed from: th.co.dtac.android.dtacone.model.OtherMenuCollection */
/* loaded from: classes8.dex */
public class OtherMenuCollection implements Parcelable {
    public static final Parcelable.Creator<OtherMenuCollection> CREATOR = new C14228a();
    private int iconLeft;
    private int iconRight;
    private String section;
    private String subTitle;
    private String titleSetting;

    /* renamed from: th.co.dtac.android.dtacone.model.OtherMenuCollection$a */
    /* loaded from: classes8.dex */
    public class C14228a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public OtherMenuCollection createFromParcel(Parcel parcel) {
            return new OtherMenuCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public OtherMenuCollection[] newArray(int i) {
            return new OtherMenuCollection[i];
        }
    }

    public OtherMenuCollection(@DrawableRes int i, String str) {
        this.iconLeft = i;
        this.titleSetting = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getIconLeft() {
        return this.iconLeft;
    }

    public int getIconRight() {
        return this.iconRight;
    }

    public String getSection() {
        return this.section;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitleSetting() {
        return this.titleSetting;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.iconLeft);
        parcel.writeInt(this.iconRight);
        parcel.writeString(this.titleSetting);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.section);
    }

    public OtherMenuCollection(@DrawableRes int i, String str, String str2) {
        this.iconLeft = i;
        this.titleSetting = str;
        this.subTitle = str2;
    }

    public OtherMenuCollection(@DrawableRes int i, String str, @DrawableRes int i2) {
        this.iconLeft = i;
        this.titleSetting = str;
        this.iconRight = i2;
    }

    public OtherMenuCollection(String str) {
        this.section = str;
    }

    public OtherMenuCollection(Parcel parcel) {
        this.iconLeft = parcel.readInt();
        this.iconRight = parcel.readInt();
        this.titleSetting = parcel.readString();
        this.subTitle = parcel.readString();
        this.section = parcel.readString();
    }
}
