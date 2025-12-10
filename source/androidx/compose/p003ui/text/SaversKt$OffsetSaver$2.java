package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "", "invoke-x-9fifI"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n394#1:422\n394#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$2 */
/* loaded from: classes2.dex */
public final class SaversKt$OffsetSaver$2 extends Lambda implements Function1<Object, Offset> {
    public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();

    public SaversKt$OffsetSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: invoke-x-9fifI  reason: not valid java name */
    public final Offset invoke(@NotNull Object it) {
        Float f;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, Boolean.FALSE)) {
            return Offset.m71491boximpl(Offset.Companion.m71517getUnspecifiedF1C5BW0());
        }
        List list = (List) it;
        Object obj = list.get(0);
        Float f2 = null;
        if (obj != null) {
            f = (Float) obj;
        } else {
            f = null;
        }
        Intrinsics.checkNotNull(f);
        float floatValue = f.floatValue();
        Object obj2 = list.get(1);
        if (obj2 != null) {
            f2 = (Float) obj2;
        }
        Intrinsics.checkNotNull(f2);
        return Offset.m71491boximpl(OffsetKt.Offset(floatValue, f2.floatValue()));
    }
}
