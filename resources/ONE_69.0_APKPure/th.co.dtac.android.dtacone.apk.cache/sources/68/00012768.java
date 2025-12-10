package th.p047co.dtac.android.dtacone.util.validation.buy_dol;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.p051rx.RxComposeFunction;
import th.p047co.dtac.android.dtacone.util.credit_card.CardType;
import th.p047co.dtac.android.dtacone.util.validation.buy_dol.RxCreditCardValidation;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J4\u0010\u000b\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J4\u0010\f\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J4\u0010\r\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J4\u0010\u000e\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J4\u0010\u000f\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00100\u0010 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/buy_dol/RxCreditCardValidation;", "", "()V", "TIMEOUT", "", "cardNaming", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", PDPrintFieldAttributeObject.ROLE_TV, "Landroid/widget/TextView;", "cardNumber", "cardNumberChange", "cvvNumber", "expiredDate", "matchCardType", "Lth/co/dtac/android/dtacone/util/credit_card/CardType;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.buy_dol.RxCreditCardValidation */
/* loaded from: classes8.dex */
public final class RxCreditCardValidation {
    public static final int $stable = 0;
    @NotNull
    public static final RxCreditCardValidation INSTANCE = new RxCreditCardValidation();
    public static final long TIMEOUT = 100;

    /* renamed from: a */
    public static /* synthetic */ String m16745a(Function1 function1, Object obj) {
        return m16734l(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ CardType m16744b(Function1 function1, Object obj) {
        return m16730p(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ CardType m16743c(Function1 function1, Object obj) {
        return m16731o(function1, obj);
    }

    @JvmStatic
    public static final Observable<String> cardNaming(@NotNull TextView tv) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        Observable<CharSequence> debounce = RxTextView.textChanges(tv).debounce(100L, TimeUnit.MILLISECONDS);
        final RxCreditCardValidation$cardNaming$1 rxCreditCardValidation$cardNaming$1 = RxCreditCardValidation$cardNaming$1.INSTANCE;
        Observable<R> map = debounce.map(new Function() { // from class: kC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxCreditCardValidation.m16742d(Function1.this, obj);
            }
        });
        final RxCreditCardValidation$cardNaming$2 rxCreditCardValidation$cardNaming$2 = RxCreditCardValidation$cardNaming$2.INSTANCE;
        return map.onErrorReturn(new Function() { // from class: lC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxCreditCardValidation.m16739g(Function1.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    @JvmStatic
    public static final Observable<String> cardNumber(@NotNull TextView tv) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        return cardNumberChange(tv).observeOn(AndroidSchedulers.mainThread());
    }

    @JvmStatic
    public static final Observable<String> cardNumberChange(@NotNull TextView tv) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        Observable<CharSequence> debounce = RxTextView.textChanges(tv).debounce(100L, TimeUnit.MILLISECONDS);
        final RxCreditCardValidation$cardNumberChange$1 rxCreditCardValidation$cardNumberChange$1 = RxCreditCardValidation$cardNumberChange$1.INSTANCE;
        return debounce.map(new Function() { // from class: mC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxCreditCardValidation.m16738h(Function1.this, obj);
            }
        });
    }

    @JvmStatic
    public static final Observable<String> cvvNumber(@NotNull TextView tv) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        Observable<CharSequence> debounce = RxTextView.textChanges(tv).debounce(100L, TimeUnit.MILLISECONDS);
        final RxCreditCardValidation$cvvNumber$1 rxCreditCardValidation$cvvNumber$1 = RxCreditCardValidation$cvvNumber$1.INSTANCE;
        return debounce.map(new Function() { // from class: rC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxCreditCardValidation.m16745a(Function1.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: d */
    public static /* synthetic */ String m16742d(Function1 function1, Object obj) {
        return m16737i(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m16741e(Function1 function1, Object obj) {
        m16733m(function1, obj);
    }

    @JvmStatic
    public static final Observable<String> expiredDate(@NotNull TextView tv) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        Observable<CharSequence> debounce = RxTextView.textChanges(tv).debounce(100L, TimeUnit.MILLISECONDS);
        final RxCreditCardValidation$expiredDate$1 rxCreditCardValidation$expiredDate$1 = new RxCreditCardValidation$expiredDate$1(tv);
        Observable<CharSequence> doOnSubscribe = debounce.doOnSubscribe(new Consumer() { // from class: nC1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RxCreditCardValidation.m16741e(Function1.this, obj);
            }
        });
        final RxCreditCardValidation$expiredDate$2 rxCreditCardValidation$expiredDate$2 = RxCreditCardValidation$expiredDate$2.INSTANCE;
        return doOnSubscribe.map(new Function() { // from class: oC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxCreditCardValidation.m16740f(Function1.this, obj);
            }
        }).compose(RxComposeFunction.applyCardExpired()).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: f */
    public static /* synthetic */ String m16740f(Function1 function1, Object obj) {
        return m16732n(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ String m16739g(Function1 function1, Object obj) {
        return m16736j(function1, obj);
    }

    /* renamed from: h */
    public static /* synthetic */ String m16738h(Function1 function1, Object obj) {
        return m16735k(function1, obj);
    }

    /* renamed from: i */
    public static final String m16737i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final String m16736j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final String m16735k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final String m16734l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m16733m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @JvmStatic
    public static final Observable<CardType> matchCardType(@NotNull TextView tv) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        Observable<String> cardNumberChange = cardNumberChange(tv);
        final RxCreditCardValidation$matchCardType$1 rxCreditCardValidation$matchCardType$1 = RxCreditCardValidation$matchCardType$1.INSTANCE;
        Observable<R> map = cardNumberChange.map(new Function() { // from class: pC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxCreditCardValidation.m16743c(Function1.this, obj);
            }
        });
        final RxCreditCardValidation$matchCardType$2 rxCreditCardValidation$matchCardType$2 = RxCreditCardValidation$matchCardType$2.INSTANCE;
        return map.onErrorReturn(new Function() { // from class: qC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxCreditCardValidation.m16744b(Function1.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: n */
    public static final String m16732n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final CardType m16731o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CardType) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final CardType m16730p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CardType) tmp0.invoke(obj);
    }
}