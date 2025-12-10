package androidx.compose.runtime;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Landroidx/compose/runtime/CompositionLocalContext;", "", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocals", "<init>", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocals$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CompositionLocalContext {
    public static final int $stable = 0;

    /* renamed from: a */
    public final PersistentCompositionLocalMap f28307a;

    public CompositionLocalContext(@NotNull PersistentCompositionLocalMap compositionLocals) {
        Intrinsics.checkNotNullParameter(compositionLocals, "compositionLocals");
        this.f28307a = compositionLocals;
    }

    @NotNull
    public final PersistentCompositionLocalMap getCompositionLocals$runtime_release() {
        return this.f28307a;
    }
}
