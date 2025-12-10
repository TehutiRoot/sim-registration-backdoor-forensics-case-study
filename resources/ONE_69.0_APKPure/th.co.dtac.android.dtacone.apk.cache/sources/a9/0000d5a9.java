package io.realm.internal.android;

import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.realm.internal.Capabilities;
import javax.annotation.Nullable;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class AndroidCapabilities implements Capabilities {
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})
    public static boolean EMULATE_MAIN_THREAD = false;

    /* renamed from: a */
    public final Looper f66859a = Looper.myLooper();

    /* renamed from: b */
    public final boolean f66860b = m29850b();

    /* renamed from: b */
    public static boolean m29850b() {
        String name = Thread.currentThread().getName();
        if (name != null && name.startsWith("IntentService[")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m29851a() {
        if (this.f66859a != null) {
            return true;
        }
        return false;
    }

    @Override // io.realm.internal.Capabilities
    public boolean canDeliverNotification() {
        if (m29851a() && !this.f66860b) {
            return true;
        }
        return false;
    }

    @Override // io.realm.internal.Capabilities
    public void checkCanDeliverNotification(@Nullable String str) {
        String str2 = "";
        if (!m29851a()) {
            if (str != null) {
                str2 = str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + "Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        } else if (this.f66860b) {
            if (str != null) {
                str2 = str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + "Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }

    @Override // io.realm.internal.Capabilities
    public boolean isMainThread() {
        Looper looper = this.f66859a;
        if (looper != null && (EMULATE_MAIN_THREAD || looper == Looper.getMainLooper())) {
            return true;
        }
        return false;
    }
}