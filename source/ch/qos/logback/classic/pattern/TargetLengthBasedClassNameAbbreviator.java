package ch.qos.logback.classic.pattern;

/* loaded from: classes.dex */
public class TargetLengthBasedClassNameAbbreviator implements Abbreviator {

    /* renamed from: a */
    public final int f39629a;

    public TargetLengthBasedClassNameAbbreviator(int i) {
        this.f39629a = i;
    }

    /* renamed from: a */
    public static int m51595a(String str, int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1 || i2 >= 16) {
                break;
            }
            iArr[i2] = indexOf;
            i2++;
            i = indexOf + 1;
        }
        return i2;
    }

    @Override // ch.qos.logback.classic.pattern.Abbreviator
    public String abbreviate(String str) {
        String substring;
        StringBuilder sb = new StringBuilder(this.f39629a);
        if (str != null) {
            if (str.length() < this.f39629a) {
                return str;
            }
            int[] iArr = new int[16];
            int[] iArr2 = new int[17];
            int m51595a = m51595a(str, iArr);
            if (m51595a == 0) {
                return str;
            }
            m51594b(str, iArr, iArr2, m51595a);
            for (int i = 0; i <= m51595a; i++) {
                if (i == 0) {
                    substring = str.substring(0, iArr2[i] - 1);
                } else {
                    int i2 = iArr[i - 1];
                    substring = str.substring(i2, iArr2[i] + i2);
                }
                sb.append(substring);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Class name may not be null");
    }

    /* renamed from: b */
    public void m51594b(String str, int[] iArr, int[] iArr2, int i) {
        int length = str.length() - this.f39629a;
        int i2 = 0;
        while (i2 < i) {
            int i3 = (iArr[i2] - (i2 > 0 ? iArr[i2 - 1] : -1)) - 1;
            int i4 = (length <= 0 || i3 < 1) ? i3 : 1;
            length -= i3 - i4;
            iArr2[i2] = i4 + 1;
            i2++;
        }
        iArr2[i] = str.length() - iArr[i - 1];
    }
}
