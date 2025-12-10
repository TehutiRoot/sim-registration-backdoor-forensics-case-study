package okio;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006("}, m29142d2 = {"Lokio/CipherSource;", "Lokio/Source;", "Lokio/BufferedSource;", "source", "Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "d", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokio/BufferedSource;", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "", OperatorName.CURVE_TO, "I", "blockSize", "Lokio/Buffer;", "buffer", "", "e", "Z", "final", OperatorName.FILL_NON_ZERO, "closed", "okio"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes6.dex */
public final class CipherSource implements Source {

    /* renamed from: a */
    public final BufferedSource f72887a;

    /* renamed from: b */
    public final Cipher f72888b;

    /* renamed from: c */
    public final int f72889c;

    /* renamed from: d */
    public final Buffer f72890d;

    /* renamed from: e */
    public boolean f72891e;

    /* renamed from: f */
    public boolean f72892f;

    public CipherSource(@NotNull BufferedSource source, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f72887a = source;
        this.f72888b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f72889c = blockSize;
        this.f72890d = new Buffer();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    /* renamed from: b */
    public final void m26034b() {
        int outputSize = this.f72888b.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        Segment writableSegment$okio = this.f72890d.writableSegment$okio(outputSize);
        int doFinal = this.f72888b.doFinal(writableSegment$okio.data, writableSegment$okio.pos);
        writableSegment$okio.limit += doFinal;
        Buffer buffer = this.f72890d;
        buffer.setSize$okio(buffer.size() + doFinal);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.f72890d.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f72892f = true;
        this.f72887a.close();
    }

    /* renamed from: d */
    public final void m26033d() {
        while (this.f72890d.size() == 0 && !this.f72891e) {
            if (this.f72887a.exhausted()) {
                this.f72891e = true;
                m26034b();
                return;
            }
            m26032g();
        }
    }

    /* renamed from: g */
    public final void m26032g() {
        Segment segment = this.f72887a.getBuffer().head;
        Intrinsics.checkNotNull(segment);
        int i = segment.limit - segment.pos;
        int outputSize = this.f72888b.getOutputSize(i);
        while (outputSize > 8192) {
            int i2 = this.f72889c;
            if (i <= i2) {
                this.f72891e = true;
                Buffer buffer = this.f72890d;
                byte[] doFinal = this.f72888b.doFinal(this.f72887a.readByteArray());
                Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(source.readByteArray())");
                buffer.write(doFinal);
                return;
            }
            i -= i2;
            outputSize = this.f72888b.getOutputSize(i);
        }
        Segment writableSegment$okio = this.f72890d.writableSegment$okio(outputSize);
        int update = this.f72888b.update(segment.data, segment.pos, i, writableSegment$okio.data, writableSegment$okio.pos);
        this.f72887a.skip(i);
        writableSegment$okio.limit += update;
        Buffer buffer2 = this.f72890d;
        buffer2.setSize$okio(buffer2.size() + update);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.f72890d.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    @NotNull
    public final Cipher getCipher() {
        return this.f72888b;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.f72892f) {
                if (i == 0) {
                    return 0L;
                }
                m26033d();
                return this.f72890d.read(sink, j);
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.f72887a.timeout();
    }
}