package androidx.compose.p003ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\f¨\u0006&"}, m29142d2 = {"Landroidx/compose/ui/tooling/data/SourceLocation;", "", "", "lineNumber", TypedValues.CycleType.S_WAVE_OFFSET, "length", "", "sourceFile", "packageHash", "<init>", "(IIILjava/lang/String;I)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(IIILjava/lang/String;I)Landroidx/compose/ui/tooling/data/SourceLocation;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLineNumber", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getOffset", OperatorName.CURVE_TO, "getLength", "d", "Ljava/lang/String;", "getSourceFile", "e", "getPackageHash", "ui-tooling-data_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.data.SourceLocation */
/* loaded from: classes2.dex */
public final class SourceLocation {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f31819a;

    /* renamed from: b */
    public final int f31820b;

    /* renamed from: c */
    public final int f31821c;

    /* renamed from: d */
    public final String f31822d;

    /* renamed from: e */
    public final int f31823e;

    public SourceLocation(int i, int i2, int i3, @Nullable String str, int i4) {
        this.f31819a = i;
        this.f31820b = i2;
        this.f31821c = i3;
        this.f31822d = str;
        this.f31823e = i4;
    }

    public static /* synthetic */ SourceLocation copy$default(SourceLocation sourceLocation, int i, int i2, int i3, String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = sourceLocation.f31819a;
        }
        if ((i5 & 2) != 0) {
            i2 = sourceLocation.f31820b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = sourceLocation.f31821c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            str = sourceLocation.f31822d;
        }
        String str2 = str;
        if ((i5 & 16) != 0) {
            i4 = sourceLocation.f31823e;
        }
        return sourceLocation.copy(i, i6, i7, str2, i4);
    }

    public final int component1() {
        return this.f31819a;
    }

    public final int component2() {
        return this.f31820b;
    }

    public final int component3() {
        return this.f31821c;
    }

    @Nullable
    public final String component4() {
        return this.f31822d;
    }

    public final int component5() {
        return this.f31823e;
    }

    @NotNull
    public final SourceLocation copy(int i, int i2, int i3, @Nullable String str, int i4) {
        return new SourceLocation(i, i2, i3, str, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceLocation) {
            SourceLocation sourceLocation = (SourceLocation) obj;
            return this.f31819a == sourceLocation.f31819a && this.f31820b == sourceLocation.f31820b && this.f31821c == sourceLocation.f31821c && Intrinsics.areEqual(this.f31822d, sourceLocation.f31822d) && this.f31823e == sourceLocation.f31823e;
        }
        return false;
    }

    public final int getLength() {
        return this.f31821c;
    }

    public final int getLineNumber() {
        return this.f31819a;
    }

    public final int getOffset() {
        return this.f31820b;
    }

    public final int getPackageHash() {
        return this.f31823e;
    }

    @Nullable
    public final String getSourceFile() {
        return this.f31822d;
    }

    public int hashCode() {
        int i = ((((this.f31819a * 31) + this.f31820b) * 31) + this.f31821c) * 31;
        String str = this.f31822d;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.f31823e;
    }

    @NotNull
    public String toString() {
        return "SourceLocation(lineNumber=" + this.f31819a + ", offset=" + this.f31820b + ", length=" + this.f31821c + ", sourceFile=" + this.f31822d + ", packageHash=" + this.f31823e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}