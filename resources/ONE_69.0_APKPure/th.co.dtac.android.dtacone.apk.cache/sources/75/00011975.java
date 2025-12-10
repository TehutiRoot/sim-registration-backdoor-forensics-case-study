package th.p047co.dtac.android.dtacone.life_cycle;

import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/life_cycle/ApplicationLifecycle;", "", "onApplicationDestroyed", "", "onApplicationResumed", "onApplicationStopped", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.life_cycle.ApplicationLifecycle */
/* loaded from: classes7.dex */
public interface ApplicationLifecycle {
    void onApplicationDestroyed();

    void onApplicationResumed();

    void onApplicationStopped();
}