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
    public static final boolean f36111f = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a */
    public InterfaceC4736f f36112a;

    /* renamed from: c */
    public C4734e f36114c;

    /* renamed from: e */
    public MediaSessionCompat.Token f36116e;

    /* renamed from: b */
    public final ArrayMap f36113b = new ArrayMap();

    /* renamed from: d */
    public final HandlerC4759n f36115d = new HandlerC4759n();

    /* loaded from: classes2.dex */
    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a */
        public final String f36117a;

        /* renamed from: b */
        public final Bundle f36118b;

        public BrowserRoot(@NonNull String str, @Nullable Bundle bundle) {
            if (str != null) {
                this.f36117a = str;
                this.f36118b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle getExtras() {
            return this.f36118b;
        }

        public String getRootId() {
            return this.f36117a;
        }
    }

    /* loaded from: classes2.dex */
    public static class Result<T> {

        /* renamed from: a */
        public final Object f36119a;

        /* renamed from: b */
        public boolean f36120b;

        /* renamed from: c */
        public boolean f36121c;

        /* renamed from: d */
        public boolean f36122d;

        /* renamed from: e */
        public boolean f36123e;

        /* renamed from: f */
        public int f36124f;

        public Result(Object obj) {
            this.f36119a = obj;
        }

        /* renamed from: a */
        public final void m53962a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f = bundle.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        /* renamed from: b */
        public int m53961b() {
            return this.f36124f;
        }

        /* renamed from: c */
        public boolean m53960c() {
            if (!this.f36120b && !this.f36121c && !this.f36123e) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public void mo53955d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f36119a);
        }

        public void detach() {
            if (!this.f36120b) {
                if (!this.f36121c) {
                    if (!this.f36123e) {
                        this.f36120b = true;
                        return;
                    }
                    throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f36119a);
                }
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f36119a);
            }
            throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f36119a);
        }

        /* renamed from: e */
        public void mo53954e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f36119a);
        }

        /* renamed from: f */
        public void mo53941f(Object obj) {
        }

        /* renamed from: g */
        public void m53959g(int i) {
            this.f36124f = i;
        }

        public void sendError(Bundle bundle) {
            if (!this.f36121c && !this.f36123e) {
                this.f36123e = true;
                mo53955d(bundle);
                return;
            }
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f36119a);
        }

        public void sendProgressUpdate(Bundle bundle) {
            if (!this.f36121c && !this.f36123e) {
                m53962a(bundle);
                this.f36122d = true;
                mo53954e(bundle);
                return;
            }
            throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f36119a);
        }

        public void sendResult(T t) {
            if (!this.f36121c && !this.f36123e) {
                this.f36121c = true;
                mo53941f(t);
                return;
            }
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f36119a);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    /* loaded from: classes2.dex */
    public class C4730a extends Result {

        /* renamed from: g */
        public final /* synthetic */ C4734e f36125g;

        /* renamed from: h */
        public final /* synthetic */ String f36126h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f36127i;

        /* renamed from: j */
        public final /* synthetic */ Bundle f36128j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4730a(Object obj, C4734e c4734e, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f36125g = c4734e;
            this.f36126h = str;
            this.f36127i = bundle;
            this.f36128j = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53941f(List list) {
            if (MediaBrowserServiceCompat.this.f36113b.get(this.f36125g.f36141f.asBinder()) != this.f36125g) {
                if (MediaBrowserServiceCompat.f36111f) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    sb.append(this.f36125g.f36136a);
                    sb.append(" id=");
                    sb.append(this.f36126h);
                    return;
                }
                return;
            }
            if ((m53961b() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.m53969b(list, this.f36127i);
            }
            try {
                this.f36125g.f36141f.mo53929a(this.f36126h, list, this.f36127i, this.f36128j);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f36126h + " package=" + this.f36125g.f36136a);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    /* loaded from: classes2.dex */
    public class C4731b extends Result {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f36130g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4731b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f36130g = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53941f(MediaBrowserCompat.MediaItem mediaItem) {
            if ((m53961b() & 2) != 0) {
                this.f36130g.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
            this.f36130g.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    /* loaded from: classes2.dex */
    public class C4732c extends Result {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f36132g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4732c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f36132g = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53941f(List list) {
            if ((m53961b() & 4) == 0 && list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                this.f36132g.send(0, bundle);
                return;
            }
            this.f36132g.send(-1, null);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    /* loaded from: classes2.dex */
    public class C4733d extends Result {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f36134g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4733d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f36134g = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: d */
        public void mo53955d(Bundle bundle) {
            this.f36134g.send(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: e */
        public void mo53954e(Bundle bundle) {
            this.f36134g.send(1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        /* renamed from: h */
        public void mo53941f(Bundle bundle) {
            this.f36134g.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    /* loaded from: classes2.dex */
    public class C4734e implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f36136a;

        /* renamed from: b */
        public final int f36137b;

        /* renamed from: c */
        public final int f36138c;

        /* renamed from: d */
        public final MediaSessionManager.RemoteUserInfo f36139d;

        /* renamed from: e */
        public final Bundle f36140e;

        /* renamed from: f */
        public final InterfaceC4757l f36141f;

        /* renamed from: g */
        public final HashMap f36142g = new HashMap();

        /* renamed from: h */
        public BrowserRoot f36143h;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$e$a */
        /* loaded from: classes2.dex */
        public class RunnableC4735a implements Runnable {
            public RunnableC4735a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4734e c4734e = C4734e.this;
                MediaBrowserServiceCompat.this.f36113b.remove(c4734e.f36141f.asBinder());
            }
        }

        public C4734e(String str, int i, int i2, Bundle bundle, InterfaceC4757l interfaceC4757l) {
            this.f36136a = str;
            this.f36137b = i;
            this.f36138c = i2;
            this.f36139d = new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.f36140e = bundle;
            this.f36141f = interfaceC4757l;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f36115d.post(new RunnableC4735a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4736f {
        /* renamed from: a */
        MediaSessionManager.RemoteUserInfo mo53939a();

        /* renamed from: b */
        Bundle mo53943b();

        /* renamed from: c */
        IBinder mo53952c(Intent intent);

        /* renamed from: d */
        void mo53951d(String str, Bundle bundle);

        /* renamed from: e */
        void mo53950e(MediaSessionCompat.Token token);

        /* renamed from: f */
        void mo53949f(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle);

        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    /* loaded from: classes2.dex */
    public class C4737g implements InterfaceC4736f, MediaBrowserServiceCompatApi21.ServiceCompatProxy {

        /* renamed from: a */
        public final List f36146a = new ArrayList();

        /* renamed from: b */
        public Object f36147b;

        /* renamed from: c */
        public Messenger f36148c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$a */
        /* loaded from: classes2.dex */
        public class RunnableC4738a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f36150a;

            public RunnableC4738a(MediaSessionCompat.Token token) {
                this.f36150a = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!C4737g.this.f36146a.isEmpty()) {
                    IMediaSession extraBinder = this.f36150a.getExtraBinder();
                    if (extraBinder != null) {
                        for (Bundle bundle : C4737g.this.f36146a) {
                            BundleCompat.putBinder(bundle, MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder.asBinder());
                        }
                    }
                    C4737g.this.f36146a.clear();
                }
                MediaBrowserServiceCompatApi21.m53920e(C4737g.this.f36147b, this.f36150a.getToken());
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$b */
        /* loaded from: classes2.dex */
        public class C4739b extends Result {

            /* renamed from: g */
            public final /* synthetic */ MediaBrowserServiceCompatApi21.C4762c f36152g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4739b(Object obj, MediaBrowserServiceCompatApi21.C4762c c4762c) {
                super(obj);
                this.f36152g = c4762c;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
                this.f36152g.m53919a();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* renamed from: h */
            public void mo53941f(List list) {
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
                this.f36152g.m53917c(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$c */
        /* loaded from: classes2.dex */
        public class RunnableC4740c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f36154a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f36155b;

            public RunnableC4740c(String str, Bundle bundle) {
                this.f36154a = str;
                this.f36155b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f36113b.keySet()) {
                    ArrayMap arrayMap = MediaBrowserServiceCompat.this.f36113b;
                    C4737g.this.m53946i((C4734e) arrayMap.get(iBinder), this.f36154a, this.f36155b);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$g$d */
        /* loaded from: classes2.dex */
        public class RunnableC4741d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionManager.RemoteUserInfo f36157a;

            /* renamed from: b */
            public final /* synthetic */ String f36158b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f36159c;

            public RunnableC4741d(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
                this.f36157a = remoteUserInfo;
                this.f36158b = str;
                this.f36159c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f36113b.size(); i++) {
                    C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.valueAt(i);
                    if (c4734e.f36139d.equals(this.f36157a)) {
                        C4737g.this.m53946i(c4734e, this.f36158b, this.f36159c);
                    }
                }
            }
        }

        public C4737g() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: a */
        public MediaSessionManager.RemoteUserInfo mo53939a() {
            C4734e c4734e = MediaBrowserServiceCompat.this.f36114c;
            if (c4734e != null) {
                return c4734e.f36139d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: b */
        public Bundle mo53943b() {
            if (this.f36148c == null) {
                return null;
            }
            C4734e c4734e = MediaBrowserServiceCompat.this.f36114c;
            if (c4734e != null) {
                if (c4734e.f36140e == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.f36114c.f36140e);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: c */
        public IBinder mo53952c(Intent intent) {
            return MediaBrowserServiceCompatApi21.m53922c(this.f36147b, intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: d */
        public void mo53951d(String str, Bundle bundle) {
            mo53942j(str, bundle);
            m53947h(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: e */
        public void mo53950e(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4738a(token));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: f */
        public void mo53949f(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
            m53948g(remoteUserInfo, str, bundle);
        }

        /* renamed from: g */
        public void m53948g(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f36115d.post(new RunnableC4741d(remoteUserInfo, str, bundle));
        }

        /* renamed from: h */
        public void m53947h(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f36115d.post(new RunnableC4740c(str, bundle));
        }

        /* renamed from: i */
        public void m53946i(C4734e c4734e, String str, Bundle bundle) {
            List<Pair> list = (List) c4734e.f36142g.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle) pair.second)) {
                        MediaBrowserServiceCompat.this.m53966e(str, c4734e, (Bundle) pair.second, bundle);
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo53942j(String str, Bundle bundle) {
            MediaBrowserServiceCompatApi21.m53923b(this.f36147b, str);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        public void onCreate() {
            Object m53924a = MediaBrowserServiceCompatApi21.m53924a(MediaBrowserServiceCompat.this, this);
            this.f36147b = m53924a;
            MediaBrowserServiceCompatApi21.m53921d(m53924a);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public MediaBrowserServiceCompatApi21.C4760a onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            IBinder asBinder;
            if (bundle != null && bundle.getInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 0) != 0) {
                bundle.remove(MediaBrowserProtocol.EXTRA_CLIENT_VERSION);
                this.f36148c = new Messenger(MediaBrowserServiceCompat.this.f36115d);
                bundle2 = new Bundle();
                bundle2.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
                BundleCompat.putBinder(bundle2, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER, this.f36148c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f36116e;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    if (extraBinder == null) {
                        asBinder = null;
                    } else {
                        asBinder = extraBinder.asBinder();
                    }
                    BundleCompat.putBinder(bundle2, MediaBrowserProtocol.EXTRA_SESSION_BINDER, asBinder);
                } else {
                    this.f36146a.add(bundle2);
                }
            } else {
                bundle2 = null;
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f36114c = new C4734e(str, -1, i, bundle, null);
            BrowserRoot onGetRoot = MediaBrowserServiceCompat.this.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat.this.f36114c = null;
            if (onGetRoot == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = onGetRoot.getExtras();
            } else if (onGetRoot.getExtras() != null) {
                bundle2.putAll(onGetRoot.getExtras());
            }
            return new MediaBrowserServiceCompatApi21.C4760a(onGetRoot.getRootId(), bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public void onLoadChildren(String str, MediaBrowserServiceCompatApi21.C4762c c4762c) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new C4739b(str, c4762c));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    /* loaded from: classes2.dex */
    public class C4742h extends C4737g implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        /* loaded from: classes2.dex */
        public class C4743a extends Result {

            /* renamed from: g */
            public final /* synthetic */ MediaBrowserServiceCompatApi21.C4762c f36162g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4743a(Object obj, MediaBrowserServiceCompatApi21.C4762c c4762c) {
                super(obj);
                this.f36162g = c4762c;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
                this.f36162g.m53919a();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* renamed from: h */
            public void mo53941f(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f36162g.m53917c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f36162g.m53917c(obtain);
            }
        }

        public C4742h() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4737g, androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        public void onCreate() {
            Object m53916a = MediaBrowserServiceCompatApi23.m53916a(MediaBrowserServiceCompat.this, this);
            this.f36147b = m53916a;
            MediaBrowserServiceCompatApi21.m53921d(m53916a);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy
        public void onLoadItem(String str, MediaBrowserServiceCompatApi21.C4762c c4762c) {
            MediaBrowserServiceCompat.this.onLoadItem(str, new C4743a(str, c4762c));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    /* loaded from: classes2.dex */
    public class C4744i extends C4742h implements MediaBrowserServiceCompatApi26.ServiceCompatProxy {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        /* loaded from: classes2.dex */
        public class C4745a extends Result {

            /* renamed from: g */
            public final /* synthetic */ MediaBrowserServiceCompatApi26.C4765b f36165g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4745a(Object obj, MediaBrowserServiceCompatApi26.C4765b c4765b) {
                super(obj);
                this.f36165g = c4765b;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
                this.f36165g.m53912a();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* renamed from: h */
            public void mo53941f(List list) {
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
                this.f36165g.m53910c(arrayList, m53961b());
            }
        }

        public C4744i() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4737g, androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: b */
        public Bundle mo53943b() {
            C4734e c4734e = MediaBrowserServiceCompat.this.f36114c;
            if (c4734e != null) {
                if (c4734e.f36140e == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.f36114c.f36140e);
            }
            return MediaBrowserServiceCompatApi26.m53914b(this.f36147b);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4737g
        /* renamed from: j */
        public void mo53942j(String str, Bundle bundle) {
            if (bundle != null) {
                MediaBrowserServiceCompatApi26.m53913c(this.f36147b, str, bundle);
            } else {
                super.mo53942j(str, bundle);
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4742h, androidx.media.MediaBrowserServiceCompat.C4737g, androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        public void onCreate() {
            Object m53915a = MediaBrowserServiceCompatApi26.m53915a(MediaBrowserServiceCompat.this, this);
            this.f36147b = m53915a;
            MediaBrowserServiceCompatApi21.m53921d(m53915a);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy
        public void onLoadChildren(String str, MediaBrowserServiceCompatApi26.C4765b c4765b, Bundle bundle) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new C4745a(str, c4765b), bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    /* loaded from: classes2.dex */
    public class C4746j extends C4744i {
        public C4746j() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C4737g, androidx.media.MediaBrowserServiceCompat.InterfaceC4736f
        /* renamed from: a */
        public MediaSessionManager.RemoteUserInfo mo53939a() {
            MediaSessionManager.RemoteUserInfo currentBrowserInfo;
            C4734e c4734e = MediaBrowserServiceCompat.this.f36114c;
            if (c4734e == null) {
                currentBrowserInfo = ((MediaBrowserService) this.f36147b).getCurrentBrowserInfo();
                return new MediaSessionManager.RemoteUserInfo(currentBrowserInfo);
            }
            return c4734e.f36139d;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    /* loaded from: classes2.dex */
    public class C4747k {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$a */
        /* loaded from: classes2.dex */
        public class RunnableC4748a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36169a;

            /* renamed from: b */
            public final /* synthetic */ String f36170b;

            /* renamed from: c */
            public final /* synthetic */ int f36171c;

            /* renamed from: d */
            public final /* synthetic */ int f36172d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f36173e;

            public RunnableC4748a(InterfaceC4757l interfaceC4757l, String str, int i, int i2, Bundle bundle) {
                this.f36169a = interfaceC4757l;
                this.f36170b = str;
                this.f36171c = i;
                this.f36172d = i2;
                this.f36173e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f36169a.asBinder();
                MediaBrowserServiceCompat.this.f36113b.remove(asBinder);
                C4734e c4734e = new C4734e(this.f36170b, this.f36171c, this.f36172d, this.f36173e, this.f36169a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f36114c = c4734e;
                BrowserRoot onGetRoot = mediaBrowserServiceCompat.onGetRoot(this.f36170b, this.f36172d, this.f36173e);
                c4734e.f36143h = onGetRoot;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f36114c = null;
                if (onGetRoot == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f36170b);
                    sb.append(" from service ");
                    sb.append(getClass().getName());
                    try {
                        this.f36169a.mo53928b();
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f36170b);
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.f36113b.put(asBinder, c4734e);
                    asBinder.linkToDeath(c4734e, 0);
                    if (MediaBrowserServiceCompat.this.f36116e != null) {
                        this.f36169a.mo53927c(c4734e.f36143h.getRootId(), MediaBrowserServiceCompat.this.f36116e, c4734e.f36143h.getExtras());
                    }
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f36170b);
                    MediaBrowserServiceCompat.this.f36113b.remove(asBinder);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$b */
        /* loaded from: classes2.dex */
        public class RunnableC4749b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36175a;

            public RunnableC4749b(InterfaceC4757l interfaceC4757l) {
                this.f36175a = interfaceC4757l;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.remove(this.f36175a.asBinder());
                if (c4734e != null) {
                    c4734e.f36141f.asBinder().unlinkToDeath(c4734e, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$c */
        /* loaded from: classes2.dex */
        public class RunnableC4750c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36177a;

            /* renamed from: b */
            public final /* synthetic */ String f36178b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f36179c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f36180d;

            public RunnableC4750c(InterfaceC4757l interfaceC4757l, String str, IBinder iBinder, Bundle bundle) {
                this.f36177a = interfaceC4757l;
                this.f36178b = str;
                this.f36179c = iBinder;
                this.f36180d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.get(this.f36177a.asBinder());
                if (c4734e == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f36178b);
                    return;
                }
                MediaBrowserServiceCompat.this.m53970a(this.f36178b, c4734e, this.f36179c, this.f36180d);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$d */
        /* loaded from: classes2.dex */
        public class RunnableC4751d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36182a;

            /* renamed from: b */
            public final /* synthetic */ String f36183b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f36184c;

            public RunnableC4751d(InterfaceC4757l interfaceC4757l, String str, IBinder iBinder) {
                this.f36182a = interfaceC4757l;
                this.f36183b = str;
                this.f36184c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.get(this.f36182a.asBinder());
                if (c4734e == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f36183b);
                } else if (!MediaBrowserServiceCompat.this.m53963h(this.f36183b, c4734e, this.f36184c)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f36183b + " which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$e */
        /* loaded from: classes2.dex */
        public class RunnableC4752e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36186a;

            /* renamed from: b */
            public final /* synthetic */ String f36187b;

            /* renamed from: c */
            public final /* synthetic */ ResultReceiver f36188c;

            public RunnableC4752e(InterfaceC4757l interfaceC4757l, String str, ResultReceiver resultReceiver) {
                this.f36186a = interfaceC4757l;
                this.f36187b = str;
                this.f36188c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.get(this.f36186a.asBinder());
                if (c4734e == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f36187b);
                    return;
                }
                MediaBrowserServiceCompat.this.m53965f(this.f36187b, c4734e, this.f36188c);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$f */
        /* loaded from: classes2.dex */
        public class RunnableC4753f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36190a;

            /* renamed from: b */
            public final /* synthetic */ String f36191b;

            /* renamed from: c */
            public final /* synthetic */ int f36192c;

            /* renamed from: d */
            public final /* synthetic */ int f36193d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f36194e;

            public RunnableC4753f(InterfaceC4757l interfaceC4757l, String str, int i, int i2, Bundle bundle) {
                this.f36190a = interfaceC4757l;
                this.f36191b = str;
                this.f36192c = i;
                this.f36193d = i2;
                this.f36194e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f36190a.asBinder();
                MediaBrowserServiceCompat.this.f36113b.remove(asBinder);
                C4734e c4734e = new C4734e(this.f36191b, this.f36192c, this.f36193d, this.f36194e, this.f36190a);
                MediaBrowserServiceCompat.this.f36113b.put(asBinder, c4734e);
                try {
                    asBinder.linkToDeath(c4734e, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$g */
        /* loaded from: classes2.dex */
        public class RunnableC4754g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36196a;

            public RunnableC4754g(InterfaceC4757l interfaceC4757l) {
                this.f36196a = interfaceC4757l;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f36196a.asBinder();
                C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.remove(asBinder);
                if (c4734e != null) {
                    asBinder.unlinkToDeath(c4734e, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$h */
        /* loaded from: classes2.dex */
        public class RunnableC4755h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36198a;

            /* renamed from: b */
            public final /* synthetic */ String f36199b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f36200c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f36201d;

            public RunnableC4755h(InterfaceC4757l interfaceC4757l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f36198a = interfaceC4757l;
                this.f36199b = str;
                this.f36200c = bundle;
                this.f36201d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.get(this.f36198a.asBinder());
                if (c4734e == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f36199b);
                    return;
                }
                MediaBrowserServiceCompat.this.m53964g(this.f36199b, this.f36200c, c4734e, this.f36201d);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$k$i */
        /* loaded from: classes2.dex */
        public class RunnableC4756i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4757l f36203a;

            /* renamed from: b */
            public final /* synthetic */ String f36204b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f36205c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f36206d;

            public RunnableC4756i(InterfaceC4757l interfaceC4757l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f36203a = interfaceC4757l;
                this.f36204b = str;
                this.f36205c = bundle;
                this.f36206d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4734e c4734e = (C4734e) MediaBrowserServiceCompat.this.f36113b.get(this.f36203a.asBinder());
                if (c4734e == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f36204b + ", extras=" + this.f36205c);
                    return;
                }
                MediaBrowserServiceCompat.this.m53967d(this.f36204b, this.f36205c, c4734e, this.f36206d);
            }
        }

        public C4747k() {
        }

        /* renamed from: a */
        public void m53938a(String str, IBinder iBinder, Bundle bundle, InterfaceC4757l interfaceC4757l) {
            MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4750c(interfaceC4757l, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void m53937b(String str, int i, int i2, Bundle bundle, InterfaceC4757l interfaceC4757l) {
            if (MediaBrowserServiceCompat.this.m53968c(str, i2)) {
                MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4748a(interfaceC4757l, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void m53936c(InterfaceC4757l interfaceC4757l) {
            MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4749b(interfaceC4757l));
        }

        /* renamed from: d */
        public void m53935d(String str, ResultReceiver resultReceiver, InterfaceC4757l interfaceC4757l) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4752e(interfaceC4757l, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void m53934e(InterfaceC4757l interfaceC4757l, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4753f(interfaceC4757l, str, i, i2, bundle));
        }

        /* renamed from: f */
        public void m53933f(String str, IBinder iBinder, InterfaceC4757l interfaceC4757l) {
            MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4751d(interfaceC4757l, str, iBinder));
        }

        /* renamed from: g */
        public void m53932g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC4757l interfaceC4757l) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4755h(interfaceC4757l, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void m53931h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC4757l interfaceC4757l) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4756i(interfaceC4757l, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void m53930i(InterfaceC4757l interfaceC4757l) {
            MediaBrowserServiceCompat.this.f36115d.m53925a(new RunnableC4754g(interfaceC4757l));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    /* loaded from: classes2.dex */
    public interface InterfaceC4757l {
        /* renamed from: a */
        void mo53929a(String str, List list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();

        /* renamed from: b */
        void mo53928b();

        /* renamed from: c */
        void mo53927c(String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    /* loaded from: classes2.dex */
    public static class C4758m implements InterfaceC4757l {

        /* renamed from: a */
        public final Messenger f36208a;

        public C4758m(Messenger messenger) {
            this.f36208a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4757l
        /* renamed from: a */
        public void mo53929a(String str, List list, Bundle bundle, Bundle bundle2) {
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
            m53926d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4757l
        public IBinder asBinder() {
            return this.f36208a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4757l
        /* renamed from: b */
        public void mo53928b() {
            m53926d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC4757l
        /* renamed from: c */
        public void mo53927c(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN, token);
            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
            m53926d(1, bundle2);
        }

        /* renamed from: d */
        public final void m53926d(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f36208a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    /* loaded from: classes2.dex */
    public final class HandlerC4759n extends Handler {

        /* renamed from: a */
        public final C4747k f36209a;

        public HandlerC4759n() {
            this.f36209a = new C4747k();
        }

        /* renamed from: a */
        public void m53925a(Runnable runnable) {
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
                    this.f36209a.m53937b(data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(MediaBrowserProtocol.DATA_CALLING_PID), data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), bundle, new C4758m(message.replyTo));
                    return;
                case 2:
                    this.f36209a.m53936c(new C4758m(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f36209a.m53938a(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), BundleCompat.getBinder(data, MediaBrowserProtocol.DATA_CALLBACK_TOKEN), bundle2, new C4758m(message.replyTo));
                    return;
                case 4:
                    this.f36209a.m53933f(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), BundleCompat.getBinder(data, MediaBrowserProtocol.DATA_CALLBACK_TOKEN), new C4758m(message.replyTo));
                    return;
                case 5:
                    this.f36209a.m53935d(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new C4758m(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f36209a.m53934e(new C4758m(message.replyTo), data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(MediaBrowserProtocol.DATA_CALLING_PID), data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), bundle3);
                    return;
                case 7:
                    this.f36209a.m53930i(new C4758m(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS);
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f36209a.m53932g(data.getString(MediaBrowserProtocol.DATA_SEARCH_QUERY), bundle4, (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new C4758m(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS);
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f36209a.m53931h(data.getString(MediaBrowserProtocol.DATA_CUSTOM_ACTION), bundle5, (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new C4758m(message.replyTo));
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
    public void m53970a(String str, C4734e c4734e, IBinder iBinder, Bundle bundle) {
        List<Pair> list = (List) c4734e.f36142g.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (Pair pair : list) {
            if (iBinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle) pair.second)) {
                return;
            }
        }
        list.add(new Pair(iBinder, bundle));
        c4734e.f36142g.put(str, list);
        m53966e(str, c4734e, bundle, null);
        this.f36114c = c4734e;
        onSubscribe(str, bundle);
        this.f36114c = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: b */
    public List m53969b(List list, Bundle bundle) {
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
    public boolean m53968c(String str, int i) {
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
    public void m53967d(String str, Bundle bundle, C4734e c4734e, ResultReceiver resultReceiver) {
        C4733d c4733d = new C4733d(str, resultReceiver);
        this.f36114c = c4734e;
        onCustomAction(str, bundle, c4733d);
        this.f36114c = null;
        if (c4733d.m53960c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public void m53966e(String str, C4734e c4734e, Bundle bundle, Bundle bundle2) {
        C4730a c4730a = new C4730a(str, c4734e, str, bundle, bundle2);
        this.f36114c = c4734e;
        if (bundle == null) {
            onLoadChildren(str, c4730a);
        } else {
            onLoadChildren(str, c4730a, bundle);
        }
        this.f36114c = null;
        if (c4730a.m53960c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c4734e.f36136a + " id=" + str);
    }

    /* renamed from: f */
    public void m53965f(String str, C4734e c4734e, ResultReceiver resultReceiver) {
        C4731b c4731b = new C4731b(str, resultReceiver);
        this.f36114c = c4734e;
        onLoadItem(str, c4731b);
        this.f36114c = null;
        if (c4731b.m53960c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    /* renamed from: g */
    public void m53964g(String str, Bundle bundle, C4734e c4734e, ResultReceiver resultReceiver) {
        C4732c c4732c = new C4732c(str, resultReceiver);
        this.f36114c = c4734e;
        onSearch(str, bundle, c4732c);
        this.f36114c = null;
        if (c4732c.m53960c()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    public final Bundle getBrowserRootHints() {
        return this.f36112a.mo53943b();
    }

    @NonNull
    public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        return this.f36112a.mo53939a();
    }

    @Nullable
    public MediaSessionCompat.Token getSessionToken() {
        return this.f36116e;
    }

    /* renamed from: h */
    public boolean m53963h(String str, C4734e c4734e, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                if (c4734e.f36142g.remove(str) != null) {
                    z = true;
                }
            } else {
                List list = (List) c4734e.f36142g.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((Pair) it.next()).first) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        c4734e.f36142g.remove(str);
                    }
                }
            }
            return z;
        } finally {
            this.f36114c = c4734e;
            onUnsubscribe(str);
            this.f36114c = null;
        }
    }

    public void notifyChildrenChanged(@NonNull String str) {
        if (str != null) {
            this.f36112a.mo53951d(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f36112a.mo53952c(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f36112a = new C4746j();
        } else if (i >= 26) {
            this.f36112a = new C4744i();
        } else if (i >= 23) {
            this.f36112a = new C4742h();
        } else {
            this.f36112a = new C4737g();
        }
        this.f36112a.onCreate();
    }

    public void onCustomAction(@NonNull String str, Bundle bundle, @NonNull Result<Bundle> result) {
        result.sendError(null);
    }

    @Nullable
    public abstract BrowserRoot onGetRoot(@NonNull String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@NonNull String str, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result);

    public void onLoadChildren(@NonNull String str, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result, @NonNull Bundle bundle) {
        result.m53959g(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, @NonNull Result<MediaBrowserCompat.MediaItem> result) {
        result.m53959g(2);
        result.sendResult(null);
    }

    public void onSearch(@NonNull String str, Bundle bundle, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result) {
        result.m53959g(4);
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
            if (this.f36116e == null) {
                this.f36116e = token;
                this.f36112a.mo53950e(token);
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
            this.f36112a.mo53951d(str, bundle);
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
            this.f36112a.mo53949f(remoteUserInfo, str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
}