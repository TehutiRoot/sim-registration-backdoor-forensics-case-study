package androidx.compose.p003ui.semantics;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.state.ToggleableState;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b \u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\b\u001a\u0004\b#\u0010\nR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b&\u0010\nR \u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b*\u0010\nR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\nR\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020,0\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b1\u0010\nR&\u00106\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\b\u0012\u0004\b5\u0010\u0003\u001a\u0004\b4\u0010\nR\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\b\u001a\u0004\b9\u0010\nR\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b=\u0010\nR\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b@\u0010\nR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\b\u001a\u0004\bC\u0010\nR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\b\u001a\u0004\bF\u0010\nR \u0010K\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bJ\u0010\nR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\bM\u0010\nR#\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00050\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\b\u001a\u0004\bQ\u0010\nR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020O0\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\bT\u0010\nR \u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bW\u0010\b\u001a\u0004\bX\u0010\nR \u0010]\u001a\b\u0012\u0004\u0012\u00020Z0\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b[\u0010\b\u001a\u0004\b\\\u0010\nR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020,0\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\b\u001a\u0004\b_\u0010\nR\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020a0\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\b\u001a\u0004\bc\u0010\nR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\be\u0010\b\u001a\u0004\bf\u0010\nR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\b\u001a\u0004\bi\u0010\nR)\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020l0k0\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\b\u001a\u0004\bn\u0010\nR \u0010r\u001a\b\u0012\u0004\u0012\u00020,0\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0003\u001a\u0004\bp\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006s"}, m28850d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getStateDescription", "StateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", OperatorName.CURVE_TO, "getProgressBarRangeInfo", "ProgressBarRangeInfo", "d", "getPaneTitle", "PaneTitle", "", "e", "getSelectableGroup", "SelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", OperatorName.FILL_NON_ZERO, "getCollectionInfo", "CollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", OperatorName.NON_STROKING_GRAY, "getCollectionItemInfo", "CollectionItemInfo", OperatorName.CLOSE_PATH, "getHeading", "Heading", "i", "getDisabled", "Disabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", OperatorName.SET_LINE_JOINSTYLE, "getLiveRegion", "LiveRegion", "", OperatorName.NON_STROKING_CMYK, "getFocused", "Focused", OperatorName.LINE_TO, "getIsTraversalGroup", "IsTraversalGroup", OperatorName.MOVE_TO, "getInvisibleToUser", "getInvisibleToUser$annotations", "InvisibleToUser", "", OperatorName.ENDPATH, "getTraversalIndex", "TraversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "o", "getHorizontalScrollAxisRange", "HorizontalScrollAxisRange", "p", "getVerticalScrollAxisRange", "VerticalScrollAxisRange", OperatorName.SAVE, "getIsPopup", "IsPopup", PDPageLabelRange.STYLE_ROMAN_LOWER, "getIsDialog", "IsDialog", "Landroidx/compose/ui/semantics/Role;", OperatorName.CLOSE_AND_STROKE, "getRole", "Role", "t", "getTestTag", "TestTag", "Landroidx/compose/ui/text/AnnotatedString;", "u", "getText", "Text", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getEditableText", "EditableText", "Landroidx/compose/ui/text/TextRange;", OperatorName.SET_LINE_WIDTH, "getTextSelectionRange", "TextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "x", "getImeAction", "ImeAction", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSelected", "Selected", "Landroidx/compose/ui/state/ToggleableState;", "z", "getToggleableState", "ToggleableState", "A", "getPassword", "Password", "B", "getError", "Error", "Lkotlin/Function1;", "", "C", "getIndexForKey", "IndexForKey", "getIsContainer", "getIsContainer$annotations", "IsContainer", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties */
/* loaded from: classes2.dex */
public final class SemanticsProperties {
    public static final int $stable = 0;
    @NotNull
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();

    /* renamed from: a */
    public static final SemanticsPropertyKey f30925a = new SemanticsPropertyKey("ContentDescription", SemanticsProperties$ContentDescription$1.INSTANCE);

    /* renamed from: b */
    public static final SemanticsPropertyKey f30926b = new SemanticsPropertyKey("StateDescription", null, 2, null);

    /* renamed from: c */
    public static final SemanticsPropertyKey f30927c = new SemanticsPropertyKey("ProgressBarRangeInfo", null, 2, null);

    /* renamed from: d */
    public static final SemanticsPropertyKey f30928d = new SemanticsPropertyKey("PaneTitle", SemanticsProperties$PaneTitle$1.INSTANCE);

    /* renamed from: e */
    public static final SemanticsPropertyKey f30929e = new SemanticsPropertyKey("SelectableGroup", null, 2, null);

    /* renamed from: f */
    public static final SemanticsPropertyKey f30930f = new SemanticsPropertyKey("CollectionInfo", null, 2, null);

    /* renamed from: g */
    public static final SemanticsPropertyKey f30931g = new SemanticsPropertyKey("CollectionItemInfo", null, 2, null);

    /* renamed from: h */
    public static final SemanticsPropertyKey f30932h = new SemanticsPropertyKey("Heading", null, 2, null);

    /* renamed from: i */
    public static final SemanticsPropertyKey f30933i = new SemanticsPropertyKey("Disabled", null, 2, null);

    /* renamed from: j */
    public static final SemanticsPropertyKey f30934j = new SemanticsPropertyKey("LiveRegion", null, 2, null);

    /* renamed from: k */
    public static final SemanticsPropertyKey f30935k = new SemanticsPropertyKey("Focused", null, 2, null);

    /* renamed from: l */
    public static final SemanticsPropertyKey f30936l = new SemanticsPropertyKey("IsTraversalGroup", null, 2, null);

    /* renamed from: m */
    public static final SemanticsPropertyKey f30937m = new SemanticsPropertyKey("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);

    /* renamed from: n */
    public static final SemanticsPropertyKey f30938n = new SemanticsPropertyKey("TraversalIndex", SemanticsProperties$TraversalIndex$1.INSTANCE);

    /* renamed from: o */
    public static final SemanticsPropertyKey f30939o = new SemanticsPropertyKey("HorizontalScrollAxisRange", null, 2, null);

    /* renamed from: p */
    public static final SemanticsPropertyKey f30940p = new SemanticsPropertyKey("VerticalScrollAxisRange", null, 2, null);

    /* renamed from: q */
    public static final SemanticsPropertyKey f30941q = new SemanticsPropertyKey("IsPopup", SemanticsProperties$IsPopup$1.INSTANCE);

    /* renamed from: r */
    public static final SemanticsPropertyKey f30942r = new SemanticsPropertyKey("IsDialog", SemanticsProperties$IsDialog$1.INSTANCE);

    /* renamed from: s */
    public static final SemanticsPropertyKey f30943s = new SemanticsPropertyKey("Role", SemanticsProperties$Role$1.INSTANCE);

    /* renamed from: t */
    public static final SemanticsPropertyKey f30944t = new SemanticsPropertyKey("TestTag", SemanticsProperties$TestTag$1.INSTANCE);

    /* renamed from: u */
    public static final SemanticsPropertyKey f30945u = new SemanticsPropertyKey("Text", SemanticsProperties$Text$1.INSTANCE);

    /* renamed from: v */
    public static final SemanticsPropertyKey f30946v = new SemanticsPropertyKey("EditableText", null, 2, null);

    /* renamed from: w */
    public static final SemanticsPropertyKey f30947w = new SemanticsPropertyKey("TextSelectionRange", null, 2, null);

    /* renamed from: x */
    public static final SemanticsPropertyKey f30948x = new SemanticsPropertyKey("ImeAction", null, 2, null);

    /* renamed from: y */
    public static final SemanticsPropertyKey f30949y = new SemanticsPropertyKey("Selected", null, 2, null);

    /* renamed from: z */
    public static final SemanticsPropertyKey f30950z = new SemanticsPropertyKey("ToggleableState", null, 2, null);

    /* renamed from: A */
    public static final SemanticsPropertyKey f30922A = new SemanticsPropertyKey("Password", null, 2, null);

    /* renamed from: B */
    public static final SemanticsPropertyKey f30923B = new SemanticsPropertyKey("Error", null, 2, null);

    /* renamed from: C */
    public static final SemanticsPropertyKey f30924C = new SemanticsPropertyKey("IndexForKey", null, 2, null);

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return f30930f;
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return f30931g;
    }

    @NotNull
    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return f30925a;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getDisabled() {
        return f30933i;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return f30946v;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getError() {
        return f30923B;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getFocused() {
        return f30935k;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getHeading() {
        return f30932h;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return f30939o;
    }

    @NotNull
    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return f30948x;
    }

    @NotNull
    public final SemanticsPropertyKey<Function1<Object, Integer>> getIndexForKey() {
        return f30924C;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getInvisibleToUser() {
        return f30937m;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return f30936l;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsDialog() {
        return f30942r;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsPopup() {
        return f30941q;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return f30936l;
    }

    @NotNull
    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return f30934j;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getPaneTitle() {
        return f30928d;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getPassword() {
        return f30922A;
    }

    @NotNull
    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return f30927c;
    }

    @NotNull
    public final SemanticsPropertyKey<Role> getRole() {
        return f30943s;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getSelectableGroup() {
        return f30929e;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getSelected() {
        return f30949y;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getStateDescription() {
        return f30926b;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getTestTag() {
        return f30944t;
    }

    @NotNull
    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return f30945u;
    }

    @NotNull
    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return f30947w;
    }

    @NotNull
    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return f30950z;
    }

    @NotNull
    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return f30938n;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return f30940p;
    }
}
