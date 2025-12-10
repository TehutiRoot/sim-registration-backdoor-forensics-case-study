package th.p047co.dtac.android.dtacone.view.fragment.buy_dol;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11663a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.FragmentBuyDolFormCreditBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.util.TypefaceUtil;
import th.p047co.dtac.android.dtacone.util.credit_card.CardType;
import th.p047co.dtac.android.dtacone.util.validation.buy_dol.CardCvvValidate;
import th.p047co.dtac.android.dtacone.util.validation.buy_dol.CardExpiredValidate;
import th.p047co.dtac.android.dtacone.util.validation.buy_dol.CardNameValidate;
import th.p047co.dtac.android.dtacone.util.validation.buy_dol.CreditCardValidate;
import th.p047co.dtac.android.dtacone.util.validation.buy_dol.RxCreditCardValidation;
import th.p047co.dtac.android.dtacone.view.activity.buy_dol.BuyDolActivity;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolFormCreditCardFragment;
import th.p047co.dtac.android.dtacone.widget.view.CreditCardEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolFormCreditCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", OperatorName.SET_LINE_WIDTH, "Lio/reactivex/Observable;", "", OperatorName.CLOSE_AND_STROKE, "()Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/util/credit_card/CardType;", "cardType", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Lth/co/dtac/android/dtacone/util/credit_card/CardType;)I", "Lth/co/dtac/android/dtacone/view/activity/buy_dol/BuyDolActivity;", "u", "()Lth/co/dtac/android/dtacone/view/activity/buy_dol/BuyDolActivity;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "", "getScreenName", "()Ljava/lang/String;", "Lio/reactivex/disposables/CompositeDisposable;", "i", "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/databinding/FragmentBuyDolFormCreditBinding;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/databinding/FragmentBuyDolFormCreditBinding;", "_binding", "t", "()Lth/co/dtac/android/dtacone/databinding/FragmentBuyDolFormCreditBinding;", "binding", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBuyDolFormCreditCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyDolFormCreditCardFragment.kt\nth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolFormCreditCardFragment\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,102:1\n61#2,2:103\n*S KotlinDebug\n*F\n+ 1 BuyDolFormCreditCardFragment.kt\nth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolFormCreditCardFragment\n*L\n78#1:103,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolFormCreditCardFragment */
/* loaded from: classes9.dex */
public final class BuyDolFormCreditCardFragment extends BaseFragment {
    public static final int $stable = 8;

    /* renamed from: i */
    public final CompositeDisposable f98745i = new CompositeDisposable();

    /* renamed from: j */
    public FragmentBuyDolFormCreditBinding f98746j;

    /* renamed from: A */
    public static final void m8953A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m8952B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m8951C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    private final Observable m8944s() {
        Observables observables = Observables.INSTANCE;
        DtacClearableEditText dtacClearableEditText = m8943t().edtUserCreditCard;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.edtUserCreditCard");
        Observable<String> cardNaming = RxCreditCardValidation.cardNaming(dtacClearableEditText);
        Intrinsics.checkNotNullExpressionValue(cardNaming, "cardNaming(binding.edtUserCreditCard)");
        CreditCardEditText creditCardEditText = m8943t().edtCreditCard;
        Intrinsics.checkNotNullExpressionValue(creditCardEditText, "binding.edtCreditCard");
        Observable<String> cardNumber = RxCreditCardValidation.cardNumber(creditCardEditText);
        Intrinsics.checkNotNullExpressionValue(cardNumber, "cardNumber(binding.edtCreditCard)");
        DtacClearableEditText dtacClearableEditText2 = m8943t().edtCardExpired;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText2, "binding.edtCardExpired");
        Observable<String> expiredDate = RxCreditCardValidation.expiredDate(dtacClearableEditText2);
        Intrinsics.checkNotNullExpressionValue(expiredDate, "expiredDate(binding.edtCardExpired)");
        DtacEditText dtacEditText = m8943t().edtCvvCard;
        Intrinsics.checkNotNullExpressionValue(dtacEditText, "binding.edtCvvCard");
        Observable<String> cvvNumber = RxCreditCardValidation.cvvNumber(dtacEditText);
        Intrinsics.checkNotNullExpressionValue(cvvNumber, "cvvNumber(binding.edtCvvCard)");
        Observable combineLatest = Observable.combineLatest(cardNaming, cardNumber, expiredDate, cvvNumber, new Function4<T1, T2, T3, T4, R>() { // from class: th.co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolFormCreditCardFragment$enableSaveCardCheckBoxObs$$inlined$combineLatest$1
            @Override // io.reactivex.functions.Function4
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                String str = (String) t4;
                String str2 = (String) t3;
                String str3 = (String) t2;
                if (!new CardNameValidate().isNameInvalid((String) t1) && new CreditCardValidate().validateCreditCard(str3) && new CardExpiredValidate().validateExpired(PhoneNumberExtKt.toRemoveSpecialChar(str2.toString())) && new CardCvvValidate().validateCvv(str)) {
                    z = true;
                } else {
                    z = false;
                }
                return (R) Boolean.valueOf(z);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        return combineLatest;
    }

    /* renamed from: u */
    private final BuyDolActivity m8942u() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.buy_dol.BuyDolActivity");
        return (BuyDolActivity) activity;
    }

    /* renamed from: v */
    public final int m8941v(CardType cardType) {
        Integer num = (Integer) AbstractC11663a.mapOf(TuplesKt.m29136to(CardType.VISA, Integer.valueOf(R.drawable.ic_visa)), TuplesKt.m29136to(CardType.JCB, Integer.valueOf(R.drawable.ic_jcb)), TuplesKt.m29136to(CardType.MASTER_CARD, Integer.valueOf(R.drawable.ic_mastercard))).get(cardType);
        if (num != null) {
            return num.intValue();
        }
        return R.drawable.ic_card_default;
    }

    /* renamed from: w */
    private final void m8940w() {
        m8943t().checkboxSaveCredit.setTypeface(TypefaceUtil.getTypefaceRegular(m8942u()));
        m8943t().edtCvvCardLayout.setTypeface(TypefaceUtil.getTypefaceRegular(m8942u()));
        CompositeDisposable compositeDisposable = this.f98745i;
        CreditCardEditText creditCardEditText = m8943t().edtCreditCard;
        Intrinsics.checkNotNullExpressionValue(creditCardEditText, "binding.edtCreditCard");
        Observable<CardType> matchCardType = RxCreditCardValidation.matchCardType(creditCardEditText);
        final BuyDolFormCreditCardFragment$setupView$1 buyDolFormCreditCardFragment$setupView$1 = new BuyDolFormCreditCardFragment$setupView$1(this);
        Observable<R> map = matchCardType.map(new Function() { // from class: ee
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Drawable m8939x;
                m8939x = BuyDolFormCreditCardFragment.m8939x(buyDolFormCreditCardFragment$setupView$1, obj);
                return m8939x;
            }
        });
        final BuyDolFormCreditCardFragment$setupView$2 buyDolFormCreditCardFragment$setupView$2 = new BuyDolFormCreditCardFragment$setupView$2(this);
        compositeDisposable.add(map.subscribe(new Consumer() { // from class: fe
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyDolFormCreditCardFragment.m8938y(buyDolFormCreditCardFragment$setupView$2, obj);
            }
        }));
        CompositeDisposable compositeDisposable2 = this.f98745i;
        DtacClearableEditText dtacClearableEditText = m8943t().edtCardExpired;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.edtCardExpired");
        Observable<String> expiredDate = RxCreditCardValidation.expiredDate(dtacClearableEditText);
        final BuyDolFormCreditCardFragment$setupView$3 buyDolFormCreditCardFragment$setupView$3 = new BuyDolFormCreditCardFragment$setupView$3(this);
        Consumer<? super String> consumer = new Consumer() { // from class: ge
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyDolFormCreditCardFragment.m8937z(buyDolFormCreditCardFragment$setupView$3, obj);
            }
        };
        final BuyDolFormCreditCardFragment$setupView$4 buyDolFormCreditCardFragment$setupView$4 = new BuyDolFormCreditCardFragment$setupView$4(this);
        compositeDisposable2.add(expiredDate.subscribe(consumer, new Consumer() { // from class: he
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyDolFormCreditCardFragment.m8953A(buyDolFormCreditCardFragment$setupView$4, obj);
            }
        }));
        CompositeDisposable compositeDisposable3 = this.f98745i;
        Observable m8944s = m8944s();
        final BuyDolFormCreditCardFragment$setupView$5 buyDolFormCreditCardFragment$setupView$5 = new BuyDolFormCreditCardFragment$setupView$5(this);
        Consumer consumer2 = new Consumer() { // from class: ie
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyDolFormCreditCardFragment.m8952B(buyDolFormCreditCardFragment$setupView$5, obj);
            }
        };
        final BuyDolFormCreditCardFragment$setupView$6 buyDolFormCreditCardFragment$setupView$6 = new BuyDolFormCreditCardFragment$setupView$6(this);
        compositeDisposable3.add(m8944s.subscribe(consumer2, new Consumer() { // from class: je
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyDolFormCreditCardFragment.m8951C(buyDolFormCreditCardFragment$setupView$6, obj);
            }
        }));
    }

    /* renamed from: x */
    public static final Drawable m8939x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Drawable) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m8938y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m8937z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        return "BuyDolFormCreditCardFragment";
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f98746j = FragmentBuyDolFormCreditBinding.inflate(inflater, viewGroup, false);
        return m8943t().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f98745i.clear();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        m8940w();
    }

    /* renamed from: t */
    public final FragmentBuyDolFormCreditBinding m8943t() {
        FragmentBuyDolFormCreditBinding fragmentBuyDolFormCreditBinding = this.f98746j;
        Intrinsics.checkNotNull(fragmentBuyDolFormCreditBinding);
        return fragmentBuyDolFormCreditBinding;
    }
}