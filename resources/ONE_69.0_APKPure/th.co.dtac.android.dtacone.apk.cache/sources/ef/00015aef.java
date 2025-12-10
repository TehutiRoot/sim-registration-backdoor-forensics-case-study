package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.take_photo.CameraPreviewState;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.TakePhotoViewModel$_cameraStateLiveData$2 */
/* loaded from: classes9.dex */
public final class TakePhotoViewModel$_cameraStateLiveData$2 extends Lambda implements Function0<MutableLiveData<CameraPreviewState>> {
    public static final TakePhotoViewModel$_cameraStateLiveData$2 INSTANCE = new TakePhotoViewModel$_cameraStateLiveData$2();

    public TakePhotoViewModel$_cameraStateLiveData$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MutableLiveData<CameraPreviewState> invoke() {
        MutableLiveData<CameraPreviewState> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(CameraPreviewState.Capture.INSTANCE);
        return mutableLiveData;
    }
}