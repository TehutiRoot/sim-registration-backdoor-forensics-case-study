package androidx.media;

import android.media.VolumeProvider;

/* loaded from: classes2.dex */
public abstract class VolumeProviderCompatApi21 {

    /* loaded from: classes2.dex */
    public interface Delegate {
        void onAdjustVolume(int i);

        void onSetVolumeTo(int i);
    }

    /* renamed from: androidx.media.VolumeProviderCompatApi21$a */
    /* loaded from: classes2.dex */
    public static class C4794a extends VolumeProvider {

        /* renamed from: a */
        public final /* synthetic */ Delegate f36140a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4794a(int i, int i2, int i3, Delegate delegate) {
            super(i, i2, i3);
            this.f36140a = delegate;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            this.f36140a.onAdjustVolume(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            this.f36140a.onSetVolumeTo(i);
        }
    }

    /* renamed from: a */
    public static Object m53958a(int i, int i2, int i3, Delegate delegate) {
        return new C4794a(i, i2, i3, delegate);
    }

    /* renamed from: b */
    public static void m53957b(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
