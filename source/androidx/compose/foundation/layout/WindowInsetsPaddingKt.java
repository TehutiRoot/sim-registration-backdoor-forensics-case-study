package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.ModifierLocalKt;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0006\u0010\t\u001a6\u0010\u000f\u001a\u00020\u0000*\u00020\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\r0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a6\u0010\u0011\u001a\u00020\u0000*\u00020\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\r0\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0010\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "windowInsetsPadding", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/ui/Modifier;", "consumeWindowInsets", "consumedWindowInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "block", "onConsumedWindowInsetsChanged", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "withConsumedWindowInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalConsumedWindowInsets", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalConsumedWindowInsets", "foundation-layout_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,305:1\n135#2:306\n135#2:307\n135#2:308\n135#2:309\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:306\n75#1:307\n102#1:308\n126#1:309\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {

    /* renamed from: a */
    public static final ProvidableModifierLocal f13320a = ModifierLocalKt.modifierLocalOf(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.INSTANCE);

    @Stable
    @NotNull
    public static final Modifier consumeWindowInsets(@NotNull Modifier modifier, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return modifier.then(new C21602pY1(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C2871x7feb0d2a(insets) : InspectableValueKt.getNoInspectorInfo()));
    }

    @ExperimentalLayoutApi
    @NotNull
    @Stable
    @Deprecated(message = "Use consumeWindowInsets", replaceWith = @ReplaceWith(expression = "this.consumeWindowInsets(insets)", imports = {}))
    public static final Modifier consumedWindowInsets(@NotNull Modifier modifier, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return consumeWindowInsets(modifier, insets);
    }

    @NotNull
    public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
        return f13320a;
    }

    @Stable
    @NotNull
    public static final Modifier onConsumedWindowInsetsChanged(@NotNull Modifier modifier, @NotNull Function1<? super WindowInsets, Unit> block) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C2873xe0c3dfaf(block);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new C13961sx(block, noInspectorInfo));
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsPadding(@NotNull Modifier modifier, @NotNull WindowInsets insets) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C2874x6f3b7473(insets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new InsetsPaddingModifier(insets, noInspectorInfo));
    }

    @ExperimentalLayoutApi
    @NotNull
    @Stable
    @Deprecated(message = "Use onConsumedWindowInsetsChanged", replaceWith = @ReplaceWith(expression = "onConsumedWindowInsetsChanged(block)", imports = {}))
    public static final Modifier withConsumedWindowInsets(@NotNull Modifier modifier, @NotNull Function1<? super WindowInsets, Unit> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return onConsumedWindowInsetsChanged(modifier, block);
    }

    @ExperimentalLayoutApi
    @NotNull
    @Stable
    @Deprecated(message = "Use consumeWindowInsets", replaceWith = @ReplaceWith(expression = "this.consumeWindowInsets(paddingValues)", imports = {}))
    public static final Modifier consumedWindowInsets(@NotNull Modifier modifier, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return consumeWindowInsets(modifier, paddingValues);
    }

    @Stable
    @ExperimentalLayoutApi
    @NotNull
    public static final Modifier consumeWindowInsets(@NotNull Modifier modifier, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new C23175yh1(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C2872x7feb0d2b(paddingValues) : InspectableValueKt.getNoInspectorInfo()));
    }
}
