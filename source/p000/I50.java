package p000;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;

/* renamed from: I50 */
/* loaded from: classes4.dex */
public class I50 {

    /* renamed from: e */
    public static final AndroidLogger f2402e = AndroidLogger.getInstance();

    /* renamed from: a */
    public final Runtime f2403a;

    /* renamed from: b */
    public final ActivityManager f2404b;

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f2405c;

    /* renamed from: d */
    public final Context f2406d;

    public I50(Context context) {
        this(Runtime.getRuntime(), context);
    }

    /* renamed from: a */
    public int m68004a() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.f2405c.totalMem));
    }

    /* renamed from: b */
    public int m68003b() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.f2403a.maxMemory()));
    }

    /* renamed from: c */
    public int m68002c() {
        return Utils.saturatedIntCast(StorageUnit.MEGABYTES.toKilobytes(this.f2404b.getMemoryClass()));
    }

    public I50(Runtime runtime, Context context) {
        this.f2403a = runtime;
        this.f2406d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f2404b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f2405c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
