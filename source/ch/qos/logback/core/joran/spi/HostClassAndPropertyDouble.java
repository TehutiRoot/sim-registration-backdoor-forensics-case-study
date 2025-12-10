package ch.qos.logback.core.joran.spi;

/* loaded from: classes.dex */
public class HostClassAndPropertyDouble {

    /* renamed from: a */
    public final Class f39809a;

    /* renamed from: b */
    public final String f39810b;

    public HostClassAndPropertyDouble(Class<?> cls, String str) {
        this.f39809a = cls;
        this.f39810b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HostClassAndPropertyDouble hostClassAndPropertyDouble = (HostClassAndPropertyDouble) obj;
            Class cls = this.f39809a;
            if (cls == null) {
                if (hostClassAndPropertyDouble.f39809a != null) {
                    return false;
                }
            } else if (!cls.equals(hostClassAndPropertyDouble.f39809a)) {
                return false;
            }
            String str = this.f39810b;
            String str2 = hostClassAndPropertyDouble.f39810b;
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
        return this.f39809a;
    }

    public String getPropertyName() {
        return this.f39810b;
    }

    public int hashCode() {
        Class cls = this.f39809a;
        int hashCode = ((cls == null ? 0 : cls.hashCode()) + 31) * 31;
        String str = this.f39810b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
