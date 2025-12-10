package androidx.compose.runtime.saveable;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "T", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements Function0<Object> {
    final /* synthetic */ SaveableStateRegistry $registry;
    final /* synthetic */ State<Saver<T, Object>> $saverState;
    final /* synthetic */ State<T> $valueState;

    /* renamed from: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$a */
    /* loaded from: classes2.dex */
    public static final class C3465a implements SaverScope {

        /* renamed from: a */
        public final /* synthetic */ SaveableStateRegistry f28682a;

        public C3465a(SaveableStateRegistry saveableStateRegistry) {
            this.f28682a = saveableStateRegistry;
        }

        @Override // androidx.compose.runtime.saveable.SaverScope
        public final boolean canBeSaved(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f28682a.canBeSaved(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(State<? extends Saver<T, Object>> state, State<? extends T> state2, SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.$saverState = state;
        this.$valueState = state2;
        this.$registry = saveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        return ((Saver) this.$saverState.getValue()).save(new C3465a(this.$registry), this.$valueState.getValue());
    }
}
