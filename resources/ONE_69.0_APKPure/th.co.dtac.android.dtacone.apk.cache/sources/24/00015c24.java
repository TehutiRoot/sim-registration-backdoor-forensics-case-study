package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$1$1", m29092f = "ConsentScreen.kt", m29091i = {}, m29090l = {93}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$1$1 */
/* loaded from: classes9.dex */
public final class ConsentScreenKt$ConsentSection$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isScrolledToEnd;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$1$1$1 */
    /* loaded from: classes9.dex */
    public static final class C167501 extends Lambda implements Function0<Integer> {
        final /* synthetic */ ScrollState $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167501(ScrollState scrollState) {
            super(0);
            this.$scrollState = scrollState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return Integer.valueOf(this.$scrollState.getValue());
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$1$1$a */
    /* loaded from: classes9.dex */
    public static final class C16751a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ MutableState f107220a;

        /* renamed from: b */
        public final /* synthetic */ ScrollState f107221b;

        public C16751a(MutableState mutableState, ScrollState scrollState) {
            this.f107220a = mutableState;
            this.f107221b = scrollState;
        }

        /* renamed from: a */
        public final Object m1782a(int i, Continuation continuation) {
            boolean z;
            if (!((Boolean) this.f107220a.getValue()).booleanValue()) {
                MutableState mutableState = this.f107220a;
                if (i >= this.f107221b.getMaxValue() - 5) {
                    z = true;
                } else {
                    z = false;
                }
                mutableState.setValue(Boxing.boxBoolean(z));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m1782a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreenKt$ConsentSection$1$1(ScrollState scrollState, MutableState<Boolean> mutableState, Continuation<? super ConsentScreenKt$ConsentSection$1$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$isScrolledToEnd = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ConsentScreenKt$ConsentSection$1$1(this.$scrollState, this.$isScrolledToEnd, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new C167501(this.$scrollState));
            C16751a c16751a = new C16751a(this.$isScrolledToEnd, this.$scrollState);
            this.label = 1;
            if (snapshotFlow.collect(c16751a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ConsentScreenKt$ConsentSection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}