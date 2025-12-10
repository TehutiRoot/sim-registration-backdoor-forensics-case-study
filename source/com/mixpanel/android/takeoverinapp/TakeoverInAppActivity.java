package com.mixpanel.android.takeoverinapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mixpanel.android.R;
import com.mixpanel.android.mpmetrics.InAppButton;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.mpmetrics.TakeoverInAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.util.ViewUtils;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(16)
/* loaded from: classes5.dex */
public class TakeoverInAppActivity extends Activity {
    public static final String INTENT_ID_KEY = "com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY";

    /* renamed from: a */
    public MixpanelAPI f58737a;

    /* renamed from: b */
    public UpdateDisplayState f58738b;

    /* renamed from: c */
    public int f58739c = -1;

    /* renamed from: com.mixpanel.android.takeoverinapp.TakeoverInAppActivity$a */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC9198a implements View.OnClickListener {
        public View$OnClickListenerC9198a() {
            TakeoverInAppActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TakeoverInAppActivity.this.finish();
            UpdateDisplayState.releaseDisplayState(TakeoverInAppActivity.this.f58739c);
        }
    }

    /* renamed from: com.mixpanel.android.takeoverinapp.TakeoverInAppActivity$b */
    /* loaded from: classes5.dex */
    public class View$OnTouchListenerC9199b implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ int f58741a;

        /* renamed from: b */
        public final /* synthetic */ GradientDrawable f58742b;

        /* renamed from: c */
        public final /* synthetic */ InAppButton f58743c;

        public View$OnTouchListenerC9199b(int i, GradientDrawable gradientDrawable, InAppButton inAppButton) {
            TakeoverInAppActivity.this = r1;
            this.f58741a = i;
            this.f58742b = gradientDrawable;
            this.f58743c = inAppButton;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f58742b.setColor(this.f58741a);
                return false;
            }
            this.f58742b.setColor(this.f58743c.getBackgroundColor());
            return false;
        }
    }

    /* renamed from: com.mixpanel.android.takeoverinapp.TakeoverInAppActivity$c */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC9200c implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ InAppButton f58745a;

        /* renamed from: b */
        public final /* synthetic */ InAppNotification f58746b;

        /* renamed from: c */
        public final /* synthetic */ int f58747c;

        public View$OnClickListenerC9200c(InAppButton inAppButton, InAppNotification inAppNotification, int i) {
            TakeoverInAppActivity.this = r1;
            this.f58745a = inAppButton;
            this.f58746b = inAppNotification;
            this.f58747c = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.mixpanel.android.mpmetrics.InAppButton r6 = r5.f58745a
                java.lang.String r6 = r6.getCtaUrl()
                java.lang.String r0 = "MixpanelAPI.TakeoverInAppActivity"
                r1 = 0
                if (r6 == 0) goto L41
                int r2 = r6.length()
                if (r2 <= 0) goto L41
                android.net.Uri r2 = android.net.Uri.parse(r6)     // Catch: java.lang.IllegalArgumentException -> L3a
                android.content.Intent r3 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L22
                java.lang.String r4 = "android.intent.action.VIEW"
                r3.<init>(r4, r2)     // Catch: android.content.ActivityNotFoundException -> L22
                com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r2 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this     // Catch: android.content.ActivityNotFoundException -> L22
                r2.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L22
                goto L27
            L22:
                java.lang.String r2 = "User doesn't have an activity for notification URI"
                com.mixpanel.android.util.MPLog.m33455i(r0, r2)
            L27:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L34
                r2.<init>()     // Catch: org.json.JSONException -> L34
                java.lang.String r1 = "url"
                r2.put(r1, r6)     // Catch: org.json.JSONException -> L33
                r1 = r2
                goto L41
            L33:
                r1 = r2
            L34:
                java.lang.String r6 = "Can't put url into json properties"
                com.mixpanel.android.util.MPLog.m33457e(r0, r6)
                goto L41
            L3a:
                r6 = move-exception
                java.lang.String r1 = "Can't parse notification URI, will not take any action"
                com.mixpanel.android.util.MPLog.m33454i(r0, r1, r6)
                return
            L41:
                com.mixpanel.android.mpmetrics.InAppNotification r6 = r5.f58746b
                com.mixpanel.android.mpmetrics.TakeoverInAppNotification r6 = (com.mixpanel.android.mpmetrics.TakeoverInAppNotification) r6
                int r6 = r6.getNumButtons()
                r2 = 2
                java.lang.String r3 = "primary"
                if (r6 != r2) goto L54
                int r6 = r5.f58747c
                if (r6 != 0) goto L54
                java.lang.String r3 = "secondary"
            L54:
                if (r1 != 0) goto L5c
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L62
                r6.<init>()     // Catch: org.json.JSONException -> L62
                r1 = r6
            L5c:
                java.lang.String r6 = "button"
                r1.put(r6, r3)     // Catch: org.json.JSONException -> L62
                goto L67
            L62:
                java.lang.String r6 = "Can't put button type into json properties"
                com.mixpanel.android.util.MPLog.m33457e(r0, r6)
            L67:
                com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r6 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this
                com.mixpanel.android.mpmetrics.MixpanelAPI r6 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.m33472b(r6)
                com.mixpanel.android.mpmetrics.MixpanelAPI$People r6 = r6.getPeople()
                java.lang.String r0 = "$campaign_open"
                com.mixpanel.android.mpmetrics.InAppNotification r2 = r5.f58746b
                r6.trackNotification(r0, r2, r1)
                com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r6 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this
                r6.finish()
                com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r6 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this
                int r6 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.m33473a(r6)
                com.mixpanel.android.mpmetrics.UpdateDisplayState.releaseDisplayState(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.View$OnClickListenerC9200c.onClick(android.view.View):void");
        }
    }

    /* renamed from: c */
    public final void m33471c() {
        setContentView(R.layout.com_mixpanel_android_activity_notification_full);
        ImageView imageView = (ImageView) findViewById(R.id.com_mixpanel_android_notification_gradient);
        FadingImageView fadingImageView = (FadingImageView) findViewById(R.id.com_mixpanel_android_notification_image);
        TextView textView = (TextView) findViewById(R.id.com_mixpanel_android_notification_title);
        TextView textView2 = (TextView) findViewById(R.id.com_mixpanel_android_notification_subtext);
        ArrayList arrayList = new ArrayList();
        Button button = (Button) findViewById(R.id.com_mixpanel_android_notification_button);
        arrayList.add(button);
        arrayList.add((Button) findViewById(R.id.com_mixpanel_android_notification_second_button));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.com_mixpanel_android_button_exit_wrapper);
        ImageView imageView2 = (ImageView) findViewById(R.id.com_mixpanel_android_image_close);
        TakeoverInAppNotification takeoverInAppNotification = (TakeoverInAppNotification) ((UpdateDisplayState.DisplayState.InAppNotificationState) this.f58738b.getDisplayState()).getInAppNotification();
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (getResources().getConfiguration().orientation == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, (int) (point.y * 0.06f));
            linearLayout.setLayoutParams(layoutParams);
        }
        fadingImageView.showShadow(takeoverInAppNotification.setShouldShowShadow());
        imageView.setBackgroundColor(takeoverInAppNotification.getBackgroundColor());
        if (takeoverInAppNotification.hasTitle()) {
            textView.setVisibility(0);
            textView.setText(takeoverInAppNotification.getTitle());
            textView.setTextColor(takeoverInAppNotification.getTitleColor());
        } else {
            textView.setVisibility(8);
        }
        if (takeoverInAppNotification.hasBody()) {
            textView2.setVisibility(0);
            textView2.setText(takeoverInAppNotification.getBody());
            textView2.setTextColor(takeoverInAppNotification.getBodyColor());
        } else {
            textView2.setVisibility(8);
        }
        fadingImageView.setImageBitmap(takeoverInAppNotification.getImage());
        for (int i = 0; i < arrayList.size(); i++) {
            m33470d((Button) arrayList.get(i), takeoverInAppNotification.getButton(i), takeoverInAppNotification, i);
        }
        if (takeoverInAppNotification.getNumButtons() == 1) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams2.weight = 0.0f;
            layoutParams2.width = -2;
            button.setLayoutParams(layoutParams2);
        }
        imageView2.setColorFilter(takeoverInAppNotification.getCloseColor());
        linearLayout.setOnClickListener(new View$OnClickListenerC9198a());
        m33469e(fadingImageView, textView, textView2, arrayList, linearLayout);
    }

    /* renamed from: d */
    public final void m33470d(Button button, InAppButton inAppButton, InAppNotification inAppNotification, int i) {
        if (inAppButton != null) {
            button.setVisibility(0);
            button.setText(inAppButton.getText());
            button.setTextColor(inAppButton.getTextColor());
            button.setTransformationMethod(null);
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i2 = 864454278;
            if (inAppButton.getBackgroundColor() != 0) {
                i2 = ViewUtils.mixColors(inAppButton.getBackgroundColor(), 864454278);
            }
            button.setOnTouchListener(new View$OnTouchListenerC9199b(i2, gradientDrawable, inAppButton));
            gradientDrawable.setColor(inAppButton.getBackgroundColor());
            gradientDrawable.setStroke((int) ViewUtils.dpToPx(2.0f, this), inAppButton.getBorderColor());
            gradientDrawable.setCornerRadius((int) ViewUtils.dpToPx(5.0f, this));
            button.setBackground(gradientDrawable);
            button.setOnClickListener(new View$OnClickListenerC9200c(inAppButton, inAppNotification, i));
            return;
        }
        button.setVisibility(8);
    }

    /* renamed from: e */
    public final void m33469e(ImageView imageView, TextView textView, TextView textView2, ArrayList arrayList, LinearLayout linearLayout) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.0f, 0.95f, 1.0f, 1, 0.5f, 1, 1.0f);
        scaleAnimation.setDuration(200L);
        imageView.startAnimation(scaleAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.5f, 1, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(200L);
        textView.startAnimation(translateAnimation);
        textView2.startAnimation(translateAnimation);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Button) it.next()).startAnimation(translateAnimation);
        }
        linearLayout.startAnimation(AnimationUtils.loadAnimation(this, R.anim.com_mixpanel_android_fade_in));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        UpdateDisplayState.releaseDisplayState(this.f58739c);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(INTENT_ID_KEY, Integer.MAX_VALUE);
        this.f58739c = intExtra;
        UpdateDisplayState claimDisplayState = UpdateDisplayState.claimDisplayState(intExtra);
        this.f58738b = claimDisplayState;
        if (claimDisplayState == null) {
            MPLog.m33457e("MixpanelAPI.TakeoverInAppActivity", "TakeoverInAppActivity intent received, but nothing was found to show.");
            finish();
            return;
        }
        this.f58737a = MixpanelAPI.getInstance(this, claimDisplayState.getToken());
        m33471c();
    }
}
