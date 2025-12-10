package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public final class Palette {

    /* renamed from: f */
    public static final Filter f36423f = new C4835a();

    /* renamed from: a */
    public final List f36424a;

    /* renamed from: b */
    public final List f36425b;

    /* renamed from: d */
    public final SparseBooleanArray f36427d = new SparseBooleanArray();

    /* renamed from: c */
    public final Map f36426c = new ArrayMap();

    /* renamed from: e */
    public final Swatch f36428e = m53816a();

    /* loaded from: classes2.dex */
    public interface Filter {
        boolean isAllowed(@ColorInt int i, @NonNull float[] fArr);
    }

    /* loaded from: classes2.dex */
    public interface PaletteAsyncListener {
        void onGenerated(@Nullable Palette palette);
    }

    /* loaded from: classes2.dex */
    public static final class Swatch {

        /* renamed from: a */
        public final int f36439a;

        /* renamed from: b */
        public final int f36440b;

        /* renamed from: c */
        public final int f36441c;

        /* renamed from: d */
        public final int f36442d;

        /* renamed from: e */
        public final int f36443e;

        /* renamed from: f */
        public boolean f36444f;

        /* renamed from: g */
        public int f36445g;

        /* renamed from: h */
        public int f36446h;

        /* renamed from: i */
        public float[] f36447i;

        public Swatch(@ColorInt int i, int i2) {
            this.f36439a = Color.red(i);
            this.f36440b = Color.green(i);
            this.f36441c = Color.blue(i);
            this.f36442d = i;
            this.f36443e = i2;
        }

        /* renamed from: a */
        public final void m53806a() {
            int alphaComponent;
            int alphaComponent2;
            if (!this.f36444f) {
                int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.f36442d, 4.5f);
                int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.f36442d, 3.0f);
                if (calculateMinimumAlpha != -1 && calculateMinimumAlpha2 != -1) {
                    this.f36446h = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                    this.f36445g = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                    this.f36444f = true;
                    return;
                }
                int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(-16777216, this.f36442d, 4.5f);
                int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(-16777216, this.f36442d, 3.0f);
                if (calculateMinimumAlpha3 != -1 && calculateMinimumAlpha4 != -1) {
                    this.f36446h = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                    this.f36445g = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                    this.f36444f = true;
                    return;
                }
                if (calculateMinimumAlpha != -1) {
                    alphaComponent = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                } else {
                    alphaComponent = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                }
                this.f36446h = alphaComponent;
                if (calculateMinimumAlpha2 != -1) {
                    alphaComponent2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                } else {
                    alphaComponent2 = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                }
                this.f36445g = alphaComponent2;
                this.f36444f = true;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Swatch.class != obj.getClass()) {
                return false;
            }
            Swatch swatch = (Swatch) obj;
            if (this.f36443e == swatch.f36443e && this.f36442d == swatch.f36442d) {
                return true;
            }
            return false;
        }

        @ColorInt
        public int getBodyTextColor() {
            m53806a();
            return this.f36446h;
        }

        @NonNull
        public float[] getHsl() {
            if (this.f36447i == null) {
                this.f36447i = new float[3];
            }
            ColorUtils.RGBToHSL(this.f36439a, this.f36440b, this.f36441c, this.f36447i);
            return this.f36447i;
        }

        public int getPopulation() {
            return this.f36443e;
        }

        @ColorInt
        public int getRgb() {
            return this.f36442d;
        }

        @ColorInt
        public int getTitleTextColor() {
            m53806a();
            return this.f36445g;
        }

        public int hashCode() {
            return (this.f36442d * 31) + this.f36443e;
        }

        public String toString() {
            return Swatch.class.getSimpleName() + " [RGB: #" + Integer.toHexString(getRgb()) + AbstractJsonLexerKt.END_LIST + " [HSL: " + Arrays.toString(getHsl()) + AbstractJsonLexerKt.END_LIST + " [Population: " + this.f36443e + AbstractJsonLexerKt.END_LIST + " [Title Text: #" + Integer.toHexString(getTitleTextColor()) + AbstractJsonLexerKt.END_LIST + " [Body Text: #" + Integer.toHexString(getBodyTextColor()) + AbstractJsonLexerKt.END_LIST;
        }
    }

    /* renamed from: androidx.palette.graphics.Palette$a */
    /* loaded from: classes2.dex */
    public static class C4835a implements Filter {
        /* renamed from: a */
        public final boolean m53805a(float[] fArr) {
            if (fArr[2] <= 0.05f) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m53804b(float[] fArr) {
            float f = fArr[0];
            if (f < 10.0f || f > 37.0f || fArr[1] > 0.82f) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m53803c(float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return true;
            }
            return false;
        }

        @Override // androidx.palette.graphics.Palette.Filter
        public boolean isAllowed(int i, float[] fArr) {
            if (!m53803c(fArr) && !m53805a(fArr) && !m53804b(fArr)) {
                return true;
            }
            return false;
        }
    }

    public Palette(List list, List list2) {
        this.f36424a = list;
        this.f36425b = list2;
    }

    @NonNull
    public static Builder from(@NonNull Bitmap bitmap) {
        return new Builder(bitmap);
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap) {
        return from(bitmap).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).generate(paletteAsyncListener);
    }

    /* renamed from: a */
    public final Swatch m53816a() {
        int size = this.f36424a.size();
        int i = Integer.MIN_VALUE;
        Swatch swatch = null;
        for (int i2 = 0; i2 < size; i2++) {
            Swatch swatch2 = (Swatch) this.f36424a.get(i2);
            if (swatch2.getPopulation() > i) {
                i = swatch2.getPopulation();
                swatch = swatch2;
            }
        }
        return swatch;
    }

    /* renamed from: b */
    public void m53815b() {
        int size = this.f36425b.size();
        for (int i = 0; i < size; i++) {
            Target target = (Target) this.f36425b.get(i);
            target.m53802a();
            this.f36426c.put(target, m53813d(target));
        }
        this.f36427d.clear();
    }

    /* renamed from: c */
    public final float m53814c(Swatch swatch, Target target) {
        int i;
        float f;
        float f2;
        float[] hsl = swatch.getHsl();
        Swatch swatch2 = this.f36428e;
        if (swatch2 != null) {
            i = swatch2.getPopulation();
        } else {
            i = 1;
        }
        float f3 = 0.0f;
        if (target.getSaturationWeight() > 0.0f) {
            f = target.getSaturationWeight() * (1.0f - Math.abs(hsl[1] - target.getTargetSaturation()));
        } else {
            f = 0.0f;
        }
        if (target.getLightnessWeight() > 0.0f) {
            f2 = target.getLightnessWeight() * (1.0f - Math.abs(hsl[2] - target.getTargetLightness()));
        } else {
            f2 = 0.0f;
        }
        if (target.getPopulationWeight() > 0.0f) {
            f3 = target.getPopulationWeight() * (swatch.getPopulation() / i);
        }
        return f + f2 + f3;
    }

    /* renamed from: d */
    public final Swatch m53813d(Target target) {
        Swatch m53812e = m53812e(target);
        if (m53812e != null && target.isExclusive()) {
            this.f36427d.append(m53812e.getRgb(), true);
        }
        return m53812e;
    }

    /* renamed from: e */
    public final Swatch m53812e(Target target) {
        int size = this.f36424a.size();
        float f = 0.0f;
        Swatch swatch = null;
        for (int i = 0; i < size; i++) {
            Swatch swatch2 = (Swatch) this.f36424a.get(i);
            if (m53811f(swatch2, target)) {
                float m53814c = m53814c(swatch2, target);
                if (swatch == null || m53814c > f) {
                    swatch = swatch2;
                    f = m53814c;
                }
            }
        }
        return swatch;
    }

    /* renamed from: f */
    public final boolean m53811f(Swatch swatch, Target target) {
        float[] hsl = swatch.getHsl();
        if (hsl[1] >= target.getMinimumSaturation() && hsl[1] <= target.getMaximumSaturation() && hsl[2] >= target.getMinimumLightness() && hsl[2] <= target.getMaximumLightness() && !this.f36427d.get(swatch.getRgb())) {
            return true;
        }
        return false;
    }

    @ColorInt
    public int getColorForTarget(@NonNull Target target, @ColorInt int i) {
        Swatch swatchForTarget = getSwatchForTarget(target);
        if (swatchForTarget != null) {
            return swatchForTarget.getRgb();
        }
        return i;
    }

    @ColorInt
    public int getDarkMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_MUTED, i);
    }

    @Nullable
    public Swatch getDarkMutedSwatch() {
        return getSwatchForTarget(Target.DARK_MUTED);
    }

    @ColorInt
    public int getDarkVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_VIBRANT, i);
    }

    @Nullable
    public Swatch getDarkVibrantSwatch() {
        return getSwatchForTarget(Target.DARK_VIBRANT);
    }

    @ColorInt
    public int getDominantColor(@ColorInt int i) {
        Swatch swatch = this.f36428e;
        if (swatch != null) {
            return swatch.getRgb();
        }
        return i;
    }

    @Nullable
    public Swatch getDominantSwatch() {
        return this.f36428e;
    }

    @ColorInt
    public int getLightMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_MUTED, i);
    }

    @Nullable
    public Swatch getLightMutedSwatch() {
        return getSwatchForTarget(Target.LIGHT_MUTED);
    }

    @ColorInt
    public int getLightVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_VIBRANT, i);
    }

    @Nullable
    public Swatch getLightVibrantSwatch() {
        return getSwatchForTarget(Target.LIGHT_VIBRANT);
    }

    @ColorInt
    public int getMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.MUTED, i);
    }

    @Nullable
    public Swatch getMutedSwatch() {
        return getSwatchForTarget(Target.MUTED);
    }

    @Nullable
    public Swatch getSwatchForTarget(@NonNull Target target) {
        return (Swatch) this.f36426c.get(target);
    }

    @NonNull
    public List<Swatch> getSwatches() {
        return Collections.unmodifiableList(this.f36424a);
    }

    @NonNull
    public List<Target> getTargets() {
        return Collections.unmodifiableList(this.f36425b);
    }

    @ColorInt
    public int getVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.VIBRANT, i);
    }

    @Nullable
    public Swatch getVibrantSwatch() {
        return getSwatchForTarget(Target.VIBRANT);
    }

    @NonNull
    public static Palette from(@NonNull List<Swatch> list) {
        return new Builder(list).generate();
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap, int i) {
        return from(bitmap).maximumColorCount(i).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, int i, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).maximumColorCount(i).generate(paletteAsyncListener);
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f36429a;

        /* renamed from: b */
        public final Bitmap f36430b;

        /* renamed from: c */
        public final List f36431c;

        /* renamed from: d */
        public int f36432d;

        /* renamed from: e */
        public int f36433e;

        /* renamed from: f */
        public int f36434f;

        /* renamed from: g */
        public final List f36435g;

        /* renamed from: h */
        public Rect f36436h;

        /* renamed from: androidx.palette.graphics.Palette$Builder$a */
        /* loaded from: classes2.dex */
        public class AsyncTaskC4834a extends AsyncTask {

            /* renamed from: a */
            public final /* synthetic */ PaletteAsyncListener f36437a;

            public AsyncTaskC4834a(PaletteAsyncListener paletteAsyncListener) {
                this.f36437a = paletteAsyncListener;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Palette doInBackground(Bitmap... bitmapArr) {
                try {
                    return Builder.this.generate();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: b */
            public void onPostExecute(Palette palette) {
                this.f36437a.onGenerated(palette);
            }
        }

        public Builder(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f36431c = arrayList;
            this.f36432d = 16;
            this.f36433e = 12544;
            this.f36434f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f36435g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(Palette.f36423f);
                this.f36430b = bitmap;
                this.f36429a = null;
                arrayList.add(Target.LIGHT_VIBRANT);
                arrayList.add(Target.VIBRANT);
                arrayList.add(Target.DARK_VIBRANT);
                arrayList.add(Target.LIGHT_MUTED);
                arrayList.add(Target.MUTED);
                arrayList.add(Target.DARK_MUTED);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        /* renamed from: a */
        public final int[] m53810a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f36436h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f36436h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f36436h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        @NonNull
        public Builder addFilter(Filter filter) {
            if (filter != null) {
                this.f36435g.add(filter);
            }
            return this;
        }

        @NonNull
        public Builder addTarget(@NonNull Target target) {
            if (!this.f36431c.contains(target)) {
                this.f36431c.add(target);
            }
            return this;
        }

        /* renamed from: b */
        public final Bitmap m53809b(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f36433e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f36433e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f36434f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f36434f)) {
                d = i / max;
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }

        @NonNull
        public Builder clearFilters() {
            this.f36435g.clear();
            return this;
        }

        @NonNull
        public Builder clearRegion() {
            this.f36436h = null;
            return this;
        }

        @NonNull
        public Builder clearTargets() {
            List list = this.f36431c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @NonNull
        public Palette generate() {
            List list;
            Filter[] filterArr;
            Bitmap bitmap = this.f36430b;
            if (bitmap != null) {
                Bitmap m53809b = m53809b(bitmap);
                Rect rect = this.f36436h;
                if (m53809b != this.f36430b && rect != null) {
                    double width = m53809b.getWidth() / this.f36430b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), m53809b.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), m53809b.getHeight());
                }
                int[] m53810a = m53810a(m53809b);
                int i = this.f36432d;
                if (this.f36435g.isEmpty()) {
                    filterArr = null;
                } else {
                    List list2 = this.f36435g;
                    filterArr = (Filter[]) list2.toArray(new Filter[list2.size()]);
                }
                C4836a c4836a = new C4836a(m53810a, i, filterArr);
                if (m53809b != this.f36430b) {
                    m53809b.recycle();
                }
                list = c4836a.m53791d();
            } else {
                list = this.f36429a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            Palette palette = new Palette(list, this.f36431c);
            palette.m53815b();
            return palette;
        }

        @NonNull
        public Builder maximumColorCount(int i) {
            this.f36432d = i;
            return this;
        }

        @NonNull
        public Builder resizeBitmapArea(int i) {
            this.f36433e = i;
            this.f36434f = -1;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder resizeBitmapSize(int i) {
            this.f36434f = i;
            this.f36433e = -1;
            return this;
        }

        @NonNull
        public Builder setRegion(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, @InterfaceC2055Px int i3, @InterfaceC2055Px int i4) {
            if (this.f36430b != null) {
                if (this.f36436h == null) {
                    this.f36436h = new Rect();
                }
                this.f36436h.set(0, 0, this.f36430b.getWidth(), this.f36430b.getHeight());
                if (!this.f36436h.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public Builder(@NonNull List<Swatch> list) {
            this.f36431c = new ArrayList();
            this.f36432d = 16;
            this.f36433e = 12544;
            this.f36434f = -1;
            ArrayList arrayList = new ArrayList();
            this.f36435g = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(Palette.f36423f);
                this.f36429a = list;
                this.f36430b = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }

        @NonNull
        public AsyncTask<Bitmap, Void, Palette> generate(@NonNull PaletteAsyncListener paletteAsyncListener) {
            if (paletteAsyncListener != null) {
                return new AsyncTaskC4834a(paletteAsyncListener).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f36430b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }
    }
}
