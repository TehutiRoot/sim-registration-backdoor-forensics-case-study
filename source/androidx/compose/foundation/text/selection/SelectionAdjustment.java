package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelectionRange", "previousHandleOffset", "", "isStartHandle", "", "previousSelectionRange", "adjust-ZXO7KMw", "(Landroidx/compose/ui/text/TextLayoutResult;JIZLandroidx/compose/ui/text/TextRange;)J", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public interface SelectionAdjustment {
    @NotNull
    public static final Companion Companion = Companion.f14231a;

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/text/TextRange;", "newRawSelection", "Lkotlin/Function1;", "", "boundaryFun", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/TextLayoutResult;JLkotlin/jvm/functions/Function1;)J", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getNone", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "None", OperatorName.CURVE_TO, "getCharacter", "Character", "d", "getWord", "Word", "e", "getParagraph", PDAnnotationText.NAME_PARAGRAPH, OperatorName.FILL_NON_ZERO, "getCharacterWithWordAccelerate", "CharacterWithWordAccelerate", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f14231a = new Companion();

        /* renamed from: b */
        public static final SelectionAdjustment f14232b = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo69843adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return j;
            }
        };

        /* renamed from: c */
        public static final SelectionAdjustment f14233c = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo69843adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                boolean z2;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (TextRange.m73210getCollapsedimpl(j)) {
                    if (textRange != null) {
                        z2 = TextRange.m73215getReversedimpl(textRange.m73220unboximpl());
                    } else {
                        z2 = false;
                    }
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m73216getStartimpl(j), StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText()), z, z2);
                }
                return j;
            }
        };

        /* renamed from: d */
        public static final SelectionAdjustment f14234d = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo69843adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                long m60999a;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m60999a = SelectionAdjustment.Companion.f14231a.m60999a(textLayoutResult, j, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
                return m60999a;
            }
        };

        /* renamed from: e */
        public static final SelectionAdjustment f14235e = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo69843adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                long m60999a;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m60999a = SelectionAdjustment.Companion.f14231a.m60999a(textLayoutResult, j, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
                return m60999a;
            }
        };

        /* renamed from: f */
        public static final SelectionAdjustment f14236f = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            /* renamed from: a */
            public final boolean m61003a(TextLayoutResult textLayoutResult, int i) {
                long m73191getWordBoundaryjx7JFs = textLayoutResult.m73191getWordBoundaryjx7JFs(i);
                if (i != TextRange.m73216getStartimpl(m73191getWordBoundaryjx7JFs) && i != TextRange.m73211getEndimpl(m73191getWordBoundaryjx7JFs)) {
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo69843adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                int m61000d;
                int i2;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (textRange == null) {
                    return SelectionAdjustment.Companion.f14231a.getWord().mo69843adjustZXO7KMw(textLayoutResult, j, i, z, textRange);
                }
                if (TextRange.m73210getCollapsedimpl(j)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m73216getStartimpl(j), StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText()), z, TextRange.m73215getReversedimpl(textRange.m73220unboximpl()));
                }
                if (z) {
                    i2 = m61000d(textLayoutResult, TextRange.m73216getStartimpl(j), i, TextRange.m73216getStartimpl(textRange.m73220unboximpl()), TextRange.m73211getEndimpl(j), true, TextRange.m73215getReversedimpl(j));
                    m61000d = TextRange.m73211getEndimpl(j);
                } else {
                    int m73216getStartimpl = TextRange.m73216getStartimpl(j);
                    m61000d = m61000d(textLayoutResult, TextRange.m73211getEndimpl(j), i, TextRange.m73211getEndimpl(textRange.m73220unboximpl()), TextRange.m73216getStartimpl(j), false, TextRange.m73215getReversedimpl(j));
                    i2 = m73216getStartimpl;
                }
                return TextRangeKt.TextRange(i2, m61000d);
            }

            /* renamed from: b */
            public final boolean m61002b(int i, int i2, boolean z, boolean z2) {
                if (i2 == -1) {
                    return true;
                }
                if (i == i2) {
                    return false;
                }
                if (z ^ z2) {
                    if (i < i2) {
                        return true;
                    }
                } else if (i > i2) {
                    return true;
                }
                return false;
            }

            /* renamed from: c */
            public final int m61001c(TextLayoutResult textLayoutResult, int i, int i2, int i3, boolean z, boolean z2) {
                int lineStart;
                int lineEnd$default;
                long m73191getWordBoundaryjx7JFs = textLayoutResult.m73191getWordBoundaryjx7JFs(i);
                if (textLayoutResult.getLineForOffset(TextRange.m73216getStartimpl(m73191getWordBoundaryjx7JFs)) == i2) {
                    lineStart = TextRange.m73216getStartimpl(m73191getWordBoundaryjx7JFs);
                } else {
                    lineStart = textLayoutResult.getLineStart(i2);
                }
                if (textLayoutResult.getLineForOffset(TextRange.m73211getEndimpl(m73191getWordBoundaryjx7JFs)) == i2) {
                    lineEnd$default = TextRange.m73211getEndimpl(m73191getWordBoundaryjx7JFs);
                } else {
                    lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult, i2, false, 2, null);
                }
                if (lineStart == i3) {
                    return lineEnd$default;
                }
                if (lineEnd$default == i3) {
                    return lineStart;
                }
                int i4 = (lineStart + lineEnd$default) / 2;
                if (z ^ z2) {
                    if (i <= i4) {
                        return lineStart;
                    }
                } else if (i < i4) {
                    return lineStart;
                }
                return lineEnd$default;
            }

            /* renamed from: d */
            public final int m61000d(TextLayoutResult textLayoutResult, int i, int i2, int i3, int i4, boolean z, boolean z2) {
                if (i == i2) {
                    return i3;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                if (lineForOffset != textLayoutResult.getLineForOffset(i3)) {
                    return m61001c(textLayoutResult, i, lineForOffset, i4, z, z2);
                }
                if (!m61002b(i, i2, z, z2)) {
                    return i;
                }
                if (!m61003a(textLayoutResult, i3)) {
                    return i;
                }
                return m61001c(textLayoutResult, i, lineForOffset, i4, z, z2);
            }
        };

        /* renamed from: a */
        public final long m60999a(TextLayoutResult textLayoutResult, long j, Function1 function1) {
            int m73216getStartimpl;
            int m73211getEndimpl;
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return TextRange.Companion.m73221getZerod9O1mEE();
            }
            int lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
            long m73220unboximpl = ((TextRange) function1.invoke(Integer.valueOf(AbstractC11719c.coerceIn(TextRange.m73216getStartimpl(j), 0, lastIndex)))).m73220unboximpl();
            long m73220unboximpl2 = ((TextRange) function1.invoke(Integer.valueOf(AbstractC11719c.coerceIn(TextRange.m73211getEndimpl(j), 0, lastIndex)))).m73220unboximpl();
            if (TextRange.m73215getReversedimpl(j)) {
                m73216getStartimpl = TextRange.m73211getEndimpl(m73220unboximpl);
            } else {
                m73216getStartimpl = TextRange.m73216getStartimpl(m73220unboximpl);
            }
            if (TextRange.m73215getReversedimpl(j)) {
                m73211getEndimpl = TextRange.m73216getStartimpl(m73220unboximpl2);
            } else {
                m73211getEndimpl = TextRange.m73211getEndimpl(m73220unboximpl2);
            }
            return TextRangeKt.TextRange(m73216getStartimpl, m73211getEndimpl);
        }

        @NotNull
        public final SelectionAdjustment getCharacter() {
            return f14233c;
        }

        @NotNull
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return f14236f;
        }

        @NotNull
        public final SelectionAdjustment getNone() {
            return f14232b;
        }

        @NotNull
        public final SelectionAdjustment getParagraph() {
            return f14235e;
        }

        @NotNull
        public final SelectionAdjustment getWord() {
            return f14234d;
        }
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    long mo69843adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange);
}
