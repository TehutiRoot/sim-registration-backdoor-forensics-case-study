package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.autofill.Autofill;
import androidx.compose.p003ui.autofill.AutofillTree;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.input.InputModeManager;
import androidx.compose.p003ui.input.pointer.PointerIconService;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.p003ui.text.ExperimentalTextApi;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.input.PlatformTextInputPluginRegistry;
import androidx.compose.p003ui.text.input.TextInputService;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"(\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0013\"&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u0013\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0006¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010\u0013\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010\u0013\"&\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0011\u0012\u0004\b/\u0010\u0019\u001a\u0004\b.\u0010\u0013\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002010\u000f8\u0006¢\u0006\f\n\u0004\b2\u0010\u0011\u001a\u0004\b3\u0010\u0013\"\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002050\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010\u0011\u001a\u0004\b7\u0010\u0013\"\u001d\u0010<\u001a\b\u0012\u0004\u0012\u0002090\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013\"\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020=0\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010\u0011\u001a\u0004\b?\u0010\u0013\"\u001f\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010\u0011\u001a\u0004\bC\u0010\u0013\"&\u0010I\u001a\b\u0012\u0004\u0012\u00020E0\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010\u0011\u0012\u0004\bH\u0010\u0019\u001a\u0004\bG\u0010\u0013\"\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020J0\u000f8\u0006¢\u0006\f\n\u0004\bK\u0010\u0011\u001a\u0004\bL\u0010\u0013\"\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\bN\u0010\u0011\u001a\u0004\bO\u0010\u0013\"\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0\u000f8\u0006¢\u0006\f\n\u0004\bR\u0010\u0011\u001a\u0004\bS\u0010\u0013\"\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020U0\u000f8\u0006¢\u0006\f\n\u0004\bV\u0010\u0011\u001a\u0004\bW\u0010\u0013\"\"\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010\u0011\u001a\u0004\b[\u0010\u0013¨\u0006]"}, m28850d2 = {"Landroidx/compose/ui/node/Owner;", Constant.REGISTER_LEVEL_OWNER, "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideCommonCompositionLocals", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "name", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAccessibilityManager", "Landroidx/compose/ui/autofill/Autofill;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Landroidx/compose/ui/autofill/AutofillTree;", OperatorName.CURVE_TO, "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/ClipboardManager;", "d", "getLocalClipboardManager", "LocalClipboardManager", "Landroidx/compose/ui/unit/Density;", "e", "getLocalDensity", "LocalDensity", "Landroidx/compose/ui/focus/FocusManager;", OperatorName.FILL_NON_ZERO, "getLocalFocusManager", "LocalFocusManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", OperatorName.NON_STROKING_GRAY, "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", OperatorName.CLOSE_PATH, "getLocalFontFamilyResolver", "LocalFontFamilyResolver", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "i", "getLocalHapticFeedback", "LocalHapticFeedback", "Landroidx/compose/ui/input/InputModeManager;", OperatorName.SET_LINE_JOINSTYLE, "getLocalInputModeManager", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", OperatorName.NON_STROKING_CMYK, "getLocalLayoutDirection", "LocalLayoutDirection", "Landroidx/compose/ui/text/input/TextInputService;", OperatorName.LINE_TO, "getLocalTextInputService", "LocalTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", OperatorName.MOVE_TO, "getLocalPlatformTextInputPluginRegistry", "getLocalPlatformTextInputPluginRegistry$annotations", "LocalPlatformTextInputPluginRegistry", "Landroidx/compose/ui/platform/TextToolbar;", OperatorName.ENDPATH, "getLocalTextToolbar", "LocalTextToolbar", "o", "getLocalUriHandler", "LocalUriHandler", "Landroidx/compose/ui/platform/ViewConfiguration;", "p", "getLocalViewConfiguration", "LocalViewConfiguration", "Landroidx/compose/ui/platform/WindowInfo;", OperatorName.SAVE, "getLocalWindowInfo", "LocalWindowInfo", "Landroidx/compose/ui/input/pointer/PointerIconService;", PDPageLabelRange.STYLE_ROMAN_LOWER, "getLocalPointerIconService", "LocalPointerIconService", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt */
/* loaded from: classes2.dex */
public final class CompositionLocalsKt {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f30637a = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);

    /* renamed from: b */
    public static final ProvidableCompositionLocal f30638b = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofill$1.INSTANCE);

    /* renamed from: c */
    public static final ProvidableCompositionLocal f30639c = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);

    /* renamed from: d */
    public static final ProvidableCompositionLocal f30640d = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);

    /* renamed from: e */
    public static final ProvidableCompositionLocal f30641e = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalDensity$1.INSTANCE);

    /* renamed from: f */
    public static final ProvidableCompositionLocal f30642f = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);

    /* renamed from: g */
    public static final ProvidableCompositionLocal f30643g = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);

    /* renamed from: h */
    public static final ProvidableCompositionLocal f30644h = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);

    /* renamed from: i */
    public static final ProvidableCompositionLocal f30645i = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);

    /* renamed from: j */
    public static final ProvidableCompositionLocal f30646j = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);

    /* renamed from: k */
    public static final ProvidableCompositionLocal f30647k = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);

    /* renamed from: l */
    public static final ProvidableCompositionLocal f30648l = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);

    /* renamed from: m */
    public static final ProvidableCompositionLocal f30649m = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1.INSTANCE);

    /* renamed from: n */
    public static final ProvidableCompositionLocal f30650n = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);

    /* renamed from: o */
    public static final ProvidableCompositionLocal f30651o = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);

    /* renamed from: p */
    public static final ProvidableCompositionLocal f30652p = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);

    /* renamed from: q */
    public static final ProvidableCompositionLocal f30653q = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);

    /* renamed from: r */
    public static final ProvidableCompositionLocal f30654r = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);

    @Composable
    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideCommonCompositionLocals(@NotNull Owner owner, @NotNull UriHandler uriHandler, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uriHandler, "uriHandler");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(874662829);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(owner)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(uriHandler)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(content)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function2 = content;
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(874662829, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:189)");
            }
            ProvidedValue[] providedValueArr = {f30637a.provides(owner.getAccessibilityManager()), f30638b.provides(owner.getAutofill()), f30639c.provides(owner.getAutofillTree()), f30640d.provides(owner.getClipboardManager()), f30641e.provides(owner.getDensity()), f30642f.provides(owner.getFocusOwner()), f30643g.providesDefault(owner.getFontLoader()), f30644h.providesDefault(owner.getFontFamilyResolver()), f30645i.provides(owner.getHapticFeedBack()), f30646j.provides(owner.getInputModeManager()), f30647k.provides(owner.getLayoutDirection()), f30648l.provides(owner.getTextInputService()), f30649m.provides(owner.getPlatformTextInputPluginRegistry()), f30650n.provides(owner.getTextToolbar()), f30651o.provides(uriHandler), f30652p.provides(owner.getViewConfiguration()), f30653q.provides(owner.getWindowInfo()), f30654r.provides(owner.getPointerIconService())};
            function2 = content;
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(providedValueArr, function2, composer2, ((i2 >> 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner, uriHandler, function2, i));
        }
    }

    /* renamed from: a */
    public static final Void m59233a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return f30637a;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return f30638b;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return f30639c;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return f30640d;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return f30641e;
    }

    @NotNull
    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return f30642f;
    }

    @NotNull
    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return f30644h;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return f30643g;
    }

    @Deprecated(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @ReplaceWith(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return f30645i;
    }

    @NotNull
    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return f30646j;
    }

    @NotNull
    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return f30647k;
    }

    @ExperimentalTextApi
    @NotNull
    public static final ProvidableCompositionLocal<PlatformTextInputPluginRegistry> getLocalPlatformTextInputPluginRegistry() {
        return f30649m;
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getLocalPlatformTextInputPluginRegistry$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return f30654r;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return f30648l;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return f30650n;
    }

    @NotNull
    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return f30651o;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return f30652p;
    }

    @NotNull
    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return f30653q;
    }
}
