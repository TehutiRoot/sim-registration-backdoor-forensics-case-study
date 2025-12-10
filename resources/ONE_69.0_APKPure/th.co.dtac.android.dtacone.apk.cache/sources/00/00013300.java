package th.p047co.dtac.android.dtacone.view.appOne.mnp.repository;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneMnpRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMnpRepository.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/repository/OneMnpRepositoryImpl$getAuthorization$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,511:1\n766#2:512\n857#2,2:513\n1855#2,2:515\n*S KotlinDebug\n*F\n+ 1 OneMnpRepository.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/repository/OneMnpRepositoryImpl$getAuthorization$1\n*L\n266#1:512\n266#1:513,2\n267#1:515,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepositoryImpl$getAuthorization$1 */
/* loaded from: classes10.dex */
public final class OneMnpRepositoryImpl$getAuthorization$1 extends Lambda implements Function1<MnpAuthorizationResponse, MnpAuthorizationResponse> {
    final /* synthetic */ OneMnpRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpRepositoryImpl$getAuthorization$1(OneMnpRepositoryImpl oneMnpRepositoryImpl) {
        super(1);
        this.this$0 = oneMnpRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MnpAuthorizationResponse invoke(@NotNull MnpAuthorizationResponse response) {
        PreferencesRepository preferencesRepository;
        ConfigurationRepository configurationRepository;
        PreferencesRepository preferencesRepository2;
        ConfigurationRepository configurationRepository2;
        FileUtil fileUtil;
        FileUtil fileUtil2;
        Intrinsics.checkNotNullParameter(response, "response");
        preferencesRepository = this.this$0.f91985c;
        configurationRepository = this.this$0.f91986d;
        preferencesRepository.setInt(Constant.FACE_DETECTION_CUSTOMER_COUNTER, configurationRepository.getPrepaidReregistFaceDetectionAttemptMax());
        preferencesRepository2 = this.this$0.f91985c;
        configurationRepository2 = this.this$0.f91986d;
        preferencesRepository2.setInt(Constant.FACE_DETECTION_ID_CARD_COUNTER, configurationRepository2.getPrepaidReregistFaceDetectionAttemptMax());
        OneMnpRepositoryImpl oneMnpRepositoryImpl = this.this$0;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{BitmapUtil.IMAGE_SIGNATURE, BitmapUtil.IMAGE_ID_CARD, BitmapUtil.IMAGE_FACE, BitmapUtil.IMAGE_COMPARE})) {
            fileUtil2 = oneMnpRepositoryImpl.f91987e;
            if (fileUtil2.isFileExist((String) obj)) {
                arrayList.add(obj);
            }
        }
        OneMnpRepositoryImpl oneMnpRepositoryImpl2 = this.this$0;
        for (String str : arrayList) {
            fileUtil = oneMnpRepositoryImpl2.f91987e;
            fileUtil.deleteInternalFile(str);
        }
        return response;
    }
}