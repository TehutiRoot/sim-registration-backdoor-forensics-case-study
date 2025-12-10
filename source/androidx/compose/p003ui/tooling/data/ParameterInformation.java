package androidx.compose.p003ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012JZ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u0012¨\u00061"}, m28850d2 = {"Landroidx/compose/ui/tooling/data/ParameterInformation;", "", "", "name", "value", "", "fromDefault", "static", "compared", "inlineClass", "stable", "<init>", "(Ljava/lang/String;Ljava/lang/Object;ZZZLjava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Z", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Object;ZZZLjava/lang/String;Z)Landroidx/compose/ui/tooling/data/ParameterInformation;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getValue", OperatorName.CURVE_TO, "Z", "getFromDefault", "d", "getStatic", "e", "getCompared", OperatorName.FILL_NON_ZERO, "getInlineClass", OperatorName.NON_STROKING_GRAY, "getStable", "ui-tooling-data_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.data.ParameterInformation */
/* loaded from: classes2.dex */
public final class ParameterInformation {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f31721a;

    /* renamed from: b */
    public final Object f31722b;

    /* renamed from: c */
    public final boolean f31723c;

    /* renamed from: d */
    public final boolean f31724d;

    /* renamed from: e */
    public final boolean f31725e;

    /* renamed from: f */
    public final String f31726f;

    /* renamed from: g */
    public final boolean f31727g;

    public ParameterInformation(@NotNull String name, @Nullable Object obj, boolean z, boolean z2, boolean z3, @Nullable String str, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f31721a = name;
        this.f31722b = obj;
        this.f31723c = z;
        this.f31724d = z2;
        this.f31725e = z3;
        this.f31726f = str;
        this.f31727g = z4;
    }

    public static /* synthetic */ ParameterInformation copy$default(ParameterInformation parameterInformation, String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = parameterInformation.f31721a;
        }
        if ((i & 2) != 0) {
            obj = parameterInformation.f31722b;
        }
        Object obj3 = obj;
        if ((i & 4) != 0) {
            z = parameterInformation.f31723c;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = parameterInformation.f31724d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = parameterInformation.f31725e;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            str2 = parameterInformation.f31726f;
        }
        String str3 = str2;
        if ((i & 64) != 0) {
            z4 = parameterInformation.f31727g;
        }
        return parameterInformation.copy(str, obj3, z5, z6, z7, str3, z4);
    }

    @NotNull
    public final String component1() {
        return this.f31721a;
    }

    @Nullable
    public final Object component2() {
        return this.f31722b;
    }

    public final boolean component3() {
        return this.f31723c;
    }

    public final boolean component4() {
        return this.f31724d;
    }

    public final boolean component5() {
        return this.f31725e;
    }

    @Nullable
    public final String component6() {
        return this.f31726f;
    }

    public final boolean component7() {
        return this.f31727g;
    }

    @NotNull
    public final ParameterInformation copy(@NotNull String name, @Nullable Object obj, boolean z, boolean z2, boolean z3, @Nullable String str, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ParameterInformation(name, obj, z, z2, z3, str, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParameterInformation) {
            ParameterInformation parameterInformation = (ParameterInformation) obj;
            return Intrinsics.areEqual(this.f31721a, parameterInformation.f31721a) && Intrinsics.areEqual(this.f31722b, parameterInformation.f31722b) && this.f31723c == parameterInformation.f31723c && this.f31724d == parameterInformation.f31724d && this.f31725e == parameterInformation.f31725e && Intrinsics.areEqual(this.f31726f, parameterInformation.f31726f) && this.f31727g == parameterInformation.f31727g;
        }
        return false;
    }

    public final boolean getCompared() {
        return this.f31725e;
    }

    public final boolean getFromDefault() {
        return this.f31723c;
    }

    @Nullable
    public final String getInlineClass() {
        return this.f31726f;
    }

    @NotNull
    public final String getName() {
        return this.f31721a;
    }

    public final boolean getStable() {
        return this.f31727g;
    }

    public final boolean getStatic() {
        return this.f31724d;
    }

    @Nullable
    public final Object getValue() {
        return this.f31722b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f31721a.hashCode() * 31;
        Object obj = this.f31722b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z = this.f31723c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.f31724d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f31725e;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str = this.f31726f;
        int hashCode3 = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z4 = this.f31727g;
        return hashCode3 + (z4 ? 1 : z4 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        return "ParameterInformation(name=" + this.f31721a + ", value=" + this.f31722b + ", fromDefault=" + this.f31723c + ", static=" + this.f31724d + ", compared=" + this.f31725e + ", inlineClass=" + this.f31726f + ", stable=" + this.f31727g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
