package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin(version = "1.9")
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m29142d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "", "read", "()J", "Lkotlin/time/Duration;", TypedValues.TransitionType.S_DURATION, "", "plusAssign-LRDsOJo", "(J)V", "plusAssign", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "reading", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
/* loaded from: classes6.dex */
public final class TestTimeSource extends AbstractLongTimeSource {

    /* renamed from: c */
    public long f70601c;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* renamed from: c */
    public final void m27700c(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f70601c + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m74757toStringimpl(j)) + '.');
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m74818plusAssignLRDsOJo(long j) {
        long m74754toLongimpl = Duration.m74754toLongimpl(j, getUnit());
        if (((m74754toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            long m74716divUwyO8pc = Duration.m74716divUwyO8pc(j, 2);
            if ((1 | (Duration.m74754toLongimpl(m74716divUwyO8pc, getUnit()) - 1)) == Long.MAX_VALUE) {
                m27700c(j);
                return;
            }
            long j2 = this.f70601c;
            try {
                m74818plusAssignLRDsOJo(m74716divUwyO8pc);
                m74818plusAssignLRDsOJo(Duration.m74743minusLRDsOJo(j, m74716divUwyO8pc));
                return;
            } catch (IllegalStateException e) {
                this.f70601c = j2;
                throw e;
            }
        }
        long j3 = this.f70601c;
        long j4 = j3 + m74754toLongimpl;
        if ((m74754toLongimpl ^ j3) >= 0 && (j3 ^ j4) < 0) {
            m27700c(j);
        }
        this.f70601c = j4;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.f70601c;
    }
}