package io.opencensus.stats;

import io.opencensus.stats.Measure;

/* renamed from: io.opencensus.stats.n */
/* loaded from: classes5.dex */
public final class C10641n extends Measure.MeasureLong {

    /* renamed from: a */
    public final String f63685a;

    /* renamed from: b */
    public final String f63686b;

    /* renamed from: c */
    public final String f63687c;

    public C10641n(String str, String str2, String str3) {
        if (str != null) {
            this.f63685a = str;
            if (str2 != null) {
                this.f63686b = str2;
                if (str3 != null) {
                    this.f63687c = str3;
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
        if (this.f63685a.equals(measureLong.getName()) && this.f63686b.equals(measureLong.getDescription()) && this.f63687c.equals(measureLong.getUnit())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.Measure.MeasureLong, io.opencensus.stats.Measure
    public String getDescription() {
        return this.f63686b;
    }

    @Override // io.opencensus.stats.Measure.MeasureLong, io.opencensus.stats.Measure
    public String getName() {
        return this.f63685a;
    }

    @Override // io.opencensus.stats.Measure.MeasureLong, io.opencensus.stats.Measure
    public String getUnit() {
        return this.f63687c;
    }

    public int hashCode() {
        return ((((this.f63685a.hashCode() ^ 1000003) * 1000003) ^ this.f63686b.hashCode()) * 1000003) ^ this.f63687c.hashCode();
    }

    public String toString() {
        return "MeasureLong{name=" + this.f63685a + ", description=" + this.f63686b + ", unit=" + this.f63687c + "}";
    }
}