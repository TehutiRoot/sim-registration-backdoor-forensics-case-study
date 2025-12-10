package androidx.compose.p003ui.text.intl;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p003ui.text.platform.SynchronizedObject;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(api = 24)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "<init>", "()V", "", "languageTag", "Landroidx/compose/ui/text/intl/PlatformLocale;", "parseLanguageTag", "(Ljava/lang/String;)Landroidx/compose/ui/text/intl/PlatformLocale;", "Landroid/os/LocaleList;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/os/LocaleList;", "lastPlatformLocaleList", "Landroidx/compose/ui/text/intl/LocaleList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/intl/LocaleList;", "lastLocaleList", "Landroidx/compose/ui/text/platform/SynchronizedObject;", OperatorName.CURVE_TO, "Landroidx/compose/ui/text/platform/SynchronizedObject;", "lock", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "current", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.intl.AndroidLocaleDelegateAPI24 */
/* loaded from: classes2.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {

    /* renamed from: a */
    public LocaleList f31555a;

    /* renamed from: b */
    public LocaleList f31556b;

    /* renamed from: c */
    public final SynchronizedObject f31557c = Synchronization_jvmKt.createSynchronizedObject();

    @Override // androidx.compose.p003ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public LocaleList getCurrent() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault()");
        synchronized (this.f31557c) {
            LocaleList localeList2 = this.f31556b;
            if (localeList2 == null || localeList != this.f31555a) {
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    locale = localeList.get(i);
                    Intrinsics.checkNotNullExpressionValue(locale, "platformLocaleList[position]");
                    arrayList.add(new Locale(new AndroidLocale(locale)));
                }
                LocaleList localeList3 = new LocaleList(arrayList);
                this.f31555a = localeList;
                this.f31556b = localeList3;
                return localeList3;
            }
            return localeList2;
        }
    }

    @Override // androidx.compose.p003ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public PlatformLocale parseLanguageTag(@NotNull String languageTag) {
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(languageTag);
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(languageTag)");
        return new AndroidLocale(forLanguageTag);
    }
}