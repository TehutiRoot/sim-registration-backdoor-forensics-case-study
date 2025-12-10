package co.omise.android.p009ui;

import androidx.annotation.DrawableRes;
import co.omise.android.C5511R;
import co.omise.android.p009ui.OmiseListItem;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
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

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, m28850d2 = {"Lco/omise/android/ui/DuitNowOBWResource;", "Lco/omise/android/ui/OmiseListItem;", "iconRes", "", MessageBundle.TITLE_ENTRY, "", "indicatorIconRes", "bankCode", "enabled", "", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)V", "getBankCode", "()Ljava/lang/String;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIconRes", "()Ljava/lang/Integer;", "getIndicatorIconRes", "getTitle", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.DuitNowOBWResource */
/* loaded from: classes3.dex */
public final class DuitNowOBWResource implements OmiseListItem {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final String bankCode;
    @Nullable
    private final Boolean enabled;
    private final int iconRes;
    private final int indicatorIconRes;
    @Nullable
    private final String title;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m28850d2 = {"Lco/omise/android/ui/DuitNowOBWResource$Companion;", "", "()V", "all", "", "Lco/omise/android/ui/DuitNowOBWResource;", "getAll", "()Ljava/util/List;", "getBankImageFromCode", "", "code", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.DuitNowOBWResource$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<DuitNowOBWResource> getAll() {
            DuitNowOBWResource duitNowOBWResource;
            Collection<KClass<?>> nestedClasses = Reflection.getOrCreateKotlinClass(DuitNowOBWResource.class).getNestedClasses();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nestedClasses.iterator();
            while (it.hasNext()) {
                Object objectInstance = ((KClass) it.next()).getObjectInstance();
                if (objectInstance instanceof DuitNowOBWResource) {
                    duitNowOBWResource = (DuitNowOBWResource) objectInstance;
                } else {
                    duitNowOBWResource = null;
                }
                if (duitNowOBWResource != null) {
                    arrayList.add(duitNowOBWResource);
                }
            }
            return arrayList;
        }

        public final int getBankImageFromCode(@Nullable String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1414259608:
                        if (str.equals("ambank")) {
                            return C5511R.C5513drawable.payment_ambank;
                        }
                        break;
                    case -1220432561:
                        if (str.equals("hongleong")) {
                            return C5511R.C5513drawable.payment_hongleong;
                        }
                        break;
                    case -977423767:
                        if (str.equals("public")) {
                            return C5511R.C5513drawable.payment_publicbank;
                        }
                        break;
                    case -938355504:
                        if (str.equals("rakyat")) {
                            return C5511R.C5513drawable.payment_rakyat;
                        }
                        break;
                    case 3664:
                        if (str.equals(OperatorName.NON_STROKING_COLOR)) {
                            return C5511R.C5513drawable.payment_sc;
                        }
                        break;
                    case 97853:
                        if (str.equals("bsn")) {
                            return C5511R.C5513drawable.payment_bsn;
                        }
                        break;
                    case 106093:
                        if (str.equals("kfh")) {
                            return C5511R.C5513drawable.payment_kfh;
                        }
                        break;
                    case 112876:
                        if (str.equals("rhb")) {
                            return C5511R.C5513drawable.payment_rhb;
                        }
                        break;
                    case 115976:
                        if (str.equals("uob")) {
                            return C5511R.C5513drawable.payment_uob;
                        }
                        break;
                    case 2992355:
                        if (str.equals("agro")) {
                            return C5511R.C5513drawable.payment_agro;
                        }
                        break;
                    case 3053691:
                        if (str.equals("cimb")) {
                            return C5511R.C5513drawable.payment_cimb;
                        }
                        break;
                    case 3211916:
                        if (str.equals("hsbc")) {
                            return C5511R.C5513drawable.payment_hsbc;
                        }
                        break;
                    case 3405077:
                        if (str.equals("ocbc")) {
                            return C5511R.C5513drawable.payment_ocbc;
                        }
                        break;
                    case 92721606:
                        if (str.equals("affin")) {
                            return C5511R.C5513drawable.payment_affin;
                        }
                        break;
                    case 100502574:
                        if (str.equals("islam")) {
                            return C5511R.C5513drawable.payment_islam;
                        }
                        break;
                    case 332201842:
                        if (str.equals("muamalat")) {
                            return C5511R.C5513drawable.payment_muamalat;
                        }
                        break;
                    case 722252644:
                        if (str.equals("maybank2u")) {
                            return C5511R.C5513drawable.payment_maybank;
                        }
                        break;
                    case 1806944311:
                        if (str.equals("alliance")) {
                            return C5511R.C5513drawable.payment_alliance;
                        }
                        break;
                }
            }
            return C5511R.C5513drawable.payment_unknown;
        }

        private Companion() {
        }
    }

    public DuitNowOBWResource(@DrawableRes int i, @Nullable String str, @DrawableRes int i2, @Nullable String str2, @Nullable Boolean bool) {
        this.iconRes = i;
        this.title = str;
        this.indicatorIconRes = i2;
        this.bankCode = str2;
        this.enabled = bool;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
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

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public String getSubtitle() {
        return OmiseListItem.DefaultImpls.getSubtitle(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getSubtitleRes() {
        return OmiseListItem.DefaultImpls.getSubtitleRes(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getTitleRes() {
        return OmiseListItem.DefaultImpls.getTitleRes(this);
    }

    public /* synthetic */ DuitNowOBWResource(int i, String str, int i2, String str2, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? C5511R.C5513drawable.ic_redirect : i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
