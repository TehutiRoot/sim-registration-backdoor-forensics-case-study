package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseAttachState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class UseCaseAttachState {

    /* renamed from: a */
    public final String f11212a;

    /* renamed from: b */
    public final Map f11213b = new LinkedHashMap();

    /* renamed from: androidx.camera.core.impl.UseCaseAttachState$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2511a {
        /* renamed from: a */
        boolean mo62895a(C2512b c2512b);
    }

    /* renamed from: androidx.camera.core.impl.UseCaseAttachState$b */
    /* loaded from: classes.dex */
    public static final class C2512b {

        /* renamed from: a */
        public final SessionConfig f11214a;

        /* renamed from: b */
        public final UseCaseConfig f11215b;

        /* renamed from: c */
        public boolean f11216c = false;

        /* renamed from: d */
        public boolean f11217d = false;

        public C2512b(SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
            this.f11214a = sessionConfig;
            this.f11215b = useCaseConfig;
        }

        /* renamed from: a */
        public boolean m62894a() {
            return this.f11217d;
        }

        /* renamed from: b */
        public boolean m62893b() {
            return this.f11216c;
        }

        /* renamed from: c */
        public SessionConfig m62892c() {
            return this.f11214a;
        }

        /* renamed from: d */
        public UseCaseConfig m62891d() {
            return this.f11215b;
        }

        /* renamed from: e */
        public void m62890e(boolean z) {
            this.f11217d = z;
        }

        /* renamed from: f */
        public void m62889f(boolean z) {
            this.f11216c = z;
        }
    }

    public UseCaseAttachState(@NonNull String str) {
        this.f11212a = str;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m62904a(C2512b c2512b) {
        return c2512b.m62893b();
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m62903b(C2512b c2512b) {
        return c2512b.m62893b();
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m62902c(C2512b c2512b) {
        return m62898g(c2512b);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m62898g(C2512b c2512b) {
        if (c2512b.m62894a() && c2512b.m62893b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C2512b m62901d(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        C2512b c2512b = (C2512b) this.f11213b.get(str);
        if (c2512b == null) {
            C2512b c2512b2 = new C2512b(sessionConfig, useCaseConfig);
            this.f11213b.put(str, c2512b2);
            return c2512b2;
        }
        return c2512b;
    }

    /* renamed from: e */
    public final Collection m62900e(InterfaceC2511a interfaceC2511a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11213b.entrySet()) {
            if (interfaceC2511a == null || interfaceC2511a.mo62895a((C2512b) entry.getValue())) {
                arrayList.add(((C2512b) entry.getValue()).m62892c());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final Collection m62899f(InterfaceC2511a interfaceC2511a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11213b.entrySet()) {
            if (interfaceC2511a == null || interfaceC2511a.mo62895a((C2512b) entry.getValue())) {
                arrayList.add(((C2512b) entry.getValue()).m62891d());
            }
        }
        return arrayList;
    }

    @NonNull
    public SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11213b.entrySet()) {
            C2512b c2512b = (C2512b) entry.getValue();
            if (c2512b.m62894a() && c2512b.m62893b()) {
                validatingBuilder.add(c2512b.m62892c());
                arrayList.add((String) entry.getKey());
            }
        }
        Logger.m63230d("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f11212a);
        return validatingBuilder;
    }

    @NonNull
    public Collection<SessionConfig> getActiveAndAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(m62900e(new InterfaceC2511a() { // from class: VZ1
            @Override // androidx.camera.core.impl.UseCaseAttachState.InterfaceC2511a
            /* renamed from: a */
            public final boolean mo62895a(UseCaseAttachState.C2512b c2512b) {
                return UseCaseAttachState.m62902c(c2512b);
            }
        }));
    }

    @NonNull
    public SessionConfig.ValidatingBuilder getAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11213b.entrySet()) {
            C2512b c2512b = (C2512b) entry.getValue();
            if (c2512b.m62893b()) {
                validatingBuilder.add(c2512b.m62892c());
                arrayList.add((String) entry.getKey());
            }
        }
        Logger.m63230d("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f11212a);
        return validatingBuilder;
    }

    @NonNull
    public Collection<SessionConfig> getAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(m62900e(new InterfaceC2511a() { // from class: TZ1
            @Override // androidx.camera.core.impl.UseCaseAttachState.InterfaceC2511a
            /* renamed from: a */
            public final boolean mo62895a(UseCaseAttachState.C2512b c2512b) {
                return UseCaseAttachState.m62904a(c2512b);
            }
        }));
    }

    @NonNull
    public Collection<UseCaseConfig<?>> getAttachedUseCaseConfigs() {
        return Collections.unmodifiableCollection(m62899f(new InterfaceC2511a() { // from class: UZ1
            @Override // androidx.camera.core.impl.UseCaseAttachState.InterfaceC2511a
            /* renamed from: a */
            public final boolean mo62895a(UseCaseAttachState.C2512b c2512b) {
                return UseCaseAttachState.m62903b(c2512b);
            }
        }));
    }

    public boolean isUseCaseAttached(@NonNull String str) {
        if (!this.f11213b.containsKey(str)) {
            return false;
        }
        return ((C2512b) this.f11213b.get(str)).m62893b();
    }

    public void removeUseCase(@NonNull String str) {
        this.f11213b.remove(str);
    }

    public void setUseCaseActive(@NonNull String str, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig) {
        m62901d(str, sessionConfig, useCaseConfig).m62890e(true);
    }

    public void setUseCaseAttached(@NonNull String str, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig) {
        m62901d(str, sessionConfig, useCaseConfig).m62889f(true);
    }

    public void setUseCaseDetached(@NonNull String str) {
        if (!this.f11213b.containsKey(str)) {
            return;
        }
        C2512b c2512b = (C2512b) this.f11213b.get(str);
        c2512b.m62889f(false);
        if (!c2512b.m62894a()) {
            this.f11213b.remove(str);
        }
    }

    public void setUseCaseInactive(@NonNull String str) {
        if (!this.f11213b.containsKey(str)) {
            return;
        }
        C2512b c2512b = (C2512b) this.f11213b.get(str);
        c2512b.m62890e(false);
        if (!c2512b.m62893b()) {
            this.f11213b.remove(str);
        }
    }

    public void updateUseCase(@NonNull String str, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig) {
        if (!this.f11213b.containsKey(str)) {
            return;
        }
        C2512b c2512b = new C2512b(sessionConfig, useCaseConfig);
        C2512b c2512b2 = (C2512b) this.f11213b.get(str);
        c2512b.m62889f(c2512b2.m62893b());
        c2512b.m62890e(c2512b2.m62894a());
        this.f11213b.put(str, c2512b);
    }
}
