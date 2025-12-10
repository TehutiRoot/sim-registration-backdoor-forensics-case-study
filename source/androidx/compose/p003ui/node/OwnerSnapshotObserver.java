package androidx.compose.p003ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J%\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010 \u001a\u00020\u0004\"\b\b\u0000\u0010\u001b*\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020\u0004H\u0000¢\u0006\u0004\b'\u0010\"J\u000f\u0010*\u001a\u00020\u0004H\u0000¢\u0006\u0004\b)\u0010\"R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00100R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00100R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00100R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00100R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00100¨\u0006>"}, m28850d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;ZLkotlin/jvm/functions/Function0;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "observeSemanticsReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "observeSemanticsReads", "Landroidx/compose/ui/node/OwnerScope;", "T", TypedValues.AttributesType.S_TARGET, "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "clear$ui_release", "(Ljava/lang/Object;)V", "clear", "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLookaheadMeasure", OperatorName.CURVE_TO, "onCommitAffectingMeasure", "d", "onCommitAffectingSemantics", "e", "onCommitAffectingLayout", OperatorName.FILL_NON_ZERO, "onCommitAffectingLayoutModifier", OperatorName.NON_STROKING_GRAY, "onCommitAffectingLayoutModifierInLookahead", OperatorName.CLOSE_PATH, "onCommitAffectingLookaheadLayout", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver */
/* loaded from: classes2.dex */
public final class OwnerSnapshotObserver {

    /* renamed from: a */
    public final SnapshotStateObserver f30423a;

    /* renamed from: b */
    public final Function1 f30424b;

    /* renamed from: c */
    public final Function1 f30425c;

    /* renamed from: d */
    public final Function1 f30426d;

    /* renamed from: e */
    public final Function1 f30427e;

    /* renamed from: f */
    public final Function1 f30428f;

    /* renamed from: g */
    public final Function1 f30429g;

    /* renamed from: h */
    public final Function1 f30430h;

    public OwnerSnapshotObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f30423a = new SnapshotStateObserver(onChangedExecutor);
        this.f30424b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;
        this.f30425c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;
        this.f30426d = OwnerSnapshotObserver$onCommitAffectingSemantics$1.INSTANCE;
        this.f30427e = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
        this.f30428f = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;
        this.f30429g = C3525x82674389.INSTANCE;
        this.f30430h = OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1.INSTANCE;
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z, function0);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z, function0);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z, function0);
    }

    public final void clear$ui_release(@NotNull Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f30423a.clear(target);
    }

    public final void clearInvalidObservations$ui_release() {
        this.f30423a.clearIf(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@NotNull LayoutNode node, boolean z, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z && node.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(node, this.f30429g, block);
        } else {
            observeReads$ui_release(node, this.f30428f, block);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(@NotNull LayoutNode node, boolean z, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z && node.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(node, this.f30430h, block);
        } else {
            observeReads$ui_release(node, this.f30427e, block);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(@NotNull LayoutNode node, boolean z, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z && node.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(node, this.f30424b, block);
        } else {
            observeReads$ui_release(node, this.f30425c, block);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(@NotNull T target, @NotNull Function1<? super T, Unit> onChanged, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f30423a.observeReads(target, onChanged, block);
    }

    public final void observeSemanticsReads$ui_release(@NotNull LayoutNode node, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.f30426d, block);
    }

    public final void startObserving$ui_release() {
        this.f30423a.start();
    }

    public final void stopObserving$ui_release() {
        this.f30423a.stop();
        this.f30423a.clear();
    }
}
