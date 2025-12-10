package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class PDPageLabels implements COSObjectable {

    /* renamed from: a */
    public Map f60172a;

    /* renamed from: b */
    public PDDocument f60173b;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.PDPageLabels$a */
    /* loaded from: classes5.dex */
    public class C9906a implements InterfaceC9909d {

        /* renamed from: a */
        public final /* synthetic */ Map f60174a;

        public C9906a(Map map) {
            this.f60174a = map;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.PDPageLabels.InterfaceC9909d
        /* renamed from: a */
        public void mo32547a(int i, String str) {
            this.f60174a.put(str, Integer.valueOf(i));
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.PDPageLabels$b */
    /* loaded from: classes5.dex */
    public class C9907b implements InterfaceC9909d {

        /* renamed from: a */
        public final /* synthetic */ int f60176a;

        /* renamed from: b */
        public final /* synthetic */ String[] f60177b;

        public C9907b(int i, String[] strArr) {
            this.f60176a = i;
            this.f60177b = strArr;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.PDPageLabels.InterfaceC9909d
        /* renamed from: a */
        public void mo32547a(int i, String str) {
            if (i < this.f60176a) {
                this.f60177b[i] = str;
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.PDPageLabels$c */
    /* loaded from: classes5.dex */
    public static class C9908c implements Iterator {

        /* renamed from: d */
        public static final String[][] f60179d = {new String[]{"", "i", "ii", "iii", "iv", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "vi", "vii", "viii", "ix"}, new String[]{"", "x", "xx", "xxx", "xl", OperatorName.LINE_TO, "lx", "lxx", "lxxx", "xc"}, new String[]{"", OperatorName.CURVE_TO, "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", OperatorName.CONCAT}};

        /* renamed from: a */
        public final PDPageLabelRange f60180a;

        /* renamed from: b */
        public final int f60181b;

        /* renamed from: c */
        public int f60182c = 0;

        public C9908c(PDPageLabelRange pDPageLabelRange, int i) {
            this.f60180a = pDPageLabelRange;
            this.f60181b = i;
        }

        /* renamed from: b */
        public static String m32550b(int i) {
            StringBuilder sb = new StringBuilder();
            int i2 = i / 26;
            int i3 = i % 26;
            int signum = i2 + Integer.signum(i3);
            int signum2 = i3 + ((1 - Integer.signum(i3)) * 26) + 96;
            for (int i4 = 0; i4 < signum; i4++) {
                sb.appendCodePoint(signum2);
            }
            return sb.toString();
        }

        /* renamed from: c */
        public static String m32549c(int i) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 3 && i > 0; i2++) {
                sb.insert(0, f60179d[i2][i % 10]);
                i /= 10;
            }
            for (int i3 = 0; i3 < i; i3++) {
                sb.insert(0, 'm');
            }
            return sb.toString();
        }

        /* renamed from: a */
        public final String m32551a(int i, String str) {
            if ("D".equals(str)) {
                return Integer.toString(i);
            }
            if (PDPageLabelRange.STYLE_LETTERS_LOWER.equals(str)) {
                return m32550b(i);
            }
            if ("A".equals(str)) {
                return m32550b(i).toUpperCase();
            }
            if (PDPageLabelRange.STYLE_ROMAN_LOWER.equals(str)) {
                return m32549c(i);
            }
            if ("R".equals(str)) {
                return m32549c(i).toUpperCase();
            }
            return Integer.toString(i);
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public String next() {
            if (hasNext()) {
                StringBuilder sb = new StringBuilder();
                String prefix = this.f60180a.getPrefix();
                if (prefix != null) {
                    int indexOf = prefix.indexOf(0);
                    if (indexOf > -1) {
                        prefix = prefix.substring(0, indexOf);
                    }
                    sb.append(prefix);
                }
                String style = this.f60180a.getStyle();
                if (style != null) {
                    sb.append(m32551a(this.f60180a.getStart() + this.f60182c, style));
                }
                this.f60182c++;
                return sb.toString();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f60182c < this.f60181b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.PDPageLabels$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC9909d {
        /* renamed from: a */
        void mo32547a(int i, String str);
    }

    public PDPageLabels(PDDocument pDDocument) {
        this.f60172a = new TreeMap();
        this.f60173b = pDDocument;
        PDPageLabelRange pDPageLabelRange = new PDPageLabelRange();
        pDPageLabelRange.setStyle("D");
        this.f60172a.put(0, pDPageLabelRange);
    }

    /* renamed from: a */
    public final void m32553a(InterfaceC9909d interfaceC9909d) {
        Iterator it = this.f60172a.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            C9908c c9908c = new C9908c((PDPageLabelRange) entry.getValue(), ((Integer) entry2.getKey()).intValue() - ((Integer) entry.getKey()).intValue());
            while (c9908c.hasNext()) {
                interfaceC9909d.mo32547a(i, c9908c.next());
                i++;
            }
            entry = entry2;
        }
        C9908c c9908c2 = new C9908c((PDPageLabelRange) entry.getValue(), this.f60173b.getNumberOfPages() - ((Integer) entry.getKey()).intValue());
        while (c9908c2.hasNext()) {
            interfaceC9909d.mo32547a(i, c9908c2.next());
            i++;
        }
    }

    /* renamed from: b */
    public final void m32552b(PDNumberTreeNode pDNumberTreeNode) {
        List<PDNumberTreeNode> kids = pDNumberTreeNode.getKids();
        if (pDNumberTreeNode.getKids() != null) {
            for (PDNumberTreeNode pDNumberTreeNode2 : kids) {
                m32552b(pDNumberTreeNode2);
            }
            return;
        }
        Map<Integer, COSObjectable> numbers = pDNumberTreeNode.getNumbers();
        if (numbers != null) {
            for (Map.Entry<Integer, COSObjectable> entry : numbers.entrySet()) {
                if (entry.getKey().intValue() >= 0) {
                    this.f60172a.put(entry.getKey(), (PDPageLabelRange) entry.getValue());
                }
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        COSDictionary cOSDictionary = new COSDictionary();
        COSArray cOSArray = new COSArray();
        for (Map.Entry entry : this.f60172a.entrySet()) {
            cOSArray.add((COSBase) COSInteger.get(((Integer) entry.getKey()).intValue()));
            cOSArray.add((COSObjectable) entry.getValue());
        }
        cOSDictionary.setItem(COSName.NUMS, (COSBase) cOSArray);
        return cOSDictionary;
    }

    public String[] getLabelsByPageIndices() {
        int numberOfPages = this.f60173b.getNumberOfPages();
        String[] strArr = new String[numberOfPages];
        m32553a(new C9907b(numberOfPages, strArr));
        return strArr;
    }

    public NavigableSet<Integer> getPageIndices() {
        return new TreeSet(this.f60172a.keySet());
    }

    public Map<String, Integer> getPageIndicesByLabels() {
        HashMap hashMap = new HashMap(this.f60173b.getNumberOfPages());
        m32553a(new C9906a(hashMap));
        return hashMap;
    }

    public PDPageLabelRange getPageLabelRange(int i) {
        return (PDPageLabelRange) this.f60172a.get(Integer.valueOf(i));
    }

    public int getPageRangeCount() {
        return this.f60172a.size();
    }

    public void setLabelItem(int i, PDPageLabelRange pDPageLabelRange) {
        if (i >= 0) {
            this.f60172a.put(Integer.valueOf(i), pDPageLabelRange);
            return;
        }
        throw new IllegalArgumentException("startPage parameter of setLabelItem may not be < 0");
    }

    public PDPageLabels(PDDocument pDDocument, COSDictionary cOSDictionary) throws IOException {
        this(pDDocument);
        if (cOSDictionary == null) {
            return;
        }
        m32552b(new PDNumberTreeNode(cOSDictionary, PDPageLabelRange.class));
    }
}