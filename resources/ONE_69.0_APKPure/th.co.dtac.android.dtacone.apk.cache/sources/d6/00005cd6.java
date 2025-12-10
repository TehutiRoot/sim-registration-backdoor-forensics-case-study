package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "data", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ComposerImpl$deactivateToEndGroup$3 extends Lambda implements Function2<Integer, Object, Unit> {
    final /* synthetic */ int $group;
    final /* synthetic */ ComposerImpl this$0;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4563:1\n4548#2,5:4564\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$1\n*L\n2790#1:4564,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$3$1 */
    /* loaded from: classes2.dex */
    public static final class C34201 extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {
        final /* synthetic */ Object $data;
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34201(Object obj, int i) {
            super(3);
            this.$data = obj;
            this.$index = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            if (Intrinsics.areEqual(this.$data, slots.slot(slots.getCurrentGroup(), this.$index))) {
                rememberManager.forgetting((RememberObserver) this.$data);
                slots.set(this.$index, Composer.Companion.getEmpty());
                return;
            }
            ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "<anonymous parameter 2>", "Landroidx/compose/runtime/RememberManager;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4563:1\n4548#2,5:4564\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$2\n*L\n2801#1:4564,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$3$2 */
    /* loaded from: classes2.dex */
    public static final class C34212 extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {
        final /* synthetic */ Object $data;
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34212(Object obj, int i) {
            super(3);
            this.$data = obj;
            this.$index = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
            if (Intrinsics.areEqual(this.$data, slots.slot(slots.getCurrentGroup(), this.$index))) {
                slots.set(this.$index, Composer.Companion.getEmpty());
            } else {
                ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$deactivateToEndGroup$3(ComposerImpl composerImpl, int i) {
        super(2);
        this.this$0 = composerImpl;
        this.$group = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Object obj) {
        invoke(num.intValue(), obj);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, @Nullable Object obj) {
        if (obj instanceof RememberObserver) {
            this.this$0.f28296H.reposition(this.$group);
            ComposerImpl.m60319Z(this.this$0, false, new C34201(obj, i), 1, null);
        } else if (obj instanceof RecomposeScopeImpl) {
            ((RecomposeScopeImpl) obj).release();
            this.this$0.f28296H.reposition(this.$group);
            ComposerImpl.m60319Z(this.this$0, false, new C34212(obj, i), 1, null);
        }
    }
}