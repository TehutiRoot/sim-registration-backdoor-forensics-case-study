package io.opencensus.stats;

import io.opencensus.stats.Measure;
import io.opencensus.stats.Measurement;

/* renamed from: io.opencensus.stats.p */
/* loaded from: classes5.dex */
public final class C10656p extends Measurement.MeasurementLong {

    /* renamed from: a */
    public final Measure.MeasureLong f63627a;

    /* renamed from: b */
    public final long f63628b;

    public C10656p(Measure.MeasureLong measureLong, long j) {
        if (measureLong != null) {
            this.f63627a = measureLong;
            this.f63628b = j;
            return;
        }
        throw new NullPointerException("Null measure");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Measurement.MeasurementLong)) {
            return false;
        }
        Measurement.MeasurementLong measurementLong = (Measurement.MeasurementLong) obj;
        if (this.f63627a.equals(measurementLong.getMeasure()) && this.f63628b == measurementLong.getValue()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.Measurement.MeasurementLong
    public long getValue() {
        return this.f63628b;
    }

    public int hashCode() {
        long j = this.f63628b;
        return (int) (((this.f63627a.hashCode() ^ 1000003) * 1000003) ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MeasurementLong{measure=" + this.f63627a + ", value=" + this.f63628b + "}";
    }

    @Override // io.opencensus.stats.Measurement.MeasurementLong, io.opencensus.stats.Measurement
    public Measure.MeasureLong getMeasure() {
        return this.f63627a;
    }
}
