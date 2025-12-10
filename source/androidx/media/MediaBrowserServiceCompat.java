package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSessionManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.session.IMediaSession;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import androidx.media.MediaBrowserServiceCompatApi21;
import androidx.media.MediaBrowserServiceCompatApi23;
import androidx.media.MediaBrowserServiceCompatApi26;
import androidx.media.MediaSessionManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_MEDIA_ITEM = "media_item";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_SEARCH_RESULTS = "search_results";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_ERROR = -1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_OK = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";

    /* renamed from: f */
    public static final boolean f36023f = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a */
    public InterfaceC4754f f36024a;

    /* renamed from: c */
    public C4752e f36026c;

    /* renamed from: e */
    public MediaSessionCompat.Token f36028e;

    /* renamed from: b */
    public final ArrayMap f36025b = new ArrayMap();

    /* renamed from: d */
    public final HandlerC4777n f36027d = new HandlerC4777n();

    /* loaded from: classes2.dex */
    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a */
        public final String f36029a;

        /* renamed from: b */
        public final Bundle f36030b;

        public BrowserRoot(@NonNull String str, @Nullable Bundle bundle) {
            if (str != null) {
                this.f36029a = str;
                this.f36030b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle getExtras() {
            return this.f36030b;
        }

        public String getRootId() {
            return this.f36029a;
        }
    }

    /* loaded from: classes2.dex */
    public static class Result<T> {

        /* renamed from: a */
        public final Object f36031a;

        /* renamed from: b */
        public boolean f36032b;

        /* renamed from: c */
        public boolean f36033c;

        /* renamed from: d */
        public boolean f36034d;

        /* renamed from: e */
        public boolean f36035e;

        /* renamed from: f */
        public int f36036f;

        public Result(Object obj) {
            this.f36031a = obj;
        }

        /* renamed from: a */
        public final void m54011a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f = bundle.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        /* renamed from: b */
        public int m54010b() {
            return this.f36036f;
        }

        /* renamed from: c */
        public boolean m54009c() {
            if (!this.f36032b && !this.f36033c && !this.f36035e) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public void mo54004d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f36031a);
        }

        public void detach() {
            if (!this.f36032b) {
                if (!this.f36033c) {
                    if (!this.f36035e) {
                        this.f36032b = true;
                        return;
                    }
                    throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f36031a);
                }
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f36031a);
            }
            throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f36031a);
        }

        /* renamed from: e */
        public void mo54003e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f36031a);
        }

        /* renamed from: f */
        public void mo53990f(Object obj) {
        }

        /* renamed from: g */
        public void m54008g(int i) {
            this.f36036f = i;
        }

        public void sendError(Bundle bundle) {
            if (!this.f36033c && !this.f36035e) {
                this.f36035e = true;
                mo54004d(bundle);
                return;
            }
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f36031a);
        }

        public void sendProgressUpdate(Bundle bundle) {
            if (!this.f36033c && !this.f36035e) {
                m54011a(bundle);
                this.f36034d = true;
                mo54003e(bundle);
                return;
            }
            throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f36031a);
        }

        public void sendResult(T t) {
            if (!this.f36033c && !this.f36035e) {
                this.f36033c = true;
                mo53990f(t);
                return;
            }
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f36031a);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    /* loaded from: classes2.dex */
    public class C4748a extends Result {

        /* renamed from: g */
        public final /* synthetic */ C4752e f36037g;

        /* renamed from: h */
        public final /* synthetic */ String f36038h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f36039i;

        /* renamed from: j */
        public final /* synthetic */ Bundle f36040j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4748a(Object obj, C4752e c4752e, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f36037g = c4752e;
            this.f36038h = str;
            this.f36039i = bundle;
            this.f36040j = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53990f(List list) {
            if (MediaBrowserServiceCompat.this.f36025b.get(this.f36037g.f36053f.asBinder()) != this.f36037g) {
                if (MediaBrowserServiceCompat.f36023f) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    sb.append(this.f36037g.f36048a);
                    sb.append(" id=");
                    sb.append(this.f36038h);
                    return;
                }
                return;
            }
            if ((m54010b() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.m54018b(list, this.f36039i);
            }
            try {
                this.f36037g.f36053f.mo53978a(this.f36038h, list, this.f36039i, this.f36040j);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f36038h + " package=" + this.f36037g.f36048a);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    /* loaded from: classes2.dex */
    public class C4749b extends Result {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f36042g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4749b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f36042g = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53990f(MediaBrowserCompat.MediaItem mediaItem) {
            if ((m54010b() & 2) != 0) {
                this.f36042g.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
            this.f36042g.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    /* loaded from: classes2.dex */
    public class C4750c extends Result {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f36044g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4750c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f36044g = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53990f(List list) {
            if ((m54010b() & 4) == 0 && list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                this.f36044g.send(0, bundle);
                return;
            }
            this.f36044g.send(-1, null);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    /* loaded from: classes2.dex */
    public class C4751d extends Result {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f36046g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4751d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f36046g = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: d */
        public void mo54004d(Bundle bundle) {
            this.f36046g.send(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: e */
        public void mo54003e(Bundle bundle) {
            this.f36046g.send(1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53990f(Bundle bundle) {
            this.f36046g.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    /* loaded from: classes2.dex */
    public class C4752e implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f36048a;

        /* renamed from: b */
        public final int f36049b;

        /* renamed from: c */
        public final int f36050c;

        /* renamed from: d */
        public final MediaSessionManager.RemoteUserInfo f36051d;

        /* renamed from: e */
        public final Bundle f36052e;

        /* renamed from: f */
        public final InterfaceC4775l f36053f;

        /* renamed from: g */
        public final HashMap f36054g = new HashMap();

        /* renamed from: h */
        public BrowserRoot f36055h;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$e$a */
        /* loaded from: classes2.dex */
        public class RunnableC4753a implements Runnable {
            public RunnableC4753a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4752e c4752e = C4752e.this;
                MediaBrowserServiceCompat.this.f36025b.remove(c4752e.f36053f.asBinder());
            }
        }

        public C4752e(String str, int i, int i2, Bundle bundle, InterfaceC4775l interfaceC4775l) {
            this.f36048a = str;
            this.f36049b = i;
            this.f36050c = i2;
            this.f36051d = new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.f36052e = bundle;
            this.f36053f = interfaceC4775l;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f36027d.post(new RunnableC4753a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4754f {
        /* renamed from: a */
        MediaSessionManager.RemoteUserInfo mo53988a();

        /* renamed from: b */
        Bundle mo53992b();

        /* renamed from: c */
        IBinder mo54001c(Intent intent);

        /* renamed from: d */
        void mo54000d(String str, Bundle bundle);

        /* renamed from: e */
        void mo53999e(MediaSessionCompat.Token token);

        /* renamed from: f */
        void mo53998f(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle);

        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    /* loaded from: classes2.dex */
    public class C4755g implements InterfaceC4754f, MediaBrowserServiceCompatApi21.ServiceCompatProxy {

        /* renamed from: a */
        public final List f36058a = new ArrayList();

        /* renamed from: b */
        public Object f36059b;

        /* renamed from: c */
        public Messenger f36060c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$a */
        /* loaded from: classes2.dex */
        public class RunnableC4756a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f36062a;

            public RunnableC4756a(MediaSessionCompat.Token token) {
                this.f36062a = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!C4755g.this.f36058a.isEmpty()) {
                    IMediaSession extraBinder = this.f36062a.getExtraBinder();
                    if (extraBinder != null) {
                        for (Bundle bundle : C4755g.this.f36058a) {
                            BundleCompat.putBinder(bundle, MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder.asBinder());
                        }
                    }
                    C4755g.this.f36058a.clear();
                }
                MediaBrowserServiceCompatApi21.m53969e(C4755g.this.f36059b, this.f36062a.getToken());
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$b */
        /* loaded from: classes2.dex */
        public class C4757b extends Result {

            /* renamed from: g */
            public final /* synthetic */ MediaBrowserServiceCompatApi21.C4780c f36064g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4757b(Object obj, MediaBrowserServiceCompatApi21.C4780c c4780c) {
                super(obj);
                this.f36064g = c4780c;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
                this.f36064g.m53968a();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* renamed from: h */
            public void mo53990f(List list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Parcel obtain = Parcel.obtain();
                        ((MediaBrowserCompat.MediaItem) it.next()).writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f36064g.m53966c(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$c */
        /* loaded from: classes2.dex */
        public class RunnableC4758c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f36066a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f36067b;

            public RunnableC4758c(String str, Bundle bundle) {
                this.f36066a = str;
                this.f36067b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f36025b.keySet()) {
                    ArrayMap arrayMap = MediaBrowserServiceCompat.this.f36025b;
                    C4755g.this.m53995i((C4752e) arrayMap.get(iBinder), this.f36066a, this.f36067b);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$d */
        /* loaded from: classes2.dex */
        public class RunnableC4759d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionManager.RemoteUserInfo f36069a;

            /* renamed from: b */
            public final /* synthetic */ String f36070b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f36071c;

            public RunnableC4759d(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
                this.f36069a = remoteUserInfo;
                this.f36070b = str;
                this.f36071c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f36025b.size(); i++) {
                    C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.valueAt(i);
                    if (c4752e.f36051d.equals(this.f36069a)) {
                        C4755g.this.m53995i(c4752e, this.f36070b, this.f36071c);
                    }
                }
            }
        }

        public C4755g() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: a */
        public MediaSessionManager.RemoteUserInfo mo53988a() {
            C4752e c4752e = MediaBrowserServiceCompat.this.f36026c;
            if (c4752e != null) {
                return c4752e.f36051d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: b */
        public Bundle mo53992b() {
            if (this.f36060c == null) {
                return null;
            }
            C4752e c4752e = MediaBrowserServiceCompat.this.f36026c;
            if (c4752e != null) {
                if (c4752e.f36052e == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.f36026c.f36052e);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: c */
        public IBinder mo54001c(Intent intent) {
            return MediaBrowserServiceCompatApi21.m53971c(this.f36059b, intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: d */
        public void mo54000d(String str, Bundle bundle) {
            mo53991j(str, bundle);
            m53996h(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: e */
        public void mo53999e(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4756a(token));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: f */
        public void mo53998f(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
            m53997g(remoteUserInfo, str, bundle);
        }

        /* renamed from: g */
        public void m53997g(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f36027d.post(new RunnableC4759d(remoteUserInfo, str, bundle));
        }

        /* renamed from: h */
        public void m53996h(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f36027d.post(new RunnableC4758c(str, bundle));
        }

        /* renamed from: i */
        public void m53995i(C4752e c4752e, String str, Bundle bundle) {
            List<Pair> list = (List) c4752e.f36054g.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle) pair.second)) {
                        MediaBrowserServiceCompat.this.m54015e(str, c4752e, (Bundle) pair.second, bundle);
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo53991j(String str, Bundle bundle) {
            MediaBrowserServiceCompatApi21.m53972b(this.f36059b, str);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        public void onCreate() {
            Object m53973a = MediaBrowserServiceCompatApi21.m53973a(MediaBrowserServiceCompat.this, this);
            this.f36059b = m53973a;
            MediaBrowserServiceCompatApi21.m53970d(m53973a);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public MediaBrowserServiceCompatApi21.C4778a onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            IBinder asBinder;
            if (bundle != null && bundle.getInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 0) != 0) {
                bundle.remove(MediaBrowserProtocol.EXTRA_CLIENT_VERSION);
                this.f36060c = new Messenger(MediaBrowserServiceCompat.this.f36027d);
                bundle2 = new Bundle();
                bundle2.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
                BundleCompat.putBinder(bundle2, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER, this.f36060c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f36028e;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    if (extraBinder == null) {
                        asBinder = null;
                    } else {
                        asBinder = extraBinder.asBinder();
                    }
                    BundleCompat.putBinder(bundle2, MediaBrowserProtocol.EXTRA_SESSION_BINDER, asBinder);
                } else {
                    this.f36058a.add(bundle2);
                }
            } else {
                bundle2 = null;
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f36026c = new C4752e(str, -1, i, bundle, null);
            BrowserRoot onGetRoot = MediaBrowserServiceCompat.this.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat.this.f36026c = null;
            if (onGetRoot == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = onGetRoot.getExtras();
            } else if (onGetRoot.getExtras() != null) {
                bundle2.putAll(onGetRoot.getExtras());
            }
            return new MediaBrowserServiceCompatApi21.C4778a(onGetRoot.getRootId(), bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public void onLoadChildren(String str, MediaBrowserServiceCompatApi21.C4780c c4780c) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new C4757b(str, c4780c));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    /* loaded from: classes2.dex */
    public class C4760h extends C4755g implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        /* loaded from: classes2.dex */
        public class C4761a extends Result {

            /* renamed from: g */
            public final /* synthetic */ MediaBrowserServiceCompatApi21.C4780c f36074g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4761a(Object obj, MediaBrowserServiceCompatApi21.C4780c c4780c) {
                super(obj);
                this.f36074g = c4780c;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
                this.f36074g.m53968a();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* renamed from: h */
            public void mo53990f(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f36074g.m53966c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f36074g.m53966c(obtain);
            }
        }

        public C4760h() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4755g, androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        public void onCreate() {
            Object m53965a = MediaBrowserServiceCompatApi23.m53965a(MediaBrowserServiceCompat.this, this);
            this.f36059b = m53965a;
            MediaBrowserServiceCompatApi21.m53970d(m53965a);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy
        public void onLoadItem(String str, MediaBrowserServiceCompatApi21.C4780c c4780c) {
            MediaBrowserServiceCompat.this.onLoadItem(str, new C4761a(str, c4780c));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    /* loaded from: classes2.dex */
    public class C4762i extends C4760h implements MediaBrowserServiceCompatApi26.ServiceCompatProxy {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        /* loaded from: classes2.dex */
        public class C4763a extends Result {

            /* renamed from: g */
            public final /* synthetic */ MediaBrowserServiceCompatApi26.C4783b f36077g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4763a(Object obj, MediaBrowserServiceCompatApi26.C4783b c4783b) {
                super(obj);
                this.f36077g = c4783b;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
                this.f36077g.m53961a();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* renamed from: h */
            public void mo53990f(List list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Parcel obtain = Parcel.obtain();
                        ((MediaBrowserCompat.MediaItem) it.next()).writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f36077g.m53959c(arrayList, m54010b());
            }
        }

        public C4762i() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4755g, androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: b */
        public Bundle mo53992b() {
            C4752e c4752e = MediaBrowserServiceCompat.this.f36026c;
            if (c4752e != null) {
                if (c4752e.f36052e == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.f36026c.f36052e);
            }
            return MediaBrowserServiceCompatApi26.m53963b(this.f36059b);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4755g
        /* renamed from: j */
        public void mo53991j(String str, Bundle bundle) {
            if (bundle != null) {
                MediaBrowserServiceCompatApi26.m53962c(this.f36059b, str, bundle);
            } else {
                super.mo53991j(str, bundle);
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4760h, androidx.media.MediaBrowserServiceCompat.C4755g, androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        public void onCreate() {
            Object m53964a = MediaBrowserServiceCompatApi26.m53964a(MediaBrowserServiceCompat.this, this);
            this.f36059b = m53964a;
            MediaBrowserServiceCompatApi21.m53970d(m53964a);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy
        public void onLoadChildren(String str, MediaBrowserServiceCompatApi26.C4783b c4783b, Bundle bundle) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new C4763a(str, c4783b), bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    /* loaded from: classes2.dex */
    public class C4764j extends C4762i {
        public C4764j() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4755g, androidx.media.MediaBrowserServiceCompat.InterfaceC4754f
        /* renamed from: a */
        public MediaSessionManager.RemoteUserInfo mo53988a() {
            MediaSessionManager.RemoteUserInfo currentBrowserInfo;
            C4752e c4752e = MediaBrowserServiceCompat.this.f36026c;
            if (c4752e == null) {
                currentBrowserInfo = ((MediaBrowserService) this.f36059b).getCurrentBrowserInfo();
                return new MediaSessionManager.RemoteUserInfo(currentBrowserInfo);
            }
            return c4752e.f36051d;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    /* loaded from: classes2.dex */
    public class C4765k {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$a */
        /* loaded from: classes2.dex */
        public class RunnableC4766a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36081a;

            /* renamed from: b */
            public final /* synthetic */ String f36082b;

            /* renamed from: c */
            public final /* synthetic */ int f36083c;

            /* renamed from: d */
            public final /* synthetic */ int f36084d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f36085e;

            public RunnableC4766a(InterfaceC4775l interfaceC4775l, String str, int i, int i2, Bundle bundle) {
                this.f36081a = interfaceC4775l;
                this.f36082b = str;
                this.f36083c = i;
                this.f36084d = i2;
                this.f36085e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f36081a.asBinder();
                MediaBrowserServiceCompat.this.f36025b.remove(asBinder);
                C4752e c4752e = new C4752e(this.f36082b, this.f36083c, this.f36084d, this.f36085e, this.f36081a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f36026c = c4752e;
                BrowserRoot onGetRoot = mediaBrowserServiceCompat.onGetRoot(this.f36082b, this.f36084d, this.f36085e);
                c4752e.f36055h = onGetRoot;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f36026c = null;
                if (onGetRoot == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f36082b);
                    sb.append(" from service ");
                    sb.append(getClass().getName());
                    try {
                        this.f36081a.mo53977b();
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f36082b);
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.f36025b.put(asBinder, c4752e);
                    asBinder.linkToDeath(c4752e, 0);
                    if (MediaBrowserServiceCompat.this.f36028e != null) {
                        this.f36081a.mo53976c(c4752e.f36055h.getRootId(), MediaBrowserServiceCompat.this.f36028e, c4752e.f36055h.getExtras());
                    }
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f36082b);
                    MediaBrowserServiceCompat.this.f36025b.remove(asBinder);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$b */
        /* loaded from: classes2.dex */
        public class RunnableC4767b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36087a;

            public RunnableC4767b(InterfaceC4775l interfaceC4775l) {
                this.f36087a = interfaceC4775l;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.remove(this.f36087a.asBinder());
                if (c4752e != null) {
                    c4752e.f36053f.asBinder().unlinkToDeath(c4752e, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$c */
        /* loaded from: classes2.dex */
        public class RunnableC4768c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36089a;

            /* renamed from: b */
            public final /* synthetic */ String f36090b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f36091c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f36092d;

            public RunnableC4768c(InterfaceC4775l interfaceC4775l, String str, IBinder iBinder, Bundle bundle) {
                this.f36089a = interfaceC4775l;
                this.f36090b = str;
                this.f36091c = iBinder;
                this.f36092d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.get(this.f36089a.asBinder());
                if (c4752e == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f36090b);
                    return;
                }
                MediaBrowserServiceCompat.this.m54019a(this.f36090b, c4752e, this.f36091c, this.f36092d);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$d */
        /* loaded from: classes2.dex */
        public class RunnableC4769d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36094a;

            /* renamed from: b */
            public final /* synthetic */ String f36095b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f36096c;

            public RunnableC4769d(InterfaceC4775l interfaceC4775l, String str, IBinder iBinder) {
                this.f36094a = interfaceC4775l;
                this.f36095b = str;
                this.f36096c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.get(this.f36094a.asBinder());
                if (c4752e == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f36095b);
                } else if (!MediaBrowserServiceCompat.this.m54012h(this.f36095b, c4752e, this.f36096c)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f36095b + " which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$e */
        /* loaded from: classes2.dex */
        public class RunnableC4770e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36098a;

            /* renamed from: b */
            public final /* synthetic */ String f36099b;

            /* renamed from: c */
            public final /* synthetic */ ResultReceiver f36100c;

            public RunnableC4770e(InterfaceC4775l interfaceC4775l, String str, ResultReceiver resultReceiver) {
                this.f36098a = interfaceC4775l;
                this.f36099b = str;
                this.f36100c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.get(this.f36098a.asBinder());
                if (c4752e == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f36099b);
                    return;
                }
                MediaBrowserServiceCompat.this.m54014f(this.f36099b, c4752e, this.f36100c);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$f */
        /* loaded from: classes2.dex */
        public class RunnableC4771f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36102a;

            /* renamed from: b */
            public final /* synthetic */ String f36103b;

            /* renamed from: c */
            public final /* synthetic */ int f36104c;

            /* renamed from: d */
            public final /* synthetic */ int f36105d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f36106e;

            public RunnableC4771f(InterfaceC4775l interfaceC4775l, String str, int i, int i2, Bundle bundle) {
                this.f36102a = interfaceC4775l;
                this.f36103b = str;
                this.f36104c = i;
                this.f36105d = i2;
                this.f36106e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f36102a.asBinder();
                MediaBrowserServiceCompat.this.f36025b.remove(asBinder);
                C4752e c4752e = new C4752e(this.f36103b, this.f36104c, this.f36105d, this.f36106e, this.f36102a);
                MediaBrowserServiceCompat.this.f36025b.put(asBinder, c4752e);
                try {
                    asBinder.linkToDeath(c4752e, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$g */
        /* loaded from: classes2.dex */
        public class RunnableC4772g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36108a;

            public RunnableC4772g(InterfaceC4775l interfaceC4775l) {
                this.f36108a = interfaceC4775l;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f36108a.asBinder();
                C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.remove(asBinder);
                if (c4752e != null) {
                    asBinder.unlinkToDeath(c4752e, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$h */
        /* loaded from: classes2.dex */
        public class RunnableC4773h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36110a;

            /* renamed from: b */
            public final /* synthetic */ String f36111b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f36112c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f36113d;

            public RunnableC4773h(InterfaceC4775l interfaceC4775l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f36110a = interfaceC4775l;
                this.f36111b = str;
                this.f36112c = bundle;
                this.f36113d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.get(this.f36110a.asBinder());
                if (c4752e == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f36111b);
                    return;
                }
                MediaBrowserServiceCompat.this.m54013g(this.f36111b, this.f36112c, c4752e, this.f36113d);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$i */
        /* loaded from: classes2.dex */
        public class RunnableC4774i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4775l f36115a;

            /* renamed from: b */
            public final /* synthetic */ String f36116b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f36117c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f36118d;

            public RunnableC4774i(InterfaceC4775l interfaceC4775l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f36115a = interfaceC4775l;
                this.f36116b = str;
                this.f36117c = bundle;
                this.f36118d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4752e c4752e = (C4752e) MediaBrowserServiceCompat.this.f36025b.get(this.f36115a.asBinder());
                if (c4752e == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f36116b + ", extras=" + this.f36117c);
                    return;
                }
                MediaBrowserServiceCompat.this.m54016d(this.f36116b, this.f36117c, c4752e, this.f36118d);
            }
        }

        public C4765k() {
        }

        /* renamed from: a */
        public void m53987a(String str, IBinder iBinder, Bundle bundle, InterfaceC4775l interfaceC4775l) {
            MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4768c(interfaceC4775l, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void m53986b(String str, int i, int i2, Bundle bundle, InterfaceC4775l interfaceC4775l) {
            if (MediaBrowserServiceCompat.this.m54017c(str, i2)) {
                MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4766a(interfaceC4775l, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void m53985c(InterfaceC4775l interfaceC4775l) {
            MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4767b(interfaceC4775l));
        }

        /* renamed from: d */
        public void m53984d(String str, ResultReceiver resultReceiver, InterfaceC4775l interfaceC4775l) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4770e(interfaceC4775l, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void m53983e(InterfaceC4775l interfaceC4775l, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4771f(interfaceC4775l, str, i, i2, bundle));
        }

        /* renamed from: f */
        public void m53982f(String str, IBinder iBinder, InterfaceC4775l interfaceC4775l) {
            MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4769d(interfaceC4775l, str, iBinder));
        }

        /* renamed from: g */
        public void m53981g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC4775l interfaceC4775l) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4773h(interfaceC4775l, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void m53980h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC4775l interfaceC4775l) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4774i(interfaceC4775l, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void m53979i(InterfaceC4775l interfaceC4775l) {
            MediaBrowserServiceCompat.this.f36027d.m53974a(new RunnableC4772g(interfaceC4775l));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    /* loaded from: classes2.dex */
    public interface InterfaceC4775l {
        /* renamed from: a */
        void mo53978a(String str, List list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();

        /* renamed from: b */
        void mo53977b();

        /* renamed from: c */
        void mo53976c(String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    /* loaded from: classes2.dex */
    public static class C4776m implements InterfaceC4775l {

        /* renamed from: a */
        public final Messenger f36120a;

        public C4776m(Messenger messenger) {
            this.f36120a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4775l
        /* renamed from: a */
        public void mo53978a(String str, List list, Bundle bundle, Bundle bundle2) {
            ArrayList<? extends Parcelable> arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle3.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            bundle3.putBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS, bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList<>(list);
                }
                bundle3.putParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST, arrayList);
            }
            m53975d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4775l
        public IBinder asBinder() {
            return this.f36120a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4775l
        /* renamed from: b */
        public void mo53977b() {
            m53975d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4775l
        /* renamed from: c */
        public void mo53976c(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN, token);
            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
            m53975d(1, bundle2);
        }

        /* renamed from: d */
        public final void m53975d(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f36120a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    /* loaded from: classes2.dex */
    public final class HandlerC4777n extends Handler {

        /* renamed from: a */
        public final C4765k f36121a;

        public HandlerC4777n() {
            this.f36121a = new C4765k();
        }

        /* renamed from: a */
        public void m53974a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.f36121a.m53986b(data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(MediaBrowserProtocol.DATA_CALLING_PID), data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), bundle, new C4776m(message.replyTo));
                    return;
                case 2:
                    this.f36121a.m53985c(new C4776m(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f36121a.m53987a(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), BundleCompat.getBinder(data, MediaBrowserProtocol.DATA_CALLBACK_TOKEN), bundle2, new C4776m(message.replyTo));
                    return;
                case 4:
                    this.f36121a.m53982f(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), BundleCompat.getBinder(data, MediaBrowserProtocol.DATA_CALLBACK_TOKEN), new C4776m(message.replyTo));
                    return;
                case 5:
                    this.f36121a.m53984d(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new C4776m(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f36121a.m53983e(new C4776m(message.replyTo), data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(MediaBrowserProtocol.DATA_CALLING_PID), data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), bundle3);
                    return;
                case 7:
                    this.f36121a.m53979i(new C4776m(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS);
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f36121a.m53981g(data.getString(MediaBrowserProtocol.DATA_SEARCH_QUERY), bundle4, (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new C4776m(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS);
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f36121a.m53980h(data.getString(MediaBrowserProtocol.DATA_CUSTOM_ACTION), bundle5, (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new C4776m(message.replyTo));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(MediaBrowserProtocol.DATA_CALLING_UID, Binder.getCallingUid());
            data.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public void m54019a(String str, C4752e c4752e, IBinder iBinder, Bundle bundle) {
        List<Pair> list = (List) c4752e.f36054g.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (Pair pair : list) {
            if (iBinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle) pair.second)) {
                return;
            }
        }
        list.add(new Pair(iBinder, bundle));
        c4752e.f36054g.put(str, list);
        m54015e(str, c4752e, bundle, null);
        this.f36026c = c4752e;
        onSubscribe(str, bundle);
        this.f36026c = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: b */
    public List m54018b(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i >= 0 && i2 >= 1 && i3 < list.size()) {
            if (i4 > list.size()) {
                i4 = list.size();
            }
            return list.subList(i3, i4);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public boolean m54017c(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m54016d(String str, Bundle bundle, C4752e c4752e, ResultReceiver resultReceiver) {
        C4751d c4751d = new C4751d(str, resultReceiver);
        this.f36026c = c4752e;
        onCustomAction(str, bundle, c4751d);
        this.f36026c = null;
        if (c4751d.m54009c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public void m54015e(String str, C4752e c4752e, Bundle bundle, Bundle bundle2) {
        C4748a c4748a = new C4748a(str, c4752e, str, bundle, bundle2);
        this.f36026c = c4752e;
        if (bundle == null) {
            onLoadChildren(str, c4748a);
        } else {
            onLoadChildren(str, c4748a, bundle);
        }
        this.f36026c = null;
        if (c4748a.m54009c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c4752e.f36048a + " id=" + str);
    }

    /* renamed from: f */
    public void m54014f(String str, C4752e c4752e, ResultReceiver resultReceiver) {
        C4749b c4749b = new C4749b(str, resultReceiver);
        this.f36026c = c4752e;
        onLoadItem(str, c4749b);
        this.f36026c = null;
        if (c4749b.m54009c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    /* renamed from: g */
    public void m54013g(String str, Bundle bundle, C4752e c4752e, ResultReceiver resultReceiver) {
        C4750c c4750c = new C4750c(str, resultReceiver);
        this.f36026c = c4752e;
        onSearch(str, bundle, c4750c);
        this.f36026c = null;
        if (c4750c.m54009c()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    public final Bundle getBrowserRootHints() {
        return this.f36024a.mo53992b();
    }

    @NonNull
    public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        return this.f36024a.mo53988a();
    }

    @Nullable
    public MediaSessionCompat.Token getSessionToken() {
        return this.f36028e;
    }

    /* renamed from: h */
    public boolean m54012h(String str, C4752e c4752e, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                if (c4752e.f36054g.remove(str) != null) {
                    z = true;
                }
            } else {
                List list = (List) c4752e.f36054g.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((Pair) it.next()).first) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        c4752e.f36054g.remove(str);
                    }
                }
            }
            return z;
        } finally {
            this.f36026c = c4752e;
            onUnsubscribe(str);
            this.f36026c = null;
        }
    }

    public void notifyChildrenChanged(@NonNull String str) {
        if (str != null) {
            this.f36024a.mo54000d(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f36024a.mo54001c(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f36024a = new C4764j();
        } else if (i >= 26) {
            this.f36024a = new C4762i();
        } else if (i >= 23) {
            this.f36024a = new C4760h();
        } else {
            this.f36024a = new C4755g();
        }
        this.f36024a.onCreate();
    }

    public void onCustomAction(@NonNull String str, Bundle bundle, @NonNull Result<Bundle> result) {
        result.sendError(null);
    }

    @Nullable
    public abstract BrowserRoot onGetRoot(@NonNull String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@NonNull String str, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result);

    public void onLoadChildren(@NonNull String str, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result, @NonNull Bundle bundle) {
        result.m54008g(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, @NonNull Result<MediaBrowserCompat.MediaItem> result) {
        result.m54008g(2);
        result.sendResult(null);
    }

    public void onSearch(@NonNull String str, Bundle bundle, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result) {
        result.m54008g(4);
        result.sendResult(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onSubscribe(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnsubscribe(String str) {
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token != null) {
            if (this.f36028e == null) {
                this.f36028e = token;
                this.f36024a.mo53999e(token);
                return;
            }
            throw new IllegalStateException("The session token has already been set.");
        }
        throw new IllegalArgumentException("Session token may not be null.");
    }

    public void notifyChildrenChanged(@NonNull String str, @NonNull Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.f36024a.mo54000d(str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void notifyChildrenChanged(@NonNull MediaSessionManager.RemoteUserInfo remoteUserInfo, @NonNull String str, @NonNull Bundle bundle) {
        if (remoteUserInfo == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.f36024a.mo53998f(remoteUserInfo, str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
}
