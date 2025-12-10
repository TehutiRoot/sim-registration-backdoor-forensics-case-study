package com.roughike.bottombar;

/* renamed from: com.roughike.bottombar.a */
/* loaded from: classes5.dex */
public class C9801a {

    /* renamed from: a */
    public final BottomBar f59039a;

    /* renamed from: com.roughike.bottombar.a$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9802a {
        /* renamed from: a */
        void mo33228a(BottomBarTab bottomBarTab);
    }

    public C9801a(BottomBar bottomBar) {
        this.f59039a = bottomBar;
    }

    /* renamed from: a */
    public void m33229a(InterfaceC9802a interfaceC9802a) {
        int tabCount = this.f59039a.getTabCount();
        if (tabCount > 0) {
            for (int i = 0; i < tabCount; i++) {
                interfaceC9802a.mo33228a(this.f59039a.getTabAtPosition(i));
            }
        }
    }
}
