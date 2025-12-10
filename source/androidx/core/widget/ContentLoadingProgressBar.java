package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;

/* loaded from: classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    public long f34371a;

    /* renamed from: b */
    public boolean f34372b;

    /* renamed from: c */
    public boolean f34373c;

    /* renamed from: d */
    public boolean f34374d;

    /* renamed from: e */
    public final Runnable f34375e;

    /* renamed from: f */
    public final Runnable f34376f;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public final void m56532e() {
        this.f34374d = true;
        removeCallbacks(this.f34376f);
        this.f34373c = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f34371a;
        long j2 = currentTimeMillis - j;
        if (j2 < 500 && j != -1) {
            if (!this.f34372b) {
                postDelayed(this.f34375e, 500 - j2);
                this.f34372b = true;
                return;
            }
            return;
        }
        setVisibility(8);
    }

    /* renamed from: f */
    public final /* synthetic */ void m56531f() {
        this.f34372b = false;
        this.f34371a = -1L;
        setVisibility(8);
    }

    /* renamed from: g */
    public final /* synthetic */ void m56530g() {
        this.f34373c = false;
        if (!this.f34374d) {
            this.f34371a = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void m56529h() {
        removeCallbacks(this.f34375e);
        removeCallbacks(this.f34376f);
    }

    public void hide() {
        post(new Runnable() { // from class: Vx
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56532e();
            }
        });
    }

    /* renamed from: i */
    public final void m56528i() {
        this.f34371a = -1L;
        this.f34374d = false;
        removeCallbacks(this.f34375e);
        this.f34372b = false;
        if (!this.f34373c) {
            postDelayed(this.f34376f, 500L);
            this.f34373c = true;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m56529h();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m56529h();
    }

    public void show() {
        post(new Runnable() { // from class: Ux
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56528i();
            }
        });
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f34371a = -1L;
        this.f34372b = false;
        this.f34373c = false;
        this.f34374d = false;
        this.f34375e = new Runnable() { // from class: Sx
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56531f();
            }
        };
        this.f34376f = new Runnable() { // from class: Tx
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56530g();
            }
        };
    }
}
