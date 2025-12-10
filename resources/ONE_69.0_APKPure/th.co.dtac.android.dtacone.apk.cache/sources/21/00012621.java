package th.p047co.dtac.android.dtacone.repository.mrtr_mnp;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.MrtrMnp;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrMnpRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrMnpRepository.kt\nth/co/dtac/android/dtacone/repository/mrtr_mnp/MrtrMnpRepository$callAuthorization$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,462:1\n766#2:463\n857#2,2:464\n1855#2,2:466\n*S KotlinDebug\n*F\n+ 1 MrtrMnpRepository.kt\nth/co/dtac/android/dtacone/repository/mrtr_mnp/MrtrMnpRepository$callAuthorization$1\n*L\n64#1:463\n64#1:464,2\n65#1:466,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository$callAuthorization$1 */
/* loaded from: classes8.dex */
public final class MrtrMnpRepository$callAuthorization$1 extends Lambda implements Function1<MnpAuthorizationResponse, MnpAuthorizationResponse> {
    final /* synthetic */ MrtrMnpRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpRepository$callAuthorization$1(MrtrMnpRepository mrtrMnpRepository) {
        super(1);
        this.this$0 = mrtrMnpRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MnpAuthorizationResponse invoke(@NotNull MnpAuthorizationResponse response) {
        MrtrMnp mrtrMnp;
        PreferencesRepository preferencesRepository;
        ConfigurationRepository configurationRepository;
        PreferencesRepository preferencesRepository2;
        ConfigurationRepository configurationRepository2;
        FileUtil fileUtil;
        FileUtil fileUtil2;
        Intrinsics.checkNotNullParameter(response, "response");
        mrtrMnp = this.this$0.f86893f;
        mrtrMnp.setAuthorizeResponse(response);
        preferencesRepository = this.this$0.f86890c;
        configurationRepository = this.this$0.f86891d;
        preferencesRepository.setInt(Constant.FACE_DETECTION_CUSTOMER_COUNTER, configurationRepository.getPrepaidReregistFaceDetectionAttemptMax());
        preferencesRepository2 = this.this$0.f86890c;
        configurationRepository2 = this.this$0.f86891d;
        preferencesRepository2.setInt(Constant.FACE_DETECTION_ID_CARD_COUNTER, configurationRepository2.getPrepaidReregistFaceDetectionAttemptMax());
        MrtrMnpRepository mrtrMnpRepository = this.this$0;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{BitmapUtil.IMAGE_SIGNATURE, BitmapUtil.IMAGE_ID_CARD, BitmapUtil.IMAGE_FACE, BitmapUtil.IMAGE_COMPARE})) {
            fileUtil2 = mrtrMnpRepository.f86892e;
            if (fileUtil2.isFileExist((String) obj)) {
                arrayList.add(obj);
            }
        }
        MrtrMnpRepository mrtrMnpRepository2 = this.this$0;
        for (String str : arrayList) {
            fileUtil = mrtrMnpRepository2.f86892e;
            fileUtil.deleteInternalFile(str);
        }
        return response;
    }
}