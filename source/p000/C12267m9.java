package p000;

import io.opencensus.common.Timestamp;
import io.opencensus.metrics.export.TimeSeries;
import java.util.List;

/* renamed from: m9 */
/* loaded from: classes5.dex */
public final class C12267m9 extends TimeSeries {

    /* renamed from: a */
    public final List f71826a;

    /* renamed from: b */
    public final List f71827b;

    /* renamed from: c */
    public final Timestamp f71828c;

    public C12267m9(List list, List list2, Timestamp timestamp) {
        if (list != null) {
            this.f71826a = list;
            if (list2 != null) {
                this.f71827b = list2;
                this.f71828c = timestamp;
                return;
            }
            throw new NullPointerException("Null points");
        }
        throw new NullPointerException("Null labelValues");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeSeries)) {
            return false;
        }
        TimeSeries timeSeries = (TimeSeries) obj;
        if (this.f71826a.equals(timeSeries.getLabelValues()) && this.f71827b.equals(timeSeries.getPoints())) {
            Timestamp timestamp = this.f71828c;
            if (timestamp == null) {
                if (timeSeries.getStartTimestamp() == null) {
                    return true;
                }
            } else if (timestamp.equals(timeSeries.getStartTimestamp())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.TimeSeries
    public List getLabelValues() {
        return this.f71826a;
    }

    @Override // io.opencensus.metrics.export.TimeSeries
    public List getPoints() {
        return this.f71827b;
    }

    @Override // io.opencensus.metrics.export.TimeSeries
    public Timestamp getStartTimestamp() {
        return this.f71828c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f71826a.hashCode() ^ 1000003) * 1000003) ^ this.f71827b.hashCode()) * 1000003;
        Timestamp timestamp = this.f71828c;
        if (timestamp == null) {
            hashCode = 0;
        } else {
            hashCode = timestamp.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "TimeSeries{labelValues=" + this.f71826a + ", points=" + this.f71827b + ", startTimestamp=" + this.f71828c + "}";
    }
}
