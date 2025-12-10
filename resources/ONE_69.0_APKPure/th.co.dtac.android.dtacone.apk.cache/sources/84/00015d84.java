package p000;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: th0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22380th0 {
    /* renamed from: a */
    public static String m1421a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    String str = strArr[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(iArr2[i2]);
                sb.append(AbstractJsonLexerKt.END_LIST);
            }
        }
        return sb.toString();
    }
}