package androidx.compose.p003ui.semantics;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rRS\u0010\u001e\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR>\u0010&\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR;\u0010*\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0'0\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\rR/\u0010.\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR/\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010\rR)\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\rR)\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\rR)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\rR)\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010\rR)\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u000b\u001a\u0004\b?\u0010\rR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010\rR)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\bE\u0010\rR)\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u000b\u001a\u0004\bH\u0010\rR#\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0J0\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u000b\u001a\u0004\bM\u0010\rR)\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u000b\u001a\u0004\bP\u0010\rR)\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u000b\u001a\u0004\bS\u0010\rR)\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\bV\u0010\rR)\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u000b\u001a\u0004\bY\u0010\r¨\u0006["}, m28850d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getOnClick", "OnClick", OperatorName.CURVE_TO, "getOnLongClick", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "d", "getScrollBy", "ScrollBy", "", "e", "getScrollToIndex", "ScrollToIndex", "progress", OperatorName.FILL_NON_ZERO, "getSetProgress", "SetProgress", "Lkotlin/Function3;", OperatorName.NON_STROKING_GRAY, "getSetSelection", "SetSelection", "Landroidx/compose/ui/text/AnnotatedString;", OperatorName.CLOSE_PATH, "getSetText", "SetText", "i", "getInsertTextAtCursor", "InsertTextAtCursor", OperatorName.SET_LINE_JOINSTYLE, "getPerformImeAction", "PerformImeAction", OperatorName.NON_STROKING_CMYK, "getCopyText", "CopyText", OperatorName.LINE_TO, "getCutText", "CutText", OperatorName.MOVE_TO, "getPasteText", "PasteText", OperatorName.ENDPATH, "getExpand", "Expand", "o", "getCollapse", "Collapse", "p", "getDismiss", "Dismiss", OperatorName.SAVE, "getRequestFocus", "RequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", PDPageLabelRange.STYLE_ROMAN_LOWER, "getCustomActions", "CustomActions", OperatorName.CLOSE_AND_STROKE, "getPageUp", "PageUp", "t", "getPageLeft", "PageLeft", "u", "getPageDown", "PageDown", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getPageRight", "PageRight", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1291:1\n462#2,3:1292\n462#2,3:1295\n462#2,3:1298\n462#2,3:1301\n462#2,3:1304\n462#2,3:1307\n462#2,3:1310\n462#2,3:1313\n462#2,3:1316\n462#2,3:1319\n462#2,3:1322\n462#2,3:1325\n462#2,3:1328\n462#2,3:1331\n462#2,3:1334\n462#2,3:1337\n462#2,3:1340\n462#2,3:1343\n462#2,3:1346\n462#2,3:1349\n462#2,3:1352\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n258#1:1292,3\n263#1:1295,3\n268#1:1298,3\n273#1:1301,3\n278#1:1304,3\n283#1:1307,3\n288#1:1310,3\n293#1:1313,3\n298#1:1316,3\n303#1:1319,3\n308#1:1322,3\n313#1:1325,3\n318#1:1328,3\n323#1:1331,3\n328#1:1334,3\n333#1:1337,3\n338#1:1340,3\n349#1:1343,3\n354#1:1346,3\n359#1:1349,3\n364#1:1352,3\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsActions */
/* loaded from: classes2.dex */
public final class SemanticsActions {
    public static final int $stable = 0;
    @NotNull
    public static final SemanticsActions INSTANCE = new SemanticsActions();

    /* renamed from: a */
    public static final SemanticsPropertyKey f30887a;

    /* renamed from: b */
    public static final SemanticsPropertyKey f30888b;

    /* renamed from: c */
    public static final SemanticsPropertyKey f30889c;

    /* renamed from: d */
    public static final SemanticsPropertyKey f30890d;

    /* renamed from: e */
    public static final SemanticsPropertyKey f30891e;

    /* renamed from: f */
    public static final SemanticsPropertyKey f30892f;

    /* renamed from: g */
    public static final SemanticsPropertyKey f30893g;

    /* renamed from: h */
    public static final SemanticsPropertyKey f30894h;

    /* renamed from: i */
    public static final SemanticsPropertyKey f30895i;

    /* renamed from: j */
    public static final SemanticsPropertyKey f30896j;

    /* renamed from: k */
    public static final SemanticsPropertyKey f30897k;

    /* renamed from: l */
    public static final SemanticsPropertyKey f30898l;

    /* renamed from: m */
    public static final SemanticsPropertyKey f30899m;

    /* renamed from: n */
    public static final SemanticsPropertyKey f30900n;

    /* renamed from: o */
    public static final SemanticsPropertyKey f30901o;

    /* renamed from: p */
    public static final SemanticsPropertyKey f30902p;

    /* renamed from: q */
    public static final SemanticsPropertyKey f30903q;

    /* renamed from: r */
    public static final SemanticsPropertyKey f30904r;

    /* renamed from: s */
    public static final SemanticsPropertyKey f30905s;

    /* renamed from: t */
    public static final SemanticsPropertyKey f30906t;

    /* renamed from: u */
    public static final SemanticsPropertyKey f30907u;

    /* renamed from: v */
    public static final SemanticsPropertyKey f30908v;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE;
        f30887a = new SemanticsPropertyKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        f30888b = new SemanticsPropertyKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f30889c = new SemanticsPropertyKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f30890d = new SemanticsPropertyKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        f30891e = new SemanticsPropertyKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        f30892f = new SemanticsPropertyKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        f30893g = new SemanticsPropertyKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        f30894h = new SemanticsPropertyKey("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        f30895i = new SemanticsPropertyKey("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        f30896j = new SemanticsPropertyKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        f30897k = new SemanticsPropertyKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        f30898l = new SemanticsPropertyKey("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        f30899m = new SemanticsPropertyKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        f30900n = new SemanticsPropertyKey("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        f30901o = new SemanticsPropertyKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        f30902p = new SemanticsPropertyKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        f30903q = new SemanticsPropertyKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        f30904r = new SemanticsPropertyKey("CustomActions", null, 2, null);
        f30905s = new SemanticsPropertyKey("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        f30906t = new SemanticsPropertyKey("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        f30907u = new SemanticsPropertyKey("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        f30908v = new SemanticsPropertyKey("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCollapse() {
        return f30901o;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCopyText() {
        return f30897k;
    }

    @NotNull
    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return f30904r;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCutText() {
        return f30898l;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getDismiss() {
        return f30902p;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getExpand() {
        return f30900n;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return f30887a;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return f30895i;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnClick() {
        return f30888b;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnLongClick() {
        return f30889c;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageDown() {
        return f30907u;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageLeft() {
        return f30906t;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageRight() {
        return f30908v;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageUp() {
        return f30905s;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPasteText() {
        return f30899m;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPerformImeAction() {
        return f30896j;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getRequestFocus() {
        return f30903q;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> getScrollBy() {
        return f30890d;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> getScrollToIndex() {
        return f30891e;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> getSetProgress() {
        return f30892f;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return f30893g;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetText() {
        return f30894h;
    }
}
