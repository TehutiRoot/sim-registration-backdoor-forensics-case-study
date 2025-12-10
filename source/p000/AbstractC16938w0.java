package p000;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: w0 */
/* loaded from: classes4.dex */
public abstract class AbstractC16938w0 implements InterfaceC19154bH0 {

    /* renamed from: a */
    public final Map f107874a;

    public AbstractC16938w0(Map map) {
        this.f107874a = (Map) Preconditions.checkNotNull(map);
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: b */
    public Set mo953b() {
        return mo26460a();
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: c */
    public Set mo952c() {
        return mo26460a();
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: d */
    public Object mo951d(Object obj) {
        Object obj2 = this.f107874a.get(obj);
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: e */
    public Set mo950e() {
        return mo944k();
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: f */
    public Object mo949f(Object obj) {
        Object remove = this.f107874a.remove(obj);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: g */
    public Set mo948g() {
        return mo944k();
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: h */
    public Object mo947h(Object obj, boolean z) {
        if (!z) {
            return mo949f(obj);
        }
        return null;
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: i */
    public void mo946i(Object obj, Object obj2) {
        boolean z;
        if (this.f107874a.put(obj, obj2) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: j */
    public void mo945j(Object obj, Object obj2, boolean z) {
        if (!z) {
            mo946i(obj, obj2);
        }
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: k */
    public Set mo944k() {
        return Collections.unmodifiableSet(this.f107874a.keySet());
    }
}
