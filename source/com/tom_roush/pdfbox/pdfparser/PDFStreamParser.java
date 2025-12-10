package com.tom_roush.pdfbox.pdfparser;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.RandomAccessBuffer;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class PDFStreamParser extends BaseParser {

    /* renamed from: d */
    public final List f60026d;

    /* renamed from: e */
    public final byte[] f60027e;

    @Deprecated
    public PDFStreamParser(PDStream pDStream) throws IOException {
        super(new C18425Se0(pDStream.createInputStream()));
        this.f60026d = new ArrayList(100);
        this.f60027e = new byte[10];
    }

    public List<Object> getTokens() {
        return this.f60026d;
    }

    /* renamed from: l */
    public final boolean m32645l() {
        return m32643n(this.f60000b.peek());
    }

    /* renamed from: m */
    public final boolean m32644m(KF1 kf1) {
        int i = 10;
        int read = kf1.read(this.f60027e, 0, 10);
        boolean z = true;
        if (read > 0) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < read; i4++) {
                byte b = this.f60027e[i4];
                if ((b != 0 && b < 9) || (b > 10 && b < 32 && b != 13)) {
                    z = false;
                    break;
                }
                if (i2 == -1 && b != 0 && b != 9 && b != 32 && b != 10 && b != 13) {
                    i2 = i4;
                } else if (i2 != -1 && i3 == -1 && (b == 0 || b == 9 || b == 32 || b == 10 || b == 13)) {
                    i3 = i4;
                }
            }
            if (i3 != -1 && i2 != -1) {
                String str = new String(this.f60027e, i2, i3 - i2);
                if (!OperatorName.RESTORE.equals(str) && !OperatorName.END_MARKED_CONTENT.equals(str) && !"S".equals(str)) {
                    z = false;
                }
            }
            if (read == 10) {
                if (i2 == -1 || i3 != -1) {
                    i = i3;
                }
                if (i != -1 && i2 != -1 && i - i2 > 3) {
                    z = false;
                }
            }
            kf1.mo66314f(this.f60027e, 0, read);
        }
        if (!z) {
            Log.w("PdfBox-Android", "ignoring 'EI' assumed to be in the middle of inline image at stream offset " + kf1.getPosition());
        }
        return z;
    }

    /* renamed from: n */
    public final boolean m32643n(int i) {
        return i == 10 || i == 13 || i == 32;
    }

    public void parse() throws IOException {
        while (true) {
            Object parseNextToken = parseNextToken();
            if (parseNextToken != null) {
                this.f60026d.add(parseNextToken);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0226 -> B:105:0x01fb). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object parseNextToken() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.PDFStreamParser.parseNextToken():java.lang.Object");
    }

    public String readOperator() throws IOException {
        skipSpaces();
        StringBuilder sb = new StringBuilder(4);
        int peek = this.f60000b.peek();
        while (peek != -1 && !isWhitespace(peek) && !isClosing(peek) && peek != 91 && peek != 60 && peek != 40 && peek != 47 && (peek < 48 || peek > 57)) {
            char read = (char) this.f60000b.read();
            int peek2 = this.f60000b.peek();
            sb.append(read);
            if (read == 'd' && (peek2 == 48 || peek2 == 49)) {
                sb.append((char) this.f60000b.read());
                peek = this.f60000b.peek();
            } else {
                peek = peek2;
            }
        }
        return sb.toString();
    }

    @Deprecated
    public PDFStreamParser(COSStream cOSStream) throws IOException {
        super(new C18425Se0(cOSStream.createInputStream()));
        this.f60026d = new ArrayList(100);
        this.f60027e = new byte[10];
    }

    public PDFStreamParser(PDContentStream pDContentStream) throws IOException {
        super(new C18425Se0(pDContentStream.getContents()));
        this.f60026d = new ArrayList(100);
        this.f60027e = new byte[10];
    }

    public PDFStreamParser(byte[] bArr) throws IOException {
        super(new C17820Ir1(new RandomAccessBuffer(bArr)));
        this.f60026d = new ArrayList(100);
        this.f60027e = new byte[10];
    }
}
