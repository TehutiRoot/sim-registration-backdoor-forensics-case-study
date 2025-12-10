package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.pattern.parser.Parser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u001c\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0080\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010$\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010#J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R*\u00106\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b1\u00105R*\u00109\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b-\u00105R$\u0010=\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R$\u0010@\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R\u001f\u0010C\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001d\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bD\u0010ER$\u0010F\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bG\u00104\"\u0004\bH\u00105R\u0014\u0010J\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, m28850d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextRange;", "selection", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasComposition$ui_text_release", "()Z", "hasComposition", "", FirebaseAnalytics.Param.INDEX, "", "get$ui_text_release", "(I)C", "get", "start", "end", "", "replace$ui_text_release", "(IILandroidx/compose/ui/text/AnnotatedString;)V", Parser.REPLACE_CONVERTER_WORD, "(IILjava/lang/String;)V", "delete$ui_text_release", "(II)V", "delete", "setSelection$ui_text_release", "setSelection", "setComposition$ui_text_release", "setComposition", "cancelComposition$ui_text_release", "()V", "cancelComposition", "commitComposition$ui_text_release", "commitComposition", "toString", "()Ljava/lang/String;", "toAnnotatedString$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "Landroidx/compose/ui/text/input/PartialGapBuffer;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "value", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getSelectionStart$ui_text_release", "()I", "(I)V", "selectionStart", OperatorName.CURVE_TO, "getSelectionEnd$ui_text_release", "selectionEnd", "<set-?>", "d", "getCompositionStart$ui_text_release", "compositionStart", "e", "getCompositionEnd$ui_text_release", "compositionEnd", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text_release", "()J", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "getLength$ui_text_release", "length", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.EditingBuffer */
/* loaded from: classes2.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;

    /* renamed from: a */
    public final PartialGapBuffer f31364a;

    /* renamed from: b */
    public int f31365b;

    /* renamed from: c */
    public int f31366c;

    /* renamed from: d */
    public int f31367d;

    /* renamed from: e */
    public int f31368e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "()V", "NOWHERE", "", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.input.EditingBuffer$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    /* renamed from: a */
    public final void m59031a(int i) {
        if (i >= 0) {
            this.f31366c = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
    }

    /* renamed from: b */
    public final void m59030b(int i) {
        if (i >= 0) {
            this.f31365b = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.f31367d, this.f31368e, "");
        this.f31367d = -1;
        this.f31368e = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.f31367d = -1;
        this.f31368e = -1;
    }

    public final void delete$ui_text_release(int i, int i2) {
        long TextRange = TextRangeKt.TextRange(i, i2);
        this.f31364a.replace(i, i2, "");
        long m73349updateRangeAfterDeletepWDy79M = EditingBufferKt.m73349updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.f31365b, this.f31366c), TextRange);
        m59030b(TextRange.m73214getMinimpl(m73349updateRangeAfterDeletepWDy79M));
        m59031a(TextRange.m73213getMaximpl(m73349updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long m73349updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m73349updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.f31367d, this.f31368e), TextRange);
            if (TextRange.m73210getCollapsedimpl(m73349updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
                return;
            }
            this.f31367d = TextRange.m73214getMinimpl(m73349updateRangeAfterDeletepWDy79M2);
            this.f31368e = TextRange.m73213getMaximpl(m73349updateRangeAfterDeletepWDy79M2);
        }
    }

    public final char get$ui_text_release(int i) {
        return this.f31364a.get(i);
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA$ui_text_release  reason: not valid java name */
    public final TextRange m73347getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m73204boximpl(TextRangeKt.TextRange(this.f31367d, this.f31368e));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.f31368e;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.f31367d;
    }

    public final int getCursor$ui_text_release() {
        int i = this.f31365b;
        int i2 = this.f31366c;
        if (i != i2) {
            return -1;
        }
        return i2;
    }

    public final int getLength$ui_text_release() {
        return this.f31364a.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release  reason: not valid java name */
    public final long m73348getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.f31365b, this.f31366c);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.f31366c;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.f31365b;
    }

    public final boolean hasComposition$ui_text_release() {
        if (this.f31367d != -1) {
            return true;
        }
        return false;
    }

    public final void replace$ui_text_release(int i, int i2, @NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        replace$ui_text_release(i, i2, text.getText());
    }

    public final void setComposition$ui_text_release(int i, int i2) {
        if (i >= 0 && i <= this.f31364a.getLength()) {
            if (i2 >= 0 && i2 <= this.f31364a.getLength()) {
                if (i < i2) {
                    this.f31367d = i;
                    this.f31368e = i2;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f31364a.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f31364a.getLength());
    }

    public final void setCursor$ui_text_release(int i) {
        setSelection$ui_text_release(i, i);
    }

    public final void setSelection$ui_text_release(int i, int i2) {
        if (i >= 0 && i <= this.f31364a.getLength()) {
            if (i2 >= 0 && i2 <= this.f31364a.getLength()) {
                if (i <= i2) {
                    m59030b(i);
                    m59031a(i2);
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f31364a.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f31364a.getLength());
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    @NotNull
    public String toString() {
        return this.f31364a.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public final void replace$ui_text_release(int i, int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i >= 0 && i <= this.f31364a.getLength()) {
            if (i2 < 0 || i2 > this.f31364a.getLength()) {
                throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f31364a.getLength());
            } else if (i <= i2) {
                this.f31364a.replace(i, i2, text);
                m59030b(text.length() + i);
                m59031a(i + text.length());
                this.f31367d = -1;
                this.f31368e = -1;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f31364a.getLength());
    }

    public EditingBuffer(AnnotatedString text, long j) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f31364a = new PartialGapBuffer(text.getText());
        this.f31365b = TextRange.m73214getMinimpl(j);
        this.f31366c = TextRange.m73213getMaximpl(j);
        this.f31367d = -1;
        this.f31368e = -1;
        int m73214getMinimpl = TextRange.m73214getMinimpl(j);
        int m73213getMaximpl = TextRange.m73213getMaximpl(j);
        if (m73214getMinimpl >= 0 && m73214getMinimpl <= text.length()) {
            if (m73213getMaximpl < 0 || m73213getMaximpl > text.length()) {
                throw new IndexOutOfBoundsException("end (" + m73213getMaximpl + ") offset is outside of text region " + text.length());
            } else if (m73214getMinimpl <= m73213getMaximpl) {
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + m73214getMinimpl + " > " + m73213getMaximpl);
            }
        }
        throw new IndexOutOfBoundsException("start (" + m73214getMinimpl + ") offset is outside of text region " + text.length());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditingBuffer(String text, long j) {
        this(new AnnotatedString(text, null, null, 6, null), j, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
