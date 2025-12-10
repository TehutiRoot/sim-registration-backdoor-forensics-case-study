package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1 */
/* loaded from: classes2.dex */
public final class C3241x2ac34721 extends Lambda implements Function2<SheetValue, Float, Unit> {
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SheetState $state;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1$1", m28800f = "BottomSheetScaffold.kt", m28799i = {}, m28798l = {220}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1$1 */
    /* loaded from: classes2.dex */
    public static final class C32421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SheetState $state;
        final /* synthetic */ SheetValue $target;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32421(SheetState sheetState, SheetValue sheetValue, float f, Continuation<? super C32421> continuation) {
            super(2, continuation);
            this.$state = sheetState;
            this.$target = sheetValue;
            this.$velocity = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C32421(this.$state, this.$target, this.$velocity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SwipeableV2State<SheetValue> swipeableState$material3_release = this.$state.getSwipeableState$material3_release();
                SheetValue sheetValue = this.$target;
                float f = this.$velocity;
                this.label = 1;
                if (swipeableState$material3_release.animateTo(sheetValue, f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C32421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3241x2ac34721(CoroutineScope coroutineScope, SheetState sheetState) {
        super(2);
        this.$scope = coroutineScope;
        this.$state = sheetState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SheetValue sheetValue, Float f) {
        invoke(sheetValue, f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull SheetValue target, float f) {
        Intrinsics.checkNotNullParameter(target, "target");
        AbstractC1552Vc.m65753e(this.$scope, null, null, new C32421(this.$state, target, f, null), 3, null);
    }
}
