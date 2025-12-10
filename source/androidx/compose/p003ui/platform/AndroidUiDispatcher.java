package androidx.compose.p003ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.p005os.HandlerCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00017\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00108R\u0017\u0010>\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=¨\u0006@"}, m28850d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "", "postFrameCallback$ui_release", "(Landroid/view/Choreographer$FrameCallback;)V", "postFrameCallback", "removeFrameCallback$ui_release", "removeFrameCallback", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "d", "()Ljava/lang/Runnable;", OperatorName.SET_LINE_JOINSTYLE, "()V", "", "frameTimeNanos", "i", "(J)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/os/Handler;", "", OperatorName.CURVE_TO, "Ljava/lang/Object;", "lock", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "toRunTrampolined", "", "e", "Ljava/util/List;", "toRunOnFrame", OperatorName.FILL_NON_ZERO, "spareToRunOnFrame", "", OperatorName.NON_STROKING_GRAY, "Z", "scheduledTrampolineDispatch", OperatorName.CLOSE_PATH, "scheduledFrameDispatch", "androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;", "dispatchCallback", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n34#2:193\n34#2:194\n34#2:195\n34#2:196\n34#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher */
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* renamed from: a */
    public final Choreographer f30615a;

    /* renamed from: b */
    public final Handler f30616b;

    /* renamed from: c */
    public final Object f30617c;

    /* renamed from: d */
    public final ArrayDeque f30618d;

    /* renamed from: e */
    public List f30619e;

    /* renamed from: f */
    public List f30620f;

    /* renamed from: g */
    public boolean f30621g;

    /* renamed from: h */
    public boolean f30622h;

    /* renamed from: i */
    public final AndroidUiDispatcher$dispatchCallback$1 f30623i;

    /* renamed from: j */
    public final MonotonicFrameClock f30624j;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: k */
    public static final Lazy f30613k = LazyKt__LazyJVMKt.lazy(AndroidUiDispatcher$Companion$Main$2.INSTANCE);

    /* renamed from: l */
    public static final ThreadLocal f30614l = new ThreadLocal<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler createAsync = HandlerCompat.createAsync(myLooper);
                Intrinsics.checkNotNullExpressionValue(createAsync, "createAsync(\n           …d\")\n                    )");
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, createAsync, null);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    };

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "()V", "CurrentThread", "Lkotlin/coroutines/CoroutineContext;", "getCurrentThread", "()Lkotlin/coroutines/CoroutineContext;", "Main", "getMain", "Main$delegate", "Lkotlin/Lazy;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext getCurrentThread() {
            boolean m59234a;
            m59234a = AndroidUiDispatcher_androidKt.m59234a();
            if (m59234a) {
                return getMain();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.f30614l.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        @NotNull
        public final CoroutineContext getMain() {
            return (CoroutineContext) AndroidUiDispatcher.f30613k.getValue();
        }

        public Companion() {
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    /* renamed from: d */
    public final Runnable m59237d() {
        Runnable runnable;
        synchronized (this.f30617c) {
            runnable = (Runnable) this.f30618d.removeFirstOrNull();
        }
        return runnable;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f30617c) {
            try {
                this.f30618d.addLast(block);
                if (!this.f30621g) {
                    this.f30621g = true;
                    this.f30616b.post(this.f30623i);
                    if (!this.f30622h) {
                        this.f30622h = true;
                        this.f30615a.postFrameCallback(this.f30623i);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final Choreographer getChoreographer() {
        return this.f30615a;
    }

    @NotNull
    public final MonotonicFrameClock getFrameClock() {
        return this.f30624j;
    }

    /* renamed from: i */
    public final void m59236i(long j) {
        synchronized (this.f30617c) {
            if (!this.f30622h) {
                return;
            }
            this.f30622h = false;
            List list = this.f30619e;
            this.f30619e = this.f30620f;
            this.f30620f = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
            }
            list.clear();
        }
    }

    /* renamed from: j */
    public final void m59235j() {
        boolean z;
        do {
            Runnable m59237d = m59237d();
            while (m59237d != null) {
                m59237d.run();
                m59237d = m59237d();
            }
            synchronized (this.f30617c) {
                if (this.f30618d.isEmpty()) {
                    z = false;
                    this.f30621g = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final void postFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f30617c) {
            try {
                this.f30619e.add(callback);
                if (!this.f30622h) {
                    this.f30622h = true;
                    this.f30615a.postFrameCallback(this.f30623i);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f30617c) {
            this.f30619e.remove(callback);
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f30615a = choreographer;
        this.f30616b = handler;
        this.f30617c = new Object();
        this.f30618d = new ArrayDeque();
        this.f30619e = new ArrayList();
        this.f30620f = new ArrayList();
        this.f30623i = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.f30624j = new AndroidUiFrameClock(choreographer, this);
    }
}
