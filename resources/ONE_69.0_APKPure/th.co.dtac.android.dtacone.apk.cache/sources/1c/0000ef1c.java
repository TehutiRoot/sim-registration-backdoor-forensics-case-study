package org.apache.commons.codec.net;

import com.facebook.stetho.dumpapp.Framer;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes6.dex */
public class QCodec extends AbstractC21722ps1 implements StringEncoder, StringDecoder {

    /* renamed from: b */
    public static final BitSet f73306b;

    /* renamed from: a */
    public boolean f73307a;

    static {
        BitSet bitSet = new BitSet(256);
        f73306b = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i = 48; i <= 57; i++) {
            f73306b.set(i);
        }
        BitSet bitSet2 = f73306b;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i2 = 65; i2 <= 90; i2++) {
            f73306b.set(i2);
        }
        BitSet bitSet3 = f73306b;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i3 = 97; i3 <= 122; i3++) {
            f73306b.set(i3);
        }
        BitSet bitSet4 = f73306b;
        bitSet4.set(CameraActivity.REQUEST_CODE);
        bitSet4.set(124);
        bitSet4.set(125);
        bitSet4.set(WebSocketProtocol.PAYLOAD_SHORT);
    }

    public QCodec() {
        this(StandardCharsets.UTF_8);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using Q codec");
    }

    @Override // p000.AbstractC21722ps1
    public byte[] doDecoding(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        for (byte b : bArr) {
            if (b == 95) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i = 0; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    if (b2 != 95) {
                        bArr2[i] = b2;
                    } else {
                        bArr2[i] = 32;
                    }
                }
                return QuotedPrintableCodec.decodeQuotedPrintable(bArr2);
            }
        }
        return QuotedPrintableCodec.decodeQuotedPrintable(bArr);
    }

    @Override // p000.AbstractC21722ps1
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] encodeQuotedPrintable = QuotedPrintableCodec.encodeQuotedPrintable(f73306b, bArr);
        if (this.f73307a) {
            for (int i = 0; i < encodeQuotedPrintable.length; i++) {
                if (encodeQuotedPrintable[i] == 32) {
                    encodeQuotedPrintable[i] = Framer.STDIN_REQUEST_FRAME_PREFIX;
                }
            }
        }
        return encodeQuotedPrintable;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using Q codec");
    }

    @Override // p000.AbstractC21722ps1
    public /* bridge */ /* synthetic */ Charset getCharset() {
        return super.getCharset();
    }

    @Override // p000.AbstractC21722ps1
    public /* bridge */ /* synthetic */ String getDefaultCharset() {
        return super.getDefaultCharset();
    }

    @Override // p000.AbstractC21722ps1
    public String getEncoding() {
        return OperatorName.RESTORE;
    }

    public boolean isEncodeBlanks() {
        return this.f73307a;
    }

    public void setEncodeBlanks(boolean z) {
        this.f73307a = z;
    }

    public QCodec(Charset charset) {
        super(charset);
    }

    public QCodec(String str) {
        this(Charset.forName(str));
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        try {
            return decodeText(str);
        } catch (UnsupportedEncodingException e) {
            throw new DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) throws EncoderException {
        return encode(str, getCharset());
    }

    public String encode(String str, Charset charset) throws EncoderException {
        return encodeText(str, charset);
    }

    public String encode(String str, String str2) throws EncoderException {
        try {
            return encodeText(str, str2);
        } catch (UnsupportedCharsetException e) {
            throw new EncoderException(e.getMessage(), e);
        }
    }
}