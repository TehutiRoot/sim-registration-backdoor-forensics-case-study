package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface TrustedWebActivityDisplayMode {
    public static final String KEY_ID = "androidx.browser.trusted.displaymode.KEY_ID";

    /* loaded from: classes.dex */
    public static class DefaultMode implements TrustedWebActivityDisplayMode {
        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 0);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class ImmersiveMode implements TrustedWebActivityDisplayMode {
        public static final String KEY_CUTOUT_MODE = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        public static final String KEY_STICKY = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* renamed from: a */
        public final boolean f10309a;

        /* renamed from: b */
        public final int f10310b;

        public ImmersiveMode(boolean z, int i) {
            this.f10309a = z;
            this.f10310b = i;
        }

        /* renamed from: a */
        public static TrustedWebActivityDisplayMode m63957a(Bundle bundle) {
            return new ImmersiveMode(bundle.getBoolean(KEY_STICKY), bundle.getInt(KEY_CUTOUT_MODE));
        }

        public boolean isSticky() {
            return this.f10309a;
        }

        public int layoutInDisplayCutoutMode() {
            return this.f10310b;
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 1);
            bundle.putBoolean(KEY_STICKY, this.f10309a);
            bundle.putInt(KEY_CUTOUT_MODE, this.f10310b);
            return bundle;
        }
    }

    @NonNull
    Bundle toBundle();
}