package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0002\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m28850d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "d", OperatorName.NON_STROKING_GRAY, "buffer", TypedValues.CycleType.S_WAVE_OFFSET, "i", "(Lokio/Buffer;JJ)V", "", "name", "", "expected", "actual", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;II)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "B", "section", "Lokio/RealBufferedSource;", "Lokio/RealBufferedSource;", "Ljava/util/zip/Inflater;", OperatorName.CURVE_TO, "Ljava/util/zip/Inflater;", "inflater", "Lokio/InflaterSource;", "Lokio/InflaterSource;", "inflaterSource", "Ljava/util/zip/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 -Util.kt\nokio/_UtilKt\n*L\n1#1,220:1\n1#2:221\n61#3:222\n61#3:224\n61#3:226\n61#3:227\n61#3:228\n61#3:230\n61#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n87#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
/* loaded from: classes6.dex */
public final class GzipSource implements Source {

    /* renamed from: a */
    public byte f72831a;

    /* renamed from: b */
    public final RealBufferedSource f72832b;

    /* renamed from: c */
    public final Inflater f72833c;

    /* renamed from: d */
    public final InflaterSource f72834d;

    /* renamed from: e */
    public final CRC32 f72835e;

    public GzipSource(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.f72832b = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.f72833c = inflater;
        this.f72834d = new InflaterSource((BufferedSource) realBufferedSource, inflater);
        this.f72835e = new CRC32();
    }

    /* renamed from: b */
    public final void m25841b(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        throw new IOException(format);
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f72834d.close();
    }

    /* renamed from: d */
    public final void m25840d() {
        boolean z;
        this.f72832b.require(10L);
        byte b = this.f72832b.bufferField.getByte(3L);
        if (((b >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m25838i(this.f72832b.bufferField, 0L, 10L);
        }
        m25841b("ID1ID2", 8075, this.f72832b.readShort());
        this.f72832b.skip(8L);
        if (((b >> 2) & 1) == 1) {
            this.f72832b.require(2L);
            if (z) {
                m25838i(this.f72832b.bufferField, 0L, 2L);
            }
            long readShortLe = this.f72832b.bufferField.readShortLe();
            this.f72832b.require(readShortLe);
            if (z) {
                m25838i(this.f72832b.bufferField, 0L, readShortLe);
            }
            this.f72832b.skip(readShortLe);
        }
        if (((b >> 3) & 1) == 1) {
            long indexOf = this.f72832b.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z) {
                    m25838i(this.f72832b.bufferField, 0L, indexOf + 1);
                }
                this.f72832b.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((b >> 4) & 1) == 1) {
            long indexOf2 = this.f72832b.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z) {
                    m25838i(this.f72832b.bufferField, 0L, indexOf2 + 1);
                }
                this.f72832b.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m25841b("FHCRC", this.f72832b.readShortLe(), (short) this.f72835e.getValue());
            this.f72835e.reset();
        }
    }

    /* renamed from: g */
    public final void m25839g() {
        m25841b("CRC", this.f72832b.readIntLe(), (int) this.f72835e.getValue());
        m25841b("ISIZE", this.f72832b.readIntLe(), (int) this.f72833c.getBytesWritten());
    }

    /* renamed from: i */
    public final void m25838i(Buffer buffer, long j, long j2) {
        int i;
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        while (true) {
            int i2 = segment.limit;
            int i3 = segment.pos;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        }
        while (j2 > 0) {
            int min = (int) Math.min(segment.limit - i, j2);
            this.f72835e.update(segment.data, (int) (segment.pos + j), min);
            j2 -= min;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j = 0;
        }
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            if (this.f72831a == 0) {
                m25840d();
                this.f72831a = (byte) 1;
            }
            if (this.f72831a == 1) {
                long size = sink.size();
                long read = this.f72834d.read(sink, j);
                if (read != -1) {
                    m25838i(sink, size, read);
                    return read;
                }
                this.f72831a = (byte) 2;
            }
            if (this.f72831a == 2) {
                m25839g();
                this.f72831a = (byte) 3;
                if (!this.f72832b.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.f72832b.timeout();
    }
}
