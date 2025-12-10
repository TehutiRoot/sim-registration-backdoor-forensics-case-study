package androidx.compose.p003ui.graphics;

import android.graphics.Shader;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/Shader;", "internalShader", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "createdSize", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.ShaderBrush */
/* loaded from: classes2.dex */
public abstract class ShaderBrush extends Brush {

    /* renamed from: b */
    public Shader f29158b;

    /* renamed from: c */
    public long f29159c;

    public ShaderBrush() {
        super(null);
        this.f29159c = Size.Companion.m71579getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p003ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo71688applyToPq9zytI(long j, @NotNull Paint p, float f) {
        Intrinsics.checkNotNullParameter(p, "p");
        Shader shader = this.f29158b;
        if (shader == null || !Size.m71567equalsimpl0(this.f29159c, j)) {
            if (Size.m71573isEmptyimpl(j)) {
                shader = null;
                this.f29158b = null;
                this.f29159c = Size.Companion.m71579getUnspecifiedNHjbRc();
            } else {
                shader = mo71710createShaderuvyYCjk(j);
                this.f29158b = shader;
                this.f29159c = j;
            }
        }
        long mo71617getColor0d7_KjU = p.mo71617getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m71736equalsimpl0(mo71617getColor0d7_KjU, companion.m71761getBlack0d7_KjU())) {
            p.mo71623setColor8_81llA(companion.m71761getBlack0d7_KjU());
        }
        if (!Intrinsics.areEqual(p.getShader(), shader)) {
            p.setShader(shader);
        }
        if (p.getAlpha() != f) {
            p.setAlpha(f);
        }
    }

    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo71710createShaderuvyYCjk(long j);
}
