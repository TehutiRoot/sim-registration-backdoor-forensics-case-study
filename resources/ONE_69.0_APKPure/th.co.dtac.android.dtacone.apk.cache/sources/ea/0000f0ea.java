package org.apache.http.client.methods;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.apache.http.HttpRequest;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;

/* loaded from: classes6.dex */
public abstract class AbstractExecutionAwareRequest extends AbstractHttpMessage implements HttpExecutionAware, AbortableHttpRequest, Cloneable, HttpRequest {

    /* renamed from: a */
    public final AtomicMarkableReference f73778a = new AtomicMarkableReference(null, false);

    /* renamed from: org.apache.http.client.methods.AbstractExecutionAwareRequest$a */
    /* loaded from: classes6.dex */
    public class C12559a implements Cancellable {

        /* renamed from: a */
        public final /* synthetic */ ClientConnectionRequest f73779a;

        public C12559a(ClientConnectionRequest clientConnectionRequest) {
            this.f73779a = clientConnectionRequest;
        }

        @Override // org.apache.http.concurrent.Cancellable
        public boolean cancel() {
            this.f73779a.abortRequest();
            return true;
        }
    }

    /* renamed from: org.apache.http.client.methods.AbstractExecutionAwareRequest$b */
    /* loaded from: classes6.dex */
    public class C12560b implements Cancellable {

        /* renamed from: a */
        public final /* synthetic */ ConnectionReleaseTrigger f73781a;

        public C12560b(ConnectionReleaseTrigger connectionReleaseTrigger) {
            this.f73781a = connectionReleaseTrigger;
        }

        @Override // org.apache.http.concurrent.Cancellable
        public boolean cancel() {
            try {
                this.f73781a.abortConnection();
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    public void abort() {
        while (!this.f73778a.isMarked()) {
            Cancellable cancellable = (Cancellable) this.f73778a.getReference();
            if (this.f73778a.compareAndSet(cancellable, cancellable, false, true) && cancellable != null) {
                cancellable.cancel();
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        AbstractExecutionAwareRequest abstractExecutionAwareRequest = (AbstractExecutionAwareRequest) super.clone();
        abstractExecutionAwareRequest.headergroup = (HeaderGroup) CloneUtils.cloneObject(this.headergroup);
        abstractExecutionAwareRequest.params = (HttpParams) CloneUtils.cloneObject(this.params);
        return abstractExecutionAwareRequest;
    }

    @Deprecated
    public void completed() {
        this.f73778a.set(null, false);
    }

    @Override // org.apache.http.client.methods.HttpExecutionAware
    public boolean isAborted() {
        return this.f73778a.isMarked();
    }

    public void reset() {
        boolean isMarked;
        Cancellable cancellable;
        do {
            isMarked = this.f73778a.isMarked();
            cancellable = (Cancellable) this.f73778a.getReference();
            if (cancellable != null) {
                cancellable.cancel();
            }
        } while (!this.f73778a.compareAndSet(cancellable, null, isMarked, false));
    }

    @Override // org.apache.http.client.methods.HttpExecutionAware
    public void setCancellable(Cancellable cancellable) {
        if (!this.f73778a.compareAndSet((Cancellable) this.f73778a.getReference(), cancellable, false, false)) {
            cancellable.cancel();
        }
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    @Deprecated
    public void setConnectionRequest(ClientConnectionRequest clientConnectionRequest) {
        setCancellable(new C12559a(clientConnectionRequest));
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    @Deprecated
    public void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger) {
        setCancellable(new C12560b(connectionReleaseTrigger));
    }
}