package p000;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;

/* renamed from: M50 */
/* loaded from: classes4.dex */
public class M50 {

    /* renamed from: e */
    public static final AndroidLogger f3804e = AndroidLogger.getInstance();

    /* renamed from: a */
    public final Runtime f3805a;

    /* renamed from: b */
    public final ActivityManager f3806b;

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f3807c;

    /* renamed from: d */
    public final Context f3808d;

    public M50(Context context) {
        this(Runtime.getRuntime(), context);
    }

    /* renamed from: a */
    public int m67451a() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.f3807c.totalMem));
    }

    /* renamed from: b */
    public int m67450b() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.f3805a.maxMemory()));
    }

    /* renamed from: c */
    public int m67449c() {
        return Utils.saturatedIntCast(StorageUnit.MEGABYTES.toKilobytes(this.f3806b.getMemoryClass()));
    }

    public M50(Runtime runtime, Context context) {
        this.f3805a = runtime;
        this.f3808d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f3806b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f3807c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}