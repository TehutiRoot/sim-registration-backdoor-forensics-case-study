package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.C2694a;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.view.a */
/* loaded from: classes.dex */
public final class C2694a implements Observable.Observer {

    /* renamed from: a */
    public final CameraInfoInternal f12189a;

    /* renamed from: b */
    public final MutableLiveData f12190b;

    /* renamed from: c */
    public PreviewView.StreamState f12191c;

    /* renamed from: d */
    public final AbstractC2699c f12192d;

    /* renamed from: e */
    public ListenableFuture f12193e;

    /* renamed from: f */
    public boolean f12194f = false;

    /* renamed from: androidx.camera.view.a$a */
    /* loaded from: classes.dex */
    public class C2695a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ List f12195a;

        /* renamed from: b */
        public final /* synthetic */ CameraInfo f12196b;

        public C2695a(List list, CameraInfo cameraInfo) {
            C2694a.this = r1;
            this.f12195a = list;
            this.f12196b = cameraInfo;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r2) {
            C2694a.this.f12193e = null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            C2694a.this.f12193e = null;
            if (!this.f12195a.isEmpty()) {
                for (CameraCaptureCallback cameraCaptureCallback : this.f12195a) {
                    ((CameraInfoInternal) this.f12196b).removeSessionCaptureCallback(cameraCaptureCallback);
                }
                this.f12195a.clear();
            }
        }
    }

    /* renamed from: androidx.camera.view.a$b */
    /* loaded from: classes.dex */
    public class C2696b extends CameraCaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f12198a;

        /* renamed from: b */
        public final /* synthetic */ CameraInfo f12199b;

        public C2696b(CallbackToFutureAdapter.Completer completer, CameraInfo cameraInfo) {
            C2694a.this = r1;
            this.f12198a = completer;
            this.f12199b = cameraInfo;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            this.f12198a.set(null);
            ((CameraInfoInternal) this.f12199b).removeSessionCaptureCallback(this);
        }
    }

    public C2694a(CameraInfoInternal cameraInfoInternal, MutableLiveData mutableLiveData, AbstractC2699c abstractC2699c) {
        this.f12189a = cameraInfoInternal;
        this.f12190b = mutableLiveData;
        this.f12192d = abstractC2699c;
        synchronized (this) {
            this.f12191c = (PreviewView.StreamState) mutableLiveData.getValue();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m61863a(C2694a c2694a, CameraInfo cameraInfo, List list, CallbackToFutureAdapter.Completer completer) {
        return c2694a.m61856h(cameraInfo, list, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ ListenableFuture m61862b(C2694a c2694a, Void r1) {
        return c2694a.m61858f(r1);
    }

    /* renamed from: c */
    public static /* synthetic */ Void m61861c(C2694a c2694a, Void r1) {
        return c2694a.m61857g(r1);
    }

    /* renamed from: d */
    public final void m61860d() {
        ListenableFuture listenableFuture = this.f12193e;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.f12193e = null;
        }
    }

    /* renamed from: e */
    public void m61859e() {
        m61860d();
    }

    /* renamed from: f */
    public final /* synthetic */ ListenableFuture m61858f(Void r1) {
        return this.f12192d.mo61807j();
    }

    /* renamed from: g */
    public final /* synthetic */ Void m61857g(Void r1) {
        m61853k(PreviewView.StreamState.STREAMING);
        return null;
    }

    /* renamed from: h */
    public final /* synthetic */ Object m61856h(CameraInfo cameraInfo, List list, CallbackToFutureAdapter.Completer completer) {
        C2696b c2696b = new C2696b(completer, cameraInfo);
        list.add(c2696b);
        ((CameraInfoInternal) cameraInfo).addSessionCaptureCallback(CameraXExecutors.directExecutor(), c2696b);
        return "waitForCaptureResult";
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    /* renamed from: i */
    public void onNewData(CameraInternal.State state) {
        if (state != CameraInternal.State.CLOSING && state != CameraInternal.State.CLOSED && state != CameraInternal.State.RELEASING && state != CameraInternal.State.RELEASED) {
            if ((state == CameraInternal.State.OPENING || state == CameraInternal.State.OPEN || state == CameraInternal.State.PENDING_OPEN) && !this.f12194f) {
                m61854j(this.f12189a);
                this.f12194f = true;
                return;
            }
            return;
        }
        m61853k(PreviewView.StreamState.IDLE);
        if (this.f12194f) {
            this.f12194f = false;
            m61860d();
        }
    }

    /* renamed from: j */
    public final void m61854j(CameraInfo cameraInfo) {
        m61853k(PreviewView.StreamState.IDLE);
        ArrayList arrayList = new ArrayList();
        FutureChain transform = FutureChain.from(m61852l(cameraInfo, arrayList)).transformAsync(new AsyncFunction() { // from class: wn1
            {
                C2694a.this = this;
            }

            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return C2694a.m61862b(C2694a.this, (Void) obj);
            }
        }, CameraXExecutors.directExecutor()).transform(new Function() { // from class: xn1
            {
                C2694a.this = this;
            }

            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return C2694a.m61861c(C2694a.this, (Void) obj);
            }
        }, CameraXExecutors.directExecutor());
        this.f12193e = transform;
        Futures.addCallback(transform, new C2695a(arrayList, cameraInfo), CameraXExecutors.directExecutor());
    }

    /* renamed from: k */
    public void m61853k(PreviewView.StreamState streamState) {
        synchronized (this) {
            try {
                if (this.f12191c.equals(streamState)) {
                    return;
                }
                this.f12191c = streamState;
                Logger.m63230d("StreamStateObserver", "Update Preview stream state to " + streamState);
                this.f12190b.postValue(streamState);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final ListenableFuture m61852l(final CameraInfo cameraInfo, final List list) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: yn1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2694a.m61863a(C2694a.this, cameraInfo, list, completer);
            }
        });
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public void onError(Throwable th2) {
        m61859e();
        m61853k(PreviewView.StreamState.IDLE);
    }
}
