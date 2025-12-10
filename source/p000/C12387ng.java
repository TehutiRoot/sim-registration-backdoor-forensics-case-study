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
public class C12387ng {

    /* renamed from: a */
    public final PriorityQueue f72412a;

    /* renamed from: b */
    public final PriorityQueue f72413b;

    /* renamed from: c */
    public final List f72414c;

    /* renamed from: d */
    public final Object f72415d = new Object();

    /* renamed from: e */
    public final C12388a f72416e;

    /* renamed from: ng$a */
    /* loaded from: classes3.dex */
    public class C12388a implements Comparator {
        public C12388a() {
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

    public C12387ng() {
        C12388a c12388a = new C12388a();
        this.f72416e = c12388a;
        this.f72413b = new PriorityQueue(Constants.Cache.CACHE_SIZE, c12388a);
        this.f72412a = new PriorityQueue(Constants.Cache.CACHE_SIZE, c12388a);
        this.f72414c = new ArrayList();
    }

    /* renamed from: e */
    public static PagePart m26067e(PriorityQueue priorityQueue, PagePart pagePart) {
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
    public final void m26071a(Collection collection, PagePart pagePart) {
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
    public void m26070b(PagePart pagePart) {
        synchronized (this.f72415d) {
            m26064h();
            this.f72413b.offer(pagePart);
        }
    }

    /* renamed from: c */
    public void m26069c(PagePart pagePart) {
        synchronized (this.f72414c) {
            while (this.f72414c.size() >= Constants.Cache.THUMBNAILS_CACHE_SIZE) {
                try {
                    ((PagePart) this.f72414c.remove(0)).getRenderedBitmap().recycle();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m26071a(this.f72414c, pagePart);
        }
    }

    /* renamed from: d */
    public boolean m26068d(int i, RectF rectF) {
        PagePart pagePart = new PagePart(i, null, rectF, true, 0);
        synchronized (this.f72414c) {
            try {
                for (PagePart pagePart2 : this.f72414c) {
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
    public List m26066f() {
        ArrayList arrayList;
        synchronized (this.f72415d) {
            arrayList = new ArrayList(this.f72412a);
            arrayList.addAll(this.f72413b);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m26065g() {
        List list;
        synchronized (this.f72414c) {
            list = this.f72414c;
        }
        return list;
    }

    /* renamed from: h */
    public final void m26064h() {
        synchronized (this.f72415d) {
            while (this.f72413b.size() + this.f72412a.size() >= Constants.Cache.CACHE_SIZE && !this.f72412a.isEmpty()) {
                try {
                    ((PagePart) this.f72412a.poll()).getRenderedBitmap().recycle();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (this.f72413b.size() + this.f72412a.size() >= Constants.Cache.CACHE_SIZE && !this.f72413b.isEmpty()) {
                ((PagePart) this.f72413b.poll()).getRenderedBitmap().recycle();
            }
        }
    }

    /* renamed from: i */
    public void m26063i() {
        synchronized (this.f72415d) {
            this.f72412a.addAll(this.f72413b);
            this.f72413b.clear();
        }
    }

    /* renamed from: j */
    public void m26062j() {
        synchronized (this.f72415d) {
            try {
                Iterator it = this.f72412a.iterator();
                while (it.hasNext()) {
                    ((PagePart) it.next()).getRenderedBitmap().recycle();
                }
                this.f72412a.clear();
                Iterator it2 = this.f72413b.iterator();
                while (it2.hasNext()) {
                    ((PagePart) it2.next()).getRenderedBitmap().recycle();
                }
                this.f72413b.clear();
            } finally {
            }
        }
        synchronized (this.f72414c) {
            try {
                for (PagePart pagePart : this.f72414c) {
                    pagePart.getRenderedBitmap().recycle();
                }
                this.f72414c.clear();
            } finally {
            }
        }
    }

    /* renamed from: k */
    public boolean m26061k(int i, RectF rectF, int i2) {
        PagePart pagePart = new PagePart(i, null, rectF, false, 0);
        synchronized (this.f72415d) {
            try {
                PagePart m26067e = m26067e(this.f72412a, pagePart);
                boolean z = true;
                if (m26067e != null) {
                    this.f72412a.remove(m26067e);
                    m26067e.setCacheOrder(i2);
                    this.f72413b.offer(m26067e);
                    return true;
                }
                if (m26067e(this.f72413b, pagePart) == null) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}
