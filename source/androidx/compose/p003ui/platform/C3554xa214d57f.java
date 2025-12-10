package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n¢\u0006\u0002\b\u0007"}, m28850d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$1 */
/* loaded from: classes2.dex */
public final class C3554xa214d57f extends Lambda implements Function1<Pair<? extends Rect, ? extends List<SemanticsNode>>, Comparable<?>> {
    public static final C3554xa214d57f INSTANCE = new C3554xa214d57f();

    public C3554xa214d57f() {
        super(1);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Comparable<?> invoke2(@NotNull Pair<Rect, ? extends List<SemanticsNode>> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.valueOf(it.getFirst().getTop());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Comparable<?> invoke(Pair<? extends Rect, ? extends List<SemanticsNode>> pair) {
        return invoke2((Pair<Rect, ? extends List<SemanticsNode>>) pair);
    }
}
