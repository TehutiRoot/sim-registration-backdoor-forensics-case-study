package p000;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: w0 */
/* loaded from: classes4.dex */
public abstract class AbstractC16949w0 implements InterfaceC20239hH0 {

    /* renamed from: a */
    public final Map f108290a;

    public AbstractC16949w0(Map map) {
        this.f108290a = (Map) Preconditions.checkNotNull(map);
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: b */
    public Set mo822b() {
        return mo30962a();
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: c */
    public Set mo821c() {
        return mo30962a();
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: d */
    public Object mo820d(Object obj) {
        Object obj2 = this.f108290a.get(obj);
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: e */
    public Set mo819e() {
        return mo813k();
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: f */
    public Object mo818f(Object obj) {
        Object remove = this.f108290a.remove(obj);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: g */
    public Set mo817g() {
        return mo813k();
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: h */
    public Object mo816h(Object obj, boolean z) {
        if (!z) {
            return mo818f(obj);
        }
        return null;
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: i */
    public void mo815i(Object obj, Object obj2) {
        boolean z;
        if (this.f108290a.put(obj, obj2) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: j */
    public void mo814j(Object obj, Object obj2, boolean z) {
        if (!z) {
            mo815i(obj, obj2);
        }
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: k */
    public Set mo813k() {
        return Collections.unmodifiableSet(this.f108290a.keySet());
    }
}