package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.IdCardDataItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$1", m29092f = "InputIdCardScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$1 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdForms$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<IdCardDataItem> $displayIdCardTypeList;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ List<FocusRequester> $focusRequesterList;
    final /* synthetic */ Function1<String, Unit> $onIdTypeChange;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ MutableState<Integer> $targetTypeIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdForms$1(FocusManager focusManager, Function1<? super String, Unit> function1, List<IdCardDataItem> list, PagerState pagerState, List<FocusRequester> list2, MutableState<Integer> mutableState, Continuation<? super InputIdCardScreenKt$InputIdForms$1> continuation) {
        super(2, continuation);
        this.$focusManager = focusManager;
        this.$onIdTypeChange = function1;
        this.$displayIdCardTypeList = list;
        this.$pagerState = pagerState;
        this.$focusRequesterList = list2;
        this.$targetTypeIndex$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InputIdCardScreenKt$InputIdForms$1(this.$focusManager, this.$onIdTypeChange, this.$displayIdCardTypeList, this.$pagerState, this.$focusRequesterList, this.$targetTypeIndex$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int m9534b;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            F30.m68540a(this.$focusManager, false, 1, null);
            this.$onIdTypeChange.invoke(this.$displayIdCardTypeList.get(this.$pagerState.getCurrentPage()).getIdCardType());
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(-1), Boxing.boxInt(this.$pagerState.getCurrentPage())});
            m9534b = InputIdCardScreenKt.m9534b(this.$targetTypeIndex$delegate);
            if (listOf.contains(Boxing.boxInt(m9534b))) {
                InputIdCardScreenKt.m9533c(this.$targetTypeIndex$delegate, -1);
                this.$focusRequesterList.get(this.$pagerState.getCurrentPage()).requestFocus();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InputIdCardScreenKt$InputIdForms$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}