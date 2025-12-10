package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p003ui.layout.SubcomposeLayoutState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002E)B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010B\u001a\n ?*\u0004\u0018\u00010>0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "onRemembered", "onForgotten", "onAbandoned", "now", "nextFrame", "average", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JJJ)Z", "new", "current", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JJ)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "d", "Landroid/view/View;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$a;", "e", "Landroidx/compose/runtime/collection/MutableVector;", "prefetchRequests", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, "averagePrecomposeTimeNs", OperatorName.NON_STROKING_GRAY, "averagePremeasureTimeNs", OperatorName.CLOSE_PATH, "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "i", "Landroid/view/Choreographer;", "choreographer", OperatorName.SET_LINE_JOINSTYLE, "isActive", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,312:1\n1182#2:313\n1161#2,2:314\n523#3:316\n26#4,5:317\n26#4,5:322\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:313\n122#1:314,2\n159#1:316\n164#1:317,5\n183#1:322,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: k */
    public static long f13653k;

    /* renamed from: a */
    public final LazyLayoutPrefetchState f13654a;

    /* renamed from: b */
    public final SubcomposeLayoutState f13655b;

    /* renamed from: c */
    public final LazyLayoutItemContentFactory f13656c;

    /* renamed from: d */
    public final View f13657d;

    /* renamed from: e */
    public final MutableVector f13658e;

    /* renamed from: f */
    public long f13659f;

    /* renamed from: g */
    public long f13660g;

    /* renamed from: h */
    public boolean f13661h;

    /* renamed from: i */
    public final Choreographer f13662i;

    /* renamed from: j */
    public boolean f13663j;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;", "", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/view/View;)V", "", "frameIntervalNs", OperatorName.SET_LINE_CAPSTYLE, "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r6 >= 30.0f) goto L8;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m61196a(android.view.View r6) {
            /*
                r5 = this;
                long r0 = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$getFrameIntervalNs$cp()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L2c
                android.view.Display r0 = r6.getDisplay()
                boolean r6 = r6.isInEditMode()
                if (r6 != 0) goto L21
                if (r0 == 0) goto L21
                float r6 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r6 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r6
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$setFrameIntervalNs$cp(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.Companion.m61196a(android.view.View):void");
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher$a */
    /* loaded from: classes.dex */
    public static final class C2933a implements LazyLayoutPrefetchState.PrefetchHandle {

        /* renamed from: a */
        public final int f13664a;

        /* renamed from: b */
        public final long f13665b;

        /* renamed from: c */
        public SubcomposeLayoutState.PrecomposedSlotHandle f13666c;

        /* renamed from: d */
        public boolean f13667d;

        /* renamed from: e */
        public boolean f13668e;

        public /* synthetic */ C2933a(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j);
        }

        /* renamed from: a */
        public final boolean m61195a() {
            return this.f13667d;
        }

        /* renamed from: b */
        public final long m61194b() {
            return this.f13665b;
        }

        /* renamed from: c */
        public final int m61193c() {
            return this.f13664a;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (!this.f13667d) {
                this.f13667d = true;
                SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.f13666c;
                if (precomposedSlotHandle != null) {
                    precomposedSlotHandle.dispose();
                }
                this.f13666c = null;
            }
        }

        /* renamed from: d */
        public final boolean m61192d() {
            return this.f13668e;
        }

        /* renamed from: e */
        public final SubcomposeLayoutState.PrecomposedSlotHandle m61191e() {
            return this.f13666c;
        }

        /* renamed from: f */
        public final void m61190f(SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle) {
            this.f13666c = precomposedSlotHandle;
        }

        public C2933a(int i, long j) {
            this.f13664a = i;
            this.f13665b = j;
        }
    }

    public LazyLayoutPrefetcher(@NotNull LazyLayoutPrefetchState prefetchState, @NotNull SubcomposeLayoutState subcomposeLayoutState, @NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull View view) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f13654a = prefetchState;
        this.f13655b = subcomposeLayoutState;
        this.f13656c = itemContentFactory;
        this.f13657d = view;
        this.f13658e = new MutableVector(new C2933a[16], 0);
        this.f13662i = Choreographer.getInstance();
        Companion.m61196a(view);
    }

    /* renamed from: a */
    public final long m61198a(long j, long j2) {
        if (j2 != 0) {
            long j3 = 4;
            return (j / j3) + ((j2 / j3) * 3);
        }
        return j;
    }

    /* renamed from: b */
    public final boolean m61197b(long j, long j2, long j3) {
        return j > j2 || j + j3 < j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f13663j) {
            this.f13657d.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.f13663j = false;
        this.f13654a.setPrefetcher$foundation_release(null);
        this.f13657d.removeCallbacks(this);
        this.f13662i.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.f13654a.setPrefetcher$foundation_release(this);
        this.f13663j = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f13658e.isEmpty() && this.f13661h && this.f13663j && this.f13657d.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f13657d.getDrawingTime()) + f13653k;
            boolean z = false;
            while (this.f13658e.isNotEmpty() && !z) {
                C2933a c2933a = (C2933a) this.f13658e.getContent()[0];
                LazyLayoutItemProvider invoke = this.f13656c.getItemProvider().invoke();
                if (!c2933a.m61195a()) {
                    int itemCount = invoke.getItemCount();
                    int m61193c = c2933a.m61193c();
                    if (m61193c >= 0 && m61193c < itemCount) {
                        if (c2933a.m61191e() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                if (m61197b(nanoTime, nanos, this.f13659f)) {
                                    Object key = invoke.getKey(c2933a.m61193c());
                                    c2933a.m61190f(this.f13655b.precompose(key, this.f13656c.getContent(c2933a.m61193c(), key, invoke.getContentType(c2933a.m61193c()))));
                                    this.f13659f = m61198a(System.nanoTime() - nanoTime, this.f13659f);
                                } else {
                                    z = true;
                                }
                                Unit unit = Unit.INSTANCE;
                                Trace.endSection();
                            } finally {
                            }
                        } else if (!c2933a.m61192d()) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime2 = System.nanoTime();
                                if (m61197b(nanoTime2, nanos, this.f13660g)) {
                                    SubcomposeLayoutState.PrecomposedSlotHandle m61191e = c2933a.m61191e();
                                    Intrinsics.checkNotNull(m61191e);
                                    int placeablesCount = m61191e.getPlaceablesCount();
                                    for (int i = 0; i < placeablesCount; i++) {
                                        m61191e.mo72828premeasure0kLqBqw(i, c2933a.m61194b());
                                    }
                                    this.f13660g = m61198a(System.nanoTime() - nanoTime2, this.f13660g);
                                    this.f13658e.removeAt(0);
                                } else {
                                    Unit unit2 = Unit.INSTANCE;
                                    z = true;
                                }
                                Trace.endSection();
                            } finally {
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                this.f13658e.removeAt(0);
            }
            if (z) {
                this.f13662i.postFrameCallback(this);
                return;
            } else {
                this.f13661h = false;
                return;
            }
        }
        this.f13661h = false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.Prefetcher
    @NotNull
    /* renamed from: schedulePrefetch-0kLqBqw */
    public LazyLayoutPrefetchState.PrefetchHandle mo69644schedulePrefetch0kLqBqw(int i, long j) {
        C2933a c2933a = new C2933a(i, j, null);
        this.f13658e.add(c2933a);
        if (!this.f13661h) {
            this.f13661h = true;
            this.f13657d.post(this);
        }
        return c2933a;
    }
}
