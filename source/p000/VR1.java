package p000;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: VR1 */
/* loaded from: classes5.dex */
public final class VR1 extends C1839Zf {
    @Override // p000.C1839Zf
    /* renamed from: c */
    public int mo65166c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) (c - 'S'));
            return 1;
        } else if (c >= 0 && c <= 31) {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        } else if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c - '@'));
            return 2;
        } else if (c >= '{' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 128) {
            sb.append("\u0001\u001e");
            return mo65166c((char) (c - 128), sb) + 2;
        } else {
            HighLevelEncoder.m34090c(c);
            return -1;
        }
    }

    @Override // p000.C1839Zf
    /* renamed from: e */
    public int mo65164e() {
        return 2;
    }
}
