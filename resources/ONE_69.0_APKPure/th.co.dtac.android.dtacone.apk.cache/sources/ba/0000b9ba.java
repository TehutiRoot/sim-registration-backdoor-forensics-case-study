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
    public MixpanelAPI f58536a;

    /* renamed from: b */
    public Activity f58537b;

    /* renamed from: c */
    public GestureDetector f58538c;

    /* renamed from: d */
    public Handler f58539d;

    /* renamed from: e */
    public int f58540e;

    /* renamed from: f */
    public UpdateDisplayState.DisplayState.InAppNotificationState f58541f;

    /* renamed from: g */
    public Runnable f58542g;

    /* renamed from: h */
    public Runnable f58543h;

    /* renamed from: i */
    public View f58544i;

    /* renamed from: j */
    public AtomicBoolean f58545j = new AtomicBoolean();

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$a */
    /* loaded from: classes5.dex */
    public class RunnableC9133a implements Runnable {
        public RunnableC9133a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppFragment.this.m33622h();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$b */
    /* loaded from: classes5.dex */
    public class RunnableC9134b implements Runnable {

        /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$b$a */
        /* loaded from: classes5.dex */
        public class View$OnTouchListenerC9135a implements View.OnTouchListener {
            public View$OnTouchListenerC9135a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return InAppFragment.this.f58538c.onTouchEvent(motionEvent);
            }
        }

        public RunnableC9134b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppFragment.this.f58544i.setVisibility(0);
            InAppFragment.this.f58544i.setOnTouchListener(new View$OnTouchListenerC9135a());
            float applyDimension = TypedValue.applyDimension(1, 65.0f, InAppFragment.this.f58537b.getResources().getDisplayMetrics());
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, applyDimension, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(200L);
            InAppFragment.this.f58544i.startAnimation(translateAnimation);
            float f = applyDimension / 2.0f;
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, f, f);
            scaleAnimation.setInterpolator(new animationInterpolatorC9137d());
            scaleAnimation.setDuration(400L);
            scaleAnimation.setStartOffset(200L);
            ((ImageView) InAppFragment.this.f58544i.findViewById(R.id.com_mixpanel_android_notification_image)).startAnimation(scaleAnimation);
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$c */
    /* loaded from: classes5.dex */
    public class GestureDetector$OnGestureListenerC9136c implements GestureDetector.OnGestureListener {
        public GestureDetector$OnGestureListenerC9136c() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (f2 > 0.0f) {
                InAppFragment.this.m33622h();
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
            MiniInAppNotification miniInAppNotification = (MiniInAppNotification) InAppFragment.this.f58541f.getInAppNotification();
            String ctaUrl = miniInAppNotification.getCtaUrl();
            JSONObject jSONObject2 = null;
            if (ctaUrl != null && ctaUrl.length() > 0) {
                try {
                    Uri parse = Uri.parse(ctaUrl);
                    try {
                        InAppFragment.this.f58537b.startActivity(new Intent("android.intent.action.VIEW", parse));
                    } catch (ActivityNotFoundException unused) {
                        MPLog.m33447i("MixpanelAPI.InAppFrag", "User doesn't have an activity for notification URI " + parse);
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
                        MPLog.m33449e("MixpanelAPI.InAppFrag", "Can't put url into json properties");
                        InAppFragment.this.f58536a.getPeople().trackNotification("$campaign_open", miniInAppNotification, jSONObject2);
                        InAppFragment.this.m33622h();
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    MPLog.m33446i("MixpanelAPI.InAppFrag", "Can't parse notification URI, will not take any action", e);
                    return true;
                }
            }
            InAppFragment.this.f58536a.getPeople().trackNotification("$campaign_open", miniInAppNotification, jSONObject2);
            InAppFragment.this.m33622h();
            return true;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.InAppFragment$d  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class animationInterpolatorC9137d implements Interpolator {
        public animationInterpolatorC9137d() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return ((float) (-(Math.pow(2.718281828459045d, (-8.0f) * f) * Math.cos(f * 12.0f)))) + 1.0f;
        }
    }

    /* renamed from: g */
    public final void m33623g() {
        if (!this.f58545j.get()) {
            this.f58539d.removeCallbacks(this.f58542g);
            this.f58539d.removeCallbacks(this.f58543h);
            UpdateDisplayState.releaseDisplayState(this.f58540e);
            FragmentManager fragmentManager = this.f58537b.getFragmentManager();
            try {
                fragmentManager.beginTransaction().remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
        this.f58545j.set(true);
    }

    /* renamed from: h */
    public final void m33622h() {
        boolean isDestroyed = this.f58537b.isDestroyed();
        Activity activity = this.f58537b;
        if (activity != null && !activity.isFinishing() && !isDestroyed && !this.f58545j.get()) {
            this.f58539d.removeCallbacks(this.f58542g);
            this.f58539d.removeCallbacks(this.f58543h);
            FragmentManager fragmentManager = this.f58537b.getFragmentManager();
            try {
                fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(this).commitAllowingStateLoss();
            }
            UpdateDisplayState.releaseDisplayState(this.f58540e);
            this.f58545j.set(true);
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f58537b = activity;
        if (this.f58541f == null) {
            m33623g();
            return;
        }
        this.f58539d = new Handler();
        this.f58542g = new RunnableC9133a();
        this.f58543h = new RunnableC9134b();
        this.f58538c = new GestureDetector(activity, new GestureDetector$OnGestureListenerC9136c());
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58545j.set(false);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f58541f == null) {
            m33623g();
        } else {
            View inflate = layoutInflater.inflate(R.layout.com_mixpanel_android_activity_notification_mini, viewGroup, false);
            this.f58544i = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.com_mixpanel_android_notification_title);
            ImageView imageView = (ImageView) this.f58544i.findViewById(R.id.com_mixpanel_android_notification_image);
            MiniInAppNotification miniInAppNotification = (MiniInAppNotification) this.f58541f.getInAppNotification();
            textView.setText(miniInAppNotification.getBody());
            textView.setTextColor(miniInAppNotification.getBodyColor());
            imageView.setImageBitmap(miniInAppNotification.getImage());
            this.f58539d.postDelayed(this.f58542g, 10000L);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(miniInAppNotification.getBackgroundColor());
            gradientDrawable.setCornerRadius(ViewUtils.dpToPx(7.0f, getActivity()));
            gradientDrawable.setStroke((int) ViewUtils.dpToPx(2.0f, getActivity()), miniInAppNotification.getBorderColor());
            this.f58544i.setBackground(gradientDrawable);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f58541f.getInAppNotification().getImage());
            bitmapDrawable.setColorFilter(miniInAppNotification.getImageTintColor(), PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(bitmapDrawable);
        }
        return this.f58544i;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m33623g();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f58539d.postDelayed(this.f58543h, 500L);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f58545j.get()) {
            this.f58537b.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    public void setDisplayState(MixpanelAPI mixpanelAPI, int i, UpdateDisplayState.DisplayState.InAppNotificationState inAppNotificationState) {
        this.f58536a = mixpanelAPI;
        this.f58540e = i;
        this.f58541f = inAppNotificationState;
    }
}