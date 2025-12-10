package android.support.p001v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;

/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public abstract class AbstractC1937b {

    /* renamed from: android.support.v4.media.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1938a {
        /* renamed from: a */
        void mo64903a(Parcel parcel);

        void onError(String str);
    }

    /* renamed from: android.support.v4.media.b$b */
    /* loaded from: classes.dex */
    public static class C1939b extends MediaBrowser.ItemCallback {

        /* renamed from: a */
        public final InterfaceC1938a f8624a;

        public C1939b(InterfaceC1938a interfaceC1938a) {
            this.f8624a = interfaceC1938a;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(String str) {
            this.f8624a.onError(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f8624a.mo64903a(null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f8624a.mo64903a(obtain);
        }
    }

    /* renamed from: a */
    public static Object m64905a(InterfaceC1938a interfaceC1938a) {
        return new C1939b(interfaceC1938a);
    }

    /* renamed from: b */
    public static void m64904b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, AbstractC17396Br0.m69046a(obj2));
    }
}