package th.p047co.dtac.android.dtacone.util.tracker;

/* renamed from: th.co.dtac.android.dtacone.util.tracker.Trackable */
/* loaded from: classes8.dex */
public class Trackable {

    /* renamed from: a */
    public ITrackable f87215a;

    public Trackable(ITrackable iTrackable) {
        this.f87215a = iTrackable;
    }

    public void trackEvent(String str, String str2, String str3, long j) {
        this.f87215a.getTracker().trackEvent(str, str2, str3, j);
    }

    public void trackScreen(String str) {
        this.f87215a.getTracker().trackScreen(str);
    }
}