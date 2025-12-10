package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.repository;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundCustomerInfoItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundCustomerInfoResponse;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundProductItem;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCustomerInfoResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneNadOutboundRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNadOutboundRepository.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/repository/OneNadOutboundRepository$getOneNadOutboundCustomerInfo$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 OneNadOutboundRepository.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/repository/OneNadOutboundRepository$getOneNadOutboundCustomerInfo$1\n*L\n80#1:138,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.repository.OneNadOutboundRepository$getOneNadOutboundCustomerInfo$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundRepository$getOneNadOutboundCustomerInfo$1 extends Lambda implements Function1<OneNadOutboundCustomerInfoResponse, OneNadOutboundCustomerInfoResponse> {
    final /* synthetic */ OneNadOutboundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundRepository$getOneNadOutboundCustomerInfo$1(OneNadOutboundRepository oneNadOutboundRepository) {
        super(1);
        this.this$0 = oneNadOutboundRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneNadOutboundCustomerInfoResponse invoke(@NotNull OneNadOutboundCustomerInfoResponse response) {
        ConfigurationRepository configurationRepository;
        ConfigurationRepository configurationRepository2;
        ConfigurationRepository configurationRepository3;
        ConfigurationRepository configurationRepository4;
        ConfigurationRepository configurationRepository5;
        Intrinsics.checkNotNullParameter(response, "response");
        OneNadOutboundCustomerInfoItem data = response.getData();
        if (data != null) {
            OneNadOutboundRepository oneNadOutboundRepository = this.this$0;
            ArrayList<OneNadOutboundProductItem> productList = data.getProductList();
            if (productList != null) {
                for (OneNadOutboundProductItem oneNadOutboundProductItem : productList) {
                    String productNumber = oneNadOutboundProductItem.getProductNumber();
                    configurationRepository5 = oneNadOutboundRepository.f92328b;
                    oneNadOutboundProductItem.setProductNumber(AESCryptUtil.decryptCBC(productNumber, configurationRepository5.dataPrivacyEncryptionAES256CBCKey()));
                }
            }
            String firstName = data.getFirstName();
            configurationRepository = oneNadOutboundRepository.f92328b;
            data.setFirstName(AESCryptUtil.decryptCBC(firstName, configurationRepository.dataPrivacyEncryptionAES256CBCKey()));
            String lastName = data.getLastName();
            configurationRepository2 = oneNadOutboundRepository.f92328b;
            data.setLastName(AESCryptUtil.decryptCBC(lastName, configurationRepository2.dataPrivacyEncryptionAES256CBCKey()));
            String contactNumber = data.getContactNumber();
            if (contactNumber == null) {
                contactNumber = "";
            }
            configurationRepository3 = oneNadOutboundRepository.f92328b;
            data.setContactNumber(AESCryptUtil.decryptCBC(contactNumber, configurationRepository3.dataPrivacyEncryptionAES256CBCKey()));
            String billMediaValue = data.getBillMediaValue();
            String str = billMediaValue != null ? billMediaValue : "";
            configurationRepository4 = oneNadOutboundRepository.f92328b;
            data.setBillMediaValue(AESCryptUtil.decryptCBC(str, configurationRepository4.dataPrivacyEncryptionAES256CBCKey()));
        }
        this.this$0.getOneNadOutboundModel().setCustomerInfo(response.getData());
        return response;
    }
}