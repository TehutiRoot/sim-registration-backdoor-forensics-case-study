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
    public final String f11300a;

    /* renamed from: b */
    public final Map f11301b = new LinkedHashMap();

    /* renamed from: androidx.camera.core.impl.UseCaseAttachState$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2493a {
        /* renamed from: a */
        boolean mo62843a(C2494b c2494b);
    }

    /* renamed from: androidx.camera.core.impl.UseCaseAttachState$b */
    /* loaded from: classes.dex */
    public static final class C2494b {

        /* renamed from: a */
        public final SessionConfig f11302a;

        /* renamed from: b */
        public final UseCaseConfig f11303b;

        /* renamed from: c */
        public boolean f11304c = false;

        /* renamed from: d */
        public boolean f11305d = false;

        public C2494b(SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
            this.f11302a = sessionConfig;
            this.f11303b = useCaseConfig;
        }

        /* renamed from: a */
        public boolean m62842a() {
            return this.f11305d;
        }

        /* renamed from: b */
        public boolean m62841b() {
            return this.f11304c;
        }

        /* renamed from: c */
        public SessionConfig m62840c() {
            return this.f11302a;
        }

        /* renamed from: d */
        public UseCaseConfig m62839d() {
            return this.f11303b;
        }

        /* renamed from: e */
        public void m62838e(boolean z) {
            this.f11305d = z;
        }

        /* renamed from: f */
        public void m62837f(boolean z) {
            this.f11304c = z;
        }
    }

    public UseCaseAttachState(@NonNull String str) {
        this.f11300a = str;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m62852a(C2494b c2494b) {
        return c2494b.m62841b();
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m62851b(C2494b c2494b) {
        return c2494b.m62841b();
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m62850c(C2494b c2494b) {
        return m62846g(c2494b);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m62846g(C2494b c2494b) {
        if (c2494b.m62842a() && c2494b.m62841b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C2494b m62849d(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        C2494b c2494b = (C2494b) this.f11301b.get(str);
        if (c2494b == null) {
            C2494b c2494b2 = new C2494b(sessionConfig, useCaseConfig);
            this.f11301b.put(str, c2494b2);
            return c2494b2;
        }
        return c2494b;
    }

    /* renamed from: e */
    public final Collection m62848e(InterfaceC2493a interfaceC2493a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11301b.entrySet()) {
            if (interfaceC2493a == null || interfaceC2493a.mo62843a((C2494b) entry.getValue())) {
                arrayList.add(((C2494b) entry.getValue()).m62840c());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final Collection m62847f(InterfaceC2493a interfaceC2493a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11301b.entrySet()) {
            if (interfaceC2493a == null || interfaceC2493a.mo62843a((C2494b) entry.getValue())) {
                arrayList.add(((C2494b) entry.getValue()).m62839d());
            }
        }
        return arrayList;
    }

    @NonNull
    public SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11301b.entrySet()) {
            C2494b c2494b = (C2494b) entry.getValue();
            if (c2494b.m62842a() && c2494b.m62841b()) {
                validatingBuilder.add(c2494b.m62840c());
                arrayList.add((String) entry.getKey());
            }
        }
        Logger.m63178d("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f11300a);
        return validatingBuilder;
    }

    @NonNull
    public Collection<SessionConfig> getActiveAndAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(m62848e(new InterfaceC2493a() { // from class: S02
            @Override // androidx.camera.core.impl.UseCaseAttachState.InterfaceC2493a
            /* renamed from: a */
            public final boolean mo62843a(UseCaseAttachState.C2494b c2494b) {
                return UseCaseAttachState.m62850c(c2494b);
            }
        }));
    }

    @NonNull
    public SessionConfig.ValidatingBuilder getAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11301b.entrySet()) {
            C2494b c2494b = (C2494b) entry.getValue();
            if (c2494b.m62841b()) {
                validatingBuilder.add(c2494b.m62840c());
                arrayList.add((String) entry.getKey());
            }
        }
        Logger.m63178d("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f11300a);
        return validatingBuilder;
    }

    @NonNull
    public Collection<SessionConfig> getAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(m62848e(new InterfaceC2493a() { // from class: Q02
            @Override // androidx.camera.core.impl.UseCaseAttachState.InterfaceC2493a
            /* renamed from: a */
            public final boolean mo62843a(UseCaseAttachState.C2494b c2494b) {
                return UseCaseAttachState.m62852a(c2494b);
            }
        }));
    }

    @NonNull
    public Collection<UseCaseConfig<?>> getAttachedUseCaseConfigs() {
        return Collections.unmodifiableCollection(m62847f(new InterfaceC2493a() { // from class: R02
            @Override // androidx.camera.core.impl.UseCaseAttachState.InterfaceC2493a
            /* renamed from: a */
            public final boolean mo62843a(UseCaseAttachState.C2494b c2494b) {
                return UseCaseAttachState.m62851b(c2494b);
            }
        }));
    }

    public boolean isUseCaseAttached(@NonNull String str) {
        if (!this.f11301b.containsKey(str)) {
            return false;
        }
        return ((C2494b) this.f11301b.get(str)).m62841b();
    }

    public void removeUseCase(@NonNull String str) {
        this.f11301b.remove(str);
    }

    public void setUseCaseActive(@NonNull String str, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig) {
        m62849d(str, sessionConfig, useCaseConfig).m62838e(true);
    }

    public void setUseCaseAttached(@NonNull String str, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig) {
        m62849d(str, sessionConfig, useCaseConfig).m62837f(true);
    }

    public void setUseCaseDetached(@NonNull String str) {
        if (!this.f11301b.containsKey(str)) {
            return;
        }
        C2494b c2494b = (C2494b) this.f11301b.get(str);
        c2494b.m62837f(false);
        if (!c2494b.m62842a()) {
            this.f11301b.remove(str);
        }
    }

    public void setUseCaseInactive(@NonNull String str) {
        if (!this.f11301b.containsKey(str)) {
            return;
        }
        C2494b c2494b = (C2494b) this.f11301b.get(str);
        c2494b.m62838e(false);
        if (!c2494b.m62841b()) {
            this.f11301b.remove(str);
        }
    }

    public void updateUseCase(@NonNull String str, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig) {
        if (!this.f11301b.containsKey(str)) {
            return;
        }
        C2494b c2494b = new C2494b(sessionConfig, useCaseConfig);
        C2494b c2494b2 = (C2494b) this.f11301b.get(str);
        c2494b.m62837f(c2494b2.m62841b());
        c2494b.m62838e(c2494b2.m62842a());
        this.f11301b.put(str, c2494b);
    }
}