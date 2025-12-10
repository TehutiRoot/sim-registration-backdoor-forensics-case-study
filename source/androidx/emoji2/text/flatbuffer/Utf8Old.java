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
    public static final ThreadLocal f35272b;

    /* renamed from: androidx.emoji2.text.flatbuffer.Utf8Old$a */
    /* loaded from: classes2.dex */
    public static class C4544a {

        /* renamed from: a */
        public final CharsetEncoder f35273a;

        /* renamed from: b */
        public final CharsetDecoder f35274b;

        /* renamed from: c */
        public CharSequence f35275c = null;

        /* renamed from: d */
        public ByteBuffer f35276d = null;

        public C4544a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f35273a = charset.newEncoder();
            this.f35274b = charset.newDecoder();
        }
    }

    static {
        ThreadLocal withInitial;
        withInitial = ThreadLocal.withInitial(new Supplier() { // from class: y02
            @Override // java.util.function.Supplier
            public final Object get() {
                return Utf8Old.m54631a();
            }
        });
        f35272b = withInitial;
    }

    /* renamed from: a */
    public static /* synthetic */ C4544a m54631a() {
        return m54630b();
    }

    /* renamed from: b */
    public static /* synthetic */ C4544a m54630b() {
        return new C4544a();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = ((C4544a) f35272b.get()).f35274b;
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
        C4544a c4544a = (C4544a) f35272b.get();
        if (c4544a.f35275c != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(c4544a.f35276d);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        CharBuffer wrap;
        C4544a c4544a = (C4544a) f35272b.get();
        int length = (int) (charSequence.length() * c4544a.f35273a.maxBytesPerChar());
        ByteBuffer byteBuffer = c4544a.f35276d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            c4544a.f35276d = ByteBuffer.allocate(Math.max(128, length));
        }
        c4544a.f35276d.clear();
        c4544a.f35275c = charSequence;
        if (charSequence instanceof CharBuffer) {
            wrap = (CharBuffer) charSequence;
        } else {
            wrap = CharBuffer.wrap(charSequence);
        }
        CoderResult encode = c4544a.f35273a.encode(wrap, c4544a.f35276d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        c4544a.f35276d.flip();
        return c4544a.f35276d.remaining();
    }
}
