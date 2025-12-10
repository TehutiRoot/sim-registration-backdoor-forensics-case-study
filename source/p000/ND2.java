package p000;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: ND2 */
/* loaded from: classes3.dex */
public final class ND2 extends GB2 {

    /* renamed from: a */
    public final char f4041a;

    public ND2(char c) {
        this.f4041a = c;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f4041a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c) {
        if (c == this.f4041a) {
            return true;
        }
        return false;
    }
}
