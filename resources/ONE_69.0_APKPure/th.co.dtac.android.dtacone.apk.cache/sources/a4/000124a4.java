package th.p047co.dtac.android.dtacone.presenter.profile;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.profile_image.ProfileImageResponse;
import th.p047co.dtac.android.dtacone.presenter.profile.ProfilePicturePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/profile_image/ProfileImageResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.profile.ProfilePicturePresenter$getProfileImage$2 */
/* loaded from: classes8.dex */
public final class ProfilePicturePresenter$getProfileImage$2 extends Lambda implements Function1<ProfileImageResponse, Unit> {
    final /* synthetic */ ProfilePicturePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePicturePresenter$getProfileImage$2(ProfilePicturePresenter profilePicturePresenter) {
        super(1);
        this.this$0 = profilePicturePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProfileImageResponse profileImageResponse) {
        invoke2(profileImageResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ProfileImageResponse profileImageResponse) {
        ProfilePicturePresenter.View view;
        ProfilePicturePresenter.View view2;
        String url = profileImageResponse.getUrl();
        ProfilePicturePresenter.View view3 = null;
        if (url == null || url.length() == 0) {
            view = this.this$0.f86271e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view;
            }
            view3.onGetProfileImageFailed();
            return;
        }
        view2 = this.this$0.f86271e;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        view3.onGetProfileImageSuccess(profileImageResponse.getUrl());
    }
}