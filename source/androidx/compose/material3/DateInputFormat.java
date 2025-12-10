package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/material3/DateInputFormat;", "", "", "patternWithDelimiters", "", "delimiter", "<init>", "(Ljava/lang/String;C)V", "component1", "()Ljava/lang/String;", "component2", "()C", "copy", "(Ljava/lang/String;C)Landroidx/compose/material3/DateInputFormat;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPatternWithDelimiters", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "C", "getDelimiter", OperatorName.CURVE_TO, "getPatternWithoutDelimiters", "patternWithoutDelimiters", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DateInputFormat {

    /* renamed from: a */
    public final String f25680a;

    /* renamed from: b */
    public final char f25681b;

    /* renamed from: c */
    public final String f25682c;

    public DateInputFormat(@NotNull String patternWithDelimiters, char c) {
        Intrinsics.checkNotNullParameter(patternWithDelimiters, "patternWithDelimiters");
        this.f25680a = patternWithDelimiters;
        this.f25681b = c;
        this.f25682c = AbstractC20204hN1.replace$default(patternWithDelimiters, String.valueOf(c), "", false, 4, (Object) null);
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateInputFormat.f25680a;
        }
        if ((i & 2) != 0) {
            c = dateInputFormat.f25681b;
        }
        return dateInputFormat.copy(str, c);
    }

    @NotNull
    public final String component1() {
        return this.f25680a;
    }

    public final char component2() {
        return this.f25681b;
    }

    @NotNull
    public final DateInputFormat copy(@NotNull String patternWithDelimiters, char c) {
        Intrinsics.checkNotNullParameter(patternWithDelimiters, "patternWithDelimiters");
        return new DateInputFormat(patternWithDelimiters, c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateInputFormat) {
            DateInputFormat dateInputFormat = (DateInputFormat) obj;
            return Intrinsics.areEqual(this.f25680a, dateInputFormat.f25680a) && this.f25681b == dateInputFormat.f25681b;
        }
        return false;
    }

    public final char getDelimiter() {
        return this.f25681b;
    }

    @NotNull
    public final String getPatternWithDelimiters() {
        return this.f25680a;
    }

    @NotNull
    public final String getPatternWithoutDelimiters() {
        return this.f25682c;
    }

    public int hashCode() {
        return (this.f25680a.hashCode() * 31) + this.f25681b;
    }

    @NotNull
    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f25680a + ", delimiter=" + this.f25681b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
