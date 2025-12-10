package com.tom_roush.pdfbox.pdfwriter;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.cos.COSUpdateInfo;
import com.tom_roush.pdfbox.cos.ICOSVisitor;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.RandomAccessInputStream;
import com.tom_roush.pdfbox.p019io.RandomAccessRead;
import com.tom_roush.pdfbox.pdfparser.PDFXRefStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Hex;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes5.dex */
public class COSWriter implements ICOSVisitor, Closeable {
    public static final byte[] ARRAY_CLOSE;
    public static final byte[] ARRAY_OPEN;
    public static final byte[] COMMENT;
    public static final byte[] DICT_CLOSE;
    public static final byte[] DICT_OPEN;
    public static final byte[] ENDOBJ;
    public static final byte[] ENDSTREAM;
    public static final byte[] EOF;
    public static final byte[] GARBAGE;
    public static final byte[] OBJ;
    public static final byte[] REFERENCE;
    public static final byte[] SPACE;
    public static final byte[] STARTXREF;
    public static final byte[] STREAM;
    public static final byte[] TRAILER;
    public static final byte[] VERSION;
    public static final byte[] XREF;
    public static final byte[] XREF_FREE;
    public static final byte[] XREF_USED;

    /* renamed from: A */
    public byte[] f60066A;

    /* renamed from: B */
    public COSArray f60067B;

    /* renamed from: a */
    public final NumberFormat f60068a;

    /* renamed from: b */
    public final NumberFormat f60069b;

    /* renamed from: c */
    public OutputStream f60070c;

    /* renamed from: d */
    public COSStandardOutputStream f60071d;

    /* renamed from: e */
    public long f60072e;

    /* renamed from: f */
    public long f60073f;

    /* renamed from: g */
    public final Map f60074g;

    /* renamed from: h */
    public final Map f60075h;

    /* renamed from: i */
    public final List f60076i;

    /* renamed from: j */
    public final Set f60077j;

    /* renamed from: k */
    public final Deque f60078k;

    /* renamed from: l */
    public final Set f60079l;

    /* renamed from: m */
    public final Set f60080m;

    /* renamed from: n */
    public COSObjectKey f60081n;

    /* renamed from: o */
    public PDDocument f60082o;

    /* renamed from: p */
    public FDFDocument f60083p;

    /* renamed from: q */
    public boolean f60084q;

    /* renamed from: r */
    public boolean f60085r;

    /* renamed from: s */
    public boolean f60086s;

    /* renamed from: t */
    public long f60087t;

    /* renamed from: u */
    public long f60088u;

    /* renamed from: v */
    public long f60089v;

    /* renamed from: w */
    public long f60090w;

    /* renamed from: x */
    public RandomAccessRead f60091x;

    /* renamed from: y */
    public OutputStream f60092y;

    /* renamed from: z */
    public SignatureInterface f60093z;

    static {
        Charset charset = Charsets.US_ASCII;
        DICT_OPEN = "<<".getBytes(charset);
        DICT_CLOSE = ">>".getBytes(charset);
        SPACE = new byte[]{32};
        COMMENT = new byte[]{37};
        VERSION = "PDF-1.4".getBytes(charset);
        GARBAGE = new byte[]{-10, -28, -4, -33};
        EOF = "%%EOF".getBytes(charset);
        REFERENCE = "R".getBytes(charset);
        XREF = "xref".getBytes(charset);
        XREF_FREE = OperatorName.FILL_NON_ZERO.getBytes(charset);
        XREF_USED = OperatorName.ENDPATH.getBytes(charset);
        TRAILER = "trailer".getBytes(charset);
        STARTXREF = "startxref".getBytes(charset);
        OBJ = "obj".getBytes(charset);
        ENDOBJ = "endobj".getBytes(charset);
        ARRAY_OPEN = "[".getBytes(charset);
        ARRAY_CLOSE = "]".getBytes(charset);
        STREAM = "stream".getBytes(charset);
        ENDSTREAM = "endstream".getBytes(charset);
    }

    public COSWriter(OutputStream outputStream) {
        Locale locale = Locale.US;
        this.f60068a = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.f60069b = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.f60072e = 0L;
        this.f60073f = 0L;
        this.f60074g = new Hashtable();
        this.f60075h = new HashMap();
        this.f60076i = new ArrayList();
        this.f60077j = new HashSet();
        this.f60078k = new LinkedList();
        this.f60079l = new HashSet();
        this.f60080m = new HashSet();
        this.f60081n = null;
        this.f60082o = null;
        this.f60083p = null;
        this.f60084q = false;
        this.f60085r = false;
        this.f60086s = false;
        m32613o(outputStream);
        m32612p(new COSStandardOutputStream(this.f60070c));
    }

    /* renamed from: q */
    public static void m32611q(byte[] bArr, boolean z, OutputStream outputStream) {
        if (!z) {
            for (byte b : bArr) {
                if (b < 0 || b == 13 || b == 10) {
                    break;
                }
            }
        }
        if (!z) {
            outputStream.write(40);
            for (int i : bArr) {
                if (i != 40 && i != 41 && i != 92) {
                    outputStream.write(i);
                } else {
                    outputStream.write(92);
                    outputStream.write(i);
                }
            }
            outputStream.write(41);
            return;
        }
        outputStream.write(60);
        Hex.writeHexBytes(bArr, outputStream);
        outputStream.write(62);
    }

    public static void writeString(COSString cOSString, OutputStream outputStream) throws IOException {
        m32611q(cOSString.getBytes(), cOSString.getForceHexForm(), outputStream);
    }

    public void addXRefEntry(COSWriterXRefEntry cOSWriterXRefEntry) {
        getXRefEntries().add(cOSWriterXRefEntry);
    }

    /* renamed from: b */
    public final void m32622b(COSBase cOSBase) {
        COSBase cOSBase2;
        COSObjectKey cOSObjectKey;
        if (cOSBase instanceof COSObject) {
            cOSBase2 = ((COSObject) cOSBase).getObject();
        } else {
            cOSBase2 = cOSBase;
        }
        if (!this.f60079l.contains(cOSBase) && !this.f60077j.contains(cOSBase) && !this.f60080m.contains(cOSBase2)) {
            if (cOSBase2 != null && (cOSObjectKey = (COSObjectKey) this.f60074g.get(cOSBase2)) != null) {
                COSBase cOSBase3 = (COSBase) this.f60075h.get(cOSObjectKey);
                if (!m32615m(cOSBase) && !m32615m(cOSBase3)) {
                    return;
                }
            }
            this.f60078k.add(cOSBase);
            this.f60077j.add(cOSBase);
            if (cOSBase2 != null) {
                this.f60080m.add(cOSBase2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (getStandardOutput() != null) {
            getStandardOutput().close();
        }
        OutputStream outputStream = this.f60092y;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    /* renamed from: d */
    public final void m32621d() {
        IOUtils.copy(new RandomAccessInputStream(this.f60091x), this.f60092y);
        this.f60092y.write(((ByteArrayOutputStream) this.f60070c).toByteArray());
    }

    public void doWriteBody(COSDocument cOSDocument) throws IOException {
        COSDictionary trailer = cOSDocument.getTrailer();
        COSDictionary cOSDictionary = trailer.getCOSDictionary(COSName.ROOT);
        COSDictionary cOSDictionary2 = trailer.getCOSDictionary(COSName.INFO);
        COSDictionary cOSDictionary3 = trailer.getCOSDictionary(COSName.ENCRYPT);
        if (cOSDictionary != null) {
            m32622b(cOSDictionary);
        }
        if (cOSDictionary2 != null) {
            m32622b(cOSDictionary2);
        }
        m32620g();
        this.f60084q = false;
        if (cOSDictionary3 != null) {
            m32622b(cOSDictionary3);
        }
        m32620g();
    }

    public void doWriteHeader(COSDocument cOSDocument) throws IOException {
        String str;
        if (this.f60083p != null) {
            str = "%FDF-" + cOSDocument.getVersion();
        } else {
            str = "%PDF-" + cOSDocument.getVersion();
        }
        getStandardOutput().write(str.getBytes(Charsets.ISO_8859_1));
        getStandardOutput().writeEOL();
        getStandardOutput().write(COMMENT);
        getStandardOutput().write(GARBAGE);
        getStandardOutput().writeEOL();
    }

    public void doWriteObject(COSBase cOSBase) throws IOException {
        this.f60079l.add(cOSBase);
        this.f60081n = m32616l(cOSBase);
        addXRefEntry(new COSWriterXRefEntry(getStandardOutput().getPos(), cOSBase, this.f60081n));
        COSStandardOutputStream standardOutput = getStandardOutput();
        String valueOf = String.valueOf(this.f60081n.getNumber());
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(valueOf.getBytes(charset));
        COSStandardOutputStream standardOutput2 = getStandardOutput();
        byte[] bArr = SPACE;
        standardOutput2.write(bArr);
        getStandardOutput().write(String.valueOf(this.f60081n.getGeneration()).getBytes(charset));
        getStandardOutput().write(bArr);
        getStandardOutput().write(OBJ);
        getStandardOutput().writeEOL();
        cOSBase.accept(this);
        getStandardOutput().writeEOL();
        getStandardOutput().write(ENDOBJ);
        getStandardOutput().writeEOL();
    }

    public void doWriteTrailer(COSDocument cOSDocument) throws IOException {
        getStandardOutput().write(TRAILER);
        getStandardOutput().writeEOL();
        COSDictionary trailer = cOSDocument.getTrailer();
        Collections.sort(getXRefEntries());
        trailer.setLong(COSName.SIZE, getXRefEntries().get(getXRefEntries().size() - 1).getKey().getNumber() + 1);
        if (!this.f60085r) {
            trailer.removeItem(COSName.PREV);
        }
        if (!cOSDocument.isXRefStream()) {
            trailer.removeItem(COSName.XREF_STM);
        }
        trailer.removeItem(COSName.DOC_CHECKSUM);
        COSArray cOSArray = trailer.getCOSArray(COSName.f59803ID);
        if (cOSArray != null) {
            cOSArray.setDirect(true);
        }
        trailer.accept(this);
    }

    /* renamed from: g */
    public final void m32620g() {
        while (this.f60078k.size() > 0) {
            COSBase cOSBase = (COSBase) this.f60078k.removeFirst();
            this.f60077j.remove(cOSBase);
            doWriteObject(cOSBase);
        }
    }

    public InputStream getDataToSign() throws IOException {
        RandomAccessRead randomAccessRead;
        if (this.f60066A != null && (randomAccessRead = this.f60091x) != null) {
            int length = (int) (this.f60087t - randomAccessRead.length());
            int i = ((int) this.f60088u) + length;
            return new SequenceInputStream(new RandomAccessInputStream(this.f60091x), new COSFilterInputStream(this.f60066A, new int[]{0, length, i, this.f60066A.length - i}));
        }
        throw new IllegalStateException("PDF not prepared for signing");
    }

    public long getNumber() {
        return this.f60073f;
    }

    public Map<COSBase, COSObjectKey> getObjectKeys() {
        return this.f60074g;
    }

    public OutputStream getOutput() {
        return this.f60070c;
    }

    public COSStandardOutputStream getStandardOutput() {
        return this.f60071d;
    }

    public long getStartxref() {
        return this.f60072e;
    }

    public List<COSWriterXRefEntry> getXRefEntries() {
        return this.f60076i;
    }

    public Long[] getXRefRanges(List<COSWriterXRefEntry> list) {
        ArrayList arrayList = new ArrayList();
        long j = -2;
        long j2 = 1;
        for (COSWriterXRefEntry cOSWriterXRefEntry : list) {
            long number = cOSWriterXRefEntry.getKey().getNumber();
            if (number == j + 1) {
                j2++;
            } else if (j != -2) {
                arrayList.add(Long.valueOf((j - j2) + 1));
                arrayList.add(Long.valueOf(j2));
                j2 = 1;
            }
            j = number;
        }
        if (list.size() > 0) {
            arrayList.add(Long.valueOf((j - j2) + 1));
            arrayList.add(Long.valueOf(j2));
        }
        return (Long[]) arrayList.toArray(new Long[arrayList.size()]);
    }

    /* renamed from: i */
    public final void m32619i() {
        long length = this.f60091x.length();
        long j = this.f60087t;
        long j2 = this.f60088u + j;
        long pos = (getStandardOutput().getPos() - (this.f60088u + length)) - (this.f60087t - length);
        String str = "0 " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + j2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + pos + "]";
        int i = 0;
        this.f60067B.set(0, (COSBase) COSInteger.ZERO);
        this.f60067B.set(1, (COSBase) COSInteger.get(j));
        this.f60067B.set(2, (COSBase) COSInteger.get(j2));
        this.f60067B.set(3, (COSBase) COSInteger.get(pos));
        if (str.length() <= this.f60090w) {
            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f60070c;
            byteArrayOutputStream.flush();
            this.f60066A = byteArrayOutputStream.toByteArray();
            byte[] bytes = str.getBytes(Charsets.ISO_8859_1);
            while (true) {
                long j3 = i;
                if (j3 >= this.f60090w) {
                    break;
                }
                if (i >= bytes.length) {
                    this.f60066A[(int) ((this.f60089v + j3) - length)] = 32;
                } else {
                    this.f60066A[(int) ((this.f60089v + j3) - length)] = bytes[i];
                }
                i++;
            }
            if (this.f60093z != null) {
                writeExternalSignature(this.f60093z.sign(getDataToSign()));
                return;
            }
            return;
        }
        throw new IOException("Can't write new byteRange '" + str + "' not enough space: byteRange.length(): " + str.length() + ", byteRangeLength: " + this.f60090w);
    }

    /* renamed from: j */
    public final void m32618j(COSDocument cOSDocument, long j) {
        if (cOSDocument.isXRefStream() || j != -1) {
            PDFXRefStream pDFXRefStream = new PDFXRefStream(cOSDocument);
            for (COSWriterXRefEntry cOSWriterXRefEntry : getXRefEntries()) {
                pDFXRefStream.addEntry(cOSWriterXRefEntry);
            }
            COSDictionary trailer = cOSDocument.getTrailer();
            if (this.f60085r) {
                trailer.setLong(COSName.PREV, cOSDocument.getStartXref());
            } else {
                trailer.removeItem(COSName.PREV);
            }
            pDFXRefStream.addTrailerInfo(trailer);
            pDFXRefStream.setSize(getNumber() + 2);
            setStartxref(getStandardOutput().getPos());
            doWriteObject(pDFXRefStream.getStream());
        }
        if (!cOSDocument.isXRefStream() || j != -1) {
            COSDictionary trailer2 = cOSDocument.getTrailer();
            trailer2.setLong(COSName.PREV, cOSDocument.getStartXref());
            if (j != -1) {
                COSName cOSName = COSName.XREF_STM;
                trailer2.removeItem(cOSName);
                trailer2.setLong(cOSName, getStartxref());
            }
            m32617k();
            doWriteTrailer(cOSDocument);
        }
    }

    /* renamed from: k */
    public final void m32617k() {
        addXRefEntry(COSWriterXRefEntry.getNullEntry());
        Collections.sort(getXRefEntries());
        setStartxref(getStandardOutput().getPos());
        getStandardOutput().write(XREF);
        getStandardOutput().writeEOL();
        Long[] xRefRanges = getXRefRanges(getXRefEntries());
        int length = xRefRanges.length;
        if (length % 2 == 0) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2 += 2) {
                long longValue = xRefRanges[i2 + 1].longValue();
                m32609s(xRefRanges[i2].longValue(), longValue);
                int i3 = 0;
                while (i3 < longValue) {
                    m32610r((COSWriterXRefEntry) this.f60076i.get(i));
                    i3++;
                    i++;
                }
            }
        }
    }

    /* renamed from: l */
    public final COSObjectKey m32616l(COSBase cOSBase) {
        COSBase cOSBase2;
        if (cOSBase instanceof COSObject) {
            cOSBase2 = ((COSObject) cOSBase).getObject();
        } else {
            cOSBase2 = cOSBase;
        }
        COSObjectKey cOSObjectKey = (COSObjectKey) this.f60074g.get(cOSBase);
        if (cOSObjectKey == null && cOSBase2 != null) {
            cOSObjectKey = (COSObjectKey) this.f60074g.get(cOSBase2);
        }
        if (cOSObjectKey == null) {
            setNumber(getNumber() + 1);
            cOSObjectKey = new COSObjectKey(getNumber(), 0);
            this.f60074g.put(cOSBase, cOSObjectKey);
            if (cOSBase2 != null) {
                this.f60074g.put(cOSBase2, cOSObjectKey);
            }
        }
        return cOSObjectKey;
    }

    /* renamed from: m */
    public final boolean m32615m(COSBase cOSBase) {
        if (cOSBase instanceof COSUpdateInfo) {
            return ((COSUpdateInfo) cOSBase).isNeedToBeUpdated();
        }
        return false;
    }

    /* renamed from: n */
    public final void m32614n(PDDocument pDDocument) {
        if (pDDocument != null) {
            try {
                COSDocument document = pDDocument.getDocument();
                Set<COSObjectKey> keySet = document.getXrefTable().keySet();
                long highestXRefObjectNumber = pDDocument.getDocument().getHighestXRefObjectNumber();
                for (COSObjectKey cOSObjectKey : keySet) {
                    COSBase object = document.getObjectFromPool(cOSObjectKey).getObject();
                    if (object != null && cOSObjectKey != null && !(object instanceof COSNumber)) {
                        this.f60074g.put(object, cOSObjectKey);
                        this.f60075h.put(cOSObjectKey, object);
                    }
                    if (cOSObjectKey != null) {
                        long number = cOSObjectKey.getNumber();
                        if (number > highestXRefObjectNumber) {
                            highestXRefObjectNumber = number;
                        }
                    }
                }
                setNumber(highestXRefObjectNumber);
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    /* renamed from: o */
    public final void m32613o(OutputStream outputStream) {
        this.f60070c = outputStream;
    }

    /* renamed from: p */
    public final void m32612p(COSStandardOutputStream cOSStandardOutputStream) {
        this.f60071d = cOSStandardOutputStream;
    }

    /* renamed from: r */
    public final void m32610r(COSWriterXRefEntry cOSWriterXRefEntry) {
        byte[] bArr;
        String format = this.f60068a.format(cOSWriterXRefEntry.getOffset());
        String format2 = this.f60069b.format(cOSWriterXRefEntry.getKey().getGeneration());
        COSStandardOutputStream standardOutput = getStandardOutput();
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(format.getBytes(charset));
        COSStandardOutputStream standardOutput2 = getStandardOutput();
        byte[] bArr2 = SPACE;
        standardOutput2.write(bArr2);
        getStandardOutput().write(format2.getBytes(charset));
        getStandardOutput().write(bArr2);
        COSStandardOutputStream standardOutput3 = getStandardOutput();
        if (cOSWriterXRefEntry.isFree()) {
            bArr = XREF_FREE;
        } else {
            bArr = XREF_USED;
        }
        standardOutput3.write(bArr);
        getStandardOutput().writeCRLF();
    }

    /* renamed from: s */
    public final void m32609s(long j, long j2) {
        COSStandardOutputStream standardOutput = getStandardOutput();
        String valueOf = String.valueOf(j);
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(valueOf.getBytes(charset));
        getStandardOutput().write(SPACE);
        getStandardOutput().write(String.valueOf(j2).getBytes(charset));
        getStandardOutput().writeEOL();
    }

    public void setNumber(long j) {
        this.f60073f = j;
    }

    public void setStartxref(long j) {
        this.f60072e = j;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromArray(COSArray cOSArray) throws IOException {
        getStandardOutput().write(ARRAY_OPEN);
        Iterator<COSBase> it = cOSArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            COSBase next = it.next();
            if (next instanceof COSDictionary) {
                if (next.isDirect()) {
                    visitFromDictionary((COSDictionary) next);
                } else {
                    m32622b(next);
                    writeReference(next);
                }
            } else if (next instanceof COSObject) {
                COSBase object = ((COSObject) next).getObject();
                if (!this.f60084q && !this.f60085r && !(object instanceof COSDictionary) && object != null) {
                    object.accept(this);
                } else {
                    m32622b(next);
                    writeReference(next);
                }
            } else if (next == null) {
                COSNull.NULL.accept(this);
            } else {
                next.accept(this);
            }
            i++;
            if (it.hasNext()) {
                if (i % 10 == 0) {
                    getStandardOutput().writeEOL();
                } else {
                    getStandardOutput().write(SPACE);
                }
            }
        }
        getStandardOutput().write(ARRAY_CLOSE);
        getStandardOutput().writeEOL();
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromBoolean(COSBoolean cOSBoolean) throws IOException {
        cOSBoolean.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromDictionary(COSDictionary cOSDictionary) throws IOException {
        if (!this.f60086s) {
            COSBase item = cOSDictionary.getItem(COSName.TYPE);
            if (COSName.SIG.equals(item) || COSName.DOC_TIME_STAMP.equals(item)) {
                this.f60086s = true;
            }
        }
        getStandardOutput().write(DICT_OPEN);
        getStandardOutput().writeEOL();
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSBase value = entry.getValue();
            if (value != null) {
                entry.getKey().accept(this);
                getStandardOutput().write(SPACE);
                if (value instanceof COSDictionary) {
                    COSDictionary cOSDictionary2 = (COSDictionary) value;
                    if (!this.f60085r) {
                        COSName cOSName = COSName.XOBJECT;
                        COSBase item2 = cOSDictionary2.getItem(cOSName);
                        if (item2 != null && !cOSName.equals(entry.getKey())) {
                            item2.setDirect(true);
                        }
                        COSName cOSName2 = COSName.RESOURCES;
                        COSBase item3 = cOSDictionary2.getItem(cOSName2);
                        if (item3 != null && !cOSName2.equals(entry.getKey())) {
                            item3.setDirect(true);
                        }
                    }
                    if (cOSDictionary2.isDirect()) {
                        visitFromDictionary(cOSDictionary2);
                    } else {
                        m32622b(cOSDictionary2);
                        writeReference(cOSDictionary2);
                    }
                } else if (value instanceof COSObject) {
                    COSBase object = ((COSObject) value).getObject();
                    if (!this.f60084q && !this.f60085r && !(object instanceof COSDictionary) && object != null) {
                        object.accept(this);
                    } else {
                        m32622b(value);
                        writeReference(value);
                    }
                } else if (this.f60086s && COSName.CONTENTS.equals(entry.getKey())) {
                    this.f60087t = getStandardOutput().getPos();
                    value.accept(this);
                    this.f60088u = getStandardOutput().getPos() - this.f60087t;
                } else if (this.f60086s && COSName.BYTERANGE.equals(entry.getKey())) {
                    this.f60067B = (COSArray) entry.getValue();
                    this.f60089v = getStandardOutput().getPos() + 1;
                    value.accept(this);
                    this.f60090w = (getStandardOutput().getPos() - 1) - this.f60089v;
                    this.f60086s = false;
                } else {
                    value.accept(this);
                }
                getStandardOutput().writeEOL();
            }
        }
        getStandardOutput().write(DICT_CLOSE);
        getStandardOutput().writeEOL();
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromDocument(COSDocument cOSDocument) throws IOException {
        long j;
        if (!this.f60085r) {
            doWriteHeader(cOSDocument);
        } else {
            getStandardOutput().writeCRLF();
        }
        doWriteBody(cOSDocument);
        COSDictionary trailer = cOSDocument.getTrailer();
        if (trailer != null) {
            j = trailer.getLong(COSName.XREF_STM);
        } else {
            j = -1;
        }
        if (!this.f60085r && !cOSDocument.isXRefStream()) {
            m32617k();
            doWriteTrailer(cOSDocument);
        } else {
            m32618j(cOSDocument, j);
        }
        getStandardOutput().write(STARTXREF);
        getStandardOutput().writeEOL();
        getStandardOutput().write(String.valueOf(getStartxref()).getBytes(Charsets.ISO_8859_1));
        getStandardOutput().writeEOL();
        getStandardOutput().write(EOF);
        getStandardOutput().writeEOL();
        if (this.f60085r) {
            if (this.f60087t != 0 && this.f60089v != 0) {
                m32619i();
                return null;
            }
            m32621d();
            return null;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromFloat(COSFloat cOSFloat) throws IOException {
        cOSFloat.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromInt(COSInteger cOSInteger) throws IOException {
        cOSInteger.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromName(COSName cOSName) throws IOException {
        cOSName.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromNull(COSNull cOSNull) throws IOException {
        cOSNull.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromStream(COSStream cOSStream) throws IOException {
        Throwable th2;
        InputStream inputStream;
        if (this.f60084q) {
            this.f60082o.getEncryption().getSecurityHandler().encryptStream(cOSStream, this.f60081n.getNumber(), this.f60081n.getGeneration());
        }
        try {
            visitFromDictionary(cOSStream);
            getStandardOutput().write(STREAM);
            getStandardOutput().writeCRLF();
            inputStream = cOSStream.createRawInputStream();
        } catch (Throwable th3) {
            th2 = th3;
            inputStream = null;
        }
        try {
            IOUtils.copy(inputStream, getStandardOutput());
            getStandardOutput().writeCRLF();
            getStandardOutput().write(ENDSTREAM);
            getStandardOutput().writeEOL();
            if (inputStream != null) {
                inputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromString(COSString cOSString) throws IOException {
        if (this.f60084q) {
            this.f60082o.getEncryption().getSecurityHandler().encryptString(cOSString, this.f60081n.getNumber(), this.f60081n.getGeneration());
        }
        writeString(cOSString, getStandardOutput());
        return null;
    }

    public void write(COSDocument cOSDocument) throws IOException {
        write(new PDDocument(cOSDocument));
    }

    public void writeExternalSignature(byte[] bArr) throws IOException {
        if (this.f60066A != null && this.f60091x != null) {
            byte[] bytes = Hex.getBytes(bArr);
            if (bytes.length <= this.f60088u - 2) {
                System.arraycopy(bytes, 0, this.f60066A, ((int) (this.f60087t - this.f60091x.length())) + 1, bytes.length);
                IOUtils.copy(new RandomAccessInputStream(this.f60091x), this.f60092y);
                this.f60092y.write(this.f60066A);
                this.f60066A = null;
                return;
            }
            throw new IOException("Can't write signature, not enough space");
        }
        throw new IllegalStateException("PDF not prepared for setting signature");
    }

    public void writeReference(COSBase cOSBase) throws IOException {
        COSObjectKey m32616l = m32616l(cOSBase);
        COSStandardOutputStream standardOutput = getStandardOutput();
        String valueOf = String.valueOf(m32616l.getNumber());
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(valueOf.getBytes(charset));
        COSStandardOutputStream standardOutput2 = getStandardOutput();
        byte[] bArr = SPACE;
        standardOutput2.write(bArr);
        getStandardOutput().write(String.valueOf(m32616l.getGeneration()).getBytes(charset));
        getStandardOutput().write(bArr);
        getStandardOutput().write(REFERENCE);
    }

    public static void writeString(byte[] bArr, OutputStream outputStream) throws IOException {
        m32611q(bArr, false, outputStream);
    }

    public void write(PDDocument pDDocument) throws IOException {
        write(pDDocument, null);
    }

    public void write(PDDocument pDDocument, SignatureInterface signatureInterface) throws IOException {
        COSArray cOSArray;
        long currentTimeMillis = pDDocument.getDocumentId() == null ? System.currentTimeMillis() : pDDocument.getDocumentId().longValue();
        this.f60082o = pDDocument;
        this.f60093z = signatureInterface;
        if (this.f60085r) {
            m32614n(pDDocument);
        }
        boolean z = true;
        if (pDDocument.isAllSecurityToBeRemoved()) {
            this.f60084q = false;
            pDDocument.getDocument().getTrailer().removeItem(COSName.ENCRYPT);
        } else if (this.f60082o.getEncryption() != null) {
            if (!this.f60085r) {
                SecurityHandler securityHandler = this.f60082o.getEncryption().getSecurityHandler();
                if (securityHandler.hasProtectionPolicy()) {
                    securityHandler.prepareDocumentForEncryption(this.f60082o);
                } else {
                    throw new IllegalStateException("PDF contains an encryption dictionary, please remove it with setAllSecurityToBeRemoved() or set a protection policy with protect()");
                }
            }
            this.f60084q = true;
        } else {
            this.f60084q = false;
        }
        COSDocument document = this.f60082o.getDocument();
        COSDictionary trailer = document.getTrailer();
        COSBase dictionaryObject = trailer.getDictionaryObject(COSName.f59803ID);
        if (dictionaryObject instanceof COSArray) {
            cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() == 2) {
                z = false;
            }
        } else {
            cOSArray = null;
        }
        if (cOSArray != null && cOSArray.size() == 2) {
            z = false;
        }
        if (z || this.f60085r) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                messageDigest.update(Long.toString(currentTimeMillis).getBytes(Charsets.ISO_8859_1));
                COSDictionary cOSDictionary = trailer.getCOSDictionary(COSName.INFO);
                if (cOSDictionary != null) {
                    for (COSBase cOSBase : cOSDictionary.getValues()) {
                        messageDigest.update(cOSBase.toString().getBytes(Charsets.ISO_8859_1));
                    }
                }
                COSString cOSString = z ? new COSString(messageDigest.digest()) : (COSString) cOSArray.get(0);
                COSString cOSString2 = z ? cOSString : new COSString(messageDigest.digest());
                COSArray cOSArray2 = new COSArray();
                cOSArray2.add((COSBase) cOSString);
                cOSArray2.add((COSBase) cOSString2);
                trailer.setItem(COSName.f59803ID, (COSBase) cOSArray2);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        document.accept(this);
    }

    public COSWriter(OutputStream outputStream, RandomAccessRead randomAccessRead) throws IOException {
        Locale locale = Locale.US;
        this.f60068a = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.f60069b = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.f60072e = 0L;
        this.f60073f = 0L;
        this.f60074g = new Hashtable();
        this.f60075h = new HashMap();
        this.f60076i = new ArrayList();
        this.f60077j = new HashSet();
        this.f60078k = new LinkedList();
        this.f60079l = new HashSet();
        this.f60080m = new HashSet();
        this.f60081n = null;
        this.f60082o = null;
        this.f60083p = null;
        this.f60084q = false;
        this.f60085r = false;
        this.f60086s = false;
        m32613o(new ByteArrayOutputStream());
        m32612p(new COSStandardOutputStream(this.f60070c, randomAccessRead.length()));
        this.f60091x = randomAccessRead;
        this.f60092y = outputStream;
        this.f60085r = true;
    }

    public void write(FDFDocument fDFDocument) throws IOException {
        this.f60083p = fDFDocument;
        this.f60084q = false;
        fDFDocument.getDocument().accept(this);
    }

    public COSWriter(OutputStream outputStream, RandomAccessRead randomAccessRead, Set<COSDictionary> set) throws IOException {
        this(outputStream, randomAccessRead);
        this.f60078k.addAll(set);
    }
}