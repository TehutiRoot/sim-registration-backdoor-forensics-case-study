package androidx.compose.p003ui.text.input;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Immutable
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B<\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m28850d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "<init>", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getSingleLine", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getCapitalization-IUNYP9k", OperatorName.CURVE_TO, "getAutoCorrect", "d", "getKeyboardType-PjHm6EE", "e", "getImeAction-eUduSuo", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.ImeOptions */
/* loaded from: classes2.dex */
public final class ImeOptions {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final ImeOptions f31378f = new ImeOptions(false, 0, false, 0, 0, 31, null);

    /* renamed from: a */
    public final boolean f31379a;

    /* renamed from: b */
    public final int f31380b;

    /* renamed from: c */
    public final boolean f31381c;

    /* renamed from: d */
    public final int f31382d;

    /* renamed from: e */
    public final int f31383e;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.input.ImeOptions$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ImeOptions getDefault() {
            return ImeOptions.f31378f;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3);
    }

    /* renamed from: copy-uxg59PA$default  reason: not valid java name */
    public static /* synthetic */ ImeOptions m73373copyuxg59PA$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.f31379a;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.f31380b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.f31381c;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.f31382d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.f31383e;
        }
        return imeOptions.m73374copyuxg59PA(z, i5, z3, i6, i3);
    }

    @NotNull
    /* renamed from: copy-uxg59PA  reason: not valid java name */
    public final ImeOptions m73374copyuxg59PA(boolean z, int i, boolean z2, int i2, int i3) {
        return new ImeOptions(z, i, z2, i2, i3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        if (this.f31379a == imeOptions.f31379a && KeyboardCapitalization.m73383equalsimpl0(this.f31380b, imeOptions.f31380b) && this.f31381c == imeOptions.f31381c && KeyboardType.m73398equalsimpl0(this.f31382d, imeOptions.f31382d) && ImeAction.m73353equalsimpl0(this.f31383e, imeOptions.f31383e)) {
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.f31381c;
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m73375getCapitalizationIUNYP9k() {
        return this.f31380b;
    }

    /* renamed from: getImeAction-eUduSuo  reason: not valid java name */
    public final int m73376getImeActioneUduSuo() {
        return this.f31383e;
    }

    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public final int m73377getKeyboardTypePjHm6EE() {
        return this.f31382d;
    }

    public final boolean getSingleLine() {
        return this.f31379a;
    }

    public int hashCode() {
        return (((((((AbstractC1705Xp.m65430a(this.f31379a) * 31) + KeyboardCapitalization.m73384hashCodeimpl(this.f31380b)) * 31) + AbstractC1705Xp.m65430a(this.f31381c)) * 31) + KeyboardType.m73399hashCodeimpl(this.f31382d)) * 31) + ImeAction.m73354hashCodeimpl(this.f31383e);
    }

    @NotNull
    public String toString() {
        return "ImeOptions(singleLine=" + this.f31379a + ", capitalization=" + ((Object) KeyboardCapitalization.m73385toStringimpl(this.f31380b)) + ", autoCorrect=" + this.f31381c + ", keyboardType=" + ((Object) KeyboardType.m73400toStringimpl(this.f31382d)) + ", imeAction=" + ((Object) ImeAction.m73355toStringimpl(this.f31383e)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ImeOptions(boolean z, int i, boolean z2, int i2, int i3) {
        this.f31379a = z;
        this.f31380b = i;
        this.f31381c = z2;
        this.f31382d = i2;
        this.f31383e = i3;
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m73392getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m73418getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m73365getDefaulteUduSuo() : i3, null);
    }
}
