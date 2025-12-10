package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.TakePhotoFragment$showCameraFragment$showCamera$1 */
/* loaded from: classes9.dex */
public final class TakePhotoFragment$showCameraFragment$showCamera$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TakePhotoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoFragment$showCameraFragment$showCamera$1(TakePhotoFragment takePhotoFragment) {
        super(0);
        this.this$0 = takePhotoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction replace;
        FragmentActivity activity = this.this$0.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (beginTransaction = supportFragmentManager.beginTransaction()) == null || (replace = beginTransaction.replace(R.id.cameraContainer, CameraViewFragment.Companion.newInstance())) == null) {
            return;
        }
        replace.commit();
    }
}