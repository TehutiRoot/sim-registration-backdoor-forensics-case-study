package com.tom_roush.pdfbox.pdmodel;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class PDPageTree implements COSObjectable, Iterable<PDPage> {

    /* renamed from: a */
    public final COSDictionary f60133a;

    /* renamed from: b */
    public final PDDocument f60134b;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.PDPageTree$b */
    /* loaded from: classes5.dex */
    public final class C9915b implements Iterator {

        /* renamed from: a */
        public final Queue f60135a;

        /* renamed from: b */
        public Set f60136b;

        /* renamed from: a */
        public final void m32580a(COSDictionary cOSDictionary) {
            if (PDPageTree.this.m32583i(cOSDictionary)) {
                for (COSDictionary cOSDictionary2 : PDPageTree.this.m32585g(cOSDictionary)) {
                    if (!this.f60136b.contains(cOSDictionary2)) {
                        if (cOSDictionary2.containsKey(COSName.KIDS)) {
                            this.f60136b.add(cOSDictionary2);
                        }
                        m32580a(cOSDictionary2);
                    }
                }
                return;
            }
            this.f60135a.add(cOSDictionary);
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public PDPage next() {
            ResourceCache resourceCache;
            if (hasNext()) {
                COSDictionary cOSDictionary = (COSDictionary) this.f60135a.poll();
                PDPageTree.m32581k(cOSDictionary);
                if (PDPageTree.this.f60134b != null) {
                    resourceCache = PDPageTree.this.f60134b.getResourceCache();
                } else {
                    resourceCache = null;
                }
                return new PDPage(cOSDictionary, resourceCache);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f60135a.isEmpty();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C9915b(COSDictionary cOSDictionary) {
            this.f60135a = new ArrayDeque();
            this.f60136b = new HashSet();
            m32580a(cOSDictionary);
            this.f60136b = null;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.PDPageTree$c */
    /* loaded from: classes5.dex */
    public static final class C9916c {

        /* renamed from: a */
        public final COSDictionary f60138a;

        /* renamed from: b */
        public int f60139b;

        /* renamed from: c */
        public boolean f60140c;

        /* renamed from: d */
        public final void m32575d(COSDictionary cOSDictionary) {
            boolean z = true;
            this.f60139b++;
            if (this.f60138a != cOSDictionary) {
                z = false;
            }
            this.f60140c = z;
        }

        public C9916c(PDPage pDPage) {
            this.f60139b = -1;
            this.f60138a = pDPage.getCOSObject();
        }
    }

    public PDPageTree() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60133a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.PAGES);
        cOSDictionary.setItem(COSName.KIDS, (COSBase) new COSArray());
        cOSDictionary.setItem(COSName.COUNT, (COSBase) COSInteger.ZERO);
        this.f60134b = null;
    }

    public static COSBase getInheritableAttribute(COSDictionary cOSDictionary, COSName cOSName) {
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject != null) {
            return dictionaryObject;
        }
        COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.f59815P);
        if (dictionaryObject2 instanceof COSDictionary) {
            COSDictionary cOSDictionary2 = (COSDictionary) dictionaryObject2;
            if (COSName.PAGES.equals(cOSDictionary2.getDictionaryObject(COSName.TYPE))) {
                return getInheritableAttribute(cOSDictionary2, cOSName);
            }
            return null;
        }
        return null;
    }

    /* renamed from: k */
    public static void m32581k(COSDictionary cOSDictionary) {
        COSName cOSName = COSName.TYPE;
        COSName cOSName2 = cOSDictionary.getCOSName(cOSName);
        if (cOSName2 == null) {
            cOSDictionary.setItem(cOSName, (COSBase) COSName.PAGE);
        } else if (COSName.PAGE.equals(cOSName2)) {
        } else {
            throw new IllegalStateException("Expected 'Page' but found " + cOSName2);
        }
    }

    public void add(PDPage pDPage) {
        COSDictionary cOSObject = pDPage.getCOSObject();
        cOSObject.setItem(COSName.PARENT, (COSBase) this.f60133a);
        ((COSArray) this.f60133a.getDictionaryObject(COSName.KIDS)).add((COSBase) cOSObject);
        do {
            cOSObject = (COSDictionary) cOSObject.getDictionaryObject(COSName.PARENT, COSName.f59815P);
            if (cOSObject != null) {
                COSName cOSName = COSName.COUNT;
                cOSObject.setInt(cOSName, cOSObject.getInt(cOSName) + 1);
                continue;
            }
        } while (cOSObject != null);
    }

    /* renamed from: e */
    public final boolean m32587e(C9916c c9916c, COSDictionary cOSDictionary) {
        for (COSDictionary cOSDictionary2 : m32585g(cOSDictionary)) {
            if (c9916c.f60140c) {
                break;
            } else if (!m32583i(cOSDictionary2)) {
                c9916c.m32575d(cOSDictionary2);
            } else {
                m32587e(c9916c, cOSDictionary2);
            }
        }
        return c9916c.f60140c;
    }

    /* renamed from: f */
    public final COSDictionary m32586f(int i, COSDictionary cOSDictionary, int i2) {
        if (i >= 1) {
            if (m32583i(cOSDictionary)) {
                if (i <= cOSDictionary.getInt(COSName.COUNT, 0) + i2) {
                    for (COSDictionary cOSDictionary2 : m32585g(cOSDictionary)) {
                        if (m32583i(cOSDictionary2)) {
                            int i3 = cOSDictionary2.getInt(COSName.COUNT, 0) + i2;
                            if (i <= i3) {
                                return m32586f(i, cOSDictionary2, i2);
                            }
                            i2 = i3;
                        } else {
                            i2++;
                            if (i == i2) {
                                return m32586f(i, cOSDictionary2, i2);
                            }
                        }
                    }
                    throw new IllegalStateException("1-based index not found: " + i);
                }
                throw new IndexOutOfBoundsException("1-based index out of bounds: " + i);
            } else if (i2 == i) {
                return cOSDictionary;
            } else {
                throw new IllegalStateException("1-based index not found: " + i);
            }
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + i);
    }

    /* renamed from: g */
    public final List m32585g(COSDictionary cOSDictionary) {
        String simpleName;
        ArrayList arrayList = new ArrayList();
        COSArray cOSArray = cOSDictionary.getCOSArray(COSName.KIDS);
        if (cOSArray == null) {
            return arrayList;
        }
        int size = cOSArray.size();
        for (int i = 0; i < size; i++) {
            COSBase object = cOSArray.getObject(i);
            if (object instanceof COSDictionary) {
                arrayList.add((COSDictionary) object);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("COSDictionary expected, but got ");
                if (object == null) {
                    simpleName = AbstractJsonLexerKt.NULL;
                } else {
                    simpleName = object.getClass().getSimpleName();
                }
                sb.append(simpleName);
                Log.w("PdfBox-Android", sb.toString());
            }
        }
        return arrayList;
    }

    public PDPage get(int i) {
        ResourceCache resourceCache;
        COSDictionary m32586f = m32586f(i + 1, this.f60133a, 0);
        m32581k(m32586f);
        PDDocument pDDocument = this.f60134b;
        if (pDDocument != null) {
            resourceCache = pDDocument.getResourceCache();
        } else {
            resourceCache = null;
        }
        return new PDPage(m32586f, resourceCache);
    }

    public int getCount() {
        return this.f60133a.getInt(COSName.COUNT, 0);
    }

    /* renamed from: h */
    public final void m32584h(COSDictionary cOSDictionary) {
        do {
            COSName cOSName = COSName.COUNT;
            cOSDictionary.setInt(cOSName, cOSDictionary.getInt(cOSName) + 1);
            cOSDictionary = (COSDictionary) cOSDictionary.getDictionaryObject(COSName.PARENT);
        } while (cOSDictionary != null);
    }

    /* renamed from: i */
    public final boolean m32583i(COSDictionary cOSDictionary) {
        if (cOSDictionary != null && (cOSDictionary.getCOSName(COSName.TYPE) == COSName.PAGES || cOSDictionary.containsKey(COSName.KIDS))) {
            return true;
        }
        return false;
    }

    public int indexOf(PDPage pDPage) {
        C9916c c9916c = new C9916c(pDPage);
        if (m32587e(c9916c, this.f60133a)) {
            return c9916c.f60139b;
        }
        return -1;
    }

    public void insertAfter(PDPage pDPage, PDPage pDPage2) {
        COSDictionary cOSDictionary = (COSDictionary) pDPage2.getCOSObject().getDictionaryObject(COSName.PARENT);
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(COSName.KIDS);
        for (int i = 0; i < cOSArray.size(); i++) {
            if (((COSDictionary) cOSArray.getObject(i)).equals(pDPage2.getCOSObject())) {
                cOSArray.add(i + 1, pDPage.getCOSObject());
                pDPage.getCOSObject().setItem(COSName.PARENT, (COSBase) cOSDictionary);
                m32584h(cOSDictionary);
                return;
            }
        }
        throw new IllegalArgumentException("attempted to insert before orphan page");
    }

    public void insertBefore(PDPage pDPage, PDPage pDPage2) {
        COSDictionary cOSDictionary = (COSDictionary) pDPage2.getCOSObject().getDictionaryObject(COSName.PARENT);
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(COSName.KIDS);
        for (int i = 0; i < cOSArray.size(); i++) {
            if (((COSDictionary) cOSArray.getObject(i)).equals(pDPage2.getCOSObject())) {
                cOSArray.add(i, pDPage.getCOSObject());
                pDPage.getCOSObject().setItem(COSName.PARENT, (COSBase) cOSDictionary);
                m32584h(cOSDictionary);
                return;
            }
        }
        throw new IllegalArgumentException("attempted to insert before orphan page");
    }

    @Override // java.lang.Iterable
    public Iterator<PDPage> iterator() {
        return new C9915b(this.f60133a);
    }

    /* renamed from: j */
    public final void m32582j(COSDictionary cOSDictionary) {
        if (((COSArray) ((COSDictionary) cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.f59815P)).getDictionaryObject(COSName.KIDS)).removeObject(cOSDictionary)) {
            do {
                cOSDictionary = (COSDictionary) cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.f59815P);
                if (cOSDictionary != null) {
                    COSName cOSName = COSName.COUNT;
                    cOSDictionary.setInt(cOSName, cOSDictionary.getInt(cOSName) - 1);
                    continue;
                }
            } while (cOSDictionary != null);
        }
    }

    public void remove(int i) {
        m32582j(m32586f(i + 1, this.f60133a, 0));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60133a;
    }

    public void remove(PDPage pDPage) {
        m32582j(pDPage.getCOSObject());
    }

    public PDPageTree(COSDictionary cOSDictionary) {
        this(cOSDictionary, null);
    }

    public PDPageTree(COSDictionary cOSDictionary, PDDocument pDDocument) {
        if (cOSDictionary != null) {
            if (COSName.PAGE.equals(cOSDictionary.getCOSName(COSName.TYPE))) {
                COSArray cOSArray = new COSArray();
                cOSArray.add((COSBase) cOSDictionary);
                COSDictionary cOSDictionary2 = new COSDictionary();
                this.f60133a = cOSDictionary2;
                cOSDictionary2.setItem(COSName.KIDS, (COSBase) cOSArray);
                cOSDictionary2.setInt(COSName.COUNT, 1);
            } else {
                this.f60133a = cOSDictionary;
            }
            this.f60134b = pDDocument;
            return;
        }
        throw new IllegalArgumentException("page tree root cannot be null");
    }
}
