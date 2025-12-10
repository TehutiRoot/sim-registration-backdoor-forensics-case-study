package androidx.compose.p003ui;

import androidx.compose.p003ui.BiasAlignment;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\f\rJ-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/Alignment;", "", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "Companion", "Horizontal", "Vertical", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.Alignment */
/* loaded from: classes2.dex */
public interface Alignment {
    @NotNull
    public static final Companion Companion = Companion.f28818a;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0006\u0012\u0004\b%\u0010\u0003\u001a\u0004\b$\u0010\bR \u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0006\u0012\u0004\b)\u0010\u0003\u001a\u0004\b(\u0010\bR \u00101\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R \u00105\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010-\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010/R \u00109\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010-\u0012\u0004\b8\u0010\u0003\u001a\u0004\b7\u0010/R \u0010@\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010\u0003\u001a\u0004\b=\u0010>R \u0010D\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010<\u0012\u0004\bC\u0010\u0003\u001a\u0004\bB\u0010>R \u0010H\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010<\u0012\u0004\bG\u0010\u0003\u001a\u0004\bF\u0010>¨\u0006I"}, m28850d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/Alignment;", "getTopStart", "()Landroidx/compose/ui/Alignment;", "getTopStart$annotations", "TopStart", OperatorName.CURVE_TO, "getTopCenter", "getTopCenter$annotations", "TopCenter", "d", "getTopEnd", "getTopEnd$annotations", "TopEnd", "e", "getCenterStart", "getCenterStart$annotations", "CenterStart", OperatorName.FILL_NON_ZERO, "getCenter", "getCenter$annotations", "Center", OperatorName.NON_STROKING_GRAY, "getCenterEnd", "getCenterEnd$annotations", "CenterEnd", OperatorName.CLOSE_PATH, "getBottomStart", "getBottomStart$annotations", "BottomStart", "i", "getBottomCenter", "getBottomCenter$annotations", "BottomCenter", OperatorName.SET_LINE_JOINSTYLE, "getBottomEnd", "getBottomEnd$annotations", "BottomEnd", "Landroidx/compose/ui/Alignment$Vertical;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/Alignment$Vertical;", "getTop", "()Landroidx/compose/ui/Alignment$Vertical;", "getTop$annotations", "Top", OperatorName.LINE_TO, "getCenterVertically", "getCenterVertically$annotations", "CenterVertically", OperatorName.MOVE_TO, "getBottom", "getBottom$annotations", "Bottom", "Landroidx/compose/ui/Alignment$Horizontal;", OperatorName.ENDPATH, "Landroidx/compose/ui/Alignment$Horizontal;", "getStart", "()Landroidx/compose/ui/Alignment$Horizontal;", "getStart$annotations", "Start", "o", "getCenterHorizontally", "getCenterHorizontally$annotations", "CenterHorizontally", "p", "getEnd", "getEnd$annotations", "End", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.Alignment$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f28818a = new Companion();

        /* renamed from: b */
        public static final Alignment f28819b = new BiasAlignment(-1.0f, -1.0f);

        /* renamed from: c */
        public static final Alignment f28820c = new BiasAlignment(0.0f, -1.0f);

        /* renamed from: d */
        public static final Alignment f28821d = new BiasAlignment(1.0f, -1.0f);

        /* renamed from: e */
        public static final Alignment f28822e = new BiasAlignment(-1.0f, 0.0f);

        /* renamed from: f */
        public static final Alignment f28823f = new BiasAlignment(0.0f, 0.0f);

        /* renamed from: g */
        public static final Alignment f28824g = new BiasAlignment(1.0f, 0.0f);

        /* renamed from: h */
        public static final Alignment f28825h = new BiasAlignment(-1.0f, 1.0f);

        /* renamed from: i */
        public static final Alignment f28826i = new BiasAlignment(0.0f, 1.0f);

        /* renamed from: j */
        public static final Alignment f28827j = new BiasAlignment(1.0f, 1.0f);

        /* renamed from: k */
        public static final Vertical f28828k = new BiasAlignment.Vertical(-1.0f);

        /* renamed from: l */
        public static final Vertical f28829l = new BiasAlignment.Vertical(0.0f);

        /* renamed from: m */
        public static final Vertical f28830m = new BiasAlignment.Vertical(1.0f);

        /* renamed from: n */
        public static final Horizontal f28831n = new BiasAlignment.Horizontal(-1.0f);

        /* renamed from: o */
        public static final Horizontal f28832o = new BiasAlignment.Horizontal(0.0f);

        /* renamed from: p */
        public static final Horizontal f28833p = new BiasAlignment.Horizontal(1.0f);

        @Stable
        public static /* synthetic */ void getBottom$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopStart$annotations() {
        }

        @NotNull
        public final Vertical getBottom() {
            return f28830m;
        }

        @NotNull
        public final Alignment getBottomCenter() {
            return f28826i;
        }

        @NotNull
        public final Alignment getBottomEnd() {
            return f28827j;
        }

        @NotNull
        public final Alignment getBottomStart() {
            return f28825h;
        }

        @NotNull
        public final Alignment getCenter() {
            return f28823f;
        }

        @NotNull
        public final Alignment getCenterEnd() {
            return f28824g;
        }

        @NotNull
        public final Horizontal getCenterHorizontally() {
            return f28832o;
        }

        @NotNull
        public final Alignment getCenterStart() {
            return f28822e;
        }

        @NotNull
        public final Vertical getCenterVertically() {
            return f28829l;
        }

        @NotNull
        public final Horizontal getEnd() {
            return f28833p;
        }

        @NotNull
        public final Horizontal getStart() {
            return f28831n;
        }

        @NotNull
        public final Vertical getTop() {
            return f28828k;
        }

        @NotNull
        public final Alignment getTopCenter() {
            return f28820c;
        }

        @NotNull
        public final Alignment getTopEnd() {
            return f28821d;
        }

        @NotNull
        public final Alignment getTopStart() {
            return f28819b;
        }
    }

    @Stable
    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.Alignment$Horizontal */
    /* loaded from: classes2.dex */
    public interface Horizontal {
        int align(int i, int i2, @NotNull LayoutDirection layoutDirection);
    }

    @Stable
    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "align", "", "size", "space", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.Alignment$Vertical */
    /* loaded from: classes2.dex */
    public interface Vertical {
        int align(int i, int i2);
    }

    /* renamed from: align-KFBX0sM */
    long mo71407alignKFBX0sM(long j, long j2, @NotNull LayoutDirection layoutDirection);
}
