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
    public final Map f60040a;

    /* renamed from: b */
    public final Set f60041b;

    /* renamed from: c */
    public final COSStream f60042c;

    /* renamed from: d */
    public long f60043d;

    /* renamed from: com.tom_roush.pdfbox.pdfparser.PDFXRefStream$a */
    /* loaded from: classes5.dex */
    public static class C9896a {

        /* renamed from: a */
        public int f60044a;

        /* renamed from: b */
        public long f60045b;
    }

    /* renamed from: com.tom_roush.pdfbox.pdfparser.PDFXRefStream$b */
    /* loaded from: classes5.dex */
    public static class C9897b {

        /* renamed from: a */
        public int f60046a;

        /* renamed from: b */
        public long f60047b;
    }

    @Deprecated
    public PDFXRefStream() {
        this.f60043d = -1L;
        this.f60042c = new COSStream();
        this.f60040a = new TreeMap();
        this.f60041b = new TreeSet();
    }

    /* renamed from: a */
    public final List m32634a() {
        LinkedList linkedList = new LinkedList();
        TreeSet<Long> treeSet = new TreeSet();
        treeSet.add(0L);
        treeSet.addAll(this.f60041b);
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
        this.f60041b.add(Long.valueOf(cOSWriterXRefEntry.getKey().getNumber()));
        if (cOSWriterXRefEntry.isFree()) {
            C9896a c9896a = new C9896a();
            c9896a.f60044a = cOSWriterXRefEntry.getKey().getGeneration();
            long number = cOSWriterXRefEntry.getKey().getNumber();
            c9896a.f60045b = number;
            this.f60040a.put(Long.valueOf(number), c9896a);
            return;
        }
        C9897b c9897b = new C9897b();
        c9897b.f60046a = cOSWriterXRefEntry.getKey().getGeneration();
        c9897b.f60047b = cOSWriterXRefEntry.getOffset();
        this.f60040a.put(Long.valueOf(cOSWriterXRefEntry.getKey().getNumber()), c9897b);
    }

    public void addTrailerInfo(COSDictionary cOSDictionary) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSName key = entry.getKey();
            if (COSName.INFO.equals(key) || COSName.ROOT.equals(key) || COSName.ENCRYPT.equals(key) || COSName.f59803ID.equals(key) || COSName.PREV.equals(key)) {
                this.f60042c.setItem(key, entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public final int[] m32633b() {
        long[] jArr = new long[3];
        Iterator it = this.f60040a.values().iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C9896a) {
                    C9896a c9896a = (C9896a) next;
                    jArr[0] = Math.max(jArr[0], 0L);
                    jArr[1] = Math.max(jArr[1], c9896a.f60045b);
                    jArr[2] = Math.max(jArr[2], c9896a.f60044a);
                } else if (next instanceof C9897b) {
                    C9897b c9897b = (C9897b) next;
                    jArr[0] = Math.max(jArr[0], 1L);
                    jArr[1] = Math.max(jArr[1], c9897b.f60047b);
                    jArr[2] = Math.max(jArr[2], c9897b.f60046a);
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
    public final void m32632c(OutputStream outputStream, long j, int i) {
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
    public final void m32631d(OutputStream outputStream, int[] iArr) {
        m32632c(outputStream, 0L, iArr[0]);
        m32632c(outputStream, 0L, iArr[1]);
        m32632c(outputStream, WebSocketProtocol.PAYLOAD_SHORT_MAX, iArr[2]);
        for (Object obj : this.f60040a.values()) {
            if (obj instanceof C9896a) {
                C9896a c9896a = (C9896a) obj;
                m32632c(outputStream, 0L, iArr[0]);
                m32632c(outputStream, c9896a.f60045b, iArr[1]);
                m32632c(outputStream, c9896a.f60044a, iArr[2]);
            } else if (obj instanceof C9897b) {
                C9897b c9897b = (C9897b) obj;
                m32632c(outputStream, 1L, iArr[0]);
                m32632c(outputStream, c9897b.f60047b, iArr[1]);
                m32632c(outputStream, c9897b.f60046a, iArr[2]);
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
        this.f60042c.setItem(COSName.TYPE, (COSBase) COSName.XREF);
        long j = this.f60043d;
        if (j != -1) {
            this.f60042c.setLong(COSName.SIZE, j);
            List<Long> m32634a = m32634a();
            COSArray cOSArray = new COSArray();
            for (Long l : m32634a) {
                cOSArray.add((COSBase) COSInteger.get(l.longValue()));
            }
            this.f60042c.setItem(COSName.INDEX, (COSBase) cOSArray);
            int[] m32633b = m32633b();
            COSArray cOSArray2 = new COSArray();
            for (int i : m32633b) {
                cOSArray2.add((COSBase) COSInteger.get(i));
            }
            this.f60042c.setItem(COSName.f59858W, (COSBase) cOSArray2);
            OutputStream createOutputStream = this.f60042c.createOutputStream(COSName.FLATE_DECODE);
            m32631d(createOutputStream, m32633b);
            createOutputStream.flush();
            createOutputStream.close();
            for (COSName cOSName : this.f60042c.keySet()) {
                if (!COSName.ROOT.equals(cOSName) && !COSName.INFO.equals(cOSName) && !COSName.PREV.equals(cOSName) && !COSName.ENCRYPT.equals(cOSName)) {
                    this.f60042c.getDictionaryObject(cOSName).setDirect(true);
                }
            }
            return this.f60042c;
        }
        throw new IllegalArgumentException("size is not set in xrefstream");
    }

    public void setSize(long j) {
        this.f60043d = j;
    }

    public PDFXRefStream(COSDocument cOSDocument) {
        this.f60043d = -1L;
        this.f60042c = cOSDocument.createCOSStream();
        this.f60040a = new TreeMap();
        this.f60041b = new TreeSet();
    }
}