package android.support.p001v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.BadParcelableException;
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
import android.support.p001v4.media.AbstractC1949a;
import android.support.p001v4.media.AbstractC1955b;
import android.support.p001v4.media.AbstractC1958c;
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
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: b */
    public static final boolean f8443b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final InterfaceC1932b f8444a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback */
    /* loaded from: classes.dex */
    public static class ConnectionCallback {

        /* renamed from: a */
        public final Object f8445a = AbstractC1949a.m64970c(new C1926b());

        /* renamed from: b */
        public InterfaceC1925a f8446b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$a */
        /* loaded from: classes.dex */
        public interface InterfaceC1925a {
            /* renamed from: b */
            void mo65008b();

            /* renamed from: c */
            void mo65007c();

            /* renamed from: d */
            void mo65006d();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$b */
        /* loaded from: classes.dex */
        public class C1926b implements AbstractC1949a.InterfaceC1950a {
            public C1926b() {
            }

            @Override // android.support.p001v4.media.AbstractC1949a.InterfaceC1950a
            /* renamed from: b */
            public void mo64960b() {
                InterfaceC1925a interfaceC1925a = ConnectionCallback.this.f8446b;
                if (interfaceC1925a != null) {
                    interfaceC1925a.mo65008b();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }

            @Override // android.support.p001v4.media.AbstractC1949a.InterfaceC1950a
            /* renamed from: c */
            public void mo64959c() {
                InterfaceC1925a interfaceC1925a = ConnectionCallback.this.f8446b;
                if (interfaceC1925a != null) {
                    interfaceC1925a.mo65007c();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.support.p001v4.media.AbstractC1949a.InterfaceC1950a
            /* renamed from: d */
            public void mo64958d() {
                InterfaceC1925a interfaceC1925a = ConnectionCallback.this.f8446b;
                if (interfaceC1925a != null) {
                    interfaceC1925a.mo65006d();
                }
                ConnectionCallback.this.onConnectionFailed();
            }
        }

        /* renamed from: a */
        public void m65015a(InterfaceC1925a interfaceC1925a) {
            this.f8446b = interfaceC1925a;
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionCallback */
    /* loaded from: classes.dex */
    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        public final String f8448d;

        /* renamed from: e */
        public final Bundle f8449e;

        /* renamed from: f */
        public final CustomActionCallback f8450f;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.f8448d = str;
            this.f8449e = bundle;
            this.f8450f = customActionCallback;
        }

        @Override // android.support.p001v4.p002os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (this.f8450f == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f8449e + ", resultData=" + bundle + ")");
                        return;
                    }
                    this.f8450f.onProgressUpdate(this.f8448d, this.f8449e, bundle);
                    return;
                }
                this.f8450f.onResult(this.f8448d, this.f8449e, bundle);
                return;
            }
            this.f8450f.onError(this.f8448d, this.f8449e, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback */
    /* loaded from: classes.dex */
    public static abstract class ItemCallback {

        /* renamed from: a */
        public final Object f8451a;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback$a */
        /* loaded from: classes.dex */
        public class C1927a implements AbstractC1955b.InterfaceC1956a {
            public C1927a() {
            }

            @Override // android.support.p001v4.media.AbstractC1955b.InterfaceC1956a
            /* renamed from: a */
            public void mo64952a(Parcel parcel) {
                if (parcel == null) {
                    ItemCallback.this.onItemLoaded(null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                ItemCallback.this.onItemLoaded(MediaItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.support.p001v4.media.AbstractC1955b.InterfaceC1956a
            public void onError(String str) {
                ItemCallback.this.onError(str);
            }
        }

        public ItemCallback() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f8451a = AbstractC1955b.m64954a(new C1927a());
            } else {
                this.f8451a = null;
            }
        }

        public void onError(@NonNull String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    /* loaded from: classes.dex */
    public static class ItemReceiver extends ResultReceiver {

        /* renamed from: d */
        public final String f8453d;

        /* renamed from: e */
        public final ItemCallback f8454e;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.f8453d = str;
            this.f8454e = itemCallback;
        }

        @Override // android.support.p001v4.p002os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i == 0 && bundle != null && bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    this.f8454e.onError(this.f8453d);
                    return;
                } else {
                    this.f8454e.onItemLoaded((MediaItem) parcelable);
                    return;
                }
            }
            this.f8454e.onError(this.f8453d);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchCallback */
    /* loaded from: classes.dex */
    public static abstract class SearchCallback {
        public void onError(@NonNull String str, Bundle bundle) {
        }

        public void onSearchResult(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d */
        public final String f8457d;

        /* renamed from: e */
        public final Bundle f8458e;

        /* renamed from: f */
        public final SearchCallback f8459f;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.f8457d = str;
            this.f8458e = bundle;
            this.f8459f = searchCallback;
        }

        @Override // android.support.p001v4.p002os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            ArrayList arrayList;
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i == 0 && bundle != null && bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
                if (parcelableArray != null) {
                    arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                } else {
                    arrayList = null;
                }
                this.f8459f.onSearchResult(this.f8457d, this.f8458e, arrayList);
                return;
            }
            this.f8459f.onError(this.f8457d, this.f8458e);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback */
    /* loaded from: classes.dex */
    public static abstract class SubscriptionCallback {

        /* renamed from: a */
        public final Object f8460a;

        /* renamed from: b */
        public final IBinder f8461b = new Binder();

        /* renamed from: c */
        public WeakReference f8462c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$a */
        /* loaded from: classes.dex */
        public class C1929a implements AbstractC1949a.InterfaceC1953d {
            public C1929a() {
            }

            @Override // android.support.p001v4.media.AbstractC1949a.InterfaceC1953d
            /* renamed from: a */
            public void mo64955a(String str, List list) {
                C1945h c1945h;
                WeakReference weakReference = SubscriptionCallback.this.f8462c;
                if (weakReference == null) {
                    c1945h = null;
                } else {
                    c1945h = (C1945h) weakReference.get();
                }
                if (c1945h == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);
                List m64985b = c1945h.m64985b();
                List m64984c = c1945h.m64984c();
                for (int i = 0; i < m64985b.size(); i++) {
                    Bundle bundle = (Bundle) m64984c.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, fromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, m65011d(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            /* renamed from: d */
            public List m65011d(List list, Bundle bundle) {
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

            @Override // android.support.p001v4.media.AbstractC1949a.InterfaceC1953d
            public void onError(String str) {
                SubscriptionCallback.this.onError(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$b */
        /* loaded from: classes.dex */
        public class C1930b extends C1929a implements AbstractC1958c.InterfaceC1959a {
            public C1930b() {
                super();
            }

            @Override // android.support.p001v4.media.AbstractC1958c.InterfaceC1959a
            /* renamed from: b */
            public void mo64948b(String str, Bundle bundle) {
                SubscriptionCallback.this.onError(str, bundle);
            }

            @Override // android.support.p001v4.media.AbstractC1958c.InterfaceC1959a
            /* renamed from: c */
            public void mo64947c(String str, List list, Bundle bundle) {
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }
        }

        public SubscriptionCallback() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f8460a = AbstractC1958c.m64951a(new C1930b());
            } else {
                this.f8460a = AbstractC1949a.m64969d(new C1929a());
            }
        }

        /* renamed from: a */
        public void m65012a(C1945h c1945h) {
            this.f8462c = new WeakReference(c1945h);
        }

        public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        public void onError(@NonNull String str) {
        }

        public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        public void onError(@NonNull String str, @NonNull Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    /* loaded from: classes.dex */
    public static class HandlerC1931a extends Handler {

        /* renamed from: a */
        public final WeakReference f8465a;

        /* renamed from: b */
        public WeakReference f8466b;

        public HandlerC1931a(InterfaceC1943f interfaceC1943f) {
            this.f8465a = new WeakReference(interfaceC1943f);
        }

        /* renamed from: a */
        public void m65010a(Messenger messenger) {
            this.f8466b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f8466b;
            if (weakReference != null && weakReference.get() != null && this.f8465a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                InterfaceC1943f interfaceC1943f = (InterfaceC1943f) this.f8465a.get();
                Messenger messenger = (Messenger) this.f8466b.get();
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            } else {
                                Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                                MediaSessionCompat.ensureClassLoader(bundle);
                                Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                                MediaSessionCompat.ensureClassLoader(bundle2);
                                interfaceC1943f.mo64996j(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle, bundle2);
                            }
                        } else {
                            interfaceC1943f.mo64997i(messenger);
                        }
                    } else {
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        interfaceC1943f.mo64995k(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        interfaceC1943f.mo64997i(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1932b {
        /* renamed from: a */
        MediaSessionCompat.Token mo65009a();

        void disconnect();

        /* renamed from: e */
        void mo65005e(String str, Bundle bundle, CustomActionCallback customActionCallback);

        /* renamed from: f */
        void mo65004f();

        /* renamed from: g */
        void mo65003g(String str, Bundle bundle, SearchCallback searchCallback);

        Bundle getExtras();

        String getRoot();

        /* renamed from: h */
        ComponentName mo65002h();

        boolean isConnected();

        /* renamed from: l */
        void mo65000l(String str, ItemCallback itemCallback);

        /* renamed from: m */
        void mo64999m(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        /* renamed from: n */
        void mo64998n(String str, SubscriptionCallback subscriptionCallback);

        /* renamed from: o */
        Bundle mo65001o();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    /* loaded from: classes.dex */
    public static class C1933c implements InterfaceC1932b, InterfaceC1943f, ConnectionCallback.InterfaceC1925a {

        /* renamed from: a */
        public final Context f8467a;

        /* renamed from: b */
        public final Object f8468b;

        /* renamed from: c */
        public final Bundle f8469c;

        /* renamed from: d */
        public final HandlerC1931a f8470d = new HandlerC1931a(this);

        /* renamed from: e */
        public final ArrayMap f8471e = new ArrayMap();

        /* renamed from: f */
        public int f8472f;

        /* renamed from: g */
        public C1944g f8473g;

        /* renamed from: h */
        public Messenger f8474h;

        /* renamed from: i */
        public MediaSessionCompat.Token f8475i;

        /* renamed from: j */
        public Bundle f8476j;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        /* loaded from: classes.dex */
        public class RunnableC1934a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ItemCallback f8477a;

            /* renamed from: b */
            public final /* synthetic */ String f8478b;

            public RunnableC1934a(ItemCallback itemCallback, String str) {
                this.f8477a = itemCallback;
                this.f8478b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8477a.onError(this.f8478b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        /* loaded from: classes.dex */
        public class RunnableC1935b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ItemCallback f8480a;

            /* renamed from: b */
            public final /* synthetic */ String f8481b;

            public RunnableC1935b(ItemCallback itemCallback, String str) {
                this.f8480a = itemCallback;
                this.f8481b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8480a.onError(this.f8481b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$c */
        /* loaded from: classes.dex */
        public class RunnableC1936c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ItemCallback f8483a;

            /* renamed from: b */
            public final /* synthetic */ String f8484b;

            public RunnableC1936c(ItemCallback itemCallback, String str) {
                this.f8483a = itemCallback;
                this.f8484b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8483a.onError(this.f8484b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$d */
        /* loaded from: classes.dex */
        public class RunnableC1937d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ SearchCallback f8486a;

            /* renamed from: b */
            public final /* synthetic */ String f8487b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8488c;

            public RunnableC1937d(SearchCallback searchCallback, String str, Bundle bundle) {
                this.f8486a = searchCallback;
                this.f8487b = str;
                this.f8488c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8486a.onError(this.f8487b, this.f8488c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$e */
        /* loaded from: classes.dex */
        public class RunnableC1938e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ SearchCallback f8490a;

            /* renamed from: b */
            public final /* synthetic */ String f8491b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8492c;

            public RunnableC1938e(SearchCallback searchCallback, String str, Bundle bundle) {
                this.f8490a = searchCallback;
                this.f8491b = str;
                this.f8492c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8490a.onError(this.f8491b, this.f8492c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$f */
        /* loaded from: classes.dex */
        public class RunnableC1939f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CustomActionCallback f8494a;

            /* renamed from: b */
            public final /* synthetic */ String f8495b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8496c;

            public RunnableC1939f(CustomActionCallback customActionCallback, String str, Bundle bundle) {
                this.f8494a = customActionCallback;
                this.f8495b = str;
                this.f8496c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8494a.onError(this.f8495b, this.f8496c, null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$g */
        /* loaded from: classes.dex */
        public class RunnableC1940g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CustomActionCallback f8498a;

            /* renamed from: b */
            public final /* synthetic */ String f8499b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8500c;

            public RunnableC1940g(CustomActionCallback customActionCallback, String str, Bundle bundle) {
                this.f8498a = customActionCallback;
                this.f8499b = str;
                this.f8500c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8498a.onError(this.f8499b, this.f8500c, null);
            }
        }

        public C1933c(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            Bundle bundle2;
            this.f8467a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f8469c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            connectionCallback.m65015a(this);
            this.f8468b = AbstractC1949a.m64971b(context, componentName, connectionCallback.f8445a, bundle2);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: a */
        public MediaSessionCompat.Token mo65009a() {
            if (this.f8475i == null) {
                this.f8475i = MediaSessionCompat.Token.fromToken(AbstractC1949a.m64964i(this.f8468b));
            }
            return this.f8475i;
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.ConnectionCallback.InterfaceC1925a
        /* renamed from: b */
        public void mo65008b() {
            this.f8473g = null;
            this.f8474h = null;
            this.f8475i = null;
            this.f8470d.m65010a(null);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.ConnectionCallback.InterfaceC1925a
        /* renamed from: c */
        public void mo65007c() {
            Bundle m64967f = AbstractC1949a.m64967f(this.f8468b);
            if (m64967f == null) {
                return;
            }
            this.f8472f = m64967f.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
            IBinder binder = BundleCompat.getBinder(m64967f, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
            if (binder != null) {
                this.f8473g = new C1944g(binder, this.f8469c);
                Messenger messenger = new Messenger(this.f8470d);
                this.f8474h = messenger;
                this.f8470d.m65010a(messenger);
                try {
                    this.f8473g.m64992c(this.f8467a, this.f8474h);
                } catch (RemoteException unused) {
                }
            }
            IMediaSession asInterface = IMediaSession.Stub.asInterface(BundleCompat.getBinder(m64967f, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
            if (asInterface != null) {
                this.f8475i = MediaSessionCompat.Token.fromToken(AbstractC1949a.m64964i(this.f8468b), asInterface);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.ConnectionCallback.InterfaceC1925a
        /* renamed from: d */
        public void mo65006d() {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        public void disconnect() {
            Messenger messenger;
            C1944g c1944g = this.f8473g;
            if (c1944g != null && (messenger = this.f8474h) != null) {
                try {
                    c1944g.m64987h(messenger);
                } catch (RemoteException unused) {
                }
            }
            AbstractC1949a.m64968e(this.f8468b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: e */
        public void mo65005e(String str, Bundle bundle, CustomActionCallback customActionCallback) {
            if (isConnected()) {
                if (this.f8473g == null && customActionCallback != null) {
                    this.f8470d.post(new RunnableC1939f(customActionCallback, str, bundle));
                }
                try {
                    this.f8473g.m64989f(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.f8470d), this.f8474h);
                    return;
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(str);
                    sb.append(", extras=");
                    sb.append(bundle);
                    if (customActionCallback != null) {
                        this.f8470d.post(new RunnableC1940g(customActionCallback, str, bundle));
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: f */
        public void mo65004f() {
            AbstractC1949a.m64972a(this.f8468b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: g */
        public void mo65003g(String str, Bundle bundle, SearchCallback searchCallback) {
            if (isConnected()) {
                if (this.f8473g == null) {
                    this.f8470d.post(new RunnableC1937d(searchCallback, str, bundle));
                    return;
                }
                try {
                    this.f8473g.m64990e(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.f8470d), this.f8474h);
                    return;
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error searching items with query: ");
                    sb.append(str);
                    this.f8470d.post(new RunnableC1938e(searchCallback, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected");
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        public Bundle getExtras() {
            return AbstractC1949a.m64967f(this.f8468b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        public String getRoot() {
            return AbstractC1949a.m64966g(this.f8468b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: h */
        public ComponentName mo65002h() {
            return AbstractC1949a.m64965h(this.f8468b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1943f
        /* renamed from: i */
        public void mo64997i(Messenger messenger) {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        public boolean isConnected() {
            return AbstractC1949a.m64963j(this.f8468b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1943f
        /* renamed from: j */
        public void mo64996j(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f8474h != messenger) {
                return;
            }
            C1945h c1945h = (C1945h) this.f8471e.get(str);
            if (c1945h == null) {
                if (MediaBrowserCompat.f8443b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                    return;
                }
                return;
            }
            SubscriptionCallback m64986a = c1945h.m64986a(bundle);
            if (m64986a != null) {
                if (bundle == null) {
                    if (list == null) {
                        m64986a.onError(str);
                        return;
                    }
                    this.f8476j = bundle2;
                    m64986a.onChildrenLoaded(str, list);
                    this.f8476j = null;
                } else if (list == null) {
                    m64986a.onError(str, bundle);
                } else {
                    this.f8476j = bundle2;
                    m64986a.onChildrenLoaded(str, list, bundle);
                    this.f8476j = null;
                }
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1943f
        /* renamed from: k */
        public void mo64995k(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: l */
        public void mo65000l(String str, ItemCallback itemCallback) {
            if (!TextUtils.isEmpty(str)) {
                if (itemCallback != null) {
                    if (!AbstractC1949a.m64963j(this.f8468b)) {
                        this.f8470d.post(new RunnableC1934a(itemCallback, str));
                        return;
                    } else if (this.f8473g == null) {
                        this.f8470d.post(new RunnableC1935b(itemCallback, str));
                        return;
                    } else {
                        try {
                            this.f8473g.m64993b(str, new ItemReceiver(str, itemCallback, this.f8470d), this.f8474h);
                            return;
                        } catch (RemoteException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Remote error getting media item: ");
                            sb.append(str);
                            this.f8470d.post(new RunnableC1936c(itemCallback, str));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("cb is null");
            }
            throw new IllegalArgumentException("mediaId is empty");
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: m */
        public void mo64999m(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Bundle bundle2;
            C1945h c1945h = (C1945h) this.f8471e.get(str);
            if (c1945h == null) {
                c1945h = new C1945h();
                this.f8471e.put(str, c1945h);
            }
            subscriptionCallback.m65012a(c1945h);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            c1945h.m64982e(bundle2, subscriptionCallback);
            C1944g c1944g = this.f8473g;
            if (c1944g == null) {
                AbstractC1949a.m64962k(this.f8468b, str, subscriptionCallback.f8460a);
                return;
            }
            try {
                c1944g.m64994a(str, subscriptionCallback.f8461b, bundle2, this.f8474h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error subscribing media item: ");
                sb.append(str);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: n */
        public void mo64998n(String str, SubscriptionCallback subscriptionCallback) {
            C1945h c1945h = (C1945h) this.f8471e.get(str);
            if (c1945h == null) {
                return;
            }
            C1944g c1944g = this.f8473g;
            if (c1944g == null) {
                if (subscriptionCallback == null) {
                    AbstractC1949a.m64961l(this.f8468b, str);
                } else {
                    List m64985b = c1945h.m64985b();
                    List m64984c = c1945h.m64984c();
                    for (int size = m64985b.size() - 1; size >= 0; size--) {
                        if (m64985b.get(size) == subscriptionCallback) {
                            m64985b.remove(size);
                            m64984c.remove(size);
                        }
                    }
                    if (m64985b.size() == 0) {
                        AbstractC1949a.m64961l(this.f8468b, str);
                    }
                }
            } else {
                try {
                    if (subscriptionCallback == null) {
                        c1944g.m64991d(str, null, this.f8474h);
                    } else {
                        List m64985b2 = c1945h.m64985b();
                        List m64984c2 = c1945h.m64984c();
                        for (int size2 = m64985b2.size() - 1; size2 >= 0; size2--) {
                            if (m64985b2.get(size2) == subscriptionCallback) {
                                this.f8473g.m64991d(str, subscriptionCallback.f8461b, this.f8474h);
                                m64985b2.remove(size2);
                                m64984c2.remove(size2);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription failed with RemoteException parentId=");
                    sb.append(str);
                }
            }
            if (c1945h.m64983d() || subscriptionCallback == null) {
                this.f8471e.remove(str);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: o */
        public Bundle mo65001o() {
            return this.f8476j;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    /* loaded from: classes.dex */
    public static class C1941d extends C1933c {
        public C1941d(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C1933c, android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: l */
        public void mo65000l(String str, ItemCallback itemCallback) {
            if (this.f8473g == null) {
                AbstractC1955b.m64953b(this.f8468b, str, itemCallback.f8451a);
            } else {
                super.mo65000l(str, itemCallback);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    /* loaded from: classes.dex */
    public static class C1942e extends C1941d {
        public C1942e(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C1933c, android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: m */
        public void mo64999m(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.f8473g != null && this.f8472f >= 2) {
                super.mo64999m(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                AbstractC1949a.m64962k(this.f8468b, str, subscriptionCallback.f8460a);
            } else {
                AbstractC1958c.m64950b(this.f8468b, str, bundle, subscriptionCallback.f8460a);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C1933c, android.support.p001v4.media.MediaBrowserCompat.InterfaceC1932b
        /* renamed from: n */
        public void mo64998n(String str, SubscriptionCallback subscriptionCallback) {
            if (this.f8473g != null && this.f8472f >= 2) {
                super.mo64998n(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                AbstractC1949a.m64961l(this.f8468b, str);
            } else {
                AbstractC1958c.m64949c(this.f8468b, str, subscriptionCallback.f8460a);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1943f {
        /* renamed from: i */
        void mo64997i(Messenger messenger);

        /* renamed from: j */
        void mo64996j(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        /* renamed from: k */
        void mo64995k(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    /* loaded from: classes.dex */
    public static class C1944g {

        /* renamed from: a */
        public Messenger f8502a;

        /* renamed from: b */
        public Bundle f8503b;

        public C1944g(IBinder iBinder, Bundle bundle) {
            this.f8502a = new Messenger(iBinder);
            this.f8503b = bundle;
        }

        /* renamed from: a */
        public void m64994a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            BundleCompat.putBinder(bundle2, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            m64988g(3, bundle2, messenger);
        }

        /* renamed from: b */
        public void m64993b(String str, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            m64988g(5, bundle, messenger);
        }

        /* renamed from: c */
        public void m64992c(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f8503b);
            m64988g(6, bundle, messenger);
        }

        /* renamed from: d */
        public void m64991d(String str, IBinder iBinder, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            BundleCompat.putBinder(bundle, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            m64988g(4, bundle, messenger);
        }

        /* renamed from: e */
        public void m64990e(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_SEARCH_QUERY, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            m64988g(8, bundle2, messenger);
        }

        /* renamed from: f */
        public void m64989f(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_CUSTOM_ACTION, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            m64988g(9, bundle2, messenger);
        }

        /* renamed from: g */
        public final void m64988g(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f8502a.send(obtain);
        }

        /* renamed from: h */
        public void m64987h(Messenger messenger) {
            m64988g(7, null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    /* loaded from: classes.dex */
    public static class C1945h {

        /* renamed from: a */
        public final List f8504a = new ArrayList();

        /* renamed from: b */
        public final List f8505b = new ArrayList();

        /* renamed from: a */
        public SubscriptionCallback m64986a(Bundle bundle) {
            for (int i = 0; i < this.f8505b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.f8505b.get(i), bundle)) {
                    return (SubscriptionCallback) this.f8504a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List m64985b() {
            return this.f8504a;
        }

        /* renamed from: c */
        public List m64984c() {
            return this.f8505b;
        }

        /* renamed from: d */
        public boolean m64983d() {
            return this.f8504a.isEmpty();
        }

        /* renamed from: e */
        public void m64982e(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.f8505b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.f8505b.get(i), bundle)) {
                    this.f8504a.set(i, subscriptionCallback);
                    return;
                }
            }
            this.f8504a.add(subscriptionCallback);
            this.f8505b.add(bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f8444a = new C1942e(context, componentName, connectionCallback, bundle);
        } else if (i >= 23) {
            this.f8444a = new C1941d(context, componentName, connectionCallback, bundle);
        } else {
            this.f8444a = new C1933c(context, componentName, connectionCallback, bundle);
        }
    }

    public void connect() {
        this.f8444a.mo65004f();
    }

    public void disconnect() {
        this.f8444a.disconnect();
    }

    @Nullable
    public Bundle getExtras() {
        return this.f8444a.getExtras();
    }

    public void getItem(@NonNull String str, @NonNull ItemCallback itemCallback) {
        this.f8444a.mo65000l(str, itemCallback);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Bundle getNotifyChildrenChangedOptions() {
        return this.f8444a.mo65001o();
    }

    @NonNull
    public String getRoot() {
        return this.f8444a.getRoot();
    }

    @NonNull
    public ComponentName getServiceComponent() {
        return this.f8444a.mo65002h();
    }

    @NonNull
    public MediaSessionCompat.Token getSessionToken() {
        return this.f8444a.mo65009a();
    }

    public boolean isConnected() {
        return this.f8444a.isConnected();
    }

    public void search(@NonNull String str, Bundle bundle, @NonNull SearchCallback searchCallback) {
        if (!TextUtils.isEmpty(str)) {
            if (searchCallback != null) {
                this.f8444a.mo65003g(str, bundle, searchCallback);
                return;
            }
            throw new IllegalArgumentException("callback cannot be null");
        }
        throw new IllegalArgumentException("query cannot be empty");
    }

    public void sendCustomAction(@NonNull String str, Bundle bundle, @Nullable CustomActionCallback customActionCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.f8444a.mo65005e(str, bundle, customActionCallback);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void subscribe(@NonNull String str, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback != null) {
            this.f8444a.mo64999m(str, null, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public void unsubscribe(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8444a.mo64998n(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void unsubscribe(@NonNull String str, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback != null) {
            this.f8444a.mo64998n(str, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public void subscribe(@NonNull String str, @NonNull Bundle bundle, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle != null) {
            this.f8444a.mo64999m(str, bundle, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("options are null");
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C1928a();
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;

        /* renamed from: a */
        public final int f8455a;

        /* renamed from: b */
        public final MediaDescriptionCompat f8456b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$Flags */
        /* loaded from: classes.dex */
        public @interface Flags {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        /* loaded from: classes.dex */
        public static class C1928a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                    this.f8455a = i;
                    this.f8456b = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj != null) {
                return new MediaItem(MediaDescriptionCompat.fromMediaDescription(AbstractC1949a.C1952c.m64957a(obj)), AbstractC1949a.C1952c.m64956b(obj));
            }
            return null;
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(fromMediaItem(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NonNull
        public MediaDescriptionCompat getDescription() {
            return this.f8456b;
        }

        public int getFlags() {
            return this.f8455a;
        }

        @Nullable
        public String getMediaId() {
            return this.f8456b.getMediaId();
        }

        public boolean isBrowsable() {
            if ((this.f8455a & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isPlayable() {
            if ((this.f8455a & 2) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f8455a + ", mDescription=" + this.f8456b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8455a);
            this.f8456b.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f8455a = parcel.readInt();
            this.f8456b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
