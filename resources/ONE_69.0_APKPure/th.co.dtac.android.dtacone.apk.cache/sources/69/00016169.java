package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.common.base.Preconditions;
import io.grpc.LoadBalancer;

/* renamed from: xj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC23078xj0 {
    /* renamed from: a */
    public static void m488a(LoadBalancer.PickDetailsConsumer pickDetailsConsumer, String str, String str2) {
        Preconditions.checkNotNull(str, Action.KEY_ATTRIBUTE);
        Preconditions.checkNotNull(str2, "value");
    }
}