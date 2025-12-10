package com.airbnb.lottie;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TextDelegate {

    /* renamed from: a */
    public final Map f41009a;

    /* renamed from: b */
    public final LottieAnimationView f41010b;

    /* renamed from: c */
    public final LottieDrawable f41011c;

    /* renamed from: d */
    public boolean f41012d;

    public TextDelegate(LottieAnimationView lottieAnimationView) {
        this.f41009a = new HashMap();
        this.f41012d = true;
        this.f41010b = lottieAnimationView;
        this.f41011c = null;
    }

    /* renamed from: a */
    public final void m50909a() {
        LottieAnimationView lottieAnimationView = this.f41010b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.f41011c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public String getText(String str) {
        return str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String getTextInternal(String str, String str2) {
        if (this.f41012d && this.f41009a.containsKey(str2)) {
            return (String) this.f41009a.get(str2);
        }
        String text = getText(str, str2);
        if (this.f41012d) {
            this.f41009a.put(str2, text);
        }
        return text;
    }

    public void invalidateAllText() {
        this.f41009a.clear();
        m50909a();
    }

    public void invalidateText(String str) {
        this.f41009a.remove(str);
        m50909a();
    }

    public void setCacheText(boolean z) {
        this.f41012d = z;
    }

    public void setText(String str, String str2) {
        this.f41009a.put(str, str2);
        m50909a();
    }

    public String getText(String str, String str2) {
        return getText(str2);
    }

    public TextDelegate(LottieDrawable lottieDrawable) {
        this.f41009a = new HashMap();
        this.f41012d = true;
        this.f41011c = lottieDrawable;
        this.f41010b = null;
    }
}
