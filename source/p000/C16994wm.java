package p000;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: wm */
/* loaded from: classes6.dex */
public final class C16994wm {

    /* renamed from: a */
    public final LinkedList f108122a = new LinkedList();

    /* renamed from: b */
    public final Map f108123b = new HashMap();

    /* renamed from: a */
    public C16994wm m721a(Object... objArr) {
        if (objArr == null) {
            return this;
        }
        for (Object obj : objArr) {
            m719c(obj);
        }
        return this;
    }

    /* renamed from: b */
    public C16994wm m720b(Object... objArr) {
        if (objArr == null) {
            return this;
        }
        for (Object obj : objArr) {
            m718d(obj);
        }
        return this;
    }

    /* renamed from: c */
    public C16994wm m719c(Object obj) {
        if (obj == null) {
            return this;
        }
        m716f(obj);
        this.f108122a.addFirst(obj);
        return this;
    }

    /* renamed from: d */
    public C16994wm m718d(Object obj) {
        if (obj == null) {
            return this;
        }
        m716f(obj);
        this.f108122a.addLast(obj);
        return this;
    }

    /* renamed from: e */
    public LinkedList m717e() {
        return new LinkedList(this.f108122a);
    }

    /* renamed from: f */
    public final void m716f(Object obj) {
        Object remove = this.f108123b.remove(obj.getClass());
        if (remove != null) {
            this.f108122a.remove(remove);
        }
        this.f108123b.put(obj.getClass(), obj);
    }
}
