package p000;

import io.opencensus.resource.Resource;
import java.util.Map;

/* renamed from: S8 */
/* loaded from: classes5.dex */
public final class C1292S8 extends Resource {

    /* renamed from: c */
    public final String f5526c;

    /* renamed from: d */
    public final Map f5527d;

    public C1292S8(String str, Map map) {
        this.f5526c = str;
        if (map != null) {
            this.f5527d = map;
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
        String str = this.f5526c;
        if (str != null ? str.equals(resource.getType()) : resource.getType() == null) {
            if (this.f5527d.equals(resource.getLabels())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opencensus.resource.Resource
    public Map getLabels() {
        return this.f5527d;
    }

    @Override // io.opencensus.resource.Resource
    public String getType() {
        return this.f5526c;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f5526c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.f5527d.hashCode();
    }

    public String toString() {
        return "Resource{type=" + this.f5526c + ", labels=" + this.f5527d + "}";
    }
}
