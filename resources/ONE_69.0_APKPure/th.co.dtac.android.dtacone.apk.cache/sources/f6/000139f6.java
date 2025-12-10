package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.face_recognition.recognition.FaceRecognitionViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostFaceRecognitionFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostFaceRecognitionFragment$setupObserve$1 extends Lambda implements Function1<Resource<? extends FaceRecResponse>, Unit> {
    final /* synthetic */ OnePre2PostFaceRecognitionFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostFaceRecognitionFragment$setupObserve$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostFaceRecognitionFragment$setupObserve$1(OnePre2PostFaceRecognitionFragment onePre2PostFaceRecognitionFragment) {
        super(1);
        this.this$0 = onePre2PostFaceRecognitionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends FaceRecResponse> resource) {
        invoke2((Resource<FaceRecResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<FaceRecResponse> resource) {
        Resource<FaceRecResponse> resourceContentIfNotHandled;
        OnePre2PostViewModel m11420q;
        FaceRecognitionViewModel faceRecognitionViewModel;
        OnePre2PostViewModel m11420q2;
        OnePre2PostActivity m11422o;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostFaceRecognitionFragment onePre2PostFaceRecognitionFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            onePre2PostFaceRecognitionFragment.dismissLoading();
            FaceRecResponse data = resourceContentIfNotHandled.getData();
            if (data != null) {
                if (Intrinsics.areEqual(data.getStatus(), "00")) {
                    m11420q = onePre2PostFaceRecognitionFragment.m11420q();
                    m11420q.clearFaceRecResponse();
                    onePre2PostFaceRecognitionFragment.m11425I(data, false);
                    onePre2PostFaceRecognitionFragment.m11414w();
                    return;
                }
                onePre2PostFaceRecognitionFragment.onKycCounter(data);
            }
        } else if (i != 2) {
        } else {
            onePre2PostFaceRecognitionFragment.dismissLoading();
            faceRecognitionViewModel = onePre2PostFaceRecognitionFragment.f94876k;
            if (faceRecognitionViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelFaceRecognition");
                faceRecognitionViewModel = null;
            }
            int maxAttemoFaceRecognitionPre2Post = faceRecognitionViewModel.getMaxAttemoFaceRecognitionPre2Post();
            m11420q2 = onePre2PostFaceRecognitionFragment.m11420q();
            if (m11420q2.getKycAttempt() >= maxAttemoFaceRecognitionPre2Post) {
                onePre2PostFaceRecognitionFragment.m11428F();
                return;
            }
            String string = onePre2PostFaceRecognitionFragment.getString(R.string.server_error_try_again);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.server_error_try_again)");
            m11422o = onePre2PostFaceRecognitionFragment.m11422o();
            OneCustomDialogBox oneCustomDialogBox = new OneCustomDialogBox(m11422o);
            oneCustomDialogBox.setMessage(string);
            oneCustomDialogBox.show();
        }
    }
}