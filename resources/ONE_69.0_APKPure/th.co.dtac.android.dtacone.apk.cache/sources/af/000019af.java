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
import android.support.p001v4.media.AbstractC1931a;
import android.support.p001v4.media.AbstractC1937b;
import android.support.p001v4.media.AbstractC1940c;
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
    public static final boolean f8531b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final InterfaceC1914b f8532a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback */
    /* loaded from: classes.dex */
    public static class ConnectionCallback {

        /* renamed from: a */
        public final Object f8533a = AbstractC1931a.m64921c(new C1908b());

        /* renamed from: b */
        public InterfaceC1907a f8534b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$a */
        /* loaded from: classes.dex */
        public interface InterfaceC1907a {
            /* renamed from: b */
            void mo64959b();

            /* renamed from: c */
            void mo64958c();

            /* renamed from: d */
            void mo64957d();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$b */
        /* loaded from: classes.dex */
        public class C1908b implements AbstractC1931a.InterfaceC1932a {
            public C1908b() {
            }

            @Override // android.support.p001v4.media.AbstractC1931a.InterfaceC1932a
            /* renamed from: b */
            public void mo64911b() {
                InterfaceC1907a interfaceC1907a = ConnectionCallback.this.f8534b;
                if (interfaceC1907a != null) {
                    interfaceC1907a.mo64959b();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }

            @Override // android.support.p001v4.media.AbstractC1931a.InterfaceC1932a
            /* renamed from: c */
            public void mo64910c() {
                InterfaceC1907a interfaceC1907a = ConnectionCallback.this.f8534b;
                if (interfaceC1907a != null) {
                    interfaceC1907a.mo64958c();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.support.p001v4.media.AbstractC1931a.InterfaceC1932a
            /* renamed from: d */
            public void mo64909d() {
                InterfaceC1907a interfaceC1907a = ConnectionCallback.this.f8534b;
                if (interfaceC1907a != null) {
                    interfaceC1907a.mo64957d();
                }
                ConnectionCallback.this.onConnectionFailed();
            }
        }

        /* renamed from: a */
        public void m64966a(InterfaceC1907a interfaceC1907a) {
            this.f8534b = interfaceC1907a;
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
        public final String f8536d;

        /* renamed from: e */
        public final Bundle f8537e;

        /* renamed from: f */
        public final CustomActionCallback f8538f;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.f8536d = str;
            this.f8537e = bundle;
            this.f8538f = customActionCallback;
        }

        @Override // android.support.p001v4.p002os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (this.f8538f == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f8537e + ", resultData=" + bundle + ")");
                        return;
                    }
                    this.f8538f.onProgressUpdate(this.f8536d, this.f8537e, bundle);
                    return;
                }
                this.f8538f.onResult(this.f8536d, this.f8537e, bundle);
                return;
            }
            this.f8538f.onError(this.f8536d, this.f8537e, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback */
    /* loaded from: classes.dex */
    public static abstract class ItemCallback {

        /* renamed from: a */
        public final Object f8539a;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback$a */
        /* loaded from: classes.dex */
        public class C1909a implements AbstractC1937b.InterfaceC1938a {
            public C1909a() {
            }

            @Override // android.support.p001v4.media.AbstractC1937b.InterfaceC1938a
            /* renamed from: a */
            public void mo64903a(Parcel parcel) {
                if (parcel == null) {
                    ItemCallback.this.onItemLoaded(null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                ItemCallback.this.onItemLoaded(MediaItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.support.p001v4.media.AbstractC1937b.InterfaceC1938a
            public void onError(String str) {
                ItemCallback.this.onError(str);
            }
        }

        public ItemCallback() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f8539a = AbstractC1937b.m64905a(new C1909a());
            } else {
                this.f8539a = null;
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
        public final String f8541d;

        /* renamed from: e */
        public final ItemCallback f8542e;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.f8541d = str;
            this.f8542e = itemCallback;
        }

        @Override // android.support.p001v4.p002os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i == 0 && bundle != null && bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    this.f8542e.onError(this.f8541d);
                    return;
                } else {
                    this.f8542e.onItemLoaded((MediaItem) parcelable);
                    return;
                }
            }
            this.f8542e.onError(this.f8541d);
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
        public final String f8545d;

        /* renamed from: e */
        public final Bundle f8546e;

        /* renamed from: f */
        public final SearchCallback f8547f;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.f8545d = str;
            this.f8546e = bundle;
            this.f8547f = searchCallback;
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
                this.f8547f.onSearchResult(this.f8545d, this.f8546e, arrayList);
                return;
            }
            this.f8547f.onError(this.f8545d, this.f8546e);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback */
    /* loaded from: classes.dex */
    public static abstract class SubscriptionCallback {

        /* renamed from: a */
        public final Object f8548a;

        /* renamed from: b */
        public final IBinder f8549b = new Binder();

        /* renamed from: c */
        public WeakReference f8550c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$a */
        /* loaded from: classes.dex */
        public class C1911a implements AbstractC1931a.InterfaceC1935d {
            public C1911a() {
            }

            @Override // android.support.p001v4.media.AbstractC1931a.InterfaceC1935d
            /* renamed from: a */
            public void mo64906a(String str, List list) {
                C1927h c1927h;
                WeakReference weakReference = SubscriptionCallback.this.f8550c;
                if (weakReference == null) {
                    c1927h = null;
                } else {
                    c1927h = (C1927h) weakReference.get();
                }
                if (c1927h == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);
                List m64936b = c1927h.m64936b();
                List m64935c = c1927h.m64935c();
                for (int i = 0; i < m64936b.size(); i++) {
                    Bundle bundle = (Bundle) m64935c.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, fromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, m64962d(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            /* renamed from: d */
            public List m64962d(List list, Bundle bundle) {
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

            @Override // android.support.p001v4.media.AbstractC1931a.InterfaceC1935d
            public void onError(String str) {
                SubscriptionCallback.this.onError(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$b */
        /* loaded from: classes.dex */
        public class C1912b extends C1911a implements AbstractC1940c.InterfaceC1941a {
            public C1912b() {
                super();
            }

            @Override // android.support.p001v4.media.AbstractC1940c.InterfaceC1941a
            /* renamed from: b */
            public void mo64899b(String str, Bundle bundle) {
                SubscriptionCallback.this.onError(str, bundle);
            }

            @Override // android.support.p001v4.media.AbstractC1940c.InterfaceC1941a
            /* renamed from: c */
            public void mo64898c(String str, List list, Bundle bundle) {
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }
        }

        public SubscriptionCallback() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f8548a = AbstractC1940c.m64902a(new C1912b());
            } else {
                this.f8548a = AbstractC1931a.m64920d(new C1911a());
            }
        }

        /* renamed from: a */
        public void m64963a(C1927h c1927h) {
            this.f8550c = new WeakReference(c1927h);
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
    public static class HandlerC1913a extends Handler {

        /* renamed from: a */
        public final WeakReference f8553a;

        /* renamed from: b */
        public WeakReference f8554b;

        public HandlerC1913a(InterfaceC1925f interfaceC1925f) {
            this.f8553a = new WeakReference(interfaceC1925f);
        }

        /* renamed from: a */
        public void m64961a(Messenger messenger) {
            this.f8554b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f8554b;
            if (weakReference != null && weakReference.get() != null && this.f8553a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                InterfaceC1925f interfaceC1925f = (InterfaceC1925f) this.f8553a.get();
                Messenger messenger = (Messenger) this.f8554b.get();
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
                                interfaceC1925f.mo64947j(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle, bundle2);
                            }
                        } else {
                            interfaceC1925f.mo64948i(messenger);
                        }
                    } else {
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        interfaceC1925f.mo64946k(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        interfaceC1925f.mo64948i(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1914b {
        /* renamed from: a */
        MediaSessionCompat.Token mo64960a();

        void disconnect();

        /* renamed from: e */
        void mo64956e(String str, Bundle bundle, CustomActionCallback customActionCallback);

        /* renamed from: f */
        void mo64955f();

        /* renamed from: g */
        void mo64954g(String str, Bundle bundle, SearchCallback searchCallback);

        Bundle getExtras();

        String getRoot();

        /* renamed from: h */
        ComponentName mo64953h();

        boolean isConnected();

        /* renamed from: l */
        void mo64951l(String str, ItemCallback itemCallback);

        /* renamed from: m */
        void mo64950m(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        /* renamed from: n */
        void mo64949n(String str, SubscriptionCallback subscriptionCallback);

        /* renamed from: o */
        Bundle mo64952o();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    /* loaded from: classes.dex */
    public static class C1915c implements InterfaceC1914b, InterfaceC1925f, ConnectionCallback.InterfaceC1907a {

        /* renamed from: a */
        public final Context f8555a;

        /* renamed from: b */
        public final Object f8556b;

        /* renamed from: c */
        public final Bundle f8557c;

        /* renamed from: d */
        public final HandlerC1913a f8558d = new HandlerC1913a(this);

        /* renamed from: e */
        public final ArrayMap f8559e = new ArrayMap();

        /* renamed from: f */
        public int f8560f;

        /* renamed from: g */
        public C1926g f8561g;

        /* renamed from: h */
        public Messenger f8562h;

        /* renamed from: i */
        public MediaSessionCompat.Token f8563i;

        /* renamed from: j */
        public Bundle f8564j;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        /* loaded from: classes.dex */
        public class RunnableC1916a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ItemCallback f8565a;

            /* renamed from: b */
            public final /* synthetic */ String f8566b;

            public RunnableC1916a(ItemCallback itemCallback, String str) {
                this.f8565a = itemCallback;
                this.f8566b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8565a.onError(this.f8566b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        /* loaded from: classes.dex */
        public class RunnableC1917b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ItemCallback f8568a;

            /* renamed from: b */
            public final /* synthetic */ String f8569b;

            public RunnableC1917b(ItemCallback itemCallback, String str) {
                this.f8568a = itemCallback;
                this.f8569b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8568a.onError(this.f8569b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$c */
        /* loaded from: classes.dex */
        public class RunnableC1918c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ItemCallback f8571a;

            /* renamed from: b */
            public final /* synthetic */ String f8572b;

            public RunnableC1918c(ItemCallback itemCallback, String str) {
                this.f8571a = itemCallback;
                this.f8572b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8571a.onError(this.f8572b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$d */
        /* loaded from: classes.dex */
        public class RunnableC1919d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ SearchCallback f8574a;

            /* renamed from: b */
            public final /* synthetic */ String f8575b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8576c;

            public RunnableC1919d(SearchCallback searchCallback, String str, Bundle bundle) {
                this.f8574a = searchCallback;
                this.f8575b = str;
                this.f8576c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8574a.onError(this.f8575b, this.f8576c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$e */
        /* loaded from: classes.dex */
        public class RunnableC1920e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ SearchCallback f8578a;

            /* renamed from: b */
            public final /* synthetic */ String f8579b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8580c;

            public RunnableC1920e(SearchCallback searchCallback, String str, Bundle bundle) {
                this.f8578a = searchCallback;
                this.f8579b = str;
                this.f8580c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8578a.onError(this.f8579b, this.f8580c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$f */
        /* loaded from: classes.dex */
        public class RunnableC1921f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CustomActionCallback f8582a;

            /* renamed from: b */
            public final /* synthetic */ String f8583b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8584c;

            public RunnableC1921f(CustomActionCallback customActionCallback, String str, Bundle bundle) {
                this.f8582a = customActionCallback;
                this.f8583b = str;
                this.f8584c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8582a.onError(this.f8583b, this.f8584c, null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$g */
        /* loaded from: classes.dex */
        public class RunnableC1922g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CustomActionCallback f8586a;

            /* renamed from: b */
            public final /* synthetic */ String f8587b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f8588c;

            public RunnableC1922g(CustomActionCallback customActionCallback, String str, Bundle bundle) {
                this.f8586a = customActionCallback;
                this.f8587b = str;
                this.f8588c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8586a.onError(this.f8587b, this.f8588c, null);
            }
        }

        public C1915c(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            Bundle bundle2;
            this.f8555a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f8557c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            connectionCallback.m64966a(this);
            this.f8556b = AbstractC1931a.m64922b(context, componentName, connectionCallback.f8533a, bundle2);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: a */
        public MediaSessionCompat.Token mo64960a() {
            if (this.f8563i == null) {
                this.f8563i = MediaSessionCompat.Token.fromToken(AbstractC1931a.m64915i(this.f8556b));
            }
            return this.f8563i;
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.ConnectionCallback.InterfaceC1907a
        /* renamed from: b */
        public void mo64959b() {
            this.f8561g = null;
            this.f8562h = null;
            this.f8563i = null;
            this.f8558d.m64961a(null);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.ConnectionCallback.InterfaceC1907a
        /* renamed from: c */
        public void mo64958c() {
            Bundle m64918f = AbstractC1931a.m64918f(this.f8556b);
            if (m64918f == null) {
                return;
            }
            this.f8560f = m64918f.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
            IBinder binder = BundleCompat.getBinder(m64918f, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
            if (binder != null) {
                this.f8561g = new C1926g(binder, this.f8557c);
                Messenger messenger = new Messenger(this.f8558d);
                this.f8562h = messenger;
                this.f8558d.m64961a(messenger);
                try {
                    this.f8561g.m64943c(this.f8555a, this.f8562h);
                } catch (RemoteException unused) {
                }
            }
            IMediaSession asInterface = IMediaSession.Stub.asInterface(BundleCompat.getBinder(m64918f, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
            if (asInterface != null) {
                this.f8563i = MediaSessionCompat.Token.fromToken(AbstractC1931a.m64915i(this.f8556b), asInterface);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.ConnectionCallback.InterfaceC1907a
        /* renamed from: d */
        public void mo64957d() {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        public void disconnect() {
            Messenger messenger;
            C1926g c1926g = this.f8561g;
            if (c1926g != null && (messenger = this.f8562h) != null) {
                try {
                    c1926g.m64938h(messenger);
                } catch (RemoteException unused) {
                }
            }
            AbstractC1931a.m64919e(this.f8556b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: e */
        public void mo64956e(String str, Bundle bundle, CustomActionCallback customActionCallback) {
            if (isConnected()) {
                if (this.f8561g == null && customActionCallback != null) {
                    this.f8558d.post(new RunnableC1921f(customActionCallback, str, bundle));
                }
                try {
                    this.f8561g.m64940f(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.f8558d), this.f8562h);
                    return;
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(str);
                    sb.append(", extras=");
                    sb.append(bundle);
                    if (customActionCallback != null) {
                        this.f8558d.post(new RunnableC1922g(customActionCallback, str, bundle));
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: f */
        public void mo64955f() {
            AbstractC1931a.m64923a(this.f8556b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: g */
        public void mo64954g(String str, Bundle bundle, SearchCallback searchCallback) {
            if (isConnected()) {
                if (this.f8561g == null) {
                    this.f8558d.post(new RunnableC1919d(searchCallback, str, bundle));
                    return;
                }
                try {
                    this.f8561g.m64941e(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.f8558d), this.f8562h);
                    return;
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error searching items with query: ");
                    sb.append(str);
                    this.f8558d.post(new RunnableC1920e(searchCallback, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected");
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        public Bundle getExtras() {
            return AbstractC1931a.m64918f(this.f8556b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        public String getRoot() {
            return AbstractC1931a.m64917g(this.f8556b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: h */
        public ComponentName mo64953h() {
            return AbstractC1931a.m64916h(this.f8556b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1925f
        /* renamed from: i */
        public void mo64948i(Messenger messenger) {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        public boolean isConnected() {
            return AbstractC1931a.m64914j(this.f8556b);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1925f
        /* renamed from: j */
        public void mo64947j(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f8562h != messenger) {
                return;
            }
            C1927h c1927h = (C1927h) this.f8559e.get(str);
            if (c1927h == null) {
                if (MediaBrowserCompat.f8531b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                    return;
                }
                return;
            }
            SubscriptionCallback m64937a = c1927h.m64937a(bundle);
            if (m64937a != null) {
                if (bundle == null) {
                    if (list == null) {
                        m64937a.onError(str);
                        return;
                    }
                    this.f8564j = bundle2;
                    m64937a.onChildrenLoaded(str, list);
                    this.f8564j = null;
                } else if (list == null) {
                    m64937a.onError(str, bundle);
                } else {
                    this.f8564j = bundle2;
                    m64937a.onChildrenLoaded(str, list, bundle);
                    this.f8564j = null;
                }
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1925f
        /* renamed from: k */
        public void mo64946k(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: l */
        public void mo64951l(String str, ItemCallback itemCallback) {
            if (!TextUtils.isEmpty(str)) {
                if (itemCallback != null) {
                    if (!AbstractC1931a.m64914j(this.f8556b)) {
                        this.f8558d.post(new RunnableC1916a(itemCallback, str));
                        return;
                    } else if (this.f8561g == null) {
                        this.f8558d.post(new RunnableC1917b(itemCallback, str));
                        return;
                    } else {
                        try {
                            this.f8561g.m64944b(str, new ItemReceiver(str, itemCallback, this.f8558d), this.f8562h);
                            return;
                        } catch (RemoteException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Remote error getting media item: ");
                            sb.append(str);
                            this.f8558d.post(new RunnableC1918c(itemCallback, str));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("cb is null");
            }
            throw new IllegalArgumentException("mediaId is empty");
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: m */
        public void mo64950m(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Bundle bundle2;
            C1927h c1927h = (C1927h) this.f8559e.get(str);
            if (c1927h == null) {
                c1927h = new C1927h();
                this.f8559e.put(str, c1927h);
            }
            subscriptionCallback.m64963a(c1927h);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            c1927h.m64933e(bundle2, subscriptionCallback);
            C1926g c1926g = this.f8561g;
            if (c1926g == null) {
                AbstractC1931a.m64913k(this.f8556b, str, subscriptionCallback.f8548a);
                return;
            }
            try {
                c1926g.m64945a(str, subscriptionCallback.f8549b, bundle2, this.f8562h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error subscribing media item: ");
                sb.append(str);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: n */
        public void mo64949n(String str, SubscriptionCallback subscriptionCallback) {
            C1927h c1927h = (C1927h) this.f8559e.get(str);
            if (c1927h == null) {
                return;
            }
            C1926g c1926g = this.f8561g;
            if (c1926g == null) {
                if (subscriptionCallback == null) {
                    AbstractC1931a.m64912l(this.f8556b, str);
                } else {
                    List m64936b = c1927h.m64936b();
                    List m64935c = c1927h.m64935c();
                    for (int size = m64936b.size() - 1; size >= 0; size--) {
                        if (m64936b.get(size) == subscriptionCallback) {
                            m64936b.remove(size);
                            m64935c.remove(size);
                        }
                    }
                    if (m64936b.size() == 0) {
                        AbstractC1931a.m64912l(this.f8556b, str);
                    }
                }
            } else {
                try {
                    if (subscriptionCallback == null) {
                        c1926g.m64942d(str, null, this.f8562h);
                    } else {
                        List m64936b2 = c1927h.m64936b();
                        List m64935c2 = c1927h.m64935c();
                        for (int size2 = m64936b2.size() - 1; size2 >= 0; size2--) {
                            if (m64936b2.get(size2) == subscriptionCallback) {
                                this.f8561g.m64942d(str, subscriptionCallback.f8549b, this.f8562h);
                                m64936b2.remove(size2);
                                m64935c2.remove(size2);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription failed with RemoteException parentId=");
                    sb.append(str);
                }
            }
            if (c1927h.m64934d() || subscriptionCallback == null) {
                this.f8559e.remove(str);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: o */
        public Bundle mo64952o() {
            return this.f8564j;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    /* loaded from: classes.dex */
    public static class C1923d extends C1915c {
        public C1923d(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C1915c, android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: l */
        public void mo64951l(String str, ItemCallback itemCallback) {
            if (this.f8561g == null) {
                AbstractC1937b.m64904b(this.f8556b, str, itemCallback.f8539a);
            } else {
                super.mo64951l(str, itemCallback);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    /* loaded from: classes.dex */
    public static class C1924e extends C1923d {
        public C1924e(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C1915c, android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: m */
        public void mo64950m(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.f8561g != null && this.f8560f >= 2) {
                super.mo64950m(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                AbstractC1931a.m64913k(this.f8556b, str, subscriptionCallback.f8548a);
            } else {
                AbstractC1940c.m64901b(this.f8556b, str, bundle, subscriptionCallback.f8548a);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C1915c, android.support.p001v4.media.MediaBrowserCompat.InterfaceC1914b
        /* renamed from: n */
        public void mo64949n(String str, SubscriptionCallback subscriptionCallback) {
            if (this.f8561g != null && this.f8560f >= 2) {
                super.mo64949n(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                AbstractC1931a.m64912l(this.f8556b, str);
            } else {
                AbstractC1940c.m64900c(this.f8556b, str, subscriptionCallback.f8548a);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1925f {
        /* renamed from: i */
        void mo64948i(Messenger messenger);

        /* renamed from: j */
        void mo64947j(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        /* renamed from: k */
        void mo64946k(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    /* loaded from: classes.dex */
    public static class C1926g {

        /* renamed from: a */
        public Messenger f8590a;

        /* renamed from: b */
        public Bundle f8591b;

        public C1926g(IBinder iBinder, Bundle bundle) {
            this.f8590a = new Messenger(iBinder);
            this.f8591b = bundle;
        }

        /* renamed from: a */
        public void m64945a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            BundleCompat.putBinder(bundle2, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            m64939g(3, bundle2, messenger);
        }

        /* renamed from: b */
        public void m64944b(String str, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            m64939g(5, bundle, messenger);
        }

        /* renamed from: c */
        public void m64943c(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f8591b);
            m64939g(6, bundle, messenger);
        }

        /* renamed from: d */
        public void m64942d(String str, IBinder iBinder, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            BundleCompat.putBinder(bundle, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            m64939g(4, bundle, messenger);
        }

        /* renamed from: e */
        public void m64941e(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_SEARCH_QUERY, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            m64939g(8, bundle2, messenger);
        }

        /* renamed from: f */
        public void m64940f(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_CUSTOM_ACTION, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            m64939g(9, bundle2, messenger);
        }

        /* renamed from: g */
        public final void m64939g(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f8590a.send(obtain);
        }

        /* renamed from: h */
        public void m64938h(Messenger messenger) {
            m64939g(7, null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    /* loaded from: classes.dex */
    public static class C1927h {

        /* renamed from: a */
        public final List f8592a = new ArrayList();

        /* renamed from: b */
        public final List f8593b = new ArrayList();

        /* renamed from: a */
        public SubscriptionCallback m64937a(Bundle bundle) {
            for (int i = 0; i < this.f8593b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.f8593b.get(i), bundle)) {
                    return (SubscriptionCallback) this.f8592a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List m64936b() {
            return this.f8592a;
        }

        /* renamed from: c */
        public List m64935c() {
            return this.f8593b;
        }

        /* renamed from: d */
        public boolean m64934d() {
            return this.f8592a.isEmpty();
        }

        /* renamed from: e */
        public void m64933e(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.f8593b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.f8593b.get(i), bundle)) {
                    this.f8592a.set(i, subscriptionCallback);
                    return;
                }
            }
            this.f8592a.add(subscriptionCallback);
            this.f8593b.add(bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f8532a = new C1924e(context, componentName, connectionCallback, bundle);
        } else if (i >= 23) {
            this.f8532a = new C1923d(context, componentName, connectionCallback, bundle);
        } else {
            this.f8532a = new C1915c(context, componentName, connectionCallback, bundle);
        }
    }

    public void connect() {
        this.f8532a.mo64955f();
    }

    public void disconnect() {
        this.f8532a.disconnect();
    }

    @Nullable
    public Bundle getExtras() {
        return this.f8532a.getExtras();
    }

    public void getItem(@NonNull String str, @NonNull ItemCallback itemCallback) {
        this.f8532a.mo64951l(str, itemCallback);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Bundle getNotifyChildrenChangedOptions() {
        return this.f8532a.mo64952o();
    }

    @NonNull
    public String getRoot() {
        return this.f8532a.getRoot();
    }

    @NonNull
    public ComponentName getServiceComponent() {
        return this.f8532a.mo64953h();
    }

    @NonNull
    public MediaSessionCompat.Token getSessionToken() {
        return this.f8532a.mo64960a();
    }

    public boolean isConnected() {
        return this.f8532a.isConnected();
    }

    public void search(@NonNull String str, Bundle bundle, @NonNull SearchCallback searchCallback) {
        if (!TextUtils.isEmpty(str)) {
            if (searchCallback != null) {
                this.f8532a.mo64954g(str, bundle, searchCallback);
                return;
            }
            throw new IllegalArgumentException("callback cannot be null");
        }
        throw new IllegalArgumentException("query cannot be empty");
    }

    public void sendCustomAction(@NonNull String str, Bundle bundle, @Nullable CustomActionCallback customActionCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.f8532a.mo64956e(str, bundle, customActionCallback);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void subscribe(@NonNull String str, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback != null) {
            this.f8532a.mo64950m(str, null, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public void unsubscribe(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8532a.mo64949n(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void unsubscribe(@NonNull String str, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback != null) {
            this.f8532a.mo64949n(str, subscriptionCallback);
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
            this.f8532a.mo64950m(str, bundle, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("options are null");
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C1910a();
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;

        /* renamed from: a */
        public final int f8543a;

        /* renamed from: b */
        public final MediaDescriptionCompat f8544b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$Flags */
        /* loaded from: classes.dex */
        public @interface Flags {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        /* loaded from: classes.dex */
        public static class C1910a implements Parcelable.Creator {
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
                    this.f8543a = i;
                    this.f8544b = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj != null) {
                return new MediaItem(MediaDescriptionCompat.fromMediaDescription(AbstractC1931a.C1934c.m64908a(obj)), AbstractC1931a.C1934c.m64907b(obj));
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
            return this.f8544b;
        }

        public int getFlags() {
            return this.f8543a;
        }

        @Nullable
        public String getMediaId() {
            return this.f8544b.getMediaId();
        }

        public boolean isBrowsable() {
            if ((this.f8543a & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isPlayable() {
            if ((this.f8543a & 2) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f8543a + ", mDescription=" + this.f8544b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8543a);
            this.f8544b.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f8543a = parcel.readInt();
            this.f8544b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}