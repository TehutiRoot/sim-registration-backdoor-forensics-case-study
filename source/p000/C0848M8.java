package p000;

import io.opencensus.common.Timestamp;
import io.opencensus.metrics.export.Point;
import io.opencensus.metrics.export.Value;

/* renamed from: M8 */
/* loaded from: classes5.dex */
public final class C0848M8 extends Point {

    /* renamed from: a */
    public final Value f3683a;

    /* renamed from: b */
    public final Timestamp f3684b;

    public C0848M8(Value value, Timestamp timestamp) {
        if (value != null) {
            this.f3683a = value;
            if (timestamp != null) {
                this.f3684b = timestamp;
                return;
            }
            throw new NullPointerException("Null timestamp");
        }
        throw new NullPointerException("Null value");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        if (this.f3683a.equals(point.getValue()) && this.f3684b.equals(point.getTimestamp())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Point
    public Timestamp getTimestamp() {
        return this.f3684b;
    }

    @Override // io.opencensus.metrics.export.Point
    public Value getValue() {
        return this.f3683a;
    }

    public int hashCode() {
        return ((this.f3683a.hashCode() ^ 1000003) * 1000003) ^ this.f3684b.hashCode();
    }

    public String toString() {
        return "Point{value=" + this.f3683a + ", timestamp=" + this.f3684b + "}";
    }
}
