package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m28850d2 = {"<anonymous>", "", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4563:1\n162#2,4:4564\n167#2,3:4574\n33#3,6:4568\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n*L\n3544#1:4564,4\n3544#1:4574,3\n3545#1:4568,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposerImpl$recordInsert$2 extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {
    final /* synthetic */ Anchor $anchor;
    final /* synthetic */ List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> $fixups;
    final /* synthetic */ SlotTable $insertTable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$2(SlotTable slotTable, Anchor anchor, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list) {
        super(3);
        this.$insertTable = slotTable;
        this.$anchor = anchor;
        this.$fixups = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        invoke2(applier, slotWriter, rememberManager);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        SlotTable slotTable = this.$insertTable;
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = this.$fixups;
        SlotWriter openWriter = slotTable.openWriter();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(applier, openWriter, rememberManager);
            }
            Unit unit = Unit.INSTANCE;
            openWriter.close();
            slots.beginInsert();
            SlotTable slotTable2 = this.$insertTable;
            slots.moveFrom(slotTable2, this.$anchor.toIndexFor(slotTable2), false);
            slots.endInsert();
        } catch (Throwable th2) {
            openWriter.close();
            throw th2;
        }
    }
}
