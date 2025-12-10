package coil.compose;

import android.os.SystemClock;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.ScaleFactorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u000e*\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R+\u00101\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/\"\u0004\b+\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010*R+\u0010;\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b'\u00109\"\u0004\b-\u0010:R/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\b$\u0010=\"\u0004\b)\u0010>R\u001d\u0010@\u001a\u00020\u00198VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b?\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m28850d2 = {"Lcoil/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "start", "end", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;IZZ)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/geometry/Size;", OperatorName.FILL_NON_ZERO, "()J", "painter", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V", "srcSize", "dstSize", "e", "(JJ)J", "Landroidx/compose/ui/graphics/painter/Painter;", OperatorName.CLOSE_PATH, "i", "Landroidx/compose/ui/layout/ContentScale;", OperatorName.SET_LINE_JOINSTYLE, "I", OperatorName.NON_STROKING_CMYK, "Z", OperatorName.LINE_TO, "<set-?>", OperatorName.MOVE_TO, "Landroidx/compose/runtime/MutableState;", "()I", "(I)V", "invalidateTick", "", OperatorName.ENDPATH, OperatorName.SET_LINE_CAPSTYLE, "startTimeMillis", "o", "isDone", "p", "()F", "(F)V", "maxAlpha", OperatorName.SAVE, "()Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,127:1\n76#2:128\n102#2,2:129\n76#2:131\n102#2,2:132\n76#2:134\n102#2,2:135\n152#3:137\n152#3:138\n159#3:139\n159#3:145\n159#3:146\n104#4:140\n66#4,4:141\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n*L\n35#1:128\n35#1:129,2\n39#1:131\n39#1:132,2\n40#1:134\n40#1:135,2\n86#1:137\n87#1:138\n108#1:139\n122#1:145\n123#1:146\n111#1:140\n111#1:141,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CrossfadePainter extends Painter {

    /* renamed from: g */
    public Painter f40459g;

    /* renamed from: h */
    public final Painter f40460h;

    /* renamed from: i */
    public final ContentScale f40461i;

    /* renamed from: j */
    public final int f40462j;

    /* renamed from: k */
    public final boolean f40463k;

    /* renamed from: l */
    public final boolean f40464l;

    /* renamed from: m */
    public final MutableState f40465m;

    /* renamed from: n */
    public long f40466n;

    /* renamed from: o */
    public boolean f40467o;

    /* renamed from: p */
    public final MutableState f40468p;

    /* renamed from: q */
    public final MutableState f40469q;

    public CrossfadePainter(@Nullable Painter painter, @Nullable Painter painter2, @NotNull ContentScale contentScale, int i, boolean z, boolean z2) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        this.f40459g = painter;
        this.f40460h = painter2;
        this.f40461i = contentScale;
        this.f40462j = i;
        this.f40463k = z;
        this.f40464l = z2;
        m31891g = AbstractC19508dK1.m31891g(0, null, 2, null);
        this.f40465m = m31891g;
        this.f40466n = -1L;
        m31891g2 = AbstractC19508dK1.m31891g(Float.valueOf(1.0f), null, 2, null);
        this.f40468p = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f40469q = m31891g3;
    }

    /* renamed from: h */
    private final ColorFilter m51116h() {
        return (ColorFilter) this.f40469q.getValue();
    }

    /* renamed from: k */
    private final void m51113k(ColorFilter colorFilter) {
        this.f40469q.setValue(colorFilter);
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        m51111m(f);
        return true;
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        m51113k(colorFilter);
        return true;
    }

    /* renamed from: e */
    public final long m51119e(long j, long j2) {
        Size.Companion companion = Size.Companion;
        if (j == companion.m71579getUnspecifiedNHjbRc() || Size.m71573isEmptyimpl(j)) {
            return j2;
        }
        if (j2 == companion.m71579getUnspecifiedNHjbRc() || Size.m71573isEmptyimpl(j2)) {
            return j2;
        }
        return ScaleFactorKt.m72884timesUQTWf7w(j, this.f40461i.mo72806computeScaleFactorH7hwNQA(j, j2));
    }

    /* renamed from: f */
    public final long m51118f() {
        long m71580getZeroNHjbRc;
        long m71580getZeroNHjbRc2;
        boolean z;
        Painter painter = this.f40459g;
        if (painter != null) {
            m71580getZeroNHjbRc = painter.mo72236getIntrinsicSizeNHjbRc();
        } else {
            m71580getZeroNHjbRc = Size.Companion.m71580getZeroNHjbRc();
        }
        Painter painter2 = this.f40460h;
        if (painter2 != null) {
            m71580getZeroNHjbRc2 = painter2.mo72236getIntrinsicSizeNHjbRc();
        } else {
            m71580getZeroNHjbRc2 = Size.Companion.m71580getZeroNHjbRc();
        }
        Size.Companion companion = Size.Companion;
        boolean z2 = false;
        if (m71580getZeroNHjbRc != companion.m71579getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (m71580getZeroNHjbRc2 != companion.m71579getUnspecifiedNHjbRc()) {
            z2 = true;
        }
        if (z && z2) {
            return SizeKt.Size(Math.max(Size.m71571getWidthimpl(m71580getZeroNHjbRc), Size.m71571getWidthimpl(m71580getZeroNHjbRc2)), Math.max(Size.m71568getHeightimpl(m71580getZeroNHjbRc), Size.m71568getHeightimpl(m71580getZeroNHjbRc2)));
        }
        if (this.f40464l) {
            if (z) {
                return m71580getZeroNHjbRc;
            }
            if (z2) {
                return m71580getZeroNHjbRc2;
            }
        }
        return companion.m71579getUnspecifiedNHjbRc();
    }

    /* renamed from: g */
    public final void m51117g(DrawScope drawScope, Painter painter, float f) {
        if (painter != null && f > 0.0f) {
            long mo72144getSizeNHjbRc = drawScope.mo72144getSizeNHjbRc();
            long m51119e = m51119e(painter.mo72236getIntrinsicSizeNHjbRc(), mo72144getSizeNHjbRc);
            if (mo72144getSizeNHjbRc == Size.Companion.m71579getUnspecifiedNHjbRc() || Size.m71573isEmptyimpl(mo72144getSizeNHjbRc)) {
                painter.m72242drawx_KDEd0(drawScope, m51119e, f, m51116h());
                return;
            }
            float f2 = 2;
            float m71571getWidthimpl = (Size.m71571getWidthimpl(mo72144getSizeNHjbRc) - Size.m71571getWidthimpl(m51119e)) / f2;
            float m71568getHeightimpl = (Size.m71568getHeightimpl(mo72144getSizeNHjbRc) - Size.m71568getHeightimpl(m51119e)) / f2;
            drawScope.getDrawContext().getTransform().inset(m71571getWidthimpl, m71568getHeightimpl, m71571getWidthimpl, m71568getHeightimpl);
            painter.m72242drawx_KDEd0(drawScope, m51119e, f, m51116h());
            float f3 = -m71571getWidthimpl;
            float f4 = -m71568getHeightimpl;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo72236getIntrinsicSizeNHjbRc() {
        return m51118f();
    }

    /* renamed from: i */
    public final int m51115i() {
        return ((Number) this.f40465m.getValue()).intValue();
    }

    /* renamed from: j */
    public final float m51114j() {
        return ((Number) this.f40468p.getValue()).floatValue();
    }

    /* renamed from: l */
    public final void m51112l(int i) {
        this.f40465m.setValue(Integer.valueOf(i));
    }

    /* renamed from: m */
    public final void m51111m(float f) {
        this.f40468p.setValue(Float.valueOf(f));
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        float m51114j;
        boolean z;
        if (this.f40467o) {
            m51117g(drawScope, this.f40460h, m51114j());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f40466n == -1) {
            this.f40466n = uptimeMillis;
        }
        float f = ((float) (uptimeMillis - this.f40466n)) / this.f40462j;
        float coerceIn = AbstractC11719c.coerceIn(f, 0.0f, 1.0f) * m51114j();
        if (this.f40463k) {
            m51114j = m51114j() - coerceIn;
        } else {
            m51114j = m51114j();
        }
        if (f >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f40467o = z;
        m51117g(drawScope, this.f40459g, m51114j);
        m51117g(drawScope, this.f40460h, coerceIn);
        if (this.f40467o) {
            this.f40459g = null;
        } else {
            m51112l(m51115i() + 1);
        }
    }
}
