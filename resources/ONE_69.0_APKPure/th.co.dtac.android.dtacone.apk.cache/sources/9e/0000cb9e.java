package io.grpc;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;

@Internal
/* loaded from: classes5.dex */
public final class InternalMethodDescriptor {

    /* renamed from: a */
    public final InternalKnownTransport f63315a;

    public InternalMethodDescriptor(InternalKnownTransport internalKnownTransport) {
        this.f63315a = (InternalKnownTransport) Preconditions.checkNotNull(internalKnownTransport, NotificationCompat.CATEGORY_TRANSPORT);
    }

    public Object geRawMethodName(MethodDescriptor<?, ?> methodDescriptor) {
        return methodDescriptor.m30697a(this.f63315a.ordinal());
    }

    public void setRawMethodName(MethodDescriptor<?, ?> methodDescriptor, Object obj) {
        methodDescriptor.m30696b(this.f63315a.ordinal(), obj);
    }
}