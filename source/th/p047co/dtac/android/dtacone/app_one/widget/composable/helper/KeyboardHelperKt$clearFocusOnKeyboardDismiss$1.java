package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusEventModifierKt;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nKeyboardHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardHelper.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/KeyboardHelperKt$clearFocusOnKeyboardDismiss$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n25#2:68\n25#2:75\n50#2:83\n49#2:84\n1097#3,6:69\n1097#3,6:76\n1097#3,6:85\n76#4:82\n81#5:91\n107#5,2:92\n81#5:94\n107#5,2:95\n81#5:97\n*S KotlinDebug\n*F\n+ 1 KeyboardHelper.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/KeyboardHelperKt$clearFocusOnKeyboardDismiss$1\n*L\n43#1:68\n44#1:75\n58#1:83\n58#1:84\n43#1:69,6\n44#1:76,6\n58#1:85,6\n49#1:82\n43#1:91\n43#1:92,2\n44#1:94\n44#1:95,2\n47#1:97\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt$clearFocusOnKeyboardDismiss$1 */
/* loaded from: classes7.dex */
public final class KeyboardHelperKt$clearFocusOnKeyboardDismiss$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public static final KeyboardHelperKt$clearFocusOnKeyboardDismiss$1 INSTANCE = new KeyboardHelperKt$clearFocusOnKeyboardDismiss$1();

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt$clearFocusOnKeyboardDismiss$1$1", m28800f = "KeyboardHelper.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt$clearFocusOnKeyboardDismiss$1$1 */
    /* loaded from: classes7.dex */
    public static final class C141831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ State<Boolean> $isKeyboardOpen$delegate;
        final /* synthetic */ MutableState<Boolean> $keyboardAppearedSinceLastFocused$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141831(FocusManager focusManager, State<Boolean> state, MutableState<Boolean> mutableState, Continuation<? super C141831> continuation) {
            super(2, continuation);
            this.$focusManager = focusManager;
            this.$isKeyboardOpen$delegate = state;
            this.$keyboardAppearedSinceLastFocused$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C141831(this.$focusManager, this.$isKeyboardOpen$delegate, this.$keyboardAppearedSinceLastFocused$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.invoke$lambda$6(this.$isKeyboardOpen$delegate)) {
                    KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.invoke$lambda$5(this.$keyboardAppearedSinceLastFocused$delegate, true);
                } else if (KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.invoke$lambda$4(this.$keyboardAppearedSinceLastFocused$delegate)) {
                    B30.m69025a(this.$focusManager, false, 1, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C141831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public KeyboardHelperKt$clearFocusOnKeyboardDismiss$1() {
        super(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1157893448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1157893448, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.helper.clearFocusOnKeyboardDismiss.<anonymous> (KeyboardHelper.kt:40)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-563915881);
        if (invoke$lambda$1(mutableState)) {
            State<Boolean> rememberIsKeyboardOpen = KeyboardHelperKt.rememberIsKeyboardOpen(composer, 0);
            EffectsKt.LaunchedEffect(Boolean.valueOf(invoke$lambda$6(rememberIsKeyboardOpen)), new C141831((FocusManager) composer.consume(CompositionLocalsKt.getLocalFocusManager()), rememberIsKeyboardOpen, mutableState2, null), composer, 64);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(mutableState) | composer.changed(mutableState2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new KeyboardHelperKt$clearFocusOnKeyboardDismiss$1$2$1(mutableState, mutableState2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Modifier onFocusEvent = FocusEventModifierKt.onFocusEvent(composed, (Function1) rememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return onFocusEvent;
    }
}
