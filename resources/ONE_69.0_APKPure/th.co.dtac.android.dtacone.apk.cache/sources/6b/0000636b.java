package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.text.input.TextInputService;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\n¨\u0006\u0011"}, m29142d2 = {"Landroidx/compose/ui/platform/LocalSoftwareKeyboardController;", "", "<init>", "()V", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)Landroidx/compose/runtime/ProvidedValue;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSoftwareKeyboardController", "getCurrent", "getCurrent$annotations", "current", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nLocalSoftwareKeyboardController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n76#2:77\n76#2:78\n36#3:79\n1097#4,6:80\n*S KotlinDebug\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n*L\n42#1:77\n47#1:78\n48#1:79\n48#1:80,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.LocalSoftwareKeyboardController */
/* loaded from: classes2.dex */
public final class LocalSoftwareKeyboardController {
    public static final int $stable = 0;
    @NotNull
    public static final LocalSoftwareKeyboardController INSTANCE = new LocalSoftwareKeyboardController();

    /* renamed from: a */
    public static final ProvidableCompositionLocal f30795a = CompositionLocalKt.compositionLocalOf$default(null, C3551x568c8b93.INSTANCE, 1, null);

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCurrent$annotations() {
    }

    /* renamed from: a */
    public final SoftwareKeyboardController m59168a(Composer composer, int i) {
        composer.startReplaceableGroup(1835581880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1835581880, i, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController (LocalSoftwareKeyboardController.kt:45)");
        }
        TextInputService textInputService = (TextInputService) composer.consume(CompositionLocalsKt.getLocalTextInputService());
        if (textInputService == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }
        int i2 = TextInputService.$stable;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(textInputService);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C1279SF(textInputService);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C1279SF c1279sf = (C1279SF) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c1279sf;
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final SoftwareKeyboardController getCurrent(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1059476185);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1059476185, i, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.<get-current> (LocalSoftwareKeyboardController.kt:40)");
        }
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(f30795a);
        if (softwareKeyboardController == null) {
            softwareKeyboardController = m59168a(composer, i & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return softwareKeyboardController;
    }

    @NotNull
    public final ProvidedValue<SoftwareKeyboardController> provides(@NotNull SoftwareKeyboardController softwareKeyboardController) {
        Intrinsics.checkNotNullParameter(softwareKeyboardController, "softwareKeyboardController");
        return f30795a.provides(softwareKeyboardController);
    }
}