package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public class FormatInfo {

    /* renamed from: a */
    public int f39971a;

    /* renamed from: b */
    public int f39972b;

    /* renamed from: c */
    public boolean f39973c;

    /* renamed from: d */
    public boolean f39974d;

    public FormatInfo() {
        this.f39971a = Integer.MIN_VALUE;
        this.f39972b = Integer.MAX_VALUE;
        this.f39973c = true;
        this.f39974d = true;
    }

    public static FormatInfo valueOf(String str) throws IllegalArgumentException {
        String str2;
        if (str != null) {
            FormatInfo formatInfo = new FormatInfo();
            int indexOf = str.indexOf(46);
            if (indexOf != -1) {
                String substring = str.substring(0, indexOf);
                int i = indexOf + 1;
                if (i == str.length()) {
                    throw new IllegalArgumentException("Formatting string [" + str + "] should not end with '.'");
                }
                str2 = str.substring(i);
                str = substring;
            } else {
                str2 = null;
            }
            if (str != null && str.length() > 0) {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    formatInfo.f39971a = parseInt;
                } else {
                    formatInfo.f39971a = -parseInt;
                    formatInfo.f39973c = false;
                }
            }
            if (str2 != null && str2.length() > 0) {
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt2 >= 0) {
                    formatInfo.f39972b = parseInt2;
                } else {
                    formatInfo.f39972b = -parseInt2;
                    formatInfo.f39974d = false;
                }
            }
            return formatInfo;
        }
        throw new NullPointerException("Argument cannot be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormatInfo) {
            FormatInfo formatInfo = (FormatInfo) obj;
            return this.f39971a == formatInfo.f39971a && this.f39972b == formatInfo.f39972b && this.f39973c == formatInfo.f39973c && this.f39974d == formatInfo.f39974d;
        }
        return false;
    }

    public int getMax() {
        return this.f39972b;
    }

    public int getMin() {
        return this.f39971a;
    }

    public int hashCode() {
        return (((((this.f39971a * 31) + this.f39972b) * 31) + (this.f39973c ? 1 : 0)) * 31) + (this.f39974d ? 1 : 0);
    }

    public boolean isLeftPad() {
        return this.f39973c;
    }

    public boolean isLeftTruncate() {
        return this.f39974d;
    }

    public void setLeftPad(boolean z) {
        this.f39973c = z;
    }

    public void setLeftTruncate(boolean z) {
        this.f39974d = z;
    }

    public void setMax(int i) {
        this.f39972b = i;
    }

    public void setMin(int i) {
        this.f39971a = i;
    }

    public String toString() {
        return "FormatInfo(" + this.f39971a + ", " + this.f39972b + ", " + this.f39973c + ", " + this.f39974d + ")";
    }

    public FormatInfo(int i, int i2) {
        this.f39973c = true;
        this.f39974d = true;
        this.f39971a = i;
        this.f39972b = i2;
    }

    public FormatInfo(int i, int i2, boolean z, boolean z2) {
        this.f39971a = i;
        this.f39972b = i2;
        this.f39973c = z;
        this.f39974d = z2;
    }
}
