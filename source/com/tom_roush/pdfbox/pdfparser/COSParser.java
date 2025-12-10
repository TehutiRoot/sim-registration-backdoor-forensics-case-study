package com.tom_roush.pdfbox.pdfparser;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.RandomAccessRead;
import com.tom_roush.pdfbox.pdfparser.XrefTrailerResolver;
import com.tom_roush.pdfbox.pdmodel.encryption.AccessPermission;
import com.tom_roush.pdfbox.pdmodel.encryption.DecryptionMaterial;
import com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption;
import com.tom_roush.pdfbox.pdmodel.encryption.PublicKeyDecryptionMaterial;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler;
import com.tom_roush.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public class COSParser extends BaseParser {
    public static final String SYSPROP_EOFLOOKUPRANGE = "com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange";
    public static final String SYSPROP_PARSEMINIMAL = "com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.parseMinimal";
    public static final String TMP_FILE_PREFIX = "tmpPDF";

    /* renamed from: d */
    public final byte[] f60008d;

    /* renamed from: e */
    public AccessPermission f60009e;

    /* renamed from: f */
    public InputStream f60010f;
    protected long fileLen;

    /* renamed from: g */
    public String f60011g;

    /* renamed from: h */
    public String f60012h;

    /* renamed from: i */
    public long f60013i;
    protected boolean initialParseDone;

    /* renamed from: j */
    public boolean f60014j;

    /* renamed from: k */
    public boolean f60015k;

    /* renamed from: l */
    public Map f60016l;

    /* renamed from: m */
    public Long f60017m;

    /* renamed from: n */
    public List f60018n;

    /* renamed from: o */
    public List f60019o;

    /* renamed from: p */
    public PDEncryption f60020p;

    /* renamed from: q */
    public int f60021q;

    /* renamed from: r */
    public final byte[] f60022r;
    protected SecurityHandler securityHandler;
    protected final RandomAccessRead source;
    protected XrefTrailerResolver xrefTrailerResolver;

    /* renamed from: s */
    public static final char[] f60001s = {'x', 'r', 'e', 'f'};

    /* renamed from: t */
    public static final char[] f60002t = {'/', 'X', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'e', 'f'};

    /* renamed from: u */
    public static final char[] f60003u = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};

    /* renamed from: v */
    public static final byte[] f60004v = {101, 110, 100, 115, 116, 114, 101, 97, 109};

    /* renamed from: w */
    public static final byte[] f60005w = {101, 110, 100, 111, 98, 106};
    protected static final char[] EOF_MARKER = {CoreConstants.PERCENT_CHAR, CoreConstants.PERCENT_CHAR, 'E', 'O', 'F'};
    protected static final char[] OBJ_MARKER = {'o', 'b', 'j'};

    /* renamed from: x */
    public static final char[] f60006x = {'t', 'r', 'a', 'i', 'l', 'e', 'r'};

    /* renamed from: y */
    public static final char[] f60007y = {'/', 'O', 'b', 'j', 'S', 't', 'm'};

    public COSParser(RandomAccessRead randomAccessRead) {
        super(new C17820Ir1(randomAccessRead));
        this.f60008d = new byte[2048];
        this.f60010f = null;
        this.f60011g = "";
        this.f60012h = null;
        this.f60014j = true;
        this.initialParseDone = false;
        this.f60015k = false;
        this.f60016l = null;
        this.f60017m = null;
        this.f60018n = null;
        this.f60019o = null;
        this.f60020p = null;
        this.securityHandler = null;
        this.f60021q = 2048;
        this.xrefTrailerResolver = new XrefTrailerResolver();
        this.f60022r = new byte[8192];
        this.source = randomAccessRead;
    }

    /* renamed from: A */
    public final COSObject m32688A(COSObject cOSObject, Long l, COSObject cOSObject2, Long l2) {
        if (cOSObject2 != null) {
            if (cOSObject2.getObjectNumber() == cOSObject.getObjectNumber()) {
                if (cOSObject2.getGenerationNumber() >= cOSObject.getGenerationNumber()) {
                    return cOSObject2;
                }
                return cOSObject;
            } else if (l2 == null || l.longValue() <= l2.longValue()) {
                return cOSObject2;
            } else {
                return cOSObject;
            }
        }
        return cOSObject;
    }

    /* renamed from: B */
    public final COSObjectKey m32687B(COSObjectKey cOSObjectKey, long j) {
        if (j < 6) {
            return null;
        }
        try {
            this.source.seek(j);
            if (cOSObjectKey.getNumber() == readObjectNumber()) {
                int readGenerationNumber = readGenerationNumber();
                readExpectedString(OBJ_MARKER, true);
                if (readGenerationNumber == cOSObjectKey.getGeneration()) {
                    return cOSObjectKey;
                }
                if (this.f60014j && readGenerationNumber > cOSObjectKey.getGeneration()) {
                    return new COSObjectKey(cOSObjectKey.getNumber(), readGenerationNumber);
                }
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("No valid object at given location ");
            sb.append(j);
            sb.append(" - ignoring");
        }
        return null;
    }

    /* renamed from: C */
    public final COSNumber m32686C(COSBase cOSBase, COSName cOSName) {
        if (cOSBase == null) {
            return null;
        }
        if (cOSBase instanceof COSNumber) {
            return (COSNumber) cOSBase;
        }
        if (cOSBase instanceof COSObject) {
            COSObject cOSObject = (COSObject) cOSBase;
            COSBase object = cOSObject.getObject();
            if (object == null) {
                long position = this.source.getPosition();
                parseObjectDynamically(cOSObject, COSName.OBJ_STM.equals(cOSName));
                this.source.seek(position);
                object = cOSObject.getObject();
            }
            if (object != null) {
                if (COSNull.NULL == object) {
                    Log.w("PdfBox-Android", "Length object (" + cOSObject.getObjectNumber() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + cOSObject.getGenerationNumber() + ") not found");
                    return null;
                } else if (object instanceof COSNumber) {
                    return (COSNumber) object;
                } else {
                    throw new IOException("Wrong type of referenced length object " + cOSObject + ": " + object.getClass().getSimpleName());
                }
            }
            throw new IOException("Length object content was not read.");
        }
        throw new IOException("Wrong type of length object: " + cOSBase.getClass().getSimpleName());
    }

    /* renamed from: D */
    public final long m32685D(COSObject cOSObject) {
        return (cOSObject.getObjectNumber() << 32) | cOSObject.getGenerationNumber();
    }

    /* renamed from: E */
    public final boolean m32684E(COSDictionary cOSDictionary) {
        if (cOSDictionary.containsKey(COSName.PARENT) || cOSDictionary.containsKey(COSName.f59748A) || cOSDictionary.containsKey(COSName.DEST)) {
            return false;
        }
        if (!cOSDictionary.containsKey(COSName.MOD_DATE) && !cOSDictionary.containsKey(COSName.TITLE) && !cOSDictionary.containsKey(COSName.AUTHOR) && !cOSDictionary.containsKey(COSName.SUBJECT) && !cOSDictionary.containsKey(COSName.KEYWORDS) && !cOSDictionary.containsKey(COSName.CREATOR) && !cOSDictionary.containsKey(COSName.PRODUCER) && !cOSDictionary.containsKey(COSName.CREATION_DATE)) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m32683F(byte[] bArr) {
        if (this.source.peek() != bArr[0]) {
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int read = this.source.read(bArr2, 0, length);
        while (read < length) {
            int read2 = this.source.read(bArr2, read, length - read);
            if (read2 < 0) {
                break;
            }
            read += read2;
        }
        boolean equals = Arrays.equals(bArr, bArr2);
        this.source.rewind(read);
        return equals;
    }

    /* renamed from: G */
    public final boolean m32682G(char[] cArr) {
        long position = this.source.getPosition();
        int length = cArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (this.source.read() != cArr[i]) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        this.source.seek(position);
        return z;
    }

    /* renamed from: H */
    public final void m32681H(COSObject cOSObject) {
        parseObjectDynamically(cOSObject, true);
        if (cOSObject.getObject() instanceof COSDictionary) {
            for (COSBase cOSBase : ((COSDictionary) cOSObject.getObject()).getValues()) {
                if (cOSBase instanceof COSObject) {
                    COSObject cOSObject2 = (COSObject) cOSBase;
                    if (cOSObject2.getObject() == null) {
                        m32681H(cOSObject2);
                    }
                }
            }
            return;
        }
        throw new IOException("Dictionary object expected at offset " + this.source.getPosition());
    }

    /* renamed from: I */
    public final void m32680I(Long l, COSObjectKey cOSObjectKey, COSObject cOSObject) {
        COSBase cOSBase;
        this.source.seek(l.longValue());
        long readObjectNumber = readObjectNumber();
        int readGenerationNumber = readGenerationNumber();
        readExpectedString(OBJ_MARKER, true);
        if (readObjectNumber == cOSObjectKey.getNumber() && readGenerationNumber == cOSObjectKey.getGeneration()) {
            skipSpaces();
            COSBase parseDirObject = parseDirObject();
            String readString = readString();
            if (readString.equals("stream")) {
                this.source.rewind(readString.getBytes(Charsets.ISO_8859_1).length);
                if (parseDirObject instanceof COSDictionary) {
                    COSStream parseCOSStream = parseCOSStream((COSDictionary) parseDirObject);
                    SecurityHandler securityHandler = this.securityHandler;
                    if (securityHandler != null) {
                        securityHandler.decryptStream(parseCOSStream, cOSObjectKey.getNumber(), cOSObjectKey.getGeneration());
                    }
                    skipSpaces();
                    readString = readLine();
                    cOSBase = parseCOSStream;
                    if (!readString.startsWith("endobj")) {
                        cOSBase = parseCOSStream;
                        if (readString.startsWith("endstream")) {
                            readString = readString.substring(9).trim();
                            cOSBase = parseCOSStream;
                            if (readString.length() == 0) {
                                readString = readLine();
                                cOSBase = parseCOSStream;
                            }
                        }
                    }
                } else {
                    throw new IOException("Stream not preceded by dictionary (offset: " + l + ").");
                }
            } else {
                SecurityHandler securityHandler2 = this.securityHandler;
                cOSBase = parseDirObject;
                if (securityHandler2 != null) {
                    securityHandler2.decrypt(parseDirObject, cOSObjectKey.getNumber(), cOSObjectKey.getGeneration());
                    cOSBase = parseDirObject;
                }
            }
            cOSObject.setObject(cOSBase);
            if (!readString.startsWith("endobj")) {
                if (this.f60014j) {
                    Log.w("PdfBox-Android", "Object (" + readObjectNumber + ":" + readGenerationNumber + ") at offset " + l + " does not end with 'endobj' but with '" + readString + OperatorName.SHOW_TEXT_LINE);
                    return;
                }
                throw new IOException("Object (" + readObjectNumber + ":" + readGenerationNumber + ") at offset " + l + " does not end with 'endobj' but with '" + readString + OperatorName.SHOW_TEXT_LINE);
            }
            return;
        }
        throw new IOException("XREF for " + cOSObjectKey.getNumber() + ":" + cOSObjectKey.getGeneration() + " points to wrong object: " + readObjectNumber + ":" + readGenerationNumber + " at offset " + l);
    }

    /* renamed from: J */
    public final boolean m32679J(String str, String str2) {
        String readLine = readLine();
        if (!readLine.contains(str)) {
            readLine = readLine();
            while (!readLine.contains(str) && (readLine.length() <= 0 || !Character.isDigit(readLine.charAt(0)))) {
                readLine = readLine();
            }
        }
        if (!readLine.contains(str)) {
            this.source.seek(0L);
            return false;
        }
        int indexOf = readLine.indexOf(str);
        if (indexOf > 0) {
            readLine = readLine.substring(indexOf);
        }
        if (readLine.startsWith(str)) {
            if (!readLine.matches(str + "\\d.\\d")) {
                if (readLine.length() < str.length() + 3) {
                    readLine = str + str2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("No version found, set to ");
                    sb.append(str2);
                    sb.append(" as default.");
                } else {
                    String str3 = readLine.substring(str.length() + 3, readLine.length()) + "\n";
                    readLine = readLine.substring(0, str.length() + 3);
                    this.source.rewind(str3.getBytes(Charsets.ISO_8859_1).length);
                }
            }
        }
        float f = -1.0f;
        try {
            String[] split = readLine.split(HelpFormatter.DEFAULT_OPT_PREFIX);
            if (split.length == 2) {
                f = Float.parseFloat(split[1]);
            }
        } catch (NumberFormatException unused) {
        }
        if (f < 0.0f) {
            if (this.f60014j) {
                f = 1.7f;
            } else {
                throw new IOException("Error getting header version: " + readLine);
            }
        }
        this.document.setVersion(f);
        this.source.seek(0L);
        return true;
    }

    /* renamed from: K */
    public final void m32678K(int i) {
        COSBase parseObjectDynamically = parseObjectDynamically(i, 0, true);
        if (parseObjectDynamically instanceof COSStream) {
            try {
                PDFObjectStreamParser pDFObjectStreamParser = new PDFObjectStreamParser((COSStream) parseObjectDynamically, this.document);
                try {
                    pDFObjectStreamParser.parse();
                    for (COSObject cOSObject : pDFObjectStreamParser.getObjects()) {
                        COSObjectKey cOSObjectKey = new COSObjectKey(cOSObject);
                        Long l = this.xrefTrailerResolver.getXrefTable().get(cOSObjectKey);
                        if (l != null && l.longValue() == (-i)) {
                            this.document.getObjectFromPool(cOSObjectKey).setObject(cOSObject.getObject());
                        }
                    }
                } catch (IOException e) {
                    if (this.f60014j) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Stop reading object stream ");
                        sb.append(i);
                        sb.append(" due to an exception");
                        return;
                    }
                    throw e;
                }
            } catch (IOException e2) {
                if (this.f60014j) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("object stream ");
                    sb2.append(i);
                    sb2.append(" could not be parsed due to an exception");
                    return;
                }
                throw e2;
            }
        }
    }

    /* renamed from: L */
    public final long m32677L() {
        if (m32682G(f60003u)) {
            readString();
            skipSpaces();
            return readLong();
        }
        return -1L;
    }

    /* renamed from: M */
    public final boolean m32676M() {
        this.f60013i = this.source.getPosition();
        if (this.f60014j) {
            int peek = this.source.peek();
            while (peek != 116 && BaseParser.isDigit(peek)) {
                if (this.source.getPosition() == this.f60013i) {
                    Log.w("PdfBox-Android", "Expected trailer object at offset " + this.f60013i + ", keep trying");
                }
                readLine();
                peek = this.source.peek();
            }
        }
        if (this.source.peek() != 116) {
            return false;
        }
        long position = this.source.getPosition();
        String readLine = readLine();
        if (!readLine.trim().equals("trailer")) {
            if (!readLine.startsWith("trailer")) {
                return false;
            }
            this.source.seek(position + 7);
        }
        skipSpaces();
        this.xrefTrailerResolver.setTrailer(parseCOSDictionary());
        skipSpaces();
        return true;
    }

    /* renamed from: N */
    public final long m32675N(long j, boolean z) {
        long readObjectNumber = readObjectNumber();
        this.document.setHighestXRefObjectNumber(Math.max(this.document.getHighestXRefObjectNumber(), readObjectNumber));
        readGenerationNumber();
        readExpectedString(OBJ_MARKER, true);
        COSDictionary parseCOSDictionary = parseCOSDictionary();
        COSStream parseCOSStream = parseCOSStream(parseCOSDictionary);
        m32674O(parseCOSStream, j, z);
        parseCOSStream.close();
        return parseCOSDictionary.getLong(COSName.PREV);
    }

    /* renamed from: O */
    public final void m32674O(COSStream cOSStream, long j, boolean z) {
        if (z) {
            this.xrefTrailerResolver.nextXrefObj(j, XrefTrailerResolver.XRefType.STREAM);
            this.xrefTrailerResolver.setTrailer(cOSStream);
        }
        new PDFXrefStreamParser(cOSStream, this.document, this.xrefTrailerResolver).parse();
    }

    /* renamed from: P */
    public final void m32673P() {
        COSBase item;
        DecryptionMaterial standardDecryptionMaterial;
        if (this.f60020p == null && (item = this.document.getTrailer().getItem(COSName.ENCRYPT)) != null && !(item instanceof COSNull)) {
            if (item instanceof COSObject) {
                m32681H((COSObject) item);
            }
            try {
                try {
                    this.f60020p = new PDEncryption(this.document.getEncryptionDictionary());
                    if (this.f60010f != null) {
                        KeyStore keyStore = KeyStore.getInstance("PKCS12");
                        keyStore.load(this.f60010f, this.f60011g.toCharArray());
                        standardDecryptionMaterial = new PublicKeyDecryptionMaterial(keyStore, this.f60012h, this.f60011g);
                    } else {
                        standardDecryptionMaterial = new StandardDecryptionMaterial(this.f60011g);
                    }
                    SecurityHandler securityHandler = this.f60020p.getSecurityHandler();
                    this.securityHandler = securityHandler;
                    securityHandler.prepareForDecryption(this.f60020p, this.document.getDocumentID(), standardDecryptionMaterial);
                    this.f60009e = this.securityHandler.getCurrentAccessPermission();
                    InputStream inputStream = this.f60010f;
                    if (inputStream != null) {
                        IOUtils.closeQuietly(inputStream);
                    }
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException("Error (" + e2.getClass().getSimpleName() + ") while creating security handler for decryption", e2);
                }
            } catch (Throwable th2) {
                InputStream inputStream2 = this.f60010f;
                if (inputStream2 != null) {
                    IOUtils.closeQuietly(inputStream2);
                }
                throw th2;
            }
        }
    }

    /* renamed from: Q */
    public final void m32672Q(OutputStream outputStream) {
        int i;
        byte b;
        byte[] bArr = f60004v;
        int i2 = 0;
        while (true) {
            int read = this.source.read(this.f60008d, i2, 2048 - i2);
            if (read <= 0) {
                break;
            }
            int i3 = read + i2;
            int i4 = i3 - 5;
            int i5 = i2;
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int i6 = i2 + 5;
                if (i5 == 0 && i6 < i4 && ((b = this.f60008d[i6]) > 116 || b < 97)) {
                    i2 = i6;
                } else {
                    byte b2 = this.f60008d[i2];
                    if (b2 == bArr[i5]) {
                        i5++;
                        if (i5 == bArr.length) {
                            i2++;
                            break;
                        }
                    } else {
                        if (i5 == 3) {
                            bArr = f60005w;
                            if (b2 == bArr[i5]) {
                                i5++;
                            }
                        }
                        if (b2 == 101) {
                            i = 1;
                        } else if (b2 == 110 && i5 == 7) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        i5 = i;
                        bArr = f60004v;
                    }
                }
                i2++;
            }
            int max = Math.max(0, i2 - i5);
            if (max > 0) {
                outputStream.write(this.f60008d, 0, max);
            }
            if (i5 == bArr.length) {
                this.source.rewind(i3 - max);
                break;
            } else {
                System.arraycopy(bArr, 0, this.f60008d, 0, i5);
                i2 = i5;
            }
        }
        outputStream.flush();
    }

    /* renamed from: R */
    public final void m32671R(OutputStream outputStream, COSNumber cOSNumber) {
        int i;
        long longValue = cOSNumber.longValue();
        while (longValue > 0) {
            if (longValue > 8192) {
                i = 8192;
            } else {
                i = (int) longValue;
            }
            int read = this.source.read(this.f60022r, 0, i);
            if (read > 0) {
                outputStream.write(this.f60022r, 0, read);
                longValue -= read;
            } else {
                throw new IOException("read error at offset " + this.source.getPosition() + ": expected " + i + " bytes, but read() returns " + read);
            }
        }
    }

    /* renamed from: S */
    public final COSDictionary m32670S(COSObject cOSObject) {
        COSObjectKey cOSObjectKey = new COSObjectKey(cOSObject);
        Long l = (Long) this.f60016l.get(cOSObjectKey);
        if (l != null) {
            long position = this.source.getPosition();
            COSDictionary m32669T = m32669T(cOSObjectKey, l.longValue());
            this.source.seek(position);
            return m32669T;
        }
        return null;
    }

    /* renamed from: T */
    public final COSDictionary m32669T(COSObjectKey cOSObjectKey, long j) {
        if (j < 0) {
            COSObject objectFromPool = this.document.getObjectFromPool(cOSObjectKey);
            if (objectFromPool.getObject() == null) {
                m32678K((int) (-j));
            }
            COSBase object = objectFromPool.getObject();
            if (!(object instanceof COSDictionary)) {
                return null;
            }
            return (COSDictionary) object;
        }
        this.source.seek(j);
        readObjectNumber();
        readGenerationNumber();
        readExpectedString(OBJ_MARKER, true);
        if (this.source.peek() != 60) {
            return null;
        }
        try {
            return parseCOSDictionary();
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipped object ");
            sb.append(cOSObjectKey);
            sb.append(", either it's corrupt or not a dictionary");
            return null;
        }
    }

    /* renamed from: U */
    public final boolean m32668U(COSDictionary cOSDictionary) {
        COSObject objectFromPool;
        COSObject cOSObject = null;
        COSObject cOSObject2 = null;
        Long l = null;
        Long l2 = null;
        for (Map.Entry entry : this.f60016l.entrySet()) {
            COSDictionary m32669T = m32669T((COSObjectKey) entry.getKey(), ((Long) entry.getValue()).longValue());
            if (m32669T != null) {
                if (isCatalog(m32669T)) {
                    COSObject objectFromPool2 = this.document.getObjectFromPool((COSObjectKey) entry.getKey());
                    cOSObject = m32688A(objectFromPool2, (Long) entry.getValue(), cOSObject, l);
                    if (cOSObject == objectFromPool2) {
                        l = (Long) entry.getValue();
                    }
                } else if (m32684E(m32669T) && (cOSObject2 = m32688A((objectFromPool = this.document.getObjectFromPool((COSObjectKey) entry.getKey())), (Long) entry.getValue(), cOSObject2, l2)) == objectFromPool) {
                    l2 = (Long) entry.getValue();
                }
            }
        }
        if (cOSObject != null) {
            cOSDictionary.setItem(COSName.ROOT, (COSBase) cOSObject);
        }
        if (cOSObject2 != null) {
            cOSDictionary.setItem(COSName.INFO, (COSBase) cOSObject2);
        }
        if (cOSObject != null) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final long m32667V(List list, long j) {
        int size = list.size();
        Long l = null;
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = j - ((Long) list.get(i2)).longValue();
            if (l == null || Math.abs(l.longValue()) > Math.abs(longValue)) {
                l = Long.valueOf(longValue);
                i = i2;
            }
        }
        if (i > -1) {
            return ((Long) list.get(i)).longValue();
        }
        return -1L;
    }

    /* renamed from: W */
    public final boolean m32666W(long j) {
        long position = this.source.getPosition();
        long j2 = position + j;
        boolean z = false;
        if (j2 > this.fileLen) {
            Log.w("PdfBox-Android", "The end of the stream is out of range, using workaround to read the stream, stream start position: " + position + ", length: " + j + ", expected end position: " + j2);
        } else {
            this.source.seek(j2);
            skipSpaces();
            if (!m32683F(f60004v)) {
                Log.w("PdfBox-Android", "The end of the stream doesn't point to the correct offset, using workaround to read the stream, stream start position: " + position + ", length: " + j + ", expected end position: " + j2);
            } else {
                z = true;
            }
            this.source.seek(position);
        }
        return z;
    }

    /* renamed from: X */
    public final boolean m32665X(Map map) {
        if (map == null) {
            return true;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            COSObjectKey cOSObjectKey = (COSObjectKey) entry.getKey();
            Long l = (Long) entry.getValue();
            if (l != null && l.longValue() >= 0) {
                COSObjectKey m32687B = m32687B(cOSObjectKey, l.longValue());
                if (m32687B == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Stop checking xref offsets as at least one (");
                    sb.append(cOSObjectKey);
                    sb.append(") couldn't be dereferenced");
                    return false;
                } else if (m32687B != cOSObjectKey) {
                    hashMap.put(cOSObjectKey, m32687B);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            map.put(entry2.getValue(), map.remove(entry2.getKey()));
        }
        return true;
    }

    public void checkPages(COSDictionary cOSDictionary) {
        if (this.f60015k && cOSDictionary != null) {
            COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.PAGES);
            if (dictionaryObject instanceof COSDictionary) {
                m32653w((COSDictionary) dictionaryObject, new HashSet());
            }
        }
    }

    public AccessPermission getAccessPermission() throws IOException {
        if (this.document != null) {
            return this.f60009e;
        }
        throw new IOException("You must parse the document first before calling getAccessPermission()");
    }

    public COSDocument getDocument() throws IOException {
        COSDocument cOSDocument = this.document;
        if (cOSDocument != null) {
            return cOSDocument;
        }
        throw new IOException("You must parse the document first before calling getDocument()");
    }

    public PDEncryption getEncryption() throws IOException {
        if (this.document != null) {
            return this.f60020p;
        }
        throw new IOException("You must parse the document first before calling getEncryption()");
    }

    public final long getStartxrefOffset() throws IOException {
        try {
            long j = this.fileLen;
            int i = this.f60021q;
            if (j < i) {
                i = (int) j;
            }
            byte[] bArr = new byte[i];
            long j2 = j - i;
            this.source.seek(j2);
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int read = this.source.read(bArr, i2, i3);
                if (read >= 1) {
                    i2 += read;
                } else {
                    throw new IOException("No more bytes to read for trailing buffer, but expected: " + i3);
                }
            }
            this.source.seek(0L);
            char[] cArr = EOF_MARKER;
            int lastIndexOf = lastIndexOf(cArr, bArr, i);
            if (lastIndexOf < 0) {
                if (this.f60014j) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing end of file marker '");
                    sb.append(new String(cArr));
                    sb.append(OperatorName.SHOW_TEXT_LINE);
                } else {
                    throw new IOException("Missing end of file marker '" + new String(cArr) + OperatorName.SHOW_TEXT_LINE);
                }
            } else {
                i = lastIndexOf;
            }
            int lastIndexOf2 = lastIndexOf(f60003u, bArr, i);
            if (lastIndexOf2 >= 0) {
                return j2 + lastIndexOf2;
            }
            throw new IOException("Missing 'startxref' marker.");
        } catch (Throwable th2) {
            this.source.seek(0L);
            throw th2;
        }
    }

    public boolean isCatalog(COSDictionary cOSDictionary) {
        return COSName.CATALOG.equals(cOSDictionary.getCOSName(COSName.TYPE));
    }

    public boolean isLenient() {
        return this.f60014j;
    }

    /* renamed from: l */
    public final void m32664l(COSName[] cOSNameArr, COSDictionary cOSDictionary, Set set) {
        if (cOSNameArr != null) {
            for (COSName cOSName : cOSNameArr) {
                COSBase item = cOSDictionary.getItem(cOSName);
                if (item instanceof COSObject) {
                    set.add(Long.valueOf(m32685D((COSObject) item)));
                }
            }
        }
    }

    public int lastIndexOf(char[] cArr, byte[] bArr, int i) {
        int length = cArr.length - 1;
        char c = cArr[length];
        while (true) {
            int i2 = length;
            while (true) {
                i--;
                if (i < 0) {
                    return -1;
                }
                if (bArr[i] == c) {
                    i2--;
                    if (i2 < 0) {
                        return i;
                    }
                    c = cArr[i2];
                } else if (i2 < length) {
                    break;
                }
            }
            c = cArr[length];
        }
    }

    /* renamed from: m */
    public final void m32663m(Queue queue, COSBase cOSBase, Set set) {
        if (cOSBase instanceof COSObject) {
            if (!set.add(Long.valueOf(m32685D((COSObject) cOSBase)))) {
                return;
            }
            queue.add(cOSBase);
        } else if ((cOSBase instanceof COSDictionary) || (cOSBase instanceof COSArray)) {
            queue.add(cOSBase);
        }
    }

    /* renamed from: n */
    public final void m32662n(Queue queue, Collection collection, Set set) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m32663m(queue, (COSBase) it.next(), set);
        }
    }

    /* renamed from: o */
    public final void m32661o() {
        if (this.f60017m == null) {
            long position = this.source.getPosition();
            this.source.seek(6L);
            while (!this.source.isEOF()) {
                if (m32682G(EOF_MARKER)) {
                    long position2 = this.source.getPosition();
                    this.source.seek(5 + position2);
                    try {
                        skipSpaces();
                        if (!m32682G(f60001s)) {
                            readObjectNumber();
                            readGenerationNumber();
                        }
                    } catch (IOException unused) {
                        this.f60017m = Long.valueOf(position2);
                    }
                }
                this.source.read();
            }
            this.source.seek(position);
            if (this.f60017m == null) {
                this.f60017m = Long.MAX_VALUE;
            }
        }
    }

    /* renamed from: p */
    public final void m32660p() {
        boolean z;
        HashMap hashMap;
        long j;
        COSStream cOSStream;
        COSDictionary parseCOSDictionary;
        int i;
        int i2;
        ArrayList<Long> arrayList;
        HashMap hashMap2;
        long j2;
        HashMap hashMap3 = new HashMap();
        long position = this.source.getPosition();
        this.source.seek(6L);
        char[] charArray = " obj".toCharArray();
        while (true) {
            long j3 = 0;
            z = true;
            if (this.source.isEOF()) {
                break;
            }
            if (m32682G(f60007y)) {
                long position2 = this.source.getPosition();
                long j4 = -1;
                int i3 = 1;
                boolean z2 = false;
                while (i3 < 40 && !z2) {
                    long j5 = position2 - (i3 * 10);
                    if (j5 > j3) {
                        this.source.seek(j5);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 10) {
                                break;
                            } else if (m32682G(charArray)) {
                                this.source.seek(j5 - 1);
                                if (BaseParser.isDigit(this.source.peek())) {
                                    this.source.seek(j5 - 2);
                                    if (isSpace()) {
                                        long j6 = j5 - 3;
                                        this.source.seek(j6);
                                        int i5 = 0;
                                        for (long j7 = 6; j6 > j7 && isDigit(); j7 = 6) {
                                            j6--;
                                            this.source.seek(j6);
                                            i5++;
                                        }
                                        if (i5 > 0) {
                                            this.source.read();
                                            j4 = this.source.getPosition();
                                            hashMap3.put(Long.valueOf(j4), new COSObjectKey(readObjectNumber(), readGenerationNumber()));
                                        }
                                    }
                                }
                                long j8 = j4;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Dictionary start for object stream -> ");
                                sb.append(j8);
                                j4 = j8;
                                z2 = true;
                            } else {
                                j5++;
                                this.source.read();
                                i4++;
                            }
                        }
                    }
                    i3++;
                    j3 = 0;
                }
                this.source.seek(position2 + f60007y.length);
            }
            this.source.read();
        }
        for (Long l : hashMap3.keySet()) {
            Long l2 = (Long) this.f60016l.get(hashMap3.get(l));
            if (l2 == null) {
                Log.w("PdfBox-Android", "Skipped incomplete object stream:" + hashMap3.get(l) + " at " + l);
            } else {
                if (l.equals(l2)) {
                    this.source.seek(l.longValue());
                    long readObjectNumber = readObjectNumber();
                    int readGenerationNumber = readGenerationNumber();
                    readExpectedString(OBJ_MARKER, z);
                    try {
                        parseCOSDictionary = parseCOSDictionary();
                        i = parseCOSDictionary.getInt(COSName.FIRST);
                        i2 = parseCOSDictionary.getInt(COSName.f59807N);
                    } catch (IOException unused) {
                        hashMap = hashMap3;
                        j = position;
                        cOSStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cOSStream = null;
                    }
                    if (i != -1 && i2 != -1) {
                        cOSStream = parseCOSStream(parseCOSDictionary);
                        try {
                            try {
                                SecurityHandler securityHandler = this.securityHandler;
                                if (securityHandler != null) {
                                    securityHandler.decryptStream(cOSStream, readObjectNumber, readGenerationNumber);
                                }
                                PDFObjectStreamParser pDFObjectStreamParser = new PDFObjectStreamParser(cOSStream, this.document);
                                arrayList = new ArrayList(i2);
                                for (int i6 = 0; i6 < i2; i6++) {
                                    arrayList.add(Long.valueOf(pDFObjectStreamParser.readObjectNumber()));
                                    pDFObjectStreamParser.readLong();
                                }
                                if (cOSStream != null) {
                                    cOSStream.close();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (cOSStream != null) {
                                    cOSStream.close();
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            hashMap = hashMap3;
                            j = position;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Skipped corrupt stream: (");
                            sb2.append(readObjectNumber);
                            sb2.append(" 0 at offset ");
                            sb2.append(l);
                            if (cOSStream != null) {
                                cOSStream.close();
                            }
                            hashMap3 = hashMap;
                            position = j;
                            z = true;
                        }
                        if (arrayList.size() < i2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Skipped corrupt stream: (");
                            sb3.append(readObjectNumber);
                            sb3.append(" 0 at offset ");
                            sb3.append(l);
                            z = true;
                        } else {
                            Map<COSObjectKey, Long> xrefTable = this.xrefTrailerResolver.getXrefTable();
                            for (Long l3 : arrayList) {
                                COSObjectKey cOSObjectKey = new COSObjectKey(l3.longValue(), 0);
                                Long l4 = (Long) this.f60016l.get(cOSObjectKey);
                                if (l4 != null) {
                                    if (l4.longValue() < 0) {
                                        hashMap2 = hashMap3;
                                        j2 = position;
                                        l4 = (Long) this.f60016l.get(new COSObjectKey(Math.abs(l4.longValue()), 0));
                                    } else {
                                        hashMap2 = hashMap3;
                                        j2 = position;
                                    }
                                } else {
                                    hashMap2 = hashMap3;
                                    j2 = position;
                                }
                                if (l4 == null || l.longValue() > l4.longValue()) {
                                    long j9 = -readObjectNumber;
                                    this.f60016l.put(cOSObjectKey, Long.valueOf(j9));
                                    xrefTable.put(cOSObjectKey, Long.valueOf(j9));
                                }
                                hashMap3 = hashMap2;
                                position = j2;
                            }
                        }
                    }
                }
                hashMap = hashMap3;
                j = position;
                hashMap3 = hashMap;
                position = j;
                z = true;
            }
        }
        this.source.seek(position);
    }

    public COSStream parseCOSStream(COSDictionary cOSDictionary) throws IOException {
        COSStream createCOSStream = this.document.createCOSStream(cOSDictionary);
        readString();
        skipWhiteSpaces();
        COSName cOSName = COSName.LENGTH;
        COSNumber m32686C = m32686C(cOSDictionary.getItem(cOSName), cOSDictionary.getCOSName(COSName.TYPE));
        if (m32686C == null) {
            if (this.f60014j) {
                Log.w("PdfBox-Android", "The stream doesn't provide any stream length, using fallback readUntilEnd, at offset " + this.source.getPosition());
            } else {
                throw new IOException("Missing length for stream.");
            }
        }
        if (m32686C != null && m32666W(m32686C.longValue())) {
            OutputStream createRawOutputStream = createCOSStream.createRawOutputStream();
            try {
                m32671R(createRawOutputStream, m32686C);
                createRawOutputStream.close();
                createCOSStream.setItem(cOSName, (COSBase) m32686C);
            } catch (Throwable th2) {
                createRawOutputStream.close();
                createCOSStream.setItem(COSName.LENGTH, (COSBase) m32686C);
                throw th2;
            }
        } else {
            OutputStream createRawOutputStream2 = createCOSStream.createRawOutputStream();
            try {
                m32672Q(new C16896vS(createRawOutputStream2));
                createRawOutputStream2.close();
                if (m32686C != null) {
                    createCOSStream.setItem(cOSName, (COSBase) m32686C);
                }
            } catch (Throwable th3) {
                createRawOutputStream2.close();
                if (m32686C != null) {
                    createCOSStream.setItem(COSName.LENGTH, (COSBase) m32686C);
                }
                throw th3;
            }
        }
        String readString = readString();
        if (readString.equals("endobj") && this.f60014j) {
            Log.w("PdfBox-Android", "stream ends with 'endobj' instead of 'endstream' at offset " + this.source.getPosition());
            this.source.rewind(f60005w.length);
        } else if (readString.length() > 9 && this.f60014j && readString.startsWith("endstream")) {
            Log.w("PdfBox-Android", "stream ends with '" + readString + "' instead of 'endstream' at offset " + this.source.getPosition());
            this.source.rewind(readString.substring(9).getBytes(Charsets.ISO_8859_1).length);
        } else if (!readString.equals("endstream")) {
            throw new IOException("Error reading stream, expected='endstream' actual='" + readString + "' at offset " + this.source.getPosition());
        }
        return createCOSStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ae, code lost:
        throw new java.io.IOException(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c0, code lost:
        if (r2.isEmpty() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c3, code lost:
        r5 = ((java.util.List) r2.remove(r2.firstKey())).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d5, code lost:
        if (r5.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d7, code lost:
        r7 = (com.tom_roush.pdfbox.cos.COSObject) r5.next();
        r8 = parseObjectDynamically(r7, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e1, code lost:
        if (r8 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e3, code lost:
        r7.setObject(r8);
        m32663m(r1, r8, r4);
        r3.add(java.lang.Long.valueOf(m32685D(r7)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseDictObjects(com.tom_roush.pdfbox.cos.COSDictionary r18, com.tom_roush.pdfbox.cos.COSName... r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.parseDictObjects(com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSName[]):void");
    }

    public boolean parseFDFHeader() throws IOException {
        return m32679J("%FDF-", "1.0");
    }

    public final COSBase parseObjectDynamically(COSObject cOSObject, boolean z) throws IOException {
        return parseObjectDynamically(cOSObject.getObjectNumber(), cOSObject.getGenerationNumber(), z);
    }

    public boolean parsePDFHeader() throws IOException {
        return m32679J("%PDF-", "1.4");
    }

    public COSBase parseTrailerValuesDynamically(COSDictionary cOSDictionary) throws IOException {
        for (COSBase cOSBase : cOSDictionary.getValues()) {
            if (cOSBase instanceof COSObject) {
                parseObjectDynamically((COSObject) cOSBase, false);
            }
        }
        COSObject cOSObject = cOSDictionary.getCOSObject(COSName.ROOT);
        if (cOSObject != null) {
            return cOSObject.getObject();
        }
        throw new IOException("Missing root object specification in trailer.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
        throw new java.io.IOException("Expected trailer object at offset " + r17.source.getPosition());
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138 A[LOOP:0: B:6:0x0029->B:50:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.cos.COSDictionary parseXref(long r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.parseXref(long):com.tom_roush.pdfbox.cos.COSDictionary");
    }

    public boolean parseXrefTable(long j) throws IOException {
        if (this.source.peek() != 120 || !readString().trim().equals("xref")) {
            return false;
        }
        String readString = readString();
        this.source.rewind(readString.getBytes(Charsets.ISO_8859_1).length);
        this.xrefTrailerResolver.nextXrefObj(j, XrefTrailerResolver.XRefType.TABLE);
        if (readString.startsWith("trailer")) {
            Log.w("PdfBox-Android", "skipping empty xref table");
            return false;
        }
        do {
            String readLine = readLine();
            String[] split = readLine.split("\\s");
            if (split.length != 2) {
                Log.w("PdfBox-Android", "Unexpected XRefTable Entry: " + readLine);
                return false;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                try {
                    int parseInt = Integer.parseInt(split[1]);
                    skipSpaces();
                    int i = 0;
                    while (true) {
                        if (i >= parseInt || this.source.isEOF() || isEndOfName((char) this.source.peek()) || this.source.peek() == 116) {
                            break;
                        }
                        String readLine2 = readLine();
                        String[] split2 = readLine2.split("\\s");
                        if (split2.length < 3) {
                            Log.w("PdfBox-Android", "invalid xref line: " + readLine2);
                            break;
                        }
                        if (split2[split2.length - 1].equals(OperatorName.ENDPATH)) {
                            try {
                                long parseLong2 = Long.parseLong(split2[0]);
                                if (parseLong2 > 0) {
                                    this.xrefTrailerResolver.setXRef(new COSObjectKey(parseLong, Integer.parseInt(split2[1])), parseLong2);
                                }
                            } catch (NumberFormatException e) {
                                throw new IOException(e);
                            }
                        } else if (!split2[2].equals(OperatorName.FILL_NON_ZERO)) {
                            throw new IOException("Corrupt XRefTable Entry - ObjID:" + parseLong);
                        }
                        parseLong++;
                        skipSpaces();
                        i++;
                    }
                    skipSpaces();
                } catch (NumberFormatException unused) {
                    Log.w("PdfBox-Android", "XRefTable: invalid number of objects: " + readLine);
                    return false;
                }
            } catch (NumberFormatException unused2) {
                Log.w("PdfBox-Android", "XRefTable: invalid ID for the first object: " + readLine);
                return false;
            }
        } while (isDigit());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d A[EDGE_INSN: B:54:0x010d->B:46:0x010d ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m32659q() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.m32659q():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
        return true;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m32658r(com.tom_roush.pdfbox.cos.COSDictionary r12) {
        /*
            r11 = this;
            com.tom_roush.pdfbox.io.RandomAccessRead r0 = r11.source
            long r0 = r0.getPosition()
            com.tom_roush.pdfbox.io.RandomAccessRead r2 = r11.source
            r3 = 6
            r2.seek(r3)
        Ld:
            com.tom_roush.pdfbox.io.RandomAccessRead r2 = r11.source
            boolean r2 = r2.isEOF()
            r3 = 0
            if (r2 != 0) goto L9c
            char[] r2 = com.tom_roush.pdfbox.pdfparser.COSParser.f60006x
            boolean r4 = r11.m32682G(r2)
            if (r4 == 0) goto L95
            com.tom_roush.pdfbox.io.RandomAccessRead r4 = r11.source
            long r5 = r4.getPosition()
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            r4.seek(r5)
            r11.skipSpaces()     // Catch: java.io.IOException -> L48
            com.tom_roush.pdfbox.cos.COSDictionary r2 = r11.parseCOSDictionary()     // Catch: java.io.IOException -> L48
            com.tom_roush.pdfbox.cos.COSName r4 = com.tom_roush.pdfbox.cos.COSName.ROOT     // Catch: java.io.IOException -> L48
            com.tom_roush.pdfbox.cos.COSObject r5 = r2.getCOSObject(r4)     // Catch: java.io.IOException -> L48
            r6 = 1
            if (r5 == 0) goto L4a
            com.tom_roush.pdfbox.cos.COSDictionary r7 = r11.m32670S(r5)     // Catch: java.io.IOException -> L48
            if (r7 == 0) goto L4a
            boolean r7 = r11.isCatalog(r7)     // Catch: java.io.IOException -> L48
            if (r7 == 0) goto L4a
            r7 = 1
            goto L4b
        L48:
            goto Ld
        L4a:
            r7 = 0
        L4b:
            com.tom_roush.pdfbox.cos.COSName r8 = com.tom_roush.pdfbox.cos.COSName.INFO     // Catch: java.io.IOException -> L48
            com.tom_roush.pdfbox.cos.COSObject r9 = r2.getCOSObject(r8)     // Catch: java.io.IOException -> L48
            if (r9 == 0) goto L60
            com.tom_roush.pdfbox.cos.COSDictionary r10 = r11.m32670S(r9)     // Catch: java.io.IOException -> L48
            if (r10 == 0) goto L60
            boolean r10 = r11.m32684E(r10)     // Catch: java.io.IOException -> L48
            if (r10 == 0) goto L60
            r3 = 1
        L60:
            if (r7 == 0) goto L95
            if (r3 == 0) goto L95
            r12.setItem(r4, r5)     // Catch: java.io.IOException -> L48
            r12.setItem(r8, r9)     // Catch: java.io.IOException -> L48
            com.tom_roush.pdfbox.cos.COSName r3 = com.tom_roush.pdfbox.cos.COSName.ENCRYPT     // Catch: java.io.IOException -> L48
            boolean r4 = r2.containsKey(r3)     // Catch: java.io.IOException -> L48
            if (r4 == 0) goto L81
            com.tom_roush.pdfbox.cos.COSObject r4 = r2.getCOSObject(r3)     // Catch: java.io.IOException -> L48
            if (r4 == 0) goto L81
            com.tom_roush.pdfbox.cos.COSDictionary r5 = r11.m32670S(r4)     // Catch: java.io.IOException -> L48
            if (r5 == 0) goto L81
            r12.setItem(r3, r4)     // Catch: java.io.IOException -> L48
        L81:
            com.tom_roush.pdfbox.cos.COSName r3 = com.tom_roush.pdfbox.cos.COSName.f59791ID     // Catch: java.io.IOException -> L48
            boolean r4 = r2.containsKey(r3)     // Catch: java.io.IOException -> L48
            if (r4 == 0) goto L94
            com.tom_roush.pdfbox.cos.COSBase r2 = r2.getItem(r3)     // Catch: java.io.IOException -> L48
            boolean r4 = r2 instanceof com.tom_roush.pdfbox.cos.COSArray     // Catch: java.io.IOException -> L48
            if (r4 == 0) goto L94
            r12.setItem(r3, r2)     // Catch: java.io.IOException -> L48
        L94:
            return r6
        L95:
            com.tom_roush.pdfbox.io.RandomAccessRead r2 = r11.source
            r2.read()
            goto Ld
        L9c:
            com.tom_roush.pdfbox.io.RandomAccessRead r12 = r11.source
            r12.seek(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.m32658r(com.tom_roush.pdfbox.cos.COSDictionary):boolean");
    }

    public final COSDictionary rebuildTrailer() throws IOException {
        COSDictionary cOSDictionary;
        boolean z;
        m32659q();
        if (this.f60016l != null) {
            this.xrefTrailerResolver.reset();
            this.xrefTrailerResolver.nextXrefObj(0L, XrefTrailerResolver.XRefType.TABLE);
            for (Map.Entry entry : this.f60016l.entrySet()) {
                this.xrefTrailerResolver.setXRef((COSObjectKey) entry.getKey(), ((Long) entry.getValue()).longValue());
            }
            this.xrefTrailerResolver.setStartxref(0L);
            cOSDictionary = this.xrefTrailerResolver.getTrailer();
            getDocument().setTrailer(cOSDictionary);
            if (!m32658r(cOSDictionary) && !m32668U(cOSDictionary)) {
                m32660p();
                m32668U(cOSDictionary);
                z = true;
            } else {
                z = false;
            }
            m32673P();
            if (!z) {
                m32660p();
            }
        } else {
            cOSDictionary = null;
        }
        this.f60015k = true;
        return cOSDictionary;
    }

    public COSDictionary retrieveTrailer() throws IOException {
        boolean z;
        COSDictionary cOSDictionary = null;
        try {
            long startxrefOffset = getStartxrefOffset();
            if (startxrefOffset > -1) {
                cOSDictionary = parseXref(startxrefOffset);
                z = false;
            } else {
                z = isLenient();
            }
        } catch (IOException e) {
            if (isLenient()) {
                z = true;
            } else {
                throw e;
            }
        }
        if (cOSDictionary != null && cOSDictionary.getItem(COSName.ROOT) == null) {
            z = isLenient();
        }
        if (z) {
            return rebuildTrailer();
        }
        m32673P();
        Map map = this.f60016l;
        if (map != null && !map.isEmpty()) {
            m32660p();
            return cOSDictionary;
        }
        return cOSDictionary;
    }

    /* renamed from: s */
    public final long m32657s(long j, boolean z) {
        long j2;
        long j3;
        List list;
        if (!z) {
            m32655u();
        }
        m32656t();
        if (!z && (list = this.f60018n) != null) {
            j2 = m32667V(list, j);
        } else {
            j2 = -1;
        }
        List list2 = this.f60019o;
        if (list2 != null) {
            j3 = m32667V(list2, j);
        } else {
            j3 = -1;
        }
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if (i > 0 && j3 > -1) {
            if (Math.abs(j - j2) > Math.abs(j - j3)) {
                this.f60019o.remove(Long.valueOf(j3));
                return j3;
            }
            this.f60018n.remove(Long.valueOf(j2));
            return j2;
        } else if (i > 0) {
            this.f60018n.remove(Long.valueOf(j2));
            return j2;
        } else if (j3 <= -1) {
            return -1L;
        } else {
            this.f60019o.remove(Long.valueOf(j3));
            return j3;
        }
    }

    public void setEOFLookupRange(int i) {
        if (i > 15) {
            this.f60021q = i;
        }
    }

    public void setLenient(boolean z) {
        if (!this.initialParseDone) {
            this.f60014j = z;
            return;
        }
        throw new IllegalArgumentException("Cannot change leniency after parsing");
    }

    /* renamed from: t */
    public final void m32656t() {
        if (this.f60019o == null) {
            this.f60019o = new ArrayList();
            long position = this.source.getPosition();
            this.source.seek(6L);
            char[] charArray = " obj".toCharArray();
            while (!this.source.isEOF()) {
                if (m32682G(f60002t)) {
                    long position2 = this.source.getPosition();
                    boolean z = false;
                    long j = -1;
                    for (int i = 1; i < 40 && !z; i++) {
                        long j2 = position2 - (i * 10);
                        if (j2 > 0) {
                            this.source.seek(j2);
                            int i2 = 0;
                            while (true) {
                                if (i2 >= 10) {
                                    break;
                                } else if (m32682G(charArray)) {
                                    this.source.seek(j2 - 1);
                                    if (BaseParser.isDigit(this.source.peek())) {
                                        this.source.seek(j2 - 2);
                                        if (isSpace()) {
                                            long j3 = j2 - 3;
                                            this.source.seek(j3);
                                            int i3 = 0;
                                            while (j3 > 6 && isDigit()) {
                                                j3--;
                                                this.source.seek(j3);
                                                i3++;
                                            }
                                            if (i3 > 0) {
                                                this.source.read();
                                                j = this.source.getPosition();
                                            }
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Fixed reference for xref stream ");
                                    sb.append(position2);
                                    sb.append(" -> ");
                                    sb.append(j);
                                    z = true;
                                } else {
                                    j2++;
                                    this.source.read();
                                    i2++;
                                }
                            }
                        }
                    }
                    if (j > -1) {
                        this.f60019o.add(Long.valueOf(j));
                    }
                    this.source.seek(position2 + 5);
                }
                this.source.read();
            }
            this.source.seek(position);
        }
    }

    /* renamed from: u */
    public final void m32655u() {
        if (this.f60018n == null) {
            this.f60018n = new ArrayList();
            long position = this.source.getPosition();
            this.source.seek(6L);
            while (!this.source.isEOF()) {
                if (m32682G(f60001s)) {
                    long position2 = this.source.getPosition();
                    this.source.seek(position2 - 1);
                    if (isWhitespace()) {
                        this.f60018n.add(Long.valueOf(position2));
                    }
                    this.source.seek(position2 + 4);
                }
                this.source.read();
            }
            this.source.seek(position);
        }
    }

    /* renamed from: v */
    public final long m32654v(long j, boolean z) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid object offset ");
            sb.append(j);
            sb.append(" when searching for a xref table/stream");
            return 0L;
        }
        long m32657s = m32657s(j, z);
        if (m32657s > -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fixed reference for xref table/stream ");
            sb2.append(j);
            sb2.append(" -> ");
            sb2.append(m32657s);
            return m32657s;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Can't find the object xref table/stream at offset ");
        sb3.append(j);
        return 0L;
    }

    /* renamed from: w */
    public final int m32653w(COSDictionary cOSDictionary, Set set) {
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.KIDS);
        int i = 0;
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            for (COSBase cOSBase : cOSArray.toList()) {
                if (cOSBase instanceof COSObject) {
                    COSObject cOSObject = (COSObject) cOSBase;
                    if (!set.contains(cOSObject)) {
                        COSBase object = cOSObject.getObject();
                        if (object != null && !object.equals(COSNull.NULL)) {
                            if (object instanceof COSDictionary) {
                                COSDictionary cOSDictionary2 = (COSDictionary) object;
                                COSName cOSName = cOSDictionary2.getCOSName(COSName.TYPE);
                                if (COSName.PAGES.equals(cOSName)) {
                                    set.add(cOSObject);
                                    i += m32653w(cOSDictionary2, set);
                                } else if (COSName.PAGE.equals(cOSName)) {
                                    i++;
                                }
                            }
                        } else {
                            Log.w("PdfBox-Android", "Removed null object " + cOSBase + " from pages dictionary");
                            cOSArray.remove(cOSBase);
                        }
                    }
                }
                cOSArray.remove(cOSBase);
            }
        }
        cOSDictionary.setInt(COSName.COUNT, i);
        return i;
    }

    /* renamed from: x */
    public final long m32652x(long j) {
        if (!this.f60014j) {
            return j;
        }
        this.source.seek(j);
        skipSpaces();
        if (this.source.peek() == 120 && m32682G(f60001s)) {
            return j;
        }
        if (j > 0) {
            if (m32651y(j)) {
                return j;
            }
            return m32654v(j, false);
        }
        return -1L;
    }

    /* renamed from: y */
    public final boolean m32651y(long j) {
        if (!this.f60014j || j == 0) {
            return true;
        }
        this.source.seek(j - 1);
        if (isWhitespace(this.source.read())) {
            skipSpaces();
            if (isDigit()) {
                try {
                    readObjectNumber();
                    readGenerationNumber();
                    readExpectedString(OBJ_MARKER, true);
                    COSDictionary parseCOSDictionary = parseCOSDictionary();
                    this.source.seek(j);
                    if ("XRef".equals(parseCOSDictionary.getNameAsString(COSName.TYPE))) {
                        return true;
                    }
                    return false;
                } catch (IOException unused) {
                    this.source.seek(j);
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: z */
    public final void m32650z() {
        if (!this.f60014j) {
            return;
        }
        Map<COSObjectKey, Long> xrefTable = this.xrefTrailerResolver.getXrefTable();
        if (!m32665X(xrefTable)) {
            m32659q();
            Map map = this.f60016l;
            if (map != null && !map.isEmpty()) {
                xrefTable.clear();
                xrefTable.putAll(this.f60016l);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    public COSBase parseObjectDynamically(long j, int i, boolean z) throws IOException {
        Map map;
        COSObjectKey cOSObjectKey = new COSObjectKey(j, i);
        COSObject objectFromPool = this.document.getObjectFromPool(cOSObjectKey);
        if (objectFromPool.getObject() == null) {
            Long l = this.document.getXrefTable().get(cOSObjectKey);
            if (l == null && this.f60014j && (map = this.f60016l) != null && (l = (Long) map.get(cOSObjectKey)) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Set missing offset ");
                sb.append(l);
                sb.append(" for object ");
                sb.append(cOSObjectKey);
                this.document.getXrefTable().put(cOSObjectKey, l);
            }
            if (z && (l == null || l.longValue() <= 0)) {
                throw new IOException("Object must be defined and must not be compressed object: " + cOSObjectKey.getNumber() + ":" + cOSObjectKey.getGeneration());
            }
            if (l == null && this.f60014j && this.f60016l == null) {
                m32659q();
                Map map2 = this.f60016l;
                if (map2 != null && !map2.isEmpty()) {
                    Map<COSObjectKey, Long> xrefTable = this.document.getXrefTable();
                    for (Map.Entry entry : this.f60016l.entrySet()) {
                        COSObjectKey cOSObjectKey2 = (COSObjectKey) entry.getKey();
                        if (!xrefTable.containsKey(cOSObjectKey2)) {
                            xrefTable.put(cOSObjectKey2, entry.getValue());
                        }
                    }
                    l = xrefTable.get(cOSObjectKey);
                }
            }
            if (l == null) {
                objectFromPool.setObject(COSNull.NULL);
            } else if (l.longValue() > 0) {
                m32680I(l, cOSObjectKey, objectFromPool);
            } else {
                m32678K((int) (-l.longValue()));
            }
        }
        return objectFromPool.getObject();
    }

    public COSParser(RandomAccessRead randomAccessRead, String str, InputStream inputStream, String str2) {
        super(new C17820Ir1(randomAccessRead));
        this.f60008d = new byte[2048];
        this.f60010f = null;
        this.f60011g = "";
        this.f60012h = null;
        this.f60014j = true;
        this.initialParseDone = false;
        this.f60015k = false;
        this.f60016l = null;
        this.f60017m = null;
        this.f60018n = null;
        this.f60019o = null;
        this.f60020p = null;
        this.securityHandler = null;
        this.f60021q = 2048;
        this.xrefTrailerResolver = new XrefTrailerResolver();
        this.f60022r = new byte[8192];
        this.source = randomAccessRead;
        this.f60011g = str;
        this.f60012h = str2;
        this.f60010f = inputStream;
    }
}
