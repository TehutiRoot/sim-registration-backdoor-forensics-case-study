package io.opencensus.stats;

import io.opencensus.stats.Measure;
import io.opencensus.stats.Measurement;

/* renamed from: io.opencensus.stats.o */
/* loaded from: classes5.dex */
public final class C10655o extends Measurement.MeasurementDouble {

    /* renamed from: a */
    public final Measure.MeasureDouble f63625a;

    /* renamed from: b */
    public final double f63626b;

    public C10655o(Measure.MeasureDouble measureDouble, double d) {
        if (measureDouble != null) {
            this.f63625a = measureDouble;
            this.f63626b = d;
            return;
        }
        throw new NullPointerException("Null measure");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Measurement.MeasurementDouble)) {
            return false;
        }
        Measurement.MeasurementDouble measurementDouble = (Measurement.MeasurementDouble) obj;
        if (this.f63625a.equals(measurementDouble.getMeasure()) && Double.doubleToLongBits(this.f63626b) == Double.doubleToLongBits(measurementDouble.getValue())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.Measurement.MeasurementDouble
    public double getValue() {
        return this.f63626b;
    }

    public int hashCode() {
        return (int) (((this.f63625a.hashCode() ^ 1000003) * 1000003) ^ ((Double.doubleToLongBits(this.f63626b) >>> 32) ^ Double.doubleToLongBits(this.f63626b)));
    }

    public String toString() {
        return "MeasurementDouble{measure=" + this.f63625a + ", value=" + this.f63626b + "}";
    }

    @Override // io.opencensus.stats.Measurement.MeasurementDouble, io.opencensus.stats.Measurement
    public Measure.MeasureDouble getMeasure() {
        return this.f63625a;
    }
}
