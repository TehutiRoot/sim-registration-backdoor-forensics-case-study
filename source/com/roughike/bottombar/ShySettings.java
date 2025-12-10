package com.roughike.bottombar;

/* loaded from: classes5.dex */
public class ShySettings {

    /* renamed from: a */
    public BottomBar f59033a;

    /* renamed from: b */
    public Boolean f59034b;

    public ShySettings(BottomBar bottomBar) {
        this.f59033a = bottomBar;
    }

    /* renamed from: a */
    public void m33237a() {
        m33235c();
    }

    /* renamed from: b */
    public final void m33236b(boolean z) {
        if (!this.f59033a.m33276z()) {
            return;
        }
        if (this.f59033a.m33313A()) {
            C13098pc m23646k = C13098pc.m23646k(this.f59033a);
            if (m23646k != null) {
                m23646k.m23644m(this.f59033a, !z);
                return;
            }
            return;
        }
        this.f59034b = Boolean.TRUE;
    }

    /* renamed from: c */
    public final void m33235c() {
        Boolean bool = this.f59034b;
        if (bool != null) {
            m33236b(bool.booleanValue());
            this.f59034b = null;
        }
    }

    public void hideBar() {
        m33236b(false);
    }

    public void showBar() {
        m33236b(true);
    }
}
