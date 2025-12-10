package p000;

import io.opencensus.resource.Resource;
import java.util.Map;

/* renamed from: S8 */
/* loaded from: classes5.dex */
public final class C1272S8 extends Resource {

    /* renamed from: c */
    public final String f5741c;

    /* renamed from: d */
    public final Map f5742d;

    public C1272S8(String str, Map map) {
        this.f5741c = str;
        if (map != null) {
            this.f5742d = map;
            return;
        }
        throw new NullPointerException("Null labels");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        String str = this.f5741c;
        if (str != null ? str.equals(resource.getType()) : resource.getType() == null) {
            if (this.f5742d.equals(resource.getLabels())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opencensus.resource.Resource
    public Map getLabels() {
        return this.f5742d;
    }

    @Override // io.opencensus.resource.Resource
    public String getType() {
        return this.f5741c;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f5741c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.f5742d.hashCode();
    }

    public String toString() {
        return "Resource{type=" + this.f5741c + ", labels=" + this.f5742d + "}";
    }
}