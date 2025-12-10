package io.opencensus.stats;

import io.opencensus.stats.Measure;

/* renamed from: io.opencensus.stats.m */
/* loaded from: classes5.dex */
public final class C10653m extends Measure.MeasureDouble {

    /* renamed from: a */
    public final String f63619a;

    /* renamed from: b */
    public final String f63620b;

    /* renamed from: c */
    public final String f63621c;

    public C10653m(String str, String str2, String str3) {
        if (str != null) {
            this.f63619a = str;
            if (str2 != null) {
                this.f63620b = str2;
                if (str3 != null) {
                    this.f63621c = str3;
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
        if (this.f63619a.equals(measureDouble.getName()) && this.f63620b.equals(measureDouble.getDescription()) && this.f63621c.equals(measureDouble.getUnit())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.Measure.MeasureDouble, io.opencensus.stats.Measure
    public String getDescription() {
        return this.f63620b;
    }

    @Override // io.opencensus.stats.Measure.MeasureDouble, io.opencensus.stats.Measure
    public String getName() {
        return this.f63619a;
    }

    @Override // io.opencensus.stats.Measure.MeasureDouble, io.opencensus.stats.Measure
    public String getUnit() {
        return this.f63621c;
    }

    public int hashCode() {
        return ((((this.f63619a.hashCode() ^ 1000003) * 1000003) ^ this.f63620b.hashCode()) * 1000003) ^ this.f63621c.hashCode();
    }

    public String toString() {
        return "MeasureDouble{name=" + this.f63619a + ", description=" + this.f63620b + ", unit=" + this.f63621c + "}";
    }
}
