package com.mixpanel.android.mpmetrics;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ImagesContract;
import com.mixpanel.android.R;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.util.ViewUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(16)
/* loaded from: classes5.dex */
public class InAppFragment extends Fragment {

    /* renamed from: a */
    public MixpanelAPI f58524a;

    /* renamed from: b */
    public Activity f58525b;

    /* renamed from: c */
    public GestureDetector f58526c;

    /* renamed from: d */
    public Handler f58527d;

    /* renamed from: e */
    public int f58528e;

    /* renamed from: f */
    public UpdateDisplayState.DisplayState.InAppNotificationState f58529f;

    /* renamed from: g */
    public Runnable f58530g;

    /* renamed from: h */
    public Runnable f58531h;

    /* renamed from: i */
    public View f58532i;

    /* renamed from: j */
    public AtomicBoolean f58533j = new AtomicBoolean();

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$a */
    /* loaded from: classes5.dex */
    public class RunnableC9144a implements Runnable {
        public RunnableC9144a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppFragment.this.m33630h();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$b */
    /* loaded from: classes5.dex */
    public class RunnableC9145b implements Runnable {

        /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$b$a */
        /* loaded from: classes5.dex */
        public class View$OnTouchListenerC9146a implements View.OnTouchListener {
            public View$OnTouchListenerC9146a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return InAppFragment.this.f58526c.onTouchEvent(motionEvent);
            }
        }

        public RunnableC9145b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppFragment.this.f58532i.setVisibility(0);
            InAppFragment.this.f58532i.setOnTouchListener(new View$OnTouchListenerC9146a());
            float applyDimension = TypedValue.applyDimension(1, 65.0f, InAppFragment.this.f58525b.getResources().getDisplayMetrics());
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, applyDimension, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(200L);
            InAppFragment.this.f58532i.startAnimation(translateAnimation);
            float f = applyDimension / 2.0f;
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, f, f);
            scaleAnimation.setInterpolator(new animationInterpolatorC9148d());
            scaleAnimation.setDuration(400L);
            scaleAnimation.setStartOffset(200L);
            ((ImageView) InAppFragment.this.f58532i.findViewById(R.id.com_mixpanel_android_notification_image)).startAnimation(scaleAnimation);
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$c */
    /* loaded from: classes5.dex */
    public class GestureDetector$OnGestureListenerC9147c implements GestureDetector.OnGestureListener {
        public GestureDetector$OnGestureListenerC9147c() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (f2 > 0.0f) {
                InAppFragment.this.m33630h();
                return true;
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            JSONObject jSONObject;
            MiniInAppNotification miniInAppNotification = (MiniInAppNotification) InAppFragment.this.f58529f.getInAppNotification();
            String ctaUrl = miniInAppNotification.getCtaUrl();
            JSONObject jSONObject2 = null;
            if (ctaUrl != null && ctaUrl.length() > 0) {
                try {
                    Uri parse = Uri.parse(ctaUrl);
                    try {
                        InAppFragment.this.f58525b.startActivity(new Intent("android.intent.action.VIEW", parse));
                    } catch (ActivityNotFoundException unused) {
                        MPLog.m33455i("MixpanelAPI.InAppFrag", "User doesn't have an activity for notification URI " + parse);
                    }
                    try {
                        jSONObject = new JSONObject();
                    } catch (JSONException unused2) {
                    }
                    try {
                        jSONObject.put(ImagesContract.URL, ctaUrl);
                        jSONObject2 = jSONObject;
                    } catch (JSONException unused3) {
                        jSONObject2 = jSONObject;
                        MPLog.m33457e("MixpanelAPI.InAppFrag", "Can't put url into json properties");
                        InAppFragment.this.f58524a.getPeople().trackNotification("$campaign_open", miniInAppNotification, jSONObject2);
                        InAppFragment.this.m33630h();
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    MPLog.m33454i("MixpanelAPI.InAppFrag", "Can't parse notification URI, will not take any action", e);
                    return true;
                }
            }
            InAppFragment.this.f58524a.getPeople().trackNotification("$campaign_open", miniInAppNotification, jSONObject2);
            InAppFragment.this.m33630h();
            return true;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$d  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class animationInterpolatorC9148d implements Interpolator {
        public animationInterpolatorC9148d() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return ((float) (-(Math.pow(2.718281828459045d, (-8.0f) * f) * Math.cos(f * 12.0f)))) + 1.0f;
        }
    }

    /* renamed from: g */
    public final void m33631g() {
        if (!this.f58533j.get()) {
            this.f58527d.removeCallbacks(this.f58530g);
            this.f58527d.removeCallbacks(this.f58531h);
            UpdateDisplayState.releaseDisplayState(this.f58528e);
            FragmentManager fragmentManager = this.f58525b.getFragmentManager();
            try {
                fragmentManager.beginTransaction().remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
        this.f58533j.set(true);
    }

    /* renamed from: h */
    public final void m33630h() {
        boolean isDestroyed = this.f58525b.isDestroyed();
        Activity activity = this.f58525b;
        if (activity != null && !activity.isFinishing() && !isDestroyed && !this.f58533j.get()) {
            this.f58527d.removeCallbacks(this.f58530g);
            this.f58527d.removeCallbacks(this.f58531h);
            FragmentManager fragmentManager = this.f58525b.getFragmentManager();
            try {
                fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(this).commitAllowingStateLoss();
            }
            UpdateDisplayState.releaseDisplayState(this.f58528e);
            this.f58533j.set(true);
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f58525b = activity;
        if (this.f58529f == null) {
            m33631g();
            return;
        }
        this.f58527d = new Handler();
        this.f58530g = new RunnableC9144a();
        this.f58531h = new RunnableC9145b();
        this.f58526c = new GestureDetector(activity, new GestureDetector$OnGestureListenerC9147c());
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58533j.set(false);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f58529f == null) {
            m33631g();
        } else {
            View inflate = layoutInflater.inflate(R.layout.com_mixpanel_android_activity_notification_mini, viewGroup, false);
            this.f58532i = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.com_mixpanel_android_notification_title);
            ImageView imageView = (ImageView) this.f58532i.findViewById(R.id.com_mixpanel_android_notification_image);
            MiniInAppNotification miniInAppNotification = (MiniInAppNotification) this.f58529f.getInAppNotification();
            textView.setText(miniInAppNotification.getBody());
            textView.setTextColor(miniInAppNotification.getBodyColor());
            imageView.setImageBitmap(miniInAppNotification.getImage());
            this.f58527d.postDelayed(this.f58530g, 10000L);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(miniInAppNotification.getBackgroundColor());
            gradientDrawable.setCornerRadius(ViewUtils.dpToPx(7.0f, getActivity()));
            gradientDrawable.setStroke((int) ViewUtils.dpToPx(2.0f, getActivity()), miniInAppNotification.getBorderColor());
            this.f58532i.setBackground(gradientDrawable);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f58529f.getInAppNotification().getImage());
            bitmapDrawable.setColorFilter(miniInAppNotification.getImageTintColor(), PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(bitmapDrawable);
        }
        return this.f58532i;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m33631g();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f58527d.postDelayed(this.f58531h, 500L);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f58533j.get()) {
            this.f58525b.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    public void setDisplayState(MixpanelAPI mixpanelAPI, int i, UpdateDisplayState.DisplayState.InAppNotificationState inAppNotificationState) {
        this.f58524a = mixpanelAPI;
        this.f58528e = i;
        this.f58529f = inAppNotificationState;
    }
}
