package p000;

import com.google.android.gms.internal.firebase_ml.zzwd;

/* renamed from: ya2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23155ya2 {
    /* renamed from: a */
    public static String m235a(zzwd zzwdVar) {
        C17263Aa2 c17263Aa2 = new C17263Aa2(zzwdVar);
        StringBuilder sb = new StringBuilder(c17263Aa2.size());
        for (int i = 0; i < c17263Aa2.size(); i++) {
            byte mo71a = c17263Aa2.mo71a(i);
            if (mo71a != 34) {
                if (mo71a != 39) {
                    if (mo71a != 92) {
                        switch (mo71a) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (mo71a >= 32 && mo71a <= 126) {
                                    sb.append((char) mo71a);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((mo71a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo71a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo71a & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
