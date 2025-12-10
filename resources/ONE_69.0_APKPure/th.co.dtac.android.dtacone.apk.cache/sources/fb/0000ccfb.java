package io.opencensus.stats;

import io.opencensus.stats.Measure;

/* renamed from: io.opencensus.stats.m */
/* loaded from: classes5.dex */
public final class C10640m extends Measure.MeasureDouble {

    /* renamed from: a */
    public final String f63682a;

    /* renamed from: b */
    public final String f63683b;

    /* renamed from: c */
    public final String f63684c;

    public C10640m(String str, String str2, String str3) {
        if (str != null) {
            this.f63682a = str;
            if (str2 != null) {
                this.f63683b = str2;
                if (str3 != null) {
                    this.f63684c = str3;
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
        if (!(obj instanceof Measure.MeasureDouble)) {
            return false;
        }
        Measure.MeasureDouble measureDouble = (Measure.MeasureDouble) obj;
        if (this.f63682a.equals(measureDouble.getName()) && this.f63683b.equals(measureDouble.getDescription()) && this.f63684c.equals(measureDouble.getUnit())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.Measure.MeasureDouble, io.opencensus.stats.Measure
    public String getDescription() {
        return this.f63683b;
    }

    @Override // io.opencensus.stats.Measure.MeasureDouble, io.opencensus.stats.Measure
    public String getName() {
        return this.f63682a;
    }

    @Override // io.opencensus.stats.Measure.MeasureDouble, io.opencensus.stats.Measure
    public String getUnit() {
        return this.f63684c;
    }

    public int hashCode() {
        return ((((this.f63682a.hashCode() ^ 1000003) * 1000003) ^ this.f63683b.hashCode()) * 1000003) ^ this.f63684c.hashCode();
    }

    public String toString() {
        return "MeasureDouble{name=" + this.f63682a + ", description=" + this.f63683b + ", unit=" + this.f63684c + "}";
    }
}