package p000;

import io.opencensus.trace.Annotation;
import java.util.Map;

/* renamed from: h8 */
/* loaded from: classes5.dex */
public final class C10343h8 extends Annotation {

    /* renamed from: b */
    public final String f62382b;

    /* renamed from: c */
    public final Map f62383c;

    public C10343h8(String str, Map map) {
        if (str != null) {
            this.f62382b = str;
            if (map != null) {
                this.f62383c = map;
                return;
            }
            throw new NullPointerException("Null attributes");
        }
        throw new NullPointerException("Null description");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Annotation)) {
            return false;
        }
        Annotation annotation = (Annotation) obj;
        if (this.f62382b.equals(annotation.getDescription()) && this.f62383c.equals(annotation.getAttributes())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.Annotation
    public Map getAttributes() {
        return this.f62383c;
    }

    @Override // io.opencensus.trace.Annotation
    public String getDescription() {
        return this.f62382b;
    }

    public int hashCode() {
        return ((this.f62382b.hashCode() ^ 1000003) * 1000003) ^ this.f62383c.hashCode();
    }

    public String toString() {
        return "Annotation{description=" + this.f62382b + ", attributes=" + this.f62383c + "}";
    }
}