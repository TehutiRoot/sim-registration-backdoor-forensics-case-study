package p000;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.model.PagePart;
import com.github.barteksc.pdfviewer.util.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: ng */
/* loaded from: classes3.dex */
public class C12384ng {

    /* renamed from: a */
    public final PriorityQueue f72536a;

    /* renamed from: b */
    public final PriorityQueue f72537b;

    /* renamed from: c */
    public final List f72538c;

    /* renamed from: d */
    public final Object f72539d = new Object();

    /* renamed from: e */
    public final C12385a f72540e;

    /* renamed from: ng$a */
    /* loaded from: classes3.dex */
    public class C12385a implements Comparator {
        public C12385a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(PagePart pagePart, PagePart pagePart2) {
            if (pagePart.getCacheOrder() == pagePart2.getCacheOrder()) {
                return 0;
            }
            if (pagePart.getCacheOrder() > pagePart2.getCacheOrder()) {
                return 1;
            }
            return -1;
        }
    }

    public C12384ng() {
        C12385a c12385a = new C12385a();
        this.f72540e = c12385a;
        this.f72537b = new PriorityQueue(Constants.Cache.CACHE_SIZE, c12385a);
        this.f72536a = new PriorityQueue(Constants.Cache.CACHE_SIZE, c12385a);
        this.f72538c = new ArrayList();
    }

    /* renamed from: e */
    public static PagePart m26272e(PriorityQueue priorityQueue, PagePart pagePart) {
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            PagePart pagePart2 = (PagePart) it.next();
            if (pagePart2.equals(pagePart)) {
                return pagePart2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m26276a(Collection collection, PagePart pagePart) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((PagePart) it.next()).equals(pagePart)) {
                pagePart.getRenderedBitmap().recycle();
                return;
            }
        }
        collection.add(pagePart);
    }

    /* renamed from: b */
    public void m26275b(PagePart pagePart) {
        synchronized (this.f72539d) {
            m26269h();
            this.f72537b.offer(pagePart);
        }
    }

    /* renamed from: c */
    public void m26274c(PagePart pagePart) {
        synchronized (this.f72538c) {
            while (this.f72538c.size() >= Constants.Cache.THUMBNAILS_CACHE_SIZE) {
                try {
                    ((PagePart) this.f72538c.remove(0)).getRenderedBitmap().recycle();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m26276a(this.f72538c, pagePart);
        }
    }

    /* renamed from: d */
    public boolean m26273d(int i, RectF rectF) {
        PagePart pagePart = new PagePart(i, null, rectF, true, 0);
        synchronized (this.f72538c) {
            try {
                for (PagePart pagePart2 : this.f72538c) {
                    if (pagePart2.equals(pagePart)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public List m26271f() {
        ArrayList arrayList;
        synchronized (this.f72539d) {
            arrayList = new ArrayList(this.f72536a);
            arrayList.addAll(this.f72537b);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m26270g() {
        List list;
        synchronized (this.f72538c) {
            list = this.f72538c;
        }
        return list;
    }

    /* renamed from: h */
    public final void m26269h() {
        synchronized (this.f72539d) {
            while (this.f72537b.size() + this.f72536a.size() >= Constants.Cache.CACHE_SIZE && !this.f72536a.isEmpty()) {
                try {
                    ((PagePart) this.f72536a.poll()).getRenderedBitmap().recycle();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (this.f72537b.size() + this.f72536a.size() >= Constants.Cache.CACHE_SIZE && !this.f72537b.isEmpty()) {
                ((PagePart) this.f72537b.poll()).getRenderedBitmap().recycle();
            }
        }
    }

    /* renamed from: i */
    public void m26268i() {
        synchronized (this.f72539d) {
            this.f72536a.addAll(this.f72537b);
            this.f72537b.clear();
        }
    }

    /* renamed from: j */
    public void m26267j() {
        synchronized (this.f72539d) {
            try {
                Iterator it = this.f72536a.iterator();
                while (it.hasNext()) {
                    ((PagePart) it.next()).getRenderedBitmap().recycle();
                }
                this.f72536a.clear();
                Iterator it2 = this.f72537b.iterator();
                while (it2.hasNext()) {
                    ((PagePart) it2.next()).getRenderedBitmap().recycle();
                }
                this.f72537b.clear();
            } finally {
            }
        }
        synchronized (this.f72538c) {
            try {
                for (PagePart pagePart : this.f72538c) {
                    pagePart.getRenderedBitmap().recycle();
                }
                this.f72538c.clear();
            } finally {
            }
        }
    }

    /* renamed from: k */
    public boolean m26266k(int i, RectF rectF, int i2) {
        PagePart pagePart = new PagePart(i, null, rectF, false, 0);
        synchronized (this.f72539d) {
            try {
                PagePart m26272e = m26272e(this.f72536a, pagePart);
                boolean z = true;
                if (m26272e != null) {
                    this.f72536a.remove(m26272e);
                    m26272e.setCacheOrder(i2);
                    this.f72537b.offer(m26272e);
                    return true;
                }
                if (m26272e(this.f72537b, pagePart) == null) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}