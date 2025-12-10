package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public class FormatInfo {

    /* renamed from: a */
    public int f39969a;

    /* renamed from: b */
    public int f39970b;

    /* renamed from: c */
    public boolean f39971c;

    /* renamed from: d */
    public boolean f39972d;

    public FormatInfo() {
        this.f39969a = Integer.MIN_VALUE;
        this.f39970b = Integer.MAX_VALUE;
        this.f39971c = true;
        this.f39972d = true;
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
                    formatInfo.f39969a = parseInt;
                } else {
                    formatInfo.f39969a = -parseInt;
                    formatInfo.f39971c = false;
                }
            }
            if (str2 != null && str2.length() > 0) {
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt2 >= 0) {
                    formatInfo.f39970b = parseInt2;
                } else {
                    formatInfo.f39970b = -parseInt2;
                    formatInfo.f39972d = false;
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
            return this.f39969a == formatInfo.f39969a && this.f39970b == formatInfo.f39970b && this.f39971c == formatInfo.f39971c && this.f39972d == formatInfo.f39972d;
        }
        return false;
    }

    public int getMax() {
        return this.f39970b;
    }

    public int getMin() {
        return this.f39969a;
    }

    public int hashCode() {
        return (((((this.f39969a * 31) + this.f39970b) * 31) + (this.f39971c ? 1 : 0)) * 31) + (this.f39972d ? 1 : 0);
    }

    public boolean isLeftPad() {
        return this.f39971c;
    }

    public boolean isLeftTruncate() {
        return this.f39972d;
    }

    public void setLeftPad(boolean z) {
        this.f39971c = z;
    }

    public void setLeftTruncate(boolean z) {
        this.f39972d = z;
    }

    public void setMax(int i) {
        this.f39970b = i;
    }

    public void setMin(int i) {
        this.f39969a = i;
    }

    public String toString() {
        return "FormatInfo(" + this.f39969a + ", " + this.f39970b + ", " + this.f39971c + ", " + this.f39972d + ")";
    }

    public FormatInfo(int i, int i2) {
        this.f39971c = true;
        this.f39972d = true;
        this.f39969a = i;
        this.f39970b = i2;
    }

    public FormatInfo(int i, int i2, boolean z, boolean z2) {
        this.f39969a = i;
        this.f39970b = i2;
        this.f39971c = z;
        this.f39972d = z2;
    }
}