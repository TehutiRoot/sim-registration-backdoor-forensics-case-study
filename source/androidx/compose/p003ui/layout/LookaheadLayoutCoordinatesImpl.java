package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.node.LookaheadDelegate;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\tJ%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\u00020.8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020!028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010;\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001d\u0010=\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b&\u00100\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006>"}, m28850d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/geometry/Offset;", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "lookaheadOffset", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,148:1\n1#2:149\n179#3:150\n157#3:153\n179#3:155\n157#3:158\n86#4:151\n79#4:152\n86#4:154\n86#4:156\n79#4:157\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n*L\n97#1:150\n98#1:153\n103#1:155\n109#1:158\n97#1:151\n97#1:152\n102#1:154\n105#1:156\n102#1:157\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl */
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinatesImpl implements LookaheadLayoutCoordinates {

    /* renamed from: a */
    public final LookaheadDelegate f30127a;

    public LookaheadLayoutCoordinatesImpl(@NotNull LookaheadDelegate lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.f30127a = lookaheadDelegate;
    }

    /* renamed from: a */
    public final long m59551a() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.f30127a);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m71506minusMKHz9U(mo72817localPositionOfR5De75A(coordinates, companion.m71518getZeroF1C5BW0()), getCoordinator().mo72817localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m71518getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    public int get(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return this.f30127a.get(alignmentLine);
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.f30127a.getCoordinator();
    }

    @NotNull
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.f30127a;
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (isAttached()) {
            NodeCoordinator wrappedBy$ui_release = getCoordinator().getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null && (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) != null) {
                return lookaheadDelegate.getCoordinates();
            }
            return null;
        }
        throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (isAttached()) {
            NodeCoordinator wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
                return null;
            }
            return lookaheadDelegate.getCoordinates();
        }
        throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo72816getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.f30127a;
        return IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, z);
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo72817localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long j) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (sourceCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinatesImpl) sourceCoordinates).f30127a;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long m72928positionInBjo55l4$ui_release = lookaheadDelegate.m72928positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset = IntOffsetKt.IntOffset(AbstractC21140mr0.roundToInt(Offset.m71502getXimpl(j)), AbstractC21140mr0.roundToInt(Offset.m71503getYimpl(j)));
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m72928positionInBjo55l4$ui_release) + IntOffset.m73776getXimpl(IntOffset), IntOffset.m73777getYimpl(m72928positionInBjo55l4$ui_release) + IntOffset.m73777getYimpl(IntOffset));
                long m72928positionInBjo55l4$ui_release2 = this.f30127a.m72928positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset2) - IntOffset.m73776getXimpl(m72928positionInBjo55l4$ui_release2), IntOffset.m73777getYimpl(IntOffset2) - IntOffset.m73777getYimpl(m72928positionInBjo55l4$ui_release2));
                return OffsetKt.Offset(IntOffset.m73776getXimpl(IntOffset3), IntOffset.m73777getYimpl(IntOffset3));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            long m72928positionInBjo55l4$ui_release3 = lookaheadDelegate.m72928positionInBjo55l4$ui_release(rootLookaheadDelegate);
            long mo72925getPositionnOccac = rootLookaheadDelegate.mo72925getPositionnOccac();
            long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m72928positionInBjo55l4$ui_release3) + IntOffset.m73776getXimpl(mo72925getPositionnOccac), IntOffset.m73777getYimpl(m72928positionInBjo55l4$ui_release3) + IntOffset.m73777getYimpl(mo72925getPositionnOccac));
            long IntOffset5 = IntOffsetKt.IntOffset(AbstractC21140mr0.roundToInt(Offset.m71502getXimpl(j)), AbstractC21140mr0.roundToInt(Offset.m71503getYimpl(j)));
            long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset4) + IntOffset.m73776getXimpl(IntOffset5), IntOffset.m73777getYimpl(IntOffset4) + IntOffset.m73777getYimpl(IntOffset5));
            LookaheadDelegate lookaheadDelegate3 = this.f30127a;
            long m72928positionInBjo55l4$ui_release4 = lookaheadDelegate3.m72928positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
            long mo72925getPositionnOccac2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).mo72925getPositionnOccac();
            long IntOffset7 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m72928positionInBjo55l4$ui_release4) + IntOffset.m73776getXimpl(mo72925getPositionnOccac2), IntOffset.m73777getYimpl(m72928positionInBjo55l4$ui_release4) + IntOffset.m73777getYimpl(mo72925getPositionnOccac2));
            long IntOffset8 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset6) - IntOffset.m73776getXimpl(IntOffset7), IntOffset.m73777getYimpl(IntOffset6) - IntOffset.m73777getYimpl(IntOffset7));
            NodeCoordinator wrappedBy$ui_release = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.f30127a).getCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release);
            NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate.getCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release2);
            return wrappedBy$ui_release.mo72817localPositionOfR5De75A(wrappedBy$ui_release2, OffsetKt.Offset(IntOffset.m73776getXimpl(IntOffset8), IntOffset.m73777getYimpl(IntOffset8)));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.f30127a);
        return Offset.m71507plusMKHz9U(mo72817localPositionOfR5De75A(rootLookaheadDelegate2.getLookaheadLayoutCoordinates(), j), rootLookaheadDelegate2.getCoordinator().getCoordinates().mo72817localPositionOfR5De75A(sourceCoordinates, Offset.Companion.m71518getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo72818localToRootMKHz9U(long j) {
        return getCoordinator().mo72818localToRootMKHz9U(Offset.m71507plusMKHz9U(j, m59551a()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo72819localToWindowMKHz9U(long j) {
        return getCoordinator().mo72819localToWindowMKHz9U(Offset.m71507plusMKHz9U(j, m59551a()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo72820transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        getCoordinator().mo72820transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo72821windowToLocalMKHz9U(long j) {
        return Offset.m71507plusMKHz9U(getCoordinator().mo72821windowToLocalMKHz9U(j), m59551a());
    }
}
