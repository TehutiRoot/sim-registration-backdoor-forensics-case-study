package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@ExperimentalMaterial3Api
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m29142d2 = {"Landroidx/compose/material3/SearchBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "<init>", "(JJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getContainerColor-0d7_KjU", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDividerColor-0d7_KjU", OperatorName.CURVE_TO, "Landroidx/compose/material3/TextFieldColors;", "getInputFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SearchBarColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26078a;

    /* renamed from: b */
    public final long f26079b;

    /* renamed from: c */
    public final TextFieldColors f26080c;

    public /* synthetic */ SearchBarColors(long j, long j2, TextFieldColors textFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, textFieldColors);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(SearchBarColors.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.material3.SearchBarColors");
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        if (Color.m71920equalsimpl0(this.f26078a, searchBarColors.f26078a) && Color.m71920equalsimpl0(this.f26079b, searchBarColors.f26079b) && Intrinsics.areEqual(this.f26080c, searchBarColors.f26080c)) {
            return true;
        }
        return false;
    }

    /* renamed from: getContainerColor-0d7_KjU  reason: not valid java name */
    public final long m70704getContainerColor0d7_KjU() {
        return this.f26078a;
    }

    /* renamed from: getDividerColor-0d7_KjU  reason: not valid java name */
    public final long m70705getDividerColor0d7_KjU() {
        return this.f26079b;
    }

    @NotNull
    public final TextFieldColors getInputFieldColors() {
        return this.f26080c;
    }

    public int hashCode() {
        return (((Color.m71926hashCodeimpl(this.f26078a) * 31) + Color.m71926hashCodeimpl(this.f26079b)) * 31) + this.f26080c.hashCode();
    }

    public SearchBarColors(long j, long j2, TextFieldColors inputFieldColors) {
        Intrinsics.checkNotNullParameter(inputFieldColors, "inputFieldColors");
        this.f26078a = j;
        this.f26079b = j2;
        this.f26080c = inputFieldColors;
    }
}