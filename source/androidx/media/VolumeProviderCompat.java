package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompatApi21;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;

    /* renamed from: a */
    public final int f36134a;

    /* renamed from: b */
    public final int f36135b;

    /* renamed from: c */
    public int f36136c;

    /* renamed from: d */
    public Callback f36137d;

    /* renamed from: e */
    public Object f36138e;

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface ControlType {
    }

    /* renamed from: androidx.media.VolumeProviderCompat$a */
    /* loaded from: classes2.dex */
    public class C4793a implements VolumeProviderCompatApi21.Delegate {
        public C4793a() {
        }

        @Override // androidx.media.VolumeProviderCompatApi21.Delegate
        public void onAdjustVolume(int i) {
            VolumeProviderCompat.this.onAdjustVolume(i);
        }

        @Override // androidx.media.VolumeProviderCompatApi21.Delegate
        public void onSetVolumeTo(int i) {
            VolumeProviderCompat.this.onSetVolumeTo(i);
        }
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this.f36134a = i;
        this.f36135b = i2;
        this.f36136c = i3;
    }

    public final int getCurrentVolume() {
        return this.f36136c;
    }

    public final int getMaxVolume() {
        return this.f36135b;
    }

    public final int getVolumeControl() {
        return this.f36134a;
    }

    public Object getVolumeProvider() {
        if (this.f36138e == null) {
            this.f36138e = VolumeProviderCompatApi21.m53958a(this.f36134a, this.f36135b, this.f36136c, new C4793a());
        }
        return this.f36138e;
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public void setCallback(Callback callback) {
        this.f36137d = callback;
    }

    public final void setCurrentVolume(int i) {
        this.f36136c = i;
        Object volumeProvider = getVolumeProvider();
        if (volumeProvider != null) {
            VolumeProviderCompatApi21.m53957b(volumeProvider, i);
        }
        Callback callback = this.f36137d;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }
}
