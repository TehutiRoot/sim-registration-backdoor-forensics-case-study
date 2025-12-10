package com.tom_roush.fontbox.cff;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CFFCharset {

    /* renamed from: a */
    public final boolean f59243a;

    /* renamed from: b */
    public final Map f59244b = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: c */
    public final Map f59245c = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: d */
    public final Map f59246d = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: e */
    public final Map f59247e = new HashMap();

    /* renamed from: f */
    public final Map f59248f = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    public CFFCharset(boolean z) {
        this.f59243a = z;
    }

    /* renamed from: a */
    public int m33134a(int i) {
        if (!this.f59243a) {
            Integer num = (Integer) this.f59244b.get(Integer.valueOf(i));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public void addCID(int i, int i2) {
        if (this.f59243a) {
            this.f59244b.put(Integer.valueOf(i2), Integer.valueOf(i));
            this.f59247e.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public void addSID(int i, int i2, String str) {
        if (!this.f59243a) {
            this.f59244b.put(Integer.valueOf(i2), Integer.valueOf(i));
            this.f59245c.put(Integer.valueOf(i), Integer.valueOf(i2));
            this.f59246d.put(str, Integer.valueOf(i2));
            this.f59248f.put(Integer.valueOf(i), str);
            return;
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    /* renamed from: b */
    public int m33133b(String str) {
        if (!this.f59243a) {
            Integer num = (Integer) this.f59246d.get(str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    /* renamed from: c */
    public int m33132c(int i) {
        if (!this.f59243a) {
            Integer num = (Integer) this.f59245c.get(Integer.valueOf(i));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public int getCIDForGID(int i) {
        if (this.f59243a) {
            Integer num = (Integer) this.f59247e.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public int getGIDForCID(int i) {
        if (this.f59243a) {
            Integer num = (Integer) this.f59244b.get(Integer.valueOf(i));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public String getNameForGID(int i) {
        if (!this.f59243a) {
            return (String) this.f59248f.get(Integer.valueOf(i));
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public boolean isCIDFont() {
        return this.f59243a;
    }
}
