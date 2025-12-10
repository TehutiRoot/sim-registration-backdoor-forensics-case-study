package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import android.content.Context;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"RequestCameraPermission", "", "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRequestCameraPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCameraPermission.kt\nth/co/dtac/android/dtacone/view/compose/upPass/widget/RequestCameraPermissionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,37:1\n76#2:38\n*S KotlinDebug\n*F\n+ 1 RequestCameraPermission.kt\nth/co/dtac/android/dtacone/view/compose/upPass/widget/RequestCameraPermissionKt\n*L\n14#1:38\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.RequestCameraPermissionKt */
/* loaded from: classes10.dex */
public final class RequestCameraPermissionKt {
    @Composable
    public static final void RequestCameraPermission(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(405786862);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(405786862, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.widget.RequestCameraPermission (RequestCameraPermission.kt:12)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new C15871xb44fd252(context), startRestartGroup, 8);
            if (ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
                Toast.makeText(context, "Camera permission granted", 0).show();
            } else {
                rememberLauncherForActivityResult.launch("android.permission.CAMERA");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new RequestCameraPermissionKt$RequestCameraPermission$1(i));
        }
    }
}