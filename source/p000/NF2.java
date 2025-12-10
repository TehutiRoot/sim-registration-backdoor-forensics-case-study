package p000;

import com.google.android.gms.internal.firebase_ml.zzlw;

/* renamed from: NF2 */
/* loaded from: classes3.dex */
public final class NF2 extends AF2 {

    /* renamed from: a */
    public final char f4052a = ',';

    public NF2(char c) {
    }

    public final String toString() {
        String m47883a;
        m47883a = zzlw.m47883a(this.f4052a);
        StringBuilder sb = new StringBuilder(String.valueOf(m47883a).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(m47883a);
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlw
    public final boolean zzb(char c) {
        if (c == this.f4052a) {
            return true;
        }
        return false;
    }
}
