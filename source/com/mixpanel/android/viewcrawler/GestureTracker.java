package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.mixpanel.android.mpmetrics.MixpanelAPI;

/* loaded from: classes5.dex */
public class GestureTracker {

    /* renamed from: com.mixpanel.android.viewcrawler.GestureTracker$a */
    /* loaded from: classes5.dex */
    public class View$OnTouchListenerC9207a implements View.OnTouchListener {

        /* renamed from: a */
        public long f58777a = -1;

        /* renamed from: b */
        public long f58778b = -1;

        /* renamed from: c */
        public int f58779c = 0;

        /* renamed from: d */
        public long f58780d = -1;

        /* renamed from: e */
        public boolean f58781e = false;

        /* renamed from: f */
        public final int f58782f = 100;

        /* renamed from: g */
        public final int f58783g = 1000;

        /* renamed from: h */
        public final int f58784h = 2500;

        /* renamed from: i */
        public final /* synthetic */ MixpanelAPI f58785i;

        public View$OnTouchListenerC9207a(MixpanelAPI mixpanelAPI) {
            this.f58785i = mixpanelAPI;
        }

        /* renamed from: a */
        public final void m33430a() {
            this.f58778b = -1L;
            this.f58777a = -1L;
            this.f58779c = 0;
            this.f58780d = -1L;
            this.f58781e = false;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getPointerCount() > 2) {
                m33430a();
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            if (this.f58781e) {
                                this.f58778b = System.currentTimeMillis();
                            } else {
                                m33430a();
                            }
                        }
                    } else if (System.currentTimeMillis() - this.f58778b < 100) {
                        if (System.currentTimeMillis() - this.f58780d > 1000) {
                            m33430a();
                        }
                        this.f58777a = System.currentTimeMillis();
                        this.f58781e = true;
                    } else {
                        m33430a();
                    }
                } else if (System.currentTimeMillis() - this.f58778b < 100) {
                    if (System.currentTimeMillis() - this.f58777a >= 2500) {
                        if (this.f58779c == 3) {
                            this.f58785i.track("$ab_gesture1");
                            m33430a();
                        }
                        this.f58779c = 0;
                    } else {
                        this.f58780d = System.currentTimeMillis();
                        int i = this.f58779c;
                        if (i < 4) {
                            this.f58779c = i + 1;
                        } else if (i == 4) {
                            this.f58785i.track("$ab_gesture2");
                            m33430a();
                        } else {
                            m33430a();
                        }
                    }
                }
            } else {
                this.f58778b = System.currentTimeMillis();
            }
            return false;
        }
    }

    public GestureTracker(MixpanelAPI mixpanelAPI, Activity activity) {
        m33431b(mixpanelAPI, activity);
    }

    /* renamed from: a */
    public final View.OnTouchListener m33432a(MixpanelAPI mixpanelAPI) {
        return new View$OnTouchListenerC9207a(mixpanelAPI);
    }

    /* renamed from: b */
    public final void m33431b(MixpanelAPI mixpanelAPI, Activity activity) {
        activity.getWindow().getDecorView().setOnTouchListener(m33432a(mixpanelAPI));
    }
}
