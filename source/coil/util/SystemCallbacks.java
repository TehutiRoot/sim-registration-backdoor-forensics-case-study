package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.VisibleForTesting;
import ch.qos.logback.core.CoreConstants;
import coil.RealImageLoader;
import coil.network.EmptyNetworkObserver;
import coil.network.NetworkObserver;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00030\u00030\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010/R\u0011\u00100\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b0\u0010/¨\u00062"}, m28850d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/NetworkObserver$Listener;", "Lcoil/RealImageLoader;", "imageLoader", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isNetworkObserverEnabled", "<init>", "(Lcoil/RealImageLoader;Landroid/content/Context;Z)V", "", "register", "()V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "isOnline", "onConnectivityChange", "(Z)V", "shutdown", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/ref/WeakReference;", "getImageLoader$coil_base_release", "()Ljava/lang/ref/WeakReference;", "getImageLoader$coil_base_release$annotations", "Lcoil/network/NetworkObserver;", OperatorName.CURVE_TO, "Lcoil/network/NetworkObserver;", "networkObserver", "d", "Z", "_isOnline", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isShutdown", "()Z", "isShutdown", "Companion", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSystemCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n+ 2 Logs.kt\ncoil/util/-Logs\n*L\n1#1,78:1\n69#1:79\n70#1:84\n69#1:85\n70#1:90\n21#2,4:80\n21#2,4:86\n*S KotlinDebug\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n*L\n50#1:79\n50#1:84\n57#1:85\n57#1:90\n51#1:80,4\n58#1:86,4\n*E\n"})
/* loaded from: classes3.dex */
public final class SystemCallbacks implements ComponentCallbacks2, NetworkObserver.Listener {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Context f40871a;

    /* renamed from: b */
    public final WeakReference f40872b;

    /* renamed from: c */
    public final NetworkObserver f40873c;

    /* renamed from: d */
    public volatile boolean f40874d;

    /* renamed from: e */
    public final AtomicBoolean f40875e;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Lcoil/util/SystemCallbacks$Companion;", "", "()V", "OFFLINE", "", "ONLINE", "TAG", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SystemCallbacks(@NotNull RealImageLoader realImageLoader, @NotNull Context context, boolean z) {
        NetworkObserver emptyNetworkObserver;
        this.f40871a = context;
        this.f40872b = new WeakReference(realImageLoader);
        if (z) {
            emptyNetworkObserver = android.content.Context.NetworkObserver(context, this, realImageLoader.getLogger());
        } else {
            emptyNetworkObserver = new EmptyNetworkObserver();
        }
        this.f40873c = emptyNetworkObserver;
        this.f40874d = emptyNetworkObserver.isOnline();
        this.f40875e = new AtomicBoolean(false);
    }

    @VisibleForTesting
    public static /* synthetic */ void getImageLoader$coil_base_release$annotations() {
    }

    @NotNull
    public final WeakReference<RealImageLoader> getImageLoader$coil_base_release() {
        return this.f40872b;
    }

    public final boolean isOnline() {
        return this.f40874d;
    }

    public final boolean isShutdown() {
        return this.f40875e.get();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        if (((RealImageLoader) this.f40872b.get()) == null) {
            shutdown();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // coil.network.NetworkObserver.Listener
    public void onConnectivityChange(boolean z) {
        String str;
        RealImageLoader realImageLoader = (RealImageLoader) this.f40872b.get();
        Unit unit = null;
        if (realImageLoader != null) {
            Logger logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 4) {
                if (z) {
                    str = "ONLINE";
                } else {
                    str = "OFFLINE";
                }
                logger.log("NetworkObserver", 4, str, null);
            }
            this.f40874d = z;
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            shutdown();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        RealImageLoader realImageLoader = (RealImageLoader) this.f40872b.get();
        Unit unit = null;
        if (realImageLoader != null) {
            Logger logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 2) {
                logger.log("NetworkObserver", 2, "trimMemory, level=" + i, null);
            }
            realImageLoader.onTrimMemory$coil_base_release(i);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            shutdown();
        }
    }

    public final void register() {
        this.f40871a.registerComponentCallbacks(this);
    }

    public final void shutdown() {
        if (this.f40875e.getAndSet(true)) {
            return;
        }
        this.f40871a.unregisterComponentCallbacks(this);
        this.f40873c.shutdown();
    }
}
