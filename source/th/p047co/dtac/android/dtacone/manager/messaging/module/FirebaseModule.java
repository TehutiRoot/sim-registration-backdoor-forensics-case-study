package th.p047co.dtac.android.dtacone.manager.messaging.module;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/messaging/module/FirebaseModule;", "", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "<init>", "(Lcom/google/firebase/messaging/FirebaseMessaging;)V", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "rtrRepository", "Lth/co/dtac/android/dtacone/manager/messaging/FirebaseMessagingTopic;", "provideFirebaseTopic", "(Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;)Lth/co/dtac/android/dtacone/manager/messaging/FirebaseMessagingTopic;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/messaging/FirebaseMessaging;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@Module
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.module.FirebaseModule */
/* loaded from: classes7.dex */
public final class FirebaseModule {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FirebaseMessaging f84965a;

    public FirebaseModule(@NotNull FirebaseMessaging firebaseMessaging) {
        Intrinsics.checkNotNullParameter(firebaseMessaging, "firebaseMessaging");
        this.f84965a = firebaseMessaging;
    }

    @Provides
    @Singleton
    @NotNull
    public final FirebaseMessagingTopic provideFirebaseTopic(@NotNull RtrRepository rtrRepository) {
        Intrinsics.checkNotNullParameter(rtrRepository, "rtrRepository");
        return new FirebaseMessagingTopic(this.f84965a, rtrRepository);
    }
}
