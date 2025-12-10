package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public class Utf8Old extends Utf8 {

    /* renamed from: b */
    public static final ThreadLocal f35360b;

    /* renamed from: androidx.emoji2.text.flatbuffer.Utf8Old$a */
    /* loaded from: classes2.dex */
    public static class C4526a {

        /* renamed from: a */
        public final CharsetEncoder f35361a;

        /* renamed from: b */
        public final CharsetDecoder f35362b;

        /* renamed from: c */
        public CharSequence f35363c = null;

        /* renamed from: d */
        public ByteBuffer f35364d = null;

        public C4526a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f35361a = charset.newEncoder();
            this.f35362b = charset.newDecoder();
        }
    }

    static {
        ThreadLocal withInitial;
        withInitial = ThreadLocal.withInitial(new Supplier() { // from class: v12
            @Override // java.util.function.Supplier
            public final Object get() {
                return Utf8Old.m54581a();
            }
        });
        f35360b = withInitial;
    }

    /* renamed from: a */
    public static /* synthetic */ C4526a m54581a() {
        return m54580b();
    }

    /* renamed from: b */
    public static /* synthetic */ C4526a m54580b() {
        return new C4526a();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = ((C4526a) f35360b.get()).f35362b;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        C4526a c4526a = (C4526a) f35360b.get();
        if (c4526a.f35363c != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(c4526a.f35364d);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        CharBuffer wrap;
        C4526a c4526a = (C4526a) f35360b.get();
        int length = (int) (charSequence.length() * c4526a.f35361a.maxBytesPerChar());
        ByteBuffer byteBuffer = c4526a.f35364d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            c4526a.f35364d = ByteBuffer.allocate(Math.max(128, length));
        }
        c4526a.f35364d.clear();
        c4526a.f35363c = charSequence;
        if (charSequence instanceof CharBuffer) {
            wrap = (CharBuffer) charSequence;
        } else {
            wrap = CharBuffer.wrap(charSequence);
        }
        CoderResult encode = c4526a.f35361a.encode(wrap, c4526a.f35364d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        c4526a.f35364d.flip();
        return c4526a.f35364d.remaining();
    }
}