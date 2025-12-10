package p000;

import com.google.android.gms.internal.clearcut.zzbb;

/* renamed from: lm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20955lm2 {
    /* renamed from: a */
    public static String m26416a(zzbb zzbbVar) {
        String str;
        C21815qm2 c21815qm2 = new C21815qm2(zzbbVar);
        StringBuilder sb = new StringBuilder(c21815qm2.size());
        for (int i = 0; i < c21815qm2.size(); i++) {
            int mo715a = c21815qm2.mo715a(i);
            if (mo715a != 34) {
                if (mo715a != 39) {
                    if (mo715a != 92) {
                        switch (mo715a) {
                            case 7:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (mo715a < 32 || mo715a > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((mo715a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo715a >>> 3) & 7) + 48));
                                    mo715a = (mo715a & 7) + 48;
                                }
                                sb.append((char) mo715a);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
