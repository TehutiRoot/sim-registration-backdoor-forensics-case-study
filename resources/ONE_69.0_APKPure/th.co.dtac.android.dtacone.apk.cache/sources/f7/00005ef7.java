package androidx.compose.p003ui;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.BiasAbsoluteAlignment;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\bR \u0010%\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u0003\u001a\u0004\b\"\u0010#R \u0010)\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010!\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010#¨\u0006*"}, m29142d2 = {"Landroidx/compose/ui/AbsoluteAlignment;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/Alignment;", "getTopLeft", "()Landroidx/compose/ui/Alignment;", "getTopLeft$annotations", "TopLeft", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTopRight", "getTopRight$annotations", "TopRight", OperatorName.CURVE_TO, "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "d", "getCenterRight", "getCenterRight$annotations", "CenterRight", "e", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", OperatorName.FILL_NON_ZERO, "getBottomRight", "getBottomRight$annotations", "BottomRight", "Landroidx/compose/ui/Alignment$Horizontal;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/Alignment$Horizontal;", "getLeft", "()Landroidx/compose/ui/Alignment$Horizontal;", "getLeft$annotations", "Left", OperatorName.CLOSE_PATH, "getRight", "getRight$annotations", "Right", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.AbsoluteAlignment */
/* loaded from: classes2.dex */
public final class AbsoluteAlignment {
    public static final int $stable = 0;
    @NotNull
    public static final AbsoluteAlignment INSTANCE = new AbsoluteAlignment();

    /* renamed from: a */
    public static final Alignment f28898a = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* renamed from: b */
    public static final Alignment f28899b = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* renamed from: c */
    public static final Alignment f28900c = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    /* renamed from: d */
    public static final Alignment f28901d = new BiasAbsoluteAlignment(1.0f, 0.0f);

    /* renamed from: e */
    public static final Alignment f28902e = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* renamed from: f */
    public static final Alignment f28903f = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* renamed from: g */
    public static final Alignment.Horizontal f28904g = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* renamed from: h */
    public static final Alignment.Horizontal f28905h = new BiasAbsoluteAlignment.Horizontal(1.0f);

    @Stable
    public static /* synthetic */ void getBottomLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBottomRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopRight$annotations() {
    }

    @NotNull
    public final Alignment getBottomLeft() {
        return f28902e;
    }

    @NotNull
    public final Alignment getBottomRight() {
        return f28903f;
    }

    @NotNull
    public final Alignment getCenterLeft() {
        return f28900c;
    }

    @NotNull
    public final Alignment getCenterRight() {
        return f28901d;
    }

    @NotNull
    public final Alignment.Horizontal getLeft() {
        return f28904g;
    }

    @NotNull
    public final Alignment.Horizontal getRight() {
        return f28905h;
    }

    @NotNull
    public final Alignment getTopLeft() {
        return f28898a;
    }

    @NotNull
    public final Alignment getTopRight() {
        return f28899b;
    }
}