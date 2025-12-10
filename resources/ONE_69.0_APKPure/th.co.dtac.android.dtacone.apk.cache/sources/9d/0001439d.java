package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContact;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContactInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInstallContactScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallContactScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallContactScreenKt$ContactSection$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1559#2:372\n1590#2,4:373\n*S KotlinDebug\n*F\n+ 1 InstallContactScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallContactScreenKt$ContactSection$1$3\n*L\n157#1:372\n157#1:373,4\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallContactScreenKt$ContactSection$1$3 */
/* loaded from: classes10.dex */
public final class InstallContactScreenKt$ContactSection$1$3 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ InstallContact $installContact;
    final /* synthetic */ Function1<InstallContact, Unit> $onInstallInfoChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallContactScreenKt$ContactSection$1$3(Function1<? super InstallContact, Unit> function1, InstallContact installContact) {
        super(1);
        this.$onInstallInfoChange = function1;
        this.$installContact = installContact;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Function1<InstallContact, Unit> function1 = this.$onInstallInfoChange;
        InstallContact installContact = this.$installContact;
        List<InstallContactInfo> infoList = installContact.getInfoList();
        InstallContact installContact2 = this.$installContact;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(infoList, 10));
        int i = 0;
        for (Object obj : infoList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            InstallContactInfo installContactInfo = (InstallContactInfo) obj;
            if (i == installContact2.getType().ordinal()) {
                installContactInfo = InstallContactInfo.copy$default(installContactInfo, value, null, null, 6, null);
            }
            arrayList.add(installContactInfo);
            i = i2;
        }
        function1.invoke(InstallContact.copy$default(installContact, null, arrayList, null, false, null, 29, null));
    }
}