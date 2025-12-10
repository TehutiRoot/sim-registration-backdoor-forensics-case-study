package th.p047co.dtac.android.dtacone.viewmodel.home;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.profile_image.ProfileImageResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/profile_image/ProfileImageResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nGetProfileImageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetProfileImageViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/home/GetProfileImageViewModel$getProfileImage$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.GetProfileImageViewModel$getProfileImage$2 */
/* loaded from: classes9.dex */
public final class GetProfileImageViewModel$getProfileImage$2 extends Lambda implements Function1<ProfileImageResponse, Unit> {
    final /* synthetic */ GetProfileImageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileImageViewModel$getProfileImage$2(GetProfileImageViewModel getProfileImageViewModel) {
        super(1);
        this.this$0 = getProfileImageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProfileImageResponse profileImageResponse) {
        invoke2(profileImageResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ProfileImageResponse profileImageResponse) {
        MutableLiveData m2604z;
        PreferencesRepository preferencesRepository;
        String url = profileImageResponse.getUrl();
        if (url != null) {
            preferencesRepository = this.this$0.f105945c;
            preferencesRepository.setString(Constant.PROFILE_IMAGE_URL, url);
        }
        m2604z = this.this$0.m2604z();
        m2604z.setValue(Resource.Companion.success(profileImageResponse.getUrl()));
    }
}