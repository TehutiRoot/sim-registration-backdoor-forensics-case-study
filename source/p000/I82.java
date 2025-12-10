package p000;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: I82 */
/* loaded from: classes3.dex */
public final class I82 implements OnCompleteListener {

    /* renamed from: a */
    public final GoogleApiManager f2418a;

    /* renamed from: b */
    public final int f2419b;

    /* renamed from: c */
    public final ApiKey f2420c;

    /* renamed from: d */
    public final long f2421d;

    /* renamed from: e */
    public final long f2422e;

    public I82(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.f2418a = googleApiManager;
        this.f2419b = i;
        this.f2420c = apiKey;
        this.f2421d = j;
        this.f2422e = j2;
    }

    /* renamed from: a */
    public static I82 m67993a(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        long j;
        long j2;
        if (googleApiManager.m48605c()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config != null) {
                if (config.getMethodInvocationTelemetryEnabled()) {
                    z = config.getMethodTimingTelemetryEnabled();
                    zabq m48591q = googleApiManager.m48591q(apiKey);
                    if (m48591q != null) {
                        if (m48591q.zaf() instanceof BaseGmsClient) {
                            BaseGmsClient baseGmsClient = (BaseGmsClient) m48591q.zaf();
                            if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                                ConnectionTelemetryConfiguration m67992b = m67992b(m48591q, baseGmsClient, i);
                                if (m67992b != null) {
                                    m48591q.m48481v();
                                    z = m67992b.getMethodTimingTelemetryEnabled();
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            } else {
                z = true;
            }
            if (z) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            if (z) {
                j2 = SystemClock.elapsedRealtime();
            } else {
                j2 = 0;
            }
            return new I82(googleApiManager, i, apiKey, j, j2, null, null);
        }
        return null;
    }

    /* renamed from: b */
    public static ConnectionTelemetryConfiguration m67992b(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.m48489n() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq m48591q;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int errorCode;
        long j;
        long j2;
        int i5;
        if (this.f2418a.m48605c()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (m48591q = this.f2418a.m48591q(this.f2420c)) != null && (m48591q.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) m48591q.zaf();
                boolean z2 = true;
                if (this.f2421d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration m67992b = m67992b(m48591q, baseGmsClient, this.f2419b);
                        if (m67992b != null) {
                            z2 = (!m67992b.getMethodTimingTelemetryEnabled() || this.f2421d <= 0) ? false : false;
                            maxMethodInvocationsInBatch = m67992b.getMaxMethodInvocationsLogged();
                            z = z2;
                        } else {
                            return;
                        }
                    }
                    i2 = batchPeriodMillis;
                    i3 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                GoogleApiManager googleApiManager = this.f2418a;
                if (task.isSuccessful()) {
                    i4 = 0;
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i4 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult == null) {
                                i4 = statusCode;
                            } else {
                                errorCode = connectionResult.getErrorCode();
                                i4 = statusCode;
                            }
                        } else {
                            i4 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z) {
                    long j3 = this.f2421d;
                    long j4 = this.f2422e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - j4);
                    j = j3;
                    j2 = currentTimeMillis;
                } else {
                    j = 0;
                    j2 = 0;
                    i5 = -1;
                }
                googleApiManager.m48585w(new MethodInvocation(this.f2419b, i4, errorCode, j, j2, null, null, gCoreServiceId, i5), i, i2, i3);
            }
        }
    }
}
