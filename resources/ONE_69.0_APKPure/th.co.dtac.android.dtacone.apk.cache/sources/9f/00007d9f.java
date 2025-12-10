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
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u000e*\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R+\u00101\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/\"\u0004\b+\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010*R+\u0010;\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b'\u00109\"\u0004\b-\u0010:R/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\b$\u0010=\"\u0004\b)\u0010>R\u001d\u0010@\u001a\u00020\u00198VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b?\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m29142d2 = {"Lcoil/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "start", "end", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;IZZ)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/geometry/Size;", OperatorName.FILL_NON_ZERO, "()J", "painter", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V", "srcSize", "dstSize", "e", "(JJ)J", "Landroidx/compose/ui/graphics/painter/Painter;", OperatorName.CLOSE_PATH, "i", "Landroidx/compose/ui/layout/ContentScale;", OperatorName.SET_LINE_JOINSTYLE, "I", OperatorName.NON_STROKING_CMYK, "Z", OperatorName.LINE_TO, "<set-?>", OperatorName.MOVE_TO, "Landroidx/compose/runtime/MutableState;", "()I", "(I)V", "invalidateTick", "", OperatorName.ENDPATH, OperatorName.SET_LINE_CAPSTYLE, "startTimeMillis", "o", "isDone", "p", "()F", "(F)V", "maxAlpha", OperatorName.SAVE, "()Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "coil-compose-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,127:1\n76#2:128\n102#2,2:129\n76#2:131\n102#2,2:132\n76#2:134\n102#2,2:135\n152#3:137\n152#3:138\n159#3:139\n159#3:145\n159#3:146\n104#4:140\n66#4,4:141\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n*L\n35#1:128\n35#1:129,2\n39#1:131\n39#1:132,2\n40#1:134\n40#1:135,2\n86#1:137\n87#1:138\n108#1:139\n122#1:145\n123#1:146\n111#1:140\n111#1:141,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CrossfadePainter extends Painter {

    /* renamed from: g */
    public Painter f40471g;

    /* renamed from: h */
    public final Painter f40472h;

    /* renamed from: i */
    public final ContentScale f40473i;

    /* renamed from: j */
    public final int f40474j;

    /* renamed from: k */
    public final boolean f40475k;

    /* renamed from: l */
    public final boolean f40476l;

    /* renamed from: m */
    public final MutableState f40477m;

    /* renamed from: n */
    public long f40478n;

    /* renamed from: o */
    public boolean f40479o;

    /* renamed from: p */
    public final MutableState f40480p;

    /* renamed from: q */
    public final MutableState f40481q;

    public CrossfadePainter(@Nullable Painter painter, @Nullable Painter painter2, @NotNull ContentScale contentScale, int i, boolean z, boolean z2) {
        MutableState m65148g;
        MutableState m65148g2;
        MutableState m65148g3;
        this.f40471g = painter;
        this.f40472h = painter2;
        this.f40473i = contentScale;
        this.f40474j = i;
        this.f40475k = z;
        this.f40476l = z2;
        m65148g = AbstractC19036aL1.m65148g(0, null, 2, null);
        this.f40477m = m65148g;
        this.f40478n = -1L;
        m65148g2 = AbstractC19036aL1.m65148g(Float.valueOf(1.0f), null, 2, null);
        this.f40480p = m65148g2;
        m65148g3 = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f40481q = m65148g3;
    }

    /* renamed from: h */
    private final ColorFilter m51113h() {
        return (ColorFilter) this.f40481q.getValue();
    }

    /* renamed from: k */
    private final void m51110k(ColorFilter colorFilter) {
        this.f40481q.setValue(colorFilter);
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        m51108m(f);
        return true;
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        m51110k(colorFilter);
        return true;
    }

    /* renamed from: e */
    public final long m51116e(long j, long j2) {
        Size.Companion companion = Size.Companion;
        if (j == companion.m71763getUnspecifiedNHjbRc() || Size.m71757isEmptyimpl(j)) {
            return j2;
        }
        if (j2 == companion.m71763getUnspecifiedNHjbRc() || Size.m71757isEmptyimpl(j2)) {
            return j2;
        }
        return ScaleFactorKt.m73068timesUQTWf7w(j, this.f40473i.mo72990computeScaleFactorH7hwNQA(j, j2));
    }

    /* renamed from: f */
    public final long m51115f() {
        long m71764getZeroNHjbRc;
        long m71764getZeroNHjbRc2;
        boolean z;
        Painter painter = this.f40471g;
        if (painter != null) {
            m71764getZeroNHjbRc = painter.mo72420getIntrinsicSizeNHjbRc();
        } else {
            m71764getZeroNHjbRc = Size.Companion.m71764getZeroNHjbRc();
        }
        Painter painter2 = this.f40472h;
        if (painter2 != null) {
            m71764getZeroNHjbRc2 = painter2.mo72420getIntrinsicSizeNHjbRc();
        } else {
            m71764getZeroNHjbRc2 = Size.Companion.m71764getZeroNHjbRc();
        }
        Size.Companion companion = Size.Companion;
        boolean z2 = false;
        if (m71764getZeroNHjbRc != companion.m71763getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (m71764getZeroNHjbRc2 != companion.m71763getUnspecifiedNHjbRc()) {
            z2 = true;
        }
        if (z && z2) {
            return SizeKt.Size(Math.max(Size.m71755getWidthimpl(m71764getZeroNHjbRc), Size.m71755getWidthimpl(m71764getZeroNHjbRc2)), Math.max(Size.m71752getHeightimpl(m71764getZeroNHjbRc), Size.m71752getHeightimpl(m71764getZeroNHjbRc2)));
        }
        if (this.f40476l) {
            if (z) {
                return m71764getZeroNHjbRc;
            }
            if (z2) {
                return m71764getZeroNHjbRc2;
            }
        }
        return companion.m71763getUnspecifiedNHjbRc();
    }

    /* renamed from: g */
    public final void m51114g(DrawScope drawScope, Painter painter, float f) {
        if (painter != null && f > 0.0f) {
            long mo72328getSizeNHjbRc = drawScope.mo72328getSizeNHjbRc();
            long m51116e = m51116e(painter.mo72420getIntrinsicSizeNHjbRc(), mo72328getSizeNHjbRc);
            if (mo72328getSizeNHjbRc == Size.Companion.m71763getUnspecifiedNHjbRc() || Size.m71757isEmptyimpl(mo72328getSizeNHjbRc)) {
                painter.m72426drawx_KDEd0(drawScope, m51116e, f, m51113h());
                return;
            }
            float f2 = 2;
            float m71755getWidthimpl = (Size.m71755getWidthimpl(mo72328getSizeNHjbRc) - Size.m71755getWidthimpl(m51116e)) / f2;
            float m71752getHeightimpl = (Size.m71752getHeightimpl(mo72328getSizeNHjbRc) - Size.m71752getHeightimpl(m51116e)) / f2;
            drawScope.getDrawContext().getTransform().inset(m71755getWidthimpl, m71752getHeightimpl, m71755getWidthimpl, m71752getHeightimpl);
            painter.m72426drawx_KDEd0(drawScope, m51116e, f, m51113h());
            float f3 = -m71755getWidthimpl;
            float f4 = -m71752getHeightimpl;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo72420getIntrinsicSizeNHjbRc() {
        return m51115f();
    }

    /* renamed from: i */
    public final int m51112i() {
        return ((Number) this.f40477m.getValue()).intValue();
    }

    /* renamed from: j */
    public final float m51111j() {
        return ((Number) this.f40480p.getValue()).floatValue();
    }

    /* renamed from: l */
    public final void m51109l(int i) {
        this.f40477m.setValue(Integer.valueOf(i));
    }

    /* renamed from: m */
    public final void m51108m(float f) {
        this.f40480p.setValue(Float.valueOf(f));
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        float m51111j;
        boolean z;
        if (this.f40479o) {
            m51114g(drawScope, this.f40472h, m51111j());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f40478n == -1) {
            this.f40478n = uptimeMillis;
        }
        float f = ((float) (uptimeMillis - this.f40478n)) / this.f40474j;
        float coerceIn = AbstractC11695c.coerceIn(f, 0.0f, 1.0f) * m51111j();
        if (this.f40475k) {
            m51111j = m51111j() - coerceIn;
        } else {
            m51111j = m51111j();
        }
        if (f >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f40479o = z;
        m51114g(drawScope, this.f40471g, m51111j);
        m51114g(drawScope, this.f40472h, coerceIn);
        if (this.f40479o) {
            this.f40471g = null;
        } else {
            m51109l(m51112i() + 1);
        }
    }
}