package p000;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: wm */
/* loaded from: classes6.dex */
public final class C17004wm {

    /* renamed from: a */
    public final LinkedList f108560a = new LinkedList();

    /* renamed from: b */
    public final Map f108561b = new HashMap();

    /* renamed from: a */
    public C17004wm m660a(Object... objArr) {
        if (objArr == null) {
            return this;
        }
        for (Object obj : objArr) {
            m658c(obj);
        }
        return this;
    }

    /* renamed from: b */
    public C17004wm m659b(Object... objArr) {
        if (objArr == null) {
            return this;
        }
        for (Object obj : objArr) {
            m657d(obj);
        }
        return this;
    }

    /* renamed from: c */
    public C17004wm m658c(Object obj) {
        if (obj == null) {
            return this;
        }
        m655f(obj);
        this.f108560a.addFirst(obj);
        return this;
    }

    /* renamed from: d */
    public C17004wm m657d(Object obj) {
        if (obj == null) {
            return this;
        }
        m655f(obj);
        this.f108560a.addLast(obj);
        return this;
    }

    /* renamed from: e */
    public LinkedList m656e() {
        return new LinkedList(this.f108560a);
    }

    /* renamed from: f */
    public final void m655f(Object obj) {
        Object remove = this.f108561b.remove(obj.getClass());
        if (remove != null) {
            this.f108560a.remove(remove);
        }
        this.f108561b.put(obj.getClass(), obj);
    }
}