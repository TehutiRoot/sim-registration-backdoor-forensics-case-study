package th.p047co.dtac.android.dtacone.model.rtr_performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.SaleReportListCollection */
/* loaded from: classes8.dex */
public class SaleReportListCollection implements Parcelable {
    public static final Parcelable.Creator<SaleReportListCollection> CREATOR = new C14255a();
    @SerializedName("reports")
    private List<RtrPerformanceCollection> reports;

    /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.SaleReportListCollection$a */
    /* loaded from: classes8.dex */
    public class C14255a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SaleReportListCollection createFromParcel(Parcel parcel) {
            return new SaleReportListCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SaleReportListCollection[] newArray(int i) {
            return new SaleReportListCollection[i];
        }
    }

    public SaleReportListCollection(List<RtrPerformanceCollection> list) {
        this.reports = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RtrPerformanceCollection> getReports() {
        return this.reports;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.reports);
    }

    public SaleReportListCollection(Parcel parcel) {
        this.reports = parcel.createTypedArrayList(RtrPerformanceCollection.CREATOR);
    }
}