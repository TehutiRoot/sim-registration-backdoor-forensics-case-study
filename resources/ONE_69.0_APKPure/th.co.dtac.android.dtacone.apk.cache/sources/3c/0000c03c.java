package com.tom_roush.fontbox.cff;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CFFCharset {

    /* renamed from: a */
    public final boolean f59255a;

    /* renamed from: b */
    public final Map f59256b = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: c */
    public final Map f59257c = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: d */
    public final Map f59258d = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: e */
    public final Map f59259e = new HashMap();

    /* renamed from: f */
    public final Map f59260f = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    public CFFCharset(boolean z) {
        this.f59255a = z;
    }

    /* renamed from: a */
    public int m33126a(int i) {
        if (!this.f59255a) {
            Integer num = (Integer) this.f59256b.get(Integer.valueOf(i));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public void addCID(int i, int i2) {
        if (this.f59255a) {
            this.f59256b.put(Integer.valueOf(i2), Integer.valueOf(i));
            this.f59259e.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public void addSID(int i, int i2, String str) {
        if (!this.f59255a) {
            this.f59256b.put(Integer.valueOf(i2), Integer.valueOf(i));
            this.f59257c.put(Integer.valueOf(i), Integer.valueOf(i2));
            this.f59258d.put(str, Integer.valueOf(i2));
            this.f59260f.put(Integer.valueOf(i), str);
            return;
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    /* renamed from: b */
    public int m33125b(String str) {
        if (!this.f59255a) {
            Integer num = (Integer) this.f59258d.get(str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    /* renamed from: c */
    public int m33124c(int i) {
        if (!this.f59255a) {
            Integer num = (Integer) this.f59257c.get(Integer.valueOf(i));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public int getCIDForGID(int i) {
        if (this.f59255a) {
            Integer num = (Integer) this.f59259e.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public int getGIDForCID(int i) {
        if (this.f59255a) {
            Integer num = (Integer) this.f59256b.get(Integer.valueOf(i));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public String getNameForGID(int i) {
        if (!this.f59255a) {
            return (String) this.f59260f.get(Integer.valueOf(i));
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public boolean isCIDFont() {
        return this.f59255a;
    }
}