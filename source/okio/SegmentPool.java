package okio;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001e"}, m28850d2 = {"Lokio/SegmentPool;", "", "<init>", "()V", "Lokio/Segment;", "take", "()Lokio/Segment;", "segment", "", "recycle", "(Lokio/Segment;)V", "Ljava/util/concurrent/atomic/AtomicReference;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/util/concurrent/atomic/AtomicReference;", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lokio/Segment;", "LOCK", OperatorName.CURVE_TO, "HASH_BUCKET_COUNT", "", "d", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "getByteCount", "byteCount", "okio"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SegmentPool {
    @NotNull
    public static final SegmentPool INSTANCE = new SegmentPool();

    /* renamed from: a */
    public static final int f72870a = 65536;

    /* renamed from: b */
    public static final Segment f72871b = new Segment(new byte[0], 0, 0, false, false);

    /* renamed from: c */
    public static final int f72872c;

    /* renamed from: d */
    public static final AtomicReference[] f72873d;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f72872c = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f72873d = atomicReferenceArr;
    }

    @JvmStatic
    public static final void recycle(@NotNull Segment segment) {
        int i;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.next == null && segment.prev == null) {
            if (segment.shared) {
                return;
            }
            AtomicReference m25827a = INSTANCE.m25827a();
            Segment segment2 = f72871b;
            Segment segment3 = (Segment) m25827a.getAndSet(segment2);
            if (segment3 == segment2) {
                return;
            }
            if (segment3 != null) {
                i = segment3.limit;
            } else {
                i = 0;
            }
            if (i >= f72870a) {
                m25827a.set(segment3);
                return;
            }
            segment.next = segment3;
            segment.pos = 0;
            segment.limit = i + 8192;
            m25827a.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @JvmStatic
    @NotNull
    public static final Segment take() {
        AtomicReference m25827a = INSTANCE.m25827a();
        Segment segment = f72871b;
        Segment segment2 = (Segment) m25827a.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            m25827a.set(null);
            return new Segment();
        }
        m25827a.set(segment2.next);
        segment2.next = null;
        segment2.limit = 0;
        return segment2;
    }

    /* renamed from: a */
    public final AtomicReference m25827a() {
        return f72873d[(int) (Thread.currentThread().getId() & (f72872c - 1))];
    }

    public final int getByteCount() {
        Segment segment = (Segment) m25827a().get();
        if (segment == null) {
            return 0;
        }
        return segment.limit;
    }

    public final int getMAX_SIZE() {
        return f72870a;
    }
}
