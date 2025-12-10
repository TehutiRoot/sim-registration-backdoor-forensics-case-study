package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ForceCloseCaptureSession {

    /* renamed from: a */
    public final CaptureSessionOnClosedNotCalledQuirk f10549a;

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface OnConfigured {
        void run(@NonNull SynchronizedCaptureSession synchronizedCaptureSession);
    }

    public ForceCloseCaptureSession(@NonNull Quirks quirks) {
        this.f10549a = (CaptureSessionOnClosedNotCalledQuirk) quirks.get(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    /* renamed from: a */
    public final void m63574a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SynchronizedCaptureSession synchronizedCaptureSession = (SynchronizedCaptureSession) it.next();
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    /* renamed from: b */
    public final void m63573b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SynchronizedCaptureSession synchronizedCaptureSession = (SynchronizedCaptureSession) it.next();
            synchronizedCaptureSession.getStateCallback().onConfigureFailed(synchronizedCaptureSession);
        }
    }

    public void onSessionConfigured(@NonNull SynchronizedCaptureSession synchronizedCaptureSession, @NonNull List<SynchronizedCaptureSession> list, @NonNull List<SynchronizedCaptureSession> list2, @NonNull OnConfigured onConfigured) {
        SynchronizedCaptureSession next;
        SynchronizedCaptureSession next2;
        if (shouldForceClose()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(next2);
            }
            m63573b(linkedHashSet);
        }
        onConfigured.run(synchronizedCaptureSession);
        if (shouldForceClose()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(next);
            }
            m63574a(linkedHashSet2);
        }
    }

    public boolean shouldForceClose() {
        if (this.f10549a != null) {
            return true;
        }
        return false;
    }
}
