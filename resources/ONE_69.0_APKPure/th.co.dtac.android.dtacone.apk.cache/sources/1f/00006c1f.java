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
    public long f34459a;

    /* renamed from: b */
    public boolean f34460b;

    /* renamed from: c */
    public boolean f34461c;

    /* renamed from: d */
    public boolean f34462d;

    /* renamed from: e */
    public final Runnable f34463e;

    /* renamed from: f */
    public final Runnable f34464f;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public final void m56482e() {
        this.f34462d = true;
        removeCallbacks(this.f34464f);
        this.f34461c = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f34459a;
        long j2 = currentTimeMillis - j;
        if (j2 < 500 && j != -1) {
            if (!this.f34460b) {
                postDelayed(this.f34463e, 500 - j2);
                this.f34460b = true;
                return;
            }
            return;
        }
        setVisibility(8);
    }

    /* renamed from: f */
    public final /* synthetic */ void m56481f() {
        this.f34460b = false;
        this.f34459a = -1L;
        setVisibility(8);
    }

    /* renamed from: g */
    public final /* synthetic */ void m56480g() {
        this.f34461c = false;
        if (!this.f34462d) {
            this.f34459a = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void m56479h() {
        removeCallbacks(this.f34463e);
        removeCallbacks(this.f34464f);
    }

    public void hide() {
        post(new Runnable() { // from class: Vx
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56482e();
            }
        });
    }

    /* renamed from: i */
    public final void m56478i() {
        this.f34459a = -1L;
        this.f34462d = false;
        removeCallbacks(this.f34463e);
        this.f34460b = false;
        if (!this.f34461c) {
            postDelayed(this.f34464f, 500L);
            this.f34461c = true;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m56479h();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m56479h();
    }

    public void show() {
        post(new Runnable() { // from class: Ux
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56478i();
            }
        });
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f34459a = -1L;
        this.f34460b = false;
        this.f34461c = false;
        this.f34462d = false;
        this.f34463e = new Runnable() { // from class: Sx
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56481f();
            }
        };
        this.f34464f = new Runnable() { // from class: Tx
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m56480g();
            }
        };
    }
}