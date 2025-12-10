package p000;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.C5799d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Yg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18862Yg0 {

    /* renamed from: a */
    public final Map f7920a = new HashMap();

    /* renamed from: b */
    public final Map f7921b = new HashMap();

    /* renamed from: a */
    public C5799d m65430a(Key key, boolean z) {
        return (C5799d) m65429b(z).get(key);
    }

    /* renamed from: b */
    public final Map m65429b(boolean z) {
        if (z) {
            return this.f7921b;
        }
        return this.f7920a;
    }

    /* renamed from: c */
    public void m65428c(Key key, C5799d c5799d) {
        m65429b(c5799d.m50338m()).put(key, c5799d);
    }

    /* renamed from: d */
    public void m65427d(Key key, C5799d c5799d) {
        Map m65429b = m65429b(c5799d.m50338m());
        if (c5799d.equals(m65429b.get(key))) {
            m65429b.remove(key);
        }
    }
}