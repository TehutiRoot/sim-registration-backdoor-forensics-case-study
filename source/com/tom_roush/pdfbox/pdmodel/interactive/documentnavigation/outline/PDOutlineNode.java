package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class PDOutlineNode extends PDDictionaryWrapper {

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode$a */
    /* loaded from: classes5.dex */
    public class C9957a implements Iterable {
        public C9957a() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C21455oh1(PDOutlineNode.this.getFirstChild());
        }
    }

    public PDOutlineNode() {
    }

    /* renamed from: a */
    public final void m32271a(PDOutlineItem pDOutlineItem) {
        pDOutlineItem.m32263i(this);
        if (!hasChildren()) {
            m32266f(pDOutlineItem);
        } else {
            PDOutlineItem lastChild = getLastChild();
            lastChild.m32273m(pDOutlineItem);
            pDOutlineItem.m32272n(lastChild);
        }
        m32265g(pDOutlineItem);
    }

    public void addFirst(PDOutlineItem pDOutlineItem) {
        m32267e(pDOutlineItem);
        m32268d(pDOutlineItem);
        m32260l(pDOutlineItem);
    }

    public void addLast(PDOutlineItem pDOutlineItem) {
        m32267e(pDOutlineItem);
        m32271a(pDOutlineItem);
        m32260l(pDOutlineItem);
    }

    /* renamed from: b */
    public PDOutlineItem m32270b(COSName cOSName) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDOutlineItem((COSDictionary) dictionaryObject);
        }
        return null;
    }

    /* renamed from: c */
    public PDOutlineNode m32269c() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.PARENT);
        if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary = (COSDictionary) dictionaryObject;
            if (COSName.OUTLINES.equals(cOSDictionary.getCOSName(COSName.TYPE))) {
                return new PDDocumentOutline(cOSDictionary);
            }
            return new PDOutlineItem(cOSDictionary);
        }
        return null;
    }

    public Iterable<PDOutlineItem> children() {
        return new C9957a();
    }

    public void closeNode() {
        if (isNodeOpen()) {
            m32262j();
        }
    }

    /* renamed from: d */
    public final void m32268d(PDOutlineItem pDOutlineItem) {
        pDOutlineItem.m32263i(this);
        if (!hasChildren()) {
            m32265g(pDOutlineItem);
        } else {
            PDOutlineItem firstChild = getFirstChild();
            pDOutlineItem.m32273m(firstChild);
            firstChild.m32272n(pDOutlineItem);
        }
        m32266f(pDOutlineItem);
    }

    /* renamed from: e */
    public void m32267e(PDOutlineItem pDOutlineItem) {
        if (pDOutlineItem.getNextSibling() == null && pDOutlineItem.getPreviousSibling() == null) {
            return;
        }
        throw new IllegalArgumentException("A single node with no siblings is required");
    }

    /* renamed from: f */
    public void m32266f(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.FIRST, pDOutlineNode);
    }

    /* renamed from: g */
    public void m32265g(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.LAST, pDOutlineNode);
    }

    public PDOutlineItem getFirstChild() {
        return m32270b(COSName.FIRST);
    }

    public PDOutlineItem getLastChild() {
        return m32270b(COSName.LAST);
    }

    public int getOpenCount() {
        return getCOSObject().getInt(COSName.COUNT, 0);
    }

    /* renamed from: h */
    public void m32264h(int i) {
        getCOSObject().setInt(COSName.COUNT, i);
    }

    public boolean hasChildren() {
        if (getCOSObject().getCOSDictionary(COSName.FIRST) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m32263i(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.PARENT, pDOutlineNode);
    }

    public boolean isNodeOpen() {
        if (getOpenCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m32262j() {
        int i = -getOpenCount();
        m32264h(i);
        m32261k(i);
    }

    /* renamed from: k */
    public void m32261k(int i) {
        PDOutlineNode m32269c = m32269c();
        if (m32269c != null) {
            if (m32269c.isNodeOpen()) {
                m32269c.m32264h(m32269c.getOpenCount() + i);
                m32269c.m32261k(i);
                return;
            }
            m32269c.m32264h(m32269c.getOpenCount() - i);
        }
    }

    /* renamed from: l */
    public void m32260l(PDOutlineItem pDOutlineItem) {
        int i = 1;
        if (pDOutlineItem.isNodeOpen()) {
            i = 1 + pDOutlineItem.getOpenCount();
        }
        pDOutlineItem.m32261k(i);
    }

    public void openNode() {
        if (!isNodeOpen()) {
            m32262j();
        }
    }

    public PDOutlineNode(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
