package p000;

import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: li1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21000li1 implements Iterator {

    /* renamed from: a */
    public PDOutlineItem f71781a;

    /* renamed from: b */
    public final PDOutlineItem f71782b;

    public C21000li1(PDOutlineItem pDOutlineItem) {
        this.f71782b = pDOutlineItem;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public PDOutlineItem next() {
        if (hasNext()) {
            PDOutlineItem pDOutlineItem = this.f71781a;
            if (pDOutlineItem == null) {
                this.f71781a = this.f71782b;
            } else {
                this.f71781a = pDOutlineItem.getNextSibling();
            }
            return this.f71781a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f71782b == null) {
            return false;
        }
        PDOutlineItem pDOutlineItem = this.f71781a;
        if (pDOutlineItem == null) {
            return true;
        }
        PDOutlineItem nextSibling = pDOutlineItem.getNextSibling();
        if (nextSibling == null || this.f71782b.equals(nextSibling)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}