package th.p047co.dtac.android.dtacone.presenter.runtime_permission;

import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tbruyelle.rxpermissions2.Permission;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.presenter.runtime_permission.CameraPermissionPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lcom/tbruyelle/rxpermissions2/Permission;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.runtime_permission.CameraPermissionPresenter$askForCameraPermission$2 */
/* loaded from: classes8.dex */
public final class CameraPermissionPresenter$askForCameraPermission$2 extends Lambda implements Function1<Permission, Unit> {
    final /* synthetic */ CameraPermissionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPermissionPresenter$askForCameraPermission$2(CameraPermissionPresenter cameraPermissionPresenter) {
        super(1);
        this.this$0 = cameraPermissionPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Permission permission) {
        invoke2(permission);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Permission permission) {
        CameraPermissionPresenter.View view;
        CameraPermissionPresenter.View view2;
        CameraPermissionPresenter.View view3 = null;
        if (permission.granted) {
            view2 = this.this$0.f86400b;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view2;
            }
            view3.onPermissionCameraGranted();
            return;
        }
        view = this.this$0.f86400b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        view3.onPermissionCameraDenied();
    }
}