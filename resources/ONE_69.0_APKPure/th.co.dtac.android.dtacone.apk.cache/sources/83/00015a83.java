package th.p047co.dtac.android.dtacone.viewmodel.ocr;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Iterator;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.ocr.OCRSubscriberViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R'\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\"\u00104R#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(0,8\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u00100¨\u00069"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/ocr/OCRSubscriberViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "<init>", "(Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;)V", "", "imageName", "", "getMobileNumberFromOCRForPrepaid", "(Ljava/lang/String;)V", "toCheck", "", "isNumeric", "(Ljava/lang/String;)Z", TextBundle.TEXT_ENTRY, OperatorName.CURVE_TO, "Lio/reactivex/Single;", "Landroid/graphics/Bitmap;", "d", "(Ljava/lang/String;)Lio/reactivex/Single;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "e", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", OperatorName.NON_STROKING_GRAY, "Landroidx/lifecycle/MutableLiveData;", "_getOCRMobileNumber", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getGetOCRMobileNumber", "()Landroidx/lifecycle/LiveData;", "getOCRMobileNumber", "i", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_showErrorMessage", OperatorName.SET_LINE_JOINSTYLE, "getShowErrorMessage", "showErrorMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOCRSubscriberViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OCRSubscriberViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/ocr/OCRSubscriberViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,115:1\n1855#2:116\n1864#2,3:117\n1856#2:120\n1064#3,2:121\n*S KotlinDebug\n*F\n+ 1 OCRSubscriberViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/ocr/OCRSubscriberViewModel\n*L\n84#1:116\n86#1:117,3\n84#1:120\n111#1:121,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.ocr.OCRSubscriberViewModel */
/* loaded from: classes9.dex */
public final class OCRSubscriberViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final ConfigurationRepository f106938b;

    /* renamed from: c */
    public final Rx2ThreadService f106939c;

    /* renamed from: d */
    public final MrtrErrorService f106940d;

    /* renamed from: e */
    public final BitmapUtil f106941e;

    /* renamed from: f */
    public final CompositeDisposable f106942f;

    /* renamed from: g */
    public final MutableLiveData f106943g;

    /* renamed from: h */
    public final LiveData f106944h;

    /* renamed from: i */
    public final Lazy f106945i;

    /* renamed from: j */
    public final LiveData f106946j;

    @Inject
    public OCRSubscriberViewModel(@NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService, @NotNull BitmapUtil bitmapUtil) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        this.f106938b = configurationRepository;
        this.f106939c = threadService;
        this.f106940d = errorService;
        this.f106941e = bitmapUtil;
        this.f106942f = new CompositeDisposable();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f106943g = mutableLiveData;
        this.f106944h = mutableLiveData;
        this.f106945i = LazyKt__LazyJVMKt.lazy(OCRSubscriberViewModel$_showErrorMessage$2.INSTANCE);
        this.f106946j = m1948f();
    }

    /* renamed from: e */
    public static final Bitmap m1949e(OCRSubscriberViewModel this$0, String imageName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageName, "$imageName");
        return this$0.f106941e.loadInternalOriginal(imageName);
    }

    /* renamed from: f */
    public final MutableLiveData m1948f() {
        return (MutableLiveData) this.f106945i.getValue();
    }

    /* renamed from: c */
    public final void m1951c(String str) {
        String str2 = "";
        for (String str3 : StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"\n"}, false, 0, 6, (Object) null)) {
            Iterator it = StringsKt__StringsKt.split$default((CharSequence) AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(str3, ".", "", false, 4, (Object) null), ",", "", false, 4, (Object) null), HelpFormatter.DEFAULT_OPT_PREFIX, "", false, 4, (Object) null), new String[]{HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR}, false, 0, 6, (Object) null).iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    String str4 = (String) next;
                    if (str4.length() == 10) {
                        char[] charArray = str4.toCharArray();
                        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                        if (charArray[0] == '0') {
                            this.f106943g.setValue(Resource.Companion.success(str4));
                            str2 = str4;
                            break;
                        }
                        i = i2;
                    } else {
                        if (str4.length() == 11) {
                            char[] charArray2 = str4.toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
                            if (charArray2[0] == '6' && charArray2[1] == '6') {
                                String substring = str4.substring(2);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                str2 = "0" + substring;
                                this.f106943g.setValue(Resource.Companion.success(str4));
                                break;
                            }
                        } else {
                            continue;
                        }
                        i = i2;
                    }
                }
            }
        }
        if (Intrinsics.areEqual(str2, "") || str2.length() == 0) {
            this.f106943g.setValue(Resource.Companion.error("ไม่พบเบอร์", "", null));
        }
    }

    /* renamed from: d */
    public final Single m1950d(final String str) {
        Single fromCallable = Single.fromCallable(new Callable() { // from class: SJ0
            {
                OCRSubscriberViewModel.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap m1949e;
                m1949e = OCRSubscriberViewModel.m1949e(OCRSubscriberViewModel.this, str);
                return m1949e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromCallable, "fromCallable { bitmapUti…rnalOriginal(imageName) }");
        return fromCallable;
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f106942f;
    }

    @NotNull
    public final LiveData<Resource<String>> getGetOCRMobileNumber() {
        return this.f106944h;
    }

    public final void getMobileNumberFromOCRForPrepaid(@NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(TextRecognizerOptions.DEFAULT_OPTIONS)");
        Single compose = m1950d(imageName).compose(this.f106939c.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "getBitmapByName(imageNam…rvice.applySingleAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$1(this), new OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2(client, this)), this.f106942f);
    }

    @NotNull
    public final LiveData<Resource<String>> getShowErrorMessage() {
        return this.f106946j;
    }

    public final boolean isNumeric(@NotNull String toCheck) {
        Intrinsics.checkNotNullParameter(toCheck, "toCheck");
        for (int i = 0; i < toCheck.length(); i++) {
            if (!Character.isDigit(toCheck.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}