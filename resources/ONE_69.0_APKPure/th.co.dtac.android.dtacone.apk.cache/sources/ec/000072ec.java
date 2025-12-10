package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.profileinstaller.ProfileInstaller;

/* loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @NonNull
    public static final String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    @NonNull
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @NonNull
    public static final String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    @NonNull
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    /* loaded from: classes2.dex */
    public class C4842a implements ProfileInstaller.DiagnosticsCallback {
        public C4842a() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, Object obj) {
            ProfileInstaller.f36615b.onDiagnosticReceived(i, obj);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, Object obj) {
            ProfileInstaller.f36615b.onResultReceived(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    /* renamed from: a */
    public static void m53696a(ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            diagnosticsCallback.onResultReceived(12, null);
            return;
        }
        diagnosticsCallback.onResultReceived(13, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            ProfileInstaller.m53687i(context, new ExecutorC21540op1(), new C4842a(), true);
        } else if (ACTION_SKIP_FILE.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    ProfileInstaller.m53686j(context, new ExecutorC21540op1(), new C4842a());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    ProfileInstaller.m53693c(context, new ExecutorC21540op1(), new C4842a());
                }
            }
        } else if (ACTION_SAVE_PROFILE.equals(action)) {
            m53696a(new C4842a());
        } else if (ACTION_BENCHMARK_OPERATION.equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C4842a c4842a = new C4842a();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                AbstractC4850a.m53664b(context, c4842a);
            } else {
                c4842a.onResultReceived(16, null);
            }
        }
    }
}