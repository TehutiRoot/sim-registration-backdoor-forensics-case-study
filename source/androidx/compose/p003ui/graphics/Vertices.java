package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.Offset;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0010\u0017\n\u0002\b\u0005\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "Landroidx/compose/ui/graphics/VertexMode;", "vertexMode", "", "Landroidx/compose/ui/geometry/Offset;", "positions", "textureCoordinates", "Landroidx/compose/ui/graphics/Color;", "colors", "", "indices", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;)[I", "points", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/List;)[F", "I", "getVertexMode-c2xauaI", "()I", "[F", "getPositions", "()[F", OperatorName.CURVE_TO, "getTextureCoordinates", "d", "[I", "getColors", "()[I", "", "e", "[S", "getIndices", "()[S", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n101#2,2:76\n33#2,6:78\n103#2:84\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:76,2\n42#1:78,6\n42#1:84\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.Vertices */
/* loaded from: classes2.dex */
public final class Vertices {

    /* renamed from: a */
    public final int f29209a;

    /* renamed from: b */
    public final float[] f29210b;

    /* renamed from: c */
    public final float[] f29211c;

    /* renamed from: d */
    public final int[] f29212d;

    /* renamed from: e */
    public final short[] f29213e;

    public /* synthetic */ Vertices(int i, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, list4);
    }

    /* renamed from: a */
    public final int[] m59737a(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ColorKt.m71788toArgb8_81llA(((Color) list.get(i)).m71745unboximpl());
        }
        return iArr;
    }

    /* renamed from: b */
    public final float[] m59736b(List list) {
        float m71503getYimpl;
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long m71512unboximpl = ((Offset) list.get(i / 2)).m71512unboximpl();
            if (i % 2 == 0) {
                m71503getYimpl = Offset.m71502getXimpl(m71512unboximpl);
            } else {
                m71503getYimpl = Offset.m71503getYimpl(m71512unboximpl);
            }
            fArr[i] = m71503getYimpl;
        }
        return fArr;
    }

    @NotNull
    public final int[] getColors() {
        return this.f29212d;
    }

    @NotNull
    public final short[] getIndices() {
        return this.f29213e;
    }

    @NotNull
    public final float[] getPositions() {
        return this.f29210b;
    }

    @NotNull
    public final float[] getTextureCoordinates() {
        return this.f29211c;
    }

    /* renamed from: getVertexMode-c2xauaI  reason: not valid java name */
    public final int m72091getVertexModec2xauaI() {
        return this.f29209a;
    }

    public Vertices(int i, List positions, List textureCoordinates, List colors, List indices) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(textureCoordinates, "textureCoordinates");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(indices, "indices");
        this.f29209a = i;
        Vertices$outOfBounds$1 vertices$outOfBounds$1 = new Vertices$outOfBounds$1(positions);
        if (textureCoordinates.size() == positions.size()) {
            if (colors.size() == positions.size()) {
                int size = indices.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (vertices$outOfBounds$1.invoke((Vertices$outOfBounds$1) indices.get(i2)).booleanValue()) {
                        throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
                    }
                }
                this.f29210b = m59736b(positions);
                this.f29211c = m59736b(textureCoordinates);
                this.f29212d = m59737a(colors);
                int size2 = indices.size();
                short[] sArr = new short[size2];
                for (int i3 = 0; i3 < size2; i3++) {
                    sArr[i3] = (short) ((Number) indices.get(i3)).intValue();
                }
                this.f29213e = sArr;
                return;
            }
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
    }
}
