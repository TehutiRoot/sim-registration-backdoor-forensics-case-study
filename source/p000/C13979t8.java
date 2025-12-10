package p000;

import io.opencensus.common.Timestamp;
import io.opencensus.metrics.data.Exemplar;
import java.util.Map;

/* renamed from: t8 */
/* loaded from: classes5.dex */
public final class C13979t8 extends Exemplar {

    /* renamed from: a */
    public final double f80011a;

    /* renamed from: b */
    public final Timestamp f80012b;

    /* renamed from: c */
    public final Map f80013c;

    public C13979t8(double d, Timestamp timestamp, Map map) {
        this.f80011a = d;
        if (timestamp != null) {
            this.f80012b = timestamp;
            if (map != null) {
                this.f80013c = map;
                return;
            }
            throw new NullPointerException("Null attachments");
        }
        throw new NullPointerException("Null timestamp");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Exemplar)) {
            return false;
        }
        Exemplar exemplar = (Exemplar) obj;
        if (Double.doubleToLongBits(this.f80011a) == Double.doubleToLongBits(exemplar.getValue()) && this.f80012b.equals(exemplar.getTimestamp()) && this.f80013c.equals(exemplar.getAttachments())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.data.Exemplar
    public Map getAttachments() {
        return this.f80013c;
    }

    @Override // io.opencensus.metrics.data.Exemplar
    public Timestamp getTimestamp() {
        return this.f80012b;
    }

    @Override // io.opencensus.metrics.data.Exemplar
    public double getValue() {
        return this.f80011a;
    }

    public int hashCode() {
        int hashCode = this.f80012b.hashCode();
        return this.f80013c.hashCode() ^ ((hashCode ^ (((int) (1000003 ^ ((Double.doubleToLongBits(this.f80011a) >>> 32) ^ Double.doubleToLongBits(this.f80011a)))) * 1000003)) * 1000003);
    }

    public String toString() {
        return "Exemplar{value=" + this.f80011a + ", timestamp=" + this.f80012b + ", attachments=" + this.f80013c + "}";
    }
}
