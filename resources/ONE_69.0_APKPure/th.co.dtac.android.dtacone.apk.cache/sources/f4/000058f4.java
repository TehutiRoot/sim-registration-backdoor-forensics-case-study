package androidx.compose.material3;

import android.view.View;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.node.Ref;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1058:1\n50#2:1059\n49#2:1060\n1114#3,6:1061\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n*L\n132#1:1059\n132#1:1060\n132#1:1061,6\n*E\n"})
/* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2 */
/* loaded from: classes2.dex */
public final class C3276x44cc52d6 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1 */
    /* loaded from: classes2.dex */
    public static final class C32771 extends Lambda implements Function1<LayoutCoordinates, Unit> {
        final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
        final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
        final /* synthetic */ int $verticalMarginInPx;
        final /* synthetic */ View $view;
        final /* synthetic */ MutableState<Integer> $width$delegate;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1$1 */
        /* loaded from: classes2.dex */
        public static final class C32781 extends Lambda implements Function1<Integer, Unit> {
            final /* synthetic */ MutableState<Integer> $menuHeight$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32781(MutableState<Integer> mutableState) {
                super(1);
                this.$menuHeight$delegate = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                ExposedDropdownMenuKt.m60594d(this.$menuHeight$delegate, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32771(Ref<LayoutCoordinates> ref, View view, int i, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
            super(1);
            this.$coordinates = ref;
            this.$view = view;
            this.$verticalMarginInPx = i;
            this.$width$delegate = mutableState;
            this.$menuHeight$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            invoke2(layoutCoordinates);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ExposedDropdownMenuKt.m60596b(this.$width$delegate, IntSize.m74002getWidthimpl(it.mo73000getSizeYbymL2g()));
            this.$coordinates.setValue(it);
            View rootView = this.$view.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
            ExposedDropdownMenuKt.m60592f(rootView, this.$coordinates.getValue(), this.$verticalMarginInPx, new C32781(this.$menuHeight$delegate));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3276x44cc52d6(boolean z, Function1<? super Boolean, Unit> function1, int i, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i2, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(3);
        this.$expanded = z;
        this.$onExpandedChange = function1;
        this.$$dirty = i;
        this.$focusRequester = focusRequester;
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i2;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Modifier m60593e;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1714866713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1714866713, i, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)");
        }
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(composed, new C32771(this.$coordinates, this.$view, this.$verticalMarginInPx, this.$width$delegate, this.$menuHeight$delegate));
        boolean z = this.$expanded;
        Function1<Boolean, Unit> function1 = this.$onExpandedChange;
        Boolean valueOf = Boolean.valueOf(z);
        Function1<Boolean, Unit> function12 = this.$onExpandedChange;
        boolean z2 = this.$expanded;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(function1) | composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3279x8e2c1571(function12, z2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        m60593e = ExposedDropdownMenuKt.m60593e(onGloballyPositioned, z, (Function0) rememberedValue, null, null, null, composer, (this.$$dirty << 3) & 112, 28);
        Modifier focusRequester = FocusRequesterModifierKt.focusRequester(m60593e, this.$focusRequester);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return focusRequester;
    }
}