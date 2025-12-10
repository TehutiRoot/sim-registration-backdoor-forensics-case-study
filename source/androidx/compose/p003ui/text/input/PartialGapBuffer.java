package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.InternalTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.pattern.parser.Parser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0005R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m28850d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;)V", "", "start", "end", "", Parser.REPLACE_CONVERTER_WORD, "(IILjava/lang/String;)V", FirebaseAnalytics.Param.INDEX, "", "get", "(I)C", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getText", "setText", "LC50;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "LC50;", "buffer", OperatorName.CURVE_TO, "I", "bufStart", "d", "bufEnd", "getLength", "()I", "length", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@InternalTextApi
/* renamed from: androidx.compose.ui.text.input.PartialGapBuffer */
/* loaded from: classes2.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    /* renamed from: a */
    public String f31405a;

    /* renamed from: b */
    public C50 f31406b;

    /* renamed from: c */
    public int f31407c;

    /* renamed from: d */
    public int f31408d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "()V", "BUF_SIZE", "", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.input.PartialGapBuffer$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PartialGapBuffer(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f31405a = text;
        this.f31407c = -1;
        this.f31408d = -1;
    }

    public final char get(int i) {
        C50 c50 = this.f31406b;
        if (c50 == null) {
            return this.f31405a.charAt(i);
        }
        if (i < this.f31407c) {
            return this.f31405a.charAt(i);
        }
        int m68828e = c50.m68828e();
        int i2 = this.f31407c;
        if (i < m68828e + i2) {
            return c50.m68829d(i - i2);
        }
        return this.f31405a.charAt(i - ((m68828e - this.f31408d) + i2));
    }

    public final int getLength() {
        C50 c50 = this.f31406b;
        if (c50 == null) {
            return this.f31405a.length();
        }
        return (this.f31405a.length() - (this.f31408d - this.f31407c)) + c50.m68828e();
    }

    @NotNull
    public final String getText() {
        return this.f31405a;
    }

    public final void replace(int i, int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i <= i2) {
            if (i >= 0) {
                C50 c50 = this.f31406b;
                if (c50 == null) {
                    int max = Math.max(255, text.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    int min2 = Math.min(this.f31405a.length() - i2, 64);
                    int i3 = i - min;
                    GapBuffer_jvmKt.toCharArray(this.f31405a, cArr, 0, i3, i);
                    int i4 = max - min2;
                    int i5 = min2 + i2;
                    GapBuffer_jvmKt.toCharArray(this.f31405a, cArr, i4, i2, i5);
                    GapBufferKt.m59029a(text, cArr, min);
                    this.f31406b = new C50(cArr, min + text.length(), i4);
                    this.f31407c = i3;
                    this.f31408d = i5;
                    return;
                }
                int i6 = this.f31407c;
                int i7 = i - i6;
                int i8 = i2 - i6;
                if (i7 >= 0 && i8 <= c50.m68828e()) {
                    c50.m68826g(i7, i8, text);
                    return;
                }
                this.f31405a = toString();
                this.f31406b = null;
                this.f31407c = -1;
                this.f31408d = -1;
                replace(i, i2, text);
                return;
            }
            throw new IllegalArgumentException(("start must be non-negative, but was " + i).toString());
        }
        throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i + " > " + i2).toString());
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f31405a = str;
    }

    @NotNull
    public String toString() {
        C50 c50 = this.f31406b;
        if (c50 == null) {
            return this.f31405a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f31405a, 0, this.f31407c);
        c50.m68832a(sb);
        String str = this.f31405a;
        sb.append((CharSequence) str, this.f31408d, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
