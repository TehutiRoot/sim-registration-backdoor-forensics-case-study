package co.omise.android.p009ui;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import co.omise.android.C5511R;
import co.omise.android.models.SourceType;
import co.omise.android.p009ui.OmiseListItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 !2\u00020\u0001:\u0011\u001d\u001e\u001f !\"#$%&'()*+,-BS\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014\u0082\u0001\u0010./0123456789:;<=¨\u0006>"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource;", "Lco/omise/android/ui/OmiseListItem;", "iconRes", "", MessageBundle.TITLE_ENTRY, "", "titleRes", "subtitleRes", "indicatorIconRes", "sourceType", "Lco/omise/android/models/SourceType;", "enabled", "", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILco/omise/android/models/SourceType;Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIconRes", "()Ljava/lang/Integer;", "getIndicatorIconRes", "getSourceType", "()Lco/omise/android/models/SourceType;", "getSubtitleRes", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getTitleRes", "Bay", "BayWlb", "Bbl", "BblWlb", "Companion", "FirstChoice", "FirstChoiceWlb", "KBank", "KBankWlb", "Ktc", "KtcWlb", "Mbb", "Scb", "ScbWlb", "Ttb", "TtbWlb", "Uob", "Lco/omise/android/ui/InstallmentResource$Bay;", "Lco/omise/android/ui/InstallmentResource$BayWlb;", "Lco/omise/android/ui/InstallmentResource$Bbl;", "Lco/omise/android/ui/InstallmentResource$BblWlb;", "Lco/omise/android/ui/InstallmentResource$FirstChoice;", "Lco/omise/android/ui/InstallmentResource$FirstChoiceWlb;", "Lco/omise/android/ui/InstallmentResource$KBank;", "Lco/omise/android/ui/InstallmentResource$KBankWlb;", "Lco/omise/android/ui/InstallmentResource$Ktc;", "Lco/omise/android/ui/InstallmentResource$KtcWlb;", "Lco/omise/android/ui/InstallmentResource$Mbb;", "Lco/omise/android/ui/InstallmentResource$Scb;", "Lco/omise/android/ui/InstallmentResource$ScbWlb;", "Lco/omise/android/ui/InstallmentResource$Ttb;", "Lco/omise/android/ui/InstallmentResource$TtbWlb;", "Lco/omise/android/ui/InstallmentResource$Uob;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.InstallmentResource */
/* loaded from: classes3.dex */
public abstract class InstallmentResource implements OmiseListItem {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private Boolean enabled;
    private final int iconRes;
    private final int indicatorIconRes;
    @NotNull
    private final SourceType sourceType;
    @Nullable
    private final Integer subtitleRes;
    @Nullable
    private final String title;
    @Nullable
    private final Integer titleRes;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Bay;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Bay */
    /* loaded from: classes3.dex */
    public static final class Bay extends InstallmentResource {
        @NotNull
        public static final Bay INSTANCE = new Bay();

        private Bay() {
            super(C5511R.C5513drawable.payment_bay, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_bay_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.Bay.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$BayWlb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$BayWlb */
    /* loaded from: classes3.dex */
    public static final class BayWlb extends InstallmentResource {
        @NotNull
        public static final BayWlb INSTANCE = new BayWlb();

        private BayWlb() {
            super(C5511R.C5513drawable.payment_bay, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_bay_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.BayWlb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Bbl;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Bbl */
    /* loaded from: classes3.dex */
    public static final class Bbl extends InstallmentResource {
        @NotNull
        public static final Bbl INSTANCE = new Bbl();

        private Bbl() {
            super(C5511R.C5513drawable.payment_bbl, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_bbl_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.Bbl.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$BblWlb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$BblWlb */
    /* loaded from: classes3.dex */
    public static final class BblWlb extends InstallmentResource {
        @NotNull
        public static final BblWlb INSTANCE = new BblWlb();

        private BblWlb() {
            super(C5511R.C5513drawable.payment_bbl, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_bbl_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.BblWlb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Companion;", "", "()V", "all", "", "Lco/omise/android/ui/InstallmentResource;", "getAll", "()Ljava/util/List;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<InstallmentResource> getAll() {
            InstallmentResource installmentResource;
            Collection<KClass<?>> nestedClasses = Reflection.getOrCreateKotlinClass(InstallmentResource.class).getNestedClasses();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nestedClasses.iterator();
            while (it.hasNext()) {
                Object objectInstance = ((KClass) it.next()).getObjectInstance();
                if (objectInstance instanceof InstallmentResource) {
                    installmentResource = (InstallmentResource) objectInstance;
                } else {
                    installmentResource = null;
                }
                if (installmentResource != null) {
                    arrayList.add(installmentResource);
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$FirstChoice;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$FirstChoice */
    /* loaded from: classes3.dex */
    public static final class FirstChoice extends InstallmentResource {
        @NotNull
        public static final FirstChoice INSTANCE = new FirstChoice();

        private FirstChoice() {
            super(C5511R.C5513drawable.payment_first_choice, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_first_choice_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.FirstChoice.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$FirstChoiceWlb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$FirstChoiceWlb */
    /* loaded from: classes3.dex */
    public static final class FirstChoiceWlb extends InstallmentResource {
        @NotNull
        public static final FirstChoiceWlb INSTANCE = new FirstChoiceWlb();

        private FirstChoiceWlb() {
            super(C5511R.C5513drawable.payment_first_choice, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_first_choice_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.FirstChoiceWlb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$KBank;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$KBank */
    /* loaded from: classes3.dex */
    public static final class KBank extends InstallmentResource {
        @NotNull
        public static final KBank INSTANCE = new KBank();

        private KBank() {
            super(C5511R.C5513drawable.payment_kasikorn, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_kasikorn_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.KBank.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$KBankWlb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$KBankWlb */
    /* loaded from: classes3.dex */
    public static final class KBankWlb extends InstallmentResource {
        @NotNull
        public static final KBankWlb INSTANCE = new KBankWlb();

        private KBankWlb() {
            super(C5511R.C5513drawable.payment_kasikorn, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_kasikorn_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.KBankWlb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Ktc;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Ktc */
    /* loaded from: classes3.dex */
    public static final class Ktc extends InstallmentResource {
        @NotNull
        public static final Ktc INSTANCE = new Ktc();

        private Ktc() {
            super(C5511R.C5513drawable.payment_ktc, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_ktc_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.Ktc.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$KtcWlb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$KtcWlb */
    /* loaded from: classes3.dex */
    public static final class KtcWlb extends InstallmentResource {
        @NotNull
        public static final KtcWlb INSTANCE = new KtcWlb();

        private KtcWlb() {
            super(C5511R.C5513drawable.payment_ktc, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_ktc_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.KtcWlb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Mbb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Mbb */
    /* loaded from: classes3.dex */
    public static final class Mbb extends InstallmentResource {
        @NotNull
        public static final Mbb INSTANCE = new Mbb();

        private Mbb() {
            super(C5511R.C5513drawable.payment_maybank, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_mbb_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.Mbb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Scb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Scb */
    /* loaded from: classes3.dex */
    public static final class Scb extends InstallmentResource {
        @NotNull
        public static final Scb INSTANCE = new Scb();

        private Scb() {
            super(C5511R.C5513drawable.payment_scb, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_scb_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.Scb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$ScbWlb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$ScbWlb */
    /* loaded from: classes3.dex */
    public static final class ScbWlb extends InstallmentResource {
        @NotNull
        public static final ScbWlb INSTANCE = new ScbWlb();

        private ScbWlb() {
            super(C5511R.C5513drawable.payment_scb, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_scb_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.ScbWlb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Ttb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Ttb */
    /* loaded from: classes3.dex */
    public static final class Ttb extends InstallmentResource {
        @NotNull
        public static final Ttb INSTANCE = new Ttb();

        private Ttb() {
            super(C5511R.C5513drawable.payment_ttb, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_ttb_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.Ttb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$TtbWlb;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$TtbWlb */
    /* loaded from: classes3.dex */
    public static final class TtbWlb extends InstallmentResource {
        @NotNull
        public static final TtbWlb INSTANCE = new TtbWlb();

        private TtbWlb() {
            super(C5511R.C5513drawable.payment_ttb, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_ttb_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.TtbWlb.INSTANCE, null, 74, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InstallmentResource$Uob;", "Lco/omise/android/ui/InstallmentResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentResource$Uob */
    /* loaded from: classes3.dex */
    public static final class Uob extends InstallmentResource {
        @NotNull
        public static final Uob INSTANCE = new Uob();

        private Uob() {
            super(C5511R.C5513drawable.payment_uob, null, Integer.valueOf(C5511R.C5518string.payment_method_installment_uob_title), null, C5511R.C5513drawable.ic_next, SourceType.Installment.Uob.INSTANCE, null, 74, null);
        }
    }

    public /* synthetic */ InstallmentResource(int i, String str, Integer num, Integer num2, int i2, SourceType sourceType, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, num, num2, i2, sourceType, bool);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @NotNull
    public Integer getIconRes() {
        return Integer.valueOf(this.iconRes);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @NotNull
    public Integer getIndicatorIconRes() {
        return Integer.valueOf(this.indicatorIconRes);
    }

    @NotNull
    public final SourceType getSourceType() {
        return this.sourceType;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public String getSubtitle() {
        return OmiseListItem.DefaultImpls.getSubtitle(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getTitleRes() {
        return this.titleRes;
    }

    public void setEnabled(@Nullable Boolean bool) {
        this.enabled = bool;
    }

    private InstallmentResource(@DrawableRes int i, String str, @StringRes Integer num, @StringRes Integer num2, @DrawableRes int i2, SourceType sourceType, Boolean bool) {
        this.iconRes = i;
        this.title = str;
        this.titleRes = num;
        this.subtitleRes = num2;
        this.indicatorIconRes = i2;
        this.sourceType = sourceType;
        this.enabled = bool;
    }

    public /* synthetic */ InstallmentResource(int i, String str, Integer num, Integer num2, int i2, SourceType sourceType, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, i2, sourceType, (i3 & 64) != 0 ? Boolean.TRUE : bool, null);
    }
}
