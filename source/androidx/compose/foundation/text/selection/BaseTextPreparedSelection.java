package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000 q*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001qB4\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010!J@\u0010/\u001a\u00028\u0000\"\u0004\b\u0001\u0010)*\u00028\u00012\b\b\u0002\u0010*\u001a\u00020\u00142\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,0+¢\u0006\u0002\b-H\u0084\bø\u0001\u0001¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020,2\u0006\u0010$\u001a\u00020\u0017H\u0004¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020,2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0004¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00028\u0000¢\u0006\u0004\b7\u0010\u0010J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010\u0010J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0010J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0010J&\u0010<\u001a\u00028\u00002\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0+¢\u0006\u0002\b-¢\u0006\u0004\b<\u0010=J&\u0010>\u001a\u00028\u00002\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0+¢\u0006\u0002\b-¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00020\u0017¢\u0006\u0004\b?\u0010!J\r\u0010@\u001a\u00020\u0017¢\u0006\u0004\b@\u0010!J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010\u0010J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\r\u0010C\u001a\u00028\u0000¢\u0006\u0004\bC\u0010\u0010J\r\u0010D\u001a\u00028\u0000¢\u0006\u0004\bD\u0010\u0010J\u000f\u0010E\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bG\u0010FJ\r\u0010H\u001a\u00028\u0000¢\u0006\u0004\bH\u0010\u0010J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00028\u0000¢\u0006\u0004\bJ\u0010\u0010J\r\u0010K\u001a\u00028\u0000¢\u0006\u0004\bK\u0010\u0010J\u000f\u0010L\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bL\u0010FJ\r\u0010M\u001a\u00028\u0000¢\u0006\u0004\bM\u0010\u0010J\u000f\u0010N\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bN\u0010FJ\r\u0010O\u001a\u00028\u0000¢\u0006\u0004\bO\u0010\u0010J\r\u0010P\u001a\u00028\u0000¢\u0006\u0004\bP\u0010\u0010J\r\u0010Q\u001a\u00028\u0000¢\u0006\u0004\bQ\u0010\u0010J\r\u0010R\u001a\u00028\u0000¢\u0006\u0004\bR\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010S\u001a\u0004\bT\u0010UR \u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0003¢\u0006\f\n\u0004\b\u001d\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR+\u0010g\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0003¢\u0006\u0012\n\u0004\b\u0019\u0010V\u001a\u0004\bd\u0010X\"\u0004\be\u0010fR\"\u0010l\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010S\u001a\u0004\bi\u0010U\"\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "p", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", OperatorName.ENDPATH, "o", OperatorName.SAVE, "", OperatorName.LINE_TO, "()Z", "", "currentOffset", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/text/TextLayoutResult;I)I", OperatorName.SET_LINE_JOINSTYLE, "d", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "linesAmount", OperatorName.MOVE_TO, PDPageLabelRange.STYLE_ROMAN_LOWER, "()I", "t", OperatorName.CLOSE_AND_STROKE, TypedValues.CycleType.S_WAVE_OFFSET, PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "i", OperatorName.CLOSE_PATH, PDBorderStyleDictionary.STYLE_UNDERLINE, "resetCachedX", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "setCursor", "(I)V", "start", "end", "setSelection", "(II)V", "selectAll", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCharacterIndex", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", OperatorName.SET_LINE_CAPSTYLE, "getOriginalSelection-d9O1mEE", "()J", OperatorName.CURVE_TO, "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "e", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "selection", OperatorName.NON_STROKING_GRAY, "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotatedString", "", "getText$foundation_release", "()Ljava/lang/String;", TextBundle.TEXT_ENTRY, "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n73#1,8:433\n73#1,8:441\n73#1,8:449\n73#1,8:457\n73#1,8:465\n73#1,8:473\n73#1,8:481\n73#1,8:489\n73#1,8:497\n73#1,8:505\n73#1,8:513\n73#1,8:521\n73#1,6:529\n80#1:536\n73#1,8:537\n73#1,8:545\n73#1,8:553\n74#1,7:561\n74#1,7:568\n73#1,8:575\n73#1,8:583\n73#1,8:591\n73#1,8:599\n74#1,7:607\n1#2:535\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:433,8\n95#1:441,8\n99#1:449,8\n107#1:457,8\n118#1:465,8\n134#1:473,8\n158#1:481,8\n163#1:489,8\n168#1:497,8\n172#1:505,8\n176#1:513,8\n184#1:521,8\n194#1:529,6\n194#1:536\n200#1:537,8\n204#1:545,8\n208#1:553,8\n212#1:561,7\n216#1:568,7\n222#1:575,8\n228#1:583,8\n232#1:591,8\n240#1:599,8\n249#1:607,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int NoCharacterFound = -1;

    /* renamed from: a */
    public final AnnotatedString f14211a;

    /* renamed from: b */
    public final long f14212b;

    /* renamed from: c */
    public final TextLayoutResult f14213c;

    /* renamed from: d */
    public final OffsetMapping f14214d;

    /* renamed from: e */
    public final TextPreparedSelectionState f14215e;

    /* renamed from: f */
    public long f14216f;

    /* renamed from: g */
    public AnnotatedString f14217g;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;", "", "()V", "NoCharacterFound", "", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z, Function1 block, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            Intrinsics.checkNotNullParameter(block, "block");
            if (z) {
                baseTextPreparedSelection.getState().resetCachedX();
            }
            if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
                block.invoke(obj);
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
            return (BaseTextPreparedSelection) obj;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    /* renamed from: c */
    public static /* synthetic */ int m61023c(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.m61007s();
            }
            return baseTextPreparedSelection.m61024b(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    /* renamed from: e */
    public static /* synthetic */ int m61021e(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.m61006t();
            }
            return baseTextPreparedSelection.m61022d(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    /* renamed from: g */
    public static /* synthetic */ int m61019g(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.m61008r();
            }
            return baseTextPreparedSelection.m61020f(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    /* renamed from: k */
    public static /* synthetic */ int m61015k(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.m61008r();
            }
            return baseTextPreparedSelection.m61016j(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    /* renamed from: a */
    public final int m61025a(int i) {
        return AbstractC11719c.coerceAtMost(i, getText$foundation_release().length() - 1);
    }

    @NotNull
    public final <U> T apply(U u, boolean z, @NotNull Function1<? super U, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            block.invoke(u);
        }
        Intrinsics.checkNotNull(u, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u;
    }

    /* renamed from: b */
    public final int m61024b(TextLayoutResult textLayoutResult, int i) {
        return this.f14214d.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true));
    }

    @NotNull
    public final T collapseLeftOr(@NotNull Function1<? super T, Unit> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m73210getCollapsedimpl(this.f14216f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                or.invoke(this);
            } else if (m61014l()) {
                setCursor(TextRange.m73214getMinimpl(this.f14216f));
            } else {
                setCursor(TextRange.m73213getMaximpl(this.f14216f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T collapseRightOr(@NotNull Function1<? super T, Unit> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m73210getCollapsedimpl(this.f14216f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                or.invoke(this);
            } else if (m61014l()) {
                setCursor(TextRange.m73213getMaximpl(this.f14216f));
            } else {
                setCursor(TextRange.m73214getMinimpl(this.f14216f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: d */
    public final int m61022d(TextLayoutResult textLayoutResult, int i) {
        return this.f14214d.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i)));
    }

    @NotNull
    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m73211getEndimpl(this.f14216f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: f */
    public final int m61020f(TextLayoutResult textLayoutResult, int i) {
        while (i < this.f14211a.length()) {
            long m73191getWordBoundaryjx7JFs = textLayoutResult.m73191getWordBoundaryjx7JFs(m61025a(i));
            if (TextRange.m73211getEndimpl(m73191getWordBoundaryjx7JFs) <= i) {
                i++;
            } else {
                return this.f14214d.transformedToOriginal(TextRange.m73211getEndimpl(m73191getWordBoundaryjx7JFs));
            }
        }
        return this.f14211a.length();
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.f14217g;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.f14213c;
    }

    @Nullable
    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.f14213c;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(m61023c(this, textLayoutResult, 0, 1, null));
    }

    @Nullable
    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.f14213c;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(m61021e(this, textLayoutResult, 0, 1, null));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.f14217g.getText(), TextRange.m73211getEndimpl(this.f14216f));
    }

    @Nullable
    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.f14213c;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(m61019g(this, textLayoutResult, 0, 1, null));
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.f14214d;
    }

    /* renamed from: getOriginalSelection-d9O1mEE  reason: not valid java name */
    public final long m69831getOriginalSelectiond9O1mEE() {
        return this.f14212b;
    }

    @NotNull
    public final AnnotatedString getOriginalText() {
        return this.f14211a;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.f14217g.getText(), TextRange.m73211getEndimpl(this.f14216f));
    }

    @Nullable
    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.f14213c;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(m61015k(this, textLayoutResult, 0, 1, null));
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m69832getSelectiond9O1mEE() {
        return this.f14216f;
    }

    @NotNull
    public final TextPreparedSelectionState getState() {
        return this.f14215e;
    }

    @NotNull
    public final String getText$foundation_release() {
        return this.f14217g.getText();
    }

    /* renamed from: h */
    public final int m61018h() {
        return StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m73213getMaximpl(this.f14216f));
    }

    /* renamed from: i */
    public final int m61017i() {
        return StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m73214getMinimpl(this.f14216f));
    }

    /* renamed from: j */
    public final int m61016j(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long m73191getWordBoundaryjx7JFs = textLayoutResult.m73191getWordBoundaryjx7JFs(m61025a(i));
            if (TextRange.m73216getStartimpl(m73191getWordBoundaryjx7JFs) >= i) {
                i--;
            } else {
                return this.f14214d.transformedToOriginal(TextRange.m73216getStartimpl(m73191getWordBoundaryjx7JFs));
            }
        }
        return 0;
    }

    /* renamed from: l */
    public final boolean m61014l() {
        ResolvedTextDirection resolvedTextDirection;
        TextLayoutResult textLayoutResult = this.f14213c;
        if (textLayoutResult != null) {
            resolvedTextDirection = textLayoutResult.getParagraphDirection(m61008r());
        } else {
            resolvedTextDirection = null;
        }
        if (resolvedTextDirection != ResolvedTextDirection.Rtl) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final int m61013m(TextLayoutResult textLayoutResult, int i) {
        int m61008r = m61008r();
        if (this.f14215e.getCachedX() == null) {
            this.f14215e.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(m61008r).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(m61008r) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.f14215e.getCachedX();
        Intrinsics.checkNotNull(cachedX);
        float floatValue = cachedX.floatValue();
        if ((m61014l() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!m61014l() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.f14214d.transformedToOriginal(textLayoutResult.m73189getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    @NotNull
    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.f14213c) != null) {
            setCursor(m61013m(textLayoutResult, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (m61014l()) {
                m61010p();
            } else {
                m61012n();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (m61014l()) {
                m61009q();
            } else {
                m61011o();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(m61018h());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(m61017i());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (m61014l()) {
                m61012n();
            } else {
                m61010p();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (m61014l()) {
                m61011o();
            } else {
                m61009q();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (m61014l()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (m61014l()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.f14213c) != null) {
            setCursor(m61013m(textLayoutResult, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: n */
    public final BaseTextPreparedSelection m61012n() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: o */
    public final BaseTextPreparedSelection m61011o() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: p */
    public final BaseTextPreparedSelection m61010p() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: q */
    public final BaseTextPreparedSelection m61009q() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: r */
    public final int m61008r() {
        return this.f14214d.originalToTransformed(TextRange.m73211getEndimpl(this.f14216f));
    }

    /* renamed from: s */
    public final int m61007s() {
        return this.f14214d.originalToTransformed(TextRange.m73213getMaximpl(this.f14216f));
    }

    @NotNull
    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.f14216f = TextRangeKt.TextRange(TextRange.m73216getStartimpl(this.f14212b), TextRange.m73211getEndimpl(this.f14216f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        this.f14217g = annotatedString;
    }

    public final void setCursor(int i) {
        setSelection(i, i);
    }

    public final void setSelection(int i, int i2) {
        this.f14216f = TextRangeKt.TextRange(i, i2);
    }

    /* renamed from: setSelection-5zc-tL8  reason: not valid java name */
    public final void m69833setSelection5zctL8(long j) {
        this.f14216f = j;
    }

    /* renamed from: t */
    public final int m61006t() {
        return this.f14214d.originalToTransformed(TextRange.m73214getMinimpl(this.f14216f));
    }

    public BaseTextPreparedSelection(AnnotatedString originalText, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState state) {
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f14211a = originalText;
        this.f14212b = j;
        this.f14213c = textLayoutResult;
        this.f14214d = offsetMapping;
        this.f14215e = state;
        this.f14216f = j;
        this.f14217g = originalText;
    }
}
