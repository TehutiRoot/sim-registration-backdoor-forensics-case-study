package coil.compose;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.ScaleFactorKt;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffset;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0018\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ#\u0010!\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\u001eJ#\u0010\"\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u0013\u0010%\u001a\u00020$*\u00020#H\u0016¢\u0006\u0004\b%\u0010&JD\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, m28850d2 = {"Lcoil/compose/ContentPainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)Lcoil/compose/ContentPainterModifier;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/geometry/Size;", "dstSize", "d", "(J)J", "e", OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/layout/ContentScale;", OperatorName.FILL_NON_ZERO, "F", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/graphics/ColorFilter;", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 Utils.kt\ncoil/compose/UtilsKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,196:1\n135#2:197\n152#3:198\n152#3:199\n152#3:200\n152#3:201\n159#3:202\n159#3:205\n87#4:203\n87#4:204\n66#5:206\n70#5:207\n66#5,5:208\n120#6,4:213\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n*L\n38#1:197\n62#1:198\n76#1:199\n90#1:200\n104#1:201\n118#1:202\n138#1:205\n121#1:203\n122#1:204\n156#1:206\n158#1:207\n170#1:208,5\n186#1:213,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    /* renamed from: c */
    public final Painter f40454c;

    /* renamed from: d */
    public final Alignment f40455d;

    /* renamed from: e */
    public final ContentScale f40456e;

    /* renamed from: f */
    public final float f40457f;

    /* renamed from: g */
    public final ColorFilter f40458g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ContentPainterModifier(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.graphics.painter.Painter r8, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.Alignment r9, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.layout.ContentScale r10, float r11, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.ColorFilter r12) {
        /*
            r7 = this;
            boolean r0 = androidx.compose.p003ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L12
            coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1 r0 = new coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L16
        L12:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.p003ui.platform.InspectableValueKt.getNoInspectorInfo()
        L16:
            r7.<init>(r0)
            r7.f40454c = r8
            r7.f40455d = r9
            r7.f40456e = r10
            r7.f40457f = r11
            r7.f40458g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.ContentPainterModifier.<init>(androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter):void");
    }

    public static /* synthetic */ ContentPainterModifier copy$default(ContentPainterModifier contentPainterModifier, Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            painter = contentPainterModifier.f40454c;
        }
        if ((i & 2) != 0) {
            alignment = contentPainterModifier.f40455d;
        }
        Alignment alignment2 = alignment;
        if ((i & 4) != 0) {
            contentScale = contentPainterModifier.f40456e;
        }
        ContentScale contentScale2 = contentScale;
        if ((i & 8) != 0) {
            f = contentPainterModifier.f40457f;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            colorFilter = contentPainterModifier.f40458g;
        }
        return contentPainterModifier.copy(painter, alignment2, contentScale2, f2, colorFilter);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    @NotNull
    public final ContentPainterModifier copy(@NotNull Painter painter, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f, @Nullable ColorFilter colorFilter) {
        return new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter);
    }

    /* renamed from: d */
    public final long m51121d(long j) {
        if (Size.m71573isEmptyimpl(j)) {
            return Size.Companion.m71580getZeroNHjbRc();
        }
        long mo72236getIntrinsicSizeNHjbRc = this.f40454c.mo72236getIntrinsicSizeNHjbRc();
        if (mo72236getIntrinsicSizeNHjbRc == Size.Companion.m71579getUnspecifiedNHjbRc()) {
            return j;
        }
        float m71571getWidthimpl = Size.m71571getWidthimpl(mo72236getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(m71571getWidthimpl) || Float.isNaN(m71571getWidthimpl)) {
            m71571getWidthimpl = Size.m71571getWidthimpl(j);
        }
        float m71568getHeightimpl = Size.m71568getHeightimpl(mo72236getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(m71568getHeightimpl) || Float.isNaN(m71568getHeightimpl)) {
            m71568getHeightimpl = Size.m71568getHeightimpl(j);
        }
        long Size = SizeKt.Size(m71571getWidthimpl, m71568getHeightimpl);
        return ScaleFactorKt.m72884timesUQTWf7w(Size, this.f40456e.mo72806computeScaleFactorH7hwNQA(Size, j));
    }

    @Override // androidx.compose.p003ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long m51121d = m51121d(contentDrawScope.mo72144getSizeNHjbRc());
        long mo71407alignKFBX0sM = this.f40455d.mo71407alignKFBX0sM(UtilsKt.m73979toIntSizeuvyYCjk(m51121d), UtilsKt.m73979toIntSizeuvyYCjk(contentDrawScope.mo72144getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float m73768component1impl = IntOffset.m73768component1impl(mo71407alignKFBX0sM);
        float m73769component2impl = IntOffset.m73769component2impl(mo71407alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m73768component1impl, m73769component2impl);
        this.f40454c.m72242drawx_KDEd0(contentDrawScope, m51121d, this.f40457f, this.f40458g);
        contentDrawScope.getDrawContext().getTransform().translate(-m73768component1impl, -m73769component2impl);
        contentDrawScope.drawContent();
    }

    /* renamed from: e */
    public final long m51120e(long j) {
        boolean z;
        float m73628getMinWidthimpl;
        int m73627getMinHeightimpl;
        float m73977constrainHeightK40F9xA;
        boolean m73624getHasFixedWidthimpl = Constraints.m73624getHasFixedWidthimpl(j);
        boolean m73623getHasFixedHeightimpl = Constraints.m73623getHasFixedHeightimpl(j);
        if (m73624getHasFixedWidthimpl && m73623getHasFixedHeightimpl) {
            return j;
        }
        if (Constraints.m73622getHasBoundedWidthimpl(j) && Constraints.m73621getHasBoundedHeightimpl(j)) {
            z = true;
        } else {
            z = false;
        }
        long mo72236getIntrinsicSizeNHjbRc = this.f40454c.mo72236getIntrinsicSizeNHjbRc();
        if (mo72236getIntrinsicSizeNHjbRc == Size.Companion.m71579getUnspecifiedNHjbRc()) {
            if (z) {
                return Constraints.m73618copyZbe2FdA$default(j, Constraints.m73626getMaxWidthimpl(j), 0, Constraints.m73625getMaxHeightimpl(j), 0, 10, null);
            }
            return j;
        }
        if (z && (m73624getHasFixedWidthimpl || m73623getHasFixedHeightimpl)) {
            m73628getMinWidthimpl = Constraints.m73626getMaxWidthimpl(j);
            m73627getMinHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        } else {
            float m71571getWidthimpl = Size.m71571getWidthimpl(mo72236getIntrinsicSizeNHjbRc);
            float m71568getHeightimpl = Size.m71568getHeightimpl(mo72236getIntrinsicSizeNHjbRc);
            if (!Float.isInfinite(m71571getWidthimpl) && !Float.isNaN(m71571getWidthimpl)) {
                m73628getMinWidthimpl = UtilsKt.m73978constrainWidthK40F9xA(j, m71571getWidthimpl);
            } else {
                m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
            }
            if (!Float.isInfinite(m71568getHeightimpl) && !Float.isNaN(m71568getHeightimpl)) {
                m73977constrainHeightK40F9xA = UtilsKt.m73977constrainHeightK40F9xA(j, m71568getHeightimpl);
                long m51121d = m51121d(SizeKt.Size(m73628getMinWidthimpl, m73977constrainHeightK40F9xA));
                return Constraints.m73618copyZbe2FdA$default(j, ConstraintsKt.m73640constrainWidthK40F9xA(j, AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(m51121d))), 0, ConstraintsKt.m73639constrainHeightK40F9xA(j, AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(m51121d))), 0, 10, null);
            }
            m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
        }
        m73977constrainHeightK40F9xA = m73627getMinHeightimpl;
        long m51121d2 = m51121d(SizeKt.Size(m73628getMinWidthimpl, m73977constrainHeightK40F9xA));
        return Constraints.m73618copyZbe2FdA$default(j, ConstraintsKt.m73640constrainWidthK40F9xA(j, AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(m51121d2))), 0, ConstraintsKt.m73639constrainHeightK40F9xA(j, AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(m51121d2))), 0, 10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContentPainterModifier) {
            ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
            return Intrinsics.areEqual(this.f40454c, contentPainterModifier.f40454c) && Intrinsics.areEqual(this.f40455d, contentPainterModifier.f40455d) && Intrinsics.areEqual(this.f40456e, contentPainterModifier.f40456e) && Float.compare(this.f40457f, contentPainterModifier.f40457f) == 0 && Intrinsics.areEqual(this.f40458g, contentPainterModifier.f40458g);
        }
        return false;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f40454c.hashCode() * 31) + this.f40455d.hashCode()) * 31) + this.f40456e.hashCode()) * 31) + Float.floatToIntBits(this.f40457f)) * 31;
        ColorFilter colorFilter = this.f40458g;
        if (colorFilter == null) {
            hashCode = 0;
        } else {
            hashCode = colorFilter.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.f40454c.mo72236getIntrinsicSizeNHjbRc() != Size.Companion.m71579getUnspecifiedNHjbRc()) {
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m73626getMaxWidthimpl(m51120e(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(m51121d(SizeKt.Size(i, maxIntrinsicHeight)))), maxIntrinsicHeight);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.f40454c.mo72236getIntrinsicSizeNHjbRc() != Size.Companion.m71579getUnspecifiedNHjbRc()) {
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m73625getMaxHeightimpl(m51120e(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(m51121d(SizeKt.Size(maxIntrinsicWidth, i)))), maxIntrinsicWidth);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69160measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(m51120e(j));
        return MeasureScope.CC.m59532q(measureScope, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new ContentPainterModifier$measure$1(mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.f40454c.mo72236getIntrinsicSizeNHjbRc() != Size.Companion.m71579getUnspecifiedNHjbRc()) {
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m73626getMaxWidthimpl(m51120e(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(m51121d(SizeKt.Size(i, minIntrinsicHeight)))), minIntrinsicHeight);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.f40454c.mo72236getIntrinsicSizeNHjbRc() != Size.Companion.m71579getUnspecifiedNHjbRc()) {
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m73625getMaxHeightimpl(m51120e(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(m51121d(SizeKt.Size(minIntrinsicWidth, i)))), minIntrinsicWidth);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }

    @NotNull
    public String toString() {
        return "ContentPainterModifier(painter=" + this.f40454c + ", alignment=" + this.f40455d + ", contentScale=" + this.f40456e + ", alpha=" + this.f40457f + ", colorFilter=" + this.f40458g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
