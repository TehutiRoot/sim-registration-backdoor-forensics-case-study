package android.content;

import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import coil.network.NetworkObserver;
import coil.util.Contexts;
import coil.util.Logger;
import coil.util.Logs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m29142d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcoil/network/NetworkObserver$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/util/Logger;", "logger", "Lcoil/network/NetworkObserver;", "NetworkObserver", "(Landroid/content/Context;Lcoil/network/NetworkObserver$Listener;Lcoil/util/Logger;)Lcoil/network/NetworkObserver;", "coil-base_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,112:1\n31#2:113\n21#3,4:114\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n*L\n26#1:113\n28#1:114,4\n*E\n"})
/* renamed from: coil.network.NetworkObserverKt  reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class Context {
    @NotNull
    public static final NetworkObserver NetworkObserver(@NotNull android.content.Context context, @NotNull NetworkObserver.Listener listener, @Nullable Logger logger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager != null && Contexts.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new RealNetworkObserver(connectivityManager, listener);
            } catch (Exception e) {
                if (logger != null) {
                    Logs.log(logger, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
                }
                return new EmptyNetworkObserver();
            }
        }
        if (logger != null && logger.getLevel() <= 5) {
            logger.log("NetworkObserver", 5, "Unable to register network observer.", null);
        }
        return new EmptyNetworkObserver();
    }
}