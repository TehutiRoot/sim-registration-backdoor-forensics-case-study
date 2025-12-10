package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@RequiresApi(19)
/* loaded from: classes3.dex */
public class SizeConfigStrategy implements InterfaceC22504un0 {

    /* renamed from: d */
    public static final Bitmap.Config[] f42004d;

    /* renamed from: e */
    public static final Bitmap.Config[] f42005e;

    /* renamed from: f */
    public static final Bitmap.Config[] f42006f;

    /* renamed from: g */
    public static final Bitmap.Config[] f42007g;

    /* renamed from: h */
    public static final Bitmap.Config[] f42008h;

    /* renamed from: a */
    public final C5799c f42009a = new C5799c();

    /* renamed from: b */
    public final C19468d70 f42010b = new C19468d70();

    /* renamed from: c */
    public final Map f42011c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5797a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42012a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f42012a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42012a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42012a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42012a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$b */
    /* loaded from: classes3.dex */
    public static final class C5798b implements InterfaceC18444Sk1 {

        /* renamed from: a */
        public final C5799c f42013a;

        /* renamed from: b */
        public int f42014b;

        /* renamed from: c */
        public Bitmap.Config f42015c;

        public C5798b(C5799c c5799c) {
            this.f42013a = c5799c;
        }

        @Override // p000.InterfaceC18444Sk1
        /* renamed from: a */
        public void mo50393a() {
            this.f42013a.m67607c(this);
        }

        /* renamed from: b */
        public void m50392b(int i, Bitmap.Config config) {
            this.f42014b = i;
            this.f42015c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5798b)) {
                return false;
            }
            C5798b c5798b = (C5798b) obj;
            if (this.f42014b != c5798b.f42014b || !Util.bothNullOrEqual(this.f42015c, c5798b.f42015c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f42014b * 31;
            Bitmap.Config config = this.f42015c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return SizeConfigStrategy.m50396c(this.f42014b, this.f42015c);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$c */
    /* loaded from: classes3.dex */
    public static class C5799c extends AbstractC0748Ka {
        @Override // p000.AbstractC0748Ka
        /* renamed from: d */
        public C5798b mo50391a() {
            return new C5798b(this);
        }

        /* renamed from: e */
        public C5798b m50389e(int i, Bitmap.Config config) {
            C5798b c5798b = (C5798b) m67608b();
            c5798b.m50392b(i, config);
            return c5798b;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        f42004d = configArr;
        f42005e = configArr;
        f42006f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f42007g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f42008h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: c */
    public static String m50396c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: d */
    public static Bitmap.Config[] m50395d(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f42005e;
            }
        }
        int i = C5797a.f42012a[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{config} : f42008h;
                }
                return f42007g;
            }
            return f42006f;
        }
        return f42004d;
    }

    /* renamed from: a */
    public final void m50398a(Integer num, Bitmap bitmap) {
        NavigableMap m50394e = m50394e(bitmap.getConfig());
        Integer num2 = (Integer) m50394e.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m50394e.remove(num);
                return;
            } else {
                m50394e.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + logBitmap(bitmap) + ", this: " + this);
    }

    /* renamed from: b */
    public final C5798b m50397b(int i, Bitmap.Config config) {
        Bitmap.Config[] m50395d;
        C5798b m50389e = this.f42009a.m50389e(i, config);
        for (Bitmap.Config config2 : m50395d(config)) {
            Integer num = (Integer) m50394e(config2).ceilingKey(Integer.valueOf(i));
            if (num != null && num.intValue() <= i * 8) {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return m50389e;
                        }
                    } else if (config2.equals(config)) {
                        return m50389e;
                    }
                }
                this.f42009a.m67607c(m50389e);
                return this.f42009a.m50389e(num.intValue(), config2);
            }
        }
        return m50389e;
    }

    /* renamed from: e */
    public final NavigableMap m50394e(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f42011c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f42011c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // p000.InterfaceC22504un0
    @Nullable
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        C5798b m50397b = m50397b(Util.getBitmapByteSize(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f42010b.m31930a(m50397b);
        if (bitmap != null) {
            m50398a(Integer.valueOf(m50397b.f42014b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    @Override // p000.InterfaceC22504un0
    public int getSize(Bitmap bitmap) {
        return Util.getBitmapByteSize(bitmap);
    }

    @Override // p000.InterfaceC22504un0
    public String logBitmap(Bitmap bitmap) {
        return m50396c(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
    }

    @Override // p000.InterfaceC22504un0
    public void put(Bitmap bitmap) {
        C5798b m50389e = this.f42009a.m50389e(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
        this.f42010b.m31927d(m50389e, bitmap);
        NavigableMap m50394e = m50394e(bitmap.getConfig());
        Integer num = (Integer) m50394e.get(Integer.valueOf(m50389e.f42014b));
        Integer valueOf = Integer.valueOf(m50389e.f42014b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        m50394e.put(valueOf, Integer.valueOf(i));
    }

    @Override // p000.InterfaceC22504un0
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f42010b.m31925f();
        if (bitmap != null) {
            m50398a(Integer.valueOf(Util.getBitmapByteSize(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f42010b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f42011c.entrySet()) {
            sb.append(entry.getKey());
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f42011c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @Override // p000.InterfaceC22504un0
    public String logBitmap(int i, int i2, Bitmap.Config config) {
        return m50396c(Util.getBitmapByteSize(i, i2, config), config);
    }
}
