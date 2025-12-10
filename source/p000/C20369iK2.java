package p000;

import com.google.android.gms.internal.common.zzq;
import com.google.android.gms.internal.common.zzx;
import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: iK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20369iK2 implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ CharSequence f62776a;

    /* renamed from: b */
    public final /* synthetic */ zzx f62777b;

    public C20369iK2(zzx zzxVar, CharSequence charSequence) {
        this.f62777b = zzxVar;
        this.f62776a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator m48074d;
        m48074d = this.f62777b.m48074d(this.f62776a);
        return m48074d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzq.m48079a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(zzq.m48079a(it.next(), ", "));
                }
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
