package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012 \u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e0\f0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R<\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e0\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m28850d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "Landroidx/compose/runtime/MovableContent;", "content", "parameter", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/Anchor;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidations", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "locals", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MovableContent;", "getContent$runtime_release", "()Landroidx/compose/runtime/MovableContent;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getParameter$runtime_release", "()Ljava/lang/Object;", OperatorName.CURVE_TO, "Landroidx/compose/runtime/ControlledComposition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/ControlledComposition;", "d", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "e", "Landroidx/compose/runtime/Anchor;", "getAnchor$runtime_release", "()Landroidx/compose/runtime/Anchor;", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getInvalidations$runtime_release", "()Ljava/util/List;", "setInvalidations$runtime_release", "(Ljava/util/List;)V", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getLocals$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;

    /* renamed from: a */
    public final MovableContent f28352a;

    /* renamed from: b */
    public final Object f28353b;

    /* renamed from: c */
    public final ControlledComposition f28354c;

    /* renamed from: d */
    public final SlotTable f28355d;

    /* renamed from: e */
    public final Anchor f28356e;

    /* renamed from: f */
    public List f28357f;

    /* renamed from: g */
    public final PersistentCompositionLocalMap f28358g;

    public MovableContentStateReference(@NotNull MovableContent<Object> content, @Nullable Object obj, @NotNull ControlledComposition composition, @NotNull SlotTable slotTable, @NotNull Anchor anchor, @NotNull List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations, @NotNull PersistentCompositionLocalMap locals) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(invalidations, "invalidations");
        Intrinsics.checkNotNullParameter(locals, "locals");
        this.f28352a = content;
        this.f28353b = obj;
        this.f28354c = composition;
        this.f28355d = slotTable;
        this.f28356e = anchor;
        this.f28357f = invalidations;
        this.f28358g = locals;
    }

    @NotNull
    public final Anchor getAnchor$runtime_release() {
        return this.f28356e;
    }

    @NotNull
    public final ControlledComposition getComposition$runtime_release() {
        return this.f28354c;
    }

    @NotNull
    public final MovableContent<Object> getContent$runtime_release() {
        return this.f28352a;
    }

    @NotNull
    public final List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> getInvalidations$runtime_release() {
        return this.f28357f;
    }

    @NotNull
    public final PersistentCompositionLocalMap getLocals$runtime_release() {
        return this.f28358g;
    }

    @Nullable
    public final Object getParameter$runtime_release() {
        return this.f28353b;
    }

    @NotNull
    public final SlotTable getSlotTable$runtime_release() {
        return this.f28355d;
    }

    public final void setInvalidations$runtime_release(@NotNull List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f28357f = list;
    }
}
