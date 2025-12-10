package p000;

import com.google.android.gms.internal.common.zzq;
import com.google.android.gms.internal.common.zzx;
import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: fL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19907fL2 implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ CharSequence f61845a;

    /* renamed from: b */
    public final /* synthetic */ zzx f61846b;

    public C19907fL2(zzx zzxVar, CharSequence charSequence) {
        this.f61846b = zzxVar;
        this.f61845a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator m48071d;
        m48071d = this.f61846b.m48071d(this.f61845a);
        return m48071d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzq.m48076a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(zzq.m48076a(it.next(), ", "));
                }
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}