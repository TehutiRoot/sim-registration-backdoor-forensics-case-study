package th.p047co.dtac.android.dtacone.configuration;

import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository;
import th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepositoryImpl;
import th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository;
import th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepositoryImpl;
import th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository;
import th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepositoryImpl;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepositoryImpl;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;
import th.p047co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi;
import th.p047co.dtac.android.dtacone.data.remote.oneConsentAndESign.OneConsentAndESignApi;
import th.p047co.dtac.android.dtacone.data.remote.oneDeviceSaleTrue.OneDeviceSaleTrueApi;
import th.p047co.dtac.android.dtacone.data.remote.oneTol.OneTolApi;
import th.p047co.dtac.android.dtacone.data.remote.postpaid.OnePostpaidApi;
import th.p047co.dtac.android.dtacone.data.remote.pre2post.OnePre2PostApi;
import th.p047co.dtac.android.dtacone.data.remote.upPass.UpPassApi;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.change_pack.ChangePackRepository;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.repository.otp_transaction.OtpTransactionRepository;
import th.p047co.dtac.android.dtacone.repository.take_photo.TakePhotoRepository;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;
import th.p047co.dtac.android.dtacone.util.Converter;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.repository.OneCampaignRepository;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.repository.OneOnlineRegisterRepository;
import th.p047co.dtac.android.dtacone.view.appOne.online_activation.repository.OneOnlineActivationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepository;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepository;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository;
import th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepositoryImpl;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;
import th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository;
import th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepositoryImpl;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0084\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J \u0010\u001f\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010#\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J0\u0010/\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u00103\u001a\u0002042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u00105\u001a\u0002062\u0006\u0010\u0005\u001a\u000207H\u0007J0\u00108\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010<\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J@\u0010>\u001a\u00020?2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010@\u001a\u00020AH\u0007JH\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010D\u001a\u00020E2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010M\u001a\u00020N2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010O\u001a\u00020P2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010Q\u001a\u00020R2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010S\u001a\u00020T2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010U\u001a\u00020V2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010W\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007JP\u0010Y\u001a\u00020Z2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010[\u001a\u00020J2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020]2\u0006\u0010@\u001a\u00020AH\u0007Jp\u0010^\u001a\u00020_2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010`\u001a\u00020J2\u0006\u0010G\u001a\u00020H2\u0006\u0010a\u001a\u00020;2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020A2\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010K\u001a\u00020LH\u0007J@\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\\\u001a\u00020]2\u0006\u0010@\u001a\u00020AH\u0007J \u0010e\u001a\u00020f2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\n2\u0006\u0010\\\u001a\u00020]H\u0007J\u0010\u0010h\u001a\u00020i2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010j\u001a\u00020k2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010l\u001a\u00020m2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010n\u001a\u00020o2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J(\u0010p\u001a\u00020q2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\\\u001a\u00020]H\u0007JP\u0010r\u001a\u00020s2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010t\u001a\u00020u2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010v\u001a\u00020w2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020]2\u0006\u0010@\u001a\u00020AH\u0007J\u0018\u0010x\u001a\u00020y2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010z\u001a\u00020{2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010|\u001a\u00020}2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J3\u0010~\u001a\u00020\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0007\u0010\u0082\u0001\u001a\u00020]2\u0006\u0010v\u001a\u00020w2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0083\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/SingletonRepositoryModule;", "", "()V", "provideChangePackRepository", "Lth/co/dtac/android/dtacone/repository/change_pack/ChangePackRepository;", "api", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "configurationRepository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "provideCustomerEnquiryRepository", "Lth/co/dtac/android/dtacone/repository/customer_enquiry/CustomerEnquiryRepository;", "fileUtil", "Lth/co/dtac/android/dtacone/util/FileUtil;", "provideDeviceSaleRepository", "Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;", "provideEsimRepository", "Lth/co/dtac/android/dtacone/repository/esim/ESimRepository;", "pref", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "provideMrtrChangeSimRepository", "Lth/co/dtac/android/dtacone/repository/mrtr_change_sim/MrtrChangeSimRepository;", "provideMrtrMnpRepository", "Lth/co/dtac/android/dtacone/repository/mrtr_mnp/MrtrMnpRepository;", "provideMrtrPostpaidReregistRepository", "Lth/co/dtac/android/dtacone/repository/mrtr_postpaid/MrtrPostpaidRepository;", "provideMrtrPre2PostRepository", "Lth/co/dtac/android/dtacone/repository/mrtr_pre2post/MrtrPre2PostRepository;", "compressImage", "Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "provideMrtrPrepaidMultiSimRepository", "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_multi_sim/MrtrPrepaidMultiSimRepository;", "provideMrtrPrepaidRepository", "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid/MrtrPrepaidRepository;", "provideMrtrPrepaidReregistRepository", "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_reregist/MrtrPrepaidReregistRepository;", "multiPartService", "Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;", "provideOneActivateSimRepository", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/repository/OneActivateSimRepository;", "provideOneBuyDolRepository", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/repository/OneBuyDolRepository;", "provideOneCampaignRepository", "Lth/co/dtac/android/dtacone/view/appOne/campaign/repository/OneCampaignRepository;", "oneCampaignApi", "Lth/co/dtac/android/dtacone/data/remote/campaign/OneCampaignApi;", "provideOneChangeOwnerRepository", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/repository/OneChangeOwnerRepository;", "oneChangeOwnerApi", "Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;", "provideOneChangePasswordRepository", "Lth/co/dtac/android/dtacone/app_one/repository/OneChangePasswordRepository;", "provideOneConsentAndESignRepository", "Lth/co/dtac/android/dtacone/view/appOne/eSign/repository/OneConsentAndESignRepository;", "Lth/co/dtac/android/dtacone/data/remote/oneConsentAndESign/OneConsentAndESignApi;", "provideOneDeviceSaleRepository", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository;", "apiDeviceSale", "Lth/co/dtac/android/dtacone/data/remote/devicer_sale/OneDeviceSaleApi;", "provideOneForgotPasswordRepository", "Lth/co/dtac/android/dtacone/app_one/repository/OneForgotPasswordRepository;", "provideOneMnpRepository", "Lth/co/dtac/android/dtacone/view/appOne/mnp/repository/OneMnpRepository;", "udidService", "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "provideOneNewDeviceSaleRepository", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/repository/OneDeviceSaleTrueRepository;", "oneDeviceSaleTrueApi", "Lth/co/dtac/android/dtacone/data/remote/oneDeviceSaleTrue/OneDeviceSaleTrueApi;", "rtrApiRx2", "pre2postApi", "Lth/co/dtac/android/dtacone/data/remote/pre2post/OnePre2PostApi;", "postApi", "Lth/co/dtac/android/dtacone/data/remote/postpaid/OnePostpaidApi;", "imageUtil", "Lth/co/dtac/android/dtacone/util/image/ImageUtil;", "provideOneNewsNotificationRepository", "Lth/co/dtac/android/dtacone/view/appOne/notification/repository/OneNewsNotificationRepository;", "provideOneOneCommissionReportRepository", "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneCommissionReportRepository;", "provideOneOneProfitReportRepository", "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneProfitReportRepository;", "provideOneOnlineActivationRepository", "Lth/co/dtac/android/dtacone/view/appOne/online_activation/repository/OneOnlineActivationRepository;", "provideOneOnlineRegisterRepository", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/repository/OneOnlineRegisterRepository;", "provideOneOwnerManagementRepository", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/repository/OneOwnerManagementRepository;", "provideOnePostpaidReregistRepository", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/repository/OnePostpaidRepository;", "apiPos", "pfViewModel", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "provideOnePre2PostRepository", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/repository/OnePre2PostRepository;", "postpaidApi", "oneDeviceSaleApi", "provideOnePrepaidRepository", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/repository/OnePrepaidRepository;", "apiRtr", "provideOneRectifyRepository", "Lth/co/dtac/android/dtacone/view/appOne/rectify/repository/OneRectifyRepository;", "conf", "provideOneRegistrationRepository", "Lth/co/dtac/android/dtacone/app_one/repository/OneRegistrationRepository;", "provideOneRetailerProfileUpdateRepository", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/repository/OneRetailerProfileUpdateRepository;", "provideOneShopListRepository", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/repository/OneShopListRepository;", "provideOneStaffRepository", "Lth/co/dtac/android/dtacone/view/appOne/staff/repository/OneStaffRepository;", "provideOneStvRepository", "Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;", "provideOneTolRepository", "Lth/co/dtac/android/dtacone/view/appOne/tol/repository/OneTolRepository;", "apiTol", "Lth/co/dtac/android/dtacone/data/remote/oneTol/OneTolApi;", "bitmapUtil", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "provideOneTopUpRepository", "Lth/co/dtac/android/dtacone/view/appOne/topup/repository/OneTopUpRepository;", "provideOtpTransactionRepository", "Lth/co/dtac/android/dtacone/repository/otp_transaction/OtpTransactionRepository;", "provideTakePhotoRepository", "Lth/co/dtac/android/dtacone/repository/take_photo/TakePhotoRepository;", "provideUpPassRepository", "Lth/co/dtac/android/dtacone/repository/upPass/UpPassRepository;", "apiUpPass", "Lth/co/dtac/android/dtacone/data/remote/upPass/UpPassApi;", "preferencesViewModel", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final ChangePackRepository provideChangePackRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new ChangePackRepository(api, rtrRx2Repository, configurationRepository, null, null, 24, null);
    }

    @Provides
    @Singleton
    @NotNull
    public final CustomerEnquiryRepository provideCustomerEnquiryRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull FileUtil fileUtil, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new CustomerEnquiryRepository(api, rtrRx2Repository, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final DeviceSaleRepository provideDeviceSaleRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull FileUtil fileUtil, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new DeviceSaleRepository(api, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final ESimRepository provideEsimRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesRepository pref, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new ESimRepository(api, rtrRx2Repository, pref, configurationRepository, fileUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final MrtrChangeSimRepository provideMrtrChangeSimRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new MrtrChangeSimRepository(api, rtrRx2Repository, configurationRepository, fileUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final MrtrMnpRepository provideMrtrMnpRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesRepository pref, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new MrtrMnpRepository(api, rtrRx2Repository, pref, configurationRepository, fileUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final MrtrPostpaidRepository provideMrtrPostpaidReregistRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesRepository pref, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new MrtrPostpaidRepository(api, rtrRx2Repository, pref, configurationRepository, fileUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final MrtrPre2PostRepository provideMrtrPre2PostRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil, @NotNull CompressImage compressImage) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(compressImage, "compressImage");
        return new MrtrPre2PostRepository(api, rtrRx2Repository, configurationRepository, fileUtil, compressImage);
    }

    @Provides
    @Singleton
    @NotNull
    public final MrtrPrepaidMultiSimRepository provideMrtrPrepaidMultiSimRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new MrtrPrepaidMultiSimRepository(api, rtrRx2Repository, fileUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final MrtrPrepaidRepository provideMrtrPrepaidRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new MrtrPrepaidRepository(api, rtrRx2Repository, fileUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final MrtrPrepaidReregistRepository provideMrtrPrepaidReregistRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull FileUtil fileUtil, @NotNull MultiPartService multiPartService, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(multiPartService, "multiPartService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new MrtrPrepaidReregistRepository(api, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneActivateSimRepository provideOneActivateSimRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneActivateSimRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneBuyDolRepository provideOneBuyDolRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        return new OneBuyDolRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneCampaignRepository provideOneCampaignRepository(@NotNull OneCampaignApi oneCampaignApi, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(oneCampaignApi, "oneCampaignApi");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneCampaignRepository(oneCampaignApi, rtrRx2Repository, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneChangeOwnerRepository provideOneChangeOwnerRepository(@NotNull RTRApiRx2 api, @NotNull OneChangeOwnerApi oneChangeOwnerApi, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull FileUtil fileUtil, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(oneChangeOwnerApi, "oneChangeOwnerApi");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneChangeOwnerRepository(api, oneChangeOwnerApi, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneChangePasswordRepository provideOneChangePasswordRepository(@NotNull RTRApiRx2 api, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneChangePasswordRepositoryImpl(api, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneConsentAndESignRepository provideOneConsentAndESignRepository(@NotNull OneConsentAndESignApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneConsentAndESignRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneDeviceSaleRepository provideOneDeviceSaleRepository(@NotNull RTRApiRx2 api, @NotNull OneDeviceSaleApi apiDeviceSale, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull FileUtil fileUtil, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(apiDeviceSale, "apiDeviceSale");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneDeviceSaleRepository(api, apiDeviceSale, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneForgotPasswordRepository provideOneForgotPasswordRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneForgotPasswordRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneMnpRepository provideOneMnpRepository(@NotNull RTRApiRx2 api, @NotNull OneChangeOwnerApi oneChangeOwnerApi, @NotNull PreferencesRepository pref, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull UdidService udidService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(oneChangeOwnerApi, "oneChangeOwnerApi");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        return new OneMnpRepositoryImpl(api, oneChangeOwnerApi, pref, configurationRepository, fileUtil, rtrRx2Repository, udidService);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneDeviceSaleTrueRepository provideOneNewDeviceSaleRepository(@NotNull ConfigurationRepository configurationRepository, @NotNull OneDeviceSaleTrueApi oneDeviceSaleTrueApi, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull RTRApiRx2 rtrApiRx2, @NotNull OnePre2PostApi pre2postApi, @NotNull OnePostpaidApi postApi, @NotNull ImageUtil imageUtil, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(oneDeviceSaleTrueApi, "oneDeviceSaleTrueApi");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(rtrApiRx2, "rtrApiRx2");
        Intrinsics.checkNotNullParameter(pre2postApi, "pre2postApi");
        Intrinsics.checkNotNullParameter(postApi, "postApi");
        Intrinsics.checkNotNullParameter(imageUtil, "imageUtil");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new OneDeviceSaleTrueRepository(configurationRepository, oneDeviceSaleTrueApi, rtrApiRx2, pre2postApi, postApi, rtrRx2Repository, imageUtil, fileUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneNewsNotificationRepository provideOneNewsNotificationRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneNewsNotificationRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneCommissionReportRepository provideOneOneCommissionReportRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneCommissionReportRepositoryImpl(api, rtrRx2Repository, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneProfitReportRepository provideOneOneProfitReportRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneProfitReportRepositoryImpl(api, rtrRx2Repository, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneOnlineActivationRepository provideOneOnlineActivationRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneOnlineActivationRepository(api, rtrRx2Repository, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneOnlineRegisterRepository provideOneOnlineRegisterRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneOnlineRegisterRepository(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneOwnerManagementRepository provideOneOwnerManagementRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneOwnerManagementRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OnePostpaidRepository provideOnePostpaidReregistRepository(@NotNull RTRApiRx2 api, @NotNull OnePostpaidApi apiPos, @NotNull OneDeviceSaleApi apiDeviceSale, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesRepository pref, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil, @NotNull PreferencesViewModel pfViewModel, @NotNull UdidService udidService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(apiPos, "apiPos");
        Intrinsics.checkNotNullParameter(apiDeviceSale, "apiDeviceSale");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        return new OnePostpaidRepository(api, apiPos, apiDeviceSale, rtrRx2Repository, pref, configurationRepository, fileUtil, pfViewModel, udidService);
    }

    @Provides
    @Singleton
    @NotNull
    public final OnePre2PostRepository provideOnePre2PostRepository(@NotNull RTRApiRx2 api, @NotNull OnePostpaidApi postpaidApi, @NotNull OnePre2PostApi pre2postApi, @NotNull OneDeviceSaleApi oneDeviceSaleApi, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull OneDeviceSaleTrueApi oneDeviceSaleTrueApi, @NotNull ConfigurationRepository configurationRepository, @NotNull FileUtil fileUtil, @NotNull CompressImage compressImage, @NotNull UdidService udidService, @NotNull PreferencesViewModel pfViewModel, @NotNull PreferencesRepository pref, @NotNull ImageUtil imageUtil) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(postpaidApi, "postpaidApi");
        Intrinsics.checkNotNullParameter(pre2postApi, "pre2postApi");
        Intrinsics.checkNotNullParameter(oneDeviceSaleApi, "oneDeviceSaleApi");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(oneDeviceSaleTrueApi, "oneDeviceSaleTrueApi");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(compressImage, "compressImage");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(imageUtil, "imageUtil");
        return new OnePre2PostRepository(api, postpaidApi, pre2postApi, oneDeviceSaleApi, oneDeviceSaleTrueApi, rtrRx2Repository, configurationRepository, fileUtil, compressImage, udidService, pfViewModel, pref, imageUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public final OnePrepaidRepository provideOnePrepaidRepository(@NotNull RTRApiRx2 apiRtr, @NotNull OneChangeOwnerApi oneChangeOwnerApi, @NotNull FileUtil fileUtil, @NotNull ConfigurationRepository configurationRepository, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesViewModel pfViewModel, @NotNull UdidService udidService) {
        Intrinsics.checkNotNullParameter(apiRtr, "apiRtr");
        Intrinsics.checkNotNullParameter(oneChangeOwnerApi, "oneChangeOwnerApi");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        return new OnePrepaidRepositoryImpl(apiRtr, oneChangeOwnerApi, fileUtil, configurationRepository, rtrRx2Repository, pfViewModel, udidService);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneRectifyRepository provideOneRectifyRepository(@NotNull RTRApiRx2 apiRtr, @NotNull ConfigurationRepository conf, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(apiRtr, "apiRtr");
        Intrinsics.checkNotNullParameter(conf, "conf");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        return new OneRectifyRepositoryImpl(apiRtr, conf, pfViewModel);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneRegistrationRepository provideOneRegistrationRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneRegistrationRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneRetailerProfileUpdateRepository provideOneRetailerProfileUpdateRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneRetailerProfileUpdateRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneShopListRepository provideOneShopListRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OneShopListRepositoryImpl(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneStaffRepository provideOneStaffRepository(@NotNull RTRApiRx2 api, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        return new OneStaffRepositoryImpl(api, configurationRepository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneStvRepository provideOneStvRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        return new OneStvRepositoryImpl(api, rtrRx2Repository, configurationRepository, pfViewModel);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneTolRepository provideOneTolRepository(@NotNull RTRApiRx2 api, @NotNull OneTolApi apiTol, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesRepository pref, @NotNull ConfigurationRepository configurationRepository, @NotNull BitmapUtil bitmapUtil, @NotNull FileUtil fileUtil, @NotNull PreferencesViewModel pfViewModel, @NotNull UdidService udidService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(apiTol, "apiTol");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        return new OneTolRepository(api, apiTol, rtrRx2Repository, pref, configurationRepository, bitmapUtil, fileUtil, pfViewModel, udidService);
    }

    @Provides
    @Singleton
    @NotNull
    public final OneTopUpRepository provideOneTopUpRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        return new OneTopUpRepositoryImpl(api, rtrRx2Repository);
    }

    @Provides
    @Singleton
    @NotNull
    public final OtpTransactionRepository provideOtpTransactionRepository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OtpTransactionRepository(api);
    }

    @Provides
    @Singleton
    @NotNull
    public final TakePhotoRepository provideTakePhotoRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        return new TakePhotoRepository(api, new Converter(), rtrRx2Repository);
    }

    @Provides
    @Singleton
    @NotNull
    public final UpPassRepository provideUpPassRepository(@NotNull UpPassApi apiUpPass, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesViewModel preferencesViewModel, @NotNull BitmapUtil bitmapUtil, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(apiUpPass, "apiUpPass");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(preferencesViewModel, "preferencesViewModel");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new UpPassRepository(apiUpPass, rtrRx2Repository, preferencesViewModel, bitmapUtil, fileUtil);
    }
}
