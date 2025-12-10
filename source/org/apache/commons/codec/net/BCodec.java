package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;

/* loaded from: classes6.dex */
public class BCodec extends AbstractC22173sr1 implements StringEncoder, StringDecoder {

    /* renamed from: b */
    public static final CodecPolicy f73216b = CodecPolicy.LENIENT;

    /* renamed from: a */
    public final CodecPolicy f73217a;

    public BCodec() {
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
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
    }

    @Override // p000.AbstractC22173sr1
    public byte[] doDecoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new Base64(0, BaseNCodec.getChunkSeparator(), false, this.f73217a).decode(bArr);
    }

    @Override // p000.AbstractC22173sr1
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeBase64(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
    }

    @Override // p000.AbstractC22173sr1
    public /* bridge */ /* synthetic */ Charset getCharset() {
        return super.getCharset();
    }

    @Override // p000.AbstractC22173sr1
    public /* bridge */ /* synthetic */ String getDefaultCharset() {
        return super.getDefaultCharset();
    }

    @Override // p000.AbstractC22173sr1
    public String getEncoding() {
        return "B";
    }

    public boolean isStrictDecoding() {
        if (this.f73217a == CodecPolicy.STRICT) {
            return true;
        }
        return false;
    }

    public BCodec(Charset charset) {
        this(charset, f73216b);
    }

    public BCodec(Charset charset, CodecPolicy codecPolicy) {
        super(charset);
        this.f73217a = codecPolicy;
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        try {
            return decodeText(str);
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            throw new DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) throws EncoderException {
        return encode(str, getCharset());
    }

    public BCodec(String str) {
        this(Charset.forName(str));
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
