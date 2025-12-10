package ch.qos.logback.core.joran.spi;

/* loaded from: classes.dex */
public class HostClassAndPropertyDouble {

    /* renamed from: a */
    public final Class f39807a;

    /* renamed from: b */
    public final String f39808b;

    public HostClassAndPropertyDouble(Class<?> cls, String str) {
        this.f39807a = cls;
        this.f39808b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HostClassAndPropertyDouble hostClassAndPropertyDouble = (HostClassAndPropertyDouble) obj;
            Class cls = this.f39807a;
            if (cls == null) {
                if (hostClassAndPropertyDouble.f39807a != null) {
                    return false;
                }
            } else if (!cls.equals(hostClassAndPropertyDouble.f39807a)) {
                return false;
            }
            String str = this.f39808b;
            String str2 = hostClassAndPropertyDouble.f39808b;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Class<?> getHostClass() {
        return this.f39807a;
    }

    public String getPropertyName() {
        return this.f39808b;
    }

    public int hashCode() {
        Class cls = this.f39807a;
        int hashCode = ((cls == null ? 0 : cls.hashCode()) + 31) * 31;
        String str = this.f39808b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}