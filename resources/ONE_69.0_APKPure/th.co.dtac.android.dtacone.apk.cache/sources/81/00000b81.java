package p000;

import io.opencensus.common.Timestamp;
import io.opencensus.metrics.export.Point;
import io.opencensus.metrics.export.Value;

/* renamed from: M8 */
/* loaded from: classes5.dex */
public final class C0845M8 extends Point {

    /* renamed from: a */
    public final Value f3815a;

    /* renamed from: b */
    public final Timestamp f3816b;

    public C0845M8(Value value, Timestamp timestamp) {
        if (value != null) {
            this.f3815a = value;
            if (timestamp != null) {
                this.f3816b = timestamp;
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
        if (this.f3815a.equals(point.getValue()) && this.f3816b.equals(point.getTimestamp())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Point
    public Timestamp getTimestamp() {
        return this.f3816b;
    }

    @Override // io.opencensus.metrics.export.Point
    public Value getValue() {
        return this.f3815a;
    }

    public int hashCode() {
        return ((this.f3815a.hashCode() ^ 1000003) * 1000003) ^ this.f3816b.hashCode();
    }

    public String toString() {
        return "Point{value=" + this.f3815a + ", timestamp=" + this.f3816b + "}";
    }
}