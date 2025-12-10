package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m28850d2 = {"Lkotlinx/serialization/json/internal/CharsetReader;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", "", "array", "", TypedValues.CycleType.S_WAVE_OFFSET, "length", "read", "([CII)I", "", "release", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()I", OperatorName.CURVE_TO, "Ljava/io/InputStream;", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/CharsetDecoder;", "Ljava/nio/charset/CharsetDecoder;", "decoder", "Ljava/nio/ByteBuffer;", "d", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "e", "Z", "hasLeftoverPotentiallySurrogateChar", "", OperatorName.FILL_NON_ZERO, "C", "leftoverChar", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class CharsetReader {

    /* renamed from: a */
    public final InputStream f71369a;

    /* renamed from: b */
    public final Charset f71370b;

    /* renamed from: c */
    public final CharsetDecoder f71371c;

    /* renamed from: d */
    public final ByteBuffer f71372d;

    /* renamed from: e */
    public boolean f71373e;

    /* renamed from: f */
    public char f71374f;

    public CharsetReader(@NotNull InputStream inputStream, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f71369a = inputStream;
        this.f71370b = charset;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.checkNotNullExpressionValue(onUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f71371c = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
        this.f71372d = wrap;
        wrap.flip();
    }

    /* renamed from: a */
    public final int m26645a(char[] cArr, int i, int i2) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z = false;
        while (true) {
            CoderResult decode = this.f71371c.decode(this.f71372d, wrap, z);
            if (decode.isUnderflow()) {
                if (z || !wrap.hasRemaining()) {
                    break;
                } else if (m26644b() < 0) {
                    if (wrap.position() == 0 && !this.f71372d.hasRemaining()) {
                        z = true;
                        break;
                    }
                    this.f71371c.reset();
                    z = true;
                } else {
                    continue;
                }
            } else if (decode.isOverflow()) {
                wrap.position();
                break;
            } else {
                decode.throwException();
            }
        }
        if (z) {
            this.f71371c.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    /* renamed from: b */
    public final int m26644b() {
        int i;
        this.f71372d.compact();
        try {
            int limit = this.f71372d.limit();
            int position = this.f71372d.position();
            if (position <= limit) {
                i = limit - position;
            } else {
                i = 0;
            }
            int read = this.f71369a.read(this.f71372d.array(), this.f71372d.arrayOffset() + position, i);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = this.f71372d;
            Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + read);
            this.f71372d.flip();
            return this.f71372d.remaining();
        } finally {
            this.f71372d.flip();
        }
    }

    /* renamed from: c */
    public final int m26643c() {
        if (this.f71373e) {
            this.f71373e = false;
            return this.f71374f;
        }
        char[] cArr = new char[2];
        int read = read(cArr, 0, 2);
        if (read == -1) {
            return -1;
        }
        if (read != 1) {
            if (read == 2) {
                this.f71374f = cArr[1];
                this.f71373e = true;
                return cArr[0];
            }
            throw new IllegalStateException(("Unreachable state: " + read).toString());
        }
        return cArr[0];
    }

    public final int read(@NotNull char[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i >= 0 && i < array.length && i2 >= 0 && i + i2 <= array.length) {
            if (this.f71373e) {
                array[i] = this.f71374f;
                i++;
                i2--;
                this.f71373e = false;
                if (i2 == 0) {
                    return 1;
                }
                i3 = 1;
            }
            if (i2 == 1) {
                int m26643c = m26643c();
                if (m26643c == -1) {
                    if (i3 == 0) {
                        return -1;
                    }
                    return i3;
                }
                array[i] = (char) m26643c;
                return i3 + 1;
            }
            return m26645a(array, i, i2) + i3;
        }
        throw new IllegalArgumentException(("Unexpected arguments: " + i + ", " + i2 + ", " + array.length).toString());
    }

    public final void release() {
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.INSTANCE;
        byte[] array = this.f71372d.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        byteArrayPool8k.release(array);
    }
}
