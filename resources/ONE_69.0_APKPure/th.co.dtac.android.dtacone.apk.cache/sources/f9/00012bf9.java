package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModel$validateSmartCardTrue$2 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerValidateViewModel$validateSmartCardTrue$2 extends Lambda implements Function1<OneChangeOwnerValidateProfileResponse, OneChangeOwnerValidateProfileResponse> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ OneChangeOwnerValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerValidateViewModel$validateSmartCardTrue$2(OneChangeOwnerValidateViewModel oneChangeOwnerValidateViewModel, BitmapCollection bitmapCollection) {
        super(1);
        this.this$0 = oneChangeOwnerValidateViewModel;
        this.$bitmap = bitmapCollection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneChangeOwnerValidateProfileResponse invoke(@NotNull OneChangeOwnerValidateProfileResponse response) {
        BitmapUtil bitmapUtil;
        Intrinsics.checkNotNullParameter(response, "response");
        bitmapUtil = this.this$0.f89347e;
        bitmapUtil.saveInternalImage(this.$bitmap.getBitmap(), this.$bitmap.getName());
        return response;
    }
}