package p000;

import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: oh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21455oh1 implements Iterator {

    /* renamed from: a */
    public PDOutlineItem f72768a;

    /* renamed from: b */
    public final PDOutlineItem f72769b;

    public C21455oh1(PDOutlineItem pDOutlineItem) {
        this.f72769b = pDOutlineItem;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public PDOutlineItem next() {
        if (hasNext()) {
            PDOutlineItem pDOutlineItem = this.f72768a;
            if (pDOutlineItem == null) {
                this.f72768a = this.f72769b;
            } else {
                this.f72768a = pDOutlineItem.getNextSibling();
            }
            return this.f72768a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f72769b == null) {
            return false;
        }
        PDOutlineItem pDOutlineItem = this.f72768a;
        if (pDOutlineItem == null) {
            return true;
        }
        PDOutlineItem nextSibling = pDOutlineItem.getNextSibling();
        if (nextSibling == null || this.f72769b.equals(nextSibling)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
