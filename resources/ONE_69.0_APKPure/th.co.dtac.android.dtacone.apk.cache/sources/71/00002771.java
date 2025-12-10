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
@Metadata(m29143d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002E)B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010B\u001a\n ?*\u0004\u0018\u00010>0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, m29142d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "onRemembered", "onForgotten", "onAbandoned", "now", "nextFrame", "average", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JJJ)Z", "new", "current", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JJ)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "d", "Landroid/view/View;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$a;", "e", "Landroidx/compose/runtime/collection/MutableVector;", "prefetchRequests", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, "averagePrecomposeTimeNs", OperatorName.NON_STROKING_GRAY, "averagePremeasureTimeNs", OperatorName.CLOSE_PATH, "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "i", "Landroid/view/Choreographer;", "choreographer", OperatorName.SET_LINE_JOINSTYLE, "isActive", "Companion", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,312:1\n1182#2:313\n1161#2,2:314\n523#3:316\n26#4,5:317\n26#4,5:322\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:313\n122#1:314,2\n159#1:316\n164#1:317,5\n183#1:322,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: k */
    public static long f13741k;

    /* renamed from: a */
    public final LazyLayoutPrefetchState f13742a;

    /* renamed from: b */
    public final SubcomposeLayoutState f13743b;

    /* renamed from: c */
    public final LazyLayoutItemContentFactory f13744c;

    /* renamed from: d */
    public final View f13745d;

    /* renamed from: e */
    public final MutableVector f13746e;

    /* renamed from: f */
    public long f13747f;

    /* renamed from: g */
    public long f13748g;

    /* renamed from: h */
    public boolean f13749h;

    /* renamed from: i */
    public final Choreographer f13750i;

    /* renamed from: j */
    public boolean f13751j;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m29142d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;", "", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/view/View;)V", "", "frameIntervalNs", OperatorName.SET_LINE_CAPSTYLE, "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
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
        public final void m61146a(android.view.View r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.Companion.m61146a(android.view.View):void");
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher$a */
    /* loaded from: classes.dex */
    public static final class C2915a implements LazyLayoutPrefetchState.PrefetchHandle {

        /* renamed from: a */
        public final int f13752a;

        /* renamed from: b */
        public final long f13753b;

        /* renamed from: c */
        public SubcomposeLayoutState.PrecomposedSlotHandle f13754c;

        /* renamed from: d */
        public boolean f13755d;

        /* renamed from: e */
        public boolean f13756e;

        public /* synthetic */ C2915a(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j);
        }

        /* renamed from: a */
        public final boolean m61145a() {
            return this.f13755d;
        }

        /* renamed from: b */
        public final long m61144b() {
            return this.f13753b;
        }

        /* renamed from: c */
        public final int m61143c() {
            return this.f13752a;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (!this.f13755d) {
                this.f13755d = true;
                SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.f13754c;
                if (precomposedSlotHandle != null) {
                    precomposedSlotHandle.dispose();
                }
                this.f13754c = null;
            }
        }

        /* renamed from: d */
        public final boolean m61142d() {
            return this.f13756e;
        }

        /* renamed from: e */
        public final SubcomposeLayoutState.PrecomposedSlotHandle m61141e() {
            return this.f13754c;
        }

        /* renamed from: f */
        public final void m61140f(SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle) {
            this.f13754c = precomposedSlotHandle;
        }

        public C2915a(int i, long j) {
            this.f13752a = i;
            this.f13753b = j;
        }
    }

    public LazyLayoutPrefetcher(@NotNull LazyLayoutPrefetchState prefetchState, @NotNull SubcomposeLayoutState subcomposeLayoutState, @NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull View view) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f13742a = prefetchState;
        this.f13743b = subcomposeLayoutState;
        this.f13744c = itemContentFactory;
        this.f13745d = view;
        this.f13746e = new MutableVector(new C2915a[16], 0);
        this.f13750i = Choreographer.getInstance();
        Companion.m61146a(view);
    }

    /* renamed from: a */
    public final long m61148a(long j, long j2) {
        if (j2 != 0) {
            long j3 = 4;
            return (j / j3) + ((j2 / j3) * 3);
        }
        return j;
    }

    /* renamed from: b */
    public final boolean m61147b(long j, long j2, long j3) {
        return j > j2 || j + j3 < j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f13751j) {
            this.f13745d.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.f13751j = false;
        this.f13742a.setPrefetcher$foundation_release(null);
        this.f13745d.removeCallbacks(this);
        this.f13750i.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.f13742a.setPrefetcher$foundation_release(this);
        this.f13751j = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f13746e.isEmpty() && this.f13749h && this.f13751j && this.f13745d.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f13745d.getDrawingTime()) + f13741k;
            boolean z = false;
            while (this.f13746e.isNotEmpty() && !z) {
                C2915a c2915a = (C2915a) this.f13746e.getContent()[0];
                LazyLayoutItemProvider invoke = this.f13744c.getItemProvider().invoke();
                if (!c2915a.m61145a()) {
                    int itemCount = invoke.getItemCount();
                    int m61143c = c2915a.m61143c();
                    if (m61143c >= 0 && m61143c < itemCount) {
                        if (c2915a.m61141e() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                if (m61147b(nanoTime, nanos, this.f13747f)) {
                                    Object key = invoke.getKey(c2915a.m61143c());
                                    c2915a.m61140f(this.f13743b.precompose(key, this.f13744c.getContent(c2915a.m61143c(), key, invoke.getContentType(c2915a.m61143c()))));
                                    this.f13747f = m61148a(System.nanoTime() - nanoTime, this.f13747f);
                                } else {
                                    z = true;
                                }
                                Unit unit = Unit.INSTANCE;
                                Trace.endSection();
                            } finally {
                            }
                        } else if (!c2915a.m61142d()) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime2 = System.nanoTime();
                                if (m61147b(nanoTime2, nanos, this.f13748g)) {
                                    SubcomposeLayoutState.PrecomposedSlotHandle m61141e = c2915a.m61141e();
                                    Intrinsics.checkNotNull(m61141e);
                                    int placeablesCount = m61141e.getPlaceablesCount();
                                    for (int i = 0; i < placeablesCount; i++) {
                                        m61141e.mo73012premeasure0kLqBqw(i, c2915a.m61144b());
                                    }
                                    this.f13748g = m61148a(System.nanoTime() - nanoTime2, this.f13748g);
                                    this.f13746e.removeAt(0);
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
                this.f13746e.removeAt(0);
            }
            if (z) {
                this.f13750i.postFrameCallback(this);
                return;
            } else {
                this.f13749h = false;
                return;
            }
        }
        this.f13749h = false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.Prefetcher
    @NotNull
    /* renamed from: schedulePrefetch-0kLqBqw */
    public LazyLayoutPrefetchState.PrefetchHandle mo69828schedulePrefetch0kLqBqw(int i, long j) {
        C2915a c2915a = new C2915a(i, j, null);
        this.f13746e.add(c2915a);
        if (!this.f13749h) {
            this.f13749h = true;
            this.f13745d.post(this);
        }
        return c2915a;
    }
}