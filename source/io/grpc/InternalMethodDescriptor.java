package io.grpc;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;

@Internal
/* loaded from: classes5.dex */
public final class InternalMethodDescriptor {

    /* renamed from: a */
    public final InternalKnownTransport f63252a;

    public InternalMethodDescriptor(InternalKnownTransport internalKnownTransport) {
        this.f63252a = (InternalKnownTransport) Preconditions.checkNotNull(internalKnownTransport, NotificationCompat.CATEGORY_TRANSPORT);
    }

    public Object geRawMethodName(MethodDescriptor<?, ?> methodDescriptor) {
        return methodDescriptor.m30357a(this.f63252a.ordinal());
    }

    public void setRawMethodName(MethodDescriptor<?, ?> methodDescriptor, Object obj) {
        methodDescriptor.m30356b(this.f63252a.ordinal(), obj);
    }
}
