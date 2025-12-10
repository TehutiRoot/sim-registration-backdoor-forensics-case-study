package io.opencensus.stats;

import io.opencensus.stats.Measure;

/* renamed from: io.opencensus.stats.n */
/* loaded from: classes5.dex */
public final class C10654n extends Measure.MeasureLong {

    /* renamed from: a */
    public final String f63622a;

    /* renamed from: b */
    public final String f63623b;

    /* renamed from: c */
    public final String f63624c;

    public C10654n(String str, String str2, String str3) {
        if (str != null) {
            this.f63622a = str;
            if (str2 != null) {
                this.f63623b = str2;
                if (str3 != null) {
                    this.f63624c = str3;
                    return;
                }
                throw new NullPointerException("Null unit");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Measure.MeasureLong)) {
            return false;
        }
        Measure.MeasureLong measureLong = (Measure.MeasureLong) obj;
        if (this.f63622a.equals(measureLong.getName()) && this.f63623b.equals(measureLong.getDescription()) && this.f63624c.equals(measureLong.getUnit())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.Measure.MeasureLong, io.opencensus.stats.Measure
    public String getDescription() {
        return this.f63623b;
    }

    @Override // io.opencensus.stats.Measure.MeasureLong, io.opencensus.stats.Measure
    public String getName() {
        return this.f63622a;
    }

    @Override // io.opencensus.stats.Measure.MeasureLong, io.opencensus.stats.Measure
    public String getUnit() {
        return this.f63624c;
    }

    public int hashCode() {
        return ((((this.f63622a.hashCode() ^ 1000003) * 1000003) ^ this.f63623b.hashCode()) * 1000003) ^ this.f63624c.hashCode();
    }

    public String toString() {
        return "MeasureLong{name=" + this.f63622a + ", description=" + this.f63623b + ", unit=" + this.f63624c + "}";
    }
}
