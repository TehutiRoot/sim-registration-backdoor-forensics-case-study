package p000;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.C5810d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Sg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18431Sg0 {

    /* renamed from: a */
    public final Map f5669a = new HashMap();

    /* renamed from: b */
    public final Map f5670b = new HashMap();

    /* renamed from: a */
    public C5810d m66308a(Key key, boolean z) {
        return (C5810d) m66307b(z).get(key);
    }

    /* renamed from: b */
    public final Map m66307b(boolean z) {
        if (z) {
            return this.f5670b;
        }
        return this.f5669a;
    }

    /* renamed from: c */
    public void m66306c(Key key, C5810d c5810d) {
        m66307b(c5810d.m50341m()).put(key, c5810d);
    }

    /* renamed from: d */
    public void m66305d(Key key, C5810d c5810d) {
        Map m66307b = m66307b(c5810d.m50341m());
        if (c5810d.equals(m66307b.get(key))) {
            m66307b.remove(key);
        }
    }
}
