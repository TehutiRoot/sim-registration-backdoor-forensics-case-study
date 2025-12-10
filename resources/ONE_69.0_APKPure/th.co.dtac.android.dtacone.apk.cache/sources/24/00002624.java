package androidx.compose.foundation.layout;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 f2\u00020\u0001:\u0001fB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010%\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u0017\u0010+\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u0010.\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018R\u0017\u00101\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010@\u001a\u0002088\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u0017\u0010C\u001a\u0002088\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R\u0017\u0010F\u001a\u0002028\u0006¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u00106R\u0017\u0010I\u001a\u0002028\u0006¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u00106R\u0017\u0010L\u001a\u0002028\u0006¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bK\u00106R\u0017\u0010O\u001a\u0002028\u0006¢\u0006\f\n\u0004\bM\u00104\u001a\u0004\bN\u00106R\u0017\u0010R\u001a\u0002028\u0006¢\u0006\f\n\u0004\bP\u00104\u001a\u0004\bQ\u00106R\u0017\u0010U\u001a\u0002028\u0006¢\u0006\f\n\u0004\bS\u00104\u001a\u0004\bT\u00106R\u0017\u0010X\u001a\u0002028\u0006¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\bW\u00106R\u0017\u0010^\u001a\u00020Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, m29142d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Landroidx/core/view/WindowInsetsCompat;", "insets", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "", "incrementAccessors", "(Landroid/view/View;)V", "decrementAccessors", "windowInsets", "", "types", "update", "(Landroidx/core/view/WindowInsetsCompat;I)V", "updateImeAnimationSource", "(Landroidx/core/view/WindowInsetsCompat;)V", "updateImeAnimationTarget", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBar", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDisplayCutout", "displayCutout", OperatorName.CURVE_TO, "getIme", "ime", "d", "getMandatorySystemGestures", "mandatorySystemGestures", "e", "getNavigationBars", "navigationBars", OperatorName.FILL_NON_ZERO, "getStatusBars", "statusBars", OperatorName.NON_STROKING_GRAY, "getSystemBars", "systemBars", OperatorName.CLOSE_PATH, "getSystemGestures", "systemGestures", "i", "getTappableElement", "tappableElement", "Landroidx/compose/foundation/layout/ValueInsets;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/foundation/layout/ValueInsets;", "getWaterfall", "()Landroidx/compose/foundation/layout/ValueInsets;", "waterfall", "Landroidx/compose/foundation/layout/WindowInsets;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeDrawing", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", OperatorName.LINE_TO, "getSafeGestures", "safeGestures", OperatorName.MOVE_TO, "getSafeContent", "safeContent", OperatorName.ENDPATH, "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", OperatorName.SAVE, "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", PDPageLabelRange.STYLE_ROMAN_LOWER, "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", OperatorName.CLOSE_AND_STROKE, "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "getConsumes", "()Z", "consumes", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "I", "accessCount", "Lbf0;", OperatorName.SET_LINE_WIDTH, "Lbf0;", "insetsListener", "Companion", "foundation-layout_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: x */
    public static final WeakHashMap f13371x = new WeakHashMap();

    /* renamed from: y */
    public static boolean f13372y;

    /* renamed from: a */
    public final AndroidWindowInsets f13373a;

    /* renamed from: b */
    public final AndroidWindowInsets f13374b;

    /* renamed from: c */
    public final AndroidWindowInsets f13375c;

    /* renamed from: d */
    public final AndroidWindowInsets f13376d;

    /* renamed from: e */
    public final AndroidWindowInsets f13377e;

    /* renamed from: f */
    public final AndroidWindowInsets f13378f;

    /* renamed from: g */
    public final AndroidWindowInsets f13379g;

    /* renamed from: h */
    public final AndroidWindowInsets f13380h;

    /* renamed from: i */
    public final AndroidWindowInsets f13381i;

    /* renamed from: j */
    public final ValueInsets f13382j;

    /* renamed from: k */
    public final WindowInsets f13383k;

    /* renamed from: l */
    public final WindowInsets f13384l;

    /* renamed from: m */
    public final WindowInsets f13385m;

    /* renamed from: n */
    public final ValueInsets f13386n;

    /* renamed from: o */
    public final ValueInsets f13387o;

    /* renamed from: p */
    public final ValueInsets f13388p;

    /* renamed from: q */
    public final ValueInsets f13389q;

    /* renamed from: r */
    public final ValueInsets f13390r;

    /* renamed from: s */
    public final ValueInsets f13391s;

    /* renamed from: t */
    public final ValueInsets f13392t;

    /* renamed from: u */
    public final boolean f13393u;

    /* renamed from: v */
    public int f13394v;

    /* renamed from: w */
    public final RunnableC19260bf0 f13395w;

    @Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0017\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m29142d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "<init>", "()V", "", "testInsets", "", "setUseTestInsets", "(Z)V", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/view/View;)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "", "type", "", "name", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/ValueInsets;", OperatorName.CURVE_TO, "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Landroidx/compose/foundation/layout/ValueInsets;", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WindowInsetsHolder m61274a(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.f13371x) {
                try {
                    WeakHashMap weakHashMap = WindowInsetsHolder.f13371x;
                    Object obj = weakHashMap.get(view);
                    if (obj == null) {
                        obj = new WindowInsetsHolder(null, view, null);
                        weakHashMap.put(view, obj);
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return windowInsetsHolder;
        }

        /* renamed from: b */
        public final AndroidWindowInsets m61273b(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i);
            }
            return androidWindowInsets;
        }

        /* renamed from: c */
        public final ValueInsets m61272c(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsetsIgnoringVisibility(i)) == null) {
                insets = Insets.NONE;
            }
            Intrinsics.checkNotNullExpressionValue(insets, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return WindowInsets_androidKt.ValueInsets(insets, str);
        }

        @Composable
        @NotNull
        public final WindowInsetsHolder current(@Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-1366542614);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            WindowInsetsHolder m61274a = m61274a(view);
            EffectsKt.DisposableEffect(m61274a, new WindowInsetsHolder$Companion$current$1(m61274a, view), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return m61274a;
        }

        public final void setUseTestInsets(boolean z) {
            WindowInsetsHolder.f13372y = z;
        }

        public Companion() {
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i);
    }

    public final void decrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f13394v - 1;
        this.f13394v = i;
        if (i == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.f13395w);
        }
    }

    @NotNull
    public final AndroidWindowInsets getCaptionBar() {
        return this.f13373a;
    }

    @NotNull
    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.f13386n;
    }

    public final boolean getConsumes() {
        return this.f13393u;
    }

    @NotNull
    public final AndroidWindowInsets getDisplayCutout() {
        return this.f13374b;
    }

    @NotNull
    public final AndroidWindowInsets getIme() {
        return this.f13375c;
    }

    @NotNull
    public final ValueInsets getImeAnimationSource() {
        return this.f13392t;
    }

    @NotNull
    public final ValueInsets getImeAnimationTarget() {
        return this.f13391s;
    }

    @NotNull
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.f13376d;
    }

    @NotNull
    public final AndroidWindowInsets getNavigationBars() {
        return this.f13377e;
    }

    @NotNull
    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.f13387o;
    }

    @NotNull
    public final WindowInsets getSafeContent() {
        return this.f13385m;
    }

    @NotNull
    public final WindowInsets getSafeDrawing() {
        return this.f13383k;
    }

    @NotNull
    public final WindowInsets getSafeGestures() {
        return this.f13384l;
    }

    @NotNull
    public final AndroidWindowInsets getStatusBars() {
        return this.f13378f;
    }

    @NotNull
    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.f13388p;
    }

    @NotNull
    public final AndroidWindowInsets getSystemBars() {
        return this.f13379g;
    }

    @NotNull
    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.f13389q;
    }

    @NotNull
    public final AndroidWindowInsets getSystemGestures() {
        return this.f13380h;
    }

    @NotNull
    public final AndroidWindowInsets getTappableElement() {
        return this.f13381i;
    }

    @NotNull
    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.f13390r;
    }

    @NotNull
    public final ValueInsets getWaterfall() {
        return this.f13382j;
    }

    public final void incrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f13394v == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.f13395w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f13395w);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.f13395w);
        }
        this.f13394v++;
    }

    public final void update(@NotNull WindowInsetsCompat windowInsets, int i) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (f13372y) {
            android.view.WindowInsets windowInsets2 = windowInsets.toWindowInsets();
            Intrinsics.checkNotNull(windowInsets2);
            windowInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsets2);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.f13373a.update$foundation_layout_release(windowInsets, i);
        this.f13375c.update$foundation_layout_release(windowInsets, i);
        this.f13374b.update$foundation_layout_release(windowInsets, i);
        this.f13377e.update$foundation_layout_release(windowInsets, i);
        this.f13378f.update$foundation_layout_release(windowInsets, i);
        this.f13379g.update$foundation_layout_release(windowInsets, i);
        this.f13380h.update$foundation_layout_release(windowInsets, i);
        this.f13381i.update$foundation_layout_release(windowInsets, i);
        this.f13376d.update$foundation_layout_release(windowInsets, i);
        if (i == 0) {
            ValueInsets valueInsets = this.f13386n;
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "insets.getInsetsIgnoring…aptionBar()\n            )");
            valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility));
            ValueInsets valueInsets2 = this.f13387o;
            Insets insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility2, "insets.getInsetsIgnoring…ationBars()\n            )");
            valueInsets2.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility2));
            ValueInsets valueInsets3 = this.f13388p;
            Insets insetsIgnoringVisibility3 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            valueInsets3.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility3));
            ValueInsets valueInsets4 = this.f13389q;
            Insets insetsIgnoringVisibility4 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            valueInsets4.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility4));
            ValueInsets valueInsets5 = this.f13390r;
            Insets insetsIgnoringVisibility5 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility5, "insets.getInsetsIgnoring…leElement()\n            )");
            valueInsets5.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility5));
            DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                Intrinsics.checkNotNullExpressionValue(waterfallInsets, "cutout.waterfallInsets");
                this.f13382j.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(waterfallInsets));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(@NotNull WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        ValueInsets valueInsets = this.f13392t;
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }

    public final void updateImeAnimationTarget(@NotNull WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        ValueInsets valueInsets = this.f13391s;
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }

    public WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        DisplayCutoutCompat displayCutout;
        Companion companion = Companion;
        this.f13373a = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets m61273b = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.f13374b = m61273b;
        AndroidWindowInsets m61273b2 = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.f13375c = m61273b2;
        AndroidWindowInsets m61273b3 = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.f13376d = m61273b3;
        this.f13377e = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.f13378f = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets m61273b4 = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.f13379g = m61273b4;
        AndroidWindowInsets m61273b5 = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.f13380h = m61273b5;
        AndroidWindowInsets m61273b6 = companion.m61273b(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.f13381i = m61273b6;
        Insets insets = (windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (insets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : insets;
        Intrinsics.checkNotNullExpressionValue(insets, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets(insets, "waterfall");
        this.f13382j = ValueInsets;
        WindowInsets union = WindowInsetsKt.union(WindowInsetsKt.union(m61273b4, m61273b2), m61273b);
        this.f13383k = union;
        WindowInsets union2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(m61273b6, m61273b3), m61273b5), ValueInsets);
        this.f13384l = union2;
        this.f13385m = WindowInsetsKt.union(union, union2);
        this.f13386n = companion.m61272c(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.f13387o = companion.m61272c(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.f13388p = companion.m61272c(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.f13389q = companion.m61272c(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.f13390r = companion.m61272c(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.f13391s = companion.m61272c(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.f13392t = companion.m61272c(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.p003ui.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? tag : null;
        this.f13393u = bool != null ? bool.booleanValue() : true;
        this.f13395w = new RunnableC19260bf0(this);
    }
}