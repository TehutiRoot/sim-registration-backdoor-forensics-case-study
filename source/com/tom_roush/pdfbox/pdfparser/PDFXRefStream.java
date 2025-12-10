package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdfwriter.COSWriterXRefEntry;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public class PDFXRefStream implements PDFXRef {

    /* renamed from: a */
    public final Map f60028a;

    /* renamed from: b */
    public final Set f60029b;

    /* renamed from: c */
    public final COSStream f60030c;

    /* renamed from: d */
    public long f60031d;

    /* renamed from: com.tom_roush.pdfbox.pdfparser.PDFXRefStream$a */
    /* loaded from: classes5.dex */
    public static class C9907a {

        /* renamed from: a */
        public int f60032a;

        /* renamed from: b */
        public long f60033b;
    }

    /* renamed from: com.tom_roush.pdfbox.pdfparser.PDFXRefStream$b */
    /* loaded from: classes5.dex */
    public static class C9908b {

        /* renamed from: a */
        public int f60034a;

        /* renamed from: b */
        public long f60035b;
    }

    @Deprecated
    public PDFXRefStream() {
        this.f60031d = -1L;
        this.f60030c = new COSStream();
        this.f60028a = new TreeMap();
        this.f60029b = new TreeSet();
    }

    /* renamed from: a */
    public final List m32642a() {
        LinkedList linkedList = new LinkedList();
        TreeSet<Long> treeSet = new TreeSet();
        treeSet.add(0L);
        treeSet.addAll(this.f60029b);
        Long l = null;
        Long l2 = null;
        for (Long l3 : treeSet) {
            if (l == null) {
                l2 = 1L;
                l = l3;
            }
            if (l.longValue() + l2.longValue() == l3.longValue()) {
                l2 = Long.valueOf(l2.longValue() + 1);
            }
            if (l.longValue() + l2.longValue() < l3.longValue()) {
                linkedList.add(l);
                linkedList.add(l2);
                l2 = 1L;
                l = l3;
            }
        }
        linkedList.add(l);
        linkedList.add(l2);
        return linkedList;
    }

    public void addEntry(COSWriterXRefEntry cOSWriterXRefEntry) {
        this.f60029b.add(Long.valueOf(cOSWriterXRefEntry.getKey().getNumber()));
        if (cOSWriterXRefEntry.isFree()) {
            C9907a c9907a = new C9907a();
            c9907a.f60032a = cOSWriterXRefEntry.getKey().getGeneration();
            long number = cOSWriterXRefEntry.getKey().getNumber();
            c9907a.f60033b = number;
            this.f60028a.put(Long.valueOf(number), c9907a);
            return;
        }
        C9908b c9908b = new C9908b();
        c9908b.f60034a = cOSWriterXRefEntry.getKey().getGeneration();
        c9908b.f60035b = cOSWriterXRefEntry.getOffset();
        this.f60028a.put(Long.valueOf(cOSWriterXRefEntry.getKey().getNumber()), c9908b);
    }

    public void addTrailerInfo(COSDictionary cOSDictionary) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSName key = entry.getKey();
            if (COSName.INFO.equals(key) || COSName.ROOT.equals(key) || COSName.ENCRYPT.equals(key) || COSName.f59791ID.equals(key) || COSName.PREV.equals(key)) {
                this.f60030c.setItem(key, entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public final int[] m32641b() {
        long[] jArr = new long[3];
        Iterator it = this.f60028a.values().iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C9907a) {
                    C9907a c9907a = (C9907a) next;
                    jArr[0] = Math.max(jArr[0], 0L);
                    jArr[1] = Math.max(jArr[1], c9907a.f60033b);
                    jArr[2] = Math.max(jArr[2], c9907a.f60032a);
                } else if (next instanceof C9908b) {
                    C9908b c9908b = (C9908b) next;
                    jArr[0] = Math.max(jArr[0], 1L);
                    jArr[1] = Math.max(jArr[1], c9908b.f60035b);
                    jArr[2] = Math.max(jArr[2], c9908b.f60034a);
                } else {
                    throw new RuntimeException("unexpected reference type");
                }
            } else {
                int[] iArr = new int[3];
                for (int i = 0; i < 3; i++) {
                    while (true) {
                        long j = jArr[i];
                        if (j > 0) {
                            iArr[i] = iArr[i] + 1;
                            jArr[i] = j >> 8;
                        }
                    }
                }
                return iArr;
            }
        }
    }

    /* renamed from: c */
    public final void m32640c(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 & j);
            j >>= 8;
        }
        for (int i3 = 0; i3 < i; i3++) {
            outputStream.write(bArr[(i - i3) - 1]);
        }
    }

    /* renamed from: d */
    public final void m32639d(OutputStream outputStream, int[] iArr) {
        m32640c(outputStream, 0L, iArr[0]);
        m32640c(outputStream, 0L, iArr[1]);
        m32640c(outputStream, WebSocketProtocol.PAYLOAD_SHORT_MAX, iArr[2]);
        for (Object obj : this.f60028a.values()) {
            if (obj instanceof C9907a) {
                C9907a c9907a = (C9907a) obj;
                m32640c(outputStream, 0L, iArr[0]);
                m32640c(outputStream, c9907a.f60033b, iArr[1]);
                m32640c(outputStream, c9907a.f60032a, iArr[2]);
            } else if (obj instanceof C9908b) {
                C9908b c9908b = (C9908b) obj;
                m32640c(outputStream, 1L, iArr[0]);
                m32640c(outputStream, c9908b.f60035b, iArr[1]);
                m32640c(outputStream, c9908b.f60034a, iArr[2]);
            } else {
                throw new RuntimeException("unexpected reference type");
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdfparser.PDFXRef
    public COSObject getObject(int i) {
        return null;
    }

    public COSStream getStream() throws IOException {
        this.f60030c.setItem(COSName.TYPE, (COSBase) COSName.XREF);
        long j = this.f60031d;
        if (j != -1) {
            this.f60030c.setLong(COSName.SIZE, j);
            List<Long> m32642a = m32642a();
            COSArray cOSArray = new COSArray();
            for (Long l : m32642a) {
                cOSArray.add((COSBase) COSInteger.get(l.longValue()));
            }
            this.f60030c.setItem(COSName.INDEX, (COSBase) cOSArray);
            int[] m32641b = m32641b();
            COSArray cOSArray2 = new COSArray();
            for (int i : m32641b) {
                cOSArray2.add((COSBase) COSInteger.get(i));
            }
            this.f60030c.setItem(COSName.f59846W, (COSBase) cOSArray2);
            OutputStream createOutputStream = this.f60030c.createOutputStream(COSName.FLATE_DECODE);
            m32639d(createOutputStream, m32641b);
            createOutputStream.flush();
            createOutputStream.close();
            for (COSName cOSName : this.f60030c.keySet()) {
                if (!COSName.ROOT.equals(cOSName) && !COSName.INFO.equals(cOSName) && !COSName.PREV.equals(cOSName) && !COSName.ENCRYPT.equals(cOSName)) {
                    this.f60030c.getDictionaryObject(cOSName).setDirect(true);
                }
            }
            return this.f60030c;
        }
        throw new IllegalArgumentException("size is not set in xrefstream");
    }

    public void setSize(long j) {
        this.f60031d = j;
    }

    public PDFXRefStream(COSDocument cOSDocument) {
        this.f60031d = -1L;
        this.f60030c = cOSDocument.createCOSStream();
        this.f60028a = new TreeMap();
        this.f60029b = new TreeSet();
    }
}
