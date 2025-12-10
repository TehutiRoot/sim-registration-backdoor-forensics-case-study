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

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00182\u00020\u0001:\u0006\u0016\u0017\u0018\u0019\u001a\u001bBG\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\r\u0082\u0001\u0005\u001c\u001d\u001e\u001f ¨\u0006!"}, m28850d2 = {"Lco/omise/android/ui/MobileBankingResource;", "Lco/omise/android/ui/OmiseListItem;", "iconRes", "", MessageBundle.TITLE_ENTRY, "", "titleRes", "subtitleRes", "indicatorIconRes", "sourceType", "Lco/omise/android/models/SourceType;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILco/omise/android/models/SourceType;)V", "getIconRes", "()Ljava/lang/Integer;", "getIndicatorIconRes", "getSourceType", "()Lco/omise/android/models/SourceType;", "getSubtitleRes", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getTitleRes", "Bay", "Bbl", "Companion", "KBank", "KTB", "Scb", "Lco/omise/android/ui/MobileBankingResource$Bay;", "Lco/omise/android/ui/MobileBankingResource$Bbl;", "Lco/omise/android/ui/MobileBankingResource$KBank;", "Lco/omise/android/ui/MobileBankingResource$KTB;", "Lco/omise/android/ui/MobileBankingResource$Scb;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.MobileBankingResource */
/* loaded from: classes3.dex */
public abstract class MobileBankingResource implements OmiseListItem {
    @NotNull
    public static final Companion Companion = new Companion(null);
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

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/MobileBankingResource$Bay;", "Lco/omise/android/ui/MobileBankingResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.MobileBankingResource$Bay */
    /* loaded from: classes3.dex */
    public static final class Bay extends MobileBankingResource {
        @NotNull
        public static final Bay INSTANCE = new Bay();

        private Bay() {
            super(C5511R.C5513drawable.kma, null, Integer.valueOf(C5511R.C5518string.payment_method_mobile_banking_bay_title), null, C5511R.C5513drawable.ic_redirect, SourceType.MobileBanking.Bay.INSTANCE, 10, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/MobileBankingResource$Bbl;", "Lco/omise/android/ui/MobileBankingResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.MobileBankingResource$Bbl */
    /* loaded from: classes3.dex */
    public static final class Bbl extends MobileBankingResource {
        @NotNull
        public static final Bbl INSTANCE = new Bbl();

        private Bbl() {
            super(C5511R.C5513drawable.bblm, null, Integer.valueOf(C5511R.C5518string.payment_method_mobile_banking_bbl_title), null, C5511R.C5513drawable.ic_redirect, SourceType.MobileBanking.Bbl.INSTANCE, 10, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lco/omise/android/ui/MobileBankingResource$Companion;", "", "()V", "all", "", "Lco/omise/android/ui/MobileBankingResource;", "getAll", "()Ljava/util/List;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.MobileBankingResource$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<MobileBankingResource> getAll() {
            MobileBankingResource mobileBankingResource;
            Collection<KClass<?>> nestedClasses = Reflection.getOrCreateKotlinClass(MobileBankingResource.class).getNestedClasses();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nestedClasses.iterator();
            while (it.hasNext()) {
                Object objectInstance = ((KClass) it.next()).getObjectInstance();
                if (objectInstance instanceof MobileBankingResource) {
                    mobileBankingResource = (MobileBankingResource) objectInstance;
                } else {
                    mobileBankingResource = null;
                }
                if (mobileBankingResource != null) {
                    arrayList.add(mobileBankingResource);
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/MobileBankingResource$KBank;", "Lco/omise/android/ui/MobileBankingResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.MobileBankingResource$KBank */
    /* loaded from: classes3.dex */
    public static final class KBank extends MobileBankingResource {
        @NotNull
        public static final KBank INSTANCE = new KBank();

        private KBank() {
            super(C5511R.C5513drawable.payment_kplus, null, Integer.valueOf(C5511R.C5518string.payment_method_mobile_banking_kbank_title), null, C5511R.C5513drawable.ic_redirect, SourceType.MobileBanking.KBank.INSTANCE, 10, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/MobileBankingResource$KTB;", "Lco/omise/android/ui/MobileBankingResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.MobileBankingResource$KTB */
    /* loaded from: classes3.dex */
    public static final class KTB extends MobileBankingResource {
        @NotNull
        public static final KTB INSTANCE = new KTB();

        private KTB() {
            super(C5511R.C5513drawable.payment_ktb_next, null, Integer.valueOf(C5511R.C5518string.payment_method_mobile_banking_ktb_title), null, C5511R.C5513drawable.ic_redirect, SourceType.MobileBanking.KTB.INSTANCE, 10, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/MobileBankingResource$Scb;", "Lco/omise/android/ui/MobileBankingResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.MobileBankingResource$Scb */
    /* loaded from: classes3.dex */
    public static final class Scb extends MobileBankingResource {
        @NotNull
        public static final Scb INSTANCE = new Scb();

        private Scb() {
            super(C5511R.C5513drawable.scb_easy, null, Integer.valueOf(C5511R.C5518string.payment_method_mobile_banking_scb_title), null, C5511R.C5513drawable.ic_redirect, SourceType.MobileBanking.Scb.INSTANCE, 10, null);
        }
    }

    public /* synthetic */ MobileBankingResource(int i, String str, Integer num, Integer num2, int i2, SourceType sourceType, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, num, num2, i2, sourceType);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Boolean getEnabled() {
        return OmiseListItem.DefaultImpls.getEnabled(this);
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

    private MobileBankingResource(@DrawableRes int i, String str, @StringRes Integer num, @StringRes Integer num2, @DrawableRes int i2, SourceType sourceType) {
        this.iconRes = i;
        this.title = str;
        this.titleRes = num;
        this.subtitleRes = num2;
        this.indicatorIconRes = i2;
        this.sourceType = sourceType;
    }

    public /* synthetic */ MobileBankingResource(int i, String str, Integer num, Integer num2, int i2, SourceType sourceType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, i2, sourceType, null);
    }
}
