package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
/* loaded from: classes2.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: c */
    public static Method f36016c;

    /* renamed from: a */
    public AudioAttributes f36017a;

    /* renamed from: b */
    public int f36018b;

    public AudioAttributesImplApi21() {
        this.f36018b = -1;
    }

    /* renamed from: c */
    public static AudioAttributesImpl m54023c(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable("androidx.media.audio_attrs.FRAMEWORKS")) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    /* renamed from: d */
    public static Method m54022d() {
        try {
            if (f36016c == null) {
                f36016c = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
            return f36016c;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public int mo54021a() {
        return this.f36018b;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: b */
    public Object mo54020b() {
        return this.f36017a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f36017a.equals(((AudioAttributesImplApi21) obj).f36017a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f36017a.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f36017a.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i = this.f36018b;
        if (i != -1) {
            return i;
        }
        Method m54022d = m54022d();
        if (m54022d == null) {
            Log.w("AudioAttributesCompat21", "No AudioAttributes#toLegacyStreamType() on API: " + Build.VERSION.SDK_INT);
            return -1;
        }
        try {
            return ((Integer) m54022d.invoke(null, this.f36017a)).intValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("AudioAttributesCompat21", "getLegacyStreamType() failed on API: " + Build.VERSION.SDK_INT, e);
            return -1;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.f36017a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        int volumeControlStream;
        if (Build.VERSION.SDK_INT >= 26) {
            volumeControlStream = this.f36017a.getVolumeControlStream();
            return volumeControlStream;
        }
        return AudioAttributesCompat.m54027c(true, getFlags(), getUsage());
    }

    public int hashCode() {
        return this.f36017a.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.media.audio_attrs.FRAMEWORKS", this.f36017a);
        int i = this.f36018b;
        if (i != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i);
        }
        return bundle;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f36017a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f36017a = audioAttributes;
        this.f36018b = i;
    }
}
