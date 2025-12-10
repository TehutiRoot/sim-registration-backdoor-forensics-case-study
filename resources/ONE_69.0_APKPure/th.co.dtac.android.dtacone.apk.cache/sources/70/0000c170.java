package com.tom_roush.pdfbox.pdfwriter;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class ContentStreamWriter {

    /* renamed from: a */
    public final OutputStream f60099a;
    public static final byte[] SPACE = {32};
    public static final byte[] EOL = {10};

    public ContentStreamWriter(OutputStream outputStream) {
        this.f60099a = outputStream;
    }

    /* renamed from: a */
    public final void m32606a(Object obj) {
        if (obj instanceof COSString) {
            COSWriter.writeString((COSString) obj, this.f60099a);
            this.f60099a.write(SPACE);
        } else if (obj instanceof COSFloat) {
            ((COSFloat) obj).writePDF(this.f60099a);
            this.f60099a.write(SPACE);
        } else if (obj instanceof COSInteger) {
            ((COSInteger) obj).writePDF(this.f60099a);
            this.f60099a.write(SPACE);
        } else if (obj instanceof COSBoolean) {
            ((COSBoolean) obj).writePDF(this.f60099a);
            this.f60099a.write(SPACE);
        } else if (obj instanceof COSName) {
            ((COSName) obj).writePDF(this.f60099a);
            this.f60099a.write(SPACE);
        } else if (obj instanceof COSArray) {
            COSArray cOSArray = (COSArray) obj;
            this.f60099a.write(COSWriter.ARRAY_OPEN);
            for (int i = 0; i < cOSArray.size(); i++) {
                m32606a(cOSArray.get(i));
            }
            this.f60099a.write(COSWriter.ARRAY_CLOSE);
            this.f60099a.write(SPACE);
        } else if (obj instanceof COSDictionary) {
            this.f60099a.write(COSWriter.DICT_OPEN);
            for (Map.Entry<COSName, COSBase> entry : ((COSDictionary) obj).entrySet()) {
                if (entry.getValue() != null) {
                    m32606a(entry.getKey());
                    m32606a(entry.getValue());
                }
            }
            this.f60099a.write(COSWriter.DICT_CLOSE);
            this.f60099a.write(SPACE);
        } else if (obj instanceof Operator) {
            Operator operator = (Operator) obj;
            if (operator.getName().equals(OperatorName.BEGIN_INLINE_IMAGE)) {
                this.f60099a.write(OperatorName.BEGIN_INLINE_IMAGE.getBytes(Charsets.ISO_8859_1));
                this.f60099a.write(EOL);
                COSDictionary imageParameters = operator.getImageParameters();
                for (COSName cOSName : imageParameters.keySet()) {
                    COSBase dictionaryObject = imageParameters.getDictionaryObject(cOSName);
                    cOSName.writePDF(this.f60099a);
                    this.f60099a.write(SPACE);
                    m32606a(dictionaryObject);
                    this.f60099a.write(EOL);
                }
                OutputStream outputStream = this.f60099a;
                Charset charset = Charsets.ISO_8859_1;
                outputStream.write(OperatorName.BEGIN_INLINE_IMAGE_DATA.getBytes(charset));
                OutputStream outputStream2 = this.f60099a;
                byte[] bArr = EOL;
                outputStream2.write(bArr);
                this.f60099a.write(operator.getImageData());
                this.f60099a.write(bArr);
                this.f60099a.write(OperatorName.END_INLINE_IMAGE.getBytes(charset));
                this.f60099a.write(bArr);
                return;
            }
            this.f60099a.write(operator.getName().getBytes(Charsets.ISO_8859_1));
            this.f60099a.write(EOL);
        } else if (obj instanceof COSNull) {
            this.f60099a.write(AbstractJsonLexerKt.NULL.getBytes(Charsets.ISO_8859_1));
            this.f60099a.write(SPACE);
        } else {
            throw new IOException("Error:Unknown type in content stream:" + obj);
        }
    }

    public void writeToken(COSBase cOSBase) throws IOException {
        m32606a(cOSBase);
    }

    public void writeTokens(Object... objArr) throws IOException {
        for (Object obj : objArr) {
            m32606a(obj);
        }
        this.f60099a.write("\n".getBytes(Charsets.US_ASCII));
    }

    public void writeToken(Operator operator) throws IOException {
        m32606a(operator);
    }

    public void writeTokens(List<?> list) throws IOException {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            m32606a(it.next());
        }
    }
}