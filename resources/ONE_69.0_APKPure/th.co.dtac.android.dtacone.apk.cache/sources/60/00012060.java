package th.p047co.dtac.android.dtacone.model.rtr_performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RtrPerformanceCollection */
/* loaded from: classes8.dex */
public class RtrPerformanceCollection implements Parcelable {
    public static final Parcelable.Creator<RtrPerformanceCollection> CREATOR = new C14254a();
    @SerializedName("data")
    private SaleReportDataCollection[] data;
    @SerializedName("description")
    private String description;
    @SerializedName("reports")
    private List<RtrPerformanceCollection> reports;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    private String title;
    @SerializedName("type")
    private String type;

    /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RtrPerformanceCollection$a */
    /* loaded from: classes8.dex */
    public class C14254a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RtrPerformanceCollection createFromParcel(Parcel parcel) {
            return new RtrPerformanceCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RtrPerformanceCollection[] newArray(int i) {
            return new RtrPerformanceCollection[i];
        }
    }

    public RtrPerformanceCollection(String str, String str2, SaleReportDataCollection[] saleReportDataCollectionArr, String str3, List<RtrPerformanceCollection> list) {
        this.type = str;
        this.title = str2;
        this.data = saleReportDataCollectionArr;
        this.description = str3;
        this.reports = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SaleReportDataCollection[] getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public List<RtrPerformanceCollection> getReports() {
        return this.reports;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeTypedArray(this.data, i);
        parcel.writeString(this.description);
        parcel.writeTypedList(this.reports);
    }

    /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RtrPerformanceCollection$SaleReportDataCollection */
    /* loaded from: classes8.dex */
    public static class SaleReportDataCollection implements Parcelable {
        public static final Parcelable.Creator<SaleReportDataCollection> CREATOR = new C14253a();
        @SerializedName(MessageBundle.TITLE_ENTRY)
        private String title;
        @SerializedName("value")
        private String value;

        /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.RtrPerformanceCollection$SaleReportDataCollection$a */
        /* loaded from: classes8.dex */
        public class C14253a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SaleReportDataCollection createFromParcel(Parcel parcel) {
                return new SaleReportDataCollection(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SaleReportDataCollection[] newArray(int i) {
                return new SaleReportDataCollection[i];
            }
        }

        public SaleReportDataCollection(String str, String str2) {
            this.title = str;
            this.value = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getTitle() {
            return this.title;
        }

        public String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.value);
        }

        public SaleReportDataCollection(Parcel parcel) {
            this.title = parcel.readString();
            this.value = parcel.readString();
        }
    }

    public RtrPerformanceCollection(Parcel parcel) {
        this.type = parcel.readString();
        this.title = parcel.readString();
        this.data = (SaleReportDataCollection[]) parcel.createTypedArray(SaleReportDataCollection.CREATOR);
        this.description = parcel.readString();
        this.reports = parcel.createTypedArrayList(CREATOR);
    }
}