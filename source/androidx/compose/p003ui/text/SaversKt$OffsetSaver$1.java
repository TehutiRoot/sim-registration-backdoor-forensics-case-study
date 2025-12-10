package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$1 */
/* loaded from: classes2.dex */
public final class SaversKt$OffsetSaver$1 extends Lambda implements Function2<SaverScope, Offset, Object> {
    public static final SaversKt$OffsetSaver$1 INSTANCE = new SaversKt$OffsetSaver$1();

    public SaversKt$OffsetSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Offset offset) {
        return m73160invokeUv8p0NA(saverScope, offset.m71512unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
    public final Object m73160invokeUv8p0NA(@NotNull SaverScope Saver, long j) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        if (Offset.m71499equalsimpl0(j, Offset.Companion.m71517getUnspecifiedF1C5BW0())) {
            return Boolean.FALSE;
        }
        return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Float.valueOf(Offset.m71502getXimpl(j))), SaversKt.save(Float.valueOf(Offset.m71503getYimpl(j))));
    }
}
