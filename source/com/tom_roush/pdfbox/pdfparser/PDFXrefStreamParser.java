package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.cos.COSStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class PDFXrefStreamParser extends BaseParser {

    /* renamed from: d */
    public final XrefTrailerResolver f60036d;

    /* renamed from: e */
    public final int[] f60037e;

    /* renamed from: f */
    public C9910b f60038f;

    /* renamed from: com.tom_roush.pdfbox.pdfparser.PDFXrefStreamParser$b */
    /* loaded from: classes5.dex */
    public static class C9910b implements Iterator {

        /* renamed from: a */
        public final long[] f60039a;

        /* renamed from: b */
        public final long[] f60040b;

        /* renamed from: c */
        public int f60041c;

        /* renamed from: d */
        public long f60042d;

        /* renamed from: e */
        public long f60043e;

        /* renamed from: f */
        public long f60044f;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Long next() {
            long j = this.f60043e;
            if (j < this.f60044f) {
                if (j < this.f60042d) {
                    this.f60043e = 1 + j;
                    return Long.valueOf(j);
                }
                long[] jArr = this.f60039a;
                int i = this.f60041c + 1;
                this.f60041c = i;
                long j2 = jArr[i];
                this.f60043e = j2;
                this.f60042d = this.f60040b[i];
                this.f60043e = 1 + j2;
                return Long.valueOf(j2);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f60043e < this.f60044f) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C9910b(COSArray cOSArray) {
            this.f60041c = 0;
            this.f60042d = 0L;
            this.f60043e = 0L;
            this.f60044f = 0L;
            long[] jArr = new long[cOSArray.size() / 2];
            this.f60039a = jArr;
            this.f60040b = new long[jArr.length];
            Iterator<COSBase> it = cOSArray.iterator();
            int i = 0;
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSInteger) {
                    long longValue = ((COSInteger) next).longValue();
                    if (!it.hasNext()) {
                        break;
                    }
                    COSBase next2 = it.next();
                    if (next2 instanceof COSInteger) {
                        long longValue2 = ((COSInteger) next2).longValue();
                        this.f60039a[i] = longValue;
                        this.f60040b[i] = longValue + longValue2;
                        i++;
                    } else {
                        throw new IOException("Xref stream must have integer in /Index array");
                    }
                } else {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
            }
            this.f60043e = this.f60039a[0];
            long[] jArr2 = this.f60040b;
            this.f60042d = jArr2[0];
            this.f60044f = jArr2[i - 1];
        }
    }

    public PDFXrefStreamParser(COSStream cOSStream, COSDocument cOSDocument, XrefTrailerResolver xrefTrailerResolver) throws IOException {
        super(new C18425Se0(cOSStream.createInputStream()));
        this.f60037e = new int[3];
        this.f60038f = null;
        this.document = cOSDocument;
        this.f60036d = xrefTrailerResolver;
        try {
            m32637m(cOSStream);
        } catch (IOException unused) {
            m32638l();
        }
    }

    /* renamed from: l */
    public final void m32638l() {
        KF1 kf1 = this.f60000b;
        if (kf1 != null) {
            kf1.close();
        }
        this.document = null;
    }

    /* renamed from: m */
    public final void m32637m(COSStream cOSStream) {
        COSArray cOSArray = cOSStream.getCOSArray(COSName.f59846W);
        if (cOSArray != null) {
            if (cOSArray.size() == 3) {
                for (int i = 0; i < 3; i++) {
                    this.f60037e[i] = cOSArray.getInt(i, 0);
                }
                int[] iArr = this.f60037e;
                if (iArr[0] >= 0 && iArr[1] >= 0 && iArr[2] >= 0) {
                    COSArray cOSArray2 = cOSStream.getCOSArray(COSName.INDEX);
                    if (cOSArray2 == null) {
                        cOSArray2 = new COSArray();
                        cOSArray2.add((COSBase) COSInteger.ZERO);
                        cOSArray2.add((COSBase) COSInteger.get(cOSStream.getInt(COSName.SIZE, 0)));
                    }
                    if (cOSArray2.size() % 2 != 1) {
                        this.f60038f = new C9910b(cOSArray2);
                        return;
                    }
                    throw new IOException("Wrong number of values for /Index array in XRef: " + Arrays.toString(this.f60037e));
                }
                throw new IOException("Incorrect /W array in XRef: " + Arrays.toString(this.f60037e));
            }
            throw new IOException("Wrong number of values for /W array in XRef: " + Arrays.toString(this.f60037e));
        }
        throw new IOException("/W array is missing in Xref stream");
    }

    /* renamed from: n */
    public final long m32636n(byte[] bArr, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += (bArr[i3 + i] & 255) << (((i2 - i3) - 1) * 8);
        }
        return j;
    }

    public void parse() throws IOException {
        int m32636n;
        int i;
        int[] iArr = this.f60037e;
        byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
        while (!this.f60000b.isEOF() && this.f60038f.hasNext()) {
            this.f60000b.read(bArr);
            long longValue = this.f60038f.next().longValue();
            int i2 = this.f60037e[0];
            if (i2 == 0) {
                m32636n = 1;
            } else {
                m32636n = (int) m32636n(bArr, 0, i2);
            }
            if (m32636n != 0) {
                int[] iArr2 = this.f60037e;
                long m32636n2 = m32636n(bArr, iArr2[0], iArr2[1]);
                if (m32636n == 1) {
                    int[] iArr3 = this.f60037e;
                    i = (int) m32636n(bArr, iArr3[0] + iArr3[1], iArr3[2]);
                } else {
                    i = 0;
                }
                COSObjectKey cOSObjectKey = new COSObjectKey(longValue, i);
                if (m32636n == 1) {
                    this.f60036d.setXRef(cOSObjectKey, m32636n2);
                } else {
                    this.f60036d.setXRef(cOSObjectKey, -m32636n2);
                }
            }
        }
        m32638l();
    }
}
