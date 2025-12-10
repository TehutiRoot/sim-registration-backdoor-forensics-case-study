package th.p047co.dtac.android.dtacone.widget.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;

/* renamed from: th.co.dtac.android.dtacone.widget.view.DtacTouchView */
/* loaded from: classes9.dex */
public class DtacTouchView extends View {

    /* renamed from: a */
    public ScaleAnimation f107462a;

    /* renamed from: b */
    public RelativeLayout.LayoutParams f107463b;

    public DtacTouchView(Context context) {
        super(context);
        m1425b();
    }

    /* renamed from: a */
    public static /* synthetic */ void m1426a(DtacTouchView dtacTouchView) {
        dtacTouchView.m1424c();
    }

    /* renamed from: b */
    public final void m1425b() {
        this.f107462a = new ScaleAnimation(2.5f, 2.0f, 2.5f, 2.0f, 1, 0.5f, 1, 0.5f);
    }

    /* renamed from: c */
    public final /* synthetic */ void m1424c() {
        setVisibility(4);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f107462a.cancel();
        this.f107462a = null;
    }

    public void touchOverDraw(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getLayoutParams());
        this.f107463b = layoutParams;
        layoutParams.setMargins(i - 60, i2 - 60, 0, 0);
        setLayoutParams(this.f107463b);
        setVisibility(0);
        this.f107462a.setDuration(700L);
        startAnimation(this.f107462a);
        new Handler().postDelayed(new Runnable() { // from class: eL
            @Override // java.lang.Runnable
            public final void run() {
                DtacTouchView.m1426a(DtacTouchView.this);
            }
        }, 400L);
    }

    public DtacTouchView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1425b();
    }

    public DtacTouchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1425b();
    }

    @RequiresApi(api = 21)
    public DtacTouchView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1425b();
    }
}