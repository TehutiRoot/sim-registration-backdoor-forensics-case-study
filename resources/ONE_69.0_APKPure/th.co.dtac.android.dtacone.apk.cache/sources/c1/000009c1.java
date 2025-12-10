package p000;

import com.google.android.gms.internal.firebase_ml.zzlw;

/* renamed from: KG2 */
/* loaded from: classes3.dex */
public final class KG2 extends AbstractC23006xG2 {

    /* renamed from: a */
    public final char f3267a = ',';

    public KG2(char c) {
    }

    public final String toString() {
        String m47892a;
        m47892a = zzlw.m47892a(this.f3267a);
        StringBuilder sb = new StringBuilder(String.valueOf(m47892a).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(m47892a);
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlw
    public final boolean zzb(char c) {
        if (c == this.f3267a) {
            return true;
        }
        return false;
    }
}